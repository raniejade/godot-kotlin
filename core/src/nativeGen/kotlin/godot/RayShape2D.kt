// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class RayShape2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Shape2D(null) {
  var length: Float
    get() {
       return getLength() 
    }
    set(value) {
      setLength(value)
    }

  var slipsOnSlope: Boolean
    get() {
       return getSlipsOnSlope() 
    }
    set(value) {
      setSlipsOnSlope(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getLength(): Float {
    val _ret = __method_bind.getLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getSlipsOnSlope(): Boolean {
    val _ret = __method_bind.getSlipsOnSlope.call(this._handle)
    return _ret.asBoolean()
  }

  fun setLength(length: Float) {
    val _arg = Variant(length)
    __method_bind.setLength.call(this._handle, listOf(_arg))
  }

  fun setSlipsOnSlope(active: Boolean) {
    val _arg = Variant(active)
    __method_bind.setSlipsOnSlope.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RayShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RayShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for RayShape2D
     */
    private object __method_bind {
      val getLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayShape2D".cstr.ptr,
            "get_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_length" }
        }
      val getSlipsOnSlope: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayShape2D".cstr.ptr,
            "get_slips_on_slope".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slips_on_slope" }
        }
      val setLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayShape2D".cstr.ptr,
            "set_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_length" }
        }
      val setSlipsOnSlope: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayShape2D".cstr.ptr,
            "set_slips_on_slope".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_slips_on_slope" }
        }}
  }
}
