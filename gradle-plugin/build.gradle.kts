import org.apache.tools.ant.filters.ReplaceTokens

plugins {
  `kotlin-dsl`
  id("org.ajoberstar.reckon") version "0.12.0"
}

reckon {
  scopeFromProp()
  stageFromProp("alpha", "rc", "final")
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

tasks {
  val processResources by getting(Copy::class) {
    outputs.upToDateWhen { false }
    val tokens = mapOf("version" to version.toString())
    from("src/main/resources") {
      include("*.properties")
      filter<ReplaceTokens>("tokens" to tokens)
    }
  }
}