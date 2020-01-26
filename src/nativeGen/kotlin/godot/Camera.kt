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
  enum class KeepAspect(
    val value: Int
  ) {
    KEEP_WIDTH(0),

    KEEP_HEIGHT(1);
  }

  enum class Projection(
    val value: Int
  ) {
    PROJECTION_PERSPECTIVE(0),

    PROJECTION_ORTHOGONAL(1),

    PROJECTION_FRUSTUM(2);
  }

  enum class DopplerTracking(
    val value: Int
  ) {
    DOPPLER_TRACKING_DISABLED(0),

    DOPPLER_TRACKING_IDLE_STEP(1),

    DOPPLER_TRACKING_PHYSICS_STEP(2);
  }

  companion object {
    val DOPPLER_TRACKING_DISABLED: Int = 0

    val DOPPLER_TRACKING_IDLE_STEP: Int = 1

    val DOPPLER_TRACKING_PHYSICS_STEP: Int = 2

    val KEEP_HEIGHT: Int = 1

    val KEEP_WIDTH: Int = 0

    val PROJECTION_FRUSTUM: Int = 2

    val PROJECTION_ORTHOGONAL: Int = 1

    val PROJECTION_PERSPECTIVE: Int = 0

    fun new(): Camera = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Camera".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Camera" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Camera(
        fn()
      )
    }}
}
