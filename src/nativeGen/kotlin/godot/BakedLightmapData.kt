// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolByteArray
import godot.core.Transform
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BakedLightmapData internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addUser(
    path: NodePath,
    lightmap: Texture,
    instance: Int
  ) {
    TODO()
  }

  fun clearUsers() {
    TODO()
  }

  fun getBounds(): AABB {
    TODO()
  }

  fun getCellSpaceTransform(): Transform {
    TODO()
  }

  fun getCellSubdiv(): Int {
    TODO()
  }

  fun getEnergy(): Float {
    TODO()
  }

  fun getOctree(): PoolByteArray {
    TODO()
  }

  fun getUserCount(): Int {
    TODO()
  }

  fun getUserLightmap(user_idx: Int): Texture {
    TODO()
  }

  fun getUserPath(user_idx: Int): NodePath {
    TODO()
  }

  fun setBounds(bounds: AABB) {
    TODO()
  }

  fun setCellSpaceTransform(xform: Transform) {
    TODO()
  }

  fun setCellSubdiv(cell_subdiv: Int) {
    TODO()
  }

  fun setEnergy(energy: Float) {
    TODO()
  }

  fun setOctree(octree: PoolByteArray) {
    TODO()
  }

  companion object {
    fun new(): BakedLightmapData = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("BakedLightmapData".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton BakedLightmapData" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      BakedLightmapData(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for BakedLightmapData
     */
    private object __method_bind {
      val add_user: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "add_user".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_user" }
            }
          }

      val clear_users: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "clear_users".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_users" }
            }
          }

      val get_bounds: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "get_bounds".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bounds" }
            }
          }

      val get_cell_space_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "get_cell_space_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_space_transform" }
            }
          }

      val get_cell_subdiv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "get_cell_subdiv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_subdiv" }
            }
          }

      val get_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "get_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_energy" }
            }
          }

      val get_octree: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "get_octree".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_octree" }
            }
          }

      val get_user_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "get_user_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_user_count" }
            }
          }

      val get_user_lightmap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "get_user_lightmap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_user_lightmap" }
            }
          }

      val get_user_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "get_user_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_user_path" }
            }
          }

      val set_bounds: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "set_bounds".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bounds" }
            }
          }

      val set_cell_space_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "set_cell_space_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cell_space_transform" }
            }
          }

      val set_cell_subdiv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "set_cell_subdiv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cell_subdiv" }
            }
          }

      val set_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "set_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_energy" }
            }
          }

      val set_octree: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
              "set_octree".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_octree" }
            }
          }
    }
  }
}
