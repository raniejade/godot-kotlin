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

open class _ResourceLoader internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun exists(path: String, typeHint: String): Boolean {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(typeHint)
    val _ret = __method_bind.exists.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun getDependencies(path: String): PoolStringArray {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.get_dependencies.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getRecognizedExtensionsForType(type: String): PoolStringArray {
    val _args = VariantArray.new()
    _args.append(type)
    val _ret = __method_bind.get_recognized_extensions_for_type.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun has(path: String): Boolean {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.has.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun hasCached(path: String): Boolean {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.has_cached.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
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
    val _ret = __method_bind.load.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun loadInteractive(path: String, typeHint: String): ResourceInteractiveLoader {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(typeHint)
    val _ret = __method_bind.load_interactive.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setAbortOnMissingResources(abort: Boolean) {
    val _args = VariantArray.new()
    _args.append(abort)
    val _ret = __method_bind.set_abort_on_missing_resources.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  companion object {
    val Instance: _ResourceLoader = memScoped {
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
      val exists: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
              "exists".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method exists" }
            }
          }

      val get_dependencies: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
              "get_dependencies".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dependencies" }
            }
          }

      val get_recognized_extensions_for_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
              "get_recognized_extensions_for_type".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_recognized_extensions_for_type" }
            }
          }

      val has: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
              "has".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has" }
            }
          }

      val has_cached: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
              "has_cached".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_cached" }
            }
          }

      val load: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
              "load".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load" }
            }
          }

      val load_interactive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
              "load_interactive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load_interactive" }
            }
          }

      val set_abort_on_missing_resources: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
              "set_abort_on_missing_resources".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_abort_on_missing_resources"
              }
            }
          }
    }
  }
}
