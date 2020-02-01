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
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Sprite3D(
  _handle: COpaquePointer
) : SpriteBase3D(_handle) {
  var frame: Int
    get() {
       return getFrame() 
    }
    set(value) {
      setFrame(value)
    }

  var frameCoords: Vector2
    get() {
       return getFrameCoords() 
    }
    set(value) {
      setFrameCoords(value)
    }

  var hframes: Int
    get() {
       return getHframes() 
    }
    set(value) {
      setHframes(value)
    }

  var regionEnabled: Boolean
    get() {
       return isRegion() 
    }
    set(value) {
      setRegion(value)
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

  /**
   * Specialized setter for frameCoords
   */
  fun frameCoords(cb: Vector2.() -> Unit) {
    val _p = frameCoords
    cb(_p)
    frameCoords = _p
  }

  /**
   * Specialized setter for regionRect
   */
  fun regionRect(cb: Rect2.() -> Unit) {
    val _p = regionRect
    cb(_p)
    regionRect = _p
  }

  fun getFrame(): Int {
    val _ret = __method_bind.getFrame.call(this._handle)
    return _ret.asInt()
  }

  fun getFrameCoords(): Vector2 {
    val _ret = __method_bind.getFrameCoords.call(this._handle)
    return _ret.asVector2()
  }

  fun getHframes(): Int {
    val _ret = __method_bind.getHframes.call(this._handle)
    return _ret.asInt()
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

  fun isRegion(): Boolean {
    val _ret = __method_bind.isRegion.call(this._handle)
    return _ret.asBoolean()
  }

  fun setFrame(frame: Int) {
    val _arg = Variant.new(frame)
    __method_bind.setFrame.call(this._handle, listOf(_arg))
  }

  fun setFrameCoords(coords: Vector2) {
    val _arg = Variant.new(coords)
    __method_bind.setFrameCoords.call(this._handle, listOf(_arg))
  }

  fun setHframes(hframes: Int) {
    val _arg = Variant.new(hframes)
    __method_bind.setHframes.call(this._handle, listOf(_arg))
  }

  fun setRegion(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setRegion.call(this._handle, listOf(_arg))
  }

  fun setRegionRect(rect: Rect2) {
    val _arg = Variant.new(rect)
    __method_bind.setRegionRect.call(this._handle, listOf(_arg))
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, listOf(_arg))
  }

  fun setVframes(vframes: Int) {
    val _arg = Variant.new(vframes)
    __method_bind.setVframes.call(this._handle, listOf(_arg))
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
      val getFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
            "get_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frame" }
        }
      val getFrameCoords: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
            "get_frame_coords".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frame_coords" }
        }
      val getHframes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
            "get_hframes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hframes" }
        }
      val getRegionRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
            "get_region_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_region_rect" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getVframes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
            "get_vframes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vframes" }
        }
      val isRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
            "is_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_region" }
        }
      val setFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
            "set_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frame" }
        }
      val setFrameCoords: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
            "set_frame_coords".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frame_coords" }
        }
      val setHframes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
            "set_hframes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hframes" }
        }
      val setRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
            "set_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_region" }
        }
      val setRegionRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
            "set_region_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_region_rect" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val setVframes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite3D".cstr.ptr,
            "set_vframes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vframes" }
        }}
  }
}
