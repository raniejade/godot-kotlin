// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RayCast(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var castTo: Vector3
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
    _handle = __new()
  }

  /**
   * Specialized setter for castTo
   */
  fun castTo(cb: Vector3.() -> Unit) {
    val _p = castTo
    cb(_p)
    castTo = _p
  }

  fun addException(node: Object) {
    val _arg = Variant(node)
    __method_bind.addException.call(this._handle, listOf(_arg))
  }

  fun addExceptionRid(rid: RID) {
    val _arg = Variant(rid)
    __method_bind.addExceptionRid.call(this._handle, listOf(_arg))
  }

  fun clearExceptions() {
    __method_bind.clearExceptions.call(this._handle)
  }

  fun forceRaycastUpdate() {
    __method_bind.forceRaycastUpdate.call(this._handle)
  }

  fun getCastTo(): Vector3 {
    val _ret = __method_bind.getCastTo.call(this._handle)
    return _ret.asVector3()
  }

  fun getCollider(): Object {
    val _ret = __method_bind.getCollider.call(this._handle)
    return _ret.asObject(::Object)!!
  }

  fun getColliderShape(): Int {
    val _ret = __method_bind.getColliderShape.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant(bit)
    val _ret = __method_bind.getCollisionMaskBit.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getCollisionNormal(): Vector3 {
    val _ret = __method_bind.getCollisionNormal.call(this._handle)
    return _ret.asVector3()
  }

  fun getCollisionPoint(): Vector3 {
    val _ret = __method_bind.getCollisionPoint.call(this._handle)
    return _ret.asVector3()
  }

  fun getExcludeParentBody(): Boolean {
    val _ret = __method_bind.getExcludeParentBody.call(this._handle)
    return _ret.asBoolean()
  }

  fun isCollideWithAreasEnabled(): Boolean {
    val _ret = __method_bind.isCollideWithAreasEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isCollideWithBodiesEnabled(): Boolean {
    val _ret = __method_bind.isCollideWithBodiesEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isColliding(): Boolean {
    val _ret = __method_bind.isColliding.call(this._handle)
    return _ret.asBoolean()
  }

  fun isEnabled(): Boolean {
    val _ret = __method_bind.isEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun removeException(node: Object) {
    val _arg = Variant(node)
    __method_bind.removeException.call(this._handle, listOf(_arg))
  }

  fun removeExceptionRid(rid: RID) {
    val _arg = Variant(rid)
    __method_bind.removeExceptionRid.call(this._handle, listOf(_arg))
  }

  fun setCastTo(localPoint: Vector3) {
    val _arg = Variant(localPoint)
    __method_bind.setCastTo.call(this._handle, listOf(_arg))
  }

  fun setCollideWithAreas(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setCollideWithAreas.call(this._handle, listOf(_arg))
  }

  fun setCollideWithBodies(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setCollideWithBodies.call(this._handle, listOf(_arg))
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant(mask)
    __method_bind.setCollisionMask.call(this._handle, listOf(_arg))
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bit))
    _args.add(Variant.fromAny(value))
    __method_bind.setCollisionMaskBit.call(this._handle, _args)
  }

  fun setEnabled(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setEnabled.call(this._handle, listOf(_arg))
  }

  fun setExcludeParentBody(mask: Boolean) {
    val _arg = Variant(mask)
    __method_bind.setExcludeParentBody.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RayCast".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RayCast" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for RayCast
     */
    private object __method_bind {
      val addException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "add_exception".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_exception" }
        }
      val addExceptionRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "add_exception_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_exception_rid" }
        }
      val clearExceptions: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "clear_exceptions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_exceptions" }
        }
      val forceRaycastUpdate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "force_raycast_update".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method force_raycast_update" }
        }
      val getCastTo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_cast_to".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cast_to" }
        }
      val getCollider: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_collider".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider" }
        }
      val getColliderShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_collider_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider_shape" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val getCollisionNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_collision_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_normal" }
        }
      val getCollisionPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_collision_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_point" }
        }
      val getExcludeParentBody: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_exclude_parent_body".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_exclude_parent_body" }
        }
      val isCollideWithAreasEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "is_collide_with_areas_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_collide_with_areas_enabled" }
        }
      val isCollideWithBodiesEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "is_collide_with_bodies_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_collide_with_bodies_enabled" }
        }
      val isColliding: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "is_colliding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_colliding" }
        }
      val isEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_enabled" }
        }
      val removeException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "remove_exception".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_exception" }
        }
      val removeExceptionRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "remove_exception_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_exception_rid" }
        }
      val setCastTo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "set_cast_to".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cast_to" }
        }
      val setCollideWithAreas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "set_collide_with_areas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collide_with_areas" }
        }
      val setCollideWithBodies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "set_collide_with_bodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collide_with_bodies" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val setEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "set_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enabled" }
        }
      val setExcludeParentBody: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "set_exclude_parent_body".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exclude_parent_body" }
        }}
  }
}
