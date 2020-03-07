// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.NodePath
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

open class RemoteTransform(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var remotePath: NodePath
    get() {
       return getRemoteNode() 
    }
    set(value) {
      setRemoteNode(value)
    }

  var updatePosition: Boolean
    get() {
       return getUpdatePosition() 
    }
    set(value) {
      setUpdatePosition(value)
    }

  var updateRotation: Boolean
    get() {
       return getUpdateRotation() 
    }
    set(value) {
      setUpdateRotation(value)
    }

  var updateScale: Boolean
    get() {
       return getUpdateScale() 
    }
    set(value) {
      setUpdateScale(value)
    }

  var useGlobalCoordinates: Boolean
    get() {
       return getUseGlobalCoordinates() 
    }
    set(value) {
      setUseGlobalCoordinates(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for remotePath
   */
  fun remotePath(cb: NodePath.() -> Unit) {
    val _p = remotePath
    cb(_p)
    remotePath = _p
  }

  fun forceUpdateCache() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.forceUpdateCache.call(self._handle, emptyList(), null)
    }
  }

  fun getRemoteNode(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getRemoteNode.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUpdatePosition(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUpdatePosition.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getUpdateRotation(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUpdateRotation.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getUpdateScale(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUpdateScale.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getUseGlobalCoordinates(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUseGlobalCoordinates.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setRemoteNode(path: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRemoteNode.call(self._handle, listOf(path), null)
    }
  }

  fun setUpdatePosition(updateRemotePosition: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUpdatePosition.call(self._handle, listOf(updateRemotePosition), null)
    }
  }

  fun setUpdateRotation(updateRemoteRotation: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUpdateRotation.call(self._handle, listOf(updateRemoteRotation), null)
    }
  }

  fun setUpdateScale(updateRemoteScale: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUpdateScale.call(self._handle, listOf(updateRemoteScale), null)
    }
  }

  fun setUseGlobalCoordinates(useGlobalCoordinates: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseGlobalCoordinates.call(self._handle, listOf(useGlobalCoordinates), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("RemoteTransform".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RemoteTransform" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for RemoteTransform
     */
    private object __method_bind {
      val forceUpdateCache: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "force_update_cache".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method force_update_cache" }
            }
          }

      val getRemoteNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "get_remote_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_remote_node" }
            }
          }

      val getUpdatePosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "get_update_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_position" }
            }
          }

      val getUpdateRotation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "get_update_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_rotation" }
            }
          }

      val getUpdateScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "get_update_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_scale" }
            }
          }

      val getUseGlobalCoordinates: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "get_use_global_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_use_global_coordinates" }
            }
          }

      val setRemoteNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "set_remote_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_remote_node" }
            }
          }

      val setUpdatePosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "set_update_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_position" }
            }
          }

      val setUpdateRotation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "set_update_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_rotation" }
            }
          }

      val setUpdateScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "set_update_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_scale" }
            }
          }

      val setUseGlobalCoordinates: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "set_use_global_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_global_coordinates" }
            }
          }
    }
  }
}
