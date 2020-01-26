package godot

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
}