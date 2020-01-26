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

open class SceneState internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    val GenEditStateDisabled: Int = 0

    val GenEditStateInstance: Int = 1

    val GenEditStateMain: Int = 2
  }
}
