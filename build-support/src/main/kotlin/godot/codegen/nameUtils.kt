package godot.codegen

fun String.toSnakeCase(): String {
  val stringBuilder = StringBuilder()
  var prevCharLowerCase = false
  this.forEachIndexed { index, char ->
    if (char.isUpperCase() && prevCharLowerCase) {
      stringBuilder.append('_')
      prevCharLowerCase = false // reset
    }

    prevCharLowerCase = char.isLowerCase()

    stringBuilder.append(char.toLowerCase())
  }
  return stringBuilder.toString()
}


fun String.removeCommonPrefixFromEnumValueName(prefixes: List<String>): String {
  for (i in prefixes.indices.reversed()) {
    val prefix = (prefixes.joinToString("_", limit = i + 1) + "_")
      .replace("_...", "") // remove truncated string added by joinToString
    if (startsWith(prefix)) {
      return removePrefix(prefix)
    }
  }
  return this
}