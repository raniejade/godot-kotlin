// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PrimitiveMesh(
  _handle: COpaquePointer
) : Mesh(_handle) {
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

  var material: `SpatialMaterial,ShaderMaterial`
    get() {
       return getMaterial() 
    }
    set(value) {
      setMaterial(value)
    }

  fun getCustomAabb(): AABB {
    val _ret = __method_bind.getCustomAabb.call(this._handle)
    return _ret.asAABB()
  }

  fun getFlipFaces(): Boolean {
    val _ret = __method_bind.getFlipFaces.call(this._handle)
    return _ret.asBoolean()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.getMaterial.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun getMeshArrays(): VariantArray {
    val _ret = __method_bind.getMeshArrays.call(this._handle)
    return _ret.asVariantArray()
  }

  fun setCustomAabb(aabb: AABB) {
    val _arg = Variant.new(aabb)
    __method_bind.setCustomAabb.call(this._handle, _arg, 1)
  }

  fun setFlipFaces(flipFaces: Boolean) {
    val _arg = Variant.new(flipFaces)
    __method_bind.setFlipFaces.call(this._handle, _arg, 1)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.setMaterial.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for PrimitiveMesh
     */
    private object __method_bind {
      val getCustomAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "getCustomAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCustomAabb" }
        }
      val getFlipFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "getFlipFaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFlipFaces" }
        }
      val getMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "getMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaterial" }
        }
      val getMeshArrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "getMeshArrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMeshArrays" }
        }
      val setCustomAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "setCustomAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCustomAabb" }
        }
      val setFlipFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "setFlipFaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFlipFaces" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrimitiveMesh".cstr.ptr,
            "setMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaterial" }
        }}
  }
}
