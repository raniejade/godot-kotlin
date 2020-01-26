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
  enum class MergeMode(
    val value: Int
  ) {
    MERGE_DISABLE(0),

    MERGE_ENDS(1),

    MERGE_ALL(2);
  }

  companion object {
    val MERGE_ALL: Int = 2

    val MERGE_DISABLE: Int = 0

    val MERGE_ENDS: Int = 1

    fun new(): UndoRedo = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("UndoRedo".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for UndoRedo" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      UndoRedo(
        fn()
      )
    }}
}
