package godot

import kotlinx.cinterop.CStructVar
import kotlinx.cinterop.CValue
import kotlin.native.concurrent.AtomicReference
import kotlin.native.concurrent.freeze

abstract class CoreType<T: CStructVar>(value: CValue<T>) {
  private val ref = AtomicReference(value.freeze())
  internal var _value: CValue<T>
    get() = ref.value
    set(value) {
      ref.compareAndSet(ref.value, value.freeze())
    }

  abstract fun toVariant(): Variant
  internal abstract fun toGDString(): GDString

  final override fun toString(): String {
    val gdString = toGDString()
    val ret = gdString.toKString()
    gdString.destroy()
    return ret
  }
}