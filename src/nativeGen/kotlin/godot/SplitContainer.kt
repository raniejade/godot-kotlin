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

open class SplitContainer internal constructor(
  _handle: COpaquePointer
) : Container(_handle) {
  enum class DraggerVisibility(
    val value: Int
  ) {
    DRAGGER_VISIBLE(0),

    DRAGGER_HIDDEN(1),

    DRAGGER_HIDDEN_COLLAPSED(2);
  }

  companion object {
    val DRAGGER_HIDDEN: Int = 1

    val DRAGGER_HIDDEN_COLLAPSED: Int = 2

    val DRAGGER_VISIBLE: Int = 0
  }
}
