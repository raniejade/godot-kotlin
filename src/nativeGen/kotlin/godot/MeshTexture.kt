// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Vector2
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MeshTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  fun getBaseTexture(): Texture {
    TODO()
  }

  fun getImageSize(): Vector2 {
    TODO()
  }

  fun getMesh(): Mesh {
    TODO()
  }

  fun setBaseTexture(texture: Texture) {
    TODO()
  }

  fun setImageSize(size: Vector2) {
    TODO()
  }

  fun setMesh(mesh: Mesh) {
    TODO()
  }

  companion object {
    fun new(): MeshTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton MeshTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MeshTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MeshTexture = MeshTexture(ptr)
    /**
     * Container for method_bind pointers for MeshTexture
     */
    private object __method_bind {
      val get_base_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
              "get_base_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_texture" }
            }
          }

      val get_image_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
              "get_image_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_image_size" }
            }
          }

      val get_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
              "get_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh" }
            }
          }

      val set_base_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
              "set_base_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_texture" }
            }
          }

      val set_image_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
              "set_image_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_image_size" }
            }
          }

      val set_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
              "set_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mesh" }
            }
          }
    }
  }
}
