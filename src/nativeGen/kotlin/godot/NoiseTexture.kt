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
  fun getBumpStrength(): Float {
    val _ret = __method_bind.get_bump_strength.call(this._handle)
    return _ret.asFloat()
  }

  fun getNoise(): OpenSimplexNoise {
    val _ret = __method_bind.get_noise.call(this._handle)
    return _ret.asObject(::OpenSimplexNoise)!!
  }

  fun getSeamless(): Boolean {
    val _ret = __method_bind.get_seamless.call(this._handle)
    return _ret.asBoolean()
  }

  fun isNormalmap(): Boolean {
    val _ret = __method_bind.is_normalmap.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAsNormalmap(asNormalmap: Boolean) {
    val _arg = Variant.new(asNormalmap)
    __method_bind.set_as_normalmap.call(this._handle, _arg, 1)
  }

  fun setBumpStrength(bumpStrength: Float) {
    val _arg = Variant.new(bumpStrength)
    __method_bind.set_bump_strength.call(this._handle, _arg, 1)
  }

  fun setHeight(height: Int) {
    val _arg = Variant.new(height)
    __method_bind.set_height.call(this._handle, _arg, 1)
  }

  fun setNoise(noise: OpenSimplexNoise) {
    val _arg = Variant.new(noise)
    __method_bind.set_noise.call(this._handle, _arg, 1)
  }

  fun setSeamless(seamless: Boolean) {
    val _arg = Variant.new(seamless)
    __method_bind.set_seamless.call(this._handle, _arg, 1)
  }

  fun setWidth(width: Int) {
    val _arg = Variant.new(width)
    __method_bind.set_width.call(this._handle, _arg, 1)
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
      val get_bump_strength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "get_bump_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bump_strength" }
        }
      val get_noise: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "get_noise".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_noise" }
        }
      val get_seamless: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "get_seamless".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_seamless" }
        }
      val is_normalmap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "is_normalmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_normalmap" }
        }
      val set_as_normalmap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_as_normalmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_normalmap" }
        }
      val set_bump_strength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_bump_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bump_strength" }
        }
      val set_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_height" }
        }
      val set_noise: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_noise".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_noise" }
        }
      val set_seamless: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_seamless".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_seamless" }
        }
      val set_width: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_width" }
        }}
  }
}
