package godot.core

import gdnative.godot_plane
import gdnative.godot_vector3
import kotlinx.cinterop.*

class Plane(
  value: CValue<godot_plane>
) : CoreType<godot_plane>(value) {
  internal constructor(): this(__new(Vector3.UP, 1f))
  constructor(a: Float, b: Float, c: Float, d: Float): this(__new(a, b, c, d))
  constructor(v1: Vector3, v2: Vector3, v3: Vector3): this(__new(v1, v2, v3))
  constructor(normal: Vector3, d: Float): this(__new(normal, d))

  var d: Float
    get() = Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_plane_get_d)(_value.ptr)
    }
    set(value) {
      _value = Allocator.allocationScope {
        val ptr = _value.ptr
        checkNotNull(Godot.gdnative.godot_plane_set_d)(ptr, value)
        ptr.pointed.readValue()
      }
    }

  var normal: Vector3
    get() = Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_plane_get_normal)(_value.ptr)
      )
    }
    set(value) {
      _value = Allocator.allocationScope {
        val ptr = _value.ptr
        checkNotNull(Godot.gdnative.godot_plane_set_normal)(ptr, value._value.ptr)
        ptr.pointed.readValue()
      }
    }

  fun normal(cb: Vector3.() -> Unit) {
    val value = normal
    cb(value)
    normal = value
  }

  var x: Float
    get() = normal.x
    set(value) {
      normal {
        x = value
      }
    }

  var y: Float
    get() = normal.y
    set(value) {
      normal {
        y = value
      }
    }

  var z: Float
    get() = normal.z
    set(value) {
      normal {
        z = value
      }
    }


  fun center(): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_plane_center)(_value.ptr)
      )
    }
  }

  fun distanceTo(point: Vector3): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_plane_distance_to)(_value.ptr, point._value.ptr)
    }
  }

  fun getAnyPoint(): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_plane_get_any_point)(_value.ptr)
      )
    }
  }

  fun hasPoint(point: Vector3, epsilon: Float = 0.00001f): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_plane_has_point)(_value.ptr, point._value.ptr, epsilon)
    }
  }

  fun intersect3(b: Plane, c: Plane): Vector3? {
    return Allocator.allocationScope {
      val res = alloc<godot_vector3>()
      val found = checkNotNull(Godot.gdnative.godot_plane_intersect_3)(_value.ptr, res.ptr, b._value.ptr, c._value.ptr)

      if (found) {
        Vector3(
          res.readValue()
        )
      } else {
        null
      }
    }
  }

  fun intersectRay(from: Vector3, dir: Vector3): Vector3? {
    return Allocator.allocationScope {
      val res = alloc<godot_vector3>()
      val found = checkNotNull(Godot.gdnative.godot_plane_intersects_ray)(_value.ptr, res.ptr, from._value.ptr, dir._value.ptr)

      if (found) {
        Vector3(
          res.readValue()
        )
      } else {
        null
      }
    }
  }

  fun intersectSegment(begin: Vector3, end: Vector3): Vector3? {
    return Allocator.allocationScope {
      val res = alloc<godot_vector3>()
      val found = checkNotNull(Godot.gdnative.godot_plane_intersects_segment)(_value.ptr, res.ptr, begin._value.ptr, end._value.ptr)

      if (found) {
        Vector3(
          res.readValue()
        )
      } else {
        null
      }
    }
  }

  fun isPointOver(point: Vector3): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_plane_is_point_over)(_value.ptr, point._value.ptr)
    }
  }

  fun normalized(): Plane {
    return Allocator.allocationScope {
      Plane(
        checkNotNull(Godot.gdnative.godot_plane_normalized)(_value.ptr)
      )
    }
  }

  fun project(point: Vector3): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_plane_project)(_value.ptr, point._value.ptr)
      )
    }
  }

  operator fun unaryMinus(): Plane {
    return Allocator.allocationScope {
      Plane(
        checkNotNull(Godot.gdnative.godot_plane_operator_neg)(_value.ptr)
      )
    }
  }

  override fun equals(other: Any?): Boolean {
    if (other == null || other !is Plane) {
      return false
    }
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_plane_operator_equal)(_value.ptr, other._value.ptr)
    }
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
        checkNotNull(Godot.gdnative.godot_plane_as_string)(_value.ptr)
      )
    }
  }

  companion object {
    internal fun __new(a: Float, b: Float, c: Float, d: Float) = allocType2<godot_plane> {
      checkNotNull(Godot.gdnative.godot_plane_new_with_reals)(it, a, b, c, d)
    }

    internal fun __new(v1: Vector3, v2: Vector3, v3: Vector3) = allocType2<godot_plane> {
      checkNotNull(Godot.gdnative.godot_plane_new_with_vectors)(it, v1._value.ptr, v2._value.ptr, v3._value.ptr)
    }

    internal fun __new(normal: Vector3, d: Float) = allocType2<godot_plane> {
      checkNotNull(Godot.gdnative.godot_plane_new_with_normal)(it, normal._value.ptr, d)
    }
  }
}