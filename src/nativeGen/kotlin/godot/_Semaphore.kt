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

open class _Semaphore internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun post(): Error {
    val _ret = __method_bind.post.call(this.toVariant())
    TODO()
  }

  fun wait(): Error {
    val _ret = __method_bind.wait.call(this.toVariant())
    TODO()
  }

  companion object {
    fun new(): _Semaphore = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("_Semaphore".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton _Semaphore" }
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
      val post: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Semaphore".cstr.ptr,
              "post".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method post" }
            }
          }

      val wait: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Semaphore".cstr.ptr,
              "wait".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method wait" }
            }
          }
    }
  }
}
