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
import kotlin.Boolean
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

open class RayCast2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var castTo: Vector2
    get() {
       return getCastTo() 
    }
    set(value) {
      setCastTo(value)
    }

  var collideWithAreas: Boolean
    get() {
       return isCollideWithAreasEnabled() 
    }
    set(value) {
      setCollideWithAreas(value)
    }

  var collideWithBodies: Boolean
    get() {
       return isCollideWithBodiesEnabled() 
    }
    set(value) {
      setCollideWithBodies(value)
    }

  var collisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var enabled: Boolean
    get() {
       return isEnabled() 
    }
    set(value) {
      setEnabled(value)
    }

  var excludeParent: Boolean
    get() {
       return getExcludeParentBody() 
    }
    set(value) {
      setExcludeParentBody(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for castTo
   */
  fun castTo(cb: Vector2.() -> Unit) {
    val _p = castTo
    cb(_p)
    castTo = _p
  }

  fun addException(node: Object) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addException.call(self._handle, listOf(node), null)
    }
  }

  fun addExceptionRid(rid: RID) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addExceptionRid.call(self._handle, listOf(rid), null)
    }
  }

  fun clearExceptions() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearExceptions.call(self._handle, emptyList(), null)
    }
  }

  fun forceRaycastUpdate() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.forceRaycastUpdate.call(self._handle, emptyList(), null)
    }
  }

  fun getCastTo(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getCastTo.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
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

  fun getColliderShape(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getColliderShape.call(self._handle, emptyList(), _retPtr)
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

  fun getExcludeParentBody(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getExcludeParentBody.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isCollideWithAreasEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCollideWithAreasEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isCollideWithBodiesEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCollideWithBodiesEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isColliding(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isColliding.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun removeException(node: Object) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeException.call(self._handle, listOf(node), null)
    }
  }

  fun removeExceptionRid(rid: RID) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeExceptionRid.call(self._handle, listOf(rid), null)
    }
  }

  fun setCastTo(localPoint: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCastTo.call(self._handle, listOf(localPoint), null)
    }
  }

  fun setCollideWithAreas(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollideWithAreas.call(self._handle, listOf(enable), null)
    }
  }

  fun setCollideWithBodies(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollideWithBodies.call(self._handle, listOf(enable), null)
    }
  }

  fun setCollisionMask(mask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionMask.call(self._handle, listOf(mask), null)
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

  fun setEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setExcludeParentBody(mask: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExcludeParentBody.call(self._handle, listOf(mask), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RayCast2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RayCast2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for RayCast2D
     */
    private object __method_bind {
      val addException: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "add_exception".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_exception" }
            }
          }

      val addExceptionRid: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "add_exception_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_exception_rid" }
            }
          }

      val clearExceptions: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "clear_exceptions".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_exceptions" }
            }
          }

      val forceRaycastUpdate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "force_raycast_update".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method force_raycast_update" }
            }
          }

      val getCastTo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_cast_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cast_to" }
            }
          }

      val getCollider: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_collider".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider" }
            }
          }

      val getColliderShape: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_collider_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_shape" }
            }
          }

      val getCollisionMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
            }
          }

      val getCollisionMaskBit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
            }
          }

      val getCollisionNormal: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_collision_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_normal" }
            }
          }

      val getCollisionPoint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_collision_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_point" }
            }
          }

      val getExcludeParentBody: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_exclude_parent_body".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_exclude_parent_body" }
            }
          }

      val isCollideWithAreasEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "is_collide_with_areas_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_collide_with_areas_enabled"
              }
            }
          }

      val isCollideWithBodiesEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "is_collide_with_bodies_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_collide_with_bodies_enabled"
              }
            }
          }

      val isColliding: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "is_colliding".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_colliding" }
            }
          }

      val isEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "is_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_enabled" }
            }
          }

      val removeException: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "remove_exception".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_exception" }
            }
          }

      val removeExceptionRid: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "remove_exception_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_exception_rid" }
            }
          }

      val setCastTo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "set_cast_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cast_to" }
            }
          }

      val setCollideWithAreas: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "set_collide_with_areas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collide_with_areas" }
            }
          }

      val setCollideWithBodies: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "set_collide_with_bodies".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collide_with_bodies" }
            }
          }

      val setCollisionMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "set_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
            }
          }

      val setCollisionMaskBit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "set_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
            }
          }

      val setEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "set_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enabled" }
            }
          }

      val setExcludeParentBody: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "set_exclude_parent_body".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_exclude_parent_body" }
            }
          }
    }
  }
}
