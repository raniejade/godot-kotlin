package godot

fun String.toSignalName(): String {
  require(startsWith("signal")) { "signal names must start with 'signal'" }
  return removePrefix("signal").decapitalize()
}