// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TextureArray internal constructor(
  _handle: COpaquePointer
) : TextureLayered(_handle) {
  companion object {
    fun new(): TextureArray = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureArray".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for TextureArray" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextureArray(
        fn()
      )
    }}
}
