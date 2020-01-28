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

open class AudioServer(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addBus(atPosition: Int) {
    val _arg = Variant.new(atPosition)
    __method_bind.addBus.call(this._handle, _arg, 1)
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
    __method_bind.addBusEffect.call(this._handle, _args.toVariant(), 3)
  }

  fun captureGetDevice(): String {
    val _ret = __method_bind.captureGetDevice.call(this._handle)
    return _ret.asString()
  }

  fun captureGetDeviceList(): VariantArray {
    val _ret = __method_bind.captureGetDeviceList.call(this._handle)
    return _ret.asVariantArray()
  }

  fun captureSetDevice(name: String) {
    val _arg = Variant.new(name)
    __method_bind.captureSetDevice.call(this._handle, _arg, 1)
  }

  fun generateBusLayout(): AudioBusLayout {
    val _ret = __method_bind.generateBusLayout.call(this._handle)
    return _ret.asObject(::AudioBusLayout)!!
  }

  fun getBusChannels(busIdx: Int): Int {
    val _arg = Variant.new(busIdx)
    val _ret = __method_bind.getBusChannels.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getBusCount(): Int {
    val _ret = __method_bind.getBusCount.call(this._handle)
    return _ret.asInt()
  }

  fun getBusEffect(busIdx: Int, effectIdx: Int): AudioEffect {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(effectIdx)
    val _ret = __method_bind.getBusEffect.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::AudioEffect)!!
  }

  fun getBusEffectCount(busIdx: Int): Int {
    val _arg = Variant.new(busIdx)
    val _ret = __method_bind.getBusEffectCount.call(this._handle, _arg, 1)
    return _ret.asInt()
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
    val _ret = __method_bind.getBusEffectInstance.call(this._handle, _args.toVariant(), 3)
    return _ret.asObject(::AudioEffectInstance)!!
  }

  fun getBusIndex(busName: String): Int {
    val _arg = Variant.new(busName)
    val _ret = __method_bind.getBusIndex.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getBusName(busIdx: Int): String {
    val _arg = Variant.new(busIdx)
    val _ret = __method_bind.getBusName.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getBusPeakVolumeLeftDb(busIdx: Int, channel: Int): Float {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(channel)
    val _ret = __method_bind.getBusPeakVolumeLeftDb.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun getBusPeakVolumeRightDb(busIdx: Int, channel: Int): Float {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(channel)
    val _ret = __method_bind.getBusPeakVolumeRightDb.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun getBusSend(busIdx: Int): String {
    val _arg = Variant.new(busIdx)
    val _ret = __method_bind.getBusSend.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getBusVolumeDb(busIdx: Int): Float {
    val _arg = Variant.new(busIdx)
    val _ret = __method_bind.getBusVolumeDb.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getDevice(): String {
    val _ret = __method_bind.getDevice.call(this._handle)
    return _ret.asString()
  }

  fun getDeviceList(): VariantArray {
    val _ret = __method_bind.getDeviceList.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getMixRate(): Float {
    val _ret = __method_bind.getMixRate.call(this._handle)
    return _ret.asFloat()
  }

  fun getOutputLatency(): Float {
    val _ret = __method_bind.getOutputLatency.call(this._handle)
    return _ret.asFloat()
  }

  fun getSpeakerMode(): SpeakerMode {
    val _ret = __method_bind.getSpeakerMode.call(this._handle)
    return AudioServer.SpeakerMode.from(_ret.asInt())
  }

  fun getTimeSinceLastMix(): Float {
    val _ret = __method_bind.getTimeSinceLastMix.call(this._handle)
    return _ret.asFloat()
  }

  fun getTimeToNextMix(): Float {
    val _ret = __method_bind.getTimeToNextMix.call(this._handle)
    return _ret.asFloat()
  }

  fun isBusBypassingEffects(busIdx: Int): Boolean {
    val _arg = Variant.new(busIdx)
    val _ret = __method_bind.isBusBypassingEffects.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isBusEffectEnabled(busIdx: Int, effectIdx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(effectIdx)
    val _ret = __method_bind.isBusEffectEnabled.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun isBusMute(busIdx: Int): Boolean {
    val _arg = Variant.new(busIdx)
    val _ret = __method_bind.isBusMute.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isBusSolo(busIdx: Int): Boolean {
    val _arg = Variant.new(busIdx)
    val _ret = __method_bind.isBusSolo.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun lock() {
    __method_bind.lock.call(this._handle)
  }

  fun moveBus(index: Int, toIndex: Int) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(toIndex)
    __method_bind.moveBus.call(this._handle, _args.toVariant(), 2)
  }

  fun removeBus(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.removeBus.call(this._handle, _arg, 1)
  }

  fun removeBusEffect(busIdx: Int, effectIdx: Int) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(effectIdx)
    __method_bind.removeBusEffect.call(this._handle, _args.toVariant(), 2)
  }

  fun setBusBypassEffects(busIdx: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(enable)
    __method_bind.setBusBypassEffects.call(this._handle, _args.toVariant(), 2)
  }

  fun setBusCount(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setBusCount.call(this._handle, _arg, 1)
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
    __method_bind.setBusEffectEnabled.call(this._handle, _args.toVariant(), 3)
  }

  fun setBusLayout(busLayout: AudioBusLayout) {
    val _arg = Variant.new(busLayout)
    __method_bind.setBusLayout.call(this._handle, _arg, 1)
  }

  fun setBusMute(busIdx: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(enable)
    __method_bind.setBusMute.call(this._handle, _args.toVariant(), 2)
  }

  fun setBusName(busIdx: Int, name: String) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(name)
    __method_bind.setBusName.call(this._handle, _args.toVariant(), 2)
  }

  fun setBusSend(busIdx: Int, send: String) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(send)
    __method_bind.setBusSend.call(this._handle, _args.toVariant(), 2)
  }

  fun setBusSolo(busIdx: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(enable)
    __method_bind.setBusSolo.call(this._handle, _args.toVariant(), 2)
  }

  fun setBusVolumeDb(busIdx: Int, volumeDb: Float) {
    val _args = VariantArray.new()
    _args.append(busIdx)
    _args.append(volumeDb)
    __method_bind.setBusVolumeDb.call(this._handle, _args.toVariant(), 2)
  }

  fun setDevice(device: String) {
    val _arg = Variant.new(device)
    __method_bind.setDevice.call(this._handle, _arg, 1)
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
    __method_bind.swapBusEffects.call(this._handle, _args.toVariant(), 3)
  }

  fun unlock() {
    __method_bind.unlock.call(this._handle)
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
    val Instance: AudioServer
      get() = memScoped {
        val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("AudioServer".cstr.ptr)
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
      val addBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "addBus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addBus" }
        }
      val addBusEffect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "addBusEffect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addBusEffect" }
        }
      val captureGetDevice: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "captureGetDevice".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method captureGetDevice" }
        }
      val captureGetDeviceList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "captureGetDeviceList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method captureGetDeviceList" }
        }
      val captureSetDevice: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "captureSetDevice".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method captureSetDevice" }
        }
      val generateBusLayout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "generateBusLayout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generateBusLayout" }
        }
      val getBusChannels: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getBusChannels".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBusChannels" }
        }
      val getBusCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getBusCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBusCount" }
        }
      val getBusEffect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getBusEffect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBusEffect" }
        }
      val getBusEffectCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getBusEffectCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBusEffectCount" }
        }
      val getBusEffectInstance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getBusEffectInstance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBusEffectInstance" }
        }
      val getBusIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getBusIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBusIndex" }
        }
      val getBusName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getBusName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBusName" }
        }
      val getBusPeakVolumeLeftDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getBusPeakVolumeLeftDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBusPeakVolumeLeftDb" }
        }
      val getBusPeakVolumeRightDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getBusPeakVolumeRightDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBusPeakVolumeRightDb" }
        }
      val getBusSend: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getBusSend".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBusSend" }
        }
      val getBusVolumeDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getBusVolumeDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBusVolumeDb" }
        }
      val getDevice: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getDevice".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDevice" }
        }
      val getDeviceList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getDeviceList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDeviceList" }
        }
      val getMixRate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getMixRate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMixRate" }
        }
      val getOutputLatency: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getOutputLatency".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOutputLatency" }
        }
      val getSpeakerMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getSpeakerMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpeakerMode" }
        }
      val getTimeSinceLastMix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getTimeSinceLastMix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTimeSinceLastMix" }
        }
      val getTimeToNextMix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "getTimeToNextMix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTimeToNextMix" }
        }
      val isBusBypassingEffects: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "isBusBypassingEffects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isBusBypassingEffects" }
        }
      val isBusEffectEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "isBusEffectEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isBusEffectEnabled" }
        }
      val isBusMute: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "isBusMute".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isBusMute" }
        }
      val isBusSolo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "isBusSolo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isBusSolo" }
        }
      val lock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "lock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lock" }
        }
      val moveBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "moveBus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveBus" }
        }
      val removeBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "removeBus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeBus" }
        }
      val removeBusEffect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "removeBusEffect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeBusEffect" }
        }
      val setBusBypassEffects: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "setBusBypassEffects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBusBypassEffects" }
        }
      val setBusCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "setBusCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBusCount" }
        }
      val setBusEffectEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "setBusEffectEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBusEffectEnabled" }
        }
      val setBusLayout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "setBusLayout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBusLayout" }
        }
      val setBusMute: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "setBusMute".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBusMute" }
        }
      val setBusName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "setBusName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBusName" }
        }
      val setBusSend: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "setBusSend".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBusSend" }
        }
      val setBusSolo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "setBusSolo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBusSolo" }
        }
      val setBusVolumeDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "setBusVolumeDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBusVolumeDb" }
        }
      val setDevice: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "setDevice".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDevice" }
        }
      val swapBusEffects: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "swapBusEffects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method swapBusEffects" }
        }
      val unlock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioServer".cstr.ptr,
            "unlock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unlock" }
        }}
  }
}
