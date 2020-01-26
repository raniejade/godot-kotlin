package godot

import gdnative.godot_rect2
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class Rect2(
  value: CValue<godot_rect2>
) : CoreType<godot_rect2>(value) {
  override fun toVariant(): Variant {
    return Variant.new(this)
  }

  override fun toGDString(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_rect2_as_string)(_value.ptr)
      )
    }
  }

  companion object {
    fun new(x: Float, y: Float, width: Float, height: Float): Rect2 {
      return allocType(::Rect2) {
        checkNotNull(Godot.gdnative.godot_rect2_new)(it, x, y, width, height)
      }
    }
  }
}