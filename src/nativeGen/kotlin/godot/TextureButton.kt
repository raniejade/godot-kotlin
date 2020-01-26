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

open class TextureButton internal constructor(
  _handle: COpaquePointer
) : BaseButton(_handle) {
  companion object {
    val StretchKeep: Int = 2

    val StretchKeepAspect: Int = 4

    val StretchKeepAspectCentered: Int = 5

    val StretchKeepAspectCovered: Int = 6

    val StretchKeepCentered: Int = 3

    val StretchScale: Int = 0

    val StretchTile: Int = 1

    fun new(): TextureButton = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureButton".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for TextureButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextureButton(
        fn()
      )
    }}
}
