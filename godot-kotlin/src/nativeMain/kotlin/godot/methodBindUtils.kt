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

fun CPointer<godot_method_bind>.slowcall(instance: COpaquePointer, args: List<Variant>): Variant {
  return Allocator.allocationScope {
    val error = alloc<godot_variant_call_error>()
    val ptr = allocArrayOf(args.map { it._value.ptr })
    val ret = checkNotNull(Godot.gdnative.godot_method_bind_call)(
      this@slowcall,
      instance,
      ptr,
      args.count(),
      error.ptr
    )

    maybeThrowException(error)

    Variant(ret)
  }
}

private fun maybeThrowException(error: godot_variant_call_error) {
  when (error.error) {
    godot_variant_call_error_error.GODOT_CALL_ERROR_CALL_OK -> {}
    godot_variant_call_error_error.GODOT_CALL_ERROR_CALL_ERROR_INSTANCE_IS_NULL -> {
      throw NullPointerException("Can not call invoke to a null instance!")
    }
    godot_variant_call_error_error.GODOT_CALL_ERROR_CALL_ERROR_INVALID_ARGUMENT -> {
      throw IllegalArgumentException(
              "Invalid argument at position ${error.argument}, expecting a ${Variant.Type.from(error.expected.value.toInt())}"
      )
    }
    godot_variant_call_error_error.GODOT_CALL_ERROR_CALL_ERROR_INVALID_METHOD -> {
      throw IllegalArgumentException("Invalid method!")
    }
    godot_variant_call_error_error.GODOT_CALL_ERROR_CALL_ERROR_TOO_FEW_ARGUMENTS,
    godot_variant_call_error_error.GODOT_CALL_ERROR_CALL_ERROR_TOO_MANY_ARGUMENTS -> {
      throw IllegalArgumentException("Invalid number of arguments passed to method, expecting ${error.argument}")
    }
  }
}