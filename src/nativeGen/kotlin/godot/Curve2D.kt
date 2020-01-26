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

open class Curve2D internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    fun new(): Curve2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Curve2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Curve2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Curve2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Curve2D
     */
    private object __method_bind {
      val _get_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "_get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_data" }
            }
          }

      val _set_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "_set_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_data" }
            }
          }

      val add_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "add_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_point" }
            }
          }

      val clear_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "clear_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_points" }
            }
          }

      val get_bake_interval: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_bake_interval".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bake_interval" }
            }
          }

      val get_baked_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_baked_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_baked_length" }
            }
          }

      val get_baked_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_baked_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_baked_points" }
            }
          }

      val get_closest_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_closest_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_offset" }
            }
          }

      val get_closest_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_closest_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
            }
          }

      val get_point_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_point_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_count" }
            }
          }

      val get_point_in: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_point_in".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_in" }
            }
          }

      val get_point_out: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_point_out".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_out" }
            }
          }

      val get_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_position" }
            }
          }

      val interpolate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "interpolate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate" }
            }
          }

      val interpolate_baked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "interpolate_baked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate_baked" }
            }
          }

      val interpolatef: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "interpolatef".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolatef" }
            }
          }

      val remove_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "remove_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_point" }
            }
          }

      val set_bake_interval: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "set_bake_interval".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bake_interval" }
            }
          }

      val set_point_in: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "set_point_in".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_in" }
            }
          }

      val set_point_out: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "set_point_out".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_out" }
            }
          }

      val set_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "set_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_position" }
            }
          }

      val tessellate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "tessellate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tessellate" }
            }
          }
    }
  }
}
