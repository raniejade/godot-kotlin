package godot.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithTests
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType
import java.io.File

open class GodotPlugin : Plugin<Project> {
  override fun apply(project: Project) {
    val base = project.plugins.apply(GodotBasePlugin::class.java)
    val godotExtension = project.extensions.create("godot", GodotExtension::class.java, project.objects)
    val mpp = checkNotNull(project.extensions.findByType(KotlinMultiplatformExtension::class.java)) { "Kotlin multiplatform plugin not applied!" }
    base.configureDefaults(godotExtension)
    base.configureBaseTasks(project, godotExtension)
    configureDefaults(godotExtension)
    configureTargets(project, godotExtension, mpp)
  }

  private fun configureDefaults(godot: GodotExtension) {
    godot.libraries.all {
      debug.set(true)
      reloadable.set(true)
      loadOnce.set(true)
      singleton.set(false)
      symbolPrefix.set("godot_")
      platforms(TargetPlatform.LINUX, TargetPlatform.WINDOWS, TargetPlatform.MACOS)
    }
  }

  private fun configureTargets(project: Project, godot: GodotExtension, mpp: KotlinMultiplatformExtension) {
    project.afterEvaluate {
      dependencies {
        val editorPluginDep = if (godot.isCompositeBuild.get()) {
          "com.github.raniejade:godot-kotlin-editor-plugin:0.1.0"
        } else {
          "com.github.raniejade:godot-kotlin-editor-plugin:$godotKotlinVersion"
        }
        add(GodotBasePlugin.PLUGIN_INCOMING_CONFIGURATION_NAME, editorPluginDep)
      }

      val buildLibraries = project.tasks.create("buildLibraries")
      godot.libraries.forEach { library ->
        val genEntryTask = createGenerateEntryTask(project, library)
        val librariesToBeGenerated = mutableMapOf<TargetPlatform, File>()
        library.platforms.get().map { it to mpp.targetFrom(it, library.name) }
          .forEach { (platform, target) ->
            val disambiguationClassifier = platform.normalizedName()
            val buildPlatformLibrary = project.tasks.create("buildLibrary${disambiguationClassifier.capitalize()}")
            with(target) {
              binaries {
                val buildType = if (library.debug.get()) {
                  NativeBuildType.DEBUG
                } else {
                  NativeBuildType.RELEASE
                }
                sharedLib(listOf(buildType)) {
                  buildPlatformLibrary.dependsOn(linkTask)
                  librariesToBeGenerated[platform] = outputFile
                }
              }

              buildLibraries.dependsOn(buildPlatformLibrary)

              compilations.getByName("main") {
                compileKotlinTask.dependsOn(genEntryTask)

                dependencies {
                  registerGodotKotlinDependencies(godot, platform)
                }

                defaultSourceSet {
                  kotlin.srcDirs(library.generatedEntryDir, library.mainSrcDir)
                }
              }
            }
          }

        library.nativeLibraryPaths.set(librariesToBeGenerated)
        val generateLibraryTask = createGenerateLibraryTask(project, library)
        val generateGDClassesTask = createGenerateGDClassesTask(project, library)
        genEntryTask.dependsOn(generateLibraryTask, generateGDClassesTask)
      }
    }
  }

  private fun KotlinMultiplatformExtension.targetFrom(platform: TargetPlatform, name: String): KotlinNativeTargetWithTests {
    return when(platform) {
      TargetPlatform.WINDOWS -> mingwX64("${name}Windows")
      TargetPlatform.LINUX -> linuxX64("${name}Linux")
      TargetPlatform.MACOS -> macosX64("${name}MacOS")
      else -> throw AssertionError("Unsupported platform $platform")
    }
  }
}