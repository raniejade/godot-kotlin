// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MultiMeshInstance(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  var multimesh: MultiMesh
    get() {
       return getMultimesh() 
    }
    set(value) {
      setMultimesh(value)
    }

  fun getMultimesh(): MultiMesh {
    val _ret = __method_bind.getMultimesh.call(this._handle)
    return _ret.asObject(::MultiMesh)!!
  }

  fun setMultimesh(multimesh: MultiMesh) {
    val _arg = Variant.new(multimesh)
    __method_bind.setMultimesh.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): MultiMeshInstance = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("MultiMeshInstance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MultiMeshInstance" }
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
      val getMultimesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance".cstr.ptr,
            "get_multimesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_multimesh" }
        }
      val setMultimesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance".cstr.ptr,
            "set_multimesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_multimesh" }
        }}
  }
}
