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

open class Line2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  companion object {
    val LineCapBox: Int = 1

    val LineCapNone: Int = 0

    val LineCapRound: Int = 2

    val LineJointBevel: Int = 1

    val LineJointRound: Int = 2

    val LineJointSharp: Int = 0

    val LineTextureNone: Int = 0

    val LineTextureStretch: Int = 2

    val LineTextureTile: Int = 1

    fun new(): Line2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Line2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Line2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Line2D(
        fn()
      )
    }}
}
