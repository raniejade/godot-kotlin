import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

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
        val rotatingCube by creating {
            classes.set(
              listOf("RotatingCube")
            )
        }
    }
}

kotlin {
    targets.withType<KotlinNativeTarget> {
        compilations.getByName("main").defaultSourceSet {
            dependencies {
                api(project(":core"))
            }
        }
    }

}
