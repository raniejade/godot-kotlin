// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Vector3
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

open class GIProbe internal constructor(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  fun bake() {
    TODO()
  }

  fun debugBake() {
    TODO()
  }

  fun getBias(): Float {
    TODO()
  }

  fun getDynamicRange(): Int {
    TODO()
  }

  fun getEnergy(): Float {
    TODO()
  }

  fun getExtents(): Vector3 {
    TODO()
  }

  fun getNormalBias(): Float {
    TODO()
  }

  fun getProbeData(): GIProbeData {
    TODO()
  }

  fun getPropagation(): Float {
    TODO()
  }

  fun getSubdiv(): GIProbe.Subdiv {
    TODO()
  }

  fun isCompressed(): Boolean {
    TODO()
  }

  fun isInterior(): Boolean {
    TODO()
  }

  fun setBias() {
    TODO()
  }

  fun setCompress() {
    TODO()
  }

  fun setDynamicRange() {
    TODO()
  }

  fun setEnergy() {
    TODO()
  }

  fun setExtents() {
    TODO()
  }

  fun setInterior() {
    TODO()
  }

  fun setNormalBias() {
    TODO()
  }

  fun setProbeData() {
    TODO()
  }

  fun setPropagation() {
    TODO()
  }

  fun setSubdiv() {
    TODO()
  }

  enum class Subdiv(
    val value: Int
  ) {
    SUBDIV_64(0),

    SUBDIV_128(1),

    SUBDIV_256(2),

    SUBDIV_512(3),

    SUBDIV_MAX(4);
  }

  companion object {
    val SUBDIV_128: Int = 1

    val SUBDIV_256: Int = 2

    val SUBDIV_512: Int = 3

    val SUBDIV_64: Int = 0

    val SUBDIV_MAX: Int = 4

    fun new(): GIProbe = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GIProbe".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton GIProbe" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GIProbe(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for GIProbe
     */
    private object __method_bind {
      val bake: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "bake".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method bake" }
            }
          }

      val debug_bake: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "debug_bake".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method debug_bake" }
            }
          }

      val get_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "get_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bias" }
            }
          }

      val get_dynamic_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "get_dynamic_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dynamic_range" }
            }
          }

      val get_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "get_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_energy" }
            }
          }

      val get_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "get_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_extents" }
            }
          }

      val get_normal_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "get_normal_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normal_bias" }
            }
          }

      val get_probe_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "get_probe_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_probe_data" }
            }
          }

      val get_propagation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "get_propagation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_propagation" }
            }
          }

      val get_subdiv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "get_subdiv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_subdiv" }
            }
          }

      val is_compressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "is_compressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_compressed" }
            }
          }

      val is_interior: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "is_interior".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_interior" }
            }
          }

      val set_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "set_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bias" }
            }
          }

      val set_compress: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "set_compress".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_compress" }
            }
          }

      val set_dynamic_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "set_dynamic_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dynamic_range" }
            }
          }

      val set_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "set_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_energy" }
            }
          }

      val set_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "set_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_extents" }
            }
          }

      val set_interior: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "set_interior".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_interior" }
            }
          }

      val set_normal_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "set_normal_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normal_bias" }
            }
          }

      val set_probe_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "set_probe_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_probe_data" }
            }
          }

      val set_propagation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "set_propagation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_propagation" }
            }
          }

      val set_subdiv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
              "set_subdiv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_subdiv" }
            }
          }
    }
  }
}
