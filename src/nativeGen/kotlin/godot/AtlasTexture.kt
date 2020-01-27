// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AtlasTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  fun getAtlas(): Texture {
    val _ret = __method_bind.get_atlas.call(this.toVariant())
    return _ret.asObject(::Texture)!!
  }

  fun getMargin(): Rect2 {
    val _ret = __method_bind.get_margin.call(this.toVariant())
    return _ret.asRect2()
  }

  fun getRegion(): Rect2 {
    val _ret = __method_bind.get_region.call(this.toVariant())
    return _ret.asRect2()
  }

  fun hasFilterClip(): Boolean {
    val _ret = __method_bind.has_filter_clip.call(this.toVariant())
    return _ret.asBool()
  }

  fun setAtlas(atlas: Texture) {
    val _arg = Variant.new(atlas)
    __method_bind.set_atlas.call(this.toVariant(), _arg, 1)
  }

  fun setFilterClip(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_filter_clip.call(this.toVariant(), _arg, 1)
  }

  fun setMargin(margin: Rect2) {
    val _arg = Variant.new(margin)
    __method_bind.set_margin.call(this.toVariant(), _arg, 1)
  }

  fun setRegion(region: Rect2) {
    val _arg = Variant.new(region)
    __method_bind.set_region.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): AtlasTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AtlasTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AtlasTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AtlasTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AtlasTexture = AtlasTexture(ptr)
    /**
     * Container for method_bind pointers for AtlasTexture
     */
    private object __method_bind {
      val get_atlas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "get_atlas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_atlas" }
            }
          }

      val get_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "get_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_margin" }
            }
          }

      val get_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "get_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_region" }
            }
          }

      val has_filter_clip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "has_filter_clip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_filter_clip" }
            }
          }

      val set_atlas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "set_atlas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_atlas" }
            }
          }

      val set_filter_clip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "set_filter_clip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_filter_clip" }
            }
          }

      val set_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "set_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_margin" }
            }
          }

      val set_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "set_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region" }
            }
          }
    }
  }
}
