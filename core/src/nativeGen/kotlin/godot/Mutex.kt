// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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
    __method_bind.lock.call(this._handle)
  }

  fun tryLock(): GDError {
    val _ret = __method_bind.tryLock.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun unlock() {
    __method_bind.unlock.call(this._handle)
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
