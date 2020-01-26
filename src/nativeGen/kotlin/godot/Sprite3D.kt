// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Sprite3D internal constructor(
  _handle: COpaquePointer
) : SpriteBase3D(_handle) {
  companion object {
    fun new(): Sprite3D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Sprite3D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Sprite3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      Sprite3D(
        fn()
      )
    }}
}
