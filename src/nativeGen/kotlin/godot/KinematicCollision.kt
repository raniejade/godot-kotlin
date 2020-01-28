// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class KinematicCollision(
  _handle: COpaquePointer
) : Reference(_handle) {
  val collider: Object
    get() {
       return getCollider() 
    }

  val colliderId: Int
    get() {
       return getColliderId() 
    }

  val colliderMetadata: Variant
    get() {
       return getColliderMetadata() 
    }

  val colliderShape: Object
    get() {
       return getColliderShape() 
    }

  val colliderShapeIndex: Int
    get() {
       return getColliderShapeIndex() 
    }

  val colliderVelocity: Vector3
    get() {
       return getColliderVelocity() 
    }

  val localShape: Object
    get() {
       return getLocalShape() 
    }

  val normal: Vector3
    get() {
       return getNormal() 
    }

  val position: Vector3
    get() {
       return getPosition() 
    }

  val remainder: Vector3
    get() {
       return getRemainder() 
    }

  val travel: Vector3
    get() {
       return getTravel() 
    }

  fun getCollider(): Object {
    val _ret = __method_bind.getCollider.call(this._handle)
    return _ret.asObject(::Object)!!
  }

  fun getColliderId(): Int {
    val _ret = __method_bind.getColliderId.call(this._handle)
    return _ret.asInt()
  }

  fun getColliderMetadata(): Variant {
    val _ret = __method_bind.getColliderMetadata.call(this._handle)
    return _ret
  }

  fun getColliderShape(): Object {
    val _ret = __method_bind.getColliderShape.call(this._handle)
    return _ret.asObject(::Object)!!
  }

  fun getColliderShapeIndex(): Int {
    val _ret = __method_bind.getColliderShapeIndex.call(this._handle)
    return _ret.asInt()
  }

  fun getColliderVelocity(): Vector3 {
    val _ret = __method_bind.getColliderVelocity.call(this._handle)
    return _ret.asVector3()
  }

  fun getLocalShape(): Object {
    val _ret = __method_bind.getLocalShape.call(this._handle)
    return _ret.asObject(::Object)!!
  }

  fun getNormal(): Vector3 {
    val _ret = __method_bind.getNormal.call(this._handle)
    return _ret.asVector3()
  }

  fun getPosition(): Vector3 {
    val _ret = __method_bind.getPosition.call(this._handle)
    return _ret.asVector3()
  }

  fun getRemainder(): Vector3 {
    val _ret = __method_bind.getRemainder.call(this._handle)
    return _ret.asVector3()
  }

  fun getTravel(): Vector3 {
    val _ret = __method_bind.getTravel.call(this._handle)
    return _ret.asVector3()
  }

  companion object {
    fun new(): KinematicCollision = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("KinematicCollision".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for KinematicCollision" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      KinematicCollision(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): KinematicCollision = KinematicCollision(ptr)
    /**
     * Container for method_bind pointers for KinematicCollision
     */
    private object __method_bind {
      val getCollider: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
            "getCollider".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollider" }
        }
      val getColliderId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
            "getColliderId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColliderId" }
        }
      val getColliderMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
            "getColliderMetadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColliderMetadata" }
        }
      val getColliderShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
            "getColliderShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColliderShape" }
        }
      val getColliderShapeIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
            "getColliderShapeIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColliderShapeIndex" }
        }
      val getColliderVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
            "getColliderVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColliderVelocity" }
        }
      val getLocalShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
            "getLocalShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLocalShape" }
        }
      val getNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
            "getNormal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNormal" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
            "getPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPosition" }
        }
      val getRemainder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
            "getRemainder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRemainder" }
        }
      val getTravel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
            "getTravel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTravel" }
        }}
  }
}
