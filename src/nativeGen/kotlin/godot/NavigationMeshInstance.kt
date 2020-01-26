// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NavigationMeshInstance internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getNavigationMesh(): NavigationMesh {
    TODO()
  }

  fun isEnabled(): Boolean {
    TODO()
  }

  fun setEnabled() {
    TODO()
  }

  fun setNavigationMesh() {
    TODO()
  }

  companion object {
    fun new(): NavigationMeshInstance = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationMeshInstance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton NavigationMeshInstance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NavigationMeshInstance(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for NavigationMeshInstance
     */
    private object __method_bind {
      val get_navigation_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMeshInstance".cstr.ptr,
              "get_navigation_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_navigation_mesh" }
            }
          }

      val is_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMeshInstance".cstr.ptr,
              "is_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_enabled" }
            }
          }

      val set_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMeshInstance".cstr.ptr,
              "set_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enabled" }
            }
          }

      val set_navigation_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMeshInstance".cstr.ptr,
              "set_navigation_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_navigation_mesh" }
            }
          }
    }
  }
}
