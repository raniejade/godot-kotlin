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

open class AtlasTexture(
  _handle: COpaquePointer
) : Texture(_handle) {
  var atlas: Texture
    get() {
       return getAtlas() 
    }
    set(value) {
      setAtlas(value)
    }

  var filterClip: Boolean
    get() {
       return hasFilterClip() 
    }
    set(value) {
      setFilterClip(value)
    }

  var margin: Rect2
    get() {
       return getMargin() 
    }
    set(value) {
      setMargin(value)
    }

  var region: Rect2
    get() {
       return getRegion() 
    }
    set(value) {
      setRegion(value)
    }

  fun getAtlas(): Texture {
    val _ret = __method_bind.getAtlas.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getMargin(): Rect2 {
    val _ret = __method_bind.getMargin.call(this._handle)
    return _ret.asRect2()
  }

  fun getRegion(): Rect2 {
    val _ret = __method_bind.getRegion.call(this._handle)
    return _ret.asRect2()
  }

  fun hasFilterClip(): Boolean {
    val _ret = __method_bind.hasFilterClip.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAtlas(atlas: Texture) {
    val _arg = Variant.new(atlas)
    __method_bind.setAtlas.call(this._handle, _arg, 1)
  }

  fun setFilterClip(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setFilterClip.call(this._handle, _arg, 1)
  }

  fun setMargin(margin: Rect2) {
    val _arg = Variant.new(margin)
    __method_bind.setMargin.call(this._handle, _arg, 1)
  }

  fun setRegion(region: Rect2) {
    val _arg = Variant.new(region)
    __method_bind.setRegion.call(this._handle, _arg, 1)
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
      val getAtlas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "getAtlas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAtlas" }
        }
      val getMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "getMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMargin" }
        }
      val getRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "getRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRegion" }
        }
      val hasFilterClip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "hasFilterClip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasFilterClip" }
        }
      val setAtlas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "setAtlas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAtlas" }
        }
      val setFilterClip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "setFilterClip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFilterClip" }
        }
      val setMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "setMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMargin" }
        }
      val setRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "setRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRegion" }
        }}
  }
}
