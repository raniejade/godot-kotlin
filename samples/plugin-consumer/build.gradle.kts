plugins {
    kotlin("multiplatform")
    id("com.github.raniejade.godot-kotlin")
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    godotPlugin(project(":editor-plugin"))
}

godot {
    isCompositeBuild.set(true)
    libraries {
        val simple by creating {}
    }
}