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
    macosX64("macosX64") {
        mavenPublication {
            artifactId = "godot-kotlin-macos"
        }
    }

    linuxX64("linuxX64") {
        mavenPublication {
            artifactId = "godot-kotlin-linux"
        }
    }

    mingwX64("windowsX64") {
        mavenPublication {
            artifactId = "godot-kotlin-windows"
        }
    }

    targets.withType<KotlinNativeTarget> {
        mavenPublication {
            groupId = "com.github.raniejade"
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
        source.set(project.file("godot_headers/api.json"))
        maxSignalParams.set(MAX_SIGNAL_PARAMS)
        outputDir.set(project.file("src/nativeGen/kotlin"))
    }
}

project.extra["artifacts"] = when (currentOS) {
    OS.LINUX -> arrayOf("linuxX64")
    OS.WINDOWS -> arrayOf("windowsX64")
    OS.MACOS -> arrayOf("macosX64")
}

apply {
    plugin(BintrayPublish::class.java)
}