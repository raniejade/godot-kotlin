// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Transform2D
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

open class CollisionObject2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun createShapeOwner(owner: Object): Int {
    val _args = VariantArray.new()
    _args.append(owner)
    val _ret = __method_bind.create_shape_owner.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asInt()
  }

  fun getRid(): RID {
    val _ret = __method_bind.get_rid.call(this.toVariant())
    return _ret.asRID()
  }

  fun getShapeOwnerOneWayCollisionMargin(ownerId: Int): Float {
    val _args = VariantArray.new()
    _args.append(ownerId)
    val _ret = __method_bind.get_shape_owner_one_way_collision_margin.call(this.toVariant(),
        _args.toVariant(), 1)
    return _ret.asFloat()
  }

  fun getShapeOwners(): VariantArray {
    val _ret = __method_bind.get_shape_owners.call(this.toVariant())
    return _ret.asArray()
  }

  fun isPickable(): Boolean {
    val _ret = __method_bind.is_pickable.call(this.toVariant())
    return _ret.asBool()
  }

  fun isShapeOwnerDisabled(ownerId: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(ownerId)
    val _ret = __method_bind.is_shape_owner_disabled.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun isShapeOwnerOneWayCollisionEnabled(ownerId: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(ownerId)
    val _ret = __method_bind.is_shape_owner_one_way_collision_enabled.call(this.toVariant(),
        _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun removeShapeOwner(ownerId: Int) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    __method_bind.remove_shape_owner.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setPickable(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    __method_bind.set_pickable.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun shapeFindOwner(shapeIndex: Int): Int {
    val _args = VariantArray.new()
    _args.append(shapeIndex)
    val _ret = __method_bind.shape_find_owner.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asInt()
  }

  fun shapeOwnerAddShape(ownerId: Int, shape: Shape2D) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(shape)
    __method_bind.shape_owner_add_shape.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun shapeOwnerClearShapes(ownerId: Int) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    __method_bind.shape_owner_clear_shapes.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun shapeOwnerGetOwner(ownerId: Int): Object {
    val _args = VariantArray.new()
    _args.append(ownerId)
    val _ret = __method_bind.shape_owner_get_owner.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asObject(::Object)!!
  }

  fun shapeOwnerGetShape(ownerId: Int, shapeId: Int): Shape2D {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(shapeId)
    val _ret = __method_bind.shape_owner_get_shape.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asObject(::Shape2D)!!
  }

  fun shapeOwnerGetShapeCount(ownerId: Int): Int {
    val _args = VariantArray.new()
    _args.append(ownerId)
    val _ret = __method_bind.shape_owner_get_shape_count.call(this.toVariant(), _args.toVariant(),
        1)
    return _ret.asInt()
  }

  fun shapeOwnerGetShapeIndex(ownerId: Int, shapeId: Int): Int {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(shapeId)
    val _ret = __method_bind.shape_owner_get_shape_index.call(this.toVariant(), _args.toVariant(),
        2)
    return _ret.asInt()
  }

  fun shapeOwnerGetTransform(ownerId: Int): Transform2D {
    val _args = VariantArray.new()
    _args.append(ownerId)
    val _ret = __method_bind.shape_owner_get_transform.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asTransform2D()
  }

  fun shapeOwnerRemoveShape(ownerId: Int, shapeId: Int) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(shapeId)
    __method_bind.shape_owner_remove_shape.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun shapeOwnerSetDisabled(ownerId: Int, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(disabled)
    __method_bind.shape_owner_set_disabled.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun shapeOwnerSetOneWayCollision(ownerId: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(enable)
    __method_bind.shape_owner_set_one_way_collision.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun shapeOwnerSetOneWayCollisionMargin(ownerId: Int, margin: Float) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(margin)
    __method_bind.shape_owner_set_one_way_collision_margin.call(this.toVariant(), _args.toVariant(),
        2)
  }

  fun shapeOwnerSetTransform(ownerId: Int, transform: Transform2D) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(transform)
    __method_bind.shape_owner_set_transform.call(this.toVariant(), _args.toVariant(), 2)
  }

  companion object {
    /**
     * Container for method_bind pointers for CollisionObject2D
     */
    private object __method_bind {
      val create_shape_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "create_shape_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_shape_owner" }
            }
          }

      val get_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "get_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rid" }
            }
          }

      val get_shape_owner_one_way_collision_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "get_shape_owner_one_way_collision_margin".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_shape_owner_one_way_collision_margin" }
            }
          }

      val get_shape_owners: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "get_shape_owners".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shape_owners" }
            }
          }

      val is_pickable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "is_pickable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_pickable" }
            }
          }

      val is_shape_owner_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "is_shape_owner_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_shape_owner_disabled" }
            }
          }

      val is_shape_owner_one_way_collision_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "is_shape_owner_one_way_collision_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_shape_owner_one_way_collision_enabled" }
            }
          }

      val remove_shape_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "remove_shape_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_shape_owner" }
            }
          }

      val set_pickable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "set_pickable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pickable" }
            }
          }

      val shape_find_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_find_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_find_owner" }
            }
          }

      val shape_owner_add_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_add_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_add_shape" }
            }
          }

      val shape_owner_clear_shapes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_clear_shapes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_clear_shapes" }
            }
          }

      val shape_owner_get_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_get_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_owner" }
            }
          }

      val shape_owner_get_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_get_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape" }
            }
          }

      val shape_owner_get_shape_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_get_shape_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape_count" }
            }
          }

      val shape_owner_get_shape_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_get_shape_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape_index" }
            }
          }

      val shape_owner_get_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_get_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_get_transform" }
            }
          }

      val shape_owner_remove_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_remove_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_remove_shape" }
            }
          }

      val shape_owner_set_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_set_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_set_disabled" }
            }
          }

      val shape_owner_set_one_way_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_set_one_way_collision".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method shape_owner_set_one_way_collision" }
            }
          }

      val shape_owner_set_one_way_collision_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_set_one_way_collision_margin".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method shape_owner_set_one_way_collision_margin" }
            }
          }

      val shape_owner_set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
              "shape_owner_set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shape_owner_set_transform" }
            }
          }
    }
  }
}
