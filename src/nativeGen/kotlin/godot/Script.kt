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

open class Script internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    /**
     * Container for method_bind pointers for Script
     */
    private object __method_bind {
      val can_instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
              "can_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method can_instance" }
            }
          }

      val get_base_script: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
              "get_base_script".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_script" }
            }
          }

      val get_instance_base_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
              "get_instance_base_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_instance_base_type" }
            }
          }

      val get_source_code: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
              "get_source_code".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_source_code" }
            }
          }

      val has_script_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
              "has_script_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_script_signal" }
            }
          }

      val has_source_code: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
              "has_source_code".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_source_code" }
            }
          }

      val instance_has: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
              "instance_has".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance_has" }
            }
          }

      val is_tool: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
              "is_tool".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_tool" }
            }
          }

      val reload: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
              "reload".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reload" }
            }
          }

      val set_source_code: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
              "set_source_code".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_source_code" }
            }
          }
    }
  }
}
