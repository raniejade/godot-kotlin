// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
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

open class ParallaxBackground(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : CanvasLayer(null) {
  var scrollBaseOffset: Vector2
    get() {
       return getScrollBaseOffset() 
    }
    set(value) {
      setScrollBaseOffset(value)
    }

  var scrollBaseScale: Vector2
    get() {
       return getScrollBaseScale() 
    }
    set(value) {
      setScrollBaseScale(value)
    }

  var scrollIgnoreCameraZoom: Boolean
    get() {
       return isIgnoreCameraZoom() 
    }
    set(value) {
      setIgnoreCameraZoom(value)
    }

  var scrollLimitBegin: Vector2
    get() {
       return getLimitBegin() 
    }
    set(value) {
      setLimitBegin(value)
    }

  var scrollLimitEnd: Vector2
    get() {
       return getLimitEnd() 
    }
    set(value) {
      setLimitEnd(value)
    }

  var scrollOffset: Vector2
    get() {
       return getScrollOffset() 
    }
    set(value) {
      setScrollOffset(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for scrollBaseOffset
   */
  fun scrollBaseOffset(cb: Vector2.() -> Unit) {
    val _p = scrollBaseOffset
    cb(_p)
    scrollBaseOffset = _p
  }

  /**
   * Specialized setter for scrollBaseScale
   */
  fun scrollBaseScale(cb: Vector2.() -> Unit) {
    val _p = scrollBaseScale
    cb(_p)
    scrollBaseScale = _p
  }

  /**
   * Specialized setter for scrollLimitBegin
   */
  fun scrollLimitBegin(cb: Vector2.() -> Unit) {
    val _p = scrollLimitBegin
    cb(_p)
    scrollLimitBegin = _p
  }

  /**
   * Specialized setter for scrollLimitEnd
   */
  fun scrollLimitEnd(cb: Vector2.() -> Unit) {
    val _p = scrollLimitEnd
    cb(_p)
    scrollLimitEnd = _p
  }

  /**
   * Specialized setter for scrollOffset
   */
  fun scrollOffset(cb: Vector2.() -> Unit) {
    val _p = scrollOffset
    cb(_p)
    scrollOffset = _p
  }

  open fun _camera_moved(arg0: Transform2D, arg1: Vector2) {
    TODO()
  }

  fun getLimitBegin(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getLimitBegin.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLimitEnd(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getLimitEnd.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getScrollBaseOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getScrollBaseOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getScrollBaseScale(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getScrollBaseScale.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getScrollOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getScrollOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isIgnoreCameraZoom(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isIgnoreCameraZoom.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setIgnoreCameraZoom(ignore: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setIgnoreCameraZoom.call(self._handle, listOf(ignore), null)
    }
  }

  fun setLimitBegin(ofs: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLimitBegin.call(self._handle, listOf(ofs), null)
    }
  }

  fun setLimitEnd(ofs: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLimitEnd.call(self._handle, listOf(ofs), null)
    }
  }

  fun setScrollBaseOffset(ofs: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScrollBaseOffset.call(self._handle, listOf(ofs), null)
    }
  }

  fun setScrollBaseScale(scale: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScrollBaseScale.call(self._handle, listOf(scale), null)
    }
  }

  fun setScrollOffset(ofs: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScrollOffset.call(self._handle, listOf(ofs), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ParallaxBackground".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ParallaxBackground" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ParallaxBackground
     */
    private object __method_bind {
      val getLimitBegin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_limit_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_limit_begin" }
        }
      val getLimitEnd: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_limit_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_limit_end" }
        }
      val getScrollBaseOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_scroll_base_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll_base_offset" }
        }
      val getScrollBaseScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_scroll_base_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll_base_scale" }
        }
      val getScrollOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_scroll_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll_offset" }
        }
      val isIgnoreCameraZoom: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "is_ignore_camera_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ignore_camera_zoom" }
        }
      val setIgnoreCameraZoom: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_ignore_camera_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ignore_camera_zoom" }
        }
      val setLimitBegin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_limit_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_limit_begin" }
        }
      val setLimitEnd: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_limit_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_limit_end" }
        }
      val setScrollBaseOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_scroll_base_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scroll_base_offset" }
        }
      val setScrollBaseScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_scroll_base_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scroll_base_scale" }
        }
      val setScrollOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_scroll_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scroll_offset" }
        }}
  }
}
