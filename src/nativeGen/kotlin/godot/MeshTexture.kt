// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MeshTexture(
  _handle: COpaquePointer
) : Texture(_handle) {
  var baseTexture: Texture
    get() {
       return getBaseTexture() 
    }
    set(value) {
      setBaseTexture(value)
    }

  var imageSize: Vector2
    get() {
       return getImageSize() 
    }
    set(value) {
      setImageSize(value)
    }

  var mesh: Mesh
    get() {
       return getMesh() 
    }
    set(value) {
      setMesh(value)
    }

  fun getBaseTexture(): Texture {
    val _ret = __method_bind.getBaseTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getImageSize(): Vector2 {
    val _ret = __method_bind.getImageSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.getMesh.call(this._handle)
    return _ret.asObject(::Mesh)!!
  }

  fun setBaseTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setBaseTexture.call(this._handle, _arg, 1)
  }

  fun setImageSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setImageSize.call(this._handle, _arg, 1)
  }

  fun setMesh(mesh: Mesh) {
    val _arg = Variant.new(mesh)
    __method_bind.setMesh.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): MeshTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MeshTexture" }
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
      val getBaseTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
            "getBaseTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBaseTexture" }
        }
      val getImageSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
            "getImageSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getImageSize" }
        }
      val getMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
            "getMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMesh" }
        }
      val setBaseTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
            "setBaseTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBaseTexture" }
        }
      val setImageSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
            "setImageSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setImageSize" }
        }
      val setMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
            "setMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMesh" }
        }}
  }
}
