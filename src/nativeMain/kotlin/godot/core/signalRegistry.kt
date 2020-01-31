package godot.core

import godot.Object

abstract class Signal(val emitter: Object) {
  fun emit(args: VariantArray) {
  }
}