package godot.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.component.SoftwareComponentFactory
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.tasks.AbstractPublishToMaven
import org.gradle.api.tasks.bundling.Zip
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType
import org.jetbrains.kotlin.konan.target.KonanTarget
import java.io.File
import javax.inject.Inject

open class GodotToolPlugin @Inject constructor(private val softwareComponentFactory: SoftwareComponentFactory): Plugin<Project> {
  override fun apply(project: Project) {
    val base = project.plugins.apply(GodotBasePlugin::class.java)
    val godotPlugin = project.extensions.create("godotPlugin", GodotPluginExtension::class.java, project.objects)
    val mpp = checkNotNull(project.extensions.findByType(KotlinMultiplatformExtension::class.java)) { "Kotlin multiplatform plugin not applied!" }
    base.configureDefaults(godotPlugin)
    configureDefaults(project, godotPlugin)
    configureTargets(project, base, godotPlugin, mpp)
  }

  private fun configureDefaults(project: Project, godotPlugin: GodotPluginExtension) {
    with(godotPlugin) {
      name.set(project.name)
      debug.set(true)
    }
  }

  private fun configureTargets(project: Project, base: GodotBasePlugin, godotPlugin: GodotPluginExtension, mpp: KotlinMultiplatformExtension) {
    val pluginLibrary = GDNativeLibrary("plugin", project.objects).apply {
      singleton.set(false)
      loadOnce.set(true)
      reloadable.set(true)
      symbolPrefix.set("godot_")
      classes.addAll(godotPlugin.additionalClasses)
    }
    project.afterEvaluate {
      val genEntryTask = createGenerateEntryTask(project, pluginLibrary)
      genEntryTask.classes.add(GDClass(godotPlugin.mainClass.get(), true))
      val librariesToBeGenerated = mutableMapOf<TargetPlatform, File>()
      val assembleDir = "build/assemble-plugin/"

      val generatePluginDescriptor = project.tasks.register("generatePluginDescriptor", GeneratePluginDescriptor::class.java) {
        name.set(godotPlugin.name)
        description.set(godotPlugin.description)
        author.set(godotPlugin.author)
        version.set(project.version.toString())
        mainClass.set(godotPlugin.mainClass)
        output.set(project.file("$assembleDir/plugin.cfg"))
      }

      val buildAllPlugin = project.tasks.create("buildPlugin")

      with(mpp) {
        linuxX64("pluginLinux")
        mingwX64("pluginWindows")
        macosX64("pluginMacos")

        targets.withType<KotlinNativeTarget> {
          val platform = when (konanTarget) {
            KonanTarget.LINUX_X64 -> TargetPlatform.LINUX
            KonanTarget.MINGW_X64 -> TargetPlatform.WINDOWS
            KonanTarget.MACOS_X64 -> TargetPlatform.MACOS
            else -> throw AssertionError("Unsupported target $konanTarget")
          }

          val disambiguationClassifier = platform.normalizedName()
          val zipPlatformPlugin = project.tasks.create("zipPlugin${disambiguationClassifier.capitalize()}", Zip::class.java) {
            dependsOn(generatePluginDescriptor)
            archiveBaseName.set(project.name)
            archiveClassifier.set(disambiguationClassifier)
            archiveVersion.set(project.version.toString())
            into(godotPlugin.name)
            from(assembleDir)
            from("${project.buildDir}") {
              include("bin/**")
              into("build")
            }
            onlyIf {
              platform == base.currentOS
            }
          }

          val buildPlatformPlugin = project.tasks.create("buildPlugin${disambiguationClassifier.capitalize()}")
          buildPlatformPlugin.dependsOn(zipPlatformPlugin)
          buildAllPlugin.dependsOn(buildPlatformPlugin)

          val outgoingConfigurationName = when (platform) {
            TargetPlatform.LINUX -> GodotBasePlugin.PLUGIN_LINUX_OUTGOING_CONFIGURATION_NAME
            TargetPlatform.WINDOWS -> GodotBasePlugin.PLUGIN_WINDOWS_OUTGOING_CONFIGURATION_NAME
            TargetPlatform.MACOS -> GodotBasePlugin.PLUGIN_MACOS_OUTGOING_CONFIGURATION_NAME
            else -> throw AssertionError("Unsupported platform $platform")
          }

          val component = softwareComponentFactory.adhoc("godot${disambiguationClassifier.capitalize()}")
          component.addVariantsFromConfiguration(project.configurations.getByName(outgoingConfigurationName)) {
            mapToMavenScope("runtime")
          }
          project.components.add(component)

          project.artifacts {
            if (platform == base.currentOS) {
              add(outgoingConfigurationName, zipPlatformPlugin)
            }
          }

          project.pluginManager.withPlugin("maven-publish") {
            project.extensions.configure<PublishingExtension> {
              val publication = publications.create<MavenPublication>("godotPlugin${disambiguationClassifier.capitalize()}") {
                groupId = project.group.toString()
                artifactId = "${project.name}-$disambiguationClassifier"
                version = project.version.toString()
                from(component)
              }

              base.godotComponent.addVariant(component)
              project.tasks.withType<AbstractPublishToMaven> {
                if (this.publication == publication) {
                  onlyIf { platform == base.currentOS }
                }
              }
            }
          }

          binaries {
            val buildType = if (godotPlugin.debug.get()) {
              NativeBuildType.DEBUG
            } else {
              NativeBuildType.RELEASE
            }
            sharedLib(listOf(buildType)) {
              librariesToBeGenerated[platform] = outputFile
              zipPlatformPlugin.dependsOn(linkTask)
            }
          }

          compilations.getByName("main") {
            compileKotlinTask.dependsOn(genEntryTask)
            dependencies {
              registerGodotKotlinDependencies(godotPlugin, platform)
            }
            defaultSourceSet {
              kotlin.srcDirs(pluginLibrary.mainSrcDir, pluginLibrary.generatedEntryDir)
            }
          }
        }
      }

      pluginLibrary.nativeLibraryPaths.set(librariesToBeGenerated)
      val pathPrefix = "res://addons/${godotPlugin.name.get()}/"
      val generateLibraryTask = createGenerateLibraryTask(project, pluginLibrary, outputDirPrefix = assembleDir)
      generateLibraryTask.pathPrefix.set(pathPrefix)
      val generateGDClassesTask = createGenerateGDClassesTask(project, pluginLibrary, outputDirPrefix = assembleDir)
      generateGDClassesTask.classes.add(godotPlugin.mainClass.get())
      generateGDClassesTask.pathPrefix.set(pathPrefix)
      genEntryTask.dependsOn(generateLibraryTask, generateGDClassesTask)

      project.pluginManager.withPlugin("maven-publish") {
        project.tasks.withType(AbstractPublishToMaven::class.java) {
          // disable publications created by the kotlin plugin
          if (publication != null && listOf("metadata", "kotlinMultiplatform", "pluginLinux", "pluginWindows", "pluginLinux").contains(publication.name)) {
            onlyIf { false }
          }
        }

        project.extensions.configure<PublishingExtension> {
          publications.create<MavenPublication>("godot") {
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()
            from(base.godotComponent)
          }
        }
      }
    }
  }
}