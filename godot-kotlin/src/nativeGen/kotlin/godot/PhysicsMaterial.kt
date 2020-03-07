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

open class PhysicsMaterial(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var absorbent: Boolean
    get() {
       return isAbsorbent() 
    }
    set(value) {
      setAbsorbent(value)
    }

  var bounce: Float
    get() {
       return getBounce() 
    }
    set(value) {
      setBounce(value)
    }

  var friction: Float
    get() {
       return getFriction() 
    }
    set(value) {
      setFriction(value)
    }

  var rough: Boolean
    get() {
       return isRough() 
    }
    set(value) {
      setRough(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getBounce(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBounce.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFriction(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFriction.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isAbsorbent(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isAbsorbent.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isRough(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRough.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAbsorbent(absorbent: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAbsorbent.call(self._handle, listOf(absorbent), null)
    }
  }

  fun setBounce(bounce: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBounce.call(self._handle, listOf(bounce), null)
    }
  }

  fun setFriction(friction: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFriction.call(self._handle, listOf(friction), null)
    }
  }

  fun setRough(rough: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRough.call(self._handle, listOf(rough), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PhysicsMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PhysicsMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for PhysicsMaterial
     */
    private object __method_bind {
      val getBounce: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "get_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bounce" }
            }
          }

      val getFriction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "get_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_friction" }
            }
          }

      val isAbsorbent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "is_absorbent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_absorbent" }
            }
          }

      val isRough: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "is_rough".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_rough" }
            }
          }

      val setAbsorbent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "set_absorbent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_absorbent" }
            }
          }

      val setBounce: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "set_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bounce" }
            }
          }

      val setFriction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "set_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_friction" }
            }
          }

      val setRough: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "set_rough".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rough" }
            }
          }
    }
  }
}
