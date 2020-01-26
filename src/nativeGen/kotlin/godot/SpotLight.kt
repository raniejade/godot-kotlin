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

open class SpotLight internal constructor(
  _handle: COpaquePointer
) : Light(_handle) {
  companion object {
    fun new(): SpotLight = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpotLight".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton SpotLight" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SpotLight(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SpotLight = SpotLight(ptr)
    /**
     * Container for method_bind pointers for SpotLight
     */
    private object __method_bind
  }
}
