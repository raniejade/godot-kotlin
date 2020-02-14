package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import gdnative.godot_variant_call_error
import gdnative.godot_variant_call_error_error
import godot.core.Allocator
import godot.core.CoreType
import godot.core.Godot
import godot.core.Variant
import kotlinx.cinterop.*

fun CPointer<godot_method_bind>.call(instance: COpaquePointer, args: List<Any?>, ret: COpaquePointer?) {
  Allocator.allocationScope {
    // free up later
    val allocatedStrings = mutableListOf<godot_string>()
    val argsPtr = if (args.isNotEmpty()) {
      allocArrayOf(args.map { arg ->
        when (arg) {
          is CoreType<*> -> arg._value.ptr
          is Object -> arg._handle
          is Int -> alloc<IntVar> { value = arg }.ptr
          // needs to be a double, otherwise value gets lost when it crosses c land
          is Float -> alloc<DoubleVar> { value = arg.toDouble() }.ptr
          is Boolean -> alloc<BooleanVar> { value = arg }.ptr
          is String -> alloc<godot_string> {
            checkNotNull(Godot.gdnative.godot_string_new)(ptr)
            checkNotNull(Godot.gdnative.godot_string_parse_utf8)(ptr, arg.cstr.ptr)
            allocatedStrings.add(this)
          }.ptr
          null -> null
          else -> throw AssertionError("Cannot convert $arg to COpaquePointer")
        }
      })
    } else {
      allocArray(1)
    }
    val retPtr = ret ?: alloc<COpaquePointerVar>().ptr

    checkNotNull(Godot.gdnative.godot_method_bind_ptrcall)(
      this@call,
      instance,
      argsPtr,
      retPtr
    )

    allocatedStrings.forEach { str ->
      checkNotNull(Godot.gdnative.godot_string_destroy)(str.ptr)
    }
  }
}