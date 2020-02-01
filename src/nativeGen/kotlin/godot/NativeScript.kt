// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Any
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NativeScript(
  _handle: COpaquePointer
) : Script(_handle) {
  var className: String
    get() {
       return getClassName() 
    }
    set(value) {
      setClassName(value)
    }

  var library: GDNativeLibrary
    get() {
       return getLibrary() 
    }
    set(value) {
      setLibrary(value)
    }

  var scriptClassIconPath: String
    get() {
       return getScriptClassIconPath() 
    }
    set(value) {
      setScriptClassIconPath(value)
    }

  var scriptClassName: String
    get() {
       return getScriptClassName() 
    }
    set(value) {
      setScriptClassName(value)
    }

  fun getClassDocumentation(): String {
    val _ret = __method_bind.getClassDocumentation.call(this._handle)
    return _ret.asString()
  }

  fun getClassName(): String {
    val _ret = __method_bind.getClassName.call(this._handle)
    return _ret.asString()
  }

  fun getLibrary(): GDNativeLibrary {
    val _ret = __method_bind.getLibrary.call(this._handle)
    return _ret.asObject(::GDNativeLibrary)!!
  }

  fun getMethodDocumentation(method: String): String {
    val _arg = Variant.new(method)
    val _ret = __method_bind.getMethodDocumentation.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getPropertyDocumentation(path: String): String {
    val _arg = Variant.new(path)
    val _ret = __method_bind.getPropertyDocumentation.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getScriptClassIconPath(): String {
    val _ret = __method_bind.getScriptClassIconPath.call(this._handle)
    return _ret.asString()
  }

  fun getScriptClassName(): String {
    val _ret = __method_bind.getScriptClassName.call(this._handle)
    return _ret.asString()
  }

  fun getSignalDocumentation(signalName: String): String {
    val _arg = Variant.new(signalName)
    val _ret = __method_bind.getSignalDocumentation.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun new(vararg varargs: Any?): Variant {
    val _args = mutableListOf<Variant>()
    varargs.forEach { _args.add(Variant.fromAny(it)) }
    val _ret = __method_bind.new.call(this._handle, _args)
    return _ret
  }

  fun setClassName(className: String) {
    val _arg = Variant.new(className)
    __method_bind.setClassName.call(this._handle, listOf(_arg))
  }

  fun setLibrary(library: GDNativeLibrary) {
    val _arg = Variant.new(library)
    __method_bind.setLibrary.call(this._handle, listOf(_arg))
  }

  fun setScriptClassIconPath(iconPath: String) {
    val _arg = Variant.new(iconPath)
    __method_bind.setScriptClassIconPath.call(this._handle, listOf(_arg))
  }

  fun setScriptClassName(className: String) {
    val _arg = Variant.new(className)
    __method_bind.setScriptClassName.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): NativeScript = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("NativeScript".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NativeScript" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NativeScript(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): NativeScript = NativeScript(ptr)
    /**
     * Container for method_bind pointers for NativeScript
     */
    private object __method_bind {
      val getClassDocumentation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_class_documentation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_class_documentation" }
        }
      val getClassName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_class_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_class_name" }
        }
      val getLibrary: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_library".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_library" }
        }
      val getMethodDocumentation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_method_documentation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_method_documentation" }
        }
      val getPropertyDocumentation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_property_documentation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_property_documentation" }
        }
      val getScriptClassIconPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_script_class_icon_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_class_icon_path" }
        }
      val getScriptClassName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_script_class_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_class_name" }
        }
      val getSignalDocumentation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_signal_documentation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_signal_documentation" }
        }
      val new: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "new".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method new" }
        }
      val setClassName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "set_class_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_class_name" }
        }
      val setLibrary: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "set_library".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_library" }
        }
      val setScriptClassIconPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "set_script_class_icon_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_script_class_icon_path" }
        }
      val setScriptClassName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "set_script_class_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_script_class_name" }
        }}
  }
}
