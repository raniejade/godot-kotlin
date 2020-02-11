// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MeshLibrary(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun createItem(id: Int) {
    val _arg = Variant(id)
    __method_bind.createItem.call(this._handle, listOf(_arg))
  }

  fun findItemByName(name: String): Int {
    val _arg = Variant(name)
    val _ret = __method_bind.findItemByName.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getItemList(): PoolIntArray {
    val _ret = __method_bind.getItemList.call(this._handle)
    return _ret.asPoolIntArray()
  }

  fun getItemMesh(id: Int): Mesh {
    val _arg = Variant(id)
    val _ret = __method_bind.getItemMesh.call(this._handle, listOf(_arg))
    return _ret.toAny() as Mesh
  }

  fun getItemName(id: Int): String {
    val _arg = Variant(id)
    val _ret = __method_bind.getItemName.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getItemNavmesh(id: Int): NavigationMesh {
    val _arg = Variant(id)
    val _ret = __method_bind.getItemNavmesh.call(this._handle, listOf(_arg))
    return _ret.toAny() as NavigationMesh
  }

  fun getItemNavmeshTransform(id: Int): Transform {
    val _arg = Variant(id)
    val _ret = __method_bind.getItemNavmeshTransform.call(this._handle, listOf(_arg))
    return _ret.asTransform()
  }

  fun getItemPreview(id: Int): Texture {
    val _arg = Variant(id)
    val _ret = __method_bind.getItemPreview.call(this._handle, listOf(_arg))
    return _ret.toAny() as Texture
  }

  fun getItemShapes(id: Int): VariantArray {
    val _arg = Variant(id)
    val _ret = __method_bind.getItemShapes.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun getLastUnusedItemId(): Int {
    val _ret = __method_bind.getLastUnusedItemId.call(this._handle)
    return _ret.asInt()
  }

  fun removeItem(id: Int) {
    val _arg = Variant(id)
    __method_bind.removeItem.call(this._handle, listOf(_arg))
  }

  fun setItemMesh(id: Int, mesh: Mesh) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(mesh))
    __method_bind.setItemMesh.call(this._handle, _args)
  }

  fun setItemName(id: Int, name: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(name))
    __method_bind.setItemName.call(this._handle, _args)
  }

  fun setItemNavmesh(id: Int, navmesh: NavigationMesh) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(navmesh))
    __method_bind.setItemNavmesh.call(this._handle, _args)
  }

  fun setItemNavmeshTransform(id: Int, navmesh: Transform) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(navmesh))
    __method_bind.setItemNavmeshTransform.call(this._handle, _args)
  }

  fun setItemPreview(id: Int, texture: Texture) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(texture))
    __method_bind.setItemPreview.call(this._handle, _args)
  }

  fun setItemShapes(id: Int, shapes: VariantArray) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(shapes))
    __method_bind.setItemShapes.call(this._handle, _args)
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshLibrary".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MeshLibrary" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for MeshLibrary
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val createItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "create_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_item" }
        }
      val findItemByName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "find_item_by_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_item_by_name" }
        }
      val getItemList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "get_item_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_list" }
        }
      val getItemMesh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "get_item_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_mesh" }
        }
      val getItemName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "get_item_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_name" }
        }
      val getItemNavmesh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "get_item_navmesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_navmesh" }
        }
      val getItemNavmeshTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "get_item_navmesh_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_navmesh_transform" }
        }
      val getItemPreview: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "get_item_preview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_preview" }
        }
      val getItemShapes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "get_item_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_shapes" }
        }
      val getLastUnusedItemId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "get_last_unused_item_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_last_unused_item_id" }
        }
      val removeItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "remove_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_item" }
        }
      val setItemMesh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "set_item_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_mesh" }
        }
      val setItemName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "set_item_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_name" }
        }
      val setItemNavmesh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "set_item_navmesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_navmesh" }
        }
      val setItemNavmeshTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "set_item_navmesh_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_navmesh_transform" }
        }
      val setItemPreview: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "set_item_preview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_preview" }
        }
      val setItemShapes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "set_item_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_shapes" }
        }}
  }
}
