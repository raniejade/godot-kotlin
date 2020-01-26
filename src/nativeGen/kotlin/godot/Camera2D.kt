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

open class Camera2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  companion object {
    val AnchorModeDragCenter: Int = 1

    val AnchorModeFixedTopLeft: Int = 0

    val Camera2dProcessIdle: Int = 1

    val Camera2dProcessPhysics: Int = 0

    fun new(): Camera2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Camera2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Camera2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      Camera2D(
        fn()
      )
    }}
}
