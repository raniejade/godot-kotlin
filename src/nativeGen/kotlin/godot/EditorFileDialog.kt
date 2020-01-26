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

open class EditorFileDialog internal constructor(
  _handle: COpaquePointer
) : ConfirmationDialog(_handle) {
  companion object {
    val AccessFilesystem: Int = 2

    val AccessResources: Int = 0

    val AccessUserdata: Int = 1

    val DisplayList: Int = 1

    val DisplayThumbnails: Int = 0

    val ModeOpenAny: Int = 3

    val ModeOpenDir: Int = 2

    val ModeOpenFile: Int = 0

    val ModeOpenFiles: Int = 1

    val ModeSaveFile: Int = 4

    fun new(): EditorFileDialog = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorFileDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for EditorFileDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      EditorFileDialog(
        fn()
      )
    }}
}
