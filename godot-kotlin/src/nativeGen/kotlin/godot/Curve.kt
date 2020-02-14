// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class Curve(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var bakeResolution: Int
    get() {
       return getBakeResolution() 
    }
    set(value) {
      setBakeResolution(value)
    }

  var maxValue: Float
    get() {
       return getMaxValue() 
    }
    set(value) {
      setMaxValue(value)
    }

  var minValue: Float
    get() {
       return getMinValue() 
    }
    set(value) {
      setMinValue(value)
    }

  /**
   * Curve::range_changed signal
   */
  val signalRangeChanged: Signal0 = Signal0("range_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _get_data(): VariantArray {
    TODO()
  }

  open fun _set_data(data: VariantArray) {
    TODO()
  }

  fun addPoint(
    position: Vector2,
    leftTangent: Float = 0.0f,
    rightTangent: Float = 0.0f,
    leftMode: Int = 0,
    rightMode: Int = 0
  ): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(position)
      _args.add(leftTangent)
      _args.add(rightTangent)
      _args.add(leftMode)
      _args.add(rightMode)
      __method_bind.addPoint.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun bake() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.bake.call(self._handle, emptyList(), null)
    }
  }

  fun cleanDupes() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.cleanDupes.call(self._handle, emptyList(), null)
    }
  }

  fun clearPoints() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearPoints.call(self._handle, emptyList(), null)
    }
  }

  fun getBakeResolution(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBakeResolution.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMaxValue(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMaxValue.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMinValue(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMinValue.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
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

  fun getPointLeftMode(index: Int): TangentMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPointLeftMode.call(self._handle, listOf(index), _retPtr)
      Curve.TangentMode.from(_ret.value)
    }
  }

  fun getPointLeftTangent(index: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPointLeftTangent.call(self._handle, listOf(index), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPointPosition(index: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getPointPosition.call(self._handle, listOf(index), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPointRightMode(index: Int): TangentMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPointRightMode.call(self._handle, listOf(index), _retPtr)
      Curve.TangentMode.from(_ret.value)
    }
  }

  fun getPointRightTangent(index: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPointRightTangent.call(self._handle, listOf(index), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun interpolate(offset: Float): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.interpolate.call(self._handle, listOf(offset), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun interpolateBaked(offset: Float): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.interpolateBaked.call(self._handle, listOf(offset), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun removePoint(index: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removePoint.call(self._handle, listOf(index), null)
    }
  }

  fun setBakeResolution(resolution: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBakeResolution.call(self._handle, listOf(resolution), null)
    }
  }

  fun setMaxValue(max: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaxValue.call(self._handle, listOf(max), null)
    }
  }

  fun setMinValue(min: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMinValue.call(self._handle, listOf(min), null)
    }
  }

  fun setPointLeftMode(index: Int, mode: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(index)
      _args.add(mode)
      __method_bind.setPointLeftMode.call(self._handle, _args, null)
    }
  }

  fun setPointLeftTangent(index: Int, tangent: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(index)
      _args.add(tangent)
      __method_bind.setPointLeftTangent.call(self._handle, _args, null)
    }
  }

  fun setPointOffset(index: Int, offset: Float): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(index)
      _args.add(offset)
      __method_bind.setPointOffset.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun setPointRightMode(index: Int, mode: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(index)
      _args.add(mode)
      __method_bind.setPointRightMode.call(self._handle, _args, null)
    }
  }

  fun setPointRightTangent(index: Int, tangent: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(index)
      _args.add(tangent)
      __method_bind.setPointRightTangent.call(self._handle, _args, null)
    }
  }

  fun setPointValue(index: Int, y: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(index)
      _args.add(y)
      __method_bind.setPointValue.call(self._handle, _args, null)
    }
  }

  enum class TangentMode(
    val value: Int
  ) {
    FREE(0),

    LINEAR(1),

    COUNT(2);

    companion object {
      fun from(value: Int): TangentMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Curve".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Curve" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Curve
     */
    private object __method_bind {
      val addPoint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "add_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_point" }
        }
      val bake: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "bake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bake" }
        }
      val cleanDupes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "clean_dupes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clean_dupes" }
        }
      val clearPoints: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "clear_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_points" }
        }
      val getBakeResolution: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_bake_resolution".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_resolution" }
        }
      val getMaxValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_max_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_value" }
        }
      val getMinValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_min_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_min_value" }
        }
      val getPointCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_count" }
        }
      val getPointLeftMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_left_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_left_mode" }
        }
      val getPointLeftTangent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_left_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_left_tangent" }
        }
      val getPointPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_position" }
        }
      val getPointRightMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_right_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_right_mode" }
        }
      val getPointRightTangent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_right_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_right_tangent" }
        }
      val interpolate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "interpolate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate" }
        }
      val interpolateBaked: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "interpolate_baked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate_baked" }
        }
      val removePoint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "remove_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_point" }
        }
      val setBakeResolution: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_bake_resolution".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bake_resolution" }
        }
      val setMaxValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_max_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_value" }
        }
      val setMinValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_min_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_min_value" }
        }
      val setPointLeftMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_left_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_left_mode" }
        }
      val setPointLeftTangent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_left_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_left_tangent" }
        }
      val setPointOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_offset" }
        }
      val setPointRightMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_right_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_right_mode" }
        }
      val setPointRightTangent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_right_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_right_tangent" }
        }
      val setPointValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_value" }
        }}
  }
}
