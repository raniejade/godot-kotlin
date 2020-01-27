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

open class NavigationPolygonInstance internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getNavigationPolygon(): NavigationPolygon {
    val _ret = __method_bind.get_navigation_polygon.call(this.toVariant())
    return _ret.asObject(::NavigationPolygon)!!
  }

  fun isEnabled(): Boolean {
    val _ret = __method_bind.is_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun setEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_enabled.call(this.toVariant(), _arg, 1)
  }

  fun setNavigationPolygon(navpoly: NavigationPolygon) {
    val _arg = Variant.new(navpoly)
    __method_bind.set_navigation_polygon.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): NavigationPolygonInstance = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationPolygonInstance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NavigationPolygonInstance" }
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
