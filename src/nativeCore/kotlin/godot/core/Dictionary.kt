package godot.core

import gdnative.godot_dictionary
import kotlinx.cinterop.CValue

class Dictionary(
  value: CValue<godot_dictionary>
) : CoreType<godot_dictionary>(value) {
  override fun toVariant(): Variant {
    return Variant.new(this)
  }

  override fun toGDString(): GDString {
    return GDString.new("Dictionary()")
  }
}