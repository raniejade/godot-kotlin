package godot

import gdnative.godot_array
import kotlinx.cinterop.CValue

class GDArray(
  internal val handle: CValue<godot_array>
) {
  companion object
}
