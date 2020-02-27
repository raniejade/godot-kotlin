import java.nio.file.Files
import java.nio.file.Paths

apply {
  plugin(BuildVersion::class.java)
  plugin(MiscPlugin::class.java)
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

val versionString = project.version

subprojects {
  group = "com.github.raniejade"
  this.version = versionString.toString()

  if (Files.exists(Paths.get("$rootDir/local.properties"))) {
    val localProperties = java.util.Properties()
    localProperties.load(java.io.FileInputStream("$rootDir/local.properties"))
    localProperties.forEach { prop -> project.extra.set(prop.key as String, prop.value) }
  }
}