// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WeakRef internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): WeakRef = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("WeakRef".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton WeakRef" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WeakRef(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for WeakRef
     */
    private object __method_bind {
      val get_ref: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WeakRef".cstr.ptr,
              "get_ref".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ref" }
            }
          }
    }
  }
}
