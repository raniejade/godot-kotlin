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

open class Tree internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  companion object {
    val DropModeDisabled: Int = 0

    val DropModeInbetween: Int = 2

    val DropModeOnItem: Int = 1

    val SelectMulti: Int = 2

    val SelectRow: Int = 1

    val SelectSingle: Int = 0

    fun new(): Tree = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tree".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Tree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      Tree(
        fn()
      )
    }}
}
