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

open class NavigationMeshInstance(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var enabled: Boolean
    get() {
       return isEnabled() 
    }
    set(value) {
      setEnabled(value)
    }

  var navmesh: NavigationMesh
    get() {
       return getNavigationMesh() 
    }
    set(value) {
      setNavigationMesh(value)
    }

  fun getNavigationMesh(): NavigationMesh {
    val _ret = __method_bind.getNavigationMesh.call(this._handle)
    return _ret.asObject(::NavigationMesh)!!
  }

  fun isEnabled(): Boolean {
    val _ret = __method_bind.isEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setEnabled.call(this._handle, _arg, 1)
  }

  fun setNavigationMesh(navmesh: NavigationMesh) {
    val _arg = Variant.new(navmesh)
    __method_bind.setNavigationMesh.call(this._handle, _arg, 1)
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
      val getNavigationMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMeshInstance".cstr.ptr,
            "get_navigation_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_navigation_mesh" }
        }
      val isEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMeshInstance".cstr.ptr,
            "is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_enabled" }
        }
      val setEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMeshInstance".cstr.ptr,
            "set_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enabled" }
        }
      val setNavigationMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMeshInstance".cstr.ptr,
            "set_navigation_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_navigation_mesh" }
        }}
  }
}
