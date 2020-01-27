// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioBusLayout(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    fun new(): AudioBusLayout = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioBusLayout".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioBusLayout" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioBusLayout(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioBusLayout = AudioBusLayout(ptr)
    /**
     * Container for method_bind pointers for AudioBusLayout
     */
    private object __method_bind
  }
}
