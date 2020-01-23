package godot

import gdnative.godot_variant
import kotlinx.cinterop.*

class Variant(
  value: CValue<godot_variant>
): Primitive<godot_variant>(value) {
  companion object {
    fun new(str: GDString): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_string)(tmp.ptr, str._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(str: String): Variant {
      return new(GDString.new(str))
    }
  }
}