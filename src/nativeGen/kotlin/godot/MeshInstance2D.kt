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

open class MeshInstance2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getMesh(): Mesh {
    TODO()
  }

  fun getNormalMap(): Texture {
    TODO()
  }

  fun getTexture(): Texture {
    TODO()
  }

  fun setMesh(mesh: Mesh) {
    TODO()
  }

  fun setNormalMap(normal_map: Texture) {
    TODO()
  }

  fun setTexture(texture: Texture) {
    TODO()
  }

  companion object {
    fun new(): MeshInstance2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshInstance2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton MeshInstance2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MeshInstance2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MeshInstance2D = MeshInstance2D(ptr)
    /**
     * Container for method_bind pointers for MeshInstance2D
     */
    private object __method_bind {
      val get_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance2D".cstr.ptr,
              "get_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh" }
            }
          }

      val get_normal_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance2D".cstr.ptr,
              "get_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normal_map" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance2D".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val set_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance2D".cstr.ptr,
              "set_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mesh" }
            }
          }

      val set_normal_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance2D".cstr.ptr,
              "set_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normal_map" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance2D".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }
    }
  }
}
