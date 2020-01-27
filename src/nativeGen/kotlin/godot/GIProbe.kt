// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
  fun bake(fromNode: Node, createVisualDebug: Boolean) {
    val _args = VariantArray.new()
    _args.append(fromNode)
    _args.append(createVisualDebug)
    __method_bind.bake.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun debugBake() {
    __method_bind.debug_bake.call(this.toVariant())
  }

  fun getBias(): Float {
    val _ret = __method_bind.get_bias.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getDynamicRange(): Int {
    val _ret = __method_bind.get_dynamic_range.call(this.toVariant())
    return _ret.asInt()
  }

  fun getEnergy(): Float {
    val _ret = __method_bind.get_energy.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getExtents(): Vector3 {
    val _ret = __method_bind.get_extents.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getNormalBias(): Float {
    val _ret = __method_bind.get_normal_bias.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getProbeData(): GIProbeData {
    val _ret = __method_bind.get_probe_data.call(this.toVariant())
    return _ret.asObject(::GIProbeData)!!
  }

  fun getPropagation(): Float {
    val _ret = __method_bind.get_propagation.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSubdiv(): Subdiv {
    val _ret = __method_bind.get_subdiv.call(this.toVariant())
    return GIProbe.Subdiv.from(_ret.asInt())
  }

  fun isCompressed(): Boolean {
    val _ret = __method_bind.is_compressed.call(this.toVariant())
    return _ret.asBool()
  }

  fun isInterior(): Boolean {
    val _ret = __method_bind.is_interior.call(this.toVariant())
    return _ret.asBool()
  }

  fun setBias(max: Float) {
    val _arg = Variant.new(max)
    __method_bind.set_bias.call(this.toVariant(), _arg, 1)
  }

  fun setCompress(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_compress.call(this.toVariant(), _arg, 1)
  }

  fun setDynamicRange(max: Int) {
    val _arg = Variant.new(max)
    __method_bind.set_dynamic_range.call(this.toVariant(), _arg, 1)
  }

  fun setEnergy(max: Float) {
    val _arg = Variant.new(max)
    __method_bind.set_energy.call(this.toVariant(), _arg, 1)
  }

  fun setExtents(extents: Vector3) {
    val _arg = Variant.new(extents)
    __method_bind.set_extents.call(this.toVariant(), _arg, 1)
  }

  fun setInterior(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_interior.call(this.toVariant(), _arg, 1)
  }

  fun setNormalBias(max: Float) {
    val _arg = Variant.new(max)
    __method_bind.set_normal_bias.call(this.toVariant(), _arg, 1)
  }

  fun setProbeData(data: GIProbeData) {
    val _arg = Variant.new(data)
    __method_bind.set_probe_data.call(this.toVariant(), _arg, 1)
  }

  fun setPropagation(max: Float) {
    val _arg = Variant.new(max)
    __method_bind.set_propagation.call(this.toVariant(), _arg, 1)
  }

  fun setSubdiv(subdiv: Int) {
    val _arg = Variant.new(subdiv)
    __method_bind.set_subdiv.call(this.toVariant(), _arg, 1)
  }

  enum class Subdiv(
    val value: Int
  ) {
    SUBDIV_64(0),

    SUBDIV_128(1),

    SUBDIV_256(2),

    SUBDIV_512(3),

    SUBDIV_MAX(4);

    companion object {
      fun from(value: Int): Subdiv {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val SUBDIV_128: Int = 1

    val SUBDIV_256: Int = 2

    val SUBDIV_512: Int = 3

    val SUBDIV_64: Int = 0

    val SUBDIV_MAX: Int = 4

    fun new(): GIProbe = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GIProbe".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GIProbe" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GIProbe(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): GIProbe = GIProbe(ptr)
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
