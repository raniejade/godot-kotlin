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

open class RemoteTransform internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getRemoteNode(): NodePath {
    val _ret = __method_bind.get_remote_node.call(this.toVariant())
    return _ret.asNodePath()
  }

  fun getUpdatePosition(): Boolean {
    val _ret = __method_bind.get_update_position.call(this.toVariant())
    return _ret.asBool()
  }

  fun getUpdateRotation(): Boolean {
    val _ret = __method_bind.get_update_rotation.call(this.toVariant())
    return _ret.asBool()
  }

  fun getUpdateScale(): Boolean {
    val _ret = __method_bind.get_update_scale.call(this.toVariant())
    return _ret.asBool()
  }

  fun getUseGlobalCoordinates(): Boolean {
    val _ret = __method_bind.get_use_global_coordinates.call(this.toVariant())
    return _ret.asBool()
  }

  fun setRemoteNode(path: NodePath) {
    val _args = VariantArray.new()
    _args.append(path)
    __method_bind.set_remote_node.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setUpdatePosition(updateRemotePosition: Boolean) {
    val _args = VariantArray.new()
    _args.append(updateRemotePosition)
    __method_bind.set_update_position.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setUpdateRotation(updateRemoteRotation: Boolean) {
    val _args = VariantArray.new()
    _args.append(updateRemoteRotation)
    __method_bind.set_update_rotation.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setUpdateScale(updateRemoteScale: Boolean) {
    val _args = VariantArray.new()
    _args.append(updateRemoteScale)
    __method_bind.set_update_scale.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setUseGlobalCoordinates(useGlobalCoordinates: Boolean) {
    val _args = VariantArray.new()
    _args.append(useGlobalCoordinates)
    __method_bind.set_use_global_coordinates.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): RemoteTransform = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("RemoteTransform".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton RemoteTransform" }
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
      val get_remote_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "get_remote_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_remote_node" }
            }
          }

      val get_update_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "get_update_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_position" }
            }
          }

      val get_update_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "get_update_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_rotation" }
            }
          }

      val get_update_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "get_update_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_scale" }
            }
          }

      val get_use_global_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "get_use_global_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_use_global_coordinates" }
            }
          }

      val set_remote_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "set_remote_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_remote_node" }
            }
          }

      val set_update_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "set_update_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_position" }
            }
          }

      val set_update_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "set_update_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_rotation" }
            }
          }

      val set_update_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "set_update_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_scale" }
            }
          }

      val set_use_global_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform".cstr.ptr,
              "set_use_global_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_global_coordinates" }
            }
          }
    }
  }
}
