// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisibilityNotifier2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var rect: Rect2
    get() {
       return getRect() 
    }
    set(value) {
      setRect(value)
    }

  /**
   * Specialized setter for rect
   */
  fun rect(cb: Rect2.() -> Unit) {
    val _p = rect
    cb(_p)
    rect = _p
  }

  fun getRect(): Rect2 {
    val _ret = __method_bind.getRect.call(this._handle)
    return _ret.asRect2()
  }

  fun isOnScreen(): Boolean {
    val _ret = __method_bind.isOnScreen.call(this._handle)
    return _ret.asBoolean()
  }

  fun setRect(rect: Rect2) {
    val _arg = Variant.new(rect)
    __method_bind.setRect.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisibilityNotifier2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisibilityNotifier2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisibilityNotifier2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisibilityNotifier2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisibilityNotifier2D = VisibilityNotifier2D(ptr)
    /**
     * Container for method_bind pointers for VisibilityNotifier2D
     */
    private object __method_bind {
      val getRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier2D".cstr.ptr,
            "get_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rect" }
        }
      val isOnScreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier2D".cstr.ptr,
            "is_on_screen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_on_screen" }
        }
      val setRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier2D".cstr.ptr,
            "set_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rect" }
        }}
  }
}
