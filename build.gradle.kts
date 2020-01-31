import godot.task.GenerateAPI
import godot.task.GenerateMethodN
import org.apache.tools.ant.taskdefs.condition.Os
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithTests

plugins {
    kotlin("multiplatform")
}

repositories {
    jcenter()
    mavenCentral()
}

kotlin {
    fun KotlinNativeTargetWithTests.configure() {
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

    val target = if (Os.isFamily(Os.FAMILY_MAC)) {
        macosX64("native")
    } else if (Os.isFamily(Os.FAMILY_WINDOWS)) {
        mingwX64("native")
    } else if (Os.isFamily(Os.FAMILY_UNIX)) {
        linuxX64("native")
    } else {
        throw AssertionError("Unsupported os.")
    }

    target.configure()
}


tasks {
    val generateAPI by creating(GenerateAPI::class) {
        source.set(project.file("godot_headers/api.json"))
        outputDir.set(project.file("src/nativeGen/kotlin"))
    }

    val generateMethodN by creating(GenerateMethodN::class) {
        filename.set("methods")
        n.set(10)
        outputDir.set(project.file("src/nativeGen/kotlin"))
    }
}

group = "com.github.raniejade"
version = "0.1.0"