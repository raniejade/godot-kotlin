package godot.core

@Target(
  AnnotationTarget.CLASS,
  AnnotationTarget.FUNCTION,
  AnnotationTarget.PROPERTY,
  AnnotationTarget.PROPERTY_GETTER,
  AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.SOURCE)
annotation class MissingGDNativeAPI(
  val name: String
)

fun <T> missingGDNativeAPI(): T {
  throw NotImplementedError("Missing GDNative API!")
}