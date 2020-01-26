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

open class AudioServer internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    val Instance: AudioServer = memScoped {
          val handle =
            checkNotNull(Godot.gdnative.godot_global_get_singleton)("AudioServer".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton AudioServer" }
          AudioServer(
            handle
          )
        }

    val SpeakerModeStereo: Int = 0

    val SpeakerSurround31: Int = 1

    val SpeakerSurround51: Int = 2

    val SpeakerSurround71: Int = 3
  }
}
