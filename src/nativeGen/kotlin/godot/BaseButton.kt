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

open class BaseButton internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  companion object {
    val ActionModeButtonPress: Int = 0

    val ActionModeButtonRelease: Int = 1

    val DrawDisabled: Int = 3

    val DrawHover: Int = 2

    val DrawHoverPressed: Int = 4

    val DrawNormal: Int = 0

    val DrawPressed: Int = 1
  }
}
