// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RemoteTransform(
  _handle: COpaquePointer
) : Spatial(_handle) {
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
    val _arg = Variant.new(path)
    __method_bind.setRemoteNode.call(this._handle, _arg, 1)
  }

  fun setUpdatePosition(updateRemotePosition: Boolean) {
    val _arg = Variant.new(updateRemotePosition)
    __method_bind.setUpdatePosition.call(this._handle, _arg, 1)
  }

  fun setUpdateRotation(updateRemoteRotation: Boolean) {
    val _arg = Variant.new(updateRemoteRotation)
    __method_bind.setUpdateRotation.call(this._handle, _arg, 1)
  }

  fun setUpdateScale(updateRemoteScale: Boolean) {
    val _arg = Variant.new(updateRemoteScale)
    __method_bind.setUpdateScale.call(this._handle, _arg, 1)
  }

  fun setUseGlobalCoordinates(useGlobalCoordinates: Boolean) {
    val _arg = Variant.new(useGlobalCoordinates)
    __method_bind.setUseGlobalCoordinates.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): RemoteTransform = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("RemoteTransform".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RemoteTransform" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RemoteTransform(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RemoteTransform = RemoteTransform(ptr)
    /**
     * Container for method_bind pointers for RemoteTransform
     */
    private object __method_bind {
      val getRemoteNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
            "get_remote_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_remote_node" }
        }
      val getUpdatePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
            "get_update_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_update_position" }
        }
      val getUpdateRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
            "get_update_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_update_rotation" }
        }
      val getUpdateScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
            "get_update_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_update_scale" }
        }
      val getUseGlobalCoordinates: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
            "get_use_global_coordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_global_coordinates" }
        }
      val setRemoteNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
            "set_remote_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_remote_node" }
        }
      val setUpdatePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
            "set_update_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_update_position" }
        }
      val setUpdateRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
            "set_update_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_update_rotation" }
        }
      val setUpdateScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
            "set_update_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_update_scale" }
        }
      val setUseGlobalCoordinates: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
            "set_use_global_coordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_global_coordinates" }
        }}
  }
}
