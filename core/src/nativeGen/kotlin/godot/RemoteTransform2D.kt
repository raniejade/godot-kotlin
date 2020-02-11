// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RemoteTransform2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
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
    __method_bind.forceUpdateCache.call(this._handle)
  }

  fun getRemoteNode(): NodePath {
    val _ret = __method_bind.getRemoteNode.call(this._handle)
    return _ret.asNodePath()
  }

  fun getUpdatePosition(): Boolean {
    val _ret = __method_bind.getUpdatePosition.call(this._handle)
    return _ret.asBoolean()
  }

  fun getUpdateRotation(): Boolean {
    val _ret = __method_bind.getUpdateRotation.call(this._handle)
    return _ret.asBoolean()
  }

  fun getUpdateScale(): Boolean {
    val _ret = __method_bind.getUpdateScale.call(this._handle)
    return _ret.asBoolean()
  }

  fun getUseGlobalCoordinates(): Boolean {
    val _ret = __method_bind.getUseGlobalCoordinates.call(this._handle)
    return _ret.asBoolean()
  }

  fun setRemoteNode(path: NodePath) {
    val _arg = Variant(path)
    __method_bind.setRemoteNode.call(this._handle, listOf(_arg))
  }

  fun setUpdatePosition(updateRemotePosition: Boolean) {
    val _arg = Variant(updateRemotePosition)
    __method_bind.setUpdatePosition.call(this._handle, listOf(_arg))
  }

  fun setUpdateRotation(updateRemoteRotation: Boolean) {
    val _arg = Variant(updateRemoteRotation)
    __method_bind.setUpdateRotation.call(this._handle, listOf(_arg))
  }

  fun setUpdateScale(updateRemoteScale: Boolean) {
    val _arg = Variant(updateRemoteScale)
    __method_bind.setUpdateScale.call(this._handle, listOf(_arg))
  }

  fun setUseGlobalCoordinates(useGlobalCoordinates: Boolean) {
    val _arg = Variant(useGlobalCoordinates)
    __method_bind.setUseGlobalCoordinates.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("RemoteTransform2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RemoteTransform2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for RemoteTransform2D
     */
    private object __method_bind {
      val forceUpdateCache: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
            "force_update_cache".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method force_update_cache" }
        }
      val getRemoteNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
            "get_remote_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_remote_node" }
        }
      val getUpdatePosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
            "get_update_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_update_position" }
        }
      val getUpdateRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
            "get_update_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_update_rotation" }
        }
      val getUpdateScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
            "get_update_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_update_scale" }
        }
      val getUseGlobalCoordinates: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
            "get_use_global_coordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_global_coordinates" }
        }
      val setRemoteNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
            "set_remote_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_remote_node" }
        }
      val setUpdatePosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
            "set_update_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_update_position" }
        }
      val setUpdateRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
            "set_update_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_update_rotation" }
        }
      val setUpdateScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
            "set_update_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_update_scale" }
        }
      val setUseGlobalCoordinates: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
            "set_use_global_coordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_global_coordinates" }
        }}
  }
}
