package godot.core

import godot.Object

abstract class Signal(val name: String, val emitter: Object) {
  protected fun emitSignal(vararg args: Any?) {
    emitter.emitSignal(name, *args)
  }
}

class Signal0(name: String, emitter: Object): Signal(name, emitter) {
  operator fun invoke() {
    emitSignal(name)
  }
}

class Signal1<A1>(name: String, emitter: Object): Signal(name, emitter) {
  operator fun invoke(a1: A1) {
    emitSignal(name, a1)
  }
}

class Signal2<A1, A2>(name: String, emitter: Object): Signal(name, emitter) {
  operator fun invoke(a1: A1, a2: A2) {
    emitSignal(name, a1, a2)
  }
}

class Signal3<A1, A2, A3>(name: String, emitter: Object): Signal(name, emitter) {
  operator fun invoke(a1: A1, a2: A2, a3: A3) {
    emitSignal(name, a1, a2, a3)
  }
}