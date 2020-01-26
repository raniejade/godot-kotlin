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

open class TextEdit internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  companion object {
    val MenuClear: Int = 3

    val MenuCopy: Int = 1

    val MenuCut: Int = 0

    val MenuMax: Int = 7

    val MenuPaste: Int = 2

    val MenuRedo: Int = 6

    val MenuSelectAll: Int = 4

    val MenuUndo: Int = 5

    val SearchBackwards: Int = 4

    val SearchMatchCase: Int = 1

    val SearchWholeWords: Int = 2

    fun new(): TextEdit = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextEdit".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for TextEdit" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextEdit(
        fn()
      )
    }}
}
