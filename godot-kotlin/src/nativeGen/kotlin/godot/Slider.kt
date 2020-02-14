// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class Slider(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Range(null) {
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

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getTicks(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTicks.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTicksOnBorders(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTicksOnBorders.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isEditable(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEditable.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isScrollable(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isScrollable.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setEditable(editable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEditable.call(self._handle, listOf(editable), null)
    }
  }

  fun setScrollable(scrollable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScrollable.call(self._handle, listOf(scrollable), null)
    }
  }

  fun setTicks(count: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTicks.call(self._handle, listOf(count), null)
    }
  }

  fun setTicksOnBorders(ticksOnBorder: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTicksOnBorders.call(self._handle, listOf(ticksOnBorder), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for Slider
     */
    private object __method_bind {
      val getTicks: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "get_ticks".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ticks" }
        }
      val getTicksOnBorders: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "get_ticks_on_borders".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ticks_on_borders" }
        }
      val isEditable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "is_editable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editable" }
        }
      val isScrollable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "is_scrollable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_scrollable" }
        }
      val setEditable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "set_editable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_editable" }
        }
      val setScrollable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "set_scrollable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scrollable" }
        }
      val setTicks: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "set_ticks".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ticks" }
        }
      val setTicksOnBorders: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
            "set_ticks_on_borders".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ticks_on_borders" }
        }}
  }
}
