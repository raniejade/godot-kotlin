package godot

import godot.core.Variant
import kotlin.reflect.KCallable

abstract class Method<T: Object, R>(val paramCount: Int) {
  abstract operator fun invoke(instance: T, args: List<Variant>): Variant
}

class Method0<T: Object, R>(val method: (T) -> R): Method<T, R>(0) {
  override fun invoke(instance: T, args: List<Variant>): Variant {
    return Variant.fromAny(
      method(instance) as Any
    )
  }
}

class Method1<T: Object, A1, R>(val method: (T, A1) -> R): Method<T, R>(1) {
  override fun invoke(instance: T, args: List<Variant>): Variant {
    return Variant.fromAny(
      method(instance, args[0].toAny() as A1) as Any
    )
  }
}

inline fun <T: Object, R, reified K: (T) -> R> ClassMemberRegistry<T>.registerMethod(method: K) {
  val methodName = (method as KCallable<Unit>).name
  val methodHandle = Method0(method)
  val methodHandleRef = track(methodHandle)
  doRegisterMethod(className, methodName, methodHandleRef)
}

inline fun <T: Object, R, A1, reified K: (T, A1) -> R> ClassMemberRegistry<T>.registerMethod(method: K) {
  val methodName = (method as KCallable<Unit>).name
  val methodHandle = Method1(method)
  val methodHandleRef = track(methodHandle)
  doRegisterMethod(className, methodName, methodHandleRef)
}
