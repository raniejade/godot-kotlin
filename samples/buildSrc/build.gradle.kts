plugins {
  `kotlin-dsl`
}

repositories {
  jcenter()
  mavenCentral()
}

dependencies {
  api(kotlin("gradle-plugin", version = "1.3.61"))
}