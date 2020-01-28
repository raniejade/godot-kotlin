// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
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

open class SoftBody(
  _handle: COpaquePointer
) : MeshInstance(_handle) {
  var areaAngularStiffness: Float
    get() {
       return getAreaAngularStiffness() 
    }
    set(value) {
      setAreaAngularStiffness(value)
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

  var dampingCoefficient: Float
    get() {
       return getDampingCoefficient() 
    }
    set(value) {
      setDampingCoefficient(value)
    }

  var dragCoefficient: Float
    get() {
       return getDragCoefficient() 
    }
    set(value) {
      setDragCoefficient(value)
    }

  var linearStiffness: Float
    get() {
       return getLinearStiffness() 
    }
    set(value) {
      setLinearStiffness(value)
    }

  var parentCollisionIgnore: NodePath
    get() {
       return getParentCollisionIgnore() 
    }
    set(value) {
      setParentCollisionIgnore(value)
    }

  var poseMatchingCoefficient: Float
    get() {
       return getPoseMatchingCoefficient() 
    }
    set(value) {
      setPoseMatchingCoefficient(value)
    }

  var pressureCoefficient: Float
    get() {
       return getPressureCoefficient() 
    }
    set(value) {
      setPressureCoefficient(value)
    }

  var simulationPrecision: Int
    get() {
       return getSimulationPrecision() 
    }
    set(value) {
      setSimulationPrecision(value)
    }

  var totalMass: Float
    get() {
       return getTotalMass() 
    }
    set(value) {
      setTotalMass(value)
    }

  var volumeStiffness: Float
    get() {
       return getVolumeStiffness() 
    }
    set(value) {
      setVolumeStiffness(value)
    }

  fun addCollisionExceptionWith(body: Node) {
    val _arg = Variant.new(body)
    __method_bind.addCollisionExceptionWith.call(this._handle, _arg, 1)
  }

  fun getAreaAngularStiffness(): Float {
    val _ret = __method_bind.getAreaAngularStiffness.call(this._handle)
    return _ret.asFloat()
  }

  fun getCollisionExceptions(): VariantArray {
    val _ret = __method_bind.getCollisionExceptions.call(this._handle)
    return _ret.asVariantArray()
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

  fun getDampingCoefficient(): Float {
    val _ret = __method_bind.getDampingCoefficient.call(this._handle)
    return _ret.asFloat()
  }

  fun getDragCoefficient(): Float {
    val _ret = __method_bind.getDragCoefficient.call(this._handle)
    return _ret.asFloat()
  }

  fun getLinearStiffness(): Float {
    val _ret = __method_bind.getLinearStiffness.call(this._handle)
    return _ret.asFloat()
  }

  fun getParentCollisionIgnore(): NodePath {
    val _ret = __method_bind.getParentCollisionIgnore.call(this._handle)
    return _ret.asNodePath()
  }

  fun getPoseMatchingCoefficient(): Float {
    val _ret = __method_bind.getPoseMatchingCoefficient.call(this._handle)
    return _ret.asFloat()
  }

  fun getPressureCoefficient(): Float {
    val _ret = __method_bind.getPressureCoefficient.call(this._handle)
    return _ret.asFloat()
  }

  fun getSimulationPrecision(): Int {
    val _ret = __method_bind.getSimulationPrecision.call(this._handle)
    return _ret.asInt()
  }

  fun getTotalMass(): Float {
    val _ret = __method_bind.getTotalMass.call(this._handle)
    return _ret.asFloat()
  }

  fun getVolumeStiffness(): Float {
    val _ret = __method_bind.getVolumeStiffness.call(this._handle)
    return _ret.asFloat()
  }

  fun isRayPickable(): Boolean {
    val _ret = __method_bind.isRayPickable.call(this._handle)
    return _ret.asBoolean()
  }

  fun removeCollisionExceptionWith(body: Node) {
    val _arg = Variant.new(body)
    __method_bind.removeCollisionExceptionWith.call(this._handle, _arg, 1)
  }

  fun setAreaAngularStiffness(areaAngularStiffness: Float) {
    val _arg = Variant.new(areaAngularStiffness)
    __method_bind.setAreaAngularStiffness.call(this._handle, _arg, 1)
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

  fun setDampingCoefficient(dampingCoefficient: Float) {
    val _arg = Variant.new(dampingCoefficient)
    __method_bind.setDampingCoefficient.call(this._handle, _arg, 1)
  }

  fun setDragCoefficient(dragCoefficient: Float) {
    val _arg = Variant.new(dragCoefficient)
    __method_bind.setDragCoefficient.call(this._handle, _arg, 1)
  }

  fun setLinearStiffness(linearStiffness: Float) {
    val _arg = Variant.new(linearStiffness)
    __method_bind.setLinearStiffness.call(this._handle, _arg, 1)
  }

  fun setParentCollisionIgnore(parentCollisionIgnore: NodePath) {
    val _arg = Variant.new(parentCollisionIgnore)
    __method_bind.setParentCollisionIgnore.call(this._handle, _arg, 1)
  }

  fun setPoseMatchingCoefficient(poseMatchingCoefficient: Float) {
    val _arg = Variant.new(poseMatchingCoefficient)
    __method_bind.setPoseMatchingCoefficient.call(this._handle, _arg, 1)
  }

  fun setPressureCoefficient(pressureCoefficient: Float) {
    val _arg = Variant.new(pressureCoefficient)
    __method_bind.setPressureCoefficient.call(this._handle, _arg, 1)
  }

  fun setRayPickable(rayPickable: Boolean) {
    val _arg = Variant.new(rayPickable)
    __method_bind.setRayPickable.call(this._handle, _arg, 1)
  }

  fun setSimulationPrecision(simulationPrecision: Int) {
    val _arg = Variant.new(simulationPrecision)
    __method_bind.setSimulationPrecision.call(this._handle, _arg, 1)
  }

  fun setTotalMass(mass: Float) {
    val _arg = Variant.new(mass)
    __method_bind.setTotalMass.call(this._handle, _arg, 1)
  }

  fun setVolumeStiffness(volumeStiffness: Float) {
    val _arg = Variant.new(volumeStiffness)
    __method_bind.setVolumeStiffness.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): SoftBody = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SoftBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SoftBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SoftBody(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SoftBody = SoftBody(ptr)
    /**
     * Container for method_bind pointers for SoftBody
     */
    private object __method_bind {
      val addCollisionExceptionWith: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "addCollisionExceptionWith".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addCollisionExceptionWith" }
        }
      val getAreaAngularStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getAreaAngularStiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAreaAngularStiffness" }
        }
      val getCollisionExceptions: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getCollisionExceptions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionExceptions" }
        }
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionLayer" }
        }
      val getCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getCollisionLayerBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionLayerBit" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMaskBit" }
        }
      val getDampingCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getDampingCoefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDampingCoefficient" }
        }
      val getDragCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getDragCoefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDragCoefficient" }
        }
      val getLinearStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getLinearStiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLinearStiffness" }
        }
      val getParentCollisionIgnore: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getParentCollisionIgnore".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParentCollisionIgnore" }
        }
      val getPoseMatchingCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getPoseMatchingCoefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPoseMatchingCoefficient" }
        }
      val getPressureCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getPressureCoefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPressureCoefficient" }
        }
      val getSimulationPrecision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getSimulationPrecision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSimulationPrecision" }
        }
      val getTotalMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getTotalMass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTotalMass" }
        }
      val getVolumeStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "getVolumeStiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVolumeStiffness" }
        }
      val isRayPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "isRayPickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRayPickable" }
        }
      val removeCollisionExceptionWith: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "removeCollisionExceptionWith".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeCollisionExceptionWith" }
        }
      val setAreaAngularStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setAreaAngularStiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAreaAngularStiffness" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionLayer" }
        }
      val setCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setCollisionLayerBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionLayerBit" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMaskBit" }
        }
      val setDampingCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setDampingCoefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDampingCoefficient" }
        }
      val setDragCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setDragCoefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDragCoefficient" }
        }
      val setLinearStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setLinearStiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLinearStiffness" }
        }
      val setParentCollisionIgnore: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setParentCollisionIgnore".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setParentCollisionIgnore" }
        }
      val setPoseMatchingCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setPoseMatchingCoefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPoseMatchingCoefficient" }
        }
      val setPressureCoefficient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setPressureCoefficient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPressureCoefficient" }
        }
      val setRayPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setRayPickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRayPickable" }
        }
      val setSimulationPrecision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setSimulationPrecision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSimulationPrecision" }
        }
      val setTotalMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setTotalMass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTotalMass" }
        }
      val setVolumeStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SoftBody".cstr.ptr,
            "setVolumeStiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVolumeStiffness" }
        }}
  }
}
