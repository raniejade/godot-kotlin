// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
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
    val _ret = __method_bind.get_config_file.call(this.toVariant())
    return _ret.asObject(::ConfigFile)!!
  }

  fun getCurrentDependencies(): PoolStringArray {
    val _ret = __method_bind.get_current_dependencies.call(this.toVariant())
    return _ret.asPoolStringArray()
  }

  fun getCurrentLibraryPath(): String {
    val _ret = __method_bind.get_current_library_path.call(this.toVariant())
    return _ret.asString()
  }

  fun getSymbolPrefix(): String {
    val _ret = __method_bind.get_symbol_prefix.call(this.toVariant())
    return _ret.asString()
  }

  fun isReloadable(): Boolean {
    val _ret = __method_bind.is_reloadable.call(this.toVariant())
    return _ret.asBool()
  }

  fun isSingleton(): Boolean {
    val _ret = __method_bind.is_singleton.call(this.toVariant())
    return _ret.asBool()
  }

  fun setConfigFile(configFile: ConfigFile) {
    val _args = VariantArray.new()
    _args.append(configFile)
    __method_bind.set_config_file.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setLoadOnce(loadOnce: Boolean) {
    val _args = VariantArray.new()
    _args.append(loadOnce)
    __method_bind.set_load_once.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setReloadable(reloadable: Boolean) {
    val _args = VariantArray.new()
    _args.append(reloadable)
    __method_bind.set_reloadable.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setSingleton(singleton: Boolean) {
    val _args = VariantArray.new()
    _args.append(singleton)
    __method_bind.set_singleton.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setSymbolPrefix(symbolPrefix: String) {
    val _args = VariantArray.new()
    _args.append(symbolPrefix)
    __method_bind.set_symbol_prefix.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun shouldLoadOnce(): Boolean {
    val _ret = __method_bind.should_load_once.call(this.toVariant())
    return _ret.asBool()
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
