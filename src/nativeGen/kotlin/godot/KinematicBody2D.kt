// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform2D
import godot.core.Variant
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

open class KinematicBody2D internal constructor(
  _handle: COpaquePointer
) : PhysicsBody2D(_handle) {
  fun getFloorVelocity(): Vector2 {
    val _ret = __method_bind.get_floor_velocity.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getSafeMargin(): Float {
    val _ret = __method_bind.get_safe_margin.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSlideCollision(slideIdx: Int): KinematicCollision2D {
    val _arg = Variant.new(slideIdx)
    val _ret = __method_bind.get_slide_collision.call(this.toVariant(), _arg, 1)
    return _ret.asObject(::KinematicCollision2D)!!
  }

  fun getSlideCount(): Int {
    val _ret = __method_bind.get_slide_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun isOnCeiling(): Boolean {
    val _ret = __method_bind.is_on_ceiling.call(this.toVariant())
    return _ret.asBool()
  }

  fun isOnFloor(): Boolean {
    val _ret = __method_bind.is_on_floor.call(this.toVariant())
    return _ret.asBool()
  }

  fun isOnWall(): Boolean {
    val _ret = __method_bind.is_on_wall.call(this.toVariant())
    return _ret.asBool()
  }

  fun isSyncToPhysicsEnabled(): Boolean {
    val _ret = __method_bind.is_sync_to_physics_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun moveAndCollide(
    relVec: Vector2,
    infiniteInertia: Boolean,
    excludeRaycastShapes: Boolean,
    testOnly: Boolean
  ): KinematicCollision2D {
    val _args = VariantArray.new()
    _args.append(relVec)
    _args.append(infiniteInertia)
    _args.append(excludeRaycastShapes)
    _args.append(testOnly)
    val _ret = __method_bind.move_and_collide.call(this.toVariant(), _args.toVariant(), 4)
    return _ret.asObject(::KinematicCollision2D)!!
  }

  fun moveAndSlide(
    linearVelocity: Vector2,
    floorNormal: Vector2,
    stopOnSlope: Boolean,
    maxSlides: Int,
    floorMaxAngle: Float,
    infiniteInertia: Boolean
  ): Vector2 {
    val _args = VariantArray.new()
    _args.append(linearVelocity)
    _args.append(floorNormal)
    _args.append(stopOnSlope)
    _args.append(maxSlides)
    _args.append(floorMaxAngle)
    _args.append(infiniteInertia)
    val _ret = __method_bind.move_and_slide.call(this.toVariant(), _args.toVariant(), 6)
    return _ret.asVector2()
  }

  fun moveAndSlideWithSnap(
    linearVelocity: Vector2,
    snap: Vector2,
    floorNormal: Vector2,
    stopOnSlope: Boolean,
    maxSlides: Int,
    floorMaxAngle: Float,
    infiniteInertia: Boolean
  ): Vector2 {
    val _args = VariantArray.new()
    _args.append(linearVelocity)
    _args.append(snap)
    _args.append(floorNormal)
    _args.append(stopOnSlope)
    _args.append(maxSlides)
    _args.append(floorMaxAngle)
    _args.append(infiniteInertia)
    val _ret = __method_bind.move_and_slide_with_snap.call(this.toVariant(), _args.toVariant(), 7)
    return _ret.asVector2()
  }

  fun setSafeMargin(pixels: Float) {
    val _arg = Variant.new(pixels)
    __method_bind.set_safe_margin.call(this.toVariant(), _arg, 1)
  }

  fun setSyncToPhysics(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_sync_to_physics.call(this.toVariant(), _arg, 1)
  }

  fun testMove(
    from: Transform2D,
    relVec: Vector2,
    infiniteInertia: Boolean
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(relVec)
    _args.append(infiniteInertia)
    val _ret = __method_bind.test_move.call(this.toVariant(), _args.toVariant(), 3)
    return _ret.asBool()
  }

  companion object {
    fun new(): KinematicBody2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("KinematicBody2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for KinematicBody2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      KinematicBody2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): KinematicBody2D = KinematicBody2D(ptr)
    /**
     * Container for method_bind pointers for KinematicBody2D
     */
    private object __method_bind {
      val get_floor_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "get_floor_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_floor_velocity" }
            }
          }

      val get_safe_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "get_safe_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_safe_margin" }
            }
          }

      val get_slide_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "get_slide_collision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slide_collision" }
            }
          }

      val get_slide_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "get_slide_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slide_count" }
            }
          }

      val is_on_ceiling: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "is_on_ceiling".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_on_ceiling" }
            }
          }

      val is_on_floor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "is_on_floor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_on_floor" }
            }
          }

      val is_on_wall: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "is_on_wall".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_on_wall" }
            }
          }

      val is_sync_to_physics_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "is_sync_to_physics_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_sync_to_physics_enabled" }
            }
          }

      val move_and_collide: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "move_and_collide".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_and_collide" }
            }
          }

      val move_and_slide: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "move_and_slide".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_and_slide" }
            }
          }

      val move_and_slide_with_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "move_and_slide_with_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_and_slide_with_snap" }
            }
          }

      val set_safe_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "set_safe_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_safe_margin" }
            }
          }

      val set_sync_to_physics: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "set_sync_to_physics".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sync_to_physics" }
            }
          }

      val test_move: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "test_move".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method test_move" }
            }
          }
    }
  }
}
