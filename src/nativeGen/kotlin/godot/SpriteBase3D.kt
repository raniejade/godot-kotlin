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

open class SpriteBase3D internal constructor(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  companion object {
    val AlphaCutDisabled: Int = 0

    val AlphaCutDiscard: Int = 1

    val AlphaCutOpaquePrepass: Int = 2

    val FlagDoubleSided: Int = 2

    val FlagMax: Int = 3

    val FlagShaded: Int = 1

    val FlagTransparent: Int = 0
  }
}
