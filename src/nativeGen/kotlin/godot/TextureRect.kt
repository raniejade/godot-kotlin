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

open class TextureRect internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  companion object {
    val StretchKeep: Int = 3

    val StretchKeepAspect: Int = 5

    val StretchKeepAspectCentered: Int = 6

    val StretchKeepAspectCovered: Int = 7

    val StretchKeepCentered: Int = 4

    val StretchScale: Int = 1

    val StretchScaleOnExpand: Int = 0

    val StretchTile: Int = 2

    fun new(): TextureRect = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureRect".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for TextureRect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextureRect(
        fn()
      )
    }}
}
