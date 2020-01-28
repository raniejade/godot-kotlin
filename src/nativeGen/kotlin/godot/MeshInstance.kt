// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MeshInstance(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  var mesh: Mesh
    get() {
       return getMesh() 
    }
    set(value) {
      setMesh(value)
    }

  var skeleton: NodePath
    get() {
       return getSkeletonPath() 
    }
    set(value) {
      setSkeletonPath(value)
    }

  fun createConvexCollision() {
    __method_bind.createConvexCollision.call(this._handle)
  }

  fun createDebugTangents() {
    __method_bind.createDebugTangents.call(this._handle)
  }

  fun createTrimeshCollision() {
    __method_bind.createTrimeshCollision.call(this._handle)
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.getMesh.call(this._handle)
    return _ret.asObject(::Mesh)!!
  }

  fun getSkeletonPath(): NodePath {
    val _ret = __method_bind.getSkeletonPath.call(this._handle)
    return _ret.asNodePath()
  }

  fun getSurfaceMaterial(surface: Int): Material {
    val _arg = Variant.new(surface)
    val _ret = __method_bind.getSurfaceMaterial.call(this._handle, _arg, 1)
    return _ret.asObject(::Material)!!
  }

  fun getSurfaceMaterialCount(): Int {
    val _ret = __method_bind.getSurfaceMaterialCount.call(this._handle)
    return _ret.asInt()
  }

  fun setMesh(mesh: Mesh) {
    val _arg = Variant.new(mesh)
    __method_bind.setMesh.call(this._handle, _arg, 1)
  }

  fun setSkeletonPath(skeletonPath: NodePath) {
    val _arg = Variant.new(skeletonPath)
    __method_bind.setSkeletonPath.call(this._handle, _arg, 1)
  }

  fun setSurfaceMaterial(surface: Int, material: Material) {
    val _args = VariantArray.new()
    _args.append(surface)
    _args.append(material)
    __method_bind.setSurfaceMaterial.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    fun new(): MeshInstance = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshInstance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MeshInstance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MeshInstance(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MeshInstance = MeshInstance(ptr)
    /**
     * Container for method_bind pointers for MeshInstance
     */
    private object __method_bind {
      val createConvexCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "createConvexCollision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createConvexCollision" }
        }
      val createDebugTangents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "createDebugTangents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createDebugTangents" }
        }
      val createTrimeshCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "createTrimeshCollision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createTrimeshCollision" }
        }
      val getMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "getMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMesh" }
        }
      val getSkeletonPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "getSkeletonPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSkeletonPath" }
        }
      val getSurfaceMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "getSurfaceMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSurfaceMaterial" }
        }
      val getSurfaceMaterialCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "getSurfaceMaterialCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSurfaceMaterialCount" }
        }
      val setMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "setMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMesh" }
        }
      val setSkeletonPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "setSkeletonPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSkeletonPath" }
        }
      val setSurfaceMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "setSurfaceMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSurfaceMaterial" }
        }}
  }
}
