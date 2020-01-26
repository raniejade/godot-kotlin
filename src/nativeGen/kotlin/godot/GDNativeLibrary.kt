// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class GDNativeLibrary internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getConfigFile(): ConfigFile {
    TODO()
  }

  fun getCurrentDependencies(): PoolStringArray {
    TODO()
  }

  fun getCurrentLibraryPath(): String {
    TODO()
  }

  fun getSymbolPrefix(): String {
    TODO()
  }

  fun isReloadable(): Boolean {
    TODO()
  }

  fun isSingleton(): Boolean {
    TODO()
  }

  fun setConfigFile(config_file: ConfigFile) {
    TODO()
  }

  fun setLoadOnce(load_once: Boolean) {
    TODO()
  }

  fun setReloadable(reloadable: Boolean) {
    TODO()
  }

  fun setSingleton(singleton: Boolean) {
    TODO()
  }

  fun setSymbolPrefix(symbol_prefix: String) {
    TODO()
  }

  fun shouldLoadOnce(): Boolean {
    TODO()
  }

  companion object {
    fun new(): GDNativeLibrary = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("GDNativeLibrary".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton GDNativeLibrary" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GDNativeLibrary(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): GDNativeLibrary = GDNativeLibrary(ptr)
    /**
     * Container for method_bind pointers for GDNativeLibrary
     */
    private object __method_bind {
      val get_config_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "get_config_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_config_file" }
            }
          }

      val get_current_dependencies: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "get_current_dependencies".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_dependencies" }
            }
          }

      val get_current_library_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "get_current_library_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_library_path" }
            }
          }

      val get_symbol_prefix: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "get_symbol_prefix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_symbol_prefix" }
            }
          }

      val is_reloadable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "is_reloadable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_reloadable" }
            }
          }

      val is_singleton: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "is_singleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_singleton" }
            }
          }

      val set_config_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "set_config_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_config_file" }
            }
          }

      val set_load_once: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "set_load_once".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_load_once" }
            }
          }

      val set_reloadable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "set_reloadable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_reloadable" }
            }
          }

      val set_singleton: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "set_singleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_singleton" }
            }
          }

      val set_symbol_prefix: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "set_symbol_prefix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_symbol_prefix" }
            }
          }

      val should_load_once: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "should_load_once".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method should_load_once" }
            }
          }
    }
  }
}
