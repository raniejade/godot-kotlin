// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioStreamSample internal constructor(
  _handle: COpaquePointer
) : AudioStream(_handle) {
  companion object {
    val Format16Bits: Int = 1

    val Format8Bits: Int = 0

    val FormatImaAdpcm: Int = 2

    val LoopBackward: Int = 3

    val LoopDisabled: Int = 0

    val LoopForward: Int = 1

    val LoopPingPong: Int = 2

    fun new(): AudioStreamSample = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamSample".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AudioStreamSample" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      AudioStreamSample(
        fn()
      )
    }}
}
