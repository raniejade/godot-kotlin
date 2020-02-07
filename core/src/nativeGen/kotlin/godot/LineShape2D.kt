// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class LineShape2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Shape2D(null) {
  var d: Float
    get() {
       return getD() 
    }
    set(value) {
      setD(value)
    }

  var normal: Vector2
    get() {
       return getNormal() 
    }
    set(value) {
      setNormal(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for normal
   */
  fun normal(cb: Vector2.() -> Unit) {
    val _p = normal
    cb(_p)
    normal = _p
  }

  fun getD(): Float {
    val _ret = __method_bind.getD.call(this._handle)
    return _ret.asFloat()
  }

  fun getNormal(): Vector2 {
    val _ret = __method_bind.getNormal.call(this._handle)
    return _ret.asVector2()
  }

  fun setD(d: Float) {
    val _arg = Variant(d)
    __method_bind.setD.call(this._handle, listOf(_arg))
  }

  fun setNormal(normal: Vector2) {
    val _arg = Variant(normal)
    __method_bind.setNormal.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LineShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for LineShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for LineShape2D
     */
    private object __method_bind {
      val getD: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "get_d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_d" }
        }
      val getNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "get_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_normal" }
        }
      val setD: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "set_d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_d" }
        }
      val setNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "set_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normal" }
        }}
  }
}
