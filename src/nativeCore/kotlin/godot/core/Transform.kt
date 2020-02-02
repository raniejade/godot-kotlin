package godot.core

import gdnative.godot_transform
import kotlinx.cinterop.*

class Transform(
  value: CValue<godot_transform>
) : CoreType<godot_transform>(value) {
  var basis: Basis
    get() = memScoped {
      Basis(
        checkNotNull(Godot.gdnative.godot_transform_get_basis)(_value.ptr)
      )
    }
    set(value) {
      _value = memScoped {
        val ptr = _value.ptr
        checkNotNull(Godot.gdnative.godot_transform_set_basis)(ptr, value._value.ptr)
        ptr.pointed.readValue()
      }
    }

  fun basis(cb: Basis.() -> Unit) {
    val value = basis
    cb(value)
    basis = value
  }

  var origin: Vector3
    get() = memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_transform_get_origin)(_value.ptr)
      )
    }
    set(value) {
      _value = memScoped {
        val ptr = _value.ptr
        checkNotNull(Godot.gdnative.godot_transform_set_origin)(ptr, value._value.ptr)
        ptr.pointed.readValue()
      }
    }

  fun origin(cb: Vector3.() -> Unit) {
    val value = origin
    cb(value)
    origin = value
  }

  fun affineInverse(): Transform {
    return memScoped {
      Transform(
        checkNotNull(Godot.gdnative.godot_transform_affine_inverse)(_value.ptr)
      )
    }
  }

  @MissingGDNativeAPI("Transform::interpolate_with")
  fun interpolateWith(transform: Transform, weight: Float): Transform = missingGDNativeAPI()

  fun lookingAt(target: Vector3, up: Vector3): Transform {
    return memScoped {
      Transform(
        checkNotNull(Godot.gdnative.godot_transform_looking_at)(_value.ptr, target._value.ptr, up._value.ptr)
      )
    }
  }

  fun orthonormalized(): Transform {
    return memScoped {
      Transform(
        checkNotNull(Godot.gdnative.godot_transform_orthonormalized)(_value.ptr)
      )
    }
  }

  fun rotated(axis: Vector3, phi: Float): Transform {
    return memScoped {
      Transform(
        checkNotNull(Godot.gdnative.godot_transform_rotated)(_value.ptr, axis._value.ptr, phi)
      )
    }
  }

  fun scaled(scale: Vector3): Transform {
    return memScoped {
      Transform(
        checkNotNull(Godot.gdnative.godot_transform_scaled)(_value.ptr, scale._value.ptr)
      )
    }
  }

  fun translated(offset: Vector3): Transform {
    return memScoped {
      Transform(
        checkNotNull(Godot.gdnative.godot_transform_translated)(_value.ptr, offset._value.ptr)
      )
    }
  }

  fun xform(aabb: AABB): AABB {
    return memScoped {
      AABB(
        checkNotNull(Godot.gdnative.godot_transform_xform_aabb)(_value.ptr, aabb._value.ptr)
      )
    }
  }

  fun xform(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_transform_xform_vector3)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun xform(plane: Plane): Plane {
    return memScoped {
      Plane(
        checkNotNull(Godot.gdnative.godot_transform_xform_plane)(_value.ptr, plane._value.ptr)
      )
    }
  }

  fun xformInverse(aabb: AABB): AABB {
    return memScoped {
      AABB(
        checkNotNull(Godot.gdnative.godot_transform_xform_inv_aabb)(_value.ptr, aabb._value.ptr)
      )
    }
  }

  fun xformInverse(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_transform_xform_inv_vector3)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun xformInverse(plane: Plane): Plane {
    return memScoped {
      Plane(
        checkNotNull(Godot.gdnative.godot_transform_xform_inv_plane)(_value.ptr, plane._value.ptr)
      )
    }
  }

  operator fun times(other: Transform): Transform {
    return memScoped {
      Transform(
        checkNotNull(Godot.gdnative.godot_transform_operator_multiply)(_value.ptr, other._value.ptr)
      )
    }
  }

  override fun equals(other: Any?): Boolean {
    if (other == null || other !is Transform) {
      return false
    }
    return memScoped {
      checkNotNull(Godot.gdnative.godot_transform_operator_equal)(_value.ptr, other._value.ptr)
    }
  }

  override fun hashCode(): Int {
    return _value.hashCode()
  }

  override fun toVariant(): Variant {
    return Variant.new(this)
  }

  override fun toGDString(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_transform_as_string)(_value.ptr)
      )
    }
  }

  companion object {
    fun new(): Transform {
      return allocType(::Transform) {
        checkNotNull(Godot.gdnative.godot_transform_new_identity)(it)
      }
    }

    fun new(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3, origin: Vector3): Transform {
      return allocType(::Transform) {
        checkNotNull(Godot.gdnative.godot_transform_new_with_axis_origin)(
          it,
          xAxis._value.ptr,
          yAxis._value.ptr,
          zAxis._value.ptr,
          origin._value.ptr
        )
      }
    }

    fun new(basis: Basis, origin: Vector3): Transform {
      return allocType(::Transform) {
        checkNotNull(Godot.gdnative.godot_transform_new)(it, basis._value.ptr, origin._value.ptr)
      }
    }

    fun new(from: Quat): Transform {
      return allocType(::Transform) {
        checkNotNull(Godot.gdnative11.godot_transform_new_with_quat)(it, from._value.ptr)
      }
    }
  }
}