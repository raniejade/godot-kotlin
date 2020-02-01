package godot

typealias ChangeListener<T, R> = T.(R?, R) -> Unit

fun <T: Object, A0> Signal1<A0>.asListener(): ChangeListener<T, A0> {
  return { _, newValue ->
    println("emitting signal...")
    this@asListener.emit(this,  newValue)
  }
}