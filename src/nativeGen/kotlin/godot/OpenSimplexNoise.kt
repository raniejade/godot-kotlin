// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class OpenSimplexNoise internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getImage(width: Int, height: Int): Image {
    val _args = VariantArray.new()
    _args.append(width)
    _args.append(height)
    val _ret = __method_bind.get_image.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun getLacunarity(): Float {
    val _ret = __method_bind.get_lacunarity.call(this.toVariant())
    TODO()
  }

  fun getNoise1d(x: Float): Float {
    val _args = VariantArray.new()
    _args.append(x)
    val _ret = __method_bind.get_noise_1d.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getNoise2d(x: Float, y: Float): Float {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    val _ret = __method_bind.get_noise_2d.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun getNoise2dv(pos: Vector2): Float {
    val _args = VariantArray.new()
    _args.append(pos)
    val _ret = __method_bind.get_noise_2dv.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getNoise3d(
    x: Float,
    y: Float,
    z: Float
  ): Float {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    _args.append(z)
    val _ret = __method_bind.get_noise_3d.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun getNoise3dv(pos: Vector3): Float {
    val _args = VariantArray.new()
    _args.append(pos)
    val _ret = __method_bind.get_noise_3dv.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getNoise4d(
    x: Float,
    y: Float,
    z: Float,
    w: Float
  ): Float {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    _args.append(z)
    _args.append(w)
    val _ret = __method_bind.get_noise_4d.call(this.toVariant(), _args.toVariant(), 4)
    TODO()
  }

  fun getOctaves(): Int {
    val _ret = __method_bind.get_octaves.call(this.toVariant())
    TODO()
  }

  fun getPeriod(): Float {
    val _ret = __method_bind.get_period.call(this.toVariant())
    TODO()
  }

  fun getPersistence(): Float {
    val _ret = __method_bind.get_persistence.call(this.toVariant())
    TODO()
  }

  fun getSeamlessImage(size: Int): Image {
    val _args = VariantArray.new()
    _args.append(size)
    val _ret = __method_bind.get_seamless_image.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getSeed(): Int {
    val _ret = __method_bind.get_seed.call(this.toVariant())
    TODO()
  }

  fun setLacunarity(lacunarity: Float) {
    val _args = VariantArray.new()
    _args.append(lacunarity)
    val _ret = __method_bind.set_lacunarity.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setOctaves(octaveCount: Int) {
    val _args = VariantArray.new()
    _args.append(octaveCount)
    val _ret = __method_bind.set_octaves.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPeriod(period: Float) {
    val _args = VariantArray.new()
    _args.append(period)
    val _ret = __method_bind.set_period.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPersistence(persistence: Float) {
    val _args = VariantArray.new()
    _args.append(persistence)
    val _ret = __method_bind.set_persistence.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSeed(seed: Int) {
    val _args = VariantArray.new()
    _args.append(seed)
    val _ret = __method_bind.set_seed.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): OpenSimplexNoise = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("OpenSimplexNoise".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton OpenSimplexNoise" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      OpenSimplexNoise(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): OpenSimplexNoise = OpenSimplexNoise(ptr)
    /**
     * Container for method_bind pointers for OpenSimplexNoise
     */
    private object __method_bind {
      val get_image: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_image".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_image" }
            }
          }

      val get_lacunarity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_lacunarity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lacunarity" }
            }
          }

      val get_noise_1d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_noise_1d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_noise_1d" }
            }
          }

      val get_noise_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_noise_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_noise_2d" }
            }
          }

      val get_noise_2dv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_noise_2dv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_noise_2dv" }
            }
          }

      val get_noise_3d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_noise_3d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_noise_3d" }
            }
          }

      val get_noise_3dv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_noise_3dv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_noise_3dv" }
            }
          }

      val get_noise_4d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_noise_4d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_noise_4d" }
            }
          }

      val get_octaves: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_octaves".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_octaves" }
            }
          }

      val get_period: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_period".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_period" }
            }
          }

      val get_persistence: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_persistence".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_persistence" }
            }
          }

      val get_seamless_image: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_seamless_image".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_seamless_image" }
            }
          }

      val get_seed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_seed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_seed" }
            }
          }

      val set_lacunarity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "set_lacunarity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lacunarity" }
            }
          }

      val set_octaves: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "set_octaves".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_octaves" }
            }
          }

      val set_period: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "set_period".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_period" }
            }
          }

      val set_persistence: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "set_persistence".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_persistence" }
            }
          }

      val set_seed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "set_seed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_seed" }
            }
          }
    }
  }
}
