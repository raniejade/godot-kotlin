// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CollisionShape2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun shapeChanged() {
    TODO()
  }

  fun getOneWayCollisionMargin(): Float {
    TODO()
  }

  fun getShape(): Shape2D {
    TODO()
  }

  fun isDisabled(): Boolean {
    TODO()
  }

  fun isOneWayCollisionEnabled(): Boolean {
    TODO()
  }

  fun setDisabled() {
    TODO()
  }

  fun setOneWayCollision() {
    TODO()
  }

  fun setOneWayCollisionMargin() {
    TODO()
  }

  fun setShape() {
    TODO()
  }

  companion object {
    fun new(): CollisionShape2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CollisionShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CollisionShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CollisionShape2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for CollisionShape2D
     */
    private object __method_bind {
      val _shape_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
              "_shape_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _shape_changed" }
            }
          }

      val get_one_way_collision_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
              "get_one_way_collision_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_one_way_collision_margin" }
            }
          }

      val get_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
              "get_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shape" }
            }
          }

      val is_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
              "is_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_disabled" }
            }
          }

      val is_one_way_collision_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
              "is_one_way_collision_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_one_way_collision_enabled" }
            }
          }

      val set_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
              "set_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disabled" }
            }
          }

      val set_one_way_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
              "set_one_way_collision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_one_way_collision" }
            }
          }

      val set_one_way_collision_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
              "set_one_way_collision_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_one_way_collision_margin" }
            }
          }

      val set_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
              "set_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shape" }
            }
          }
    }
  }
}
