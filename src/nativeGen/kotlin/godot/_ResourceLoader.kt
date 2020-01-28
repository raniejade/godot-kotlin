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

open class _ResourceLoader(
  _handle: COpaquePointer
) : Object(_handle) {
  fun exists(path: String, typeHint: String): Boolean {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(typeHint)
    val _ret = __method_bind.exists.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun getDependencies(path: String): PoolStringArray {
    val _arg = Variant.new(path)
    val _ret = __method_bind.getDependencies.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getRecognizedExtensionsForType(type: String): PoolStringArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.getRecognizedExtensionsForType.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun has(path: String): Boolean {
    val _arg = Variant.new(path)
    val _ret = __method_bind.has.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasCached(path: String): Boolean {
    val _arg = Variant.new(path)
    val _ret = __method_bind.hasCached.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun load(
    path: String,
    typeHint: String,
    noCache: Boolean
  ): Resource {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(typeHint)
    _args.append(noCache)
    val _ret = __method_bind.load.call(this._handle, _args.toVariant(), 3)
    return _ret.asObject(::Resource)!!
  }

  fun loadInteractive(path: String, typeHint: String): ResourceInteractiveLoader {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(typeHint)
    val _ret = __method_bind.loadInteractive.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::ResourceInteractiveLoader)!!
  }

  fun setAbortOnMissingResources(abort: Boolean) {
    val _arg = Variant.new(abort)
    __method_bind.setAbortOnMissingResources.call(this._handle, _arg, 1)
  }

  companion object {
    val Instance: _ResourceLoader
      get() = memScoped {
        val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("_ResourceLoader".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton _ResourceLoader" }
        _ResourceLoader(
          handle
        )
      }
    /**
     * Container for method_bind pointers for _ResourceLoader
     */
    private object __method_bind {
      val exists: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "exists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method exists" }
        }
      val getDependencies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "getDependencies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDependencies" }
        }
      val getRecognizedExtensionsForType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "getRecognizedExtensionsForType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRecognizedExtensionsForType" }
        }
      val has: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "has".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has" }
        }
      val hasCached: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "hasCached".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasCached" }
        }
      val load: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "load".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load" }
        }
      val loadInteractive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "loadInteractive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method loadInteractive" }
        }
      val setAbortOnMissingResources: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "setAbortOnMissingResources".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAbortOnMissingResources" }
        }}
  }
}
