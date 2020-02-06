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
        val simple by creating {
            classes(
              "Simple"
            )
        }
    }
}