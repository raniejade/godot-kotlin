package godot.core

import gdnative.godot_variant
import godot.Object
import kotlinx.cinterop.*

abstract class MethodHandle<T: Object, R>(val paramCount: Int) {
  abstract operator fun invoke(instance: T, args: List<Variant>): Variant
}

class MethodHandle0<T: Object, R>(val method: (T) -> R): MethodHandle<T, R>(0) {
  override fun invoke(instance: T, args: List<Variant>): Variant {
    return Variant.fromAny(
      method(instance) as Any
    )
  }
}

class MethodHandle1<T: Object, A1, R>(val method: (T, A1) -> R): MethodHandle<T, R>(1) {
  override fun invoke(instance: T, args: List<Variant>): Variant {
    return Variant.fromAny(
      method(instance, args[0].toAny() as A1) as Any
    )
  }
}

fun invokeMethod(instance: COpaquePointer?,
                 methodData: COpaquePointer?,
                 classData: COpaquePointer?,
                 numArgs: Int,
                 args: CPointer<CPointerVar<godot_variant>>?): CValue<godot_variant> {
  val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
  val kotlinInstance = kotlinInstanceRef.get()
  val methodHandleRef = checkNotNull(methodData).asStableRef<MethodHandle<Object, *>>()
  val methodHandle = methodHandleRef.get()

  check(methodHandle.paramCount == numArgs) {
    "Invalid number of arguments, $numArgs passed but ${methodHandle.paramCount} expected."
  }

  val variantArgs = if (numArgs == 0) {
    emptyList()
  } else {
    requireNotNull(args) { "args is null!" }
    val tmp = mutableListOf<Variant>()
    for (i in 0 until numArgs) {
      tmp.add(Variant(args[i]!!.pointed.readValue()))
    }
    tmp.toList()
  }

  return methodHandle(kotlinInstance, variantArgs)._value
}