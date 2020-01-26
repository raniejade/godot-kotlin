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

open class TextureProgress internal constructor(
  _handle: COpaquePointer
) : Range(_handle) {
  companion object {
    val FillBilinearLeftAndRight: Int = 6

    val FillBilinearTopAndBottom: Int = 7

    val FillBottomToTop: Int = 3

    val FillClockwise: Int = 4

    val FillClockwiseAndCounterClockwise: Int = 8

    val FillCounterClockwise: Int = 5

    val FillLeftToRight: Int = 0

    val FillRightToLeft: Int = 1

    val FillTopToBottom: Int = 2

    fun new(): TextureProgress = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureProgress".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for TextureProgress" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      TextureProgress(
        fn()
      )
    }}
}
