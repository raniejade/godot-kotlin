package godot.gradle

object GDClassNameUtils {
  val CLASS_REGEX = Regex("^(?<package>(?>\\w+\\.)*)(?<simpleName>\\w+)\$")
  fun normalizeClassName(cls: String): String {
    return CLASS_REGEX.matchEntire(cls)?.let { result ->
      result.groups["simpleName"]!!.value
    } ?: cls
  }
}