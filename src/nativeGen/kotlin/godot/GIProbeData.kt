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

open class GIProbeData(
  _handle: COpaquePointer
) : Resource(_handle) {
  var bias: Float
    get() {
       return getBias() 
    }
    set(value) {
      setBias(value)
    }

  var bounds: AABB
    get() {
       return getBounds() 
    }
    set(value) {
      setBounds(value)
    }

  var cellSize: Float
    get() {
       return getCellSize() 
    }
    set(value) {
      setCellSize(value)
    }

  var compress: Boolean
    get() {
       return isCompressed() 
    }
    set(value) {
      setCompress(value)
    }

  var dynamicData: PoolIntArray
    get() {
       return getDynamicData() 
    }
    set(value) {
      setDynamicData(value)
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

  var toCellXform: Transform
    get() {
       return getToCellXform() 
    }
    set(value) {
      setToCellXform(value)
    }

  fun getBias(): Float {
    val _ret = __method_bind.getBias.call(this._handle)
    return _ret.asFloat()
  }

  fun getBounds(): AABB {
    val _ret = __method_bind.getBounds.call(this._handle)
    return _ret.asAABB()
  }

  fun getCellSize(): Float {
    val _ret = __method_bind.getCellSize.call(this._handle)
    return _ret.asFloat()
  }

  fun getDynamicData(): PoolIntArray {
    val _ret = __method_bind.getDynamicData.call(this._handle)
    return _ret.asPoolIntArray()
  }

  fun getDynamicRange(): Int {
    val _ret = __method_bind.getDynamicRange.call(this._handle)
    return _ret.asInt()
  }

  fun getEnergy(): Float {
    val _ret = __method_bind.getEnergy.call(this._handle)
    return _ret.asFloat()
  }

  fun getNormalBias(): Float {
    val _ret = __method_bind.getNormalBias.call(this._handle)
    return _ret.asFloat()
  }

  fun getPropagation(): Float {
    val _ret = __method_bind.getPropagation.call(this._handle)
    return _ret.asFloat()
  }

  fun getToCellXform(): Transform {
    val _ret = __method_bind.getToCellXform.call(this._handle)
    return _ret.asTransform()
  }

  fun isCompressed(): Boolean {
    val _ret = __method_bind.isCompressed.call(this._handle)
    return _ret.asBoolean()
  }

  fun isInterior(): Boolean {
    val _ret = __method_bind.isInterior.call(this._handle)
    return _ret.asBoolean()
  }

  fun setBias(bias: Float) {
    val _arg = Variant.new(bias)
    __method_bind.setBias.call(this._handle, _arg, 1)
  }

  fun setBounds(bounds: AABB) {
    val _arg = Variant.new(bounds)
    __method_bind.setBounds.call(this._handle, _arg, 1)
  }

  fun setCellSize(cellSize: Float) {
    val _arg = Variant.new(cellSize)
    __method_bind.setCellSize.call(this._handle, _arg, 1)
  }

  fun setCompress(compress: Boolean) {
    val _arg = Variant.new(compress)
    __method_bind.setCompress.call(this._handle, _arg, 1)
  }

  fun setDynamicData(dynamicData: PoolIntArray) {
    val _arg = Variant.new(dynamicData)
    __method_bind.setDynamicData.call(this._handle, _arg, 1)
  }

  fun setDynamicRange(dynamicRange: Int) {
    val _arg = Variant.new(dynamicRange)
    __method_bind.setDynamicRange.call(this._handle, _arg, 1)
  }

  fun setEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setEnergy.call(this._handle, _arg, 1)
  }

  fun setInterior(interior: Boolean) {
    val _arg = Variant.new(interior)
    __method_bind.setInterior.call(this._handle, _arg, 1)
  }

  fun setNormalBias(bias: Float) {
    val _arg = Variant.new(bias)
    __method_bind.setNormalBias.call(this._handle, _arg, 1)
  }

  fun setPropagation(propagation: Float) {
    val _arg = Variant.new(propagation)
    __method_bind.setPropagation.call(this._handle, _arg, 1)
  }

  fun setToCellXform(toCellXform: Transform) {
    val _arg = Variant.new(toCellXform)
    __method_bind.setToCellXform.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): GIProbeData = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GIProbeData".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GIProbeData" }
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
      val getBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "getBias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBias" }
        }
      val getBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "getBounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBounds" }
        }
      val getCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "getCellSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCellSize" }
        }
      val getDynamicData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "getDynamicData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDynamicData" }
        }
      val getDynamicRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "getDynamicRange".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDynamicRange" }
        }
      val getEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "getEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEnergy" }
        }
      val getNormalBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "getNormalBias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNormalBias" }
        }
      val getPropagation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "getPropagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPropagation" }
        }
      val getToCellXform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "getToCellXform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getToCellXform" }
        }
      val isCompressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "isCompressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCompressed" }
        }
      val isInterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "isInterior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isInterior" }
        }
      val setBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "setBias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBias" }
        }
      val setBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "setBounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBounds" }
        }
      val setCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "setCellSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCellSize" }
        }
      val setCompress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "setCompress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCompress" }
        }
      val setDynamicData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "setDynamicData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDynamicData" }
        }
      val setDynamicRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "setDynamicRange".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDynamicRange" }
        }
      val setEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "setEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEnergy" }
        }
      val setInterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "setInterior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInterior" }
        }
      val setNormalBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "setNormalBias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNormalBias" }
        }
      val setPropagation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "setPropagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPropagation" }
        }
      val setToCellXform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "setToCellXform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setToCellXform" }
        }}
  }
}
