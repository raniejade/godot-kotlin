package godot.core

import gdnative.godot_aabb
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke

class AABB(
  value: CValue<godot_aabb>
) : CoreType<godot_aabb>(value) {
  internal constructor(): this(__new(Vector3.ZERO, Vector3.ONE))
  constructor(position: Vector3, size: Vector3): this(__new(position, size))

  @MissingGDNativeAPI("AABB::end")
  var end: Vector3
    get() = missingGDNativeAPI()
    set(value) = missingGDNativeAPI()

  var position: Vector3
    get() = Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_aabb_get_position)(_value.ptr)
      )
    }
    set(value) {
      Allocator.allocationScope {
        checkNotNull(Godot.gdnative.godot_aabb_set_position)(_value.ptr, value._value.ptr)
      }
    }

  fun position(cb: Vector3.() -> Unit) {
    val value = position
    cb(value)
    position = value
  }

  var size: Vector3
    get() = Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_aabb_get_size)(_value.ptr)
      )
    }
    set(value) {
      Allocator.allocationScope {
        checkNotNull(Godot.gdnative.godot_aabb_set_size)(_value.ptr, value._value.ptr)
      }
    }

  fun size(cb: Vector3.() -> Unit) {
    val value = size
    cb(value)
    size = value
  }

  fun encloses(with: AABB): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_aabb_encloses)(_value.ptr, with._value.ptr)
    }
  }

  fun expand(point: Vector3): AABB {
    return Allocator.allocationScope {
      AABB(
        checkNotNull(Godot.gdnative.godot_aabb_expand)(_value.ptr, point._value.ptr)
      )
    }
  }

  fun getArea(): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_aabb_get_area)(_value.ptr)
    }
  }

  fun getEndpoint(index: Int): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_aabb_get_endpoint)(_value.ptr, index)
      )
    }
  }

  fun getLongestAxis(): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_aabb_get_longest_axis)(_value.ptr)
      )
    }
  }

  fun getLongestAxisIndex(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_aabb_get_longest_axis_index)(_value.ptr)
    }
  }

  fun getLongestAxisSize(): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_aabb_get_longest_axis_size)(_value.ptr)
    }
  }

  fun getShortestAxis(): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_aabb_get_shortest_axis)(_value.ptr)
      )
    }
  }

  fun getShortestAxisIndex(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_aabb_get_shortest_axis_index)(_value.ptr)
    }
  }

  fun getShortestAxisSize(): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_aabb_get_shortest_axis_size)(_value.ptr)
    }
  }

  fun getSupport(vec: Vector3): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_aabb_get_support)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun grow(by: Float): AABB {
    return Allocator.allocationScope {
      AABB(
        checkNotNull(Godot.gdnative.godot_aabb_grow)(_value.ptr, by)
      )
    }
  }

  fun hasNoArea(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_aabb_has_no_area)(_value.ptr)
    }
  }

  fun hasNoSurface(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_aabb_has_no_surface)(_value.ptr)
    }
  }

  fun hasPoint(point: Vector3): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_aabb_has_point)(_value.ptr, point._value.ptr)
    }
  }

  fun intersection(with: AABB): AABB {
    return Allocator.allocationScope {
      AABB(
        checkNotNull(Godot.gdnative.godot_aabb_intersection)(_value.ptr, with._value.ptr)
      )
    }
  }

  fun intersects(with: AABB): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_aabb_intersects)(_value.ptr, with._value.ptr)
    }
  }

  fun intersects(with: Plane): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_aabb_intersects_plane)(_value.ptr, with._value.ptr)
    }
  }

  fun intersects(from: Vector3, to: Vector3): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_aabb_intersects_segment)(_value.ptr, from._value.ptr, to._value.ptr)
    }
  }

  fun merge(other: AABB): AABB {
    return Allocator.allocationScope {
      AABB(
        checkNotNull(Godot.gdnative.godot_aabb_merge)(_value.ptr, other._value.ptr)
      )
    }
  }

  override fun toVariant(): Variant {
    return Variant(this)
  }

  override fun toGDString(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_aabb_as_string)(_value.ptr)
      )
    }
  }

  companion object {
    internal fun __new(position: Vector3, size: Vector3) = allocType2<godot_aabb> {
      checkNotNull(Godot.gdnative.godot_aabb_new)(it, position._value.ptr, size._value.ptr)
    }
  }
}