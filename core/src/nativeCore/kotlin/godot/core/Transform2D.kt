package godot.core

import gdnative.godot_transform2d
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class Transform2D(
  value: CValue<godot_transform2d>
) : CoreType<godot_transform2d>(value) {

  constructor(): this(__new())
  constructor(from: Transform): this(__new(from))
  constructor(xAxis: Vector2, yAxis: Vector2, origin: Vector2): this(__new(xAxis, yAxis, origin))
  constructor(rotation: Float, position: Vector2): this(__new(rotation, position))

  val origin: Vector2
    get() = getOrigin()

  @get:MissingGDNativeAPI("Transform2D::x")
  val x: Vector2
    get() = missingGDNativeAPI()

  @get:MissingGDNativeAPI("Transform2D::y")
  val y: Vector2
    get() = missingGDNativeAPI()


  fun affineInverse(): Transform2D {
    return memScoped {
      Transform2D(
        checkNotNull(Godot.gdnative.godot_transform2d_affine_inverse)(_value.ptr)
      )
    }
  }

  fun basisXform(v: Vector2): Vector2 {
    return memScoped {
      Vector2(
        checkNotNull(Godot.gdnative.godot_transform2d_basis_xform_vector2)(_value.ptr, v._value.ptr)
      )
    }
  }

  fun basisXformInv(v: Vector2): Vector2 {
    return memScoped {
      Vector2(
        checkNotNull(Godot.gdnative.godot_transform2d_basis_xform_inv_vector2)(_value.ptr, v._value.ptr)
      )
    }
  }

  fun getOrigin(): Vector2 {
    return memScoped {
      Vector2(
        checkNotNull(Godot.gdnative.godot_transform2d_get_origin)(_value.ptr)
      )
    }
  }

  fun getRotation(): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_transform2d_get_rotation)(_value.ptr)
    }
  }

  fun getScale(): Vector2 {
    return memScoped {
      Vector2(
        checkNotNull(Godot.gdnative.godot_transform2d_get_scale)(_value.ptr)
      )
    }
  }

  fun interpolateWith(transform: Transform2D, weight: Float): Transform2D {
    return memScoped {
      Transform2D(
        checkNotNull(Godot.gdnative.godot_transform2d_interpolate_with)(_value.ptr, transform._value.ptr, weight)
      )
    }
  }

  fun inverse(): Transform2D {
    return memScoped {
      Transform2D(
        checkNotNull(Godot.gdnative.godot_transform2d_inverse)(_value.ptr)
      )
    }
  }

  fun orthonormalized(): Transform2D {
    return memScoped {
      Transform2D(
        checkNotNull(Godot.gdnative.godot_transform2d_orthonormalized)(_value.ptr)
      )
    }
  }

  fun rotated(phi: Float): Transform2D {
    return memScoped {
      Transform2D(
        checkNotNull(Godot.gdnative.godot_transform2d_rotated)(_value.ptr, phi)
      )
    }
  }

  fun scaled(scale: Vector2): Transform2D {
    return memScoped {
      Transform2D(
        checkNotNull(Godot.gdnative.godot_transform2d_scaled)(_value.ptr, scale._value.ptr)
      )
    }
  }

  fun translated(offset: Vector2): Transform2D {
    return memScoped {
      Transform2D(
        checkNotNull(Godot.gdnative.godot_transform2d_translated)(_value.ptr, offset._value.ptr)
      )
    }
  }

  fun xform(rect: Rect2): Rect2 {
    return memScoped {
      Rect2(
        checkNotNull(Godot.gdnative.godot_transform2d_xform_rect2)(_value.ptr, rect._value.ptr)
      )
    }
  }

  fun xform(vec: Vector2): Vector2 {
    return memScoped {
      Vector2(
        checkNotNull(Godot.gdnative.godot_transform2d_xform_vector2)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun xformInv(rect: Rect2): Rect2 {
    return memScoped {
      Rect2(
        checkNotNull(Godot.gdnative.godot_transform2d_xform_inv_rect2)(_value.ptr, rect._value.ptr)
      )
    }
  }

  fun xformInv(vec: Vector2): Vector2 {
    return memScoped {
      Vector2(
        checkNotNull(Godot.gdnative.godot_transform2d_xform_inv_vector2)(_value.ptr, vec._value.ptr)
      )
    }
  }

  operator fun times(other: Transform2D): Transform2D {
    return memScoped {
      Transform2D(
        checkNotNull(Godot.gdnative.godot_transform2d_operator_multiply)(_value.ptr, other._value.ptr)
      )
    }
  }

  override fun equals(other: Any?): Boolean {
    if (other == null || other !is Transform2D) {
      return false
    }

    return memScoped {
      checkNotNull(Godot.gdnative.godot_transform2d_operator_equal)(_value.ptr, other._value.ptr)
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
        checkNotNull(Godot.gdnative.godot_transform2d_as_string)(_value.ptr)
      )
    }
  }

  companion object {
    val IDENTITY: Transform2D
      get() = Transform2D(Vector2(1, 0), Vector2(0, 1), Vector2(1, 0))

    val FLIP_X: Transform2D
      get() = Transform2D(Vector2(-1, 0), Vector2(0, 1), Vector2(1, 0))

    val FLIP_Y: Transform2D
      get() = Transform2D(Vector2(1, 0), Vector2(0, -1), Vector2(1, 0))

    fun new(): Transform2D {
      return allocType(::Transform2D) {
        checkNotNull(Godot.gdnative.godot_transform2d_new_identity)(it)
      }
    }

    internal fun __new() = allocType2<godot_transform2d> {
      checkNotNull(Godot.gdnative.godot_transform2d_new_identity)(it)
    }

    @MissingGDNativeAPI("Transform2D::new(Transform)")
    internal fun __new(from: Transform): CValue<godot_transform2d> = missingGDNativeAPI()

    internal fun __new(xAxis: Vector2, yAxis: Vector2, origin: Vector2) = allocType2<godot_transform2d> {
      checkNotNull(Godot.gdnative.godot_transform2d_new_axis_origin)(it, xAxis._value.ptr, yAxis._value.ptr, origin._value.ptr)
    }

    internal fun __new(rotation: Float, position: Vector2) = allocType2<godot_transform2d> {
      checkNotNull(Godot.gdnative.godot_transform2d_new)(it, rotation, position._value.ptr)
    }
  }
}