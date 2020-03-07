// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Any
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

open class NativeScript(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Script(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getClassDocumentation(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getClassDocumentation.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getClassName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getClassName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getLibrary(): GDNativeLibrary {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: GDNativeLibrary
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getLibrary.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<GDNativeLibrary>(_tmp.value!!)
      _ret
    }
  }

  fun getMethodDocumentation(method: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getMethodDocumentation.call(self._handle, listOf(method), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getPropertyDocumentation(path: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getPropertyDocumentation.call(self._handle, listOf(path), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getScriptClassIconPath(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getScriptClassIconPath.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getScriptClassName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getScriptClassName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getSignalDocumentation(signalName: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getSignalDocumentation.call(self._handle, listOf(signalName), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun new(vararg varargs: Any?): Variant {
    val _args = mutableListOf<Variant>()
    varargs.forEach { _args.add(Variant.fromAny(it)) }
    val _ret = __method_bind.new.slowcall(this._handle, _args)
    return _ret
  }

  fun setClassName(className: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setClassName.call(self._handle, listOf(className), null)
    }
  }

  fun setLibrary(library: GDNativeLibrary) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLibrary.call(self._handle, listOf(library), null)
    }
  }

  fun setScriptClassIconPath(iconPath: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScriptClassIconPath.call(self._handle, listOf(iconPath), null)
    }
  }

  fun setScriptClassName(className: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScriptClassName.call(self._handle, listOf(className), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("NativeScript".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NativeScript" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for NativeScript
     */
    private object __method_bind {
      val getClassDocumentation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_class_documentation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_class_documentation" }
            }
          }

      val getClassName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_class_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_class_name" }
            }
          }

      val getLibrary: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_library".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_library" }
            }
          }

      val getMethodDocumentation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_method_documentation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_method_documentation" }
            }
          }

      val getPropertyDocumentation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_property_documentation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_property_documentation" }
            }
          }

      val getScriptClassIconPath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_script_class_icon_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_script_class_icon_path" }
            }
          }

      val getScriptClassName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_script_class_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_script_class_name" }
            }
          }

      val getSignalDocumentation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "get_signal_documentation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_signal_documentation" }
            }
          }

      val new: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "new".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method new" }
            }
          }

      val setClassName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "set_class_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_class_name" }
            }
          }

      val setLibrary: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "set_library".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_library" }
            }
          }

      val setScriptClassIconPath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "set_script_class_icon_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_script_class_icon_path" }
            }
          }

      val setScriptClassName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NativeScript".cstr.ptr,
              "set_script_class_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_script_class_name" }
            }
          }
    }
  }
}
