// DO NOT EDIT, THIS CLASS IS GENERATED!
package godot

import kotlin.Any
import kotlin.String

/**
 * Base class for all signals
 */
abstract class Signal(
  val name: String,
  val emitter: Object
) {
  fun emitSignal(vararg args: Any?) {
    emitter.emitSignal(name, *args)
  }
}

/**
 * Represents a signal with 0 params
 */
class Signal0(
  name: String,
  emitter: Object
) : Signal(name, emitter) {
  operator fun invoke() {
    emitSignal(
      name
    )
  }
}

/**
 * Represents a signal with 1 params
 */
class Signal1<A0>(
  name: String,
  emitter: Object
) : Signal(name, emitter) {
  operator fun invoke(a0: A0) {
    emitSignal(
      name,
      a0
    )
  }
}

/**
 * Represents a signal with 2 params
 */
class Signal2<A0, A1>(
  name: String,
  emitter: Object
) : Signal(name, emitter) {
  operator fun invoke(a0: A0, a1: A1) {
    emitSignal(
      name,
      a0,
      a1
    )
  }
}

/**
 * Represents a signal with 3 params
 */
class Signal3<A0, A1, A2>(
  name: String,
  emitter: Object
) : Signal(name, emitter) {
  operator fun invoke(
    a0: A0,
    a1: A1,
    a2: A2
  ) {
    emitSignal(
      name,
      a0,
      a1,
      a2
    )
  }
}

/**
 * Represents a signal with 4 params
 */
class Signal4<A0, A1, A2, A3>(
  name: String,
  emitter: Object
) : Signal(name, emitter) {
  operator fun invoke(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3
  ) {
    emitSignal(
      name,
      a0,
      a1,
      a2,
      a3
    )
  }
}

/**
 * Represents a signal with 5 params
 */
class Signal5<A0, A1, A2, A3, A4>(
  name: String,
  emitter: Object
) : Signal(name, emitter) {
  operator fun invoke(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4
  ) {
    emitSignal(
      name,
      a0,
      a1,
      a2,
      a3,
      a4
    )
  }
}

/**
 * Represents a signal with 6 params
 */
class Signal6<A0, A1, A2, A3, A4, A5>(
  name: String,
  emitter: Object
) : Signal(name, emitter) {
  operator fun invoke(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5
  ) {
    emitSignal(
      name,
      a0,
      a1,
      a2,
      a3,
      a4,
      a5
    )
  }
}

/**
 * Represents a signal with 7 params
 */
class Signal7<A0, A1, A2, A3, A4, A5, A6>(
  name: String,
  emitter: Object
) : Signal(name, emitter) {
  operator fun invoke(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6
  ) {
    emitSignal(
      name,
      a0,
      a1,
      a2,
      a3,
      a4,
      a5,
      a6
    )
  }
}

/**
 * Represents a signal with 8 params
 */
class Signal8<A0, A1, A2, A3, A4, A5, A6, A7>(
  name: String,
  emitter: Object
) : Signal(name, emitter) {
  operator fun invoke(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7
  ) {
    emitSignal(
      name,
      a0,
      a1,
      a2,
      a3,
      a4,
      a5,
      a6,
      a7
    )
  }
}

/**
 * Represents a signal with 9 params
 */
class Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>(
  name: String,
  emitter: Object
) : Signal(name, emitter) {
  operator fun invoke(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7,
    a8: A8
  ) {
    emitSignal(
      name,
      a0,
      a1,
      a2,
      a3,
      a4,
      a5,
      a6,
      a7,
      a8
    )
  }
}

/**
 * Represents a signal with 10 params
 */
class Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9>(
  name: String,
  emitter: Object
) : Signal(name, emitter) {
  operator fun invoke(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7,
    a8: A8,
    a9: A9
  ) {
    emitSignal(
      name,
      a0,
      a1,
      a2,
      a3,
      a4,
      a5,
      a6,
      a7,
      a8,
      a9
    )
  }
}
