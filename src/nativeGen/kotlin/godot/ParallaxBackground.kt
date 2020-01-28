// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ParallaxBackground(
  _handle: COpaquePointer
) : CanvasLayer(_handle) {
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

  fun getLimitBegin(): Vector2 {
    val _ret = __method_bind.getLimitBegin.call(this._handle)
    return _ret.asVector2()
  }

  fun getLimitEnd(): Vector2 {
    val _ret = __method_bind.getLimitEnd.call(this._handle)
    return _ret.asVector2()
  }

  fun getScrollBaseOffset(): Vector2 {
    val _ret = __method_bind.getScrollBaseOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getScrollBaseScale(): Vector2 {
    val _ret = __method_bind.getScrollBaseScale.call(this._handle)
    return _ret.asVector2()
  }

  fun getScrollOffset(): Vector2 {
    val _ret = __method_bind.getScrollOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun isIgnoreCameraZoom(): Boolean {
    val _ret = __method_bind.isIgnoreCameraZoom.call(this._handle)
    return _ret.asBoolean()
  }

  fun setIgnoreCameraZoom(ignore: Boolean) {
    val _arg = Variant.new(ignore)
    __method_bind.setIgnoreCameraZoom.call(this._handle, _arg, 1)
  }

  fun setLimitBegin(ofs: Vector2) {
    val _arg = Variant.new(ofs)
    __method_bind.setLimitBegin.call(this._handle, _arg, 1)
  }

  fun setLimitEnd(ofs: Vector2) {
    val _arg = Variant.new(ofs)
    __method_bind.setLimitEnd.call(this._handle, _arg, 1)
  }

  fun setScrollBaseOffset(ofs: Vector2) {
    val _arg = Variant.new(ofs)
    __method_bind.setScrollBaseOffset.call(this._handle, _arg, 1)
  }

  fun setScrollBaseScale(scale: Vector2) {
    val _arg = Variant.new(scale)
    __method_bind.setScrollBaseScale.call(this._handle, _arg, 1)
  }

  fun setScrollOffset(ofs: Vector2) {
    val _arg = Variant.new(ofs)
    __method_bind.setScrollOffset.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): ParallaxBackground = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ParallaxBackground".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ParallaxBackground" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ParallaxBackground(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ParallaxBackground = ParallaxBackground(ptr)
    /**
     * Container for method_bind pointers for ParallaxBackground
     */
    private object __method_bind {
      val getLimitBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_limit_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_limit_begin" }
        }
      val getLimitEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_limit_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_limit_end" }
        }
      val getScrollBaseOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_scroll_base_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll_base_offset" }
        }
      val getScrollBaseScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_scroll_base_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll_base_scale" }
        }
      val getScrollOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_scroll_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll_offset" }
        }
      val isIgnoreCameraZoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "is_ignore_camera_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ignore_camera_zoom" }
        }
      val setIgnoreCameraZoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_ignore_camera_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ignore_camera_zoom" }
        }
      val setLimitBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_limit_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_limit_begin" }
        }
      val setLimitEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_limit_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_limit_end" }
        }
      val setScrollBaseOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_scroll_base_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scroll_base_offset" }
        }
      val setScrollBaseScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_scroll_base_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scroll_base_scale" }
        }
      val setScrollOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_scroll_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scroll_offset" }
        }}
  }
}
