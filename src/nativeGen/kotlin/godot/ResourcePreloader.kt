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

open class ResourcePreloader internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun addResource(name: String, resource: Resource) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(resource)
    __method_bind.add_resource.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun getResource(name: String): Resource {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.get_resource.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asObject(::Resource)!!
  }

  fun getResourceList(): PoolStringArray {
    val _ret = __method_bind.get_resource_list.call(this.toVariant())
    return _ret.asPoolStringArray()
  }

  fun hasResource(name: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.has_resource.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun removeResource(name: String) {
    val _args = VariantArray.new()
    _args.append(name)
    __method_bind.remove_resource.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun renameResource(name: String, newname: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(newname)
    __method_bind.rename_resource.call(this.toVariant(), _args.toVariant(), 2)
  }

  companion object {
    fun new(): ResourcePreloader = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ResourcePreloader".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ResourcePreloader" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ResourcePreloader(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ResourcePreloader = ResourcePreloader(ptr)
    /**
     * Container for method_bind pointers for ResourcePreloader
     */
    private object __method_bind {
      val add_resource: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
              "add_resource".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_resource" }
            }
          }

      val get_resource: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
              "get_resource".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resource" }
            }
          }

      val get_resource_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
              "get_resource_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resource_list" }
            }
          }

      val has_resource: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
              "has_resource".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_resource" }
            }
          }

      val remove_resource: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
              "remove_resource".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_resource" }
            }
          }

      val rename_resource: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
              "rename_resource".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_resource" }
            }
          }
    }
  }
}
