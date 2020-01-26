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

open class LineEdit internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  companion object {
    val AlignCenter: Int = 1

    val AlignFill: Int = 3

    val AlignLeft: Int = 0

    val AlignRight: Int = 2

    val MenuClear: Int = 3

    val MenuCopy: Int = 1

    val MenuCut: Int = 0

    val MenuMax: Int = 7

    val MenuPaste: Int = 2

    val MenuRedo: Int = 6

    val MenuSelectAll: Int = 4

    val MenuUndo: Int = 5

    fun new(): LineEdit = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LineEdit".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for LineEdit" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      LineEdit(
        fn()
      )
    }}
}
