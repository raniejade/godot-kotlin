package godot

import gdnative.godot_array
import kotlinx.cinterop.CValue

class GDArray(
  internal var handle: CValue<godot_array>
) {
  companion object
}
