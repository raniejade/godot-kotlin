// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class _ResourceLoaderInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun exists(path: String, typeHint: String = ""): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(typeHint))
    val _ret = __method_bind.exists.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun getDependencies(path: String): PoolStringArray {
    val _arg = Variant(path)
    val _ret = __method_bind.getDependencies.call(this._handle, listOf(_arg))
    return _ret.asPoolStringArray()
  }

  fun getRecognizedExtensionsForType(type: String): PoolStringArray {
    val _arg = Variant(type)
    val _ret = __method_bind.getRecognizedExtensionsForType.call(this._handle, listOf(_arg))
    return _ret.asPoolStringArray()
  }

  fun has(path: String): Boolean {
    val _arg = Variant(path)
    val _ret = __method_bind.has.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun hasCached(path: String): Boolean {
    val _arg = Variant(path)
    val _ret = __method_bind.hasCached.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun load(
    path: String,
    typeHint: String = "",
    noCache: Boolean = false
  ): Resource {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(typeHint))
    _args.add(Variant.fromAny(noCache))
    val _ret = __method_bind.load.call(this._handle, _args)
    return _ret.toAny() as Resource
  }

  fun loadInteractive(path: String, typeHint: String = ""): ResourceInteractiveLoader {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(typeHint))
    val _ret = __method_bind.loadInteractive.call(this._handle, _args)
    return _ret.toAny() as ResourceInteractiveLoader
  }

  fun setAbortOnMissingResources(abort: Boolean) {
    val _arg = Variant(abort)
    __method_bind.setAbortOnMissingResources.call(this._handle, listOf(_arg))
  }

  companion object {
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
            "get_dependencies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dependencies" }
        }
      val getRecognizedExtensionsForType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "get_recognized_extensions_for_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_recognized_extensions_for_type"
            }
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
            "has_cached".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_cached" }
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
            "load_interactive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load_interactive" }
        }
      val setAbortOnMissingResources: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "set_abort_on_missing_resources".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_abort_on_missing_resources" }
        }}
  }
}

object _ResourceLoader : _ResourceLoaderInternal(null) {
  init {
    memScoped {
      val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("_ResourceLoader".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton _ResourceLoader" }
      _handle = handle
    }
  }
}
