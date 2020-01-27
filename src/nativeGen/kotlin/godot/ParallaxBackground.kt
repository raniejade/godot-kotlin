// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
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
  fun getLimitBegin(): Vector2 {
    val _ret = __method_bind.get_limit_begin.call(this._handle)
    return _ret.asVector2()
  }

  fun getLimitEnd(): Vector2 {
    val _ret = __method_bind.get_limit_end.call(this._handle)
    return _ret.asVector2()
  }

  fun getScrollBaseOffset(): Vector2 {
    val _ret = __method_bind.get_scroll_base_offset.call(this._handle)
    return _ret.asVector2()
  }

  fun getScrollBaseScale(): Vector2 {
    val _ret = __method_bind.get_scroll_base_scale.call(this._handle)
    return _ret.asVector2()
  }

  fun getScrollOffset(): Vector2 {
    val _ret = __method_bind.get_scroll_offset.call(this._handle)
    return _ret.asVector2()
  }

  fun isIgnoreCameraZoom(): Boolean {
    val _ret = __method_bind.is_ignore_camera_zoom.call(this._handle)
    return _ret.asBool()
  }

  fun setIgnoreCameraZoom(ignore: Boolean) {
    val _arg = Variant.new(ignore)
    __method_bind.set_ignore_camera_zoom.call(this._handle, _arg, 1)
  }

  fun setLimitBegin(ofs: Vector2) {
    val _arg = Variant.new(ofs)
    __method_bind.set_limit_begin.call(this._handle, _arg, 1)
  }

  fun setLimitEnd(ofs: Vector2) {
    val _arg = Variant.new(ofs)
    __method_bind.set_limit_end.call(this._handle, _arg, 1)
  }

  fun setScrollBaseOffset(ofs: Vector2) {
    val _arg = Variant.new(ofs)
    __method_bind.set_scroll_base_offset.call(this._handle, _arg, 1)
  }

  fun setScrollBaseScale(scale: Vector2) {
    val _arg = Variant.new(scale)
    __method_bind.set_scroll_base_scale.call(this._handle, _arg, 1)
  }

  fun setScrollOffset(ofs: Vector2) {
    val _arg = Variant.new(ofs)
    __method_bind.set_scroll_offset.call(this._handle, _arg, 1)
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
      val get_limit_begin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_limit_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_limit_begin" }
        }
      val get_limit_end: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_limit_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_limit_end" }
        }
      val get_scroll_base_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_scroll_base_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll_base_offset" }
        }
      val get_scroll_base_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_scroll_base_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll_base_scale" }
        }
      val get_scroll_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "get_scroll_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll_offset" }
        }
      val is_ignore_camera_zoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "is_ignore_camera_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ignore_camera_zoom" }
        }
      val set_ignore_camera_zoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_ignore_camera_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ignore_camera_zoom" }
        }
      val set_limit_begin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_limit_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_limit_begin" }
        }
      val set_limit_end: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_limit_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_limit_end" }
        }
      val set_scroll_base_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_scroll_base_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scroll_base_offset" }
        }
      val set_scroll_base_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_scroll_base_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scroll_base_scale" }
        }
      val set_scroll_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "set_scroll_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scroll_offset" }
        }}
  }
}
