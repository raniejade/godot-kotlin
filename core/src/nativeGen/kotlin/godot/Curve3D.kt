// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolFloatArray
import godot.core.PoolVector3Array
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

open class Curve3D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var bakeInterval: Float
    get() {
       return getBakeInterval() 
    }
    set(value) {
      setBakeInterval(value)
    }

  var upVectorEnabled: Boolean
    get() {
       return isUpVectorEnabled() 
    }
    set(value) {
      setUpVectorEnabled(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addPoint(
    position: Vector3,
    `in`: Vector3 = Vector3(0, 0, 0),
    out: Vector3 = Vector3(0, 0, 0),
    atPosition: Int = -1
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(`in`))
    _args.add(Variant.fromAny(out))
    _args.add(Variant.fromAny(atPosition))
    __method_bind.addPoint.call(this._handle, _args)
  }

  fun clearPoints() {
    __method_bind.clearPoints.call(this._handle)
  }

  fun getBakeInterval(): Float {
    val _ret = __method_bind.getBakeInterval.call(this._handle)
    return _ret.asFloat()
  }

  fun getBakedLength(): Float {
    val _ret = __method_bind.getBakedLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getBakedPoints(): PoolVector3Array {
    val _ret = __method_bind.getBakedPoints.call(this._handle)
    return _ret.asPoolVector3Array()
  }

  fun getBakedTilts(): PoolFloatArray {
    val _ret = __method_bind.getBakedTilts.call(this._handle)
    return _ret.asPoolFloatArray()
  }

  fun getBakedUpVectors(): PoolVector3Array {
    val _ret = __method_bind.getBakedUpVectors.call(this._handle)
    return _ret.asPoolVector3Array()
  }

  fun getClosestOffset(toPoint: Vector3): Float {
    val _arg = Variant(toPoint)
    val _ret = __method_bind.getClosestOffset.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getClosestPoint(toPoint: Vector3): Vector3 {
    val _arg = Variant(toPoint)
    val _ret = __method_bind.getClosestPoint.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun getPointCount(): Int {
    val _ret = __method_bind.getPointCount.call(this._handle)
    return _ret.asInt()
  }

  fun getPointIn(idx: Int): Vector3 {
    val _arg = Variant(idx)
    val _ret = __method_bind.getPointIn.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun getPointOut(idx: Int): Vector3 {
    val _arg = Variant(idx)
    val _ret = __method_bind.getPointOut.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun getPointPosition(idx: Int): Vector3 {
    val _arg = Variant(idx)
    val _ret = __method_bind.getPointPosition.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun getPointTilt(idx: Int): Float {
    val _arg = Variant(idx)
    val _ret = __method_bind.getPointTilt.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun interpolate(idx: Int, t: Float): Vector3 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(t))
    val _ret = __method_bind.interpolate.call(this._handle, _args)
    return _ret.asVector3()
  }

  fun interpolateBaked(offset: Float, cubic: Boolean = false): Vector3 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(offset))
    _args.add(Variant.fromAny(cubic))
    val _ret = __method_bind.interpolateBaked.call(this._handle, _args)
    return _ret.asVector3()
  }

  fun interpolateBakedUpVector(offset: Float, applyTilt: Boolean = false): Vector3 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(offset))
    _args.add(Variant.fromAny(applyTilt))
    val _ret = __method_bind.interpolateBakedUpVector.call(this._handle, _args)
    return _ret.asVector3()
  }

  fun interpolatef(fofs: Float): Vector3 {
    val _arg = Variant(fofs)
    val _ret = __method_bind.interpolatef.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun isUpVectorEnabled(): Boolean {
    val _ret = __method_bind.isUpVectorEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun removePoint(idx: Int) {
    val _arg = Variant(idx)
    __method_bind.removePoint.call(this._handle, listOf(_arg))
  }

  fun setBakeInterval(distance: Float) {
    val _arg = Variant(distance)
    __method_bind.setBakeInterval.call(this._handle, listOf(_arg))
  }

  fun setPointIn(idx: Int, position: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(position))
    __method_bind.setPointIn.call(this._handle, _args)
  }

  fun setPointOut(idx: Int, position: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(position))
    __method_bind.setPointOut.call(this._handle, _args)
  }

  fun setPointPosition(idx: Int, position: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(position))
    __method_bind.setPointPosition.call(this._handle, _args)
  }

  fun setPointTilt(idx: Int, tilt: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(tilt))
    __method_bind.setPointTilt.call(this._handle, _args)
  }

  fun setUpVectorEnabled(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setUpVectorEnabled.call(this._handle, listOf(_arg))
  }

  fun tessellate(maxStages: Int = 5, toleranceDegrees: Float = 4.0f): PoolVector3Array {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(maxStages))
    _args.add(Variant.fromAny(toleranceDegrees))
    val _ret = __method_bind.tessellate.call(this._handle, _args)
    return _ret.asPoolVector3Array()
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Curve3D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Curve3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Curve3D
     */
    private object __method_bind {
      val addPoint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "add_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_point" }
        }
      val clearPoints: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "clear_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_points" }
        }
      val getBakeInterval: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "get_bake_interval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_interval" }
        }
      val getBakedLength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "get_baked_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_baked_length" }
        }
      val getBakedPoints: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "get_baked_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_baked_points" }
        }
      val getBakedTilts: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "get_baked_tilts".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_baked_tilts" }
        }
      val getBakedUpVectors: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "get_baked_up_vectors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_baked_up_vectors" }
        }
      val getClosestOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "get_closest_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_offset" }
        }
      val getClosestPoint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "get_closest_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
        }
      val getPointCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "get_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_count" }
        }
      val getPointIn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "get_point_in".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_in" }
        }
      val getPointOut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "get_point_out".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_out" }
        }
      val getPointPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "get_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_position" }
        }
      val getPointTilt: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "get_point_tilt".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_tilt" }
        }
      val interpolate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "interpolate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate" }
        }
      val interpolateBaked: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "interpolate_baked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate_baked" }
        }
      val interpolateBakedUpVector: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "interpolate_baked_up_vector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate_baked_up_vector" }
        }
      val interpolatef: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "interpolatef".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolatef" }
        }
      val isUpVectorEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "is_up_vector_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_up_vector_enabled" }
        }
      val removePoint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "remove_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_point" }
        }
      val setBakeInterval: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "set_bake_interval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bake_interval" }
        }
      val setPointIn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "set_point_in".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_in" }
        }
      val setPointOut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "set_point_out".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_out" }
        }
      val setPointPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "set_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_position" }
        }
      val setPointTilt: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "set_point_tilt".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_tilt" }
        }
      val setUpVectorEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "set_up_vector_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_up_vector_enabled" }
        }
      val tessellate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
            "tessellate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tessellate" }
        }}
  }
}
