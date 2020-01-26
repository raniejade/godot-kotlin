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

open class CSGCylinder internal constructor(
  _handle: COpaquePointer
) : CSGPrimitive(_handle) {
  fun getHeight(): Float {
    TODO()
  }

  fun getMaterial(): Material {
    TODO()
  }

  fun getRadius(): Float {
    TODO()
  }

  fun getSides(): Int {
    TODO()
  }

  fun getSmoothFaces(): Boolean {
    TODO()
  }

  fun isCone(): Boolean {
    TODO()
  }

  fun setCone() {
    TODO()
  }

  fun setHeight() {
    TODO()
  }

  fun setMaterial() {
    TODO()
  }

  fun setRadius() {
    TODO()
  }

  fun setSides() {
    TODO()
  }

  fun setSmoothFaces() {
    TODO()
  }

  companion object {
    fun new(): CSGCylinder = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CSGCylinder".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CSGCylinder" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CSGCylinder(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for CSGCylinder
     */
    private object __method_bind {
      val get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val get_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material" }
            }
          }

      val get_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "get_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_radius" }
            }
          }

      val get_sides: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "get_sides".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sides" }
            }
          }

      val get_smooth_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "get_smooth_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_smooth_faces" }
            }
          }

      val is_cone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "is_cone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_cone" }
            }
          }

      val set_cone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "set_cone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cone" }
            }
          }

      val set_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "set_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_height" }
            }
          }

      val set_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_material" }
            }
          }

      val set_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "set_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_radius" }
            }
          }

      val set_sides: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "set_sides".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sides" }
            }
          }

      val set_smooth_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "set_smooth_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_smooth_faces" }
            }
          }
    }
  }
}
