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

open class CSGShape internal constructor(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  companion object {
    val OperationIntersection: Int = 1

    val OperationSubtraction: Int = 2

    val OperationUnion: Int = 0
  }
}
