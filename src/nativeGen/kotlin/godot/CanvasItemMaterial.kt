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
  enum class LightMode(
    val value: Int
  ) {
    LIGHT_MODE_NORMAL(0),

    LIGHT_MODE_UNSHADED(1),

    LIGHT_MODE_LIGHT_ONLY(2);
  }

  enum class BlendMode(
    val value: Int
  ) {
    BLEND_MODE_MIX(0),

    BLEND_MODE_ADD(1),

    BLEND_MODE_SUB(2),

    BLEND_MODE_MUL(3),

    BLEND_MODE_PREMULT_ALPHA(4);
  }

  companion object {
    val BLEND_MODE_ADD: Int = 1

    val BLEND_MODE_MIX: Int = 0

    val BLEND_MODE_MUL: Int = 3

    val BLEND_MODE_PREMULT_ALPHA: Int = 4

    val BLEND_MODE_SUB: Int = 2

    val LIGHT_MODE_LIGHT_ONLY: Int = 2

    val LIGHT_MODE_NORMAL: Int = 0

    val LIGHT_MODE_UNSHADED: Int = 1

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
