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

open class Camera internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  companion object {
    val DopplerTrackingDisabled: Int = 0

    val DopplerTrackingIdleStep: Int = 1

    val DopplerTrackingPhysicsStep: Int = 2

    val KeepHeight: Int = 1

    val KeepWidth: Int = 0

    val ProjectionFrustum: Int = 2

    val ProjectionOrthogonal: Int = 1

    val ProjectionPerspective: Int = 0

    fun new(): Camera = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Camera".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Camera" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      Camera(
        fn()
      )
    }}
}
