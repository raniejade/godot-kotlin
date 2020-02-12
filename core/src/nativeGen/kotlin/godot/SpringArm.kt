// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
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

open class SpringArm(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var collisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var margin: Float
    get() {
       return getMargin() 
    }
    set(value) {
      setMargin(value)
    }

  var shape: Shape
    get() {
       return getShape() 
    }
    set(value) {
      setShape(value)
    }

  var springLength: Float
    get() {
       return getLength() 
    }
    set(value) {
      setLength(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addExcludedObject(rID: RID) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addExcludedObject.call(self._handle, listOf(rID), null)
    }
  }

  fun clearExcludedObjects() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearExcludedObjects.call(self._handle, emptyList(), null)
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

  fun getHitLength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHitLength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getLength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMargin(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMargin.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getShape(): Shape {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Shape
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getShape.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Shape>(_tmp.value!!)
      _ret
    }
  }

  fun removeExcludedObject(rID: RID): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.removeExcludedObject.call(self._handle, listOf(rID), _retPtr)
      _ret.value
    }
  }

  fun setCollisionMask(mask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionMask.call(self._handle, listOf(mask), null)
    }
  }

  fun setLength(length: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLength.call(self._handle, listOf(length), null)
    }
  }

  fun setMargin(margin: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMargin.call(self._handle, listOf(margin), null)
    }
  }

  fun setShape(shape: Shape) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShape.call(self._handle, listOf(shape), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpringArm".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SpringArm" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SpringArm
     */
    private object __method_bind {
      val addExcludedObject: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "add_excluded_object".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_excluded_object" }
        }
      val clearExcludedObjects: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "clear_excluded_objects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_excluded_objects" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getHitLength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "get_hit_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hit_length" }
        }
      val getLength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "get_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_length" }
        }
      val getMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "get_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_margin" }
        }
      val getShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shape" }
        }
      val removeExcludedObject: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "remove_excluded_object".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_excluded_object" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setLength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "set_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_length" }
        }
      val setMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "set_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_margin" }
        }
      val setShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shape" }
        }}
  }
}
