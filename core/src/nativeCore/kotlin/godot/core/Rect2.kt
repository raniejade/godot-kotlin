package godot.core

import gdnative.godot_rect2
import kotlinx.cinterop.*

class Rect2(
  value: CValue<godot_rect2>
) : CoreType<godot_rect2>(value) {

  constructor(position: Vector2, size: Vector2): this(__new(position, size))
  constructor(x: Float, y: Float, width: Float, height: Float): this(__new(x, y, width, height))

  var position: Vector2
    get() = memScoped {
      Vector2(
        checkNotNull(Godot.gdnative.godot_rect2_get_position)(_value.ptr)
      )
    }
    set(value) {
      _value = memScoped {
        val ptr = _value.ptr
        checkNotNull(Godot.gdnative.godot_rect2_set_position)(ptr, value._value.ptr)
        ptr.pointed.readValue()
      }
    }

  fun position(cb: Vector2.() -> Unit) {
    val value = position
    cb(value)
    position = value
  }

  var size: Vector2
    get() = memScoped {
      Vector2(
        checkNotNull(Godot.gdnative.godot_rect2_get_size)(_value.ptr)
      )
    }
    set(value) {
      _value = memScoped {
        val ptr = _value.ptr
        checkNotNull(Godot.gdnative.godot_rect2_set_size)(ptr, value._value.ptr)
        ptr.pointed.readValue()
      }
    }

  fun size(cb: Vector2.() -> Unit) {
    val value = size
    cb(value)
    size = value
  }

  fun abs(): Rect2 {
    return memScoped {
      Rect2(
        checkNotNull(Godot.gdnative11.godot_rect2_abs)(_value.ptr)
      )
    }
  }

  fun clip(b: Rect2): Rect2 {
    return memScoped {
      Rect2(
        checkNotNull(Godot.gdnative.godot_rect2_clip)(_value.ptr, b._value.ptr)
      )
    }
  }

  fun encloses(b: Rect2): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_rect2_encloses)(_value.ptr, b._value.ptr)
    }
  }

  fun expand(to: Vector2): Rect2 {
    return memScoped {
      Rect2(
        checkNotNull(Godot.gdnative.godot_rect2_expand)(_value.ptr, to._value.ptr)
      )
    }
  }

  fun getArea(): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_rect2_get_area)(_value.ptr)
    }
  }

  fun grow(by: Float): Rect2 {
    return memScoped {
      Rect2(
        checkNotNull(Godot.gdnative.godot_rect2_grow)(_value.ptr, by)
      )
    }
  }

  fun growIndividual(left: Float, top: Float, right: Float, bottom: Float): Rect2 {
    return memScoped {
      Rect2(
        checkNotNull(Godot.gdnative11.godot_rect2_grow_individual)(_value.ptr, left, top, right, bottom)
      )
    }
  }

  fun growMargin(margin: Margin, by: Float): Rect2 {
    return memScoped {
      Rect2(
        checkNotNull(Godot.gdnative11.godot_rect2_grow_margin)(_value.ptr, margin.value, by)
      )
    }
  }

  fun hasNoArea(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_rect2_has_no_area)(_value.ptr)
    }
  }

  fun hasPoint(point: Vector2): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_rect2_has_point)(_value.ptr, point._value.ptr)
    }
  }

  fun intersects(b: Rect2): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_rect2_intersects)(_value.ptr, b._value.ptr)
    }
  }

  fun merge(b: Rect2): Rect2 {
    return memScoped {
      Rect2(
        checkNotNull(Godot.gdnative.godot_rect2_merge)(_value.ptr, b._value.ptr)
      )
    }
  }

  override fun equals(other: Any?): Boolean {
    if (other == null || other !is Rect2) {
      return false
    }
    return memScoped {
      checkNotNull(Godot.gdnative.godot_rect2_operator_equal)(_value.ptr, other._value.ptr)
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
        checkNotNull(Godot.gdnative.godot_rect2_as_string)(_value.ptr)
      )
    }
  }

  companion object {
    internal fun __new(position: Vector2, size: Vector2) = allocType2<godot_rect2> {
      checkNotNull(Godot.gdnative.godot_rect2_new_with_position_and_size)(it, position._value.ptr, size._value.ptr)
    }

    internal fun __new(x: Float, y: Float, width: Float, height: Float) = allocType2<godot_rect2> {
      checkNotNull(Godot.gdnative.godot_rect2_new)(it, x, y, width, height)
    }
  }
}