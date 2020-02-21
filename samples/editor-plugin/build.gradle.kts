plugins {
  kotlin("multiplatform")
  id("com.github.raniejade.godot-kotlin.plugin")
  `maven-publish`
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

afterEvaluate {
  publishing {
    publications {
      withType(MavenPublication::class.java) {
        groupId = "com.github.raniejade.godot-kotlin-samples"
      }
    }
  }
}