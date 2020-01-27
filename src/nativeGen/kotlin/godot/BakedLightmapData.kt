// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolByteArray
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
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
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(lightmap)
    _args.append(instance)
    __method_bind.add_user.call(this.toVariant(), _args.toVariant(), 3)
  }

  fun clearUsers() {
    __method_bind.clear_users.call(this.toVariant())
  }

  fun getBounds(): AABB {
    val _ret = __method_bind.get_bounds.call(this.toVariant())
    return _ret.asAABB()
  }

  fun getCellSpaceTransform(): Transform {
    val _ret = __method_bind.get_cell_space_transform.call(this.toVariant())
    return _ret.asTransform()
  }

  fun getCellSubdiv(): Int {
    val _ret = __method_bind.get_cell_subdiv.call(this.toVariant())
    return _ret.asInt()
  }

  fun getEnergy(): Float {
    val _ret = __method_bind.get_energy.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getOctree(): PoolByteArray {
    val _ret = __method_bind.get_octree.call(this.toVariant())
    return _ret.asPoolByteArray()
  }

  fun getUserCount(): Int {
    val _ret = __method_bind.get_user_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getUserLightmap(userIdx: Int): Texture {
    val _arg = Variant.new(userIdx)
    val _ret = __method_bind.get_user_lightmap.call(this.toVariant(), _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getUserPath(userIdx: Int): NodePath {
    val _arg = Variant.new(userIdx)
    val _ret = __method_bind.get_user_path.call(this.toVariant(), _arg, 1)
    return _ret.asNodePath()
  }

  fun setBounds(bounds: AABB) {
    val _arg = Variant.new(bounds)
    __method_bind.set_bounds.call(this.toVariant(), _arg, 1)
  }

  fun setCellSpaceTransform(xform: Transform) {
    val _arg = Variant.new(xform)
    __method_bind.set_cell_space_transform.call(this.toVariant(), _arg, 1)
  }

  fun setCellSubdiv(cellSubdiv: Int) {
    val _arg = Variant.new(cellSubdiv)
    __method_bind.set_cell_subdiv.call(this.toVariant(), _arg, 1)
  }

  fun setEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.set_energy.call(this.toVariant(), _arg, 1)
  }

  fun setOctree(octree: PoolByteArray) {
    val _arg = Variant.new(octree)
    __method_bind.set_octree.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): BakedLightmapData = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("BakedLightmapData".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BakedLightmapData" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      BakedLightmapData(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): BakedLightmapData = BakedLightmapData(ptr)
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
