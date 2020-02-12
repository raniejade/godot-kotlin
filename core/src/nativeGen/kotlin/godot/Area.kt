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

open class Area(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : CollisionObject(null) {
  var angularDamp: Float
    get() {
       return getAngularDamp() 
    }
    set(value) {
      setAngularDamp(value)
    }

  var audioBusName: String
    get() {
       return getAudioBus() 
    }
    set(value) {
      setAudioBus(value)
    }

  var audioBusOverride: Boolean
    get() {
       return isOverridingAudioBus() 
    }
    set(value) {
      setAudioBusOverride(value)
    }

  var collisionLayer: Int
    get() {
       return getCollisionLayer() 
    }
    set(value) {
      setCollisionLayer(value)
    }

  var collisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var gravity: Float
    get() {
       return getGravity() 
    }
    set(value) {
      setGravity(value)
    }

  var gravityDistanceScale: Float
    get() {
       return getGravityDistanceScale() 
    }
    set(value) {
      setGravityDistanceScale(value)
    }

  var gravityPoint: Boolean
    get() {
       return isGravityAPoint() 
    }
    set(value) {
      setGravityIsPoint(value)
    }

  var gravityVec: Vector3
    get() {
       return getGravityVector() 
    }
    set(value) {
      setGravityVector(value)
    }

  var linearDamp: Float
    get() {
       return getLinearDamp() 
    }
    set(value) {
      setLinearDamp(value)
    }

  var monitorable: Boolean
    get() {
       return isMonitorable() 
    }
    set(value) {
      setMonitorable(value)
    }

  var monitoring: Boolean
    get() {
       return isMonitoring() 
    }
    set(value) {
      setMonitoring(value)
    }

  var priority: Float
    get() {
       return getPriority() 
    }
    set(value) {
      setPriority(value)
    }

  var reverbBusAmount: Float
    get() {
       return getReverbAmount() 
    }
    set(value) {
      setReverbAmount(value)
    }

  var reverbBusEnable: Boolean
    get() {
       return isUsingReverbBus() 
    }
    set(value) {
      setUseReverbBus(value)
    }

  var reverbBusName: String
    get() {
       return getReverbBus() 
    }
    set(value) {
      setReverbBus(value)
    }

  var reverbBusUniformity: Float
    get() {
       return getReverbUniformity() 
    }
    set(value) {
      setReverbUniformity(value)
    }

  var spaceOverride: SpaceOverride
    get() {
       return getSpaceOverrideMode() 
    }
    set(value) {
      setSpaceOverrideMode(value.value)
    }

  /**
   * Area::area_entered signal
   */
  val signalAreaEntered: Signal1<Area> = Signal1("area_entered")

  /**
   * Area::area_exited signal
   */
  val signalAreaExited: Signal1<Area> = Signal1("area_exited")

  /**
   * Area::area_shape_entered signal
   */
  val signalAreaShapeEntered: Signal4<Int, Area, Int, Int> = Signal4("area_shape_entered")

  /**
   * Area::area_shape_exited signal
   */
  val signalAreaShapeExited: Signal4<Int, Area, Int, Int> = Signal4("area_shape_exited")

  /**
   * Area::body_entered signal
   */
  val signalBodyEntered: Signal1<Node> = Signal1("body_entered")

  /**
   * Area::body_exited signal
   */
  val signalBodyExited: Signal1<Node> = Signal1("body_exited")

  /**
   * Area::body_shape_entered signal
   */
  val signalBodyShapeEntered: Signal4<Int, Node, Int, Int> = Signal4("body_shape_entered")

  /**
   * Area::body_shape_exited signal
   */
  val signalBodyShapeExited: Signal4<Int, Node, Int, Int> = Signal4("body_shape_exited")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for gravityVec
   */
  fun gravityVec(cb: Vector3.() -> Unit) {
    val _p = gravityVec
    cb(_p)
    gravityVec = _p
  }

  fun getAngularDamp(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAngularDamp.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAudioBus(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getAudioBus.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getCollisionLayer(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionLayer.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionLayerBit.call(self._handle, listOf(bit), _retPtr)
      _ret.value
    }
  }

  fun getCollisionMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionMaskBit.call(self._handle, listOf(bit), _retPtr)
      _ret.value
    }
  }

  fun getGravity(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGravity.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGravityDistanceScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGravityDistanceScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGravityVector(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getGravityVector.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLinearDamp(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLinearDamp.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getOverlappingAreas(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getOverlappingAreas.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getOverlappingBodies(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getOverlappingBodies.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPriority(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPriority.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getReverbAmount(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getReverbAmount.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getReverbBus(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getReverbBus.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getReverbUniformity(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getReverbUniformity.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSpaceOverrideMode(): SpaceOverride {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpaceOverrideMode.call(self._handle, emptyList(), _retPtr)
      Area.SpaceOverride.from(_ret.value)
    }
  }

  fun isGravityAPoint(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isGravityAPoint.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isMonitorable(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isMonitorable.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isMonitoring(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isMonitoring.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isOverridingAudioBus(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isOverridingAudioBus.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isUsingReverbBus(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUsingReverbBus.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun overlapsArea(area: Node): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.overlapsArea.call(self._handle, listOf(area), _retPtr)
      _ret.value
    }
  }

  fun overlapsBody(body: Node): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.overlapsBody.call(self._handle, listOf(body), _retPtr)
      _ret.value
    }
  }

  fun setAngularDamp(angularDamp: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAngularDamp.call(self._handle, listOf(angularDamp), null)
    }
  }

  fun setAudioBus(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAudioBus.call(self._handle, listOf(name), null)
    }
  }

  fun setAudioBusOverride(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAudioBusOverride.call(self._handle, listOf(enable), null)
    }
  }

  fun setCollisionLayer(collisionLayer: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionLayer.call(self._handle, listOf(collisionLayer), null)
    }
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(bit)
      _args.add(value)
      __method_bind.setCollisionLayerBit.call(self._handle, _args, null)
    }
  }

  fun setCollisionMask(collisionMask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionMask.call(self._handle, listOf(collisionMask), null)
    }
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(bit)
      _args.add(value)
      __method_bind.setCollisionMaskBit.call(self._handle, _args, null)
    }
  }

  fun setGravity(gravity: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGravity.call(self._handle, listOf(gravity), null)
    }
  }

  fun setGravityDistanceScale(distanceScale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGravityDistanceScale.call(self._handle, listOf(distanceScale), null)
    }
  }

  fun setGravityIsPoint(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGravityIsPoint.call(self._handle, listOf(enable), null)
    }
  }

  fun setGravityVector(vector: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGravityVector.call(self._handle, listOf(vector), null)
    }
  }

  fun setLinearDamp(linearDamp: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLinearDamp.call(self._handle, listOf(linearDamp), null)
    }
  }

  fun setMonitorable(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMonitorable.call(self._handle, listOf(enable), null)
    }
  }

  fun setMonitoring(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMonitoring.call(self._handle, listOf(enable), null)
    }
  }

  fun setPriority(priority: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPriority.call(self._handle, listOf(priority), null)
    }
  }

  fun setReverbAmount(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setReverbAmount.call(self._handle, listOf(amount), null)
    }
  }

  fun setReverbBus(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setReverbBus.call(self._handle, listOf(name), null)
    }
  }

  fun setReverbUniformity(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setReverbUniformity.call(self._handle, listOf(amount), null)
    }
  }

  fun setSpaceOverrideMode(enable: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpaceOverrideMode.call(self._handle, listOf(enable), null)
    }
  }

  fun setUseReverbBus(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseReverbBus.call(self._handle, listOf(enable), null)
    }
  }

  enum class SpaceOverride(
    val value: Int
  ) {
    DISABLED(0),

    COMBINE(1),

    COMBINE_REPLACE(2),

    REPLACE(3),

    REPLACE_COMBINE(4);

    companion object {
      fun from(value: Int): SpaceOverride {
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Area".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Area" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Area
     */
    private object __method_bind {
      val getAngularDamp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_angular_damp" }
        }
      val getAudioBus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_audio_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_audio_bus" }
        }
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
        }
      val getCollisionLayerBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val getGravity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity" }
        }
      val getGravityDistanceScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_gravity_distance_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity_distance_scale" }
        }
      val getGravityVector: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_gravity_vector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity_vector" }
        }
      val getLinearDamp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_linear_damp" }
        }
      val getOverlappingAreas: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_overlapping_areas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_overlapping_areas" }
        }
      val getOverlappingBodies: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_overlapping_bodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_overlapping_bodies" }
        }
      val getPriority: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_priority" }
        }
      val getReverbAmount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_reverb_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_reverb_amount" }
        }
      val getReverbBus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_reverb_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_reverb_bus" }
        }
      val getReverbUniformity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_reverb_uniformity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_reverb_uniformity" }
        }
      val getSpaceOverrideMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_space_override_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_space_override_mode" }
        }
      val isGravityAPoint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_gravity_a_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_gravity_a_point" }
        }
      val isMonitorable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_monitorable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_monitorable" }
        }
      val isMonitoring: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_monitoring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_monitoring" }
        }
      val isOverridingAudioBus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_overriding_audio_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_overriding_audio_bus" }
        }
      val isUsingReverbBus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_using_reverb_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_reverb_bus" }
        }
      val overlapsArea: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "overlaps_area".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method overlaps_area" }
        }
      val overlapsBody: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "overlaps_body".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method overlaps_body" }
        }
      val setAngularDamp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_angular_damp" }
        }
      val setAudioBus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_audio_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_audio_bus" }
        }
      val setAudioBusOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_audio_bus_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_audio_bus_override" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
        }
      val setCollisionLayerBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val setGravity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity" }
        }
      val setGravityDistanceScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_gravity_distance_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_distance_scale" }
        }
      val setGravityIsPoint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_gravity_is_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_is_point" }
        }
      val setGravityVector: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_gravity_vector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_vector" }
        }
      val setLinearDamp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_linear_damp" }
        }
      val setMonitorable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_monitorable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_monitorable" }
        }
      val setMonitoring: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_monitoring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_monitoring" }
        }
      val setPriority: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_priority" }
        }
      val setReverbAmount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_reverb_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_reverb_amount" }
        }
      val setReverbBus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_reverb_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_reverb_bus" }
        }
      val setReverbUniformity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_reverb_uniformity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_reverb_uniformity" }
        }
      val setSpaceOverrideMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_space_override_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_space_override_mode" }
        }
      val setUseReverbBus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_use_reverb_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_reverb_bus" }
        }}
  }
}
