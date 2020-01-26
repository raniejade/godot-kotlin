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
  enum class LoopMode(
    val value: Int
  ) {
    LOOP_DISABLED(0),

    LOOP_FORWARD(1),

    LOOP_PING_PONG(2),

    LOOP_BACKWARD(3);
  }

  enum class Format(
    val value: Int
  ) {
    FORMAT_8_BITS(0),

    FORMAT_16_BITS(1),

    FORMAT_IMA_ADPCM(2);
  }

  companion object {
    val FORMAT_16_BITS: Int = 1

    val FORMAT_8_BITS: Int = 0

    val FORMAT_IMA_ADPCM: Int = 2

    val LOOP_BACKWARD: Int = 3

    val LOOP_DISABLED: Int = 0

    val LOOP_FORWARD: Int = 1

    val LOOP_PING_PONG: Int = 2

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
