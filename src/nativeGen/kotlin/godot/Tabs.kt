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

open class Tabs internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  enum class CloseButtonDisplayPolicy(
    val value: Int
  ) {
    CLOSE_BUTTON_SHOW_NEVER(0),

    CLOSE_BUTTON_SHOW_ACTIVE_ONLY(1),

    CLOSE_BUTTON_SHOW_ALWAYS(2),

    CLOSE_BUTTON_MAX(3);
  }

  enum class TabAlign(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_MAX(3);
  }

  companion object {
    val ALIGN_CENTER: Int = 1

    val ALIGN_LEFT: Int = 0

    val ALIGN_MAX: Int = 3

    val ALIGN_RIGHT: Int = 2

    val CLOSE_BUTTON_MAX: Int = 3

    val CLOSE_BUTTON_SHOW_ACTIVE_ONLY: Int = 1

    val CLOSE_BUTTON_SHOW_ALWAYS: Int = 2

    val CLOSE_BUTTON_SHOW_NEVER: Int = 0

    fun new(): Tabs = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tabs".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Tabs" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Tabs(
        fn()
      )
    }}
}
