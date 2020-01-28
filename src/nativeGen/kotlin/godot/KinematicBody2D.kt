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

open class KinematicBody2D(
  _handle: COpaquePointer
) : PhysicsBody2D(_handle) {
  var collisionSafeMargin: Float
    get() {
       return getSafeMargin() 
    }
    set(value) {
      setSafeMargin(value)
    }

  var motionSyncToPhysics: Boolean
    get() {
       return isSyncToPhysicsEnabled() 
    }
    set(value) {
      setSyncToPhysics(value)
    }

  fun getFloorVelocity(): Vector2 {
    val _ret = __method_bind.getFloorVelocity.call(this._handle)
    return _ret.asVector2()
  }

  fun getSafeMargin(): Float {
    val _ret = __method_bind.getSafeMargin.call(this._handle)
    return _ret.asFloat()
  }

  fun getSlideCollision(slideIdx: Int): KinematicCollision2D {
    val _arg = Variant.new(slideIdx)
    val _ret = __method_bind.getSlideCollision.call(this._handle, _arg, 1)
    return _ret.asObject(::KinematicCollision2D)!!
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

  fun isSyncToPhysicsEnabled(): Boolean {
    val _ret = __method_bind.isSyncToPhysicsEnabled.call(this._handle)
    return _ret.asBoolean()
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
    val _ret = __method_bind.moveAndCollide.call(this._handle, _args.toVariant(), 4)
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
    val _ret = __method_bind.moveAndSlide.call(this._handle, _args.toVariant(), 6)
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
    val _ret = __method_bind.moveAndSlideWithSnap.call(this._handle, _args.toVariant(), 7)
    return _ret.asVector2()
  }

  fun setSafeMargin(pixels: Float) {
    val _arg = Variant.new(pixels)
    __method_bind.setSafeMargin.call(this._handle, _arg, 1)
  }

  fun setSyncToPhysics(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setSyncToPhysics.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.testMove.call(this._handle, _args.toVariant(), 3)
    return _ret.asBoolean()
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
      val getFloorVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
            "getFloorVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFloorVelocity" }
        }
      val getSafeMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
            "getSafeMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSafeMargin" }
        }
      val getSlideCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
            "getSlideCollision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSlideCollision" }
        }
      val getSlideCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
            "getSlideCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSlideCount" }
        }
      val isOnCeiling: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
            "isOnCeiling".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isOnCeiling" }
        }
      val isOnFloor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
            "isOnFloor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isOnFloor" }
        }
      val isOnWall: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
            "isOnWall".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isOnWall" }
        }
      val isSyncToPhysicsEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
            "isSyncToPhysicsEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSyncToPhysicsEnabled" }
        }
      val moveAndCollide: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
            "moveAndCollide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveAndCollide" }
        }
      val moveAndSlide: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
            "moveAndSlide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveAndSlide" }
        }
      val moveAndSlideWithSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
            "moveAndSlideWithSnap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveAndSlideWithSnap" }
        }
      val setSafeMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
            "setSafeMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSafeMargin" }
        }
      val setSyncToPhysics: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
            "setSyncToPhysics".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSyncToPhysics" }
        }
      val testMove: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
            "testMove".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method testMove" }
        }}
  }
}
