package godot

import gdnative.godot_array
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class GDArray(
  internal val handle: CValue<godot_array>
) {
  companion object
}
