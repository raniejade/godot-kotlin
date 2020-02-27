import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.konan.target.KonanTarget

plugins {
  kotlin("multiplatform") version "1.3.61"
  id("com.github.raniejade.godot-kotlin.plugin")
  `maven-publish`
}

apply {
  plugin(BuildVersion::class.java)
  plugin(MiscPlugin::class.java)
}

buildscript {
  repositories {
    jcenter()
    mavenCentral()
    gradlePluginPortal()
  }

  dependencies {
    classpath("godot-kotlin:build-support:0.1.0")
  }
}

repositories {
  jcenter()
  mavenCentral()
}

godotPlugin {
  isCompositeBuild.set(true)
  mainClass.set("godot.editor.Main")
  author.set("Ranie Jade Ramiso")
  description.set("An editor plugin for godot-kotlin")
}

afterEvaluate {
  kotlin {
    targets.withType<KotlinNativeTarget> {
      mavenPublication {
        val suffix = when (konanTarget) {
          KonanTarget.LINUX_X64 -> "linux"
          KonanTarget.MACOS_X64 -> "macos"
          KonanTarget.MINGW_X64 -> "windows"
          else -> throw AssertionError("Unsupported target $konanTarget")
        }
        artifactId = "godot-kotlin-editor-plugin-$suffix"
      }
    }
  }

  publishing {
    publications {
      withType(MavenPublication::class.java) {
        groupId = "com.github.raniejade"
      }
    }
  }
}

project.extra["artifacts"] = when (currentOS) {
  OS.LINUX -> arrayOf("kotlinMultiplatform", "godotPluginLinux")
  OS.WINDOWS -> arrayOf("windows")
  OS.MACOS -> arrayOf("macos")
}

apply {
  plugin(BintrayPublish::class.java)
}