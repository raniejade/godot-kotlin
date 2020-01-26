// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class JavaScript internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun eval(): Variant {
    TODO()
  }

  companion object {
    val Instance: JavaScript = memScoped {
          val handle =
            checkNotNull(Godot.gdnative.godot_global_get_singleton)("JavaScript".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton JavaScript" }
          JavaScript(
            handle
          )
        }

    /**
     * Container for method_bind pointers for JavaScript
     */
    private object __method_bind {
      val eval: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JavaScript".cstr.ptr,
              "eval".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method eval" }
            }
          }
    }
  }
}
