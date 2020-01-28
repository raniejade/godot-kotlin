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

open class Sprite(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getFrame(): Int {
    val _ret = __method_bind.get_frame.call(this._handle)
    return _ret.asInt()
  }

  fun getHframes(): Int {
    val _ret = __method_bind.get_hframes.call(this._handle)
    return _ret.asInt()
  }

  fun getNormalMap(): Texture {
    val _ret = __method_bind.get_normal_map.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.get_offset.call(this._handle)
    return _ret.asVector2()
  }

  fun getRect(): Rect2 {
    val _ret = __method_bind.get_rect.call(this._handle)
    return _ret.asRect2()
  }

  fun getRegionRect(): Rect2 {
    val _ret = __method_bind.get_region_rect.call(this._handle)
    return _ret.asRect2()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.get_texture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getVframes(): Int {
    val _ret = __method_bind.get_vframes.call(this._handle)
    return _ret.asInt()
  }

  fun isCentered(): Boolean {
    val _ret = __method_bind.is_centered.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFlippedH(): Boolean {
    val _ret = __method_bind.is_flipped_h.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFlippedV(): Boolean {
    val _ret = __method_bind.is_flipped_v.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPixelOpaque(pos: Vector2): Boolean {
    val _arg = Variant.new(pos)
    val _ret = __method_bind.is_pixel_opaque.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isRegion(): Boolean {
    val _ret = __method_bind.is_region.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRegionFilterClipEnabled(): Boolean {
    val _ret = __method_bind.is_region_filter_clip_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setCentered(centered: Boolean) {
    val _arg = Variant.new(centered)
    __method_bind.set_centered.call(this._handle, _arg, 1)
  }

  fun setFlipH(flipH: Boolean) {
    val _arg = Variant.new(flipH)
    __method_bind.set_flip_h.call(this._handle, _arg, 1)
  }

  fun setFlipV(flipV: Boolean) {
    val _arg = Variant.new(flipV)
    __method_bind.set_flip_v.call(this._handle, _arg, 1)
  }

  fun setFrame(frame: Int) {
    val _arg = Variant.new(frame)
    __method_bind.set_frame.call(this._handle, _arg, 1)
  }

  fun setHframes(hframes: Int) {
    val _arg = Variant.new(hframes)
    __method_bind.set_hframes.call(this._handle, _arg, 1)
  }

  fun setNormalMap(normalMap: Texture) {
    val _arg = Variant.new(normalMap)
    __method_bind.set_normal_map.call(this._handle, _arg, 1)
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.set_offset.call(this._handle, _arg, 1)
  }

  fun setRegion(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_region.call(this._handle, _arg, 1)
  }

  fun setRegionFilterClip(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_region_filter_clip.call(this._handle, _arg, 1)
  }

  fun setRegionRect(rect: Rect2) {
    val _arg = Variant.new(rect)
    __method_bind.set_region_rect.call(this._handle, _arg, 1)
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.set_texture.call(this._handle, _arg, 1)
  }

  fun setVframes(vframes: Int) {
    val _arg = Variant.new(vframes)
    __method_bind.set_vframes.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): Sprite = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Sprite".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Sprite" }
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
      val get_frame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "get_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frame" }
        }
      val get_hframes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "get_hframes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hframes" }
        }
      val get_normal_map: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "get_normal_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_normal_map" }
        }
      val get_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val get_rect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "get_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rect" }
        }
      val get_region_rect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "get_region_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_region_rect" }
        }
      val get_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val get_vframes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "get_vframes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vframes" }
        }
      val is_centered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "is_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_centered" }
        }
      val is_flipped_h: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "is_flipped_h".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flipped_h" }
        }
      val is_flipped_v: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "is_flipped_v".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flipped_v" }
        }
      val is_pixel_opaque: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "is_pixel_opaque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_pixel_opaque" }
        }
      val is_region: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "is_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_region" }
        }
      val is_region_filter_clip_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "is_region_filter_clip_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_region_filter_clip_enabled" }
        }
      val set_centered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "set_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_centered" }
        }
      val set_flip_h: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "set_flip_h".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flip_h" }
        }
      val set_flip_v: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "set_flip_v".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flip_v" }
        }
      val set_frame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "set_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frame" }
        }
      val set_hframes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "set_hframes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hframes" }
        }
      val set_normal_map: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "set_normal_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normal_map" }
        }
      val set_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val set_region: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "set_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_region" }
        }
      val set_region_filter_clip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "set_region_filter_clip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_region_filter_clip" }
        }
      val set_region_rect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "set_region_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_region_rect" }
        }
      val set_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val set_vframes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "set_vframes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vframes" }
        }}
  }
}
