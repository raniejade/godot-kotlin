// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.Suppress
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getMultimesh(): MultiMesh {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: MultiMesh
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMultimesh.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<MultiMesh>(_tmp.value!!)
      _ret
    }
  }

  fun getNormalMap(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNormalMap.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun setMultimesh(multimesh: MultiMesh) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMultimesh.call(self._handle, listOf(multimesh), null)
    }
  }

  fun setNormalMap(normalMap: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNormalMap.call(self._handle, listOf(normalMap), null)
    }
  }

  fun setTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTexture.call(self._handle, listOf(texture), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "get_multimesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_multimesh" }
        }
      val getNormalMap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "get_normal_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_normal_map" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val setMultimesh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "set_multimesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_multimesh" }
        }
      val setNormalMap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "set_normal_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normal_map" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMeshInstance2D".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }}
  }
}
