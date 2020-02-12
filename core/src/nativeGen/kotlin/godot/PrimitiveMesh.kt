// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.AABB
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class PrimitiveMesh(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Mesh(null) {
  var customAabb: AABB
    get() {
       return getCustomAabb() 
    }
    set(value) {
      setCustomAabb(value)
    }

  var flipFaces: Boolean
    get() {
       return getFlipFaces() 
    }
    set(value) {
      setFlipFaces(value)
    }

  var material: Material
    get() {
       return getMaterial() 
    }
    set(value) {
      setMaterial(value)
    }

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for customAabb
   */
  fun customAabb(cb: AABB.() -> Unit) {
    val _p = customAabb
    cb(_p)
    customAabb = _p
  }

  fun getCustomAabb(): AABB {
    val self = this
    return Allocator.allocationScope {
      val _ret = AABB()
      val _retPtr = _ret._value.ptr
      __method_bind.getCustomAabb.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFlipFaces(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFlipFaces.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMaterial(): Material {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Material
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMaterial.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Material>(_tmp.value!!)
      _ret
    }
  }

  fun getMeshArrays(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getMeshArrays.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setCustomAabb(aabb: AABB) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCustomAabb.call(self._handle, listOf(aabb), null)
    }
  }

  fun setFlipFaces(flipFaces: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFlipFaces.call(self._handle, listOf(flipFaces), null)
    }
  }

  fun setMaterial(material: Material) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaterial.call(self._handle, listOf(material), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for PrimitiveMesh
     */
    private object __method_bind {
      val getCustomAabb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "get_custom_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_aabb" }
        }
      val getFlipFaces: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "get_flip_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flip_faces" }
        }
      val getMaterial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_material" }
        }
      val getMeshArrays: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "get_mesh_arrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mesh_arrays" }
        }
      val setCustomAabb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "set_custom_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_aabb" }
        }
      val setFlipFaces: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "set_flip_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flip_faces" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material" }
        }}
  }
}
