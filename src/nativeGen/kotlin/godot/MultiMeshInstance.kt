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

open class MultiMeshInstance internal constructor(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  fun getMultimesh(): MultiMesh {
    val _ret = __method_bind.get_multimesh.call(this.toVariant())
    return _ret.asObject(::MultiMesh)!!
  }

  fun setMultimesh(multimesh: MultiMesh) {
    val _args = VariantArray.new()
    _args.append(multimesh)
    __method_bind.set_multimesh.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): MultiMeshInstance = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("MultiMeshInstance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton MultiMeshInstance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MultiMeshInstance(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MultiMeshInstance = MultiMeshInstance(ptr)
    /**
     * Container for method_bind pointers for MultiMeshInstance
     */
    private object __method_bind {
      val get_multimesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance".cstr.ptr,
              "get_multimesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_multimesh" }
            }
          }

      val set_multimesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance".cstr.ptr,
              "set_multimesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_multimesh" }
            }
          }
    }
  }
}
