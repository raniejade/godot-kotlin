// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.Transform
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

open class GIProbeData internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getBias(): Float {
    TODO()
  }

  fun getBounds(): AABB {
    TODO()
  }

  fun getCellSize(): Float {
    TODO()
  }

  fun getDynamicData(): PoolIntArray {
    TODO()
  }

  fun getDynamicRange(): Int {
    TODO()
  }

  fun getEnergy(): Float {
    TODO()
  }

  fun getNormalBias(): Float {
    TODO()
  }

  fun getPropagation(): Float {
    TODO()
  }

  fun getToCellXform(): Transform {
    TODO()
  }

  fun isCompressed(): Boolean {
    TODO()
  }

  fun isInterior(): Boolean {
    TODO()
  }

  fun setBias(bias: Float) {
    TODO()
  }

  fun setBounds(bounds: AABB) {
    TODO()
  }

  fun setCellSize(cell_size: Float) {
    TODO()
  }

  fun setCompress(compress: Boolean) {
    TODO()
  }

  fun setDynamicData(dynamic_data: PoolIntArray) {
    TODO()
  }

  fun setDynamicRange(dynamic_range: Int) {
    TODO()
  }

  fun setEnergy(energy: Float) {
    TODO()
  }

  fun setInterior(interior: Boolean) {
    TODO()
  }

  fun setNormalBias(bias: Float) {
    TODO()
  }

  fun setPropagation(propagation: Float) {
    TODO()
  }

  fun setToCellXform(to_cell_xform: Transform) {
    TODO()
  }

  companion object {
    fun new(): GIProbeData = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GIProbeData".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton GIProbeData" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GIProbeData(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for GIProbeData
     */
    private object __method_bind {
      val get_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "get_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bias" }
            }
          }

      val get_bounds: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "get_bounds".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bounds" }
            }
          }

      val get_cell_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "get_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_size" }
            }
          }

      val get_dynamic_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "get_dynamic_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dynamic_data" }
            }
          }

      val get_dynamic_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "get_dynamic_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dynamic_range" }
            }
          }

      val get_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "get_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_energy" }
            }
          }

      val get_normal_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "get_normal_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normal_bias" }
            }
          }

      val get_propagation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "get_propagation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_propagation" }
            }
          }

      val get_to_cell_xform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "get_to_cell_xform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_to_cell_xform" }
            }
          }

      val is_compressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "is_compressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_compressed" }
            }
          }

      val is_interior: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "is_interior".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_interior" }
            }
          }

      val set_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "set_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bias" }
            }
          }

      val set_bounds: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "set_bounds".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bounds" }
            }
          }

      val set_cell_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "set_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cell_size" }
            }
          }

      val set_compress: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "set_compress".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_compress" }
            }
          }

      val set_dynamic_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "set_dynamic_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dynamic_data" }
            }
          }

      val set_dynamic_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "set_dynamic_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dynamic_range" }
            }
          }

      val set_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "set_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_energy" }
            }
          }

      val set_interior: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "set_interior".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_interior" }
            }
          }

      val set_normal_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "set_normal_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normal_bias" }
            }
          }

      val set_propagation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "set_propagation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_propagation" }
            }
          }

      val set_to_cell_xform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
              "set_to_cell_xform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_to_cell_xform" }
            }
          }
    }
  }
}
