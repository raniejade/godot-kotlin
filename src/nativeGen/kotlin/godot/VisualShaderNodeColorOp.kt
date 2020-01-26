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

open class VisualShaderNodeColorOp internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  companion object {
    val OpBurn: Int = 6

    val OpDarken: Int = 2

    val OpDifference: Int = 1

    val OpDodge: Int = 5

    val OpHardLight: Int = 8

    val OpLighten: Int = 3

    val OpOverlay: Int = 4

    val OpScreen: Int = 0

    val OpSoftLight: Int = 7

    fun new(): VisualShaderNodeColorOp = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeColorOp".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualShaderNodeColorOp" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      VisualShaderNodeColorOp(
        fn()
      )
    }}
}
