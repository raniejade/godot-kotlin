// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RemoteTransform2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getRemoteNode(): NodePath {
    TODO()
  }

  fun getUpdatePosition(): Boolean {
    TODO()
  }

  fun getUpdateRotation(): Boolean {
    TODO()
  }

  fun getUpdateScale(): Boolean {
    TODO()
  }

  fun getUseGlobalCoordinates(): Boolean {
    TODO()
  }

  fun setRemoteNode(path: NodePath) {
    TODO()
  }

  fun setUpdatePosition(update_remote_position: Boolean) {
    TODO()
  }

  fun setUpdateRotation(update_remote_rotation: Boolean) {
    TODO()
  }

  fun setUpdateScale(update_remote_scale: Boolean) {
    TODO()
  }

  fun setUseGlobalCoordinates(use_global_coordinates: Boolean) {
    TODO()
  }

  companion object {
    fun new(): RemoteTransform2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("RemoteTransform2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton RemoteTransform2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RemoteTransform2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RemoteTransform2D = RemoteTransform2D(ptr)
    /**
     * Container for method_bind pointers for RemoteTransform2D
     */
    private object __method_bind {
      val get_remote_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "get_remote_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_remote_node" }
            }
          }

      val get_update_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "get_update_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_position" }
            }
          }

      val get_update_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "get_update_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_rotation" }
            }
          }

      val get_update_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "get_update_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_scale" }
            }
          }

      val get_use_global_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "get_use_global_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_use_global_coordinates" }
            }
          }

      val set_remote_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "set_remote_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_remote_node" }
            }
          }

      val set_update_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "set_update_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_position" }
            }
          }

      val set_update_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "set_update_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_rotation" }
            }
          }

      val set_update_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "set_update_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_scale" }
            }
          }

      val set_use_global_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "set_use_global_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_global_coordinates" }
            }
          }
    }
  }
}
