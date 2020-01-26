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

open class CanvasItemMaterial internal constructor(
  _handle: COpaquePointer
) : Material(_handle) {
  companion object {
    val BlendModeAdd: Int = 1

    val BlendModeMix: Int = 0

    val BlendModeMul: Int = 3

    val BlendModePremultAlpha: Int = 4

    val BlendModeSub: Int = 2

    val LightModeLightOnly: Int = 2

    val LightModeNormal: Int = 0

    val LightModeUnshaded: Int = 1

    fun new(): CanvasItemMaterial = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CanvasItemMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for CanvasItemMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CanvasItemMaterial(
        fn()
      )
    }}
}
