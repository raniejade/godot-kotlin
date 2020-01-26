// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NavigationPolygon internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    fun new(): NavigationPolygon = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationPolygon".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton NavigationPolygon" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NavigationPolygon(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for NavigationPolygon
     */
    private object __method_bind {
      val _get_outlines: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "_get_outlines".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_outlines" }
            }
          }

      val _get_polygons: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "_get_polygons".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_polygons" }
            }
          }

      val _set_outlines: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "_set_outlines".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_outlines" }
            }
          }

      val _set_polygons: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "_set_polygons".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_polygons" }
            }
          }

      val add_outline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "add_outline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_outline" }
            }
          }

      val add_outline_at_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "add_outline_at_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_outline_at_index" }
            }
          }

      val add_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "add_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_polygon" }
            }
          }

      val clear_outlines: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "clear_outlines".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_outlines" }
            }
          }

      val clear_polygons: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "clear_polygons".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_polygons" }
            }
          }

      val get_outline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "get_outline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_outline" }
            }
          }

      val get_outline_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "get_outline_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_outline_count" }
            }
          }

      val get_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "get_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_polygon" }
            }
          }

      val get_polygon_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "get_polygon_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_polygon_count" }
            }
          }

      val get_vertices: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "get_vertices".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertices" }
            }
          }

      val make_polygons_from_outlines: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "make_polygons_from_outlines".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_polygons_from_outlines" }
            }
          }

      val remove_outline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "remove_outline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_outline" }
            }
          }

      val set_outline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "set_outline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_outline" }
            }
          }

      val set_vertices: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "set_vertices".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertices" }
            }
          }
    }
  }
}
