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

open class Slider(
  _handle: COpaquePointer
) : Range(_handle) {
  var editable: Boolean
    get() {
       return isEditable() 
    }
    set(value) {
      setEditable(value)
    }

  var scrollable: Boolean
    get() {
       return isScrollable() 
    }
    set(value) {
      setScrollable(value)
    }

  var tickCount: Int
    get() {
       return getTicks() 
    }
    set(value) {
      setTicks(value)
    }

  var ticksOnBorders: Boolean
    get() {
       return getTicksOnBorders() 
    }
    set(value) {
      setTicksOnBorders(value)
    }

  fun getTicks(): Int {
    val _ret = __method_bind.getTicks.call(this._handle)
    return _ret.asInt()
  }

  fun getTicksOnBorders(): Boolean {
    val _ret = __method_bind.getTicksOnBorders.call(this._handle)
    return _ret.asBoolean()
  }

  fun isEditable(): Boolean {
    val _ret = __method_bind.isEditable.call(this._handle)
    return _ret.asBoolean()
  }

  fun isScrollable(): Boolean {
    val _ret = __method_bind.isScrollable.call(this._handle)
    return _ret.asBoolean()
  }

  fun setEditable(editable: Boolean) {
    val _arg = Variant.new(editable)
    __method_bind.setEditable.call(this._handle, _arg, 1)
  }

  fun setScrollable(scrollable: Boolean) {
    val _arg = Variant.new(scrollable)
    __method_bind.setScrollable.call(this._handle, _arg, 1)
  }

  fun setTicks(count: Int) {
    val _arg = Variant.new(count)
    __method_bind.setTicks.call(this._handle, _arg, 1)
  }

  fun setTicksOnBorders(ticksOnBorder: Boolean) {
    val _arg = Variant.new(ticksOnBorder)
    __method_bind.setTicksOnBorders.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for Slider
     */
    private object __method_bind {
      val getTicks: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "get_ticks".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ticks" }
        }
      val getTicksOnBorders: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "get_ticks_on_borders".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ticks_on_borders" }
        }
      val isEditable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "is_editable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editable" }
        }
      val isScrollable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "is_scrollable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_scrollable" }
        }
      val setEditable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "set_editable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_editable" }
        }
      val setScrollable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "set_scrollable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scrollable" }
        }
      val setTicks: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "set_ticks".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ticks" }
        }
      val setTicksOnBorders: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "set_ticks_on_borders".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ticks_on_borders" }
        }}
  }
}
