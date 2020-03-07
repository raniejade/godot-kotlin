// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class GDNativeLibrary(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var configFile: ConfigFile
    get() {
       return getConfigFile() 
    }
    set(value) {
      setConfigFile(value)
    }

  var loadOnce: Boolean
    get() {
       return shouldLoadOnce() 
    }
    set(value) {
      setLoadOnce(value)
    }

  var reloadable: Boolean
    get() {
       return isReloadable() 
    }
    set(value) {
      setReloadable(value)
    }

  var singleton: Boolean
    get() {
       return isSingleton() 
    }
    set(value) {
      setSingleton(value)
    }

  var symbolPrefix: String
    get() {
       return getSymbolPrefix() 
    }
    set(value) {
      setSymbolPrefix(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getConfigFile(): ConfigFile {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ConfigFile
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getConfigFile.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<ConfigFile>(_tmp.value!!)
      _ret
    }
  }

  fun getCurrentDependencies(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getCurrentDependencies.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCurrentLibraryPath(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getCurrentLibraryPath.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getSymbolPrefix(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getSymbolPrefix.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun isReloadable(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isReloadable.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSingleton(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSingleton.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setConfigFile(configFile: ConfigFile) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setConfigFile.call(self._handle, listOf(configFile), null)
    }
  }

  fun setLoadOnce(loadOnce: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLoadOnce.call(self._handle, listOf(loadOnce), null)
    }
  }

  fun setReloadable(reloadable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setReloadable.call(self._handle, listOf(reloadable), null)
    }
  }

  fun setSingleton(singleton: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSingleton.call(self._handle, listOf(singleton), null)
    }
  }

  fun setSymbolPrefix(symbolPrefix: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSymbolPrefix.call(self._handle, listOf(symbolPrefix), null)
    }
  }

  fun shouldLoadOnce(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.shouldLoadOnce.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("GDNativeLibrary".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GDNativeLibrary" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for GDNativeLibrary
     */
    private object __method_bind {
      val getConfigFile: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "get_config_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_config_file" }
            }
          }

      val getCurrentDependencies: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "get_current_dependencies".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_dependencies" }
            }
          }

      val getCurrentLibraryPath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "get_current_library_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_library_path" }
            }
          }

      val getSymbolPrefix: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "get_symbol_prefix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_symbol_prefix" }
            }
          }

      val isReloadable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "is_reloadable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_reloadable" }
            }
          }

      val isSingleton: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "is_singleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_singleton" }
            }
          }

      val setConfigFile: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "set_config_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_config_file" }
            }
          }

      val setLoadOnce: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "set_load_once".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_load_once" }
            }
          }

      val setReloadable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "set_reloadable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_reloadable" }
            }
          }

      val setSingleton: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "set_singleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_singleton" }
            }
          }

      val setSymbolPrefix: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "set_symbol_prefix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_symbol_prefix" }
            }
          }

      val shouldLoadOnce: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
              "should_load_once".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method should_load_once" }
            }
          }
    }
  }
}
