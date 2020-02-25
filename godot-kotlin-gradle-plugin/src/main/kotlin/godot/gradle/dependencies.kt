package godot.gradle

import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

fun KotlinDependencyHandler.registerGodotKotlinDependencies(godot: GodotBaseExtension, platform: TargetPlatform) {
  val prefix = configurationPrefixFrom(platform)
  if (godot.isCompositeBuild.get()) {
    implementation("com.github.raniejade:godot-kotlin:0.1.0") {
      targetConfiguration = "${prefix}ApiElements"
      isTransitive = false
    }
    // pull in implementation dependencies
    implementation("com.github.raniejade:godot-kotlin:0.1.0") {
      targetConfiguration = "${prefix}Hack"
    }
  } else {
    implementation("com.github.raniejade:godot-kotlin:${godot.godotKotlinVersion.get()}")
  }
}

private fun configurationPrefixFrom(platform: TargetPlatform): String {
  return when (platform) {
    TargetPlatform.WINDOWS -> "windows"
    TargetPlatform.LINUX -> "linux"
    TargetPlatform.MACOS -> "macos"
    else -> throw AssertionError("Unsupported platform $platform")
  }
}