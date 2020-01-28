// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
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

open class VisibilityNotifier(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var aabb: AABB
    get() {
       return getAabb() 
    }
    set(value) {
      setAabb(value)
    }

  /**
   * Specialized setter for aabb
   */
  fun aabb(cb: AABB.() -> Unit) {
    val _p = aabb
    cb(_p)
    aabb = _p
  }

  fun getAabb(): AABB {
    val _ret = __method_bind.getAabb.call(this._handle)
    return _ret.asAABB()
  }

  fun isOnScreen(): Boolean {
    val _ret = __method_bind.isOnScreen.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAabb(rect: AABB) {
    val _arg = Variant.new(rect)
    __method_bind.setAabb.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisibilityNotifier = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisibilityNotifier".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisibilityNotifier" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisibilityNotifier(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisibilityNotifier = VisibilityNotifier(ptr)
    /**
     * Container for method_bind pointers for VisibilityNotifier
     */
    private object __method_bind {
      val getAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier".cstr.ptr,
            "get_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_aabb" }
        }
      val isOnScreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier".cstr.ptr,
            "is_on_screen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_on_screen" }
        }
      val setAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier".cstr.ptr,
            "set_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_aabb" }
        }}
  }
}
