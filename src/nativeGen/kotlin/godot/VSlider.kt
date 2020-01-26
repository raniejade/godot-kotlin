// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VSlider internal constructor(
  _handle: COpaquePointer
) : Slider(_handle) {
  companion object {
    fun new(): VSlider = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VSlider".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VSlider" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VSlider(
        fn()
      )
    }}
}
