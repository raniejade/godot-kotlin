// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

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

    fun new(): AudioStreamSample {
      TODO()
    }
  }
}
