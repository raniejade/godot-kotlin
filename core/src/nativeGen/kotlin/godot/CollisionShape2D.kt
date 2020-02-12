// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class CollisionShape2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var disabled: Boolean
    get() {
       return isDisabled() 
    }
    set(value) {
      setDisabled(value)
    }

  var oneWayCollision: Boolean
    get() {
       return isOneWayCollisionEnabled() 
    }
    set(value) {
      setOneWayCollision(value)
    }

  var oneWayCollisionMargin: Float
    get() {
       return getOneWayCollisionMargin() 
    }
    set(value) {
      setOneWayCollisionMargin(value)
    }

  var shape: Shape2D
    get() {
       return getShape() 
    }
    set(value) {
      setShape(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getOneWayCollisionMargin(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOneWayCollisionMargin.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getShape(): Shape2D {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Shape2D
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getShape.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Shape2D>(_tmp.value!!)
      _ret
    }
  }

  fun isDisabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDisabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isOneWayCollisionEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isOneWayCollisionEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setDisabled(disabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDisabled.call(self._handle, listOf(disabled), null)
    }
  }

  fun setOneWayCollision(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOneWayCollision.call(self._handle, listOf(enabled), null)
    }
  }

  fun setOneWayCollisionMargin(margin: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOneWayCollisionMargin.call(self._handle, listOf(margin), null)
    }
  }

  fun setShape(shape: Shape2D) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShape.call(self._handle, listOf(shape), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CollisionShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CollisionShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for CollisionShape2D
     */
    private object __method_bind {
      val getOneWayCollisionMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "get_one_way_collision_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_one_way_collision_margin" }
        }
      val getShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shape" }
        }
      val isDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "is_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_disabled" }
        }
      val isOneWayCollisionEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "is_one_way_collision_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_one_way_collision_enabled" }
        }
      val setDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "set_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disabled" }
        }
      val setOneWayCollision: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "set_one_way_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_one_way_collision" }
        }
      val setOneWayCollisionMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "set_one_way_collision_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_one_way_collision_margin" }
        }
      val setShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shape" }
        }}
  }
}
