// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
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
    TODO()
  }

  fun getResource(name: String): Resource {
    TODO()
  }

  fun getResourceList(): PoolStringArray {
    TODO()
  }

  fun hasResource(name: String): Boolean {
    TODO()
  }

  fun removeResource(name: String) {
    TODO()
  }

  fun renameResource(name: String, newname: String) {
    TODO()
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
