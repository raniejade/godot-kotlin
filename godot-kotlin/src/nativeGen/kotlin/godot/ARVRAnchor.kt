// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Plane
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Int
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

open class ARVRAnchor(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var anchorId: Int
    get() {
       return getAnchorId() 
    }
    set(value) {
      setAnchorId(value)
    }

  /**
   * ARVRAnchor::mesh_updated signal
   */
  val signalMeshUpdated: Signal1<Mesh> = Signal1("mesh_updated")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAnchorId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAnchorId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getAnchorName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getAnchorName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getIsActive(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getIsActive.call(self._handle, emptyList(), _retPtr)
      _ret.value
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

  fun getPlane(): Plane {
    val self = this
    return Allocator.allocationScope {
      val _ret = Plane()
      val _retPtr = _ret._value.ptr
      __method_bind.getPlane.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSize(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setAnchorId(anchorId: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAnchorId.call(self._handle, listOf(anchorId), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ARVRAnchor".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ARVRAnchor" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ARVRAnchor
     */
    private object __method_bind {
      val getAnchorId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
              "get_anchor_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_anchor_id" }
            }
          }

      val getAnchorName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
              "get_anchor_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_anchor_name" }
            }
          }

      val getIsActive: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
              "get_is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_is_active" }
            }
          }

      val getMesh: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
              "get_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh" }
            }
          }

      val getPlane: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
              "get_plane".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_plane" }
            }
          }

      val getSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val setAnchorId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
              "set_anchor_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_anchor_id" }
            }
          }
    }
  }
}
