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

class Signal1<A>(name: String, emitter: Object): Signal(name, emitter) {
  operator fun invoke(a: A) {
    emitSignal(name, a)
  }
}

class Signal2<A, B>(name: String, emitter: Object): Signal(name, emitter) {
  operator fun invoke(a: A, b: B) {
    emitSignal(name, a, b)
  }
}

class Signal3<A, B, C>(name: String, emitter: Object): Signal(name, emitter) {
  operator fun invoke(a: A, b: B, c: C) {
    emitSignal(name, a, b, c)
  }
}