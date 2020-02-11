// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
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

open class ResourcePreloader(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addResource(name: String, resource: Resource) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(resource))
    __method_bind.addResource.call(this._handle, _args)
  }

  fun getResource(name: String): Resource {
    val _arg = Variant(name)
    val _ret = __method_bind.getResource.call(this._handle, listOf(_arg))
    return _ret.toAny() as Resource
  }

  fun getResourceList(): PoolStringArray {
    val _ret = __method_bind.getResourceList.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun hasResource(name: String): Boolean {
    val _arg = Variant(name)
    val _ret = __method_bind.hasResource.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun removeResource(name: String) {
    val _arg = Variant(name)
    __method_bind.removeResource.call(this._handle, listOf(_arg))
  }

  fun renameResource(name: String, newname: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(newname))
    __method_bind.renameResource.call(this._handle, _args)
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
      val addResource: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
            "add_resource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_resource" }
        }
      val getResource: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
            "get_resource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_resource" }
        }
      val getResourceList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
            "get_resource_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_resource_list" }
        }
      val hasResource: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
            "has_resource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_resource" }
        }
      val removeResource: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
            "remove_resource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_resource" }
        }
      val renameResource: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
            "rename_resource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rename_resource" }
        }}
  }
}
