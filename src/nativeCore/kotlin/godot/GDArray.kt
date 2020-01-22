package godot

import gdnative.godot_array
import kotlinx.cinterop.CValue

class GDArray(
  value: CValue<godot_array>
): Primitive<godot_array>(value) {
  companion object
}
