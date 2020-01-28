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
  var centered: Boolean
    get() {
       return isCentered() 
    }
    set(value) {
      setCentered(value)
    }

  var flipH: Boolean
    get() {
       return isFlippedH() 
    }
    set(value) {
      setFlipH(value)
    }

  var flipV: Boolean
    get() {
       return isFlippedV() 
    }
    set(value) {
      setFlipV(value)
    }

  var frame: Int
    get() {
       return getFrame() 
    }
    set(value) {
      setFrame(value)
    }

  var hframes: Int
    get() {
       return getHframes() 
    }
    set(value) {
      setHframes(value)
    }

  var normalMap: Texture
    get() {
       return getNormalMap() 
    }
    set(value) {
      setNormalMap(value)
    }

  var offset: Vector2
    get() {
       return getOffset() 
    }
    set(value) {
      setOffset(value)
    }

  var regionEnabled: Boolean
    get() {
       return isRegion() 
    }
    set(value) {
      setRegion(value)
    }

  var regionFilterClip: Boolean
    get() {
       return isRegionFilterClipEnabled() 
    }
    set(value) {
      setRegionFilterClip(value)
    }

  var regionRect: Rect2
    get() {
       return getRegionRect() 
    }
    set(value) {
      setRegionRect(value)
    }

  var texture: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
    }

  var vframes: Int
    get() {
       return getVframes() 
    }
    set(value) {
      setVframes(value)
    }

  fun getFrame(): Int {
    val _ret = __method_bind.getFrame.call(this._handle)
    return _ret.asInt()
  }

  fun getHframes(): Int {
    val _ret = __method_bind.getHframes.call(this._handle)
    return _ret.asInt()
  }

  fun getNormalMap(): Texture {
    val _ret = __method_bind.getNormalMap.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.getOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getRect(): Rect2 {
    val _ret = __method_bind.getRect.call(this._handle)
    return _ret.asRect2()
  }

  fun getRegionRect(): Rect2 {
    val _ret = __method_bind.getRegionRect.call(this._handle)
    return _ret.asRect2()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getVframes(): Int {
    val _ret = __method_bind.getVframes.call(this._handle)
    return _ret.asInt()
  }

  fun isCentered(): Boolean {
    val _ret = __method_bind.isCentered.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFlippedH(): Boolean {
    val _ret = __method_bind.isFlippedH.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFlippedV(): Boolean {
    val _ret = __method_bind.isFlippedV.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPixelOpaque(pos: Vector2): Boolean {
    val _arg = Variant.new(pos)
    val _ret = __method_bind.isPixelOpaque.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isRegion(): Boolean {
    val _ret = __method_bind.isRegion.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRegionFilterClipEnabled(): Boolean {
    val _ret = __method_bind.isRegionFilterClipEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setCentered(centered: Boolean) {
    val _arg = Variant.new(centered)
    __method_bind.setCentered.call(this._handle, _arg, 1)
  }

  fun setFlipH(flipH: Boolean) {
    val _arg = Variant.new(flipH)
    __method_bind.setFlipH.call(this._handle, _arg, 1)
  }

  fun setFlipV(flipV: Boolean) {
    val _arg = Variant.new(flipV)
    __method_bind.setFlipV.call(this._handle, _arg, 1)
  }

  fun setFrame(frame: Int) {
    val _arg = Variant.new(frame)
    __method_bind.setFrame.call(this._handle, _arg, 1)
  }

  fun setHframes(hframes: Int) {
    val _arg = Variant.new(hframes)
    __method_bind.setHframes.call(this._handle, _arg, 1)
  }

  fun setNormalMap(normalMap: Texture) {
    val _arg = Variant.new(normalMap)
    __method_bind.setNormalMap.call(this._handle, _arg, 1)
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.setOffset.call(this._handle, _arg, 1)
  }

  fun setRegion(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setRegion.call(this._handle, _arg, 1)
  }

  fun setRegionFilterClip(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setRegionFilterClip.call(this._handle, _arg, 1)
  }

  fun setRegionRect(rect: Rect2) {
    val _arg = Variant.new(rect)
    __method_bind.setRegionRect.call(this._handle, _arg, 1)
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, _arg, 1)
  }

  fun setVframes(vframes: Int) {
    val _arg = Variant.new(vframes)
    __method_bind.setVframes.call(this._handle, _arg, 1)
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
      val getFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "getFrame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFrame" }
        }
      val getHframes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "getHframes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHframes" }
        }
      val getNormalMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "getNormalMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNormalMap" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "getOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOffset" }
        }
      val getRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "getRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRect" }
        }
      val getRegionRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "getRegionRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRegionRect" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "getTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTexture" }
        }
      val getVframes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "getVframes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVframes" }
        }
      val isCentered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "isCentered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCentered" }
        }
      val isFlippedH: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "isFlippedH".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFlippedH" }
        }
      val isFlippedV: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "isFlippedV".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFlippedV" }
        }
      val isPixelOpaque: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "isPixelOpaque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPixelOpaque" }
        }
      val isRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "isRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRegion" }
        }
      val isRegionFilterClipEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "isRegionFilterClipEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRegionFilterClipEnabled" }
        }
      val setCentered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "setCentered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCentered" }
        }
      val setFlipH: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "setFlipH".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFlipH" }
        }
      val setFlipV: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "setFlipV".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFlipV" }
        }
      val setFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "setFrame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFrame" }
        }
      val setHframes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "setHframes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHframes" }
        }
      val setNormalMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "setNormalMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNormalMap" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "setOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOffset" }
        }
      val setRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "setRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRegion" }
        }
      val setRegionFilterClip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "setRegionFilterClip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRegionFilterClip" }
        }
      val setRegionRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "setRegionRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRegionRect" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "setTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTexture" }
        }
      val setVframes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
            "setVframes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVframes" }
        }}
  }
}
