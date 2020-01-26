// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ParallaxLayer internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  companion object {
    fun new(): ParallaxLayer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ParallaxLayer".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ParallaxLayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      ParallaxLayer(
        fn()
      )
    }}
}
