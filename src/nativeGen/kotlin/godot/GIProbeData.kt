// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.Transform
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

open class GIProbeData internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getBias(): Float {
    val _ret = __method_bind.get_bias.call(this.toVariant())
    TODO()
  }

  fun getBounds(): AABB {
    val _ret = __method_bind.get_bounds.call(this.toVariant())
    TODO()
  }

  fun getCellSize(): Float {
    val _ret = __method_bind.get_cell_size.call(this.toVariant())
    TODO()
  }

  fun getDynamicData(): PoolIntArray {
    val _ret = __method_bind.get_dynamic_data.call(this.toVariant())
    TODO()
  }

  fun getDynamicRange(): Int {
    val _ret = __method_bind.get_dynamic_range.call(this.toVariant())
    TODO()
  }

  fun getEnergy(): Float {
    val _ret = __method_bind.get_energy.call(this.toVariant())
    TODO()
  }

  fun getNormalBias(): Float {
    val _ret = __method_bind.get_normal_bias.call(this.toVariant())
    TODO()
  }

  fun getPropagation(): Float {
    val _ret = __method_bind.get_propagation.call(this.toVariant())
    TODO()
  }

  fun getToCellXform(): Transform {
    val _ret = __method_bind.get_to_cell_xform.call(this.toVariant())
    TODO()
  }

  fun isCompressed(): Boolean {
    val _ret = __method_bind.is_compressed.call(this.toVariant())
    TODO()
  }

  fun isInterior(): Boolean {
    val _ret = __method_bind.is_interior.call(this.toVariant())
    TODO()
  }

  fun setBias(bias: Float) {
    val _args = VariantArray.new()
    _args.append(bias)
    val _ret = __method_bind.set_bias.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBounds(bounds: AABB) {
    val _args = VariantArray.new()
    _args.append(bounds)
    val _ret = __method_bind.set_bounds.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCellSize(cellSize: Float) {
    val _args = VariantArray.new()
    _args.append(cellSize)
    val _ret = __method_bind.set_cell_size.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCompress(compress: Boolean) {
    val _args = VariantArray.new()
    _args.append(compress)
    val _ret = __method_bind.set_compress.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setDynamicData(dynamicData: PoolIntArray) {
    val _args = VariantArray.new()
    _args.append(dynamicData)
    val _ret = __method_bind.set_dynamic_data.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setDynamicRange(dynamicRange: Int) {
    val _args = VariantArray.new()
    _args.append(dynamicRange)
    val _ret = __method_bind.set_dynamic_range.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEnergy(energy: Float) {
    val _args = VariantArray.new()
    _args.append(energy)
    val _ret = __method_bind.set_energy.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setInterior(interior: Boolean) {
    val _args = VariantArray.new()
    _args.append(interior)
    val _ret = __method_bind.set_interior.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setNormalBias(bias: Float) {
    val _args = VariantArray.new()
    _args.append(bias)
    val _ret = __method_bind.set_normal_bias.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPropagation(propagation: Float) {
    val _args = VariantArray.new()
    _args.append(propagation)
    val _ret = __method_bind.set_propagation.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setToCellXform(toCellXform: Transform) {
    val _args = VariantArray.new()
    _args.append(toCellXform)
    val _ret = __method_bind.set_to_cell_xform.call(this.toVariant(), _args.toVariant(), 1)
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
    fun from(ptr: COpaquePointer): GIProbeData = GIProbeData(ptr)
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
