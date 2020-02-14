// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.AABB
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class GIProbeData(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for bounds
   */
  fun bounds(cb: AABB.() -> Unit) {
    val _p = bounds
    cb(_p)
    bounds = _p
  }

  /**
   * Specialized setter for dynamicData
   */
  fun dynamicData(cb: PoolIntArray.() -> Unit) {
    val _p = dynamicData
    cb(_p)
    dynamicData = _p
  }

  /**
   * Specialized setter for toCellXform
   */
  fun toCellXform(cb: Transform.() -> Unit) {
    val _p = toCellXform
    cb(_p)
    toCellXform = _p
  }

  fun getBias(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBias.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getBounds(): AABB {
    val self = this
    return Allocator.allocationScope {
      val _ret = AABB()
      val _retPtr = _ret._value.ptr
      __method_bind.getBounds.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCellSize(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCellSize.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDynamicData(): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getDynamicData.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getDynamicRange(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDynamicRange.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getEnergy(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEnergy.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getNormalBias(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNormalBias.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPropagation(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPropagation.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getToCellXform(): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getToCellXform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isCompressed(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCompressed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isInterior(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isInterior.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setBias(bias: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBias.call(self._handle, listOf(bias), null)
    }
  }

  fun setBounds(bounds: AABB) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBounds.call(self._handle, listOf(bounds), null)
    }
  }

  fun setCellSize(cellSize: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCellSize.call(self._handle, listOf(cellSize), null)
    }
  }

  fun setCompress(compress: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCompress.call(self._handle, listOf(compress), null)
    }
  }

  fun setDynamicData(dynamicData: PoolIntArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDynamicData.call(self._handle, listOf(dynamicData), null)
    }
  }

  fun setDynamicRange(dynamicRange: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDynamicRange.call(self._handle, listOf(dynamicRange), null)
    }
  }

  fun setEnergy(energy: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnergy.call(self._handle, listOf(energy), null)
    }
  }

  fun setInterior(interior: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInterior.call(self._handle, listOf(interior), null)
    }
  }

  fun setNormalBias(bias: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNormalBias.call(self._handle, listOf(bias), null)
    }
  }

  fun setPropagation(propagation: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPropagation.call(self._handle, listOf(propagation), null)
    }
  }

  fun setToCellXform(toCellXform: Transform) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setToCellXform.call(self._handle, listOf(toCellXform), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GIProbeData".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GIProbeData" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for GIProbeData
     */
    private object __method_bind {
      val getBias: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "get_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bias" }
        }
      val getBounds: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "get_bounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bounds" }
        }
      val getCellSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "get_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_size" }
        }
      val getDynamicData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "get_dynamic_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dynamic_data" }
        }
      val getDynamicRange: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "get_dynamic_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dynamic_range" }
        }
      val getEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "get_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_energy" }
        }
      val getNormalBias: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "get_normal_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_normal_bias" }
        }
      val getPropagation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "get_propagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_propagation" }
        }
      val getToCellXform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "get_to_cell_xform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_to_cell_xform" }
        }
      val isCompressed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "is_compressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_compressed" }
        }
      val isInterior: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "is_interior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_interior" }
        }
      val setBias: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "set_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bias" }
        }
      val setBounds: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "set_bounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bounds" }
        }
      val setCellSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "set_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_size" }
        }
      val setCompress: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "set_compress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_compress" }
        }
      val setDynamicData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "set_dynamic_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dynamic_data" }
        }
      val setDynamicRange: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "set_dynamic_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dynamic_range" }
        }
      val setEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "set_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_energy" }
        }
      val setInterior: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "set_interior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_interior" }
        }
      val setNormalBias: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "set_normal_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normal_bias" }
        }
      val setPropagation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "set_propagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_propagation" }
        }
      val setToCellXform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbeData".cstr.ptr,
            "set_to_cell_xform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_to_cell_xform" }
        }}
  }
}
