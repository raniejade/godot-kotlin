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
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class KinematicBody(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PhysicsBody(null) {
  var collisionSafeMargin: Float
    get() {
       return getSafeMargin() 
    }
    set(value) {
      setSafeMargin(value)
    }

  var moveLockX: Boolean
    get() {
       return getAxisLock(1) 
    }
    set(value) {
      setAxisLock(1, value)
    }

  var moveLockY: Boolean
    get() {
       return getAxisLock(2) 
    }
    set(value) {
      setAxisLock(2, value)
    }

  var moveLockZ: Boolean
    get() {
       return getAxisLock(4) 
    }
    set(value) {
      setAxisLock(4, value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getAxisLock(axis: Int): Boolean {
    val _arg = Variant.new(axis)
    val _ret = __method_bind.getAxisLock.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getFloorNormal(): Vector3 {
    val _ret = __method_bind.getFloorNormal.call(this._handle)
    return _ret.asVector3()
  }

  fun getFloorVelocity(): Vector3 {
    val _ret = __method_bind.getFloorVelocity.call(this._handle)
    return _ret.asVector3()
  }

  fun getSafeMargin(): Float {
    val _ret = __method_bind.getSafeMargin.call(this._handle)
    return _ret.asFloat()
  }

  fun getSlideCollision(slideIdx: Int): KinematicCollision {
    val _arg = Variant.new(slideIdx)
    val _ret = __method_bind.getSlideCollision.call(this._handle, listOf(_arg))
    return _ret.asObject(::KinematicCollision)!!
  }

  fun getSlideCount(): Int {
    val _ret = __method_bind.getSlideCount.call(this._handle)
    return _ret.asInt()
  }

  fun isOnCeiling(): Boolean {
    val _ret = __method_bind.isOnCeiling.call(this._handle)
    return _ret.asBoolean()
  }

  fun isOnFloor(): Boolean {
    val _ret = __method_bind.isOnFloor.call(this._handle)
    return _ret.asBoolean()
  }

  fun isOnWall(): Boolean {
    val _ret = __method_bind.isOnWall.call(this._handle)
    return _ret.asBoolean()
  }

  fun moveAndCollide(
    relVec: Vector3,
    infiniteInertia: Boolean = true,
    excludeRaycastShapes: Boolean = true,
    testOnly: Boolean = false
  ): KinematicCollision {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(relVec))
    _args.add(Variant.fromAny(infiniteInertia))
    _args.add(Variant.fromAny(excludeRaycastShapes))
    _args.add(Variant.fromAny(testOnly))
    val _ret = __method_bind.moveAndCollide.call(this._handle, _args)
    return _ret.asObject(::KinematicCollision)!!
  }

  fun moveAndSlide(
    linearVelocity: Vector3,
    upDirection: Vector3 = Vector3.new(0, 0, 0),
    stopOnSlope: Boolean = false,
    maxSlides: Int = 4,
    floorMaxAngle: Float = 0.785398f,
    infiniteInertia: Boolean = true
  ): Vector3 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(linearVelocity))
    _args.add(Variant.fromAny(upDirection))
    _args.add(Variant.fromAny(stopOnSlope))
    _args.add(Variant.fromAny(maxSlides))
    _args.add(Variant.fromAny(floorMaxAngle))
    _args.add(Variant.fromAny(infiniteInertia))
    val _ret = __method_bind.moveAndSlide.call(this._handle, _args)
    return _ret.asVector3()
  }

  fun moveAndSlideWithSnap(
    linearVelocity: Vector3,
    snap: Vector3,
    upDirection: Vector3 = Vector3.new(0, 0, 0),
    stopOnSlope: Boolean = false,
    maxSlides: Int = 4,
    floorMaxAngle: Float = 0.785398f,
    infiniteInertia: Boolean = true
  ): Vector3 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(linearVelocity))
    _args.add(Variant.fromAny(snap))
    _args.add(Variant.fromAny(upDirection))
    _args.add(Variant.fromAny(stopOnSlope))
    _args.add(Variant.fromAny(maxSlides))
    _args.add(Variant.fromAny(floorMaxAngle))
    _args.add(Variant.fromAny(infiniteInertia))
    val _ret = __method_bind.moveAndSlideWithSnap.call(this._handle, _args)
    return _ret.asVector3()
  }

  fun setAxisLock(axis: Int, lock: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(axis))
    _args.add(Variant.fromAny(lock))
    __method_bind.setAxisLock.call(this._handle, _args)
  }

  fun setSafeMargin(pixels: Float) {
    val _arg = Variant.new(pixels)
    __method_bind.setSafeMargin.call(this._handle, listOf(_arg))
  }

  fun testMove(
    from: Transform,
    relVec: Vector3,
    infiniteInertia: Boolean = true
  ): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(relVec))
    _args.add(Variant.fromAny(infiniteInertia))
    val _ret = __method_bind.testMove.call(this._handle, _args)
    return _ret.asBoolean()
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("KinematicBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for KinematicBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for KinematicBody
     */
    private object __method_bind {
      val getAxisLock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_axis_lock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_axis_lock" }
        }
      val getFloorNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_floor_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_floor_normal" }
        }
      val getFloorVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_floor_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_floor_velocity" }
        }
      val getSafeMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_safe_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_safe_margin" }
        }
      val getSlideCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_slide_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slide_collision" }
        }
      val getSlideCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "get_slide_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slide_count" }
        }
      val isOnCeiling: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "is_on_ceiling".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_on_ceiling" }
        }
      val isOnFloor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "is_on_floor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_on_floor" }
        }
      val isOnWall: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "is_on_wall".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_on_wall" }
        }
      val moveAndCollide: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "move_and_collide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_and_collide" }
        }
      val moveAndSlide: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "move_and_slide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_and_slide" }
        }
      val moveAndSlideWithSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "move_and_slide_with_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_and_slide_with_snap" }
        }
      val setAxisLock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "set_axis_lock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_axis_lock" }
        }
      val setSafeMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "set_safe_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_safe_margin" }
        }
      val testMove: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "test_move".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method test_move" }
        }}
  }
}
