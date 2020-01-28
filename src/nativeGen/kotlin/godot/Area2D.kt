// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Area2D(
  _handle: COpaquePointer
) : CollisionObject2D(_handle) {
  var angularDamp: Float
    get() {
       return getAngularDamp() 
    }
    set(value) {
      setAngularDamp(value)
    }

  var audioBusName: String
    get() {
       return getAudioBusName() 
    }
    set(value) {
      setAudioBusName(value)
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

  var gravityVec: Vector2
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

  var priority: Int
    get() {
       return getPriority() 
    }
    set(value) {
      setPriority(value)
    }

  var spaceOverride: Int
    get() {
       return Area2D.SpaceOverride.from(getSpaceOverrideMode()) 
    }
    set(value) {
      setSpaceOverrideMode(Area2D.SpaceOverride.from(value))
    }

  fun getAngularDamp(): Float {
    val _ret = __method_bind.getAngularDamp.call(this._handle)
    return _ret.asFloat()
  }

  fun getAudioBusName(): String {
    val _ret = __method_bind.getAudioBusName.call(this._handle)
    return _ret.asString()
  }

  fun getCollisionLayer(): Int {
    val _ret = __method_bind.getCollisionLayer.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionLayerBit.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionMaskBit.call(this._handle, _arg, 1)
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

  fun getGravityVector(): Vector2 {
    val _ret = __method_bind.getGravityVector.call(this._handle)
    return _ret.asVector2()
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

  fun getSpaceOverrideMode(): SpaceOverride {
    val _ret = __method_bind.getSpaceOverrideMode.call(this._handle)
    return Area2D.SpaceOverride.from(_ret.asInt())
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

  fun overlapsArea(area: Node): Boolean {
    val _arg = Variant.new(area)
    val _ret = __method_bind.overlapsArea.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun overlapsBody(body: Node): Boolean {
    val _arg = Variant.new(body)
    val _ret = __method_bind.overlapsBody.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun setAngularDamp(angularDamp: Float) {
    val _arg = Variant.new(angularDamp)
    __method_bind.setAngularDamp.call(this._handle, _arg, 1)
  }

  fun setAudioBusName(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setAudioBusName.call(this._handle, _arg, 1)
  }

  fun setAudioBusOverride(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAudioBusOverride.call(this._handle, _arg, 1)
  }

  fun setCollisionLayer(collisionLayer: Int) {
    val _arg = Variant.new(collisionLayer)
    __method_bind.setCollisionLayer.call(this._handle, _arg, 1)
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.setCollisionLayerBit.call(this._handle, _args.toVariant(), 2)
  }

  fun setCollisionMask(collisionMask: Int) {
    val _arg = Variant.new(collisionMask)
    __method_bind.setCollisionMask.call(this._handle, _arg, 1)
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.setCollisionMaskBit.call(this._handle, _args.toVariant(), 2)
  }

  fun setGravity(gravity: Float) {
    val _arg = Variant.new(gravity)
    __method_bind.setGravity.call(this._handle, _arg, 1)
  }

  fun setGravityDistanceScale(distanceScale: Float) {
    val _arg = Variant.new(distanceScale)
    __method_bind.setGravityDistanceScale.call(this._handle, _arg, 1)
  }

  fun setGravityIsPoint(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setGravityIsPoint.call(this._handle, _arg, 1)
  }

  fun setGravityVector(vector: Vector2) {
    val _arg = Variant.new(vector)
    __method_bind.setGravityVector.call(this._handle, _arg, 1)
  }

  fun setLinearDamp(linearDamp: Float) {
    val _arg = Variant.new(linearDamp)
    __method_bind.setLinearDamp.call(this._handle, _arg, 1)
  }

  fun setMonitorable(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setMonitorable.call(this._handle, _arg, 1)
  }

  fun setMonitoring(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setMonitoring.call(this._handle, _arg, 1)
  }

  fun setPriority(priority: Float) {
    val _arg = Variant.new(priority)
    __method_bind.setPriority.call(this._handle, _arg, 1)
  }

  fun setSpaceOverrideMode(spaceOverrideMode: Int) {
    val _arg = Variant.new(spaceOverrideMode)
    __method_bind.setSpaceOverrideMode.call(this._handle, _arg, 1)
  }

  enum class SpaceOverride(
    val value: Int
  ) {
    SPACE_OVERRIDE_DISABLED(0),

    SPACE_OVERRIDE_COMBINE(1),

    SPACE_OVERRIDE_COMBINE_REPLACE(2),

    SPACE_OVERRIDE_REPLACE(3),

    SPACE_OVERRIDE_REPLACE_COMBINE(4);

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
    val SPACE_OVERRIDE_COMBINE: Int = 1

    val SPACE_OVERRIDE_COMBINE_REPLACE: Int = 2

    val SPACE_OVERRIDE_DISABLED: Int = 0

    val SPACE_OVERRIDE_REPLACE: Int = 3

    val SPACE_OVERRIDE_REPLACE_COMBINE: Int = 4

    fun new(): Area2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Area2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Area2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Area2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Area2D = Area2D(ptr)
    /**
     * Container for method_bind pointers for Area2D
     */
    private object __method_bind {
      val getAngularDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "getAngularDamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAngularDamp" }
        }
      val getAudioBusName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "getAudioBusName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAudioBusName" }
        }
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "getCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionLayer" }
        }
      val getCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "getCollisionLayerBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionLayerBit" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "getCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "getCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMaskBit" }
        }
      val getGravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "getGravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGravity" }
        }
      val getGravityDistanceScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "getGravityDistanceScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGravityDistanceScale" }
        }
      val getGravityVector: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "getGravityVector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGravityVector" }
        }
      val getLinearDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "getLinearDamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLinearDamp" }
        }
      val getOverlappingAreas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "getOverlappingAreas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOverlappingAreas" }
        }
      val getOverlappingBodies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "getOverlappingBodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOverlappingBodies" }
        }
      val getPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "getPriority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPriority" }
        }
      val getSpaceOverrideMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "getSpaceOverrideMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpaceOverrideMode" }
        }
      val isGravityAPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "isGravityAPoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isGravityAPoint" }
        }
      val isMonitorable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "isMonitorable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isMonitorable" }
        }
      val isMonitoring: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "isMonitoring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isMonitoring" }
        }
      val isOverridingAudioBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "isOverridingAudioBus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isOverridingAudioBus" }
        }
      val overlapsArea: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "overlapsArea".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method overlapsArea" }
        }
      val overlapsBody: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "overlapsBody".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method overlapsBody" }
        }
      val setAngularDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setAngularDamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAngularDamp" }
        }
      val setAudioBusName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setAudioBusName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAudioBusName" }
        }
      val setAudioBusOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setAudioBusOverride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAudioBusOverride" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionLayer" }
        }
      val setCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setCollisionLayerBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionLayerBit" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMaskBit" }
        }
      val setGravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setGravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGravity" }
        }
      val setGravityDistanceScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setGravityDistanceScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGravityDistanceScale" }
        }
      val setGravityIsPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setGravityIsPoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGravityIsPoint" }
        }
      val setGravityVector: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setGravityVector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGravityVector" }
        }
      val setLinearDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setLinearDamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLinearDamp" }
        }
      val setMonitorable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setMonitorable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMonitorable" }
        }
      val setMonitoring: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setMonitoring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMonitoring" }
        }
      val setPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setPriority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPriority" }
        }
      val setSpaceOverrideMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Area2D".cstr.ptr,
            "setSpaceOverrideMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSpaceOverrideMode" }
        }}
  }
}
