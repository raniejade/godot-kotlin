package godot

import gdnative.godot_basis
import kotlinx.cinterop.CValue

class Basis(
  value: CValue<godot_basis>
) : Primitive<godot_basis>(value) {
  companion object {
    // TODO: constructors
  }
}