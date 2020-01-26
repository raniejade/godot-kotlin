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

open class AudioStreamPlayer3D internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  enum class AttenuationModel(
    val value: Int
  ) {
    ATTENUATION_INVERSE_DISTANCE(0),

    ATTENUATION_INVERSE_SQUARE_DISTANCE(1),

    ATTENUATION_LOGARITHMIC(2),

    ATTENUATION_DISABLED(3);
  }

  enum class OutOfRangeMode(
    val value: Int
  ) {
    OUT_OF_RANGE_MIX(0),

    OUT_OF_RANGE_PAUSE(1);
  }

  enum class DopplerTracking(
    val value: Int
  ) {
    DOPPLER_TRACKING_DISABLED(0),

    DOPPLER_TRACKING_IDLE_STEP(1),

    DOPPLER_TRACKING_PHYSICS_STEP(2);
  }

  companion object {
    val ATTENUATION_DISABLED: Int = 3

    val ATTENUATION_INVERSE_DISTANCE: Int = 0

    val ATTENUATION_INVERSE_SQUARE_DISTANCE: Int = 1

    val ATTENUATION_LOGARITHMIC: Int = 2

    val DOPPLER_TRACKING_DISABLED: Int = 0

    val DOPPLER_TRACKING_IDLE_STEP: Int = 1

    val DOPPLER_TRACKING_PHYSICS_STEP: Int = 2

    val OUT_OF_RANGE_MIX: Int = 0

    val OUT_OF_RANGE_PAUSE: Int = 1

    fun new(): AudioStreamPlayer3D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamPlayer3D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AudioStreamPlayer3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioStreamPlayer3D(
        fn()
      )
    }}
}
