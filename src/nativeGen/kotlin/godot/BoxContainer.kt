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

open class BoxContainer internal constructor(
  _handle: COpaquePointer
) : Container(_handle) {
  enum class AlignMode(
    val value: Int
  ) {
    ALIGN_BEGIN(0),

    ALIGN_CENTER(1),

    ALIGN_END(2);
  }

  companion object {
    val ALIGN_BEGIN: Int = 0

    val ALIGN_CENTER: Int = 1

    val ALIGN_END: Int = 2
  }
}
