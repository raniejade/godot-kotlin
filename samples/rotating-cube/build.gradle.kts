plugins {
    kotlin("multiplatform")
    id("com.github.raniejade.godot-kotlin")
}

repositories {
    jcenter()
    mavenCentral()
}

godot {
    isCompositeBuild.set(true)
    libraries {
        val rotatingCube by creating {
            classes(
              "RotatingCube"
            )
        }
    }
}