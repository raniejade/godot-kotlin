package godot

import kotlinx.cinterop.COpaquePointer

typealias ChangeListener<T, R> = T.(R?, R) -> Unit

fun <T: Object, A0> Signal1<A0>.asListener(): ChangeListener<T, A0> {
  return { _, newValue ->
    this@asListener.emit(this,  newValue)
  }
}

fun <T: Object> Object.castTo(factory: (COpaquePointer) -> T): T {
  return factory(_handle)
}