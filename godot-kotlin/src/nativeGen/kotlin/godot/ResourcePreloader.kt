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

open class ResourcePreloader(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _get_resources(): VariantArray {
    TODO()
  }

  open fun _set_resources(arg0: VariantArray) {
    TODO()
  }

  fun addResource(name: String, resource: Resource) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(resource)
      __method_bind.addResource.call(self._handle, _args, null)
    }
  }

  fun getResource(name: String): Resource {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Resource
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getResource.call(self._handle, listOf(name), _retPtr)
      _ret = objectToType<Resource>(_tmp.value!!)
      _ret
    }
  }

  fun getResourceList(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getResourceList.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun hasResource(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasResource.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun removeResource(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeResource.call(self._handle, listOf(name), null)
    }
  }

  fun renameResource(name: String, newname: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(newname)
      __method_bind.renameResource.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ResourcePreloader".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ResourcePreloader" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ResourcePreloader
     */
    private object __method_bind {
      val addResource: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
              "add_resource".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_resource" }
            }
          }

      val getResource: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
              "get_resource".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resource" }
            }
          }

      val getResourceList: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
              "get_resource_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resource_list" }
            }
          }

      val hasResource: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
              "has_resource".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_resource" }
            }
          }

      val removeResource: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
              "remove_resource".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_resource" }
            }
          }

      val renameResource: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
              "rename_resource".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_resource" }
            }
          }
    }
  }
}
