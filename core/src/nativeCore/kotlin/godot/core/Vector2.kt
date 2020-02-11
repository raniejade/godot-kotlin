package godot.core

import gdnative.godot_vector2
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.readValue

class Vector2(
  value: CValue<godot_vector2>
): CoreType<godot_vector2>(value) {

  constructor(x: Float = 0f, y: Float = 0f): this(__new(x, y))
  constructor(x: Int, y: Int): this(x.toFloat(), y.toFloat())

  enum class Axis(private val value: Int) {
    X(0),
    Y(1);

    companion object {
      fun from(value: Int): Axis {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("Invalid enum value $value")
      }
    }
  }

  var x: Float
    get() {
      return Allocator.allocationScope {
        checkNotNull(Godot.gdnative.godot_vector2_get_x)(_value.ptr)
      }
    }
    set(value) {
      _value = Allocator.allocationScope {
        val ptr = _value.ptr
        checkNotNull(Godot.gdnative.godot_vector2_set_x)(ptr, value)
        ptr.pointed.readValue()
      }
    }

  var y: Float
    get() {
      return Allocator.allocationScope {
        checkNotNull(Godot.gdnative.godot_vector2_get_y)(_value.ptr)
      }
    }
    set(value) {
      _value = Allocator.allocationScope {
        val ptr = _value.ptr
        checkNotNull(Godot.gdnative.godot_vector2_set_y)(ptr, value)
        ptr.pointed.readValue()
      }
    }

  fun abs(): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_abs)(_value.ptr)
      )
    }
  }

  fun angle(): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_vector2_angle)(_value.ptr)
    }
  }

  fun angleTo(vec: Vector2): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_vector2_angle_to)(_value.ptr, vec._value.ptr)
    }
  }

  fun angleToPoint(vec: Vector2): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_vector2_angle_to_point)(_value.ptr, vec._value.ptr)
    }
  }

  fun aspect(): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_vector2_aspect)(_value.ptr)
    }
  }

  fun bounce(vec: Vector2): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_bounce)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun clamped(length: Float): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_clamped)(_value.ptr, length)
      )
    }
  }

  fun cubicInterpolate(b: Vector2, preA: Vector2, postB: Vector2, t: Float): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_cubic_interpolate)(
          _value.ptr,
          b._value.ptr,
          preA._value.ptr,
          postB._value.ptr,
          t
        )
      )
    }
  }

  fun distanceTo(vec: Vector2): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_vector2_distance_to)(_value.ptr, vec._value.ptr)
    }
  }

  fun distanceSquaredTo(vec: Vector2): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_vector2_distance_squared_to)(_value.ptr, vec._value.ptr)
    }
  }

  fun dot(vec: Vector2): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_vector2_dot)(_value.ptr, vec._value.ptr)
    }
  }

  fun floor(): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_floor)(_value.ptr)
      )
    }
  }

  fun isNormalized(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_vector2_is_normalized)(_value.ptr)
    }
  }

  fun length(): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_vector2_length)(_value.ptr)
    }
  }

  fun lengthSquared(): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_vector2_length_squared)(_value.ptr)
    }
  }

  fun linearInterpolate(b: Vector2, t: Float): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_linear_interpolate)(_value.ptr, b._value.ptr, t)
      )
    }
  }

  fun moveToward(vec: Vector2, delta: Float): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative12.godot_vector2_move_toward)(_value.ptr, vec._value.ptr, delta)
      )
    }
  }

  fun normalized(): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_normalized)(_value.ptr)
      )
    }
  }

  fun reflect(vec: Vector2): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_reflect)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun rotated(phi: Float): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_rotated)(_value.ptr, phi)
      )
    }
  }

  fun slide(vec: Vector2): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_slide)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun snapped(vec: Vector2): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_snapped)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun tangent(): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_tangent)(_value.ptr)
      )
    }
  }

  override fun toVariant(): Variant {
    return Variant(this)
  }

  override fun toGDString(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_vector2_as_string)(_value.ptr)
      )
    }
  }

  operator fun plus(vec: Vector2): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_operator_add)(_value.ptr, vec._value.ptr)
      )
    }
  }

  operator fun minus(vec: Vector2): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_operator_subtract)(_value.ptr, vec._value.ptr)
      )
    }
  }

  operator fun times(vec: Vector2): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_operator_multiply_vector)(_value.ptr, vec._value.ptr)
      )
    }
  }

  operator fun times(value: Float): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_operator_multiply_scalar)(_value.ptr, value)
      )
    }
  }

  operator fun div(vec: Vector2): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_operator_divide_vector)(_value.ptr, vec._value.ptr)
      )
    }
  }

  operator fun div(value: Float): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_operator_divide_scalar)(_value.ptr, value)
      )
    }
  }

  operator fun unaryMinus(): Vector2 {
    return Allocator.allocationScope {
      Vector2(
        checkNotNull(Godot.gdnative.godot_vector2_operator_neg)(_value.ptr)
      )
    }
  }

  operator fun compareTo(other: Vector2): Int {
    if (this == other) {
      return 0
    }

    return Allocator.allocationScope {
      if (checkNotNull(Godot.gdnative.godot_vector2_operator_less)(_value.ptr, other._value.ptr)) {
        -1
      } else {
        1
      }
    }
  }

  override fun equals(other: Any?): Boolean {
    if (other == null) {
      return false
    }

    return Allocator.allocationScope {
      when (other) {
        is Vector2 -> checkNotNull(Godot.gdnative.godot_vector2_operator_equal)(_value.ptr, other._value.ptr)
        else -> false
      }
    }
  }

  override fun hashCode(): Int {
    return _value.hashCode()
  }

  companion object {
    val ZERO: Vector2
      get() = Vector2()
    val ONE: Vector2
      get() = Vector2(1f, 1f)
    val INF: Vector2
      get() = Vector2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
    val LEFT: Vector2
      get() = Vector2(-1f, 0f)
    val RIGHT: Vector2
      get() = Vector2(1f, 0f)
    val UP: Vector2
      get() = Vector2(0f, -1f)
    val DOWN: Vector2
      get() = Vector2(0f, 1f)

    internal fun __new(x: Float, y: Float) = allocType2<godot_vector2> {
      checkNotNull(Godot.gdnative.godot_vector2_new)(it, x, y)
    }
  }
}
