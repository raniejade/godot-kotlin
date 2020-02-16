// DO NOT EDIT, THIS CLASS IS GENERATED!
package godot

import godot.core.Variant
import godot.core.VariantArray
import kotlin.Any
import kotlin.Int
import kotlin.PublishedApi
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty1

/**
 * Base class for all signals
 */
abstract class Signal(
  val name: String
) {
  protected fun emitSignal(instance: Object, vararg args: Any?) {
    instance.emitSignal(name, *args)
  }

  @PublishedApi
  internal fun connect(
    instance: Object,
    target: Object,
    method: String,
    binds: List<Any>?,
    flags: Int
  ) {
    val extraArgs = VariantArray()
    binds?.forEach { extraArgs.append(Variant.fromAny(it)) }
    instance.connect(name, target, method, extraArgs, flags)
  }
}

/**
 * Represents a signal with 0 params
 */
class Signal0(
  name: String
) : Signal(name) {
  internal fun emit(instance: Object) {
    emitSignal(
      instance
    )
  }
}

class Signal0Provider(
  val signals: Map<String, Signal>
) : ReadOnlyProperty<Object, Signal0> {
  @Suppress("UNCHECKED_CAST")
  override fun getValue(thisRef: Object, property: KProperty<*>): Signal0 =
      signals[property.name.toSignalName()] as Signal0
}

/**
 * Creates a signal of 0 params
 */
fun GodotClass<*, *>.signal0(): Signal0Provider = Signal0Provider(signals())


/**
 * Registers a signal of 0 params
 */
@godot.ide.Signal
inline fun <T : Object, K : KProperty1<T, Signal0>>
    ClassMemberRegistry<T>.registerSignal(property: K) {
  val parameterTypes = emptyMap<String, Variant.Type>()
  val signalName = property.name.toSignalName()
  val signal = Signal0(signalName)
  doRegisterSignal(className, signalName, signal, parameterTypes)
}

/**
 * Represents a signal with 1 params
 */
class Signal1<A0>(
  name: String
) : Signal(name) {
  internal fun emit(instance: Object, a0: A0) {
    emitSignal(
      instance,
      a0
    )
  }
}

class Signal1Provider<A0>(
  val signals: Map<String, Signal>
) : ReadOnlyProperty<Object, Signal1<A0>> {
  @Suppress("UNCHECKED_CAST")
  override fun getValue(thisRef: Object, property: KProperty<*>): Signal1<A0> =
      signals[property.name.toSignalName()] as Signal1<A0>
}

/**
 * Creates a signal of 1 params
 */
fun <A0> GodotClass<*, *>.signal1(): Signal1Provider<A0> = Signal1Provider(signals())


/**
 * Registers a signal of 1 params
 */
@godot.ide.Signal
inline fun <T : Object, reified A0, K : KProperty1<T, Signal1<A0>>>
    ClassMemberRegistry<T>.registerSignal(property: K, a0: String) {
  val parameterTypes = mutableMapOf<String, Variant.Type>()
  parameterTypes[a0] = Variant.typeForT<A0>()
  val signalName = property.name.toSignalName()
  val signal = Signal1<A0>(signalName)
  doRegisterSignal(className, signalName, signal, parameterTypes)
}

/**
 * Represents a signal with 2 params
 */
class Signal2<A0, A1>(
  name: String
) : Signal(name) {
  internal fun emit(
    instance: Object,
    a0: A0,
    a1: A1
  ) {
    emitSignal(
      instance,
      a0,
      a1
    )
  }
}

class Signal2Provider<A0, A1>(
  val signals: Map<String, Signal>
) : ReadOnlyProperty<Object, Signal2<A0, A1>> {
  @Suppress("UNCHECKED_CAST")
  override fun getValue(thisRef: Object, property: KProperty<*>): Signal2<A0, A1> =
      signals[property.name.toSignalName()] as Signal2<A0, A1>
}

/**
 * Creates a signal of 2 params
 */
fun <A0, A1> GodotClass<*, *>.signal2(): Signal2Provider<A0, A1> = Signal2Provider(signals())


/**
 * Registers a signal of 2 params
 */
@godot.ide.Signal
inline fun <T : Object, reified A0, reified A1, K : KProperty1<T, Signal2<A0, A1>>>
    ClassMemberRegistry<T>.registerSignal(
  property: K,
  a0: String,
  a1: String
) {
  val parameterTypes = mutableMapOf<String, Variant.Type>()
  parameterTypes[a0] = Variant.typeForT<A0>()
  parameterTypes[a1] = Variant.typeForT<A1>()
  val signalName = property.name.toSignalName()
  val signal = Signal2<A0, A1>(signalName)
  doRegisterSignal(className, signalName, signal, parameterTypes)
}

/**
 * Represents a signal with 3 params
 */
class Signal3<A0, A1, A2>(
  name: String
) : Signal(name) {
  internal fun emit(
    instance: Object,
    a0: A0,
    a1: A1,
    a2: A2
  ) {
    emitSignal(
      instance,
      a0,
      a1,
      a2
    )
  }
}

class Signal3Provider<A0, A1, A2>(
  val signals: Map<String, Signal>
) : ReadOnlyProperty<Object, Signal3<A0, A1, A2>> {
  @Suppress("UNCHECKED_CAST")
  override fun getValue(thisRef: Object, property: KProperty<*>): Signal3<A0, A1, A2> =
      signals[property.name.toSignalName()] as Signal3<A0, A1, A2>
}

/**
 * Creates a signal of 3 params
 */
fun <A0, A1, A2> GodotClass<*, *>.signal3(): Signal3Provider<A0, A1, A2> =
    Signal3Provider(signals())


/**
 * Registers a signal of 3 params
 */
@godot.ide.Signal
inline fun <T : Object, reified A0, reified A1, reified A2, K : KProperty1<T, Signal3<A0, A1, A2>>>
    ClassMemberRegistry<T>.registerSignal(
  property: K,
  a0: String,
  a1: String,
  a2: String
) {
  val parameterTypes = mutableMapOf<String, Variant.Type>()
  parameterTypes[a0] = Variant.typeForT<A0>()
  parameterTypes[a1] = Variant.typeForT<A1>()
  parameterTypes[a2] = Variant.typeForT<A2>()
  val signalName = property.name.toSignalName()
  val signal = Signal3<A0, A1, A2>(signalName)
  doRegisterSignal(className, signalName, signal, parameterTypes)
}

/**
 * Represents a signal with 4 params
 */
class Signal4<A0, A1, A2, A3>(
  name: String
) : Signal(name) {
  internal fun emit(
    instance: Object,
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3
  ) {
    emitSignal(
      instance,
      a0,
      a1,
      a2,
      a3
    )
  }
}

class Signal4Provider<A0, A1, A2, A3>(
  val signals: Map<String, Signal>
) : ReadOnlyProperty<Object, Signal4<A0, A1, A2, A3>> {
  @Suppress("UNCHECKED_CAST")
  override fun getValue(thisRef: Object, property: KProperty<*>): Signal4<A0, A1, A2, A3> =
      signals[property.name.toSignalName()] as Signal4<A0, A1, A2, A3>
}

/**
 * Creates a signal of 4 params
 */
fun <A0, A1, A2, A3> GodotClass<*, *>.signal4(): Signal4Provider<A0, A1, A2, A3> =
    Signal4Provider(signals())


/**
 * Registers a signal of 4 params
 */
@godot.ide.Signal
inline fun <T : Object, reified A0, reified A1, reified A2, reified A3, K : KProperty1<T,
    Signal4<A0, A1, A2, A3>>> ClassMemberRegistry<T>.registerSignal(
  property: K,
  a0: String,
  a1: String,
  a2: String,
  a3: String
) {
  val parameterTypes = mutableMapOf<String, Variant.Type>()
  parameterTypes[a0] = Variant.typeForT<A0>()
  parameterTypes[a1] = Variant.typeForT<A1>()
  parameterTypes[a2] = Variant.typeForT<A2>()
  parameterTypes[a3] = Variant.typeForT<A3>()
  val signalName = property.name.toSignalName()
  val signal = Signal4<A0, A1, A2, A3>(signalName)
  doRegisterSignal(className, signalName, signal, parameterTypes)
}

/**
 * Represents a signal with 5 params
 */
class Signal5<A0, A1, A2, A3, A4>(
  name: String
) : Signal(name) {
  internal fun emit(
    instance: Object,
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4
  ) {
    emitSignal(
      instance,
      a0,
      a1,
      a2,
      a3,
      a4
    )
  }
}

class Signal5Provider<A0, A1, A2, A3, A4>(
  val signals: Map<String, Signal>
) : ReadOnlyProperty<Object, Signal5<A0, A1, A2, A3, A4>> {
  @Suppress("UNCHECKED_CAST")
  override fun getValue(thisRef: Object, property: KProperty<*>): Signal5<A0, A1, A2, A3, A4> =
      signals[property.name.toSignalName()] as Signal5<A0, A1, A2, A3, A4>
}

/**
 * Creates a signal of 5 params
 */
fun <A0, A1, A2, A3, A4> GodotClass<*, *>.signal5(): Signal5Provider<A0, A1, A2, A3, A4> =
    Signal5Provider(signals())


/**
 * Registers a signal of 5 params
 */
@godot.ide.Signal
inline fun <T : Object, reified A0, reified A1, reified A2, reified A3, reified A4, K :
    KProperty1<T, Signal5<A0, A1, A2, A3, A4>>> ClassMemberRegistry<T>.registerSignal(
  property: K,
  a0: String,
  a1: String,
  a2: String,
  a3: String,
  a4: String
) {
  val parameterTypes = mutableMapOf<String, Variant.Type>()
  parameterTypes[a0] = Variant.typeForT<A0>()
  parameterTypes[a1] = Variant.typeForT<A1>()
  parameterTypes[a2] = Variant.typeForT<A2>()
  parameterTypes[a3] = Variant.typeForT<A3>()
  parameterTypes[a4] = Variant.typeForT<A4>()
  val signalName = property.name.toSignalName()
  val signal = Signal5<A0, A1, A2, A3, A4>(signalName)
  doRegisterSignal(className, signalName, signal, parameterTypes)
}

/**
 * Represents a signal with 6 params
 */
class Signal6<A0, A1, A2, A3, A4, A5>(
  name: String
) : Signal(name) {
  internal fun emit(
    instance: Object,
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5
  ) {
    emitSignal(
      instance,
      a0,
      a1,
      a2,
      a3,
      a4,
      a5
    )
  }
}

class Signal6Provider<A0, A1, A2, A3, A4, A5>(
  val signals: Map<String, Signal>
) : ReadOnlyProperty<Object, Signal6<A0, A1, A2, A3, A4, A5>> {
  @Suppress("UNCHECKED_CAST")
  override fun getValue(thisRef: Object, property: KProperty<*>): Signal6<A0, A1, A2, A3, A4, A5> =
      signals[property.name.toSignalName()] as Signal6<A0, A1, A2, A3, A4, A5>
}

/**
 * Creates a signal of 6 params
 */
fun <A0, A1, A2, A3, A4, A5> GodotClass<*, *>.signal6(): Signal6Provider<A0, A1, A2, A3, A4, A5> =
    Signal6Provider(signals())


/**
 * Registers a signal of 6 params
 */
@godot.ide.Signal
inline fun <T : Object, reified A0, reified A1, reified A2, reified A3, reified A4, reified A5, K :
    KProperty1<T, Signal6<A0, A1, A2, A3, A4, A5>>> ClassMemberRegistry<T>.registerSignal(
  property: K,
  a0: String,
  a1: String,
  a2: String,
  a3: String,
  a4: String,
  a5: String
) {
  val parameterTypes = mutableMapOf<String, Variant.Type>()
  parameterTypes[a0] = Variant.typeForT<A0>()
  parameterTypes[a1] = Variant.typeForT<A1>()
  parameterTypes[a2] = Variant.typeForT<A2>()
  parameterTypes[a3] = Variant.typeForT<A3>()
  parameterTypes[a4] = Variant.typeForT<A4>()
  parameterTypes[a5] = Variant.typeForT<A5>()
  val signalName = property.name.toSignalName()
  val signal = Signal6<A0, A1, A2, A3, A4, A5>(signalName)
  doRegisterSignal(className, signalName, signal, parameterTypes)
}

/**
 * Represents a signal with 7 params
 */
class Signal7<A0, A1, A2, A3, A4, A5, A6>(
  name: String
) : Signal(name) {
  internal fun emit(
    instance: Object,
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6
  ) {
    emitSignal(
      instance,
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

class Signal7Provider<A0, A1, A2, A3, A4, A5, A6>(
  val signals: Map<String, Signal>
) : ReadOnlyProperty<Object, Signal7<A0, A1, A2, A3, A4, A5, A6>> {
  @Suppress("UNCHECKED_CAST")
  override fun getValue(thisRef: Object, property: KProperty<*>): Signal7<A0, A1, A2, A3, A4, A5,
      A6> = signals[property.name.toSignalName()] as Signal7<A0, A1, A2, A3, A4, A5, A6>
}

/**
 * Creates a signal of 7 params
 */
fun <A0, A1, A2, A3, A4, A5, A6> GodotClass<*, *>.signal7(): Signal7Provider<A0, A1, A2, A3, A4, A5,
    A6> = Signal7Provider(signals())


/**
 * Registers a signal of 7 params
 */
@godot.ide.Signal
inline fun <T : Object, reified A0, reified A1, reified A2, reified A3, reified A4, reified A5,
    reified A6, K : KProperty1<T, Signal7<A0, A1, A2, A3, A4, A5, A6>>>
    ClassMemberRegistry<T>.registerSignal(
  property: K,
  a0: String,
  a1: String,
  a2: String,
  a3: String,
  a4: String,
  a5: String,
  a6: String
) {
  val parameterTypes = mutableMapOf<String, Variant.Type>()
  parameterTypes[a0] = Variant.typeForT<A0>()
  parameterTypes[a1] = Variant.typeForT<A1>()
  parameterTypes[a2] = Variant.typeForT<A2>()
  parameterTypes[a3] = Variant.typeForT<A3>()
  parameterTypes[a4] = Variant.typeForT<A4>()
  parameterTypes[a5] = Variant.typeForT<A5>()
  parameterTypes[a6] = Variant.typeForT<A6>()
  val signalName = property.name.toSignalName()
  val signal = Signal7<A0, A1, A2, A3, A4, A5, A6>(signalName)
  doRegisterSignal(className, signalName, signal, parameterTypes)
}

/**
 * Represents a signal with 8 params
 */
class Signal8<A0, A1, A2, A3, A4, A5, A6, A7>(
  name: String
) : Signal(name) {
  internal fun emit(
    instance: Object,
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
      instance,
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

class Signal8Provider<A0, A1, A2, A3, A4, A5, A6, A7>(
  val signals: Map<String, Signal>
) : ReadOnlyProperty<Object, Signal8<A0, A1, A2, A3, A4, A5, A6, A7>> {
  @Suppress("UNCHECKED_CAST")
  override fun getValue(thisRef: Object, property: KProperty<*>): Signal8<A0, A1, A2, A3, A4, A5,
      A6, A7> = signals[property.name.toSignalName()] as Signal8<A0, A1, A2, A3, A4, A5, A6, A7>
}

/**
 * Creates a signal of 8 params
 */
fun <A0, A1, A2, A3, A4, A5, A6, A7> GodotClass<*, *>.signal8(): Signal8Provider<A0, A1, A2, A3, A4,
    A5, A6, A7> = Signal8Provider(signals())


/**
 * Registers a signal of 8 params
 */
@godot.ide.Signal
inline fun <T : Object, reified A0, reified A1, reified A2, reified A3, reified A4, reified A5,
    reified A6, reified A7, K : KProperty1<T, Signal8<A0, A1, A2, A3, A4, A5, A6, A7>>>
    ClassMemberRegistry<T>.registerSignal(
  property: K,
  a0: String,
  a1: String,
  a2: String,
  a3: String,
  a4: String,
  a5: String,
  a6: String,
  a7: String
) {
  val parameterTypes = mutableMapOf<String, Variant.Type>()
  parameterTypes[a0] = Variant.typeForT<A0>()
  parameterTypes[a1] = Variant.typeForT<A1>()
  parameterTypes[a2] = Variant.typeForT<A2>()
  parameterTypes[a3] = Variant.typeForT<A3>()
  parameterTypes[a4] = Variant.typeForT<A4>()
  parameterTypes[a5] = Variant.typeForT<A5>()
  parameterTypes[a6] = Variant.typeForT<A6>()
  parameterTypes[a7] = Variant.typeForT<A7>()
  val signalName = property.name.toSignalName()
  val signal = Signal8<A0, A1, A2, A3, A4, A5, A6, A7>(signalName)
  doRegisterSignal(className, signalName, signal, parameterTypes)
}

/**
 * Represents a signal with 9 params
 */
class Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>(
  name: String
) : Signal(name) {
  internal fun emit(
    instance: Object,
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
      instance,
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

class Signal9Provider<A0, A1, A2, A3, A4, A5, A6, A7, A8>(
  val signals: Map<String, Signal>
) : ReadOnlyProperty<Object, Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>> {
  @Suppress("UNCHECKED_CAST")
  override fun getValue(thisRef: Object, property: KProperty<*>): Signal9<A0, A1, A2, A3, A4, A5,
      A6, A7, A8> = signals[property.name.toSignalName()] as Signal9<A0, A1, A2, A3, A4, A5, A6, A7,
      A8>
}

/**
 * Creates a signal of 9 params
 */
fun <A0, A1, A2, A3, A4, A5, A6, A7, A8> GodotClass<*, *>.signal9(): Signal9Provider<A0, A1, A2, A3,
    A4, A5, A6, A7, A8> = Signal9Provider(signals())


/**
 * Registers a signal of 9 params
 */
@godot.ide.Signal
inline fun <T : Object, reified A0, reified A1, reified A2, reified A3, reified A4, reified A5,
    reified A6, reified A7, reified A8, K : KProperty1<T, Signal9<A0, A1, A2, A3, A4, A5, A6, A7,
    A8>>> ClassMemberRegistry<T>.registerSignal(
  property: K,
  a0: String,
  a1: String,
  a2: String,
  a3: String,
  a4: String,
  a5: String,
  a6: String,
  a7: String,
  a8: String
) {
  val parameterTypes = mutableMapOf<String, Variant.Type>()
  parameterTypes[a0] = Variant.typeForT<A0>()
  parameterTypes[a1] = Variant.typeForT<A1>()
  parameterTypes[a2] = Variant.typeForT<A2>()
  parameterTypes[a3] = Variant.typeForT<A3>()
  parameterTypes[a4] = Variant.typeForT<A4>()
  parameterTypes[a5] = Variant.typeForT<A5>()
  parameterTypes[a6] = Variant.typeForT<A6>()
  parameterTypes[a7] = Variant.typeForT<A7>()
  parameterTypes[a8] = Variant.typeForT<A8>()
  val signalName = property.name.toSignalName()
  val signal = Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>(signalName)
  doRegisterSignal(className, signalName, signal, parameterTypes)
}

/**
 * Represents a signal with 10 params
 */
class Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9>(
  name: String
) : Signal(name) {
  internal fun emit(
    instance: Object,
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
      instance,
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

class Signal10Provider<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9>(
  val signals: Map<String, Signal>
) : ReadOnlyProperty<Object, Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9>> {
  @Suppress("UNCHECKED_CAST")
  override fun getValue(thisRef: Object, property: KProperty<*>): Signal10<A0, A1, A2, A3, A4, A5,
      A6, A7, A8, A9> = signals[property.name.toSignalName()] as Signal10<A0, A1, A2, A3, A4, A5,
      A6, A7, A8, A9>
}

/**
 * Creates a signal of 10 params
 */
fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, A9> GodotClass<*, *>.signal10(): Signal10Provider<A0, A1,
    A2, A3, A4, A5, A6, A7, A8, A9> = Signal10Provider(signals())


/**
 * Registers a signal of 10 params
 */
@godot.ide.Signal
inline fun <T : Object, reified A0, reified A1, reified A2, reified A3, reified A4, reified A5,
    reified A6, reified A7, reified A8, reified A9, K : KProperty1<T, Signal10<A0, A1, A2, A3, A4,
    A5, A6, A7, A8, A9>>> ClassMemberRegistry<T>.registerSignal(
  property: K,
  a0: String,
  a1: String,
  a2: String,
  a3: String,
  a4: String,
  a5: String,
  a6: String,
  a7: String,
  a8: String,
  a9: String
) {
  val parameterTypes = mutableMapOf<String, Variant.Type>()
  parameterTypes[a0] = Variant.typeForT<A0>()
  parameterTypes[a1] = Variant.typeForT<A1>()
  parameterTypes[a2] = Variant.typeForT<A2>()
  parameterTypes[a3] = Variant.typeForT<A3>()
  parameterTypes[a4] = Variant.typeForT<A4>()
  parameterTypes[a5] = Variant.typeForT<A5>()
  parameterTypes[a6] = Variant.typeForT<A6>()
  parameterTypes[a7] = Variant.typeForT<A7>()
  parameterTypes[a8] = Variant.typeForT<A8>()
  parameterTypes[a9] = Variant.typeForT<A9>()
  val signalName = property.name.toSignalName()
  val signal = Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9>(signalName)
  doRegisterSignal(className, signalName, signal, parameterTypes)
}
