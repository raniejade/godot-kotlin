// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
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
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

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
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun createItem(id: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.createItem.call(self._handle, listOf(id), null)
    }
  }

  fun findItemByName(name: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.findItemByName.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun getItemList(): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getItemList.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getItemMesh(id: Int): Mesh {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Mesh
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getItemMesh.call(self._handle, listOf(id), _retPtr)
      _ret = objectToType<Mesh>(_tmp.value!!)
      _ret
    }
  }

  fun getItemName(id: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getItemName.call(self._handle, listOf(id), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getItemNavmesh(id: Int): NavigationMesh {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: NavigationMesh
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getItemNavmesh.call(self._handle, listOf(id), _retPtr)
      _ret = objectToType<NavigationMesh>(_tmp.value!!)
      _ret
    }
  }

  fun getItemNavmeshTransform(id: Int): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getItemNavmeshTransform.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getItemPreview(id: Int): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getItemPreview.call(self._handle, listOf(id), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getItemShapes(id: Int): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getItemShapes.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLastUnusedItemId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLastUnusedItemId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun removeItem(id: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeItem.call(self._handle, listOf(id), null)
    }
  }

  fun setItemMesh(id: Int, mesh: Mesh) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(mesh)
      __method_bind.setItemMesh.call(self._handle, _args, null)
    }
  }

  fun setItemName(id: Int, name: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(name)
      __method_bind.setItemName.call(self._handle, _args, null)
    }
  }

  fun setItemNavmesh(id: Int, navmesh: NavigationMesh) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(navmesh)
      __method_bind.setItemNavmesh.call(self._handle, _args, null)
    }
  }

  fun setItemNavmeshTransform(id: Int, navmesh: Transform) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(navmesh)
      __method_bind.setItemNavmeshTransform.call(self._handle, _args, null)
    }
  }

  fun setItemPreview(id: Int, texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(texture)
      __method_bind.setItemPreview.call(self._handle, _args, null)
    }
  }

  fun setItemShapes(id: Int, shapes: VariantArray) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(shapes)
      __method_bind.setItemShapes.call(self._handle, _args, null)
    }
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
