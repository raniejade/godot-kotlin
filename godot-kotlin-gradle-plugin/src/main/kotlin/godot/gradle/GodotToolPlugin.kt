package godot.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.bundling.Zip
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType
import org.jetbrains.kotlin.konan.target.KonanTarget
import java.io.File

open class GodotToolPlugin : Plugin<Project> {
  override fun apply(project: Project) {
    val base = project.plugins.apply(GodotBasePlugin::class.java)
    val godotPlugin = project.extensions.create("godotPlugin", GodotPluginExtension::class.java, project.objects)
    val mpp = checkNotNull(project.extensions.findByType(KotlinMultiplatformExtension::class.java)) { "Kotlin multiplatform plugin not applied!" }
    base.configureDefaults(godotPlugin)
    configureDefaults(project, godotPlugin)
    configureTargets(project, godotPlugin, mpp)
  }

  private fun configureDefaults(project: Project, godotPlugin: GodotPluginExtension) {
    with(godotPlugin) {
      name.set(project.name)
      debug.set(true)
    }
  }

  private fun configureTargets(project: Project, godotPlugin: GodotPluginExtension, mpp: KotlinMultiplatformExtension) {
    val pluginLibrary = GDNativeLibrary("plugin", project.objects).apply {
      singleton.set(false)
      loadOnce.set(true)
      reloadable.set(true)
      symbolPrefix.set("godot_")
      classes.addAll(godotPlugin.additionalClasses)
    }
    project.afterEvaluate {
      if (!godotPlugin.version.isPresent) {
        godotPlugin.version.set(project.version.toString())
      }

      val genEntryTask = createGenerateEntryTask(project, pluginLibrary)
      genEntryTask.classes.add(GDClass(godotPlugin.mainClass.get(), true))
      val librariesToBeGenerated = mutableMapOf<TargetPlatform, File>()
      val assembleDir = "build/assemble-plugin/"

      val generatePluginDescriptor = project.tasks.register("generatePluginDescriptor", GeneratePluginDescriptor::class.java) {
        name.set(godotPlugin.name)
        description.set(godotPlugin.description)
        author.set(godotPlugin.author)
        version.set(godotPlugin.version)
        mainClass.set(godotPlugin.mainClass)
        output.set(project.file("$assembleDir/plugin.cfg"))
      }

      val zipPlugin = project.tasks.create("zipPlugin", Zip::class.java) {
        dependsOn(generatePluginDescriptor)
        archiveBaseName.set(godotPlugin.name)
        archiveVersion.set(godotPlugin.version)
        into(godotPlugin.name)
        from(assembleDir)
        from("${project.buildDir}") {
          include("bin/**")
          into("build")
        }
      }

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

          binaries {
            val buildType = if (godotPlugin.debug.get()) {
              NativeBuildType.DEBUG
            } else {
              NativeBuildType.RELEASE
            }
            sharedLib(listOf(buildType)) {
              librariesToBeGenerated[platform] = outputFile
              zipPlugin.dependsOn(linkTask)
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
      generateGDClassesTask.pathPrefix.set(pathPrefix)
      genEntryTask.dependsOn(generateLibraryTask, generateGDClassesTask)
    }
  }
}