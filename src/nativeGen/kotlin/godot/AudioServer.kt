// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
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
  fun addBus(atPosition: Int) {
    val _args = VariantArray.new()
    _args.append(atPosition)
    val _ret = __method_bind.add_bus.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun addBusEffect(
    busIdx: Int,
    effect: AudioEffect,
    atPosition: Int
  ) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(effect)
    _args.append(atPosition)
    val _ret = __method_bind.add_bus_effect.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun captureGetDevice(): String {
    val _ret = __method_bind.capture_get_device.call(this.toVariant())
    TODO()
  }

  fun captureGetDeviceList(): VariantArray {
    val _ret = __method_bind.capture_get_device_list.call(this.toVariant())
    TODO()
  }

  fun captureSetDevice(name: String) {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.capture_set_device.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun generateBusLayout(): AudioBusLayout {
    val _ret = __method_bind.generate_bus_layout.call(this.toVariant())
    TODO()
  }

  fun getBusChannels(busIdx: Int): Int {
    val _args = VariantArray.new()
    _args.append(busIdx)
    val _ret = __method_bind.get_bus_channels.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getBusCount(): Int {
    val _ret = __method_bind.get_bus_count.call(this.toVariant())
    TODO()
  }

  fun getBusEffect(busIdx: Int, effectIdx: Int): AudioEffect {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(effectIdx)
    val _ret = __method_bind.get_bus_effect.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun getBusEffectCount(busIdx: Int): Int {
    val _args = VariantArray.new()
    _args.append(busIdx)
    val _ret = __method_bind.get_bus_effect_count.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getBusEffectInstance(
    busIdx: Int,
    effectIdx: Int,
    channel: Int
  ): AudioEffectInstance {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(effectIdx)
    _args.append(channel)
    val _ret = __method_bind.get_bus_effect_instance.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun getBusIndex(busName: String): Int {
    val _args = VariantArray.new()
    _args.append(busName)
    val _ret = __method_bind.get_bus_index.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getBusName(busIdx: Int): String {
    val _args = VariantArray.new()
    _args.append(busIdx)
    val _ret = __method_bind.get_bus_name.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getBusPeakVolumeLeftDb(busIdx: Int, channel: Int): Float {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(channel)
    val _ret = __method_bind.get_bus_peak_volume_left_db.call(this.toVariant(), _args.toVariant(),
        2)
    TODO()
  }

  fun getBusPeakVolumeRightDb(busIdx: Int, channel: Int): Float {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(channel)
    val _ret = __method_bind.get_bus_peak_volume_right_db.call(this.toVariant(), _args.toVariant(),
        2)
    TODO()
  }

  fun getBusSend(busIdx: Int): String {
    val _args = VariantArray.new()
    _args.append(busIdx)
    val _ret = __method_bind.get_bus_send.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getBusVolumeDb(busIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(busIdx)
    val _ret = __method_bind.get_bus_volume_db.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getDevice(): String {
    val _ret = __method_bind.get_device.call(this.toVariant())
    TODO()
  }

  fun getDeviceList(): VariantArray {
    val _ret = __method_bind.get_device_list.call(this.toVariant())
    TODO()
  }

  fun getMixRate(): Float {
    val _ret = __method_bind.get_mix_rate.call(this.toVariant())
    TODO()
  }

  fun getOutputLatency(): Float {
    val _ret = __method_bind.get_output_latency.call(this.toVariant())
    TODO()
  }

  fun getSpeakerMode(): SpeakerMode {
    val _ret = __method_bind.get_speaker_mode.call(this.toVariant())
    TODO()
  }

  fun getTimeSinceLastMix(): Float {
    val _ret = __method_bind.get_time_since_last_mix.call(this.toVariant())
    TODO()
  }

  fun getTimeToNextMix(): Float {
    val _ret = __method_bind.get_time_to_next_mix.call(this.toVariant())
    TODO()
  }

  fun isBusBypassingEffects(busIdx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(busIdx)
    val _ret = __method_bind.is_bus_bypassing_effects.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isBusEffectEnabled(busIdx: Int, effectIdx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(effectIdx)
    val _ret = __method_bind.is_bus_effect_enabled.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun isBusMute(busIdx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(busIdx)
    val _ret = __method_bind.is_bus_mute.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isBusSolo(busIdx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(busIdx)
    val _ret = __method_bind.is_bus_solo.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun lock() {
    val _ret = __method_bind.lock.call(this.toVariant())
    TODO()
  }

  fun moveBus(index: Int, toIndex: Int) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(toIndex)
    val _ret = __method_bind.move_bus.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun removeBus(index: Int) {
    val _args = VariantArray.new()
    _args.append(index)
    val _ret = __method_bind.remove_bus.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun removeBusEffect(busIdx: Int, effectIdx: Int) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(effectIdx)
    val _ret = __method_bind.remove_bus_effect.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setBusBypassEffects(busIdx: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(enable)
    val _ret = __method_bind.set_bus_bypass_effects.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setBusCount(amount: Int) {
    val _args = VariantArray.new()
    _args.append(amount)
    val _ret = __method_bind.set_bus_count.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBusEffectEnabled(
    busIdx: Int,
    effectIdx: Int,
    enabled: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(effectIdx)
    _args.append(enabled)
    val _ret = __method_bind.set_bus_effect_enabled.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun setBusLayout(busLayout: AudioBusLayout) {
    val _args = VariantArray.new()
    _args.append(busLayout)
    val _ret = __method_bind.set_bus_layout.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBusMute(busIdx: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(enable)
    val _ret = __method_bind.set_bus_mute.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setBusName(busIdx: Int, name: String) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(name)
    val _ret = __method_bind.set_bus_name.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setBusSend(busIdx: Int, send: String) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(send)
    val _ret = __method_bind.set_bus_send.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setBusSolo(busIdx: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(enable)
    val _ret = __method_bind.set_bus_solo.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setBusVolumeDb(busIdx: Int, volumeDb: Float) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(volumeDb)
    val _ret = __method_bind.set_bus_volume_db.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setDevice(device: String) {
    val _args = VariantArray.new()
    _args.append(device)
    val _ret = __method_bind.set_device.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun swapBusEffects(
    busIdx: Int,
    effectIdx: Int,
    byEffectIdx: Int
  ) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(effectIdx)
    _args.append(byEffectIdx)
    val _ret = __method_bind.swap_bus_effects.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun unlock() {
    val _ret = __method_bind.unlock.call(this.toVariant())
    TODO()
  }

  enum class SpeakerMode(
    val value: Int
  ) {
    SPEAKER_MODE_STEREO(0),

    SPEAKER_SURROUND_31(1),

    SPEAKER_SURROUND_51(2),

    SPEAKER_SURROUND_71(3);

    companion object {
      fun from(value: Int): SpeakerMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
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
