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

open class CSGMesh internal constructor(
  _handle: COpaquePointer
) : CSGPrimitive(_handle) {
  fun getMaterial(): Material {
    val _ret = __method_bind.get_material.call(this.toVariant())
    return _ret.asObject(::Material)!!
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.get_mesh.call(this.toVariant())
    return _ret.asObject(::Mesh)!!
  }

  fun setMaterial(material: Material) {
    val _args = VariantArray.new()
    _args.append(material)
    __method_bind.set_material.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMesh(mesh: Mesh) {
    val _args = VariantArray.new()
    _args.append(mesh)
    __method_bind.set_mesh.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): CSGMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CSGMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CSGMesh" }
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
      val get_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGMesh".cstr.ptr,
              "get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material" }
            }
          }

      val get_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGMesh".cstr.ptr,
              "get_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh" }
            }
          }

      val set_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGMesh".cstr.ptr,
              "set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_material" }
            }
          }

      val set_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGMesh".cstr.ptr,
              "set_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mesh" }
            }
          }
    }
  }
}
