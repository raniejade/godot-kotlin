package godot.core

import gdnative.godot_dictionary
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke

class Dictionary(
  value: CValue<godot_dictionary>
) : CoreType<godot_dictionary>(value) {
  constructor(): this(__new())

  override fun toVariant(): Variant {
    return Variant(this)
  }

  override fun toGDString(): GDString {
    return GDString("Dictionary()")
  }

  companion object {
    internal fun __new() = allocType2<godot_dictionary> {
      checkNotNull(Godot.gdnative.godot_dictionary_new)(it)
    }
  }
}