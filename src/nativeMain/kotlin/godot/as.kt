package godot

import godot.core.Variant
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty1

class Signal1Provider<A0>(val signals: Map<String, Signal>): ReadOnlyProperty<Object, Signal1<A0>> {
  override fun getValue(thisRef: Object, property: KProperty<*>): Signal1<A0> {
    return signals[property.name] as Signal1<A0>
  }
}

fun <A0> GodotClass<*, *>.signal(): Signal1Provider<A0> {
  return Signal1Provider(registry.signals)
}

inline fun <T: Object, reified A0, K: KProperty1<T, Signal1<A0>>> ClassMemberRegistry<T>.registerSignal(property: K, a0: String) {
  val parameterTypes = mutableMapOf<String, Variant.Type>()
  parameterTypes[a0] = Variant.typeForT<A0>()
  val signal = Signal1<
    A0
    >(
    property.name
  )

  doRegisterSignal(className, property.name, signal, parameterTypes)
}
