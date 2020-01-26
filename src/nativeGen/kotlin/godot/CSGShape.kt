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
  enum class Operation(
    val value: Int
  ) {
    OPERATION_UNION(0),

    OPERATION_INTERSECTION(1),

    OPERATION_SUBTRACTION(2);
  }

  companion object {
    val OPERATION_INTERSECTION: Int = 1

    val OPERATION_SUBTRACTION: Int = 2

    val OPERATION_UNION: Int = 0
  }
}
