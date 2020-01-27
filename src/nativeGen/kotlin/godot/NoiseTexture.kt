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

open class NoiseTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  fun getBumpStrength(): Float {
    val _ret = __method_bind.get_bump_strength.call(this.toVariant())
    TODO()
  }

  fun getNoise(): OpenSimplexNoise {
    val _ret = __method_bind.get_noise.call(this.toVariant())
    TODO()
  }

  fun getSeamless(): Boolean {
    val _ret = __method_bind.get_seamless.call(this.toVariant())
    TODO()
  }

  fun isNormalmap(): Boolean {
    val _ret = __method_bind.is_normalmap.call(this.toVariant())
    TODO()
  }

  fun setAsNormalmap(asNormalmap: Boolean) {
    val _args = VariantArray.new()
    _args.append(asNormalmap)
    val _ret = __method_bind.set_as_normalmap.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBumpStrength(bumpStrength: Float) {
    val _args = VariantArray.new()
    _args.append(bumpStrength)
    val _ret = __method_bind.set_bump_strength.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setHeight(height: Int) {
    val _args = VariantArray.new()
    _args.append(height)
    val _ret = __method_bind.set_height.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setNoise(noise: OpenSimplexNoise) {
    val _args = VariantArray.new()
    _args.append(noise)
    val _ret = __method_bind.set_noise.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSeamless(seamless: Boolean) {
    val _args = VariantArray.new()
    _args.append(seamless)
    val _ret = __method_bind.set_seamless.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setWidth(width: Int) {
    val _args = VariantArray.new()
    _args.append(width)
    val _ret = __method_bind.set_width.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): NoiseTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("NoiseTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton NoiseTexture" }
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
      val get_bump_strength: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
              "get_bump_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bump_strength" }
            }
          }

      val get_noise: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
              "get_noise".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_noise" }
            }
          }

      val get_seamless: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
              "get_seamless".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_seamless" }
            }
          }

      val is_normalmap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
              "is_normalmap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_normalmap" }
            }
          }

      val set_as_normalmap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
              "set_as_normalmap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_as_normalmap" }
            }
          }

      val set_bump_strength: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
              "set_bump_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bump_strength" }
            }
          }

      val set_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
              "set_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_height" }
            }
          }

      val set_noise: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
              "set_noise".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_noise" }
            }
          }

      val set_seamless: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
              "set_seamless".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_seamless" }
            }
          }

      val set_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
              "set_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_width" }
            }
          }
    }
  }
}
