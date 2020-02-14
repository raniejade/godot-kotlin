package godot.core

import gdnative.godot_basis
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.readValue

class Basis(
  value: CValue<godot_basis>
) : CoreType<godot_basis>(value) {
  constructor(): this(__new())
  constructor(vec: Vector3): this(__new(vec))
  constructor(vec: Vector3, phi: Float): this(__new(vec, phi))
  constructor(quat: Quat): this(__new(quat))
  constructor(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): this(__new()) {
    x = xAxis
    y = yAxis
    z = zAxis
  }

  var x: Vector3
    get() = getAxis(Axis.X)
    set(value) {
      setAxis(Axis.X, value)
    }

  fun x(cb: Vector3.() -> Unit) {
    val value = x
    cb(x)
    x = value
  }

  var y: Vector3
    get() = getAxis(Axis.Y)
    set(value) {
      setAxis(Axis.Y, value)
    }

  fun y(cb: Vector3.() -> Unit) {
    val value = y
    cb(value)
    y = value
  }

  var z: Vector3
    get() = getAxis(Axis.Z)
    set(value) {
      setAxis(Axis.Z, value)
    }

  fun z(cb: Vector3.() -> Unit) {
    val value = z
    cb(value)
    z = value
  }

  enum class Axis(val value: Int) {
    X(0),
    Y(1),
    Z(2);

    companion object {
      fun from(value: Int): Axis {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("Unsupported enum value $value")
      }
    }
  }

  fun determinant(): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_basis_determinant)(_value.ptr)
    }
  }

  fun getEuler(): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_basis_get_euler)(_value.ptr)
      )
    }
  }

  fun getAxis(axis: Axis): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_basis_get_axis)(_value.ptr, axis.value)
      )
    }
  }

  fun setAxis(axis: Axis, value: Vector3) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_basis_set_axis)(ptr, axis.value, value._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun getOrthogonalIndex(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_basis_get_orthogonal_index)(_value.ptr)
    }
  }

  fun getScale(): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_basis_get_scale)(_value.ptr)
      )
    }
  }

  fun orthonormalized(): Basis {
    return Allocator.allocationScope {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_orthonormalized)(_value.ptr)
      )
    }
  }

  fun rotated(axis: Vector3, phi: Float): Basis {
    return Allocator.allocationScope {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_rotated)(_value.ptr, axis._value.ptr, phi)
      )
    }
  }

  fun scaled(scale: Vector3): Basis {
    return Allocator.allocationScope {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_scaled)(_value.ptr, scale._value.ptr)
      )
    }
  }

  fun slerp(basis: Basis, t: Float): Basis {
    return Allocator.allocationScope {
      Basis(
        checkNotNull(Godot.gdnative11.godot_basis_slerp)(_value.ptr, basis._value.ptr, t)
      )
    }
  }

  fun tdox(vec: Vector3): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_basis_tdotx)(_value.ptr, vec._value.ptr)
    }
  }

  fun tdoy(vec: Vector3): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_basis_tdoty)(_value.ptr, vec._value.ptr)
    }
  }

  fun tdoz(vec: Vector3): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_basis_tdotz)(_value.ptr, vec._value.ptr)
    }
  }

  fun transposed(): Basis {
    return Allocator.allocationScope {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_transposed)(_value.ptr)
      )
    }
  }

  fun xform(vec: Vector3): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_basis_xform)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun xformInverse(vec: Vector3): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_basis_xform_inv)(_value.ptr, vec._value.ptr)
      )
    }
  }

  operator fun plus(basis: Basis): Basis {
    return Allocator.allocationScope {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_operator_add)(_value.ptr, basis._value.ptr)
      )
    }
  }

  operator fun minus(basis: Basis): Basis {
    return Allocator.allocationScope {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_operator_subtract)(_value.ptr, basis._value.ptr)
      )
    }
  }

  operator fun times(scalar: Float): Basis {
    return Allocator.allocationScope {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_operator_multiply_scalar)(_value.ptr, scalar)
      )
    }
  }

  operator fun times(basis: Basis): Basis {
    return Allocator.allocationScope {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_operator_multiply_vector)(_value.ptr, basis._value.ptr)
      )
    }
  }

  override fun equals(other: Any?): Boolean {
    if (other == null) {
      return false
    }

    return Allocator.allocationScope {
      when(other) {
        is Basis -> checkNotNull(Godot.gdnative.godot_basis_operator_equal)(_value.ptr, other._value.ptr)
        else -> false
      }
    }
  }

  operator fun get(axis: Int): Vector3 {
    return getAxis(Axis.from(axis))
  }

  operator fun set(axis: Int, value: Vector3) {
    setAxis(Axis.from(axis), value)
  }

  override fun hashCode(): Int {
    return _value.hashCode()
  }

  override fun toVariant(): Variant {
    return Variant(this)
  }

  override fun toGDString(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_basis_as_string)(_value.ptr)
      )
    }
  }

  companion object {
    internal fun __new() = allocType2<godot_basis> {
      checkNotNull(Godot.gdnative.godot_basis_new)(it)
    }

    internal fun __new(vec: Vector3) = allocType2<godot_basis> {
      checkNotNull(Godot.gdnative.godot_basis_new_with_euler)(it, vec._value.ptr)
    }

    internal fun __new(vec: Vector3, phi: Float) = allocType2<godot_basis> {
      checkNotNull(Godot.gdnative.godot_basis_new_with_axis_and_angle)(it, vec._value.ptr, phi)
    }

    internal fun __new(quat: Quat) = allocType2<godot_basis> {
      checkNotNull(Godot.gdnative.godot_basis_new_with_euler_quat)(it, quat._value.ptr)
    }
  }
}