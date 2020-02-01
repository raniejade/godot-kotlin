// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class _Semaphore(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun post(): GDError {
    val _ret = __method_bind.post.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun wait(): GDError {
    val _ret = __method_bind.wait.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  companion object {
    fun new(): _Semaphore = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("_Semaphore".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for _Semaphore" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      _Semaphore(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): _Semaphore = _Semaphore(ptr)
    /**
     * Container for method_bind pointers for _Semaphore
     */
    private object __method_bind {
      val post: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Semaphore".cstr.ptr,
            "post".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method post" }
        }
      val wait: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Semaphore".cstr.ptr,
            "wait".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method wait" }
        }}
  }
}
