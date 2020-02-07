// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MeshTexture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Texture(null) {
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

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for imageSize
   */
  fun imageSize(cb: Vector2.() -> Unit) {
    val _p = imageSize
    cb(_p)
    imageSize = _p
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
    val _arg = Variant(texture)
    __method_bind.setBaseTexture.call(this._handle, listOf(_arg))
  }

  fun setImageSize(size: Vector2) {
    val _arg = Variant(size)
    __method_bind.setImageSize.call(this._handle, listOf(_arg))
  }

  fun setMesh(mesh: Mesh) {
    val _arg = Variant(mesh)
    __method_bind.setMesh.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MeshTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for MeshTexture
     */
    private object __method_bind {
      val getBaseTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
            "get_base_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_texture" }
        }
      val getImageSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
            "get_image_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_image_size" }
        }
      val getMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
            "get_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mesh" }
        }
      val setBaseTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
            "set_base_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base_texture" }
        }
      val setImageSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
            "set_image_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_image_size" }
        }
      val setMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
            "set_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mesh" }
        }}
  }
}
