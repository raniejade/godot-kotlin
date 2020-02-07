package godot.core

import kotlinx.cinterop.*

// Helper method to instantiate a CoreType
internal inline fun <reified K: CStructVar, T> allocType(
  factory: (CValue<K>) -> T,
  constructor: MemScope.(CPointer<K>) -> Unit): T {
  val value = memScoped {
    val instance = alloc<K>()
    constructor(this, instance.ptr)
    instance.readValue()
  }

  return factory(value)
}

internal inline fun <reified K: CStructVar> allocType2(cb: MemScope.(CPointer<K>) -> Unit): CValue<K> {
  return memScoped {
    val instance = alloc<K>()
    cb(this, instance.ptr)
    instance.readValue()
  }
}