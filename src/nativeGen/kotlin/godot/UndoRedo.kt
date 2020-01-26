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

open class UndoRedo internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    val MergeAll: Int = 2

    val MergeDisable: Int = 0

    val MergeEnds: Int = 1

    fun new(): UndoRedo = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("UndoRedo".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for UndoRedo" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      UndoRedo(
        fn()
      )
    }}
}
