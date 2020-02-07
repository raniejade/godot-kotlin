// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MultiMeshInstance2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
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

  /**
   * MultiMeshInstance2D::texture_changed signal
   */
  val signalTextureChanged: Signal0 = Signal0("texture_changed")

  constructor() : this(null) {
    _handle = __new()
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
    __method_bind.setMultimesh.call(this._handle, listOf(_arg))
  }

  fun setNormalMap(normalMap: Texture) {
    val _arg = Variant.new(normalMap)
    __method_bind.setNormalMap.call(this._handle, listOf(_arg))
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("MultiMeshInstance2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MultiMeshInstance2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for MultiMeshInstance2D
     */
    private object __method_bind {
      val getMultimesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "get_multimesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_multimesh" }
        }
      val getNormalMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "get_normal_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_normal_map" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val setMultimesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "set_multimesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_multimesh" }
        }
      val setNormalMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "set_normal_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normal_map" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }}
  }
}
