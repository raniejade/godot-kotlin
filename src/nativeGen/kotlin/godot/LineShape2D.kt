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

open class LineShape2D internal constructor(
  _handle: COpaquePointer
) : Shape2D(_handle) {
  fun getD(): Float {
    val _ret = __method_bind.get_d.call(this._handle)
    return _ret.asFloat()
  }

  fun getNormal(): Vector2 {
    val _ret = __method_bind.get_normal.call(this._handle)
    return _ret.asVector2()
  }

  fun setD(d: Float) {
    val _arg = Variant.new(d)
    __method_bind.set_d.call(this._handle, _arg, 1)
  }

  fun setNormal(normal: Vector2) {
    val _arg = Variant.new(normal)
    __method_bind.set_normal.call(this._handle, _arg, 1)
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
      val get_d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "get_d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_d" }
        }
      val get_normal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "get_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_normal" }
        }
      val set_d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "set_d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_d" }
        }
      val set_normal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "set_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normal" }
        }}
  }
}
