plugins {
  kotlin("multiplatform") version "1.3.61"
  id("com.github.raniejade.godot-kotlin")
}

buildscript {
  repositories {
    jcenter()
  }
  dependencies {
    classpath("godot-kotlin:build-support:0.1.0")
  }
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