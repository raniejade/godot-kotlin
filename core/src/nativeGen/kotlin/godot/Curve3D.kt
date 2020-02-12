// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
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
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

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
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(position)
      _args.add(`in`)
      _args.add(out)
      _args.add(atPosition)
      __method_bind.addPoint.call(self._handle, _args, null)
    }
  }

  fun clearPoints() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearPoints.call(self._handle, emptyList(), null)
    }
  }

  fun getBakeInterval(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBakeInterval.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getBakedLength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBakedLength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getBakedPoints(): PoolVector3Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector3Array()
      val _retPtr = _ret._value.ptr
      __method_bind.getBakedPoints.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBakedTilts(): PoolFloatArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolFloatArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getBakedTilts.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBakedUpVectors(): PoolVector3Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector3Array()
      val _retPtr = _ret._value.ptr
      __method_bind.getBakedUpVectors.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getClosestOffset(toPoint: Vector3): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getClosestOffset.call(self._handle, listOf(toPoint), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getClosestPoint(toPoint: Vector3): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getClosestPoint.call(self._handle, listOf(toPoint), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPointCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPointCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPointIn(idx: Int): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getPointIn.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPointOut(idx: Int): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getPointOut.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPointPosition(idx: Int): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getPointPosition.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPointTilt(idx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPointTilt.call(self._handle, listOf(idx), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun interpolate(idx: Int, t: Float): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(t)
      __method_bind.interpolate.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun interpolateBaked(offset: Float, cubic: Boolean = false): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(offset)
      _args.add(cubic)
      __method_bind.interpolateBaked.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun interpolateBakedUpVector(offset: Float, applyTilt: Boolean = false): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(offset)
      _args.add(applyTilt)
      __method_bind.interpolateBakedUpVector.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun interpolatef(fofs: Float): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.interpolatef.call(self._handle, listOf(fofs), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isUpVectorEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUpVectorEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun removePoint(idx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removePoint.call(self._handle, listOf(idx), null)
    }
  }

  fun setBakeInterval(distance: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBakeInterval.call(self._handle, listOf(distance), null)
    }
  }

  fun setPointIn(idx: Int, position: Vector3) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(position)
      __method_bind.setPointIn.call(self._handle, _args, null)
    }
  }

  fun setPointOut(idx: Int, position: Vector3) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(position)
      __method_bind.setPointOut.call(self._handle, _args, null)
    }
  }

  fun setPointPosition(idx: Int, position: Vector3) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(position)
      __method_bind.setPointPosition.call(self._handle, _args, null)
    }
  }

  fun setPointTilt(idx: Int, tilt: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(tilt)
      __method_bind.setPointTilt.call(self._handle, _args, null)
    }
  }

  fun setUpVectorEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUpVectorEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun tessellate(maxStages: Int = 5, toleranceDegrees: Float = 4.0f): PoolVector3Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector3Array()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(maxStages)
      _args.add(toleranceDegrees)
      __method_bind.tessellate.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
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
