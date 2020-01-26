// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Vector2
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ParallaxBackground internal constructor(
  _handle: COpaquePointer
) : CanvasLayer(_handle) {
  fun getLimitBegin(): Vector2 {
    TODO()
  }

  fun getLimitEnd(): Vector2 {
    TODO()
  }

  fun getScrollBaseOffset(): Vector2 {
    TODO()
  }

  fun getScrollBaseScale(): Vector2 {
    TODO()
  }

  fun getScrollOffset(): Vector2 {
    TODO()
  }

  fun isIgnoreCameraZoom(): Boolean {
    TODO()
  }

  fun setIgnoreCameraZoom(ignore: Boolean) {
    TODO()
  }

  fun setLimitBegin(ofs: Vector2) {
    TODO()
  }

  fun setLimitEnd(ofs: Vector2) {
    TODO()
  }

  fun setScrollBaseOffset(ofs: Vector2) {
    TODO()
  }

  fun setScrollBaseScale(scale: Vector2) {
    TODO()
  }

  fun setScrollOffset(ofs: Vector2) {
    TODO()
  }

  companion object {
    fun new(): ParallaxBackground = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ParallaxBackground".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ParallaxBackground" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ParallaxBackground(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ParallaxBackground
     */
    private object __method_bind {
      val get_limit_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
              "get_limit_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_limit_begin" }
            }
          }

      val get_limit_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
              "get_limit_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_limit_end" }
            }
          }

      val get_scroll_base_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
              "get_scroll_base_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scroll_base_offset" }
            }
          }

      val get_scroll_base_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
              "get_scroll_base_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scroll_base_scale" }
            }
          }

      val get_scroll_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
              "get_scroll_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scroll_offset" }
            }
          }

      val is_ignore_camera_zoom: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
              "is_ignore_camera_zoom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_ignore_camera_zoom" }
            }
          }

      val set_ignore_camera_zoom: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
              "set_ignore_camera_zoom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ignore_camera_zoom" }
            }
          }

      val set_limit_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
              "set_limit_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_limit_begin" }
            }
          }

      val set_limit_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
              "set_limit_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_limit_end" }
            }
          }

      val set_scroll_base_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
              "set_scroll_base_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scroll_base_offset" }
            }
          }

      val set_scroll_base_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
              "set_scroll_base_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scroll_base_scale" }
            }
          }

      val set_scroll_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
              "set_scroll_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scroll_offset" }
            }
          }
    }
  }
}
