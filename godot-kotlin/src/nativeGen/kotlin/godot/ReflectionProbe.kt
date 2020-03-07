// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
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

open class ReflectionProbe(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualInstance(null) {
  var boxProjection: Boolean
    get() {
       return isBoxProjectionEnabled() 
    }
    set(value) {
      setEnableBoxProjection(value)
    }

  var cullMask: Int
    get() {
       return getCullMask() 
    }
    set(value) {
      setCullMask(value)
    }

  var enableShadows: Boolean
    get() {
       return areShadowsEnabled() 
    }
    set(value) {
      setEnableShadows(value)
    }

  var extents: Vector3
    get() {
       return getExtents() 
    }
    set(value) {
      setExtents(value)
    }

  var intensity: Float
    get() {
       return getIntensity() 
    }
    set(value) {
      setIntensity(value)
    }

  var interiorAmbientColor: Color
    get() {
       return getInteriorAmbient() 
    }
    set(value) {
      setInteriorAmbient(value)
    }

  var interiorAmbientContrib: Float
    get() {
       return getInteriorAmbientProbeContribution() 
    }
    set(value) {
      setInteriorAmbientProbeContribution(value)
    }

  var interiorAmbientEnergy: Float
    get() {
       return getInteriorAmbientEnergy() 
    }
    set(value) {
      setInteriorAmbientEnergy(value)
    }

  var interiorEnable: Boolean
    get() {
       return isSetAsInterior() 
    }
    set(value) {
      setAsInterior(value)
    }

  var maxDistance: Float
    get() {
       return getMaxDistance() 
    }
    set(value) {
      setMaxDistance(value)
    }

  var originOffset: Vector3
    get() {
       return getOriginOffset() 
    }
    set(value) {
      setOriginOffset(value)
    }

  var updateMode: UpdateMode
    get() {
       return getUpdateMode() 
    }
    set(value) {
      setUpdateMode(value.value)
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

  /**
   * Specialized setter for interiorAmbientColor
   */
  fun interiorAmbientColor(cb: Color.() -> Unit) {
    val _p = interiorAmbientColor
    cb(_p)
    interiorAmbientColor = _p
  }

  /**
   * Specialized setter for originOffset
   */
  fun originOffset(cb: Vector3.() -> Unit) {
    val _p = originOffset
    cb(_p)
    originOffset = _p
  }

  fun areShadowsEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.areShadowsEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCullMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCullMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
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

  fun getIntensity(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getIntensity.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getInteriorAmbient(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getInteriorAmbient.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getInteriorAmbientEnergy(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInteriorAmbientEnergy.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getInteriorAmbientProbeContribution(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInteriorAmbientProbeContribution.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMaxDistance(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMaxDistance.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getOriginOffset(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getOriginOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUpdateMode(): UpdateMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUpdateMode.call(self._handle, emptyList(), _retPtr)
      ReflectionProbe.UpdateMode.from(_ret.value)
    }
  }

  fun isBoxProjectionEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isBoxProjectionEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSetAsInterior(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSetAsInterior.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAsInterior(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAsInterior.call(self._handle, listOf(enable), null)
    }
  }

  fun setCullMask(layers: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCullMask.call(self._handle, listOf(layers), null)
    }
  }

  fun setEnableBoxProjection(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnableBoxProjection.call(self._handle, listOf(enable), null)
    }
  }

  fun setEnableShadows(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnableShadows.call(self._handle, listOf(enable), null)
    }
  }

  fun setExtents(extents: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExtents.call(self._handle, listOf(extents), null)
    }
  }

  fun setIntensity(intensity: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setIntensity.call(self._handle, listOf(intensity), null)
    }
  }

  fun setInteriorAmbient(ambient: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInteriorAmbient.call(self._handle, listOf(ambient), null)
    }
  }

  fun setInteriorAmbientEnergy(ambientEnergy: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInteriorAmbientEnergy.call(self._handle, listOf(ambientEnergy), null)
    }
  }

  fun setInteriorAmbientProbeContribution(ambientProbeContribution: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInteriorAmbientProbeContribution.call(self._handle,
          listOf(ambientProbeContribution), null)
    }
  }

  fun setMaxDistance(maxDistance: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaxDistance.call(self._handle, listOf(maxDistance), null)
    }
  }

  fun setOriginOffset(originOffset: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOriginOffset.call(self._handle, listOf(originOffset), null)
    }
  }

  fun setUpdateMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUpdateMode.call(self._handle, listOf(mode), null)
    }
  }

  enum class UpdateMode(
    val value: Int
  ) {
    ONCE(0),

    ALWAYS(1);

    companion object {
      fun from(value: Int): UpdateMode {
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
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ReflectionProbe".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ReflectionProbe" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ReflectionProbe
     */
    private object __method_bind {
      val areShadowsEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "are_shadows_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method are_shadows_enabled" }
            }
          }

      val getCullMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cull_mask" }
            }
          }

      val getExtents: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_extents" }
            }
          }

      val getIntensity: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_intensity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_intensity" }
            }
          }

      val getInteriorAmbient: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_interior_ambient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_interior_ambient" }
            }
          }

      val getInteriorAmbientEnergy: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_interior_ambient_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_interior_ambient_energy" }
            }
          }

      val getInteriorAmbientProbeContribution: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_interior_ambient_probe_contribution".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_interior_ambient_probe_contribution" }
            }
          }

      val getMaxDistance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_max_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_distance" }
            }
          }

      val getOriginOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_origin_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_origin_offset" }
            }
          }

      val getUpdateMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_update_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_mode" }
            }
          }

      val isBoxProjectionEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "is_box_projection_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_box_projection_enabled" }
            }
          }

      val isSetAsInterior: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "is_set_as_interior".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_set_as_interior" }
            }
          }

      val setAsInterior: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_as_interior".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_as_interior" }
            }
          }

      val setCullMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cull_mask" }
            }
          }

      val setEnableBoxProjection: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_enable_box_projection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enable_box_projection" }
            }
          }

      val setEnableShadows: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_enable_shadows".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enable_shadows" }
            }
          }

      val setExtents: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_extents" }
            }
          }

      val setIntensity: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_intensity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_intensity" }
            }
          }

      val setInteriorAmbient: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_interior_ambient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_interior_ambient" }
            }
          }

      val setInteriorAmbientEnergy: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_interior_ambient_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_interior_ambient_energy" }
            }
          }

      val setInteriorAmbientProbeContribution: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_interior_ambient_probe_contribution".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_interior_ambient_probe_contribution" }
            }
          }

      val setMaxDistance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_max_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_distance" }
            }
          }

      val setOriginOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_origin_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_origin_offset" }
            }
          }

      val setUpdateMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_update_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_mode" }
            }
          }
    }
  }
}
