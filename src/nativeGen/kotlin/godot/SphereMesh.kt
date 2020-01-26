// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SphereMesh internal constructor(
  _handle: COpaquePointer
) : PrimitiveMesh(_handle) {
  fun getHeight(): Float {
    TODO()
  }

  fun getIsHemisphere(): Boolean {
    TODO()
  }

  fun getRadialSegments(): Int {
    TODO()
  }

  fun getRadius(): Float {
    TODO()
  }

  fun getRings(): Int {
    TODO()
  }

  fun setHeight(height: Float) {
    TODO()
  }

  fun setIsHemisphere(is_hemisphere: Boolean) {
    TODO()
  }

  fun setRadialSegments(radial_segments: Int) {
    TODO()
  }

  fun setRadius(radius: Float) {
    TODO()
  }

  fun setRings(rings: Int) {
    TODO()
  }

  companion object {
    fun new(): SphereMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SphereMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton SphereMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SphereMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SphereMesh = SphereMesh(ptr)
    /**
     * Container for method_bind pointers for SphereMesh
     */
    private object __method_bind {
      val get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val get_is_hemisphere: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
              "get_is_hemisphere".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_is_hemisphere" }
            }
          }

      val get_radial_segments: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
              "get_radial_segments".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_radial_segments" }
            }
          }

      val get_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
              "get_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_radius" }
            }
          }

      val get_rings: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
              "get_rings".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rings" }
            }
          }

      val set_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
              "set_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_height" }
            }
          }

      val set_is_hemisphere: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
              "set_is_hemisphere".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_is_hemisphere" }
            }
          }

      val set_radial_segments: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
              "set_radial_segments".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_radial_segments" }
            }
          }

      val set_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
              "set_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_radius" }
            }
          }

      val set_rings: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
              "set_rings".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rings" }
            }
          }
    }
  }
}
