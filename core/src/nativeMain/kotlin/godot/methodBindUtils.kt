package godot

import gdnative.godot_method_bind
import gdnative.godot_variant
import gdnative.godot_variant_call_error
import gdnative.godot_variant_call_error_error
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import kotlinx.cinterop.*

fun CPointer<godot_method_bind>.call(instance: COpaquePointer, args: List<Variant>): Variant {
  return Allocator.allocationScope {
    val error = alloc<godot_variant_call_error>()
    val ptr = allocArrayOf(args.map { it._value.ptr })
    val ret = checkNotNull(Godot.gdnative.godot_method_bind_call)(
      this@call,
      instance,
      ptr,
      args.count(),
      error.ptr
    )

    maybeThrowException(error)

    Variant(ret)
  }
}

fun CPointer<godot_method_bind>.call(instance: COpaquePointer): Variant {
  return  Allocator.allocationScope {
    val error = alloc<godot_variant_call_error>()
    val ret = checkNotNull(Godot.gdnative.godot_method_bind_call)(
      this@call,
      instance,
      null,
      0,
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