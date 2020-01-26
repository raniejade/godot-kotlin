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

open class CSGTorus internal constructor(
  _handle: COpaquePointer
) : CSGPrimitive(_handle) {
  fun getInnerRadius(): Float {
    TODO()
  }

  fun getMaterial(): Material {
    TODO()
  }

  fun getOuterRadius(): Float {
    TODO()
  }

  fun getRingSides(): Int {
    TODO()
  }

  fun getSides(): Int {
    TODO()
  }

  fun getSmoothFaces(): Boolean {
    TODO()
  }

  fun setInnerRadius(radius: Float) {
    TODO()
  }

  fun setMaterial(material: Material) {
    TODO()
  }

  fun setOuterRadius(radius: Float) {
    TODO()
  }

  fun setRingSides(sides: Int) {
    TODO()
  }

  fun setSides(sides: Int) {
    TODO()
  }

  fun setSmoothFaces(smooth_faces: Boolean) {
    TODO()
  }

  companion object {
    fun new(): CSGTorus = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CSGTorus".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CSGTorus" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CSGTorus(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for CSGTorus
     */
    private object __method_bind {
      val get_inner_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "get_inner_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_inner_radius" }
            }
          }

      val get_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material" }
            }
          }

      val get_outer_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "get_outer_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_outer_radius" }
            }
          }

      val get_ring_sides: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "get_ring_sides".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ring_sides" }
            }
          }

      val get_sides: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "get_sides".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sides" }
            }
          }

      val get_smooth_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "get_smooth_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_smooth_faces" }
            }
          }

      val set_inner_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "set_inner_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_inner_radius" }
            }
          }

      val set_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_material" }
            }
          }

      val set_outer_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "set_outer_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_outer_radius" }
            }
          }

      val set_ring_sides: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "set_ring_sides".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ring_sides" }
            }
          }

      val set_sides: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "set_sides".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sides" }
            }
          }

      val set_smooth_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "set_smooth_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_smooth_faces" }
            }
          }
    }
  }
}
