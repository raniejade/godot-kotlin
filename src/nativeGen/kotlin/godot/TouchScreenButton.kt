// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TouchScreenButton internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  enum class VisibilityMode(
    val value: Int
  ) {
    VISIBILITY_ALWAYS(0),

    VISIBILITY_TOUCHSCREEN_ONLY(1);
  }

  companion object {
    val VISIBILITY_ALWAYS: Int = 0

    val VISIBILITY_TOUCHSCREEN_ONLY: Int = 1

    fun new(): TouchScreenButton = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("TouchScreenButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton TouchScreenButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TouchScreenButton(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for TouchScreenButton
     */
    private object __method_bind {
      val _input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _input" }
            }
          }

      val get_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "get_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_action" }
            }
          }

      val get_bitmask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "get_bitmask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bitmask" }
            }
          }

      val get_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "get_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shape" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_texture_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "get_texture_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_pressed" }
            }
          }

      val get_visibility_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "get_visibility_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_visibility_mode" }
            }
          }

      val is_passby_press_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "is_passby_press_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_passby_press_enabled" }
            }
          }

      val is_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "is_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_pressed" }
            }
          }

      val is_shape_centered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "is_shape_centered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_shape_centered" }
            }
          }

      val is_shape_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "is_shape_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_shape_visible" }
            }
          }

      val set_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_action" }
            }
          }

      val set_bitmask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_bitmask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bitmask" }
            }
          }

      val set_passby_press: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_passby_press".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_passby_press" }
            }
          }

      val set_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shape" }
            }
          }

      val set_shape_centered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_shape_centered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shape_centered" }
            }
          }

      val set_shape_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_shape_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shape_visible" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val set_texture_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_texture_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_pressed" }
            }
          }

      val set_visibility_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_visibility_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_visibility_mode" }
            }
          }
    }
  }
}
