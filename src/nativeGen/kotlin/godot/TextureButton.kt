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

open class TextureButton internal constructor(
  _handle: COpaquePointer
) : BaseButton(_handle) {
  enum class StretchMode(
    val value: Int
  ) {
    STRETCH_SCALE(0),

    STRETCH_TILE(1),

    STRETCH_KEEP(2),

    STRETCH_KEEP_CENTERED(3),

    STRETCH_KEEP_ASPECT(4),

    STRETCH_KEEP_ASPECT_CENTERED(5),

    STRETCH_KEEP_ASPECT_COVERED(6);
  }

  companion object {
    val STRETCH_KEEP: Int = 2

    val STRETCH_KEEP_ASPECT: Int = 4

    val STRETCH_KEEP_ASPECT_CENTERED: Int = 5

    val STRETCH_KEEP_ASPECT_COVERED: Int = 6

    val STRETCH_KEEP_CENTERED: Int = 3

    val STRETCH_SCALE: Int = 0

    val STRETCH_TILE: Int = 1

    fun new(): TextureButton = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton TextureButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextureButton(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for TextureButton
     */
    private object __method_bind {
      val get_click_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_click_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_click_mask" }
            }
          }

      val get_disabled_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_disabled_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_disabled_texture" }
            }
          }

      val get_expand: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_expand".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_expand" }
            }
          }

      val get_focused_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_focused_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_focused_texture" }
            }
          }

      val get_hover_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_hover_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hover_texture" }
            }
          }

      val get_normal_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_normal_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normal_texture" }
            }
          }

      val get_pressed_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_pressed_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pressed_texture" }
            }
          }

      val get_stretch_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stretch_mode" }
            }
          }

      val set_click_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_click_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_click_mask" }
            }
          }

      val set_disabled_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_disabled_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disabled_texture" }
            }
          }

      val set_expand: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_expand".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand" }
            }
          }

      val set_focused_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_focused_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_focused_texture" }
            }
          }

      val set_hover_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_hover_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hover_texture" }
            }
          }

      val set_normal_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_normal_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normal_texture" }
            }
          }

      val set_pressed_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_pressed_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pressed_texture" }
            }
          }

      val set_stretch_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stretch_mode" }
            }
          }
    }
  }
}
