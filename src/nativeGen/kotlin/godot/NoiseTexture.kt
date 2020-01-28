// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NoiseTexture(
  _handle: COpaquePointer
) : Texture(_handle) {
  var asNormalmap: Boolean
    get() {
       return isNormalmap() 
    }
    set(value) {
      setAsNormalmap(value)
    }

  var bumpStrength: Float
    get() {
       return getBumpStrength() 
    }
    set(value) {
      setBumpStrength(value)
    }

  var height: Int
    get() {
       return getHeight() 
    }
    set(value) {
      setHeight(value)
    }

  var noise: OpenSimplexNoise
    get() {
       return getNoise() 
    }
    set(value) {
      setNoise(value)
    }

  var seamless: Boolean
    get() {
       return getSeamless() 
    }
    set(value) {
      setSeamless(value)
    }

  var width: Int
    get() {
       return getWidth() 
    }
    set(value) {
      setWidth(value)
    }

  fun getBumpStrength(): Float {
    val _ret = __method_bind.getBumpStrength.call(this._handle)
    return _ret.asFloat()
  }

  fun getNoise(): OpenSimplexNoise {
    val _ret = __method_bind.getNoise.call(this._handle)
    return _ret.asObject(::OpenSimplexNoise)!!
  }

  fun getSeamless(): Boolean {
    val _ret = __method_bind.getSeamless.call(this._handle)
    return _ret.asBoolean()
  }

  fun isNormalmap(): Boolean {
    val _ret = __method_bind.isNormalmap.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAsNormalmap(asNormalmap: Boolean) {
    val _arg = Variant.new(asNormalmap)
    __method_bind.setAsNormalmap.call(this._handle, _arg, 1)
  }

  fun setBumpStrength(bumpStrength: Float) {
    val _arg = Variant.new(bumpStrength)
    __method_bind.setBumpStrength.call(this._handle, _arg, 1)
  }

  fun setHeight(height: Int) {
    val _arg = Variant.new(height)
    __method_bind.setHeight.call(this._handle, _arg, 1)
  }

  fun setNoise(noise: OpenSimplexNoise) {
    val _arg = Variant.new(noise)
    __method_bind.setNoise.call(this._handle, _arg, 1)
  }

  fun setSeamless(seamless: Boolean) {
    val _arg = Variant.new(seamless)
    __method_bind.setSeamless.call(this._handle, _arg, 1)
  }

  fun setWidth(width: Int) {
    val _arg = Variant.new(width)
    __method_bind.setWidth.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): NoiseTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("NoiseTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NoiseTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NoiseTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): NoiseTexture = NoiseTexture(ptr)
    /**
     * Container for method_bind pointers for NoiseTexture
     */
    private object __method_bind {
      val getBumpStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "getBumpStrength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBumpStrength" }
        }
      val getNoise: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "getNoise".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNoise" }
        }
      val getSeamless: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "getSeamless".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSeamless" }
        }
      val isNormalmap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "isNormalmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isNormalmap" }
        }
      val setAsNormalmap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "setAsNormalmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAsNormalmap" }
        }
      val setBumpStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "setBumpStrength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBumpStrength" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "setHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHeight" }
        }
      val setNoise: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "setNoise".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNoise" }
        }
      val setSeamless: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "setSeamless".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSeamless" }
        }
      val setWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "setWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWidth" }
        }}
  }
}
