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

open class StyleBoxTexture internal constructor(
  _handle: COpaquePointer
) : StyleBox(_handle) {
  companion object {
    val AxisStretchModeStretch: Int = 0

    val AxisStretchModeTile: Int = 1

    val AxisStretchModeTileFit: Int = 2

    fun new(): StyleBoxTexture = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("StyleBoxTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for StyleBoxTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      StyleBoxTexture(
        fn()
      )
    }}
}
