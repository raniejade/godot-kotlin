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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RayCast(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun addException(node: Object) {
    val _arg = Variant.new(node)
    __method_bind.add_exception.call(this._handle, _arg, 1)
  }

  fun addExceptionRid(rid: RID) {
    val _arg = Variant.new(rid)
    __method_bind.add_exception_rid.call(this._handle, _arg, 1)
  }

  fun clearExceptions() {
    __method_bind.clear_exceptions.call(this._handle)
  }

  fun forceRaycastUpdate() {
    __method_bind.force_raycast_update.call(this._handle)
  }

  fun getCastTo(): Vector3 {
    val _ret = __method_bind.get_cast_to.call(this._handle)
    return _ret.asVector3()
  }

  fun getCollider(): Object {
    val _ret = __method_bind.get_collider.call(this._handle)
    return _ret.asObject(::Object)!!
  }

  fun getColliderShape(): Int {
    val _ret = __method_bind.get_collider_shape.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.get_collision_mask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.get_collision_mask_bit.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun getCollisionNormal(): Vector3 {
    val _ret = __method_bind.get_collision_normal.call(this._handle)
    return _ret.asVector3()
  }

  fun getCollisionPoint(): Vector3 {
    val _ret = __method_bind.get_collision_point.call(this._handle)
    return _ret.asVector3()
  }

  fun getExcludeParentBody(): Boolean {
    val _ret = __method_bind.get_exclude_parent_body.call(this._handle)
    return _ret.asBool()
  }

  fun isCollideWithAreasEnabled(): Boolean {
    val _ret = __method_bind.is_collide_with_areas_enabled.call(this._handle)
    return _ret.asBool()
  }

  fun isCollideWithBodiesEnabled(): Boolean {
    val _ret = __method_bind.is_collide_with_bodies_enabled.call(this._handle)
    return _ret.asBool()
  }

  fun isColliding(): Boolean {
    val _ret = __method_bind.is_colliding.call(this._handle)
    return _ret.asBool()
  }

  fun isEnabled(): Boolean {
    val _ret = __method_bind.is_enabled.call(this._handle)
    return _ret.asBool()
  }

  fun removeException(node: Object) {
    val _arg = Variant.new(node)
    __method_bind.remove_exception.call(this._handle, _arg, 1)
  }

  fun removeExceptionRid(rid: RID) {
    val _arg = Variant.new(rid)
    __method_bind.remove_exception_rid.call(this._handle, _arg, 1)
  }

  fun setCastTo(localPoint: Vector3) {
    val _arg = Variant.new(localPoint)
    __method_bind.set_cast_to.call(this._handle, _arg, 1)
  }

  fun setCollideWithAreas(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_collide_with_areas.call(this._handle, _arg, 1)
  }

  fun setCollideWithBodies(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_collide_with_bodies.call(this._handle, _arg, 1)
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.set_collision_mask.call(this._handle, _arg, 1)
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.set_collision_mask_bit.call(this._handle, _args.toVariant(), 2)
  }

  fun setEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_enabled.call(this._handle, _arg, 1)
  }

  fun setExcludeParentBody(mask: Boolean) {
    val _arg = Variant.new(mask)
    __method_bind.set_exclude_parent_body.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): RayCast = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RayCast".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RayCast" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RayCast(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RayCast = RayCast(ptr)
    /**
     * Container for method_bind pointers for RayCast
     */
    private object __method_bind {
      val add_exception: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "add_exception".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_exception" }
        }
      val add_exception_rid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "add_exception_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_exception_rid" }
        }
      val clear_exceptions: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "clear_exceptions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_exceptions" }
        }
      val force_raycast_update: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "force_raycast_update".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method force_raycast_update" }
        }
      val get_cast_to: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_cast_to".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cast_to" }
        }
      val get_collider: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_collider".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider" }
        }
      val get_collider_shape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_collider_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider_shape" }
        }
      val get_collision_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val get_collision_mask_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val get_collision_normal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_collision_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_normal" }
        }
      val get_collision_point: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_collision_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_point" }
        }
      val get_exclude_parent_body: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "get_exclude_parent_body".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_exclude_parent_body" }
        }
      val is_collide_with_areas_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "is_collide_with_areas_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_collide_with_areas_enabled" }
        }
      val is_collide_with_bodies_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "is_collide_with_bodies_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_collide_with_bodies_enabled" }
        }
      val is_colliding: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "is_colliding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_colliding" }
        }
      val is_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_enabled" }
        }
      val remove_exception: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "remove_exception".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_exception" }
        }
      val remove_exception_rid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "remove_exception_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_exception_rid" }
        }
      val set_cast_to: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "set_cast_to".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cast_to" }
        }
      val set_collide_with_areas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "set_collide_with_areas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collide_with_areas" }
        }
      val set_collide_with_bodies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "set_collide_with_bodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collide_with_bodies" }
        }
      val set_collision_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val set_collision_mask_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val set_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "set_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enabled" }
        }
      val set_exclude_parent_body: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
            "set_exclude_parent_body".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exclude_parent_body" }
        }}
  }
}
