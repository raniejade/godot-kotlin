import godot.task.GenerateAPI
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
  kotlin("multiplatform")
  `maven-publish`
}

repositories {
  jcenter()
  mavenCentral()
}

kotlin {
  macosX64("macos")
  linuxX64("linux")
  mingwX64("windows")

  targets.withType<KotlinNativeTarget> {
    configurations {
      create("${targetName}Hack") {
        extendsFrom(getByName("${targetName}Implementation"))
      }
    }
    compilations.getByName("main") {
      defaultSourceSet {
        kotlin.srcDirs("src/nativeMain/kotlin", "src/nativeCore/kotlin", "src/nativeGen/kotlin")
      }
      val gdnative by cinterops.creating {
        packageName("gdnative")
        compilerOpts("-I$rootDir/godot_headers")
      }
    }
  }
}

// Number of parameters generated for method and signal classes
val MAX_SIGNAL_PARAMS = 10

tasks {
  val generateAPI by creating(GenerateAPI::class) {
    source.set(project.file("$rootDir/godot_headers/api.json"))
    maxSignalParams.set(MAX_SIGNAL_PARAMS)
    outputDir.set(project.file("src/nativeGen/kotlin"))
  }
}

project.extra["artifacts"] = when (currentOS) {
  OS.LINUX -> arrayOf("kotlinMultiplatform", "metadata", "linux")
  OS.WINDOWS -> arrayOf("windows")
  OS.MACOS -> arrayOf("macos")
}

apply {
  plugin(BintrayPublish::class.java)
}