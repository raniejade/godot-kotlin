// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class CollisionObject2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _input_event(
    viewport: Object,
    event: InputEvent,
    shapeIdx: Int
  ) {
    TODO()
  }

  fun createShapeOwner(owner: Object): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.createShapeOwner.call(self._handle, listOf(owner), _retPtr)
      _ret.value
    }
  }

  fun getRid(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getRid.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getShapeOwnerOneWayCollisionMargin(ownerId: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getShapeOwnerOneWayCollisionMargin.call(self._handle, listOf(ownerId), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getShapeOwners(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getShapeOwners.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isPickable(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPickable.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isShapeOwnerDisabled(ownerId: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isShapeOwnerDisabled.call(self._handle, listOf(ownerId), _retPtr)
      _ret.value
    }
  }

  fun isShapeOwnerOneWayCollisionEnabled(ownerId: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isShapeOwnerOneWayCollisionEnabled.call(self._handle, listOf(ownerId), _retPtr)
      _ret.value
    }
  }

  fun removeShapeOwner(ownerId: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeShapeOwner.call(self._handle, listOf(ownerId), null)
    }
  }

  fun setPickable(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPickable.call(self._handle, listOf(enabled), null)
    }
  }

  fun shapeFindOwner(shapeIndex: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.shapeFindOwner.call(self._handle, listOf(shapeIndex), _retPtr)
      _ret.value
    }
  }

  fun shapeOwnerAddShape(ownerId: Int, shape: Shape2D) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(ownerId)
      _args.add(shape)
      __method_bind.shapeOwnerAddShape.call(self._handle, _args, null)
    }
  }

  fun shapeOwnerClearShapes(ownerId: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.shapeOwnerClearShapes.call(self._handle, listOf(ownerId), null)
    }
  }

  fun shapeOwnerGetOwner(ownerId: Int): Object {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Object
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.shapeOwnerGetOwner.call(self._handle, listOf(ownerId), _retPtr)
      _ret = objectToType<Object>(_tmp.value!!)
      _ret
    }
  }

  fun shapeOwnerGetShape(ownerId: Int, shapeId: Int): Shape2D {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Shape2D
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(ownerId)
      _args.add(shapeId)
      __method_bind.shapeOwnerGetShape.call(self._handle, _args, _retPtr)
      _ret = objectToType<Shape2D>(_tmp.value!!)
      _ret
    }
  }

  fun shapeOwnerGetShapeCount(ownerId: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.shapeOwnerGetShapeCount.call(self._handle, listOf(ownerId), _retPtr)
      _ret.value
    }
  }

  fun shapeOwnerGetShapeIndex(ownerId: Int, shapeId: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(ownerId)
      _args.add(shapeId)
      __method_bind.shapeOwnerGetShapeIndex.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun shapeOwnerGetTransform(ownerId: Int): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.shapeOwnerGetTransform.call(self._handle, listOf(ownerId), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun shapeOwnerRemoveShape(ownerId: Int, shapeId: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(ownerId)
      _args.add(shapeId)
      __method_bind.shapeOwnerRemoveShape.call(self._handle, _args, null)
    }
  }

  fun shapeOwnerSetDisabled(ownerId: Int, disabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(ownerId)
      _args.add(disabled)
      __method_bind.shapeOwnerSetDisabled.call(self._handle, _args, null)
    }
  }

  fun shapeOwnerSetOneWayCollision(ownerId: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(ownerId)
      _args.add(enable)
      __method_bind.shapeOwnerSetOneWayCollision.call(self._handle, _args, null)
    }
  }

  fun shapeOwnerSetOneWayCollisionMargin(ownerId: Int, margin: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(ownerId)
      _args.add(margin)
      __method_bind.shapeOwnerSetOneWayCollisionMargin.call(self._handle, _args, null)
    }
  }

  fun shapeOwnerSetTransform(ownerId: Int, transform: Transform2D) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(ownerId)
      _args.add(transform)
      __method_bind.shapeOwnerSetTransform.call(self._handle, _args, null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for CollisionObject2D
     */
    private object __method_bind {
      val createShapeOwner: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "create_shape_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_shape_owner" }
        }
      val getRid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "get_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rid" }
        }
      val getShapeOwnerOneWayCollisionMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "get_shape_owner_one_way_collision_margin".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_shape_owner_one_way_collision_margin" }
        }
      val getShapeOwners: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "get_shape_owners".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shape_owners" }
        }
      val isPickable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "is_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_pickable" }
        }
      val isShapeOwnerDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "is_shape_owner_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shape_owner_disabled" }
        }
      val isShapeOwnerOneWayCollisionEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "is_shape_owner_one_way_collision_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_shape_owner_one_way_collision_enabled" }
        }
      val removeShapeOwner: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "remove_shape_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_shape_owner" }
        }
      val setPickable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "set_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pickable" }
        }
      val shapeFindOwner: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_find_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_find_owner" }
        }
      val shapeOwnerAddShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_add_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_add_shape" }
        }
      val shapeOwnerClearShapes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_clear_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_clear_shapes" }
        }
      val shapeOwnerGetOwner: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_get_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_owner" }
        }
      val shapeOwnerGetShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape" }
        }
      val shapeOwnerGetShapeCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_get_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape_count" }
        }
      val shapeOwnerGetShapeIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_get_shape_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape_index" }
        }
      val shapeOwnerGetTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_transform" }
        }
      val shapeOwnerRemoveShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_remove_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_remove_shape" }
        }
      val shapeOwnerSetDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_set_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_set_disabled" }
        }
      val shapeOwnerSetOneWayCollision: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_set_one_way_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_set_one_way_collision"
            }
        }
      val shapeOwnerSetOneWayCollisionMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_set_one_way_collision_margin".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method shape_owner_set_one_way_collision_margin" }
        }
      val shapeOwnerSetTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shape_owner_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_set_transform" }
        }}
  }
}
