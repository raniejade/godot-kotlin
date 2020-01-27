// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
    val _ret = __method_bind.get_navigation_mesh.call(this.toVariant())
    return _ret.asObject(::NavigationMesh)!!
  }

  fun isEnabled(): Boolean {
    val _ret = __method_bind.is_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun setEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_enabled.call(this.toVariant(), _arg, 1)
  }

  fun setNavigationMesh(navmesh: NavigationMesh) {
    val _arg = Variant.new(navmesh)
    __method_bind.set_navigation_mesh.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): NavigationMeshInstance = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationMeshInstance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NavigationMeshInstance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NavigationMeshInstance(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): NavigationMeshInstance = NavigationMeshInstance(ptr)
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
