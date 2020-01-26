// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
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
    TODO()
  }

  fun getNoise(): OpenSimplexNoise {
    TODO()
  }

  fun getSeamless(): Boolean {
    TODO()
  }

  fun isNormalmap(): Boolean {
    TODO()
  }

  fun setAsNormalmap() {
    TODO()
  }

  fun setBumpStrength() {
    TODO()
  }

  fun setHeight() {
    TODO()
  }

  fun setNoise() {
    TODO()
  }

  fun setSeamless() {
    TODO()
  }

  fun setWidth() {
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
