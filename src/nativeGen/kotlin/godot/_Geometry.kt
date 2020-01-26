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

open class _Geometry internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    val Instance: _Geometry = memScoped {
          val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("_Geometry".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton _Geometry" }
          _Geometry(
            handle
          )
        }

    val EndButt: Int = 2

    val EndJoined: Int = 1

    val EndPolygon: Int = 0

    val EndRound: Int = 4

    val EndSquare: Int = 3

    val JoinMiter: Int = 2

    val JoinRound: Int = 1

    val JoinSquare: Int = 0

    val OperationDifference: Int = 1

    val OperationIntersection: Int = 2

    val OperationUnion: Int = 0

    val OperationXor: Int = 3
  }
}
