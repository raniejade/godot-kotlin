plugins {
  `kotlin-dsl`
}

gradlePlugin {
  plugins {
    create("godotPlugin") {
      id = "com.github.raniejade.godot-kotlin"
      implementationClass = "godot.gradle.GodotPlugin"
    }
  }
}

repositories {
  jcenter()
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib", version = "1.3.61"))
  implementation(kotlin("gradle-plugin", version = "1.3.61"))
  implementation(kotlin("gradle-plugin-api", version = "1.3.61"))
  implementation("com.squareup:kotlinpoet:1.5.0")
}