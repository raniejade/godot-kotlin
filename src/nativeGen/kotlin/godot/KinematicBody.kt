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
  var collisionSafeMargin: Float
    get() {
       return getSafeMargin() 
    }
    set(value) {
      setSafeMargin(value)
    }

  fun getAxisLock(axis: Int): Boolean {
    val _arg = Variant.new(axis)
    val _ret = __method_bind.getAxisLock.call(this._handle, _arg, 1)
    return _ret.asBoolean()
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
    val _ret = __method_bind.getSlideCollision.call(this._handle, _arg, 1)
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
    infiniteInertia: Boolean,
    excludeRaycastShapes: Boolean,
    testOnly: Boolean
  ): KinematicCollision {
    val _args = VariantArray.new()
    _args.append(relVec)
    _args.append(infiniteInertia)
    _args.append(excludeRaycastShapes)
    _args.append(testOnly)
    val _ret = __method_bind.moveAndCollide.call(this._handle, _args.toVariant(), 4)
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
    val _ret = __method_bind.moveAndSlide.call(this._handle, _args.toVariant(), 6)
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
    val _ret = __method_bind.moveAndSlideWithSnap.call(this._handle, _args.toVariant(), 7)
    return _ret.asVector3()
  }

  fun setAxisLock(axis: Int, lock: Boolean) {
    val _args = VariantArray.new()
    _args.append(axis)
    _args.append(lock)
    __method_bind.setAxisLock.call(this._handle, _args.toVariant(), 2)
  }

  fun setSafeMargin(pixels: Float) {
    val _arg = Variant.new(pixels)
    __method_bind.setSafeMargin.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.testMove.call(this._handle, _args.toVariant(), 3)
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
      val getAxisLock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "getAxisLock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAxisLock" }
        }
      val getFloorVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "getFloorVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFloorVelocity" }
        }
      val getSafeMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "getSafeMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSafeMargin" }
        }
      val getSlideCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "getSlideCollision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSlideCollision" }
        }
      val getSlideCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "getSlideCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSlideCount" }
        }
      val isOnCeiling: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "isOnCeiling".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isOnCeiling" }
        }
      val isOnFloor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "isOnFloor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isOnFloor" }
        }
      val isOnWall: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "isOnWall".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isOnWall" }
        }
      val moveAndCollide: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "moveAndCollide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveAndCollide" }
        }
      val moveAndSlide: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "moveAndSlide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveAndSlide" }
        }
      val moveAndSlideWithSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "moveAndSlideWithSnap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveAndSlideWithSnap" }
        }
      val setAxisLock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "setAxisLock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAxisLock" }
        }
      val setSafeMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "setSafeMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSafeMargin" }
        }
      val testMove: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody".cstr.ptr,
            "testMove".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method testMove" }
        }}
  }
}
