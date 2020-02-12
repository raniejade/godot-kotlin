// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class Mutex(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun lock() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.lock.call(self._handle, emptyList(), null)
    }
  }

  fun tryLock(): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.tryLock.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun unlock() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.unlock.call(self._handle, emptyList(), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Mutex".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Mutex" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Mutex
     */
    private object __method_bind {
      val lock: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Mutex".cstr.ptr,
            "lock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lock" }
        }
      val tryLock: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Mutex".cstr.ptr,
            "try_lock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method try_lock" }
        }
      val unlock: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Mutex".cstr.ptr,
            "unlock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unlock" }
        }}
  }
}
