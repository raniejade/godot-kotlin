// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class KinematicCollision2D internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): KinematicCollision2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("KinematicCollision2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton KinematicCollision2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      KinematicCollision2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for KinematicCollision2D
     */
    private object __method_bind {
      val get_collider: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
              "get_collider".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider" }
            }
          }

      val get_collider_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
              "get_collider_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_id" }
            }
          }

      val get_collider_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
              "get_collider_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_metadata" }
            }
          }

      val get_collider_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
              "get_collider_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_shape" }
            }
          }

      val get_collider_shape_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
              "get_collider_shape_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_shape_index" }
            }
          }

      val get_collider_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
              "get_collider_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_velocity" }
            }
          }

      val get_local_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
              "get_local_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_local_shape" }
            }
          }

      val get_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
              "get_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normal" }
            }
          }

      val get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val get_remainder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
              "get_remainder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_remainder" }
            }
          }

      val get_travel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
              "get_travel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_travel" }
            }
          }
    }
  }
}
