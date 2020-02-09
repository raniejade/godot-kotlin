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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class GIProbe(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualInstance(null) {
  var bias: Float
    get() {
       return getBias() 
    }
    set(value) {
      setBias(value)
    }

  var compress: Boolean
    get() {
       return isCompressed() 
    }
    set(value) {
      setCompress(value)
    }

  var data: GIProbeData
    get() {
       return getProbeData() 
    }
    set(value) {
      setProbeData(value)
    }

  var dynamicRange: Int
    get() {
       return getDynamicRange() 
    }
    set(value) {
      setDynamicRange(value)
    }

  var energy: Float
    get() {
       return getEnergy() 
    }
    set(value) {
      setEnergy(value)
    }

  var extents: Vector3
    get() {
       return getExtents() 
    }
    set(value) {
      setExtents(value)
    }

  var interior: Boolean
    get() {
       return isInterior() 
    }
    set(value) {
      setInterior(value)
    }

  var normalBias: Float
    get() {
       return getNormalBias() 
    }
    set(value) {
      setNormalBias(value)
    }

  var propagation: Float
    get() {
       return getPropagation() 
    }
    set(value) {
      setPropagation(value)
    }

  var subdiv: Subdiv
    get() {
       return getSubdiv() 
    }
    set(value) {
      setSubdiv(value.value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for extents
   */
  fun extents(cb: Vector3.() -> Unit) {
    val _p = extents
    cb(_p)
    extents = _p
  }

  fun bake(fromNode: Node, createVisualDebug: Boolean = false) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(fromNode))
    _args.add(Variant.fromAny(createVisualDebug))
    __method_bind.bake.call(this._handle, _args)
  }

  fun debugBake() {
    __method_bind.debugBake.call(this._handle)
  }

  fun getBias(): Float {
    val _ret = __method_bind.getBias.call(this._handle)
    return _ret.asFloat()
  }

  fun getDynamicRange(): Int {
    val _ret = __method_bind.getDynamicRange.call(this._handle)
    return _ret.asInt()
  }

  fun getEnergy(): Float {
    val _ret = __method_bind.getEnergy.call(this._handle)
    return _ret.asFloat()
  }

  fun getExtents(): Vector3 {
    val _ret = __method_bind.getExtents.call(this._handle)
    return _ret.asVector3()
  }

  fun getNormalBias(): Float {
    val _ret = __method_bind.getNormalBias.call(this._handle)
    return _ret.asFloat()
  }

  fun getProbeData(): GIProbeData {
    val _ret = __method_bind.getProbeData.call(this._handle)
    return _ret.toAny() as GIProbeData
  }

  fun getPropagation(): Float {
    val _ret = __method_bind.getPropagation.call(this._handle)
    return _ret.asFloat()
  }

  fun getSubdiv(): Subdiv {
    val _ret = __method_bind.getSubdiv.call(this._handle)
    return GIProbe.Subdiv.from(_ret.asInt())
  }

  fun isCompressed(): Boolean {
    val _ret = __method_bind.isCompressed.call(this._handle)
    return _ret.asBoolean()
  }

  fun isInterior(): Boolean {
    val _ret = __method_bind.isInterior.call(this._handle)
    return _ret.asBoolean()
  }

  fun setBias(max: Float) {
    val _arg = Variant(max)
    __method_bind.setBias.call(this._handle, listOf(_arg))
  }

  fun setCompress(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setCompress.call(this._handle, listOf(_arg))
  }

  fun setDynamicRange(max: Int) {
    val _arg = Variant(max)
    __method_bind.setDynamicRange.call(this._handle, listOf(_arg))
  }

  fun setEnergy(max: Float) {
    val _arg = Variant(max)
    __method_bind.setEnergy.call(this._handle, listOf(_arg))
  }

  fun setExtents(extents: Vector3) {
    val _arg = Variant(extents)
    __method_bind.setExtents.call(this._handle, listOf(_arg))
  }

  fun setInterior(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setInterior.call(this._handle, listOf(_arg))
  }

  fun setNormalBias(max: Float) {
    val _arg = Variant(max)
    __method_bind.setNormalBias.call(this._handle, listOf(_arg))
  }

  fun setProbeData(data: GIProbeData) {
    val _arg = Variant(data)
    __method_bind.setProbeData.call(this._handle, listOf(_arg))
  }

  fun setPropagation(max: Float) {
    val _arg = Variant(max)
    __method_bind.setPropagation.call(this._handle, listOf(_arg))
  }

  fun setSubdiv(subdiv: Int) {
    val _arg = Variant(subdiv)
    __method_bind.setSubdiv.call(this._handle, listOf(_arg))
  }

  enum class Subdiv(
    val value: Int
  ) {
    `64`(0),

    `128`(1),

    `256`(2),

    `512`(3),

    MAX(4);

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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GIProbe".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GIProbe" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for GIProbe
     */
    private object __method_bind {
      val bake: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "bake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bake" }
        }
      val debugBake: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "debug_bake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method debug_bake" }
        }
      val getBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bias" }
        }
      val getDynamicRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_dynamic_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dynamic_range" }
        }
      val getEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_energy" }
        }
      val getExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_extents" }
        }
      val getNormalBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_normal_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_normal_bias" }
        }
      val getProbeData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_probe_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_probe_data" }
        }
      val getPropagation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_propagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_propagation" }
        }
      val getSubdiv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_subdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdiv" }
        }
      val isCompressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "is_compressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_compressed" }
        }
      val isInterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "is_interior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_interior" }
        }
      val setBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bias" }
        }
      val setCompress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_compress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_compress" }
        }
      val setDynamicRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_dynamic_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dynamic_range" }
        }
      val setEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_energy" }
        }
      val setExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_extents" }
        }
      val setInterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_interior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_interior" }
        }
      val setNormalBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_normal_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normal_bias" }
        }
      val setProbeData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_probe_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_probe_data" }
        }
      val setPropagation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_propagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_propagation" }
        }
      val setSubdiv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_subdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_subdiv" }
        }}
  }
}
