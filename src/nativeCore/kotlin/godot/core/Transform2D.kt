package godot.core

import gdnative.godot_transform2d
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class Transform2D(
  value: CValue<godot_transform2d>
) : CoreType<godot_transform2d>(value) {
  override fun toVariant(): Variant {
    return Variant.new(this)
  }

  override fun toGDString(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_transform2d_as_string)(_value.ptr)
      )
    }
  }

  companion object {
    fun new(xAxis: Vector2, yAxis: Vector2, origin: Vector2): Transform2D {
      return allocType(::Transform2D) {
        checkNotNull(Godot.gdnative.godot_transform2d_new_axis_origin)(it, xAxis._value.ptr, yAxis._value.ptr, origin._value.ptr)
      }
    }
  }
}