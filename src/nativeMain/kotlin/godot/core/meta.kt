package godot.core

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.SOURCE)
annotation class MissingGDNativeAPI(
  val name: String
)

fun <T> missingGDNativeAPI(): T {
  throw NotImplementedError("Missing GDNative API!")
}