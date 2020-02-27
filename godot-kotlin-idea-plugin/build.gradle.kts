plugins {
  kotlin("jvm")
  id("org.jetbrains.intellij")
}

apply {
  plugin(IJPluginPublish::class.java)
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
  val suffix: String,
  val extraResources: String
)

val product = properties.getOrDefault("idea.product", "IJ193").run {
  when (this) {
    "IJ193" -> Product(
      "IC",
      "193.6494.35",
      listOf("java", "org.jetbrains.kotlin:1.3.61-release-IJ2019.3-1"),
      VersionRange("193.1", "193.*"),
      "IJ2019.3",
      "src/intellij/resources"
    )
    "CL193" -> Product(
      "CL",
      "2019.3.4",
      listOf("com.intellij.kotlinNative.platformDeps:193.6494.38", "org.jetbrains.kotlin.native.clion:1.3.61-release-CLion-193.6494.38-8"),
      VersionRange("193.1", "193.*"),
      "CL2019.3",
      "src/clion/resources"
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

sourceSets["main"].resources {
  srcDir(product.extraResources)
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