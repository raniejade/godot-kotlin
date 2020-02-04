import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTargetWithTests
import org.apache.tools.ant.taskdefs.condition.Os
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType

plugins {
    kotlin("multiplatform")
    id("com.github.raniejade.godot-kotlin")
}

repositories {
    jcenter()
    mavenCentral()
}

godot {
    libraries {
        val simple by creating {
            classes.set(
              listOf("Simple")
            )
        }
    }
}

kotlin {
    targets.withType<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget> {
        compilations.getByName("main").defaultSourceSet {
            dependencies {
                api(project(":core"))
            }
        }
    }

}
