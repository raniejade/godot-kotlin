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

open class ReflectionProbe internal constructor(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  companion object {
    val UpdateAlways: Int = 1

    val UpdateOnce: Int = 0

    fun new(): ReflectionProbe = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ReflectionProbe".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ReflectionProbe" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      ReflectionProbe(
        fn()
      )
    }}
}
