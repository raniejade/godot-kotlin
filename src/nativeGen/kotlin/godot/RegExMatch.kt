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

open class RegExMatch internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): RegExMatch = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RegExMatch".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton RegExMatch" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RegExMatch(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for RegExMatch
     */
    private object __method_bind {
      val get_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
              "get_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_end" }
            }
          }

      val get_group_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
              "get_group_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_group_count" }
            }
          }

      val get_names: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
              "get_names".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_names" }
            }
          }

      val get_start: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
              "get_start".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_start" }
            }
          }

      val get_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
              "get_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_string" }
            }
          }

      val get_strings: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
              "get_strings".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_strings" }
            }
          }

      val get_subject: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
              "get_subject".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_subject" }
            }
          }
    }
  }
}
