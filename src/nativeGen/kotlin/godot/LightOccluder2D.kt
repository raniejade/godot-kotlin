// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class LightOccluder2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun polyChanged() {
    TODO()
  }

  fun getOccluderLightMask(): Int {
    TODO()
  }

  fun getOccluderPolygon(): OccluderPolygon2D {
    TODO()
  }

  fun setOccluderLightMask() {
    TODO()
  }

  fun setOccluderPolygon() {
    TODO()
  }

  companion object {
    fun new(): LightOccluder2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("LightOccluder2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton LightOccluder2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      LightOccluder2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for LightOccluder2D
     */
    private object __method_bind {
      val _poly_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LightOccluder2D".cstr.ptr,
              "_poly_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _poly_changed" }
            }
          }

      val get_occluder_light_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LightOccluder2D".cstr.ptr,
              "get_occluder_light_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_occluder_light_mask" }
            }
          }

      val get_occluder_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LightOccluder2D".cstr.ptr,
              "get_occluder_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_occluder_polygon" }
            }
          }

      val set_occluder_light_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LightOccluder2D".cstr.ptr,
              "set_occluder_light_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_occluder_light_mask" }
            }
          }

      val set_occluder_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LightOccluder2D".cstr.ptr,
              "set_occluder_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_occluder_polygon" }
            }
          }
    }
  }
}
