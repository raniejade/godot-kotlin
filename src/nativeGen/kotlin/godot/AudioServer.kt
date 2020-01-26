// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioServer internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addBus() {
    TODO()
  }

  fun addBusEffect() {
    TODO()
  }

  fun captureGetDevice(): String {
    TODO()
  }

  fun captureGetDeviceList(): VariantArray {
    TODO()
  }

  fun captureSetDevice() {
    TODO()
  }

  fun generateBusLayout(): AudioBusLayout {
    TODO()
  }

  fun getBusChannels(): Int {
    TODO()
  }

  fun getBusCount(): Int {
    TODO()
  }

  fun getBusEffect(): AudioEffect {
    TODO()
  }

  fun getBusEffectCount(): Int {
    TODO()
  }

  fun getBusEffectInstance(): AudioEffectInstance {
    TODO()
  }

  fun getBusIndex(): Int {
    TODO()
  }

  fun getBusName(): String {
    TODO()
  }

  fun getBusPeakVolumeLeftDb(): Float {
    TODO()
  }

  fun getBusPeakVolumeRightDb(): Float {
    TODO()
  }

  fun getBusSend(): String {
    TODO()
  }

  fun getBusVolumeDb(): Float {
    TODO()
  }

  fun getDevice(): String {
    TODO()
  }

  fun getDeviceList(): VariantArray {
    TODO()
  }

  fun getMixRate(): Float {
    TODO()
  }

  fun getOutputLatency(): Float {
    TODO()
  }

  fun getSpeakerMode(): AudioServer.SpeakerMode {
    TODO()
  }

  fun getTimeSinceLastMix(): Float {
    TODO()
  }

  fun getTimeToNextMix(): Float {
    TODO()
  }

  fun isBusBypassingEffects(): Boolean {
    TODO()
  }

  fun isBusEffectEnabled(): Boolean {
    TODO()
  }

  fun isBusMute(): Boolean {
    TODO()
  }

  fun isBusSolo(): Boolean {
    TODO()
  }

  fun lock() {
    TODO()
  }

  fun moveBus() {
    TODO()
  }

  fun removeBus() {
    TODO()
  }

  fun removeBusEffect() {
    TODO()
  }

  fun setBusBypassEffects() {
    TODO()
  }

  fun setBusCount() {
    TODO()
  }

  fun setBusEffectEnabled() {
    TODO()
  }

  fun setBusLayout() {
    TODO()
  }

  fun setBusMute() {
    TODO()
  }

  fun setBusName() {
    TODO()
  }

  fun setBusSend() {
    TODO()
  }

  fun setBusSolo() {
    TODO()
  }

  fun setBusVolumeDb() {
    TODO()
  }

  fun setDevice() {
    TODO()
  }

  fun swapBusEffects() {
    TODO()
  }

  fun unlock() {
    TODO()
  }

  enum class SpeakerMode(
    val value: Int
  ) {
    SPEAKER_MODE_STEREO(0),

    SPEAKER_SURROUND_31(1),

    SPEAKER_SURROUND_51(2),

    SPEAKER_SURROUND_71(3);
  }

  companion object {
    val Instance: AudioServer = memScoped {
          val handle =
            checkNotNull(Godot.gdnative.godot_global_get_singleton)("AudioServer".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton AudioServer" }
          AudioServer(
            handle
          )
        }

    val SPEAKER_MODE_STEREO: Int = 0

    val SPEAKER_SURROUND_31: Int = 1

    val SPEAKER_SURROUND_51: Int = 2

    val SPEAKER_SURROUND_71: Int = 3

    /**
     * Container for method_bind pointers for AudioServer
     */
    private object __method_bind {
      val add_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "add_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_bus" }
            }
          }

      val add_bus_effect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "add_bus_effect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_bus_effect" }
            }
          }

      val capture_get_device: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "capture_get_device".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method capture_get_device" }
            }
          }

      val capture_get_device_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "capture_get_device_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method capture_get_device_list" }
            }
          }

      val capture_set_device: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "capture_set_device".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method capture_set_device" }
            }
          }

      val generate_bus_layout: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "generate_bus_layout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method generate_bus_layout" }
            }
          }

      val get_bus_channels: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_channels".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_channels" }
            }
          }

      val get_bus_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_count" }
            }
          }

      val get_bus_effect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_effect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_effect" }
            }
          }

      val get_bus_effect_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_effect_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_effect_count" }
            }
          }

      val get_bus_effect_instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_effect_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_effect_instance" }
            }
          }

      val get_bus_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_index" }
            }
          }

      val get_bus_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_name" }
            }
          }

      val get_bus_peak_volume_left_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_peak_volume_left_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_peak_volume_left_db" }
            }
          }

      val get_bus_peak_volume_right_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_peak_volume_right_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_peak_volume_right_db" }
            }
          }

      val get_bus_send: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_send".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_send" }
            }
          }

      val get_bus_volume_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_volume_db" }
            }
          }

      val get_device: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_device".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_device" }
            }
          }

      val get_device_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_device_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_device_list" }
            }
          }

      val get_mix_rate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_mix_rate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mix_rate" }
            }
          }

      val get_output_latency: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_output_latency".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_output_latency" }
            }
          }

      val get_speaker_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_speaker_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_speaker_mode" }
            }
          }

      val get_time_since_last_mix: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_time_since_last_mix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_time_since_last_mix" }
            }
          }

      val get_time_to_next_mix: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_time_to_next_mix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_time_to_next_mix" }
            }
          }

      val is_bus_bypassing_effects: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "is_bus_bypassing_effects".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_bus_bypassing_effects" }
            }
          }

      val is_bus_effect_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "is_bus_effect_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_bus_effect_enabled" }
            }
          }

      val is_bus_mute: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "is_bus_mute".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_bus_mute" }
            }
          }

      val is_bus_solo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "is_bus_solo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_bus_solo" }
            }
          }

      val lock: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "lock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method lock" }
            }
          }

      val move_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "move_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_bus" }
            }
          }

      val remove_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "remove_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_bus" }
            }
          }

      val remove_bus_effect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "remove_bus_effect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_bus_effect" }
            }
          }

      val set_bus_bypass_effects: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_bypass_effects".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_bypass_effects" }
            }
          }

      val set_bus_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_count" }
            }
          }

      val set_bus_effect_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_effect_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_effect_enabled" }
            }
          }

      val set_bus_layout: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_layout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_layout" }
            }
          }

      val set_bus_mute: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_mute".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_mute" }
            }
          }

      val set_bus_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_name" }
            }
          }

      val set_bus_send: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_send".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_send" }
            }
          }

      val set_bus_solo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_solo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_solo" }
            }
          }

      val set_bus_volume_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_volume_db" }
            }
          }

      val set_device: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_device".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_device" }
            }
          }

      val swap_bus_effects: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "swap_bus_effects".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method swap_bus_effects" }
            }
          }

      val unlock: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "unlock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unlock" }
            }
          }
    }
  }
}
