// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.String
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
  fun getClassDocumentation(): String {
    TODO()
  }

  fun getClassName(): String {
    TODO()
  }

  fun getLibrary(): GDNativeLibrary {
    TODO()
  }

  fun getMethodDocumentation(method: String): String {
    TODO()
  }

  fun getPropertyDocumentation(path: String): String {
    TODO()
  }

  fun getScriptClassIconPath(): String {
    TODO()
  }

  fun getScriptClassName(): String {
    TODO()
  }

  fun getSignalDocumentation(signal_name: String): String {
    TODO()
  }

  fun new(): Object {
    TODO()
  }

  fun setClassName(class_name: String) {
    TODO()
  }

  fun setLibrary(library: GDNativeLibrary) {
    TODO()
  }

  fun setScriptClassIconPath(icon_path: String) {
    TODO()
  }

  fun setScriptClassName(class_name: String) {
    TODO()
  }

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
