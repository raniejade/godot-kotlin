package godot

import gdnative.godot_transform
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class Transform(
  value: CValue<godot_transform>
) :CoreType<godot_transform>(value) {
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
}