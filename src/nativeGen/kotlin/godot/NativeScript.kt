// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
  fun getClassDocumentation(): String {
    val _ret = __method_bind.get_class_documentation.call(this._handle)
    return _ret.asString()
  }

  fun getClassName(): String {
    val _ret = __method_bind.get_class_name.call(this._handle)
    return _ret.asString()
  }

  fun getLibrary(): GDNativeLibrary {
    val _ret = __method_bind.get_library.call(this._handle)
    return _ret.asObject(::GDNativeLibrary)!!
  }

  fun getMethodDocumentation(method: String): String {
    val _arg = Variant.new(method)
    val _ret = __method_bind.get_method_documentation.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getPropertyDocumentation(path: String): String {
    val _arg = Variant.new(path)
    val _ret = __method_bind.get_property_documentation.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getScriptClassIconPath(): String {
    val _ret = __method_bind.get_script_class_icon_path.call(this._handle)
    return _ret.asString()
  }

  fun getScriptClassName(): String {
    val _ret = __method_bind.get_script_class_name.call(this._handle)
    return _ret.asString()
  }

  fun getSignalDocumentation(signalName: String): String {
    val _arg = Variant.new(signalName)
    val _ret = __method_bind.get_signal_documentation.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun new(): Object {
    val _ret = __method_bind.new.call(this._handle)
    return _ret.asObject(::Object)!!
  }

  fun setClassName(className: String) {
    val _arg = Variant.new(className)
    __method_bind.set_class_name.call(this._handle, _arg, 1)
  }

  fun setLibrary(library: GDNativeLibrary) {
    val _arg = Variant.new(library)
    __method_bind.set_library.call(this._handle, _arg, 1)
  }

  fun setScriptClassIconPath(iconPath: String) {
    val _arg = Variant.new(iconPath)
    __method_bind.set_script_class_icon_path.call(this._handle, _arg, 1)
  }

  fun setScriptClassName(className: String) {
    val _arg = Variant.new(className)
    __method_bind.set_script_class_name.call(this._handle, _arg, 1)
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
      val get_class_documentation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_class_documentation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_class_documentation" }
        }
      val get_class_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_class_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_class_name" }
        }
      val get_library: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_library".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_library" }
        }
      val get_method_documentation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_method_documentation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_method_documentation" }
        }
      val get_property_documentation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_property_documentation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_property_documentation" }
        }
      val get_script_class_icon_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_script_class_icon_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_class_icon_path" }
        }
      val get_script_class_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "get_script_class_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_class_name" }
        }
      val get_signal_documentation: CPointer<godot_method_bind>
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
      val set_class_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "set_class_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_class_name" }
        }
      val set_library: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "set_library".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_library" }
        }
      val set_script_class_icon_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "set_script_class_icon_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_script_class_icon_path" }
        }
      val set_script_class_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
            "set_script_class_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_script_class_name" }
        }}
  }
}
