import org.apache.tools.ant.filters.ReplaceTokens

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

version = "32.0.0"

tasks {
  val processResources by getting(Copy::class) {
    // always regenerate
    onlyIf { true }
    val tokens = mapOf("version" to version)
    from("src/main/resources") {
      include("*.properties")
      filter<ReplaceTokens>("tokens" to tokens)
    }
  }
}