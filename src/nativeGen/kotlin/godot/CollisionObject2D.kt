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
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CollisionObject2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var inputPickable: Boolean
    get() {
       return isPickable() 
    }
    set(value) {
      setPickable(value)
    }

  /**
   * CollisionObject2D::input_event signal
   */
  val signalInputEvent: Signal3<Node, InputEvent, Int> = Signal3("input_event")

  /**
   * CollisionObject2D::mouse_entered signal
   */
  val signalMouseEntered: Signal0 = Signal0("mouse_entered")

  /**
   * CollisionObject2D::mouse_exited signal
   */
  val signalMouseExited: Signal0 = Signal0("mouse_exited")

  fun createShapeOwner(owner: Object): Int {
    val _arg = Variant.new(owner)
    val _ret = __method_bind.createShapeOwner.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getRid(): RID {
    val _ret = __method_bind.getRid.call(this._handle)
    return _ret.asRID()
  }

  fun getShapeOwnerOneWayCollisionMargin(ownerId: Int): Float {
    val _arg = Variant.new(ownerId)
    val _ret = __method_bind.getShapeOwnerOneWayCollisionMargin.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getShapeOwners(): VariantArray {
    val _ret = __method_bind.getShapeOwners.call(this._handle)
    return _ret.asVariantArray()
  }

  fun isPickable(): Boolean {
    val _ret = __method_bind.isPickable.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShapeOwnerDisabled(ownerId: Int): Boolean {
    val _arg = Variant.new(ownerId)
    val _ret = __method_bind.isShapeOwnerDisabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isShapeOwnerOneWayCollisionEnabled(ownerId: Int): Boolean {
    val _arg = Variant.new(ownerId)
    val _ret = __method_bind.isShapeOwnerOneWayCollisionEnabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun removeShapeOwner(ownerId: Int) {
    val _arg = Variant.new(ownerId)
    __method_bind.removeShapeOwner.call(this._handle, listOf(_arg))
  }

  fun setPickable(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setPickable.call(this._handle, listOf(_arg))
  }

  fun shapeFindOwner(shapeIndex: Int): Int {
    val _arg = Variant.new(shapeIndex)
    val _ret = __method_bind.shapeFindOwner.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun shapeOwnerAddShape(ownerId: Int, shape: Shape2D) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(ownerId))
    _args.add(Variant.fromAny(shape))
    __method_bind.shapeOwnerAddShape.call(this._handle, _args)
  }

  fun shapeOwnerClearShapes(ownerId: Int) {
    val _arg = Variant.new(ownerId)
    __method_bind.shapeOwnerClearShapes.call(this._handle, listOf(_arg))
  }

  fun shapeOwnerGetOwner(ownerId: Int): Object {
    val _arg = Variant.new(ownerId)
    val _ret = __method_bind.shapeOwnerGetOwner.call(this._handle, listOf(_arg))
    return _ret.asObject(::Object)!!
  }

  fun shapeOwnerGetShape(ownerId: Int, shapeId: Int): Shape2D {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(ownerId))
    _args.add(Variant.fromAny(shapeId))
    val _ret = __method_bind.shapeOwnerGetShape.call(this._handle, _args)
    return _ret.asObject(::Shape2D)!!
  }

  fun shapeOwnerGetShapeCount(ownerId: Int): Int {
    val _arg = Variant.new(ownerId)
    val _ret = __method_bind.shapeOwnerGetShapeCount.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun shapeOwnerGetShapeIndex(ownerId: Int, shapeId: Int): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(ownerId))
    _args.add(Variant.fromAny(shapeId))
    val _ret = __method_bind.shapeOwnerGetShapeIndex.call(this._handle, _args)
    return _ret.asInt()
  }

  fun shapeOwnerGetTransform(ownerId: Int): Transform2D {
    val _arg = Variant.new(ownerId)
    val _ret = __method_bind.shapeOwnerGetTransform.call(this._handle, listOf(_arg))
    return _ret.asTransform2D()
  }

  fun shapeOwnerRemoveShape(ownerId: Int, shapeId: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(ownerId))
    _args.add(Variant.fromAny(shapeId))
    __method_bind.shapeOwnerRemoveShape.call(this._handle, _args)
  }

  fun shapeOwnerSetDisabled(ownerId: Int, disabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(ownerId))
    _args.add(Variant.fromAny(disabled))
    __method_bind.shapeOwnerSetDisabled.call(this._handle, _args)
  }

  fun shapeOwnerSetOneWayCollision(ownerId: Int, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(ownerId))
    _args.add(Variant.fromAny(enable))
    __method_bind.shapeOwnerSetOneWayCollision.call(this._handle, _args)
  }

  fun shapeOwnerSetOneWayCollisionMargin(ownerId: Int, margin: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(ownerId))
    _args.add(Variant.fromAny(margin))
    __method_bind.shapeOwnerSetOneWayCollisionMargin.call(this._handle, _args)
  }

  fun shapeOwnerSetTransform(ownerId: Int, transform: Transform2D) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(ownerId))
    _args.add(Variant.fromAny(transform))
    __method_bind.shapeOwnerSetTransform.call(this._handle, _args)
  }

  companion object {
    /**
     * Container for method_bind pointers for CollisionObject2D
     */
    private object __method_bind {
      val createShapeOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "create_shape_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_shape_owner" }
        }
      val getRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "get_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rid" }
        }
      val getShapeOwnerOneWayCollisionMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "get_shape_owner_one_way_collision_margin".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_shape_owner_one_way_collision_margin" }
        }
      val getShapeOwners: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "get_shape_owners".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shape_owners" }
        }
      val isPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "is_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_pickable" }
        }
      val isShapeOwnerDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "is_shape_owner_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shape_owner_disabled" }
        }
      val isShapeOwnerOneWayCollisionEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "is_shape_owner_one_way_collision_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_shape_owner_one_way_collision_enabled" }
        }
      val removeShapeOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "remove_shape_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_shape_owner" }
        }
      val setPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "set_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pickable" }
        }
      val shapeFindOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_find_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_find_owner" }
        }
      val shapeOwnerAddShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_add_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_add_shape" }
        }
      val shapeOwnerClearShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_clear_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_clear_shapes" }
        }
      val shapeOwnerGetOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_get_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_owner" }
        }
      val shapeOwnerGetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape" }
        }
      val shapeOwnerGetShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_get_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape_count" }
        }
      val shapeOwnerGetShapeIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_get_shape_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape_index" }
        }
      val shapeOwnerGetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_transform" }
        }
      val shapeOwnerRemoveShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_remove_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_remove_shape" }
        }
      val shapeOwnerSetDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_set_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_set_disabled" }
        }
      val shapeOwnerSetOneWayCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_set_one_way_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_set_one_way_collision"
            }
        }
      val shapeOwnerSetOneWayCollisionMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_set_one_way_collision_margin".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method shape_owner_set_one_way_collision_margin" }
        }
      val shapeOwnerSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_set_transform" }
        }}
  }
}
