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

open class GDNativeLibrary(
  _handle: COpaquePointer
) : Resource(_handle) {
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

  fun getConfigFile(): ConfigFile {
    val _ret = __method_bind.getConfigFile.call(this._handle)
    return _ret.asObject(::ConfigFile)!!
  }

  fun getCurrentDependencies(): PoolStringArray {
    val _ret = __method_bind.getCurrentDependencies.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getCurrentLibraryPath(): String {
    val _ret = __method_bind.getCurrentLibraryPath.call(this._handle)
    return _ret.asString()
  }

  fun getSymbolPrefix(): String {
    val _ret = __method_bind.getSymbolPrefix.call(this._handle)
    return _ret.asString()
  }

  fun isReloadable(): Boolean {
    val _ret = __method_bind.isReloadable.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSingleton(): Boolean {
    val _ret = __method_bind.isSingleton.call(this._handle)
    return _ret.asBoolean()
  }

  fun setConfigFile(configFile: ConfigFile) {
    val _arg = Variant.new(configFile)
    __method_bind.setConfigFile.call(this._handle, _arg, 1)
  }

  fun setLoadOnce(loadOnce: Boolean) {
    val _arg = Variant.new(loadOnce)
    __method_bind.setLoadOnce.call(this._handle, _arg, 1)
  }

  fun setReloadable(reloadable: Boolean) {
    val _arg = Variant.new(reloadable)
    __method_bind.setReloadable.call(this._handle, _arg, 1)
  }

  fun setSingleton(singleton: Boolean) {
    val _arg = Variant.new(singleton)
    __method_bind.setSingleton.call(this._handle, _arg, 1)
  }

  fun setSymbolPrefix(symbolPrefix: String) {
    val _arg = Variant.new(symbolPrefix)
    __method_bind.setSymbolPrefix.call(this._handle, _arg, 1)
  }

  fun shouldLoadOnce(): Boolean {
    val _ret = __method_bind.shouldLoadOnce.call(this._handle)
    return _ret.asBoolean()
  }

  companion object {
    fun new(): GDNativeLibrary = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("GDNativeLibrary".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GDNativeLibrary" }
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
      val getConfigFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
            "getConfigFile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConfigFile" }
        }
      val getCurrentDependencies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
            "getCurrentDependencies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentDependencies" }
        }
      val getCurrentLibraryPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
            "getCurrentLibraryPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentLibraryPath" }
        }
      val getSymbolPrefix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
            "getSymbolPrefix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSymbolPrefix" }
        }
      val isReloadable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
            "isReloadable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isReloadable" }
        }
      val isSingleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
            "isSingleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSingleton" }
        }
      val setConfigFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
            "setConfigFile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setConfigFile" }
        }
      val setLoadOnce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
            "setLoadOnce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLoadOnce" }
        }
      val setReloadable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
            "setReloadable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setReloadable" }
        }
      val setSingleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
            "setSingleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSingleton" }
        }
      val setSymbolPrefix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
            "setSymbolPrefix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSymbolPrefix" }
        }
      val shouldLoadOnce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDNativeLibrary".cstr.ptr,
            "shouldLoadOnce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shouldLoadOnce" }
        }}
  }
}
