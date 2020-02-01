// DO NOT EDIT, THIS CLASS IS GENERATED!
package godot

import godot.core.Variant
import kotlin.Int
import kotlin.Suppress
import kotlin.collections.List
import kotlin.reflect.KCallable

/**
 * Base class for all methods
 */
abstract class Method<T : Object, R>(
  val parameterCount: Int
) {
  abstract operator fun invoke(instance: T, args: List<Variant>): Variant
}

/**
 * Represents a method with 0 params
 */
@Suppress("UNCHECKED_CAST")
class Method0<T : Object, R>(
  val method: (T) -> R
) : Method<T, R>(0) {
  override operator fun invoke(instance: T, args: List<Variant>): Variant = Variant.fromAny(
    method(
      instance
    ) as Any
  )
}

/**
 * Registers a method with 0 params and returns a value of type R
 */
@Suppress("UNCHECKED_CAST")
inline fun <T : Object, R, reified K : (T) -> R> ClassMemberRegistry<T>.registerMethod(method: K) {
  val methodName = (method as KCallable<Unit>).name
  val methodHandle = Method0(method)
  val methodHandleRef = track(methodHandle)
  doRegisterMethod(className, methodName, methodHandleRef)
}

/**
 * Represents a method with 1 params
 */
@Suppress("UNCHECKED_CAST")
class Method1<T : Object, A0, R>(
  val method: (T, A0) -> R
) : Method<T, R>(1) {
  override operator fun invoke(instance: T, args: List<Variant>): Variant = Variant.fromAny(
    method(
      instance,
      args[0].toAny() as A0
    ) as Any
  )
}

/**
 * Registers a method with 1 params and returns a value of type R
 */
@Suppress("UNCHECKED_CAST")
inline fun <T : Object, R, A0, reified K : (T, A0) -> R>
    ClassMemberRegistry<T>.registerMethod(method: K) {
  val methodName = (method as KCallable<Unit>).name
  val methodHandle = Method1(method)
  val methodHandleRef = track(methodHandle)
  doRegisterMethod(className, methodName, methodHandleRef)
}

/**
 * Represents a method with 2 params
 */
@Suppress("UNCHECKED_CAST")
class Method2<T : Object, A0, A1, R>(
  val method: (
    T,
    A0,
    A1
  ) -> R
) : Method<T, R>(2) {
  override operator fun invoke(instance: T, args: List<Variant>): Variant = Variant.fromAny(
    method(
      instance,
      args[0].toAny() as A0,
      args[1].toAny() as A1
    ) as Any
  )
}

/**
 * Registers a method with 2 params and returns a value of type R
 */
@Suppress("UNCHECKED_CAST")
inline fun <T : Object, R, A0, A1, reified K : (
  T,
  A0,
  A1
) -> R> ClassMemberRegistry<T>.registerMethod(method: K) {
  val methodName = (method as KCallable<Unit>).name
  val methodHandle = Method2(method)
  val methodHandleRef = track(methodHandle)
  doRegisterMethod(className, methodName, methodHandleRef)
}

/**
 * Represents a method with 3 params
 */
@Suppress("UNCHECKED_CAST")
class Method3<T : Object, A0, A1, A2, R>(
  val method: (
    T,
    A0,
    A1,
    A2
  ) -> R
) : Method<T, R>(3) {
  override operator fun invoke(instance: T, args: List<Variant>): Variant = Variant.fromAny(
    method(
      instance,
      args[0].toAny() as A0,
      args[1].toAny() as A1,
      args[2].toAny() as A2
    ) as Any
  )
}

/**
 * Registers a method with 3 params and returns a value of type R
 */
@Suppress("UNCHECKED_CAST")
inline fun <T : Object, R, A0, A1, A2, reified K : (
  T,
  A0,
  A1,
  A2
) -> R> ClassMemberRegistry<T>.registerMethod(method: K) {
  val methodName = (method as KCallable<Unit>).name
  val methodHandle = Method3(method)
  val methodHandleRef = track(methodHandle)
  doRegisterMethod(className, methodName, methodHandleRef)
}

/**
 * Represents a method with 4 params
 */
@Suppress("UNCHECKED_CAST")
class Method4<T : Object, A0, A1, A2, A3, R>(
  val method: (
    T,
    A0,
    A1,
    A2,
    A3
  ) -> R
) : Method<T, R>(4) {
  override operator fun invoke(instance: T, args: List<Variant>): Variant = Variant.fromAny(
    method(
      instance,
      args[0].toAny() as A0,
      args[1].toAny() as A1,
      args[2].toAny() as A2,
      args[3].toAny() as A3
    ) as Any
  )
}

/**
 * Registers a method with 4 params and returns a value of type R
 */
@Suppress("UNCHECKED_CAST")
inline fun <T : Object, R, A0, A1, A2, A3, reified K : (
  T,
  A0,
  A1,
  A2,
  A3
) -> R> ClassMemberRegistry<T>.registerMethod(method: K) {
  val methodName = (method as KCallable<Unit>).name
  val methodHandle = Method4(method)
  val methodHandleRef = track(methodHandle)
  doRegisterMethod(className, methodName, methodHandleRef)
}

/**
 * Represents a method with 5 params
 */
@Suppress("UNCHECKED_CAST")
class Method5<T : Object, A0, A1, A2, A3, A4, R>(
  val method: (
    T,
    A0,
    A1,
    A2,
    A3,
    A4
  ) -> R
) : Method<T, R>(5) {
  override operator fun invoke(instance: T, args: List<Variant>): Variant = Variant.fromAny(
    method(
      instance,
      args[0].toAny() as A0,
      args[1].toAny() as A1,
      args[2].toAny() as A2,
      args[3].toAny() as A3,
      args[4].toAny() as A4
    ) as Any
  )
}

/**
 * Registers a method with 5 params and returns a value of type R
 */
@Suppress("UNCHECKED_CAST")
inline fun <T : Object, R, A0, A1, A2, A3, A4, reified K : (
  T,
  A0,
  A1,
  A2,
  A3,
  A4
) -> R> ClassMemberRegistry<T>.registerMethod(method: K) {
  val methodName = (method as KCallable<Unit>).name
  val methodHandle = Method5(method)
  val methodHandleRef = track(methodHandle)
  doRegisterMethod(className, methodName, methodHandleRef)
}

/**
 * Represents a method with 6 params
 */
@Suppress("UNCHECKED_CAST")
class Method6<T : Object, A0, A1, A2, A3, A4, A5, R>(
  val method: (
    T,
    A0,
    A1,
    A2,
    A3,
    A4,
    A5
  ) -> R
) : Method<T, R>(6) {
  override operator fun invoke(instance: T, args: List<Variant>): Variant = Variant.fromAny(
    method(
      instance,
      args[0].toAny() as A0,
      args[1].toAny() as A1,
      args[2].toAny() as A2,
      args[3].toAny() as A3,
      args[4].toAny() as A4,
      args[5].toAny() as A5
    ) as Any
  )
}

/**
 * Registers a method with 6 params and returns a value of type R
 */
@Suppress("UNCHECKED_CAST")
inline fun <T : Object, R, A0, A1, A2, A3, A4, A5, reified K : (
  T,
  A0,
  A1,
  A2,
  A3,
  A4,
  A5
) -> R> ClassMemberRegistry<T>.registerMethod(method: K) {
  val methodName = (method as KCallable<Unit>).name
  val methodHandle = Method6(method)
  val methodHandleRef = track(methodHandle)
  doRegisterMethod(className, methodName, methodHandleRef)
}

/**
 * Represents a method with 7 params
 */
@Suppress("UNCHECKED_CAST")
class Method7<T : Object, A0, A1, A2, A3, A4, A5, A6, R>(
  val method: (
    T,
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6
  ) -> R
) : Method<T, R>(7) {
  override operator fun invoke(instance: T, args: List<Variant>): Variant = Variant.fromAny(
    method(
      instance,
      args[0].toAny() as A0,
      args[1].toAny() as A1,
      args[2].toAny() as A2,
      args[3].toAny() as A3,
      args[4].toAny() as A4,
      args[5].toAny() as A5,
      args[6].toAny() as A6
    ) as Any
  )
}

/**
 * Registers a method with 7 params and returns a value of type R
 */
@Suppress("UNCHECKED_CAST")
inline fun <T : Object, R, A0, A1, A2, A3, A4, A5, A6, reified K : (
  T,
  A0,
  A1,
  A2,
  A3,
  A4,
  A5,
  A6
) -> R> ClassMemberRegistry<T>.registerMethod(method: K) {
  val methodName = (method as KCallable<Unit>).name
  val methodHandle = Method7(method)
  val methodHandleRef = track(methodHandle)
  doRegisterMethod(className, methodName, methodHandleRef)
}

/**
 * Represents a method with 8 params
 */
@Suppress("UNCHECKED_CAST")
class Method8<T : Object, A0, A1, A2, A3, A4, A5, A6, A7, R>(
  val method: (
    T,
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7
  ) -> R
) : Method<T, R>(8) {
  override operator fun invoke(instance: T, args: List<Variant>): Variant = Variant.fromAny(
    method(
      instance,
      args[0].toAny() as A0,
      args[1].toAny() as A1,
      args[2].toAny() as A2,
      args[3].toAny() as A3,
      args[4].toAny() as A4,
      args[5].toAny() as A5,
      args[6].toAny() as A6,
      args[7].toAny() as A7
    ) as Any
  )
}

/**
 * Registers a method with 8 params and returns a value of type R
 */
@Suppress("UNCHECKED_CAST")
inline fun <T : Object, R, A0, A1, A2, A3, A4, A5, A6, A7, reified K : (
  T,
  A0,
  A1,
  A2,
  A3,
  A4,
  A5,
  A6,
  A7
) -> R> ClassMemberRegistry<T>.registerMethod(method: K) {
  val methodName = (method as KCallable<Unit>).name
  val methodHandle = Method8(method)
  val methodHandleRef = track(methodHandle)
  doRegisterMethod(className, methodName, methodHandleRef)
}

/**
 * Represents a method with 9 params
 */
@Suppress("UNCHECKED_CAST")
class Method9<T : Object, A0, A1, A2, A3, A4, A5, A6, A7, A8, R>(
  val method: (
    T,
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7,
    A8
  ) -> R
) : Method<T, R>(9) {
  override operator fun invoke(instance: T, args: List<Variant>): Variant = Variant.fromAny(
    method(
      instance,
      args[0].toAny() as A0,
      args[1].toAny() as A1,
      args[2].toAny() as A2,
      args[3].toAny() as A3,
      args[4].toAny() as A4,
      args[5].toAny() as A5,
      args[6].toAny() as A6,
      args[7].toAny() as A7,
      args[8].toAny() as A8
    ) as Any
  )
}

/**
 * Registers a method with 9 params and returns a value of type R
 */
@Suppress("UNCHECKED_CAST")
inline fun <T : Object, R, A0, A1, A2, A3, A4, A5, A6, A7, A8, reified K : (
  T,
  A0,
  A1,
  A2,
  A3,
  A4,
  A5,
  A6,
  A7,
  A8
) -> R> ClassMemberRegistry<T>.registerMethod(method: K) {
  val methodName = (method as KCallable<Unit>).name
  val methodHandle = Method9(method)
  val methodHandleRef = track(methodHandle)
  doRegisterMethod(className, methodName, methodHandleRef)
}

/**
 * Represents a method with 10 params
 */
@Suppress("UNCHECKED_CAST")
class Method10<T : Object, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, R>(
  val method: (
    T,
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7,
    A8,
    A9
  ) -> R
) : Method<T, R>(10) {
  override operator fun invoke(instance: T, args: List<Variant>): Variant = Variant.fromAny(
    method(
      instance,
      args[0].toAny() as A0,
      args[1].toAny() as A1,
      args[2].toAny() as A2,
      args[3].toAny() as A3,
      args[4].toAny() as A4,
      args[5].toAny() as A5,
      args[6].toAny() as A6,
      args[7].toAny() as A7,
      args[8].toAny() as A8,
      args[9].toAny() as A9
    ) as Any
  )
}

/**
 * Registers a method with 10 params and returns a value of type R
 */
@Suppress("UNCHECKED_CAST")
inline fun <T : Object, R, A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, reified K : (
  T,
  A0,
  A1,
  A2,
  A3,
  A4,
  A5,
  A6,
  A7,
  A8,
  A9
) -> R> ClassMemberRegistry<T>.registerMethod(method: K) {
  val methodName = (method as KCallable<Unit>).name
  val methodHandle = Method10(method)
  val methodHandleRef = track(methodHandle)
  doRegisterMethod(className, methodName, methodHandleRef)
}
