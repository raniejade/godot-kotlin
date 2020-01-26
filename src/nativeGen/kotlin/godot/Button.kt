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

open class Button internal constructor(
  _handle: COpaquePointer
) : BaseButton(_handle) {
  enum class TextAlign(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2);
  }

  companion object {
    val ALIGN_CENTER: Int = 1

    val ALIGN_LEFT: Int = 0

    val ALIGN_RIGHT: Int = 2

    fun new(): Button = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Button".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Button" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Button(
        fn()
      )
    }}
}
