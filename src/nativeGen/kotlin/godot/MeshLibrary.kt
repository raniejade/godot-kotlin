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

open class MeshLibrary(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun createItem(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.createItem.call(this._handle, _arg, 1)
  }

  fun findItemByName(name: String): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.findItemByName.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getItemList(): PoolIntArray {
    val _ret = __method_bind.getItemList.call(this._handle)
    return _ret.asPoolIntArray()
  }

  fun getItemMesh(id: Int): Mesh {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getItemMesh.call(this._handle, _arg, 1)
    return _ret.asObject(::Mesh)!!
  }

  fun getItemName(id: Int): String {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getItemName.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getItemNavmesh(id: Int): NavigationMesh {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getItemNavmesh.call(this._handle, _arg, 1)
    return _ret.asObject(::NavigationMesh)!!
  }

  fun getItemNavmeshTransform(id: Int): Transform {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getItemNavmeshTransform.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun getItemPreview(id: Int): Texture {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getItemPreview.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getItemShapes(id: Int): VariantArray {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getItemShapes.call(this._handle, _arg, 1)
    return _ret.asVariantArray()
  }

  fun getLastUnusedItemId(): Int {
    val _ret = __method_bind.getLastUnusedItemId.call(this._handle)
    return _ret.asInt()
  }

  fun removeItem(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.removeItem.call(this._handle, _arg, 1)
  }

  fun setItemMesh(id: Int, mesh: Mesh) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(mesh)
    __method_bind.setItemMesh.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemName(id: Int, name: String) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(name)
    __method_bind.setItemName.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemNavmesh(id: Int, navmesh: NavigationMesh) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(navmesh)
    __method_bind.setItemNavmesh.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemNavmeshTransform(id: Int, navmesh: Transform) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(navmesh)
    __method_bind.setItemNavmeshTransform.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemPreview(id: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(texture)
    __method_bind.setItemPreview.call(this._handle, _args.toVariant(), 2)
  }

  fun setItemShapes(id: Int, shapes: VariantArray) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapes)
    __method_bind.setItemShapes.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    fun new(): MeshLibrary = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshLibrary".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MeshLibrary" }
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
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val createItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "createItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createItem" }
        }
      val findItemByName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "findItemByName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method findItemByName" }
        }
      val getItemList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "getItemList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemList" }
        }
      val getItemMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "getItemMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemMesh" }
        }
      val getItemName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "getItemName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemName" }
        }
      val getItemNavmesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "getItemNavmesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemNavmesh" }
        }
      val getItemNavmeshTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "getItemNavmeshTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemNavmeshTransform" }
        }
      val getItemPreview: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "getItemPreview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemPreview" }
        }
      val getItemShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "getItemShapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemShapes" }
        }
      val getLastUnusedItemId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "getLastUnusedItemId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLastUnusedItemId" }
        }
      val removeItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "removeItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeItem" }
        }
      val setItemMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "setItemMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemMesh" }
        }
      val setItemName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "setItemName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemName" }
        }
      val setItemNavmesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "setItemNavmesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemNavmesh" }
        }
      val setItemNavmeshTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "setItemNavmeshTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemNavmeshTransform" }
        }
      val setItemPreview: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "setItemPreview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemPreview" }
        }
      val setItemShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshLibrary".cstr.ptr,
            "setItemShapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setItemShapes" }
        }}
  }
}
