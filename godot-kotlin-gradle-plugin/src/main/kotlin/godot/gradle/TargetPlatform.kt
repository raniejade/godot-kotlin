package godot.gradle

enum class TargetPlatform {
  WINDOWS,
  MACOS,
  LINUX;

  fun normalizedName() = name.toLowerCase()
}