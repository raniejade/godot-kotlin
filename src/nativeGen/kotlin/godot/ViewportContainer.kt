// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ViewportContainer(
  _handle: COpaquePointer
) : Container(_handle) {
  var stretch: Boolean
    get() {
       return isStretchEnabled() 
    }
    set(value) {
      setStretch(value)
    }

  var stretchShrink: Int
    get() {
       return getStretchShrink() 
    }
    set(value) {
      setStretchShrink(value)
    }

  fun getStretchShrink(): Int {
    val _ret = __method_bind.getStretchShrink.call(this._handle)
    return _ret.asInt()
  }

  fun isStretchEnabled(): Boolean {
    val _ret = __method_bind.isStretchEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setStretch(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setStretch.call(this._handle, _arg, 1)
  }

  fun setStretchShrink(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setStretchShrink.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): ViewportContainer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ViewportContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ViewportContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ViewportContainer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ViewportContainer = ViewportContainer(ptr)
    /**
     * Container for method_bind pointers for ViewportContainer
     */
    private object __method_bind {
      val getStretchShrink: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
            "get_stretch_shrink".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stretch_shrink" }
        }
      val isStretchEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
            "is_stretch_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_stretch_enabled" }
        }
      val setStretch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
            "set_stretch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stretch" }
        }
      val setStretchShrink: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
            "set_stretch_shrink".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stretch_shrink" }
        }}
  }
}
