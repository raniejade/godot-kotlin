plugins {
  kotlin("multiplatform") version "1.3.61"
  id("com.github.raniejade.godot-kotlin.plugin")
  `maven-publish`
}

apply {
  plugin(BuildVersion::class.java)
}

buildscript {
  repositories {
    jcenter()
    mavenCentral()
    gradlePluginPortal()
  }

  dependencies {
    classpath("godot-kotlin:build-support:0.1.0")
  }
}

repositories {
  jcenter()
  mavenCentral()
}

godotPlugin {
  isCompositeBuild.set(true)
  mainClass.set("godot.editor.Main")
  author.set("Ranie Jade Ramiso")
  description.set("An editor plugin for godot-kotlin")
}

//afterEvaluate {
//  publishing {
//    publications {
//      withType(MavenPublication::class.java) {
//        groupId = "com.github.raniejade.godot-kotlin-samples"
//      }
//    }
//  }
//}