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

open class LinkButton internal constructor(
  _handle: COpaquePointer
) : BaseButton(_handle) {
  enum class UnderlineMode(
    val value: Int
  ) {
    UNDERLINE_MODE_ALWAYS(0),

    UNDERLINE_MODE_ON_HOVER(1),

    UNDERLINE_MODE_NEVER(2);
  }

  companion object {
    val UNDERLINE_MODE_ALWAYS: Int = 0

    val UNDERLINE_MODE_NEVER: Int = 2

    val UNDERLINE_MODE_ON_HOVER: Int = 1

    fun new(): LinkButton = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LinkButton".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for LinkButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      LinkButton(
        fn()
      )
    }}
}
