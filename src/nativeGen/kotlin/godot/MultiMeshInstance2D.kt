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

open class MultiMeshInstance2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var multimesh: MultiMesh
    get() {
       return getMultimesh() 
    }
    set(value) {
      setMultimesh(value)
    }

  var normalMap: Texture
    get() {
       return getNormalMap() 
    }
    set(value) {
      setNormalMap(value)
    }

  var texture: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
    }

  fun getMultimesh(): MultiMesh {
    val _ret = __method_bind.getMultimesh.call(this._handle)
    return _ret.asObject(::MultiMesh)!!
  }

  fun getNormalMap(): Texture {
    val _ret = __method_bind.getNormalMap.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun setMultimesh(multimesh: MultiMesh) {
    val _arg = Variant.new(multimesh)
    __method_bind.setMultimesh.call(this._handle, _arg, 1)
  }

  fun setNormalMap(normalMap: Texture) {
    val _arg = Variant.new(normalMap)
    __method_bind.setNormalMap.call(this._handle, _arg, 1)
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): MultiMeshInstance2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("MultiMeshInstance2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MultiMeshInstance2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MultiMeshInstance2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MultiMeshInstance2D = MultiMeshInstance2D(ptr)
    /**
     * Container for method_bind pointers for MultiMeshInstance2D
     */
    private object __method_bind {
      val getMultimesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "getMultimesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMultimesh" }
        }
      val getNormalMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "getNormalMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNormalMap" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "getTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTexture" }
        }
      val setMultimesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "setMultimesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMultimesh" }
        }
      val setNormalMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "setNormalMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNormalMap" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "setTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTexture" }
        }}
  }
}
