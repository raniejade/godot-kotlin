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
    macosX64("macos")
    mingwX64("windows")
    linuxX64("linux")

    targets.withType<KotlinNativeTarget> {
        binaries {
            sharedLib(listOf(NativeBuildType.DEBUG))
        }

        compilations["main"].defaultSourceSet {
            dependencies {
                api(project(":core"))
            }

            kotlin.srcDirs("src/rotatingCubeMain/kotlin")
        }
    }
}

godot {
    libraries {
//        val rotatingCube by creating {
//            targets.set(
//              listOf("rotatingCube")
//            )
//            classes.set(
//              listOf("RotatingCube")
//            )
//        }
    }
}
