// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Int
import kotlin.String
import kotlin.Suppress
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

open class Physics2DTestMotionResult(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  val collider: Object
    get() {
       return getCollider() 
    }

  val colliderId: Int
    get() {
       return getColliderId() 
    }

  val colliderRid: RID
    get() {
       return getColliderRid() 
    }

  val colliderShape: Int
    get() {
       return getColliderShape() 
    }

  val colliderVelocity: Vector2
    get() {
       return getColliderVelocity() 
    }

  val collisionNormal: Vector2
    get() {
       return getCollisionNormal() 
    }

  val collisionPoint: Vector2
    get() {
       return getCollisionPoint() 
    }

  val motion: Vector2
    get() {
       return getMotion() 
    }

  val motionRemainder: Vector2
    get() {
       return getMotionRemainder() 
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getCollider(): Object {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Object
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getCollider.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Object>(_tmp.value!!)
      _ret
    }
  }

  fun getColliderId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getColliderId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getColliderRid(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getColliderRid.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getColliderShape(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getColliderShape.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getColliderVelocity(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getColliderVelocity.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCollisionNormal(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getCollisionNormal.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCollisionPoint(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getCollisionPoint.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMotion(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getMotion.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMotionRemainder(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getMotionRemainder.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("Physics2DTestMotionResult".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Physics2DTestMotionResult" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Physics2DTestMotionResult
     */
    private object __method_bind {
      val getCollider: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
            "get_collider".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider" }
        }
      val getColliderId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
            "get_collider_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider_id" }
        }
      val getColliderRid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
            "get_collider_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider_rid" }
        }
      val getColliderShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
            "get_collider_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider_shape" }
        }
      val getColliderVelocity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
            "get_collider_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider_velocity" }
        }
      val getCollisionNormal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
            "get_collision_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_normal" }
        }
      val getCollisionPoint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
            "get_collision_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_point" }
        }
      val getMotion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
            "get_motion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_motion" }
        }
      val getMotionRemainder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DTestMotionResult".cstr.ptr,
            "get_motion_remainder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_motion_remainder" }
        }}
  }
}
