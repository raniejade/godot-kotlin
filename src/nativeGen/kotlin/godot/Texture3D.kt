// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Texture3D internal constructor(
  _handle: COpaquePointer
) : TextureLayered(_handle) {
  companion object {
    fun new(): Texture3D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Texture3D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Texture3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Texture3D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Texture3D = Texture3D(ptr)
    /**
     * Container for method_bind pointers for Texture3D
     */
    private object __method_bind
  }
}
