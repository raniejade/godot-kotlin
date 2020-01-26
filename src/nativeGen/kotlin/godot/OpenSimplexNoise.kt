// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
  fun getImage(): Image {
    TODO()
  }

  fun getLacunarity(): Float {
    TODO()
  }

  fun getNoise1d(): Float {
    TODO()
  }

  fun getNoise2d(): Float {
    TODO()
  }

  fun getNoise2dv(): Float {
    TODO()
  }

  fun getNoise3d(): Float {
    TODO()
  }

  fun getNoise3dv(): Float {
    TODO()
  }

  fun getNoise4d(): Float {
    TODO()
  }

  fun getOctaves(): Int {
    TODO()
  }

  fun getPeriod(): Float {
    TODO()
  }

  fun getPersistence(): Float {
    TODO()
  }

  fun getSeamlessImage(): Image {
    TODO()
  }

  fun getSeed(): Int {
    TODO()
  }

  fun setLacunarity() {
    TODO()
  }

  fun setOctaves() {
    TODO()
  }

  fun setPeriod() {
    TODO()
  }

  fun setPersistence() {
    TODO()
  }

  fun setSeed() {
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
