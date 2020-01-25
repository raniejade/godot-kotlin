package godot

import gdnative.godot_vector3
import gdnative.godot_vector3_axis
import kotlinx.cinterop.*

class Vector3(
  value: CValue<godot_vector3>
): Primitive<godot_vector3>(value) {

  enum class Axis(private val value: Int, internal val axis: godot_vector3_axis) {
    X(0, godot_vector3_axis.GODOT_VECTOR3_AXIS_X),
    Y(1, godot_vector3_axis.GODOT_VECTOR3_AXIS_Y),
    Z(2, godot_vector3_axis.GODOT_VECTOR3_AXIS_Z);

    companion object {
      fun fromValue(value: Int): Axis {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("Unsupported enum value $value")
      }
    }
  }

  var x: Float
    get() {
      return getAxis(Axis.X)
    }
    set(value) {
      setAxis(Axis.X, value)
    }

  var y: Float
    get() {
      return getAxis(Axis.Y)
    }
    set(value) {
      setAxis(Axis.Y, value)
    }

  var z: Float
    get() {
      return getAxis(Axis.Z)
    }
    set(value) {
      setAxis(Axis.Z, value)
    }

  fun abs(): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_abs)(_value.ptr)
      )
    }
  }

  fun angleTo(vec: Vector3): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_vector3_angle_to)(_value.ptr, vec._value.ptr)
    }
  }

  fun bounce(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_bounce)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun cross(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_cross)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun cubicInterpolate(b: Vector3, preA: Vector3, postB: Vector3, t: Float): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_cubic_interpolate)(
          _value.ptr,
          b._value.ptr,
          preA._value.ptr,
          postB._value.ptr,
          t
        )
      )
    }
  }

  fun distanceTo(vec: Vector3): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_vector3_distance_to)(_value.ptr, vec._value.ptr)
    }
  }

  fun distanceSquaredTo(vec: Vector3): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_vector3_distance_squared_to)(_value.ptr, vec._value.ptr)
    }
  }

  fun dot(vec: Vector3): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_vector3_dot)(_value.ptr, vec._value.ptr)
    }
  }

  fun floor(): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_floor)(_value.ptr)
      )
    }
  }

  fun getAxis(axis: Axis): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_vector3_get_axis)(_value.ptr, axis.axis)
    }
  }

  fun inverse(): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_inverse)(_value.ptr)
      )
    }
  }

  fun isNormalized(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_vector3_is_normalized)(_value.ptr)
    }
  }

  fun length(): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_vector3_length)(_value.ptr)
    }
  }

  fun lengthSquared(): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_vector3_length_squared)(_value.ptr)
    }
  }

  fun linearInterpolate(b: Vector3, t: Float): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_linear_interpolate)(_value.ptr, b._value.ptr, t)
      )
    }
  }

  fun maxAxis(): Axis {
    return memScoped {
      Axis.fromValue(
        checkNotNull(Godot.gdnative.godot_vector3_max_axis)(_value.ptr)
      )
    }
  }

  fun minAxis(): Axis {
    return memScoped {
      Axis.fromValue(
        checkNotNull(Godot.gdnative.godot_vector3_min_axis)(_value.ptr)
      )
    }
  }

  fun moveToward(vec: Vector3, delta: Float): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative12.godot_vector3_move_toward)(_value.ptr, vec._value.ptr, delta)
      )
    }
  }

  fun normalized(): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_normalized)(_value.ptr)
      )
    }
  }

  fun outer(vec: Vector3): Basis {
    return memScoped {
      Basis(
        checkNotNull(Godot.gdnative.godot_vector3_outer)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun reflect(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_reflect)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun rotated(axis: Vector3, phi: Float): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_rotated)(_value.ptr, axis._value.ptr, phi)
      )
    }
  }

  fun setAxis(axis: Axis, value: Float) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_vector3_set_axis)(_value.ptr, axis.axis, value)
      ptr.pointed.readValue()
    }
  }

  fun slide(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_slide)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun snapped(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_snapped)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun toDiagonalMatrix(): Basis {
    return memScoped {
      Basis(
        checkNotNull(Godot.gdnative.godot_vector3_to_diagonal_matrix)(_value.ptr)
      )
    }
  }

  fun asString(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_vector3_as_string)(_value.ptr)
      )
    }
  }

  operator fun plus(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_operator_add)(_value.ptr, vec._value.ptr)
      )
    }
  }

  operator fun minus(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_operator_subtract)(_value.ptr, vec._value.ptr)
      )
    }
  }

  operator fun times(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_operator_multiply_vector)(_value.ptr, vec._value.ptr)
      )
    }
  }

  operator fun times(value: Float): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_operator_multiply_scalar)(_value.ptr, value)
      )
    }
  }

  operator fun div(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_operator_divide_vector)(_value.ptr, vec._value.ptr)
      )
    }
  }

  operator fun div(value: Float): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_operator_divide_scalar)(_value.ptr, value)
      )
    }
  }

  operator fun unaryMinus(): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_vector3_operator_neg)(_value.ptr)
      )
    }
  }

  operator fun compareTo(other: Vector3): Int {
    if (this == other) {
      return 0
    }

    return memScoped {
      if (checkNotNull(Godot.gdnative.godot_vector3_operator_less)(_value.ptr, other._value.ptr)) {
        -1
      } else {
        1
      }
    }
  }

  override fun toString(): String {
    return asString().toKString()
  }

  override fun equals(other: Any?): Boolean {
    if (other == null) {
      return false
    }

    return memScoped {
      when (other) {
        is Vector3 -> checkNotNull(Godot.gdnative.godot_vector3_operator_equal)(_value.ptr, other._value.ptr)
        else -> false
      }
    }
  }

  override fun hashCode(): Int {
    return _value.hashCode()
  }

  companion object {
    fun new(x: Float = 0f, y: Float = 0f, z: Float = 0f): Vector3 {
      val value = memScoped {
        val tmp = alloc<godot_vector3>()
        checkNotNull(Godot.gdnative.godot_vector3_new)(tmp.ptr, x, y, z)
        tmp.readValue()
      }
      return Vector3(value)
    }
  }
}
