// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MeshLibrary internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun clear() {
    val _ret = __method_bind.clear.call(this.toVariant())
    TODO()
  }

  fun createItem(id: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.create_item.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun findItemByName(name: String): Int {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.find_item_by_name.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getItemList(): PoolIntArray {
    val _ret = __method_bind.get_item_list.call(this.toVariant())
    TODO()
  }

  fun getItemMesh(id: Int): Mesh {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.get_item_mesh.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getItemName(id: Int): String {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.get_item_name.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getItemNavmesh(id: Int): NavigationMesh {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.get_item_navmesh.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getItemNavmeshTransform(id: Int): Transform {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.get_item_navmesh_transform.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getItemPreview(id: Int): Texture {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.get_item_preview.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getItemShapes(id: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.get_item_shapes.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getLastUnusedItemId(): Int {
    val _ret = __method_bind.get_last_unused_item_id.call(this.toVariant())
    TODO()
  }

  fun removeItem(id: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.remove_item.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setItemMesh(id: Int, mesh: Mesh) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(mesh)
    val _ret = __method_bind.set_item_mesh.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemName(id: Int, name: String) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(name)
    val _ret = __method_bind.set_item_name.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemNavmesh(id: Int, navmesh: NavigationMesh) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(navmesh)
    val _ret = __method_bind.set_item_navmesh.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemNavmeshTransform(id: Int, navmesh: Transform) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(navmesh)
    val _ret = __method_bind.set_item_navmesh_transform.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemPreview(id: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(texture)
    val _ret = __method_bind.set_item_preview.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setItemShapes(id: Int, shapes: VariantArray) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapes)
    val _ret = __method_bind.set_item_shapes.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  companion object {
    fun new(): MeshLibrary = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshLibrary".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton MeshLibrary" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MeshLibrary(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MeshLibrary = MeshLibrary(ptr)
    /**
     * Container for method_bind pointers for MeshLibrary
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val create_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "create_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_item" }
            }
          }

      val find_item_by_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "find_item_by_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_item_by_name" }
            }
          }

      val get_item_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "get_item_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_list" }
            }
          }

      val get_item_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "get_item_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_mesh" }
            }
          }

      val get_item_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "get_item_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_name" }
            }
          }

      val get_item_navmesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "get_item_navmesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_navmesh" }
            }
          }

      val get_item_navmesh_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "get_item_navmesh_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_navmesh_transform" }
            }
          }

      val get_item_preview: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "get_item_preview".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_preview" }
            }
          }

      val get_item_shapes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "get_item_shapes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_shapes" }
            }
          }

      val get_last_unused_item_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "get_last_unused_item_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_last_unused_item_id" }
            }
          }

      val remove_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "remove_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_item" }
            }
          }

      val set_item_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "set_item_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_mesh" }
            }
          }

      val set_item_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "set_item_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_name" }
            }
          }

      val set_item_navmesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "set_item_navmesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_navmesh" }
            }
          }

      val set_item_navmesh_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "set_item_navmesh_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_navmesh_transform" }
            }
          }

      val set_item_preview: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "set_item_preview".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_preview" }
            }
          }

      val set_item_shapes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
              "set_item_shapes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_shapes" }
            }
          }
    }
  }
}
