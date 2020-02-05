package godot.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithTests
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType

open class GodotPlugin : Plugin<Project> {
  override fun apply(project: Project) {
    project.plugins.apply("org.jetbrains.kotlin.multiplatform")
    val godotExtension = project.extensions.create("godot", GodotExtension::class.java, project.objects)
    val mpp = checkNotNull(project.extensions.findByType(KotlinMultiplatformExtension::class.java)) { "Kotlin multiplatform plugin not applied!" }
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
      godot.libraries.forEach { library ->
        val genEntryTask = project.tasks.create(library.generateEntryTaskName, GenerateEntry::class.java) {
          output.set(project.file("${library.generatedEntryDir}/entry"))
          classes.set(library.classes)
        }

        val librariesToBeGenerated = mutableMapOf<TargetPlatform, String>()
        library.platforms.get().map { it to mpp.targetFrom(it, library.name) }
          .forEach { (platform, target) ->
            with(target) {
              binaries {
                val buildType = if (library.debug.get()) {
                  NativeBuildType.DEBUG
                } else {
                  NativeBuildType.RELEASE
                }
                sharedLib(listOf(buildType)) {
                  librariesToBeGenerated[platform] = "res://${outputFile.relativeTo(projectDir)}"
                }
              }

              compilations.getByName("main") {
                compileKotlinTask.dependsOn(genEntryTask)

                dependencies {
                  // TODO: change version
                  api("com.github.raniejade:godot-kotlin-${artifactSuffixFrom(platform)}:0.1.0")
                }

                defaultSourceSet {
                  kotlin.srcDirs(library.generatedEntryDir, library.mainSrcDir)
                }
              }
            }
          }

        val generateLibraryTask = project.tasks.create(library.generateLibraryTaskName, GenerateLibrary::class.java) {
          libraries.set(librariesToBeGenerated)
          output.set(project.file("${library.generatedLibDir}/${library.libraryName}"))
          reloadable.set(library.reloadable)
          loadOnce.set(library.loadOnce)
          singleton.set(library.singleton)
          symbolPrefix.set(library.symbolPrefix)
        }

        genEntryTask.dependsOn(generateLibraryTask)
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

  private fun artifactSuffixFrom(platform: TargetPlatform): String {
    return when (platform) {
      TargetPlatform.WINDOWS -> "windows"
      TargetPlatform.LINUX -> "linux"
      TargetPlatform.MACOS -> "macos"
      else -> throw AssertionError("Unsupported platform $platform")
    }
  }
}