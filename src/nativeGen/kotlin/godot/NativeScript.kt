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

open class NativeScript internal constructor(
  _handle: COpaquePointer
) : Script(_handle) {
  companion object {
    fun new(): NativeScript = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("NativeScript".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton NativeScript" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NativeScript(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for NativeScript
     */
    private object __method_bind {
      val get_class_documentation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_class_documentation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_class_documentation" }
            }
          }

      val get_class_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_class_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_class_name" }
            }
          }

      val get_library: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_library".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_library" }
            }
          }

      val get_method_documentation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_method_documentation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_method_documentation" }
            }
          }

      val get_property_documentation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_property_documentation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_property_documentation" }
            }
          }

      val get_script_class_icon_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_script_class_icon_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_script_class_icon_path" }
            }
          }

      val get_script_class_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_script_class_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_script_class_name" }
            }
          }

      val get_signal_documentation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_signal_documentation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_signal_documentation" }
            }
          }

      val new: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "new".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method new" }
            }
          }

      val set_class_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "set_class_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_class_name" }
            }
          }

      val set_library: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "set_library".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_library" }
            }
          }

      val set_script_class_icon_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "set_script_class_icon_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_script_class_icon_path" }
            }
          }

      val set_script_class_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "set_script_class_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_script_class_name" }
            }
          }
    }
  }
}
