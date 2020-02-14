import com.jfrog.bintray.gradle.tasks.BintrayUploadTask
import godot.task.GenerateAPI
import org.gradle.api.publish.maven.internal.artifact.FileBasedMavenArtifact
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

  // workaround to upload gradle metadata file
  // https://github.com/bintray/gradle-bintray-plugin/issues/229
  withType<BintrayUploadTask> {
    doFirst {
      publishing.publications.withType<MavenPublication> {
        buildDir.resolve("publications/$name/module.json").also {
          if (it.exists()) {
            artifact(object: FileBasedMavenArtifact(it) {
              override fun getDefaultExtension() = "module"
            })
          }
        }
      }
    }
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