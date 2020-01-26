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

open class NavigationPolygonInstance internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getNavigationPolygon(): NavigationPolygon {
    TODO()
  }

  fun isEnabled(): Boolean {
    TODO()
  }

  fun setEnabled(enabled: Boolean) {
    TODO()
  }

  fun setNavigationPolygon(navpoly: NavigationPolygon) {
    TODO()
  }

  companion object {
    fun new(): NavigationPolygonInstance = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationPolygonInstance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton NavigationPolygonInstance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NavigationPolygonInstance(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): NavigationPolygonInstance = NavigationPolygonInstance(ptr)
    /**
     * Container for method_bind pointers for NavigationPolygonInstance
     */
    private object __method_bind {
      val get_navigation_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygonInstance".cstr.ptr,
              "get_navigation_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_navigation_polygon" }
            }
          }

      val is_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygonInstance".cstr.ptr,
              "is_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_enabled" }
            }
          }

      val set_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygonInstance".cstr.ptr,
              "set_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enabled" }
            }
          }

      val set_navigation_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygonInstance".cstr.ptr,
              "set_navigation_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_navigation_polygon" }
            }
          }
    }
  }
}
