// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InterpolatedCamera internal constructor(
  _handle: COpaquePointer
) : Camera(_handle) {
  fun getSpeed(): Float {
    TODO()
  }

  fun getTargetPath(): NodePath {
    TODO()
  }

  fun isInterpolationEnabled(): Boolean {
    TODO()
  }

  fun setInterpolationEnabled(target_path: Boolean) {
    TODO()
  }

  fun setSpeed(speed: Float) {
    TODO()
  }

  fun setTarget(target: Object) {
    TODO()
  }

  fun setTargetPath(target_path: NodePath) {
    TODO()
  }

  companion object {
    fun new(): InterpolatedCamera = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InterpolatedCamera".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton InterpolatedCamera" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InterpolatedCamera(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for InterpolatedCamera
     */
    private object __method_bind {
      val get_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
              "get_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_speed" }
            }
          }

      val get_target_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
              "get_target_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_target_path" }
            }
          }

      val is_interpolation_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
              "is_interpolation_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_interpolation_enabled" }
            }
          }

      val set_interpolation_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
              "set_interpolation_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_interpolation_enabled" }
            }
          }

      val set_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
              "set_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_speed" }
            }
          }

      val set_target: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
              "set_target".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_target" }
            }
          }

      val set_target_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
              "set_target_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_target_path" }
            }
          }
    }
  }
}
