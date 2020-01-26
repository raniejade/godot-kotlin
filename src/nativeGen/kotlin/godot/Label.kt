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

open class Label internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  companion object {
    val AlignCenter: Int = 1

    val AlignFill: Int = 3

    val AlignLeft: Int = 0

    val AlignRight: Int = 2

    val ValignBottom: Int = 2

    val ValignCenter: Int = 1

    val ValignFill: Int = 3

    val ValignTop: Int = 0

    fun new(): Label = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Label".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Label" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Label(
        fn()
      )
    }}
}
