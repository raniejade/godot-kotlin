// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CSGMesh(
  _handle: COpaquePointer
) : CSGPrimitive(_handle) {
  var material: `SpatialMaterial,ShaderMaterial`
    get() {
       return getMaterial() 
    }
    set(value) {
      setMaterial(value)
    }

  var mesh: Mesh
    get() {
       return getMesh() 
    }
    set(value) {
      setMesh(value)
    }

  fun getMaterial(): Material {
    val _ret = __method_bind.getMaterial.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.getMesh.call(this._handle)
    return _ret.asObject(::Mesh)!!
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.setMaterial.call(this._handle, _arg, 1)
  }

  fun setMesh(mesh: Mesh) {
    val _arg = Variant.new(mesh)
    __method_bind.setMesh.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): CSGMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CSGMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CSGMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CSGMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CSGMesh = CSGMesh(ptr)
    /**
     * Container for method_bind pointers for CSGMesh
     */
    private object __method_bind {
      val getMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGMesh".cstr.ptr,
            "getMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaterial" }
        }
      val getMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGMesh".cstr.ptr,
            "getMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMesh" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGMesh".cstr.ptr,
            "setMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaterial" }
        }
      val setMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGMesh".cstr.ptr,
            "setMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMesh" }
        }}
  }
}
