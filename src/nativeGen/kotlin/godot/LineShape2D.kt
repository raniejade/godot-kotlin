// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class LineShape2D(
  _handle: COpaquePointer
) : Shape2D(_handle) {
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

  fun getD(): Float {
    val _ret = __method_bind.getD.call(this._handle)
    return _ret.asFloat()
  }

  fun getNormal(): Vector2 {
    val _ret = __method_bind.getNormal.call(this._handle)
    return _ret.asVector2()
  }

  fun setD(d: Float) {
    val _arg = Variant.new(d)
    __method_bind.setD.call(this._handle, _arg, 1)
  }

  fun setNormal(normal: Vector2) {
    val _arg = Variant.new(normal)
    __method_bind.setNormal.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): LineShape2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LineShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for LineShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      LineShape2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): LineShape2D = LineShape2D(ptr)
    /**
     * Container for method_bind pointers for LineShape2D
     */
    private object __method_bind {
      val getD: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "getD".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getD" }
        }
      val getNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "getNormal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNormal" }
        }
      val setD: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "setD".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setD" }
        }
      val setNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "setNormal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNormal" }
        }}
  }
}
