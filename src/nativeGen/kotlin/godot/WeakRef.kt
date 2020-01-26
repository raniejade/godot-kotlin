// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WeakRef internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): WeakRef = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("WeakRef".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for WeakRef" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      WeakRef(
        fn()
      )
    }}
}
