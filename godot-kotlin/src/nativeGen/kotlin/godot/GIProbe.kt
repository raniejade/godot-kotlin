// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(fromNode)
      _args.add(createVisualDebug)
      __method_bind.bake.call(self._handle, _args, null)
    }
  }

  fun debugBake() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.debugBake.call(self._handle, emptyList(), null)
    }
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

  fun getExtents(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getExtents.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
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

  fun getProbeData(): GIProbeData {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: GIProbeData
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getProbeData.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<GIProbeData>(_tmp.value!!)
      _ret
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

  fun getSubdiv(): Subdiv {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSubdiv.call(self._handle, emptyList(), _retPtr)
      GIProbe.Subdiv.from(_ret.value)
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

  fun setBias(max: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBias.call(self._handle, listOf(max), null)
    }
  }

  fun setCompress(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCompress.call(self._handle, listOf(enable), null)
    }
  }

  fun setDynamicRange(max: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDynamicRange.call(self._handle, listOf(max), null)
    }
  }

  fun setEnergy(max: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnergy.call(self._handle, listOf(max), null)
    }
  }

  fun setExtents(extents: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExtents.call(self._handle, listOf(extents), null)
    }
  }

  fun setInterior(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInterior.call(self._handle, listOf(enable), null)
    }
  }

  fun setNormalBias(max: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNormalBias.call(self._handle, listOf(max), null)
    }
  }

  fun setProbeData(data: GIProbeData) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProbeData.call(self._handle, listOf(data), null)
    }
  }

  fun setPropagation(max: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPropagation.call(self._handle, listOf(max), null)
    }
  }

  fun setSubdiv(subdiv: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSubdiv.call(self._handle, listOf(subdiv), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "bake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bake" }
        }
      val debugBake: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "debug_bake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method debug_bake" }
        }
      val getBias: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bias" }
        }
      val getDynamicRange: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_dynamic_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dynamic_range" }
        }
      val getEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_energy" }
        }
      val getExtents: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_extents" }
        }
      val getNormalBias: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_normal_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_normal_bias" }
        }
      val getProbeData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_probe_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_probe_data" }
        }
      val getPropagation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_propagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_propagation" }
        }
      val getSubdiv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "get_subdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdiv" }
        }
      val isCompressed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "is_compressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_compressed" }
        }
      val isInterior: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "is_interior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_interior" }
        }
      val setBias: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bias" }
        }
      val setCompress: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_compress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_compress" }
        }
      val setDynamicRange: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_dynamic_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dynamic_range" }
        }
      val setEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_energy" }
        }
      val setExtents: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_extents" }
        }
      val setInterior: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_interior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_interior" }
        }
      val setNormalBias: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_normal_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normal_bias" }
        }
      val setProbeData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_probe_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_probe_data" }
        }
      val setPropagation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_propagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_propagation" }
        }
      val setSubdiv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GIProbe".cstr.ptr,
            "set_subdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_subdiv" }
        }}
  }
}
