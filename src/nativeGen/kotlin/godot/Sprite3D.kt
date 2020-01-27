// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Sprite3D internal constructor(
  _handle: COpaquePointer
) : SpriteBase3D(_handle) {
  fun getFrame(): Int {
    val _ret = __method_bind.get_frame.call(this.toVariant())
    return _ret.asInt()
  }

  fun getHframes(): Int {
    val _ret = __method_bind.get_hframes.call(this.toVariant())
    return _ret.asInt()
  }

  fun getRegionRect(): Rect2 {
    val _ret = __method_bind.get_region_rect.call(this.toVariant())
    return _ret.asRect2()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.get_texture.call(this.toVariant())
    return _ret.asObject(::Texture)!!
  }

  fun getVframes(): Int {
    val _ret = __method_bind.get_vframes.call(this.toVariant())
    return _ret.asInt()
  }

  fun isRegion(): Boolean {
    val _ret = __method_bind.is_region.call(this.toVariant())
    return _ret.asBool()
  }

  fun setFrame(frame: Int) {
    val _arg = Variant.new(frame)
    __method_bind.set_frame.call(this.toVariant(), _arg, 1)
  }

  fun setHframes(hframes: Int) {
    val _arg = Variant.new(hframes)
    __method_bind.set_hframes.call(this.toVariant(), _arg, 1)
  }

  fun setRegion(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_region.call(this.toVariant(), _arg, 1)
  }

  fun setRegionRect(rect: Rect2) {
    val _arg = Variant.new(rect)
    __method_bind.set_region_rect.call(this.toVariant(), _arg, 1)
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.set_texture.call(this.toVariant(), _arg, 1)
  }

  fun setVframes(vframes: Int) {
    val _arg = Variant.new(vframes)
    __method_bind.set_vframes.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): Sprite3D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Sprite3D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Sprite3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Sprite3D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Sprite3D = Sprite3D(ptr)
    /**
     * Container for method_bind pointers for Sprite3D
     */
    private object __method_bind {
      val get_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
              "get_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame" }
            }
          }

      val get_hframes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
              "get_hframes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hframes" }
            }
          }

      val get_region_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
              "get_region_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_region_rect" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_vframes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
              "get_vframes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vframes" }
            }
          }

      val is_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
              "is_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_region" }
            }
          }

      val set_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
              "set_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frame" }
            }
          }

      val set_hframes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
              "set_hframes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hframes" }
            }
          }

      val set_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
              "set_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region" }
            }
          }

      val set_region_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
              "set_region_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region_rect" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val set_vframes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
              "set_vframes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vframes" }
            }
          }
    }
  }
}
