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

open class ResourceLoaderInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun exists(path: String, typeHint: String = ""): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(typeHint)
      __method_bind.exists.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun getDependencies(path: String): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getDependencies.call(self._handle, listOf(path), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRecognizedExtensionsForType(type: String): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getRecognizedExtensionsForType.call(self._handle, listOf(type), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun has(path: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.has.call(self._handle, listOf(path), _retPtr)
      _ret.value
    }
  }

  fun hasCached(path: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasCached.call(self._handle, listOf(path), _retPtr)
      _ret.value
    }
  }

  fun load(
    path: String,
    typeHint: String = "",
    noCache: Boolean = false
  ): Resource {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Resource
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(typeHint)
      _args.add(noCache)
      __method_bind.load.call(self._handle, _args, _retPtr)
      _ret = objectToType<Resource>(_tmp.value!!)
      _ret
    }
  }

  fun loadInteractive(path: String, typeHint: String = ""): ResourceInteractiveLoader {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ResourceInteractiveLoader
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(typeHint)
      __method_bind.loadInteractive.call(self._handle, _args, _retPtr)
      _ret = objectToType<ResourceInteractiveLoader>(_tmp.value!!)
      _ret
    }
  }

  fun setAbortOnMissingResources(abort: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAbortOnMissingResources.call(self._handle, listOf(abort), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for ResourceLoader
     */
    private object __method_bind {
      val exists: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "exists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method exists" }
        }
      val getDependencies: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "get_dependencies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dependencies" }
        }
      val getRecognizedExtensionsForType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "get_recognized_extensions_for_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_recognized_extensions_for_type"
            }
        }
      val has: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "has".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has" }
        }
      val hasCached: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "has_cached".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_cached" }
        }
      val load: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "load".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load" }
        }
      val loadInteractive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "load_interactive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load_interactive" }
        }
      val setAbortOnMissingResources: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceLoader".cstr.ptr,
            "set_abort_on_missing_resources".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_abort_on_missing_resources" }
        }}
  }
}

object ResourceLoader : ResourceLoaderInternal(null) {
  init {
    Allocator.allocationScope {
      val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("ResourceLoader".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton ResourceLoader" }
      _handle = handle
    }
  }
}
