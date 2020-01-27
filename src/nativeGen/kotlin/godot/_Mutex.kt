// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class _Mutex internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun lock() {
    val _ret = __method_bind.lock.call(this.toVariant())
    TODO()
  }

  fun tryLock(): Error {
    val _ret = __method_bind.try_lock.call(this.toVariant())
    TODO()
  }

  fun unlock() {
    val _ret = __method_bind.unlock.call(this.toVariant())
    TODO()
  }

  companion object {
    fun new(): _Mutex = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("_Mutex".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton _Mutex" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      _Mutex(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): _Mutex = _Mutex(ptr)
    /**
     * Container for method_bind pointers for _Mutex
     */
    private object __method_bind {
      val lock: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Mutex".cstr.ptr,
              "lock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method lock" }
            }
          }

      val try_lock: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Mutex".cstr.ptr,
              "try_lock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method try_lock" }
            }
          }

      val unlock: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Mutex".cstr.ptr,
              "unlock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unlock" }
            }
          }
    }
  }
}
