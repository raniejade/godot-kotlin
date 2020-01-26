// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioStreamMicrophone internal constructor(
  _handle: COpaquePointer
) : AudioStream(_handle) {
  companion object {
    fun new(): AudioStreamMicrophone = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamMicrophone".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AudioStreamMicrophone" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioStreamMicrophone(
        fn()
      )
    }}
}
