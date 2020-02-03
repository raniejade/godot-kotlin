import org.apache.tools.ant.taskdefs.condition.Os
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithTests
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType

plugins {
    kotlin("multiplatform")
    id("com.github.raniejade.godot-kotlin")
}

repositories {
    jcenter()
    mavenCentral()
}

kotlin {
    fun KotlinNativeTargetWithTests.configure() {
        binaries {
            sharedLib(listOf(NativeBuildType.DEBUG))
        }
    }

    val target = if (Os.isFamily(Os.FAMILY_MAC)) {
        macosX64("rotatingCube")
    } else if (Os.isFamily(Os.FAMILY_WINDOWS)) {
        mingwX64("rotatingCube")
    } else if (Os.isFamily(Os.FAMILY_UNIX)) {
        linuxX64("rotatingCube")
    } else {
        throw AssertionError("Unsupported os.")
    }

    target.configure()

    sourceSets {
        val rotatingCubeMain by getting {
            dependencies {
                api(project(":core"))
            }
        }
    }
}

godot {
    libraries {
        val rotatingCube by creating {
            targets.set(
              listOf("rotatingCube")
            )
            classes.set(
              listOf("RotatingCube")
            )
        }
    }
}
