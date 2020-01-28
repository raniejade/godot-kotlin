// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
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

open class KinematicBody(
  _handle: COpaquePointer
) : PhysicsBody(_handle) {
  fun getAxisLock(axis: Int): Boolean {
    val _arg = Variant.new(axis)
    val _ret = __method_bind.get_axis_lock.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getFloorVelocity(): Vector3 {
    val _ret = __method_bind.get_floor_velocity.call(this._handle)
    return _ret.asVector3()
  }

  fun getSafeMargin(): Float {
    val _ret = __method_bind.get_safe_margin.call(this._handle)
    return _ret.asFloat()
  }

  fun getSlideCollision(slideIdx: Int): KinematicCollision {
    val _arg = Variant.new(slideIdx)
    val _ret = __method_bind.get_slide_collision.call(this._handle, _arg, 1)
    return _ret.asObject(::KinematicCollision)!!
  }

  fun getSlideCount(): Int {
    val _ret = __method_bind.get_slide_count.call(this._handle)
    return _ret.asInt()
  }

  fun isOnCeiling(): Boolean {
    val _ret = __method_bind.is_on_ceiling.call(this._handle)
    return _ret.asBoolean()
  }

  fun isOnFloor(): Boolean {
    val _ret = __method_bind.is_on_floor.call(this._handle)
    return _ret.asBoolean()
  }

  fun isOnWall(): Boolean {
    val _ret = __method_bind.is_on_wall.call(this._handle)
    return _ret.asBoolean()
  }

  fun moveAndCollide(
    relVec: Vector3,
    infiniteInertia: Boolean,
    excludeRaycastShapes: Boolean,
    testOnly: Boolean
  ): KinematicCollision {
    val _args = VariantArray.new()
    _args.append(relVec)
    _args.append(infiniteInertia)
    _args.append(excludeRaycastShapes)
    _args.append(testOnly)
    val _ret = __method_bind.move_and_collide.call(this._handle, _args.toVariant(), 4)
    return _ret.asObject(::KinematicCollision)!!
  }

  fun moveAndSlide(
    linearVelocity: Vector3,
    floorNormal: Vector3,
    stopOnSlope: Boolean,
    maxSlides: Int,
    floorMaxAngle: Float,
    infiniteInertia: Boolean
  ): Vector3 {
    val _args = VariantArray.new()
    _args.append(linearVelocity)
    _args.append(floorNormal)
    _args.append(stopOnSlope)
    _args.append(maxSlides)
    _args.append(floorMaxAngle)
    _args.append(infiniteInertia)
    val _ret = __method_bind.move_and_slide.call(this._handle, _args.toVariant(), 6)
    return _ret.asVector3()
  }

  fun moveAndSlideWithSnap(
    linearVelocity: Vector3,
    snap: Vector3,
    floorNormal: Vector3,
    stopOnSlope: Boolean,
    maxSlides: Int,
    floorMaxAngle: Float,
    infiniteInertia: Boolean
  ): Vector3 {
    val _args = VariantArray.new()
    _args.append(linearVelocity)
    _args.append(snap)
    _args.append(floorNormal)
    _args.append(stopOnSlope)
    _args.append(maxSlides)
    _args.append(floorMaxAngle)
    _args.append(infiniteInertia)
    val _ret = __method_bind.move_and_slide_with_snap.call(this._handle, _args.toVariant(), 7)
    return _ret.asVector3()
  }

  fun setAxisLock(axis: Int, lock: Boolean) {
    val _args = VariantArray.new()
    _args.append(axis)
    _args.append(lock)
    __method_bind.set_axis_lock.call(this._handle, _args.toVariant(), 2)
  }

  fun setSafeMargin(pixels: Float) {
    val _arg = Variant.new(pixels)
    __method_bind.set_safe_margin.call(this._handle, _arg, 1)
  }

  fun testMove(
    from: Transform,
    relVec: Vector3,
    infiniteInertia: Boolean
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(relVec)
    _args.append(infiniteInertia)
    val _ret = __method_bind.test_move.call(this._handle, _args.toVariant(), 3)
    return _ret.asBoolean()
  }

  companion object {
    fun new(): KinematicBody = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("KinematicBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for KinematicBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      KinematicBody(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): KinematicBody = KinematicBody(ptr)
    /**
     * Container for method_bind pointers for KinematicBody
     */
    private object __method_bind {
      val get_axis_lock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_axis_lock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_axis_lock" }
        }
      val get_floor_velocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_floor_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_floor_velocity" }
        }
      val get_safe_margin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_safe_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_safe_margin" }
        }
      val get_slide_collision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_slide_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slide_collision" }
        }
      val get_slide_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_slide_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slide_count" }
        }
      val is_on_ceiling: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "is_on_ceiling".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_on_ceiling" }
        }
      val is_on_floor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "is_on_floor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_on_floor" }
        }
      val is_on_wall: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "is_on_wall".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_on_wall" }
        }
      val move_and_collide: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "move_and_collide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_and_collide" }
        }
      val move_and_slide: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "move_and_slide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_and_slide" }
        }
      val move_and_slide_with_snap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "move_and_slide_with_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_and_slide_with_snap" }
        }
      val set_axis_lock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "set_axis_lock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_axis_lock" }
        }
      val set_safe_margin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "set_safe_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_safe_margin" }
        }
      val test_move: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "test_move".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method test_move" }
        }}
  }
}
