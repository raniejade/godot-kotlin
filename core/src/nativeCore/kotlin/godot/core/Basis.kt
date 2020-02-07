package godot.core

import gdnative.godot_basis
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class Basis(
  value: CValue<godot_basis>
) : CoreType<godot_basis>(value) {
  constructor(): this(__new())
  constructor(vec: Vector3): this(__new(vec))
  constructor(vec: Vector3, phi: Float): this(__new(vec, phi))
  constructor(quat: Quat): this(__new(quat))
  constructor(r1: Vector3, r2: Vector3, r3: Vector3): this(__new(r1, r2, r3))

  fun determinant(): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_basis_determinant)(_value.ptr)
    }
  }

  fun getEuler(): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_basis_get_euler)(_value.ptr)
      )
    }
  }

  fun getOrthogonalIndex(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_basis_get_orthogonal_index)(_value.ptr)
    }
  }

  fun getScale(): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_basis_get_scale)(_value.ptr)
      )
    }
  }

  fun orthonormalized(): Basis {
    return memScoped {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_orthonormalized)(_value.ptr)
      )
    }
  }

  fun rotated(axis: Vector3, phi: Float): Basis {
    return memScoped {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_rotated)(_value.ptr, axis._value.ptr, phi)
      )
    }
  }

  fun scaled(scale: Vector3): Basis {
    return memScoped {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_scaled)(_value.ptr, scale._value.ptr)
      )
    }
  }

  fun slerp(basis: Basis, t: Float): Basis {
    return memScoped {
      Basis(
        checkNotNull(Godot.gdnative11.godot_basis_slerp)(_value.ptr, basis._value.ptr, t)
      )
    }
  }

  fun tdox(vec: Vector3): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_basis_tdotx)(_value.ptr, vec._value.ptr)
    }
  }

  fun tdoy(vec: Vector3): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_basis_tdoty)(_value.ptr, vec._value.ptr)
    }
  }

  fun tdoz(vec: Vector3): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_basis_tdotz)(_value.ptr, vec._value.ptr)
    }
  }

  fun transposed(): Basis {
    return memScoped {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_transposed)(_value.ptr)
      )
    }
  }

  fun xform(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_basis_xform)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun xformInverse(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_basis_xform_inv)(_value.ptr, vec._value.ptr)
      )
    }
  }

  operator fun plus(basis: Basis): Basis {
    return memScoped {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_operator_add)(_value.ptr, basis._value.ptr)
      )
    }
  }

  operator fun minus(basis: Basis): Basis {
    return memScoped {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_operator_subtract)(_value.ptr, basis._value.ptr)
      )
    }
  }

  operator fun times(scalar: Float): Basis {
    return memScoped {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_operator_multiply_scalar)(_value.ptr, scalar)
      )
    }
  }

  operator fun times(basis: Basis): Basis {
    return memScoped {
      Basis(
        checkNotNull(Godot.gdnative.godot_basis_operator_multiply_vector)(_value.ptr, basis._value.ptr)
      )
    }
  }

  override fun equals(other: Any?): Boolean {
    if (other == null) {
      return false
    }

    return memScoped {
      when(other) {
        is Basis -> checkNotNull(Godot.gdnative.godot_basis_operator_equal)(_value.ptr, other._value.ptr)
        else -> false
      }
    }
  }

  override fun hashCode(): Int {
    return _value.hashCode()
  }

  override fun toVariant(): Variant {
    return Variant(this)
  }

  override fun toGDString(): GDString {
    return memScoped {
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

    internal fun __new(r1: Vector3, r2: Vector3, r3: Vector3) = allocType2<godot_basis> {
      checkNotNull(Godot.gdnative.godot_basis_new_with_rows)(it, r1._value.ptr, r2._value.ptr, r3._value.ptr)
    }
  }
}