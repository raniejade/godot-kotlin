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

open class RegEx internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): RegEx = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RegEx".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton RegEx" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RegEx(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for RegEx
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val compile: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
              "compile".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method compile" }
            }
          }

      val get_group_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
              "get_group_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_group_count" }
            }
          }

      val get_names: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
              "get_names".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_names" }
            }
          }

      val get_pattern: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
              "get_pattern".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pattern" }
            }
          }

      val is_valid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
              "is_valid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_valid" }
            }
          }

      val search: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
              "search".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method search" }
            }
          }

      val search_all: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
              "search_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method search_all" }
            }
          }

      val sub: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
              "sub".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method sub" }
            }
          }
    }
  }
}
