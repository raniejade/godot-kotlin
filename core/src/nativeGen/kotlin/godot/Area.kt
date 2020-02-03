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
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Area(
  _handle: COpaquePointer
) : CollisionObject(_handle) {
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

  /**
   * Specialized setter for gravityVec
   */
  fun gravityVec(cb: Vector3.() -> Unit) {
    val _p = gravityVec
    cb(_p)
    gravityVec = _p
  }

  fun getAngularDamp(): Float {
    val _ret = __method_bind.getAngularDamp.call(this._handle)
    return _ret.asFloat()
  }

  fun getAudioBus(): String {
    val _ret = __method_bind.getAudioBus.call(this._handle)
    return _ret.asString()
  }

  fun getCollisionLayer(): Int {
    val _ret = __method_bind.getCollisionLayer.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionLayerBit.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionMaskBit.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getGravity(): Float {
    val _ret = __method_bind.getGravity.call(this._handle)
    return _ret.asFloat()
  }

  fun getGravityDistanceScale(): Float {
    val _ret = __method_bind.getGravityDistanceScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getGravityVector(): Vector3 {
    val _ret = __method_bind.getGravityVector.call(this._handle)
    return _ret.asVector3()
  }

  fun getLinearDamp(): Float {
    val _ret = __method_bind.getLinearDamp.call(this._handle)
    return _ret.asFloat()
  }

  fun getOverlappingAreas(): VariantArray {
    val _ret = __method_bind.getOverlappingAreas.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getOverlappingBodies(): VariantArray {
    val _ret = __method_bind.getOverlappingBodies.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getPriority(): Float {
    val _ret = __method_bind.getPriority.call(this._handle)
    return _ret.asFloat()
  }

  fun getReverbAmount(): Float {
    val _ret = __method_bind.getReverbAmount.call(this._handle)
    return _ret.asFloat()
  }

  fun getReverbBus(): String {
    val _ret = __method_bind.getReverbBus.call(this._handle)
    return _ret.asString()
  }

  fun getReverbUniformity(): Float {
    val _ret = __method_bind.getReverbUniformity.call(this._handle)
    return _ret.asFloat()
  }

  fun getSpaceOverrideMode(): SpaceOverride {
    val _ret = __method_bind.getSpaceOverrideMode.call(this._handle)
    return Area.SpaceOverride.from(_ret.asInt())
  }

  fun isGravityAPoint(): Boolean {
    val _ret = __method_bind.isGravityAPoint.call(this._handle)
    return _ret.asBoolean()
  }

  fun isMonitorable(): Boolean {
    val _ret = __method_bind.isMonitorable.call(this._handle)
    return _ret.asBoolean()
  }

  fun isMonitoring(): Boolean {
    val _ret = __method_bind.isMonitoring.call(this._handle)
    return _ret.asBoolean()
  }

  fun isOverridingAudioBus(): Boolean {
    val _ret = __method_bind.isOverridingAudioBus.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsingReverbBus(): Boolean {
    val _ret = __method_bind.isUsingReverbBus.call(this._handle)
    return _ret.asBoolean()
  }

  fun overlapsArea(area: Node): Boolean {
    val _arg = Variant.new(area)
    val _ret = __method_bind.overlapsArea.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun overlapsBody(body: Node): Boolean {
    val _arg = Variant.new(body)
    val _ret = __method_bind.overlapsBody.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun setAngularDamp(angularDamp: Float) {
    val _arg = Variant.new(angularDamp)
    __method_bind.setAngularDamp.call(this._handle, listOf(_arg))
  }

  fun setAudioBus(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setAudioBus.call(this._handle, listOf(_arg))
  }

  fun setAudioBusOverride(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAudioBusOverride.call(this._handle, listOf(_arg))
  }

  fun setCollisionLayer(collisionLayer: Int) {
    val _arg = Variant.new(collisionLayer)
    __method_bind.setCollisionLayer.call(this._handle, listOf(_arg))
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bit))
    _args.add(Variant.fromAny(value))
    __method_bind.setCollisionLayerBit.call(this._handle, _args)
  }

  fun setCollisionMask(collisionMask: Int) {
    val _arg = Variant.new(collisionMask)
    __method_bind.setCollisionMask.call(this._handle, listOf(_arg))
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bit))
    _args.add(Variant.fromAny(value))
    __method_bind.setCollisionMaskBit.call(this._handle, _args)
  }

  fun setGravity(gravity: Float) {
    val _arg = Variant.new(gravity)
    __method_bind.setGravity.call(this._handle, listOf(_arg))
  }

  fun setGravityDistanceScale(distanceScale: Float) {
    val _arg = Variant.new(distanceScale)
    __method_bind.setGravityDistanceScale.call(this._handle, listOf(_arg))
  }

  fun setGravityIsPoint(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setGravityIsPoint.call(this._handle, listOf(_arg))
  }

  fun setGravityVector(vector: Vector3) {
    val _arg = Variant.new(vector)
    __method_bind.setGravityVector.call(this._handle, listOf(_arg))
  }

  fun setLinearDamp(linearDamp: Float) {
    val _arg = Variant.new(linearDamp)
    __method_bind.setLinearDamp.call(this._handle, listOf(_arg))
  }

  fun setMonitorable(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setMonitorable.call(this._handle, listOf(_arg))
  }

  fun setMonitoring(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setMonitoring.call(this._handle, listOf(_arg))
  }

  fun setPriority(priority: Float) {
    val _arg = Variant.new(priority)
    __method_bind.setPriority.call(this._handle, listOf(_arg))
  }

  fun setReverbAmount(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setReverbAmount.call(this._handle, listOf(_arg))
  }

  fun setReverbBus(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setReverbBus.call(this._handle, listOf(_arg))
  }

  fun setReverbUniformity(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setReverbUniformity.call(this._handle, listOf(_arg))
  }

  fun setSpaceOverrideMode(enable: Int) {
    val _arg = Variant.new(enable)
    __method_bind.setSpaceOverrideMode.call(this._handle, listOf(_arg))
  }

  fun setUseReverbBus(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseReverbBus.call(this._handle, listOf(_arg))
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
    fun new(): Area = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Area".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Area" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Area(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Area = Area(ptr)
    /**
     * Container for method_bind pointers for Area
     */
    private object __method_bind {
      val getAngularDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_angular_damp" }
        }
      val getAudioBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_audio_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_audio_bus" }
        }
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
        }
      val getCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val getGravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity" }
        }
      val getGravityDistanceScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_gravity_distance_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity_distance_scale" }
        }
      val getGravityVector: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_gravity_vector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity_vector" }
        }
      val getLinearDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_linear_damp" }
        }
      val getOverlappingAreas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_overlapping_areas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_overlapping_areas" }
        }
      val getOverlappingBodies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_overlapping_bodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_overlapping_bodies" }
        }
      val getPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_priority" }
        }
      val getReverbAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_reverb_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_reverb_amount" }
        }
      val getReverbBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_reverb_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_reverb_bus" }
        }
      val getReverbUniformity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_reverb_uniformity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_reverb_uniformity" }
        }
      val getSpaceOverrideMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "get_space_override_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_space_override_mode" }
        }
      val isGravityAPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_gravity_a_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_gravity_a_point" }
        }
      val isMonitorable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_monitorable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_monitorable" }
        }
      val isMonitoring: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_monitoring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_monitoring" }
        }
      val isOverridingAudioBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_overriding_audio_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_overriding_audio_bus" }
        }
      val isUsingReverbBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "is_using_reverb_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_reverb_bus" }
        }
      val overlapsArea: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "overlaps_area".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method overlaps_area" }
        }
      val overlapsBody: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "overlaps_body".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method overlaps_body" }
        }
      val setAngularDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_angular_damp" }
        }
      val setAudioBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_audio_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_audio_bus" }
        }
      val setAudioBusOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_audio_bus_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_audio_bus_override" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
        }
      val setCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val setGravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity" }
        }
      val setGravityDistanceScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_gravity_distance_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_distance_scale" }
        }
      val setGravityIsPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_gravity_is_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_is_point" }
        }
      val setGravityVector: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_gravity_vector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_vector" }
        }
      val setLinearDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_linear_damp" }
        }
      val setMonitorable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_monitorable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_monitorable" }
        }
      val setMonitoring: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_monitoring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_monitoring" }
        }
      val setPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_priority" }
        }
      val setReverbAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_reverb_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_reverb_amount" }
        }
      val setReverbBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_reverb_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_reverb_bus" }
        }
      val setReverbUniformity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_reverb_uniformity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_reverb_uniformity" }
        }
      val setSpaceOverrideMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_space_override_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_space_override_mode" }
        }
      val setUseReverbBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area".cstr.ptr,
            "set_use_reverb_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_reverb_bus" }
        }}
  }
}
