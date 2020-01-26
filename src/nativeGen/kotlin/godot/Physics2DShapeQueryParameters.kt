// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Physics2DShapeQueryParameters internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getCollisionLayer(): Int {
    TODO()
  }

  fun getExclude(): VariantArray {
    TODO()
  }

  fun getMargin(): Float {
    TODO()
  }

  fun getMotion(): Vector2 {
    TODO()
  }

  fun getShapeRid(): RID {
    TODO()
  }

  fun getTransform(): Transform2D {
    TODO()
  }

  fun isCollideWithAreasEnabled(): Boolean {
    TODO()
  }

  fun isCollideWithBodiesEnabled(): Boolean {
    TODO()
  }

  fun setCollideWithAreas() {
    TODO()
  }

  fun setCollideWithBodies() {
    TODO()
  }

  fun setCollisionLayer() {
    TODO()
  }

  fun setExclude() {
    TODO()
  }

  fun setMargin() {
    TODO()
  }

  fun setMotion() {
    TODO()
  }

  fun setShape() {
    TODO()
  }

  fun setShapeRid() {
    TODO()
  }

  fun setTransform() {
    TODO()
  }

  companion object {
    fun new(): Physics2DShapeQueryParameters = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("Physics2DShapeQueryParameters".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Physics2DShapeQueryParameters" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Physics2DShapeQueryParameters(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Physics2DShapeQueryParameters
     */
    private object __method_bind {
      val get_collision_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "get_collision_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
            }
          }

      val get_exclude: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "get_exclude".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_exclude" }
            }
          }

      val get_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "get_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_margin" }
            }
          }

      val get_motion: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "get_motion".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_motion" }
            }
          }

      val get_shape_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "get_shape_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shape_rid" }
            }
          }

      val get_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "get_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transform" }
            }
          }

      val is_collide_with_areas_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "is_collide_with_areas_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_collide_with_areas_enabled"
              }
            }
          }

      val is_collide_with_bodies_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "is_collide_with_bodies_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_collide_with_bodies_enabled"
              }
            }
          }

      val set_collide_with_areas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "set_collide_with_areas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collide_with_areas" }
            }
          }

      val set_collide_with_bodies: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "set_collide_with_bodies".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collide_with_bodies" }
            }
          }

      val set_collision_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "set_collision_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
            }
          }

      val set_exclude: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "set_exclude".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_exclude" }
            }
          }

      val set_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "set_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_margin" }
            }
          }

      val set_motion: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "set_motion".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_motion" }
            }
          }

      val set_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "set_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shape" }
            }
          }

      val set_shape_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "set_shape_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shape_rid" }
            }
          }

      val set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
              "set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_transform" }
            }
          }
    }
  }
}
