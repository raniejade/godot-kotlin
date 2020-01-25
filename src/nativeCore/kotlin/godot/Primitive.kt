package godot

import kotlinx.cinterop.CStructVar
import kotlinx.cinterop.CValue
import kotlin.native.concurrent.AtomicReference
import kotlin.native.concurrent.freeze

abstract class Primitive<T: CStructVar>(value: CValue<T>) {
  private val ref = AtomicReference(value.freeze())
  internal var _value: CValue<T>
    get() = ref.value
    set(value) {
      ref.compareAndSet(ref.value, value.freeze())
    }

  abstract fun toGDString(): GDString

  final override fun toString(): String {
    return toGDString().toKString()
  }
}