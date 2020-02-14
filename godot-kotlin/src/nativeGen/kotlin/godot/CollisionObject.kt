// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
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

open class CollisionObject(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var inputCaptureOnDrag: Boolean
    get() {
       return getCaptureInputOnDrag() 
    }
    set(value) {
      setCaptureInputOnDrag(value)
    }

  var inputRayPickable: Boolean
    get() {
       return isRayPickable() 
    }
    set(value) {
      setRayPickable(value)
    }

  /**
   * CollisionObject::input_event signal
   */
  val signalInputEvent: Signal5<Node, InputEvent, Vector3, Vector3, Int> = Signal5("input_event")

  /**
   * CollisionObject::mouse_entered signal
   */
  val signalMouseEntered: Signal0 = Signal0("mouse_entered")

  /**
   * CollisionObject::mouse_exited signal
   */
  val signalMouseExited: Signal0 = Signal0("mouse_exited")

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _input_event(
    camera: Object,
    event: InputEvent,
    clickPosition: Vector3,
    clickNormal: Vector3,
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

  fun getCaptureInputOnDrag(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCaptureInputOnDrag.call(self._handle, emptyList(), _retPtr)
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

  fun isRayPickable(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRayPickable.call(self._handle, emptyList(), _retPtr)
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

  fun removeShapeOwner(ownerId: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeShapeOwner.call(self._handle, listOf(ownerId), null)
    }
  }

  fun setCaptureInputOnDrag(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCaptureInputOnDrag.call(self._handle, listOf(enable), null)
    }
  }

  fun setRayPickable(rayPickable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRayPickable.call(self._handle, listOf(rayPickable), null)
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

  fun shapeOwnerAddShape(ownerId: Int, shape: Shape) {
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

  fun shapeOwnerGetShape(ownerId: Int, shapeId: Int): Shape {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Shape
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(ownerId)
      _args.add(shapeId)
      __method_bind.shapeOwnerGetShape.call(self._handle, _args, _retPtr)
      _ret = objectToType<Shape>(_tmp.value!!)
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

  fun shapeOwnerGetTransform(ownerId: Int): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
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

  fun shapeOwnerSetTransform(ownerId: Int, transform: Transform) {
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
     * Container for method_bind pointers for CollisionObject
     */
    private object __method_bind {
      val createShapeOwner: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "create_shape_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_shape_owner" }
        }
      val getCaptureInputOnDrag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "get_capture_input_on_drag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_capture_input_on_drag" }
        }
      val getRid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "get_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rid" }
        }
      val getShapeOwners: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "get_shape_owners".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shape_owners" }
        }
      val isRayPickable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "is_ray_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ray_pickable" }
        }
      val isShapeOwnerDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "is_shape_owner_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shape_owner_disabled" }
        }
      val removeShapeOwner: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "remove_shape_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_shape_owner" }
        }
      val setCaptureInputOnDrag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "set_capture_input_on_drag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_capture_input_on_drag" }
        }
      val setRayPickable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "set_ray_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ray_pickable" }
        }
      val shapeFindOwner: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shape_find_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_find_owner" }
        }
      val shapeOwnerAddShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shape_owner_add_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_add_shape" }
        }
      val shapeOwnerClearShapes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shape_owner_clear_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_clear_shapes" }
        }
      val shapeOwnerGetOwner: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shape_owner_get_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_owner" }
        }
      val shapeOwnerGetShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shape_owner_get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape" }
        }
      val shapeOwnerGetShapeCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shape_owner_get_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape_count" }
        }
      val shapeOwnerGetShapeIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shape_owner_get_shape_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_shape_index" }
        }
      val shapeOwnerGetTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shape_owner_get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_get_transform" }
        }
      val shapeOwnerRemoveShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shape_owner_remove_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_remove_shape" }
        }
      val shapeOwnerSetDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shape_owner_set_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_set_disabled" }
        }
      val shapeOwnerSetTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shape_owner_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_owner_set_transform" }
        }}
  }
}
