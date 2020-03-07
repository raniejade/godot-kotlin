// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class AudioServerInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  var busCount: Int
    get() {
       return getBusCount() 
    }
    set(value) {
      setBusCount(value)
    }

  var device: String
    get() {
       return getDevice() 
    }
    set(value) {
      setDevice(value)
    }

  var globalRateScale: Float
    get() {
       return getGlobalRateScale() 
    }
    set(value) {
      setGlobalRateScale(value)
    }

  /**
   * AudioServer::bus_layout_changed signal
   */
  val signalBusLayoutChanged: Signal0 = Signal0("bus_layout_changed")

  fun addBus(atPosition: Int = -1) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addBus.call(self._handle, listOf(atPosition), null)
    }
  }

  fun addBusEffect(
    busIdx: Int,
    effect: AudioEffect,
    atPosition: Int = -1
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(effect)
      _args.add(atPosition)
      __method_bind.addBusEffect.call(self._handle, _args, null)
    }
  }

  fun captureGetDevice(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.captureGetDevice.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun captureGetDeviceList(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.captureGetDeviceList.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun captureSetDevice(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.captureSetDevice.call(self._handle, listOf(name), null)
    }
  }

  fun generateBusLayout(): AudioBusLayout {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: AudioBusLayout
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.generateBusLayout.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<AudioBusLayout>(_tmp.value!!)
      _ret
    }
  }

  fun getBusChannels(busIdx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBusChannels.call(self._handle, listOf(busIdx), _retPtr)
      _ret.value
    }
  }

  fun getBusCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBusCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getBusEffect(busIdx: Int, effectIdx: Int): AudioEffect {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: AudioEffect
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(effectIdx)
      __method_bind.getBusEffect.call(self._handle, _args, _retPtr)
      _ret = objectToType<AudioEffect>(_tmp.value!!)
      _ret
    }
  }

  fun getBusEffectCount(busIdx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBusEffectCount.call(self._handle, listOf(busIdx), _retPtr)
      _ret.value
    }
  }

  fun getBusEffectInstance(
    busIdx: Int,
    effectIdx: Int,
    channel: Int = 0
  ): AudioEffectInstance {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: AudioEffectInstance
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(effectIdx)
      _args.add(channel)
      __method_bind.getBusEffectInstance.call(self._handle, _args, _retPtr)
      _ret = objectToType<AudioEffectInstance>(_tmp.value!!)
      _ret
    }
  }

  fun getBusIndex(busName: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBusIndex.call(self._handle, listOf(busName), _retPtr)
      _ret.value
    }
  }

  fun getBusName(busIdx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getBusName.call(self._handle, listOf(busIdx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getBusPeakVolumeLeftDb(busIdx: Int, channel: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(channel)
      __method_bind.getBusPeakVolumeLeftDb.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getBusPeakVolumeRightDb(busIdx: Int, channel: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(channel)
      __method_bind.getBusPeakVolumeRightDb.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getBusSend(busIdx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getBusSend.call(self._handle, listOf(busIdx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getBusVolumeDb(busIdx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBusVolumeDb.call(self._handle, listOf(busIdx), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDevice(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getDevice.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getDeviceList(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getDeviceList.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getGlobalRateScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGlobalRateScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMixRate(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMixRate.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getOutputLatency(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOutputLatency.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSpeakerMode(): AudioServer.SpeakerMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpeakerMode.call(self._handle, emptyList(), _retPtr)
      AudioServer.SpeakerMode.from(_ret.value)
    }
  }

  fun getTimeSinceLastMix(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTimeSinceLastMix.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTimeToNextMix(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTimeToNextMix.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isBusBypassingEffects(busIdx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isBusBypassingEffects.call(self._handle, listOf(busIdx), _retPtr)
      _ret.value
    }
  }

  fun isBusEffectEnabled(busIdx: Int, effectIdx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(effectIdx)
      __method_bind.isBusEffectEnabled.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun isBusMute(busIdx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isBusMute.call(self._handle, listOf(busIdx), _retPtr)
      _ret.value
    }
  }

  fun isBusSolo(busIdx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isBusSolo.call(self._handle, listOf(busIdx), _retPtr)
      _ret.value
    }
  }

  fun lock() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.lock.call(self._handle, emptyList(), null)
    }
  }

  fun moveBus(index: Int, toIndex: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(index)
      _args.add(toIndex)
      __method_bind.moveBus.call(self._handle, _args, null)
    }
  }

  fun removeBus(index: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeBus.call(self._handle, listOf(index), null)
    }
  }

  fun removeBusEffect(busIdx: Int, effectIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(effectIdx)
      __method_bind.removeBusEffect.call(self._handle, _args, null)
    }
  }

  fun setBusBypassEffects(busIdx: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(enable)
      __method_bind.setBusBypassEffects.call(self._handle, _args, null)
    }
  }

  fun setBusCount(amount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBusCount.call(self._handle, listOf(amount), null)
    }
  }

  fun setBusEffectEnabled(
    busIdx: Int,
    effectIdx: Int,
    enabled: Boolean
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(effectIdx)
      _args.add(enabled)
      __method_bind.setBusEffectEnabled.call(self._handle, _args, null)
    }
  }

  fun setBusLayout(busLayout: AudioBusLayout) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBusLayout.call(self._handle, listOf(busLayout), null)
    }
  }

  fun setBusMute(busIdx: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(enable)
      __method_bind.setBusMute.call(self._handle, _args, null)
    }
  }

  fun setBusName(busIdx: Int, name: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(name)
      __method_bind.setBusName.call(self._handle, _args, null)
    }
  }

  fun setBusSend(busIdx: Int, send: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(send)
      __method_bind.setBusSend.call(self._handle, _args, null)
    }
  }

  fun setBusSolo(busIdx: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(enable)
      __method_bind.setBusSolo.call(self._handle, _args, null)
    }
  }

  fun setBusVolumeDb(busIdx: Int, volumeDb: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(volumeDb)
      __method_bind.setBusVolumeDb.call(self._handle, _args, null)
    }
  }

  fun setDevice(device: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDevice.call(self._handle, listOf(device), null)
    }
  }

  fun setGlobalRateScale(scale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlobalRateScale.call(self._handle, listOf(scale), null)
    }
  }

  fun swapBusEffects(
    busIdx: Int,
    effectIdx: Int,
    byEffectIdx: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(busIdx)
      _args.add(effectIdx)
      _args.add(byEffectIdx)
      __method_bind.swapBusEffects.call(self._handle, _args, null)
    }
  }

  fun unlock() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.unlock.call(self._handle, emptyList(), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for AudioServer
     */
    private object __method_bind {
      val addBus: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "add_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_bus" }
            }
          }

      val addBusEffect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "add_bus_effect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_bus_effect" }
            }
          }

      val captureGetDevice: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "capture_get_device".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method capture_get_device" }
            }
          }

      val captureGetDeviceList: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "capture_get_device_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method capture_get_device_list" }
            }
          }

      val captureSetDevice: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "capture_set_device".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method capture_set_device" }
            }
          }

      val generateBusLayout: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "generate_bus_layout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method generate_bus_layout" }
            }
          }

      val getBusChannels: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_channels".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_channels" }
            }
          }

      val getBusCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_count" }
            }
          }

      val getBusEffect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_effect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_effect" }
            }
          }

      val getBusEffectCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_effect_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_effect_count" }
            }
          }

      val getBusEffectInstance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_effect_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_effect_instance" }
            }
          }

      val getBusIndex: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_index" }
            }
          }

      val getBusName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_name" }
            }
          }

      val getBusPeakVolumeLeftDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_peak_volume_left_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_peak_volume_left_db" }
            }
          }

      val getBusPeakVolumeRightDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_peak_volume_right_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_peak_volume_right_db" }
            }
          }

      val getBusSend: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_send".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_send" }
            }
          }

      val getBusVolumeDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_bus_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus_volume_db" }
            }
          }

      val getDevice: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_device".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_device" }
            }
          }

      val getDeviceList: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_device_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_device_list" }
            }
          }

      val getGlobalRateScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_global_rate_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_rate_scale" }
            }
          }

      val getMixRate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_mix_rate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mix_rate" }
            }
          }

      val getOutputLatency: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_output_latency".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_output_latency" }
            }
          }

      val getSpeakerMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_speaker_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_speaker_mode" }
            }
          }

      val getTimeSinceLastMix: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_time_since_last_mix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_time_since_last_mix" }
            }
          }

      val getTimeToNextMix: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "get_time_to_next_mix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_time_to_next_mix" }
            }
          }

      val isBusBypassingEffects: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "is_bus_bypassing_effects".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_bus_bypassing_effects" }
            }
          }

      val isBusEffectEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "is_bus_effect_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_bus_effect_enabled" }
            }
          }

      val isBusMute: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "is_bus_mute".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_bus_mute" }
            }
          }

      val isBusSolo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "is_bus_solo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_bus_solo" }
            }
          }

      val lock: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "lock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method lock" }
            }
          }

      val moveBus: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "move_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_bus" }
            }
          }

      val removeBus: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "remove_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_bus" }
            }
          }

      val removeBusEffect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "remove_bus_effect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_bus_effect" }
            }
          }

      val setBusBypassEffects: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_bypass_effects".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_bypass_effects" }
            }
          }

      val setBusCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_count" }
            }
          }

      val setBusEffectEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_effect_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_effect_enabled" }
            }
          }

      val setBusLayout: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_layout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_layout" }
            }
          }

      val setBusMute: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_mute".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_mute" }
            }
          }

      val setBusName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_name" }
            }
          }

      val setBusSend: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_send".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_send" }
            }
          }

      val setBusSolo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_solo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_solo" }
            }
          }

      val setBusVolumeDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_bus_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus_volume_db" }
            }
          }

      val setDevice: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_device".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_device" }
            }
          }

      val setGlobalRateScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "set_global_rate_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_global_rate_scale" }
            }
          }

      val swapBusEffects: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "swap_bus_effects".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method swap_bus_effects" }
            }
          }

      val unlock: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
              "unlock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unlock" }
            }
          }
    }
  }
}

object AudioServer : AudioServerInternal(null) {
  init {
    Allocator.allocationScope {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("AudioServer".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton AudioServer" }
      _handle = handle
    }
  }

  enum class SpeakerMode(
    val value: Int
  ) {
    STEREO(0),

    SURROUND_31(1),

    SURROUND_51(2),

    SURROUND_71(3);

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
}
