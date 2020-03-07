// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getBaseTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getImageSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getImageSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMesh(): Mesh {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Mesh
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMesh.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Mesh>(_tmp.value!!)
      _ret
    }
  }

  fun setBaseTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBaseTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setImageSize(size: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setImageSize.call(self._handle, listOf(size), null)
    }
  }

  fun setMesh(mesh: Mesh) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMesh.call(self._handle, listOf(mesh), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MeshTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for MeshTexture
     */
    private object __method_bind {
      val getBaseTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
              "get_base_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_texture" }
            }
          }

      val getImageSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
              "get_image_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_image_size" }
            }
          }

      val getMesh: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
              "get_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh" }
            }
          }

      val setBaseTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
              "set_base_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_texture" }
            }
          }

      val setImageSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
              "set_image_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_image_size" }
            }
          }

      val setMesh: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshTexture".cstr.ptr,
              "set_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mesh" }
            }
          }
    }
  }
}
