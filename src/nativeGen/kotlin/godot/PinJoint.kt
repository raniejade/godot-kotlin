// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PinJoint internal constructor(
  _handle: COpaquePointer
) : Joint(_handle) {
  fun getParam(param: Int): Float {
    val _args = VariantArray.new()
    _args.append(param)
    val _ret = __method_bind.get_param.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asFloat()
  }

  fun setParam(param: Int, value: Float) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(value)
    __method_bind.set_param.call(this.toVariant(), _args.toVariant(), 2)
  }

  enum class Param(
    val value: Int
  ) {
    PARAM_BIAS(0),

    PARAM_DAMPING(1),

    PARAM_IMPULSE_CLAMP(2);

    companion object {
      fun from(value: Int): Param {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val PARAM_BIAS: Int = 0

    val PARAM_DAMPING: Int = 1

    val PARAM_IMPULSE_CLAMP: Int = 2

    fun new(): PinJoint = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PinJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PinJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PinJoint(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PinJoint = PinJoint(ptr)
    /**
     * Container for method_bind pointers for PinJoint
     */
    private object __method_bind {
      val get_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PinJoint".cstr.ptr,
              "get_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param" }
            }
          }

      val set_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PinJoint".cstr.ptr,
              "set_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param" }
            }
          }
    }
  }
}
