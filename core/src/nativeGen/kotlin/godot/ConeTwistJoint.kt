// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ConeTwistJoint(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Joint(null) {
  var bias: Float
    get() {
       return getParam(2) 
    }
    set(value) {
      setParam(2, value)
    }

  var relaxation: Float
    get() {
       return getParam(4) 
    }
    set(value) {
      setParam(4, value)
    }

  var softness: Float
    get() {
       return getParam(3) 
    }
    set(value) {
      setParam(3, value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getParam(param: Int): Float {
    val _arg = Variant.new(param)
    val _ret = __method_bind.getParam.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun setParam(param: Int, value: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.setParam.call(this._handle, _args)
  }

  enum class Param(
    val value: Int
  ) {
    SWING_SPAN(0),

    TWIST_SPAN(1),

    BIAS(2),

    SOFTNESS(3),

    RELAXATION(4),

    MAX(5);

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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConeTwistJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ConeTwistJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ConeTwistJoint
     */
    private object __method_bind {
      val getParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConeTwistJoint".cstr.ptr,
            "get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param" }
        }
      val setParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConeTwistJoint".cstr.ptr,
            "set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param" }
        }}
  }
}
