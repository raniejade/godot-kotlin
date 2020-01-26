// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Sprite internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getFrame(): Int {
    TODO()
  }

  fun getHframes(): Int {
    TODO()
  }

  fun getNormalMap(): Texture {
    TODO()
  }

  fun getOffset(): Vector2 {
    TODO()
  }

  fun getRect(): Rect2 {
    TODO()
  }

  fun getRegionRect(): Rect2 {
    TODO()
  }

  fun getTexture(): Texture {
    TODO()
  }

  fun getVframes(): Int {
    TODO()
  }

  fun isCentered(): Boolean {
    TODO()
  }

  fun isFlippedH(): Boolean {
    TODO()
  }

  fun isFlippedV(): Boolean {
    TODO()
  }

  fun isPixelOpaque(): Boolean {
    TODO()
  }

  fun isRegion(): Boolean {
    TODO()
  }

  fun isRegionFilterClipEnabled(): Boolean {
    TODO()
  }

  fun setCentered() {
    TODO()
  }

  fun setFlipH() {
    TODO()
  }

  fun setFlipV() {
    TODO()
  }

  fun setFrame() {
    TODO()
  }

  fun setHframes() {
    TODO()
  }

  fun setNormalMap() {
    TODO()
  }

  fun setOffset() {
    TODO()
  }

  fun setRegion() {
    TODO()
  }

  fun setRegionFilterClip() {
    TODO()
  }

  fun setRegionRect() {
    TODO()
  }

  fun setTexture() {
    TODO()
  }

  fun setVframes() {
    TODO()
  }

  companion object {
    fun new(): Sprite = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Sprite".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Sprite" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Sprite(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Sprite
     */
    private object __method_bind {
      val get_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame" }
            }
          }

      val get_hframes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_hframes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hframes" }
            }
          }

      val get_normal_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normal_map" }
            }
          }

      val get_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val get_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rect" }
            }
          }

      val get_region_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_region_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_region_rect" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_vframes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_vframes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vframes" }
            }
          }

      val is_centered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "is_centered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_centered" }
            }
          }

      val is_flipped_h: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "is_flipped_h".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_flipped_h" }
            }
          }

      val is_flipped_v: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "is_flipped_v".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_flipped_v" }
            }
          }

      val is_pixel_opaque: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "is_pixel_opaque".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_pixel_opaque" }
            }
          }

      val is_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "is_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_region" }
            }
          }

      val is_region_filter_clip_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "is_region_filter_clip_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_region_filter_clip_enabled"
              }
            }
          }

      val set_centered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_centered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_centered" }
            }
          }

      val set_flip_h: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_flip_h".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flip_h" }
            }
          }

      val set_flip_v: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_flip_v".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flip_v" }
            }
          }

      val set_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frame" }
            }
          }

      val set_hframes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_hframes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hframes" }
            }
          }

      val set_normal_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normal_map" }
            }
          }

      val set_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val set_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region" }
            }
          }

      val set_region_filter_clip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_region_filter_clip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region_filter_clip" }
            }
          }

      val set_region_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_region_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region_rect" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val set_vframes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_vframes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vframes" }
            }
          }
    }
  }
}
