// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MobileVRInterface internal constructor(
  _handle: COpaquePointer
) : ARVRInterface(_handle) {
  fun getDisplayToLens(): Float {
    TODO()
  }

  fun getDisplayWidth(): Float {
    TODO()
  }

  fun getEyeHeight(): Float {
    TODO()
  }

  fun getIod(): Float {
    TODO()
  }

  fun getK1(): Float {
    TODO()
  }

  fun getK2(): Float {
    TODO()
  }

  fun getOversample(): Float {
    TODO()
  }

  fun setDisplayToLens(display_to_lens: Float) {
    TODO()
  }

  fun setDisplayWidth(display_width: Float) {
    TODO()
  }

  fun setEyeHeight(eye_height: Float) {
    TODO()
  }

  fun setIod(iod: Float) {
    TODO()
  }

  fun setK1(k: Float) {
    TODO()
  }

  fun setK2(k: Float) {
    TODO()
  }

  fun setOversample(oversample: Float) {
    TODO()
  }

  companion object {
    fun new(): MobileVRInterface = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("MobileVRInterface".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton MobileVRInterface" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MobileVRInterface(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MobileVRInterface = MobileVRInterface(ptr)
    /**
     * Container for method_bind pointers for MobileVRInterface
     */
    private object __method_bind {
      val get_display_to_lens: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
              "get_display_to_lens".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_display_to_lens" }
            }
          }

      val get_display_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
              "get_display_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_display_width" }
            }
          }

      val get_eye_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
              "get_eye_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_eye_height" }
            }
          }

      val get_iod: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
              "get_iod".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_iod" }
            }
          }

      val get_k1: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
              "get_k1".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_k1" }
            }
          }

      val get_k2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
              "get_k2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_k2" }
            }
          }

      val get_oversample: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
              "get_oversample".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_oversample" }
            }
          }

      val set_display_to_lens: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
              "set_display_to_lens".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_display_to_lens" }
            }
          }

      val set_display_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
              "set_display_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_display_width" }
            }
          }

      val set_eye_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
              "set_eye_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_eye_height" }
            }
          }

      val set_iod: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
              "set_iod".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_iod" }
            }
          }

      val set_k1: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
              "set_k1".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_k1" }
            }
          }

      val set_k2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
              "set_k2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_k2" }
            }
          }

      val set_oversample: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
              "set_oversample".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_oversample" }
            }
          }
    }
  }
}
