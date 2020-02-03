package godot.core

import gdnative.godot_aabb
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class AABB(
  value: CValue<godot_aabb>
) : CoreType<godot_aabb>(value) {

  @MissingGDNativeAPI("AABB::end")
  var end: Vector3
    get() = missingGDNativeAPI()
    set(value) = missingGDNativeAPI()

  var position: Vector3
    get() = memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_aabb_get_position)(_value.ptr)
      )
    }
    set(value) {
      memScoped {
        checkNotNull(Godot.gdnative.godot_aabb_set_position)(_value.ptr, value._value.ptr)
      }
    }

  fun position(cb: Vector3.() -> Unit) {
    val value = position
    cb(value)
    position = value
  }

  var size: Vector3
    get() = memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_aabb_get_size)(_value.ptr)
      )
    }
    set(value) {
      memScoped {
        checkNotNull(Godot.gdnative.godot_aabb_set_size)(_value.ptr, value._value.ptr)
      }
    }

  fun size(cb: Vector3.() -> Unit) {
    val value = size
    cb(value)
    size = value
  }

  fun encloses(with: AABB): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_aabb_encloses)(_value.ptr, with._value.ptr)
    }
  }

  fun expand(point: Vector3): AABB {
    return memScoped {
      AABB(
        checkNotNull(Godot.gdnative.godot_aabb_expand)(_value.ptr, point._value.ptr)
      )
    }
  }

  fun getArea(): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_aabb_get_area)(_value.ptr)
    }
  }

  fun getEndpoint(index: Int): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_aabb_get_endpoint)(_value.ptr, index)
      )
    }
  }

  fun getLongestAxis(): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_aabb_get_longest_axis)(_value.ptr)
      )
    }
  }

  fun getLongestAxisIndex(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_aabb_get_longest_axis_index)(_value.ptr)
    }
  }

  fun getLongestAxisSize(): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_aabb_get_longest_axis_size)(_value.ptr)
    }
  }

  fun getShortestAxis(): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_aabb_get_shortest_axis)(_value.ptr)
      )
    }
  }

  fun getShortestAxisIndex(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_aabb_get_shortest_axis_index)(_value.ptr)
    }
  }

  fun getShortestAxisSize(): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_aabb_get_shortest_axis_size)(_value.ptr)
    }
  }

  fun getSupport(vec: Vector3): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_aabb_get_support)(_value.ptr, vec._value.ptr)
      )
    }
  }

  fun grow(by: Float): AABB {
    return memScoped {
      AABB(
        checkNotNull(Godot.gdnative.godot_aabb_grow)(_value.ptr, by)
      )
    }
  }

  fun hasNoArea(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_aabb_has_no_area)(_value.ptr)
    }
  }

  fun hasNoSurface(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_aabb_has_no_surface)(_value.ptr)
    }
  }

  fun hasPoint(point: Vector3): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_aabb_has_point)(_value.ptr, point._value.ptr)
    }
  }

  fun intersection(with: AABB): AABB {
    return memScoped {
      AABB(
        checkNotNull(Godot.gdnative.godot_aabb_intersection)(_value.ptr, with._value.ptr)
      )
    }
  }

  fun intersects(with: AABB): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_aabb_intersects)(_value.ptr, with._value.ptr)
    }
  }

  fun intersects(with: Plane): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_aabb_intersects_plane)(_value.ptr, with._value.ptr)
    }
  }

  fun intersects(from: Vector3, to: Vector3): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_aabb_intersects_segment)(_value.ptr, from._value.ptr, to._value.ptr)
    }
  }

  fun merge(other: AABB): AABB {
    return memScoped {
      AABB(
        checkNotNull(Godot.gdnative.godot_aabb_merge)(_value.ptr, other._value.ptr)
      )
    }
  }

  override fun toVariant(): Variant {
    return Variant.new(this)
  }

  override fun toGDString(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_aabb_as_string)(_value.ptr)
      )
    }
  }

  companion object {
    fun new(position: Vector3, size: Vector3): AABB {
      return allocType(::AABB) {
        checkNotNull(Godot.gdnative.godot_aabb_new)(it, position._value.ptr, size._value.ptr)
      }
    }
  }
}