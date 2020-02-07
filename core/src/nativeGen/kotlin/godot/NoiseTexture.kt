// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NoiseTexture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Texture(null) {
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

  constructor() : this(null) {
    _handle = __new()
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
    val _arg = Variant(asNormalmap)
    __method_bind.setAsNormalmap.call(this._handle, listOf(_arg))
  }

  fun setBumpStrength(bumpStrength: Float) {
    val _arg = Variant(bumpStrength)
    __method_bind.setBumpStrength.call(this._handle, listOf(_arg))
  }

  fun setHeight(height: Int) {
    val _arg = Variant(height)
    __method_bind.setHeight.call(this._handle, listOf(_arg))
  }

  fun setNoise(noise: OpenSimplexNoise) {
    val _arg = Variant(noise)
    __method_bind.setNoise.call(this._handle, listOf(_arg))
  }

  fun setSeamless(seamless: Boolean) {
    val _arg = Variant(seamless)
    __method_bind.setSeamless.call(this._handle, listOf(_arg))
  }

  fun setWidth(width: Int) {
    val _arg = Variant(width)
    __method_bind.setWidth.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("NoiseTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NoiseTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for NoiseTexture
     */
    private object __method_bind {
      val getBumpStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "get_bump_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bump_strength" }
        }
      val getNoise: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "get_noise".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_noise" }
        }
      val getSeamless: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "get_seamless".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_seamless" }
        }
      val isNormalmap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "is_normalmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_normalmap" }
        }
      val setAsNormalmap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_as_normalmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_normalmap" }
        }
      val setBumpStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_bump_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bump_strength" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_height" }
        }
      val setNoise: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_noise".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_noise" }
        }
      val setSeamless: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_seamless".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_seamless" }
        }
      val setWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_width" }
        }}
  }
}
