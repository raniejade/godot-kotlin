plugins {
    kotlin("multiplatform")
    id("com.github.raniejade.godot-kotlin.plugin")
}

version = "0.1.0"

repositories {
    jcenter()
    mavenCentral()
}

godotPlugin {
    isCompositeBuild.set(true)
    mainClass.set("MyPlugin")
    author.set("me")
    description.set("A custom editor plugin built using godot-kotlin!")
    additionalClasses("MyCustomType")
}