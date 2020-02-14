// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class StyleBoxLine(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : StyleBox(null) {
  var color: Color
    get() {
       return getColor() 
    }
    set(value) {
      setColor(value)
    }

  var growBegin: Float
    get() {
       return getGrowBegin() 
    }
    set(value) {
      setGrowBegin(value)
    }

  var growEnd: Float
    get() {
       return getGrowEnd() 
    }
    set(value) {
      setGrowEnd(value)
    }

  var thickness: Int
    get() {
       return getThickness() 
    }
    set(value) {
      setThickness(value)
    }

  var vertical: Boolean
    get() {
       return isVertical() 
    }
    set(value) {
      setVertical(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for color
   */
  fun color(cb: Color.() -> Unit) {
    val _p = color
    cb(_p)
    color = _p
  }

  fun getColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getGrowBegin(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGrowBegin.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGrowEnd(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGrowEnd.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getThickness(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getThickness.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isVertical(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isVertical.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setColor.call(self._handle, listOf(color), null)
    }
  }

  fun setGrowBegin(offset: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGrowBegin.call(self._handle, listOf(offset), null)
    }
  }

  fun setGrowEnd(offset: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGrowEnd.call(self._handle, listOf(offset), null)
    }
  }

  fun setThickness(thickness: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setThickness.call(self._handle, listOf(thickness), null)
    }
  }

  fun setVertical(vertical: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVertical.call(self._handle, listOf(vertical), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StyleBoxLine".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StyleBoxLine" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for StyleBoxLine
     */
    private object __method_bind {
      val getColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getGrowBegin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "get_grow_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_grow_begin" }
        }
      val getGrowEnd: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "get_grow_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_grow_end" }
        }
      val getThickness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "get_thickness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_thickness" }
        }
      val isVertical: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "is_vertical".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_vertical" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setGrowBegin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_grow_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_grow_begin" }
        }
      val setGrowEnd: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_grow_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_grow_end" }
        }
      val setThickness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_thickness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_thickness" }
        }
      val setVertical: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_vertical".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertical" }
        }}
  }
}
