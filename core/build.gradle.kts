import godot.task.GenerateAPI
import org.apache.tools.ant.taskdefs.condition.Os
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithTests

plugins {
    kotlin("multiplatform")
}

repositories {
    jcenter()
    mavenCentral()
}

kotlin {
    macosX64("macosX64")
    linuxX64("linuxX64")
    mingwX64("windowsX64")

    targets.withType<KotlinNativeTarget> {
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

group = "com.github.raniejade"
version = "0.1.0"