// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PrimitiveMesh internal constructor(
  _handle: COpaquePointer
) : Mesh(_handle) {
  fun getCustomAabb(): AABB {
    TODO()
  }

  fun getFlipFaces(): Boolean {
    TODO()
  }

  fun getMaterial(): Material {
    TODO()
  }

  fun getMeshArrays(): VariantArray {
    TODO()
  }

  fun setCustomAabb(aabb: AABB) {
    TODO()
  }

  fun setFlipFaces(flip_faces: Boolean) {
    TODO()
  }

  fun setMaterial(material: Material) {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for PrimitiveMesh
     */
    private object __method_bind {
      val get_custom_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
              "get_custom_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_aabb" }
            }
          }

      val get_flip_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
              "get_flip_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flip_faces" }
            }
          }

      val get_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
              "get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material" }
            }
          }

      val get_mesh_arrays: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
              "get_mesh_arrays".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh_arrays" }
            }
          }

      val set_custom_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
              "set_custom_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_aabb" }
            }
          }

      val set_flip_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
              "set_flip_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flip_faces" }
            }
          }

      val set_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
              "set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_material" }
            }
          }
    }
  }
}
