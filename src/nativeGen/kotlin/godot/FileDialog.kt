// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class FileDialog internal constructor(
  _handle: COpaquePointer
) : ConfirmationDialog(_handle) {
  companion object {
    val AccessFilesystem: Int = 2

    val AccessResources: Int = 0

    val AccessUserdata: Int = 1

    val ModeOpenAny: Int = 3

    val ModeOpenDir: Int = 2

    val ModeOpenFile: Int = 0

    val ModeOpenFiles: Int = 1

    val ModeSaveFile: Int = 4

    fun new(): FileDialog {
      TODO()
    }
  }
}
