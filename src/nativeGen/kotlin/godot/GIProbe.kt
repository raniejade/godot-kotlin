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

open class GIProbe(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
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

  var subdiv: Int
    get() {
       return GIProbe.Subdiv.from(getSubdiv()) 
    }
    set(value) {
      setSubdiv(GIProbe.Subdiv.from(value))
    }

  fun bake(fromNode: Node, createVisualDebug: Boolean) {
    val _args = VariantArray.new()
    _args.append(fromNode)
    _args.append(createVisualDebug)
    __method_bind.bake.call(this._handle, _args.toVariant(), 2)
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
    return _ret.asObject(::GIProbeData)!!
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
    val _arg = Variant.new(max)
    __method_bind.setBias.call(this._handle, _arg, 1)
  }

  fun setCompress(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCompress.call(this._handle, _arg, 1)
  }

  fun setDynamicRange(max: Int) {
    val _arg = Variant.new(max)
    __method_bind.setDynamicRange.call(this._handle, _arg, 1)
  }

  fun setEnergy(max: Float) {
    val _arg = Variant.new(max)
    __method_bind.setEnergy.call(this._handle, _arg, 1)
  }

  fun setExtents(extents: Vector3) {
    val _arg = Variant.new(extents)
    __method_bind.setExtents.call(this._handle, _arg, 1)
  }

  fun setInterior(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setInterior.call(this._handle, _arg, 1)
  }

  fun setNormalBias(max: Float) {
    val _arg = Variant.new(max)
    __method_bind.setNormalBias.call(this._handle, _arg, 1)
  }

  fun setProbeData(data: GIProbeData) {
    val _arg = Variant.new(data)
    __method_bind.setProbeData.call(this._handle, _arg, 1)
  }

  fun setPropagation(max: Float) {
    val _arg = Variant.new(max)
    __method_bind.setPropagation.call(this._handle, _arg, 1)
  }

  fun setSubdiv(subdiv: Int) {
    val _arg = Variant.new(subdiv)
    __method_bind.setSubdiv.call(this._handle, _arg, 1)
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
      val bake: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "bake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bake" }
        }
      val debugBake: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "debugBake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method debugBake" }
        }
      val getBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "getBias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBias" }
        }
      val getDynamicRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "getDynamicRange".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDynamicRange" }
        }
      val getEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "getEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEnergy" }
        }
      val getExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "getExtents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExtents" }
        }
      val getNormalBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "getNormalBias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNormalBias" }
        }
      val getProbeData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "getProbeData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProbeData" }
        }
      val getPropagation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "getPropagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPropagation" }
        }
      val getSubdiv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "getSubdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSubdiv" }
        }
      val isCompressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "isCompressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCompressed" }
        }
      val isInterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "isInterior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isInterior" }
        }
      val setBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "setBias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBias" }
        }
      val setCompress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "setCompress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCompress" }
        }
      val setDynamicRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "setDynamicRange".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDynamicRange" }
        }
      val setEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "setEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEnergy" }
        }
      val setExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "setExtents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExtents" }
        }
      val setInterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "setInterior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInterior" }
        }
      val setNormalBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "setNormalBias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNormalBias" }
        }
      val setProbeData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "setProbeData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProbeData" }
        }
      val setPropagation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "setPropagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPropagation" }
        }
      val setSubdiv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "setSubdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSubdiv" }
        }}
  }
}
