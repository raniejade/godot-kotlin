plugins {
  kotlin("jvm")
  id("org.jetbrains.intellij") version "0.4.16"
}

data class VersionRange(
  val since: String,
  val until: String
)

data class Product(
  val type: String,
  val version: String,
  val plugins: List<String>,
  val versionRange: VersionRange,
  val suffix: String
)

val product = properties.getOrDefault("idea.product", "IJ193").run {
  when (this) {
    "IJ193" -> Product(
      "IC",
      "193.6494.35",
      listOf("java", "org.jetbrains.kotlin:1.3.61-release-IJ2019.3-1"),
      VersionRange("193.1", "193.*"),
      "IJ2019.3"
    )
    else -> throw AssertionError("Unsupported product $this")
  }
}

repositories {
  jcenter()
  mavenCentral()
}

dependencies {
  compileOnly(kotlin("stdlib"))
}

intellij {
  pluginName = "Godot Kotlin (godot-kotl.in)"
  version = product.version
  type = product.type
  setPlugins(*product.plugins.toTypedArray())
}

tasks {
  compileKotlin {
    kotlinOptions {
      jvmTarget = "1.8"
    }
  }

  val productVersion = "${project.version}-${product.suffix}"
  buildPlugin {
    archiveBaseName.set("")
    archiveVersion.set(productVersion)
  }

  patchPluginXml {
    setVersion(productVersion)
    setSinceBuild(product.versionRange.since)
    setUntilBuild(product.versionRange.until)
  }
}