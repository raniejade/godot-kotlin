// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
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
    val _ret = __method_bind.get_frame.call(this.toVariant())
    TODO()
  }

  fun getHframes(): Int {
    val _ret = __method_bind.get_hframes.call(this.toVariant())
    TODO()
  }

  fun getNormalMap(): Texture {
    val _ret = __method_bind.get_normal_map.call(this.toVariant())
    TODO()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.get_offset.call(this.toVariant())
    TODO()
  }

  fun getRect(): Rect2 {
    val _ret = __method_bind.get_rect.call(this.toVariant())
    TODO()
  }

  fun getRegionRect(): Rect2 {
    val _ret = __method_bind.get_region_rect.call(this.toVariant())
    TODO()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.get_texture.call(this.toVariant())
    TODO()
  }

  fun getVframes(): Int {
    val _ret = __method_bind.get_vframes.call(this.toVariant())
    TODO()
  }

  fun isCentered(): Boolean {
    val _ret = __method_bind.is_centered.call(this.toVariant())
    TODO()
  }

  fun isFlippedH(): Boolean {
    val _ret = __method_bind.is_flipped_h.call(this.toVariant())
    TODO()
  }

  fun isFlippedV(): Boolean {
    val _ret = __method_bind.is_flipped_v.call(this.toVariant())
    TODO()
  }

  fun isPixelOpaque(pos: Vector2): Boolean {
    val _args = VariantArray.new()
    _args.append(pos)
    val _ret = __method_bind.is_pixel_opaque.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isRegion(): Boolean {
    val _ret = __method_bind.is_region.call(this.toVariant())
    TODO()
  }

  fun isRegionFilterClipEnabled(): Boolean {
    val _ret = __method_bind.is_region_filter_clip_enabled.call(this.toVariant())
    TODO()
  }

  fun setCentered(centered: Boolean) {
    val _args = VariantArray.new()
    _args.append(centered)
    val _ret = __method_bind.set_centered.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setFlipH(flipH: Boolean) {
    val _args = VariantArray.new()
    _args.append(flipH)
    val _ret = __method_bind.set_flip_h.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setFlipV(flipV: Boolean) {
    val _args = VariantArray.new()
    _args.append(flipV)
    val _ret = __method_bind.set_flip_v.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setFrame(frame: Int) {
    val _args = VariantArray.new()
    _args.append(frame)
    val _ret = __method_bind.set_frame.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setHframes(hframes: Int) {
    val _args = VariantArray.new()
    _args.append(hframes)
    val _ret = __method_bind.set_hframes.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setNormalMap(normalMap: Texture) {
    val _args = VariantArray.new()
    _args.append(normalMap)
    val _ret = __method_bind.set_normal_map.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setOffset(offset: Vector2) {
    val _args = VariantArray.new()
    _args.append(offset)
    val _ret = __method_bind.set_offset.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRegion(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_region.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRegionFilterClip(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_region_filter_clip.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRegionRect(rect: Rect2) {
    val _args = VariantArray.new()
    _args.append(rect)
    val _ret = __method_bind.set_region_rect.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTexture(texture: Texture) {
    val _args = VariantArray.new()
    _args.append(texture)
    val _ret = __method_bind.set_texture.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setVframes(vframes: Int) {
    val _args = VariantArray.new()
    _args.append(vframes)
    val _ret = __method_bind.set_vframes.call(this.toVariant(), _args.toVariant(), 1)
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
    fun from(ptr: COpaquePointer): Sprite = Sprite(ptr)
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
