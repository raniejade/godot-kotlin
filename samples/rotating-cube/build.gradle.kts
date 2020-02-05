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
            classes(
              "RotatingCube"
            )
        }
    }
}