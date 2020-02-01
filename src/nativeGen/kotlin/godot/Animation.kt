// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolIntArray
import godot.core.Quat
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Animation(
  _handle: COpaquePointer
) : Resource(_handle) {
  var length: Float
    get() {
       return getLength() 
    }
    set(value) {
      setLength(value)
    }

  var loop: Boolean
    get() {
       return hasLoop() 
    }
    set(value) {
      setLoop(value)
    }

  var step: Float
    get() {
       return getStep() 
    }
    set(value) {
      setStep(value)
    }

  fun addTrack(type: Int, atPosition: Int = -1): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(atPosition))
    val _ret = __method_bind.addTrack.call(this._handle, _args)
    return _ret.asInt()
  }

  fun animationTrackGetKeyAnimation(trackIdx: Int, keyIdx: Int): String {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    val _ret = __method_bind.animationTrackGetKeyAnimation.call(this._handle, _args)
    return _ret.asString()
  }

  fun animationTrackInsertKey(
    trackIdx: Int,
    time: Float,
    animation: String
  ): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(time))
    _args.add(Variant.fromAny(animation))
    val _ret = __method_bind.animationTrackInsertKey.call(this._handle, _args)
    return _ret.asInt()
  }

  fun animationTrackSetKeyAnimation(
    trackIdx: Int,
    keyIdx: Int,
    animation: String
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    _args.add(Variant.fromAny(animation))
    __method_bind.animationTrackSetKeyAnimation.call(this._handle, _args)
  }

  fun audioTrackGetKeyEndOffset(trackIdx: Int, keyIdx: Int): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    val _ret = __method_bind.audioTrackGetKeyEndOffset.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun audioTrackGetKeyStartOffset(trackIdx: Int, keyIdx: Int): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    val _ret = __method_bind.audioTrackGetKeyStartOffset.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun audioTrackGetKeyStream(trackIdx: Int, keyIdx: Int): Resource {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    val _ret = __method_bind.audioTrackGetKeyStream.call(this._handle, _args)
    return _ret.asObject(::Resource)!!
  }

  fun audioTrackInsertKey(
    trackIdx: Int,
    time: Float,
    stream: Resource,
    startOffset: Float = 0.0f,
    endOffset: Float = 0.0f
  ): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(time))
    _args.add(Variant.fromAny(stream))
    _args.add(Variant.fromAny(startOffset))
    _args.add(Variant.fromAny(endOffset))
    val _ret = __method_bind.audioTrackInsertKey.call(this._handle, _args)
    return _ret.asInt()
  }

  fun audioTrackSetKeyEndOffset(
    trackIdx: Int,
    keyIdx: Int,
    offset: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    _args.add(Variant.fromAny(offset))
    __method_bind.audioTrackSetKeyEndOffset.call(this._handle, _args)
  }

  fun audioTrackSetKeyStartOffset(
    trackIdx: Int,
    keyIdx: Int,
    offset: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    _args.add(Variant.fromAny(offset))
    __method_bind.audioTrackSetKeyStartOffset.call(this._handle, _args)
  }

  fun audioTrackSetKeyStream(
    trackIdx: Int,
    keyIdx: Int,
    stream: Resource
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    _args.add(Variant.fromAny(stream))
    __method_bind.audioTrackSetKeyStream.call(this._handle, _args)
  }

  fun bezierTrackGetKeyInHandle(trackIdx: Int, keyIdx: Int): Vector2 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    val _ret = __method_bind.bezierTrackGetKeyInHandle.call(this._handle, _args)
    return _ret.asVector2()
  }

  fun bezierTrackGetKeyOutHandle(trackIdx: Int, keyIdx: Int): Vector2 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    val _ret = __method_bind.bezierTrackGetKeyOutHandle.call(this._handle, _args)
    return _ret.asVector2()
  }

  fun bezierTrackGetKeyValue(trackIdx: Int, keyIdx: Int): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    val _ret = __method_bind.bezierTrackGetKeyValue.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun bezierTrackInsertKey(
    trackIdx: Int,
    time: Float,
    value: Float,
    inHandle: Vector2 = Vector2.new(0, 0),
    outHandle: Vector2 = Vector2.new(0, 0)
  ): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(time))
    _args.add(Variant.fromAny(value))
    _args.add(Variant.fromAny(inHandle))
    _args.add(Variant.fromAny(outHandle))
    val _ret = __method_bind.bezierTrackInsertKey.call(this._handle, _args)
    return _ret.asInt()
  }

  fun bezierTrackInterpolate(trackIdx: Int, time: Float): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(time))
    val _ret = __method_bind.bezierTrackInterpolate.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun bezierTrackSetKeyInHandle(
    trackIdx: Int,
    keyIdx: Int,
    inHandle: Vector2
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    _args.add(Variant.fromAny(inHandle))
    __method_bind.bezierTrackSetKeyInHandle.call(this._handle, _args)
  }

  fun bezierTrackSetKeyOutHandle(
    trackIdx: Int,
    keyIdx: Int,
    outHandle: Vector2
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    _args.add(Variant.fromAny(outHandle))
    __method_bind.bezierTrackSetKeyOutHandle.call(this._handle, _args)
  }

  fun bezierTrackSetKeyValue(
    trackIdx: Int,
    keyIdx: Int,
    value: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    _args.add(Variant.fromAny(value))
    __method_bind.bezierTrackSetKeyValue.call(this._handle, _args)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun copyTrack(trackIdx: Int, toAnimation: Animation) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(toAnimation))
    __method_bind.copyTrack.call(this._handle, _args)
  }

  fun findTrack(path: NodePath): Int {
    val _arg = Variant.new(path)
    val _ret = __method_bind.findTrack.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getLength(): Float {
    val _ret = __method_bind.getLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getStep(): Float {
    val _ret = __method_bind.getStep.call(this._handle)
    return _ret.asFloat()
  }

  fun getTrackCount(): Int {
    val _ret = __method_bind.getTrackCount.call(this._handle)
    return _ret.asInt()
  }

  fun hasLoop(): Boolean {
    val _ret = __method_bind.hasLoop.call(this._handle)
    return _ret.asBoolean()
  }

  fun methodTrackGetKeyIndices(
    trackIdx: Int,
    timeSec: Float,
    delta: Float
  ): PoolIntArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(timeSec))
    _args.add(Variant.fromAny(delta))
    val _ret = __method_bind.methodTrackGetKeyIndices.call(this._handle, _args)
    return _ret.asPoolIntArray()
  }

  fun methodTrackGetName(trackIdx: Int, keyIdx: Int): String {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    val _ret = __method_bind.methodTrackGetName.call(this._handle, _args)
    return _ret.asString()
  }

  fun methodTrackGetParams(trackIdx: Int, keyIdx: Int): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    val _ret = __method_bind.methodTrackGetParams.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun removeTrack(trackIdx: Int) {
    val _arg = Variant.new(trackIdx)
    __method_bind.removeTrack.call(this._handle, listOf(_arg))
  }

  fun setLength(timeSec: Float) {
    val _arg = Variant.new(timeSec)
    __method_bind.setLength.call(this._handle, listOf(_arg))
  }

  fun setLoop(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setLoop.call(this._handle, listOf(_arg))
  }

  fun setStep(sizeSec: Float) {
    val _arg = Variant.new(sizeSec)
    __method_bind.setStep.call(this._handle, listOf(_arg))
  }

  fun trackFindKey(
    trackIdx: Int,
    time: Float,
    exact: Boolean = false
  ): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(time))
    _args.add(Variant.fromAny(exact))
    val _ret = __method_bind.trackFindKey.call(this._handle, _args)
    return _ret.asInt()
  }

  fun trackGetInterpolationLoopWrap(trackIdx: Int): Boolean {
    val _arg = Variant.new(trackIdx)
    val _ret = __method_bind.trackGetInterpolationLoopWrap.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun trackGetInterpolationType(trackIdx: Int): InterpolationType {
    val _arg = Variant.new(trackIdx)
    val _ret = __method_bind.trackGetInterpolationType.call(this._handle, listOf(_arg))
    return Animation.InterpolationType.from(_ret.asInt())
  }

  fun trackGetKeyCount(trackIdx: Int): Int {
    val _arg = Variant.new(trackIdx)
    val _ret = __method_bind.trackGetKeyCount.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun trackGetKeyTime(trackIdx: Int, keyIdx: Int): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    val _ret = __method_bind.trackGetKeyTime.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun trackGetKeyTransition(trackIdx: Int, keyIdx: Int): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    val _ret = __method_bind.trackGetKeyTransition.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun trackGetKeyValue(trackIdx: Int, keyIdx: Int): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    val _ret = __method_bind.trackGetKeyValue.call(this._handle, _args)
    return _ret
  }

  fun trackGetPath(trackIdx: Int): NodePath {
    val _arg = Variant.new(trackIdx)
    val _ret = __method_bind.trackGetPath.call(this._handle, listOf(_arg))
    return _ret.asNodePath()
  }

  fun trackGetType(trackIdx: Int): TrackType {
    val _arg = Variant.new(trackIdx)
    val _ret = __method_bind.trackGetType.call(this._handle, listOf(_arg))
    return Animation.TrackType.from(_ret.asInt())
  }

  fun trackInsertKey(
    trackIdx: Int,
    time: Float,
    key: Variant,
    transition: Float = 1.0f
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(time))
    _args.add(Variant.fromAny(key))
    _args.add(Variant.fromAny(transition))
    __method_bind.trackInsertKey.call(this._handle, _args)
  }

  fun trackIsEnabled(trackIdx: Int): Boolean {
    val _arg = Variant.new(trackIdx)
    val _ret = __method_bind.trackIsEnabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun trackIsImported(trackIdx: Int): Boolean {
    val _arg = Variant.new(trackIdx)
    val _ret = __method_bind.trackIsImported.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun trackMoveDown(trackIdx: Int) {
    val _arg = Variant.new(trackIdx)
    __method_bind.trackMoveDown.call(this._handle, listOf(_arg))
  }

  fun trackMoveTo(trackIdx: Int, toIdx: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(toIdx))
    __method_bind.trackMoveTo.call(this._handle, _args)
  }

  fun trackMoveUp(trackIdx: Int) {
    val _arg = Variant.new(trackIdx)
    __method_bind.trackMoveUp.call(this._handle, listOf(_arg))
  }

  fun trackRemoveKey(trackIdx: Int, keyIdx: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    __method_bind.trackRemoveKey.call(this._handle, _args)
  }

  fun trackRemoveKeyAtPosition(trackIdx: Int, position: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(position))
    __method_bind.trackRemoveKeyAtPosition.call(this._handle, _args)
  }

  fun trackSetEnabled(trackIdx: Int, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(enabled))
    __method_bind.trackSetEnabled.call(this._handle, _args)
  }

  fun trackSetImported(trackIdx: Int, imported: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(imported))
    __method_bind.trackSetImported.call(this._handle, _args)
  }

  fun trackSetInterpolationLoopWrap(trackIdx: Int, interpolation: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(interpolation))
    __method_bind.trackSetInterpolationLoopWrap.call(this._handle, _args)
  }

  fun trackSetInterpolationType(trackIdx: Int, interpolation: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(interpolation))
    __method_bind.trackSetInterpolationType.call(this._handle, _args)
  }

  fun trackSetKeyTime(
    trackIdx: Int,
    keyIdx: Int,
    time: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    _args.add(Variant.fromAny(time))
    __method_bind.trackSetKeyTime.call(this._handle, _args)
  }

  fun trackSetKeyTransition(
    trackIdx: Int,
    keyIdx: Int,
    transition: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(keyIdx))
    _args.add(Variant.fromAny(transition))
    __method_bind.trackSetKeyTransition.call(this._handle, _args)
  }

  fun trackSetKeyValue(
    trackIdx: Int,
    key: Int,
    value: Variant
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(key))
    _args.add(Variant.fromAny(value))
    __method_bind.trackSetKeyValue.call(this._handle, _args)
  }

  fun trackSetPath(trackIdx: Int, path: NodePath) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(path))
    __method_bind.trackSetPath.call(this._handle, _args)
  }

  fun trackSwap(trackIdx: Int, withIdx: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(withIdx))
    __method_bind.trackSwap.call(this._handle, _args)
  }

  fun transformTrackInsertKey(
    trackIdx: Int,
    time: Float,
    location: Vector3,
    rotation: Quat,
    scale: Vector3
  ): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(time))
    _args.add(Variant.fromAny(location))
    _args.add(Variant.fromAny(rotation))
    _args.add(Variant.fromAny(scale))
    val _ret = __method_bind.transformTrackInsertKey.call(this._handle, _args)
    return _ret.asInt()
  }

  fun transformTrackInterpolate(trackIdx: Int, timeSec: Float): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(timeSec))
    val _ret = __method_bind.transformTrackInterpolate.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun valueTrackGetKeyIndices(
    trackIdx: Int,
    timeSec: Float,
    delta: Float
  ): PoolIntArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(timeSec))
    _args.add(Variant.fromAny(delta))
    val _ret = __method_bind.valueTrackGetKeyIndices.call(this._handle, _args)
    return _ret.asPoolIntArray()
  }

  fun valueTrackGetUpdateMode(trackIdx: Int): UpdateMode {
    val _arg = Variant.new(trackIdx)
    val _ret = __method_bind.valueTrackGetUpdateMode.call(this._handle, listOf(_arg))
    return Animation.UpdateMode.from(_ret.asInt())
  }

  fun valueTrackSetUpdateMode(trackIdx: Int, mode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(trackIdx))
    _args.add(Variant.fromAny(mode))
    __method_bind.valueTrackSetUpdateMode.call(this._handle, _args)
  }

  enum class TrackType(
    val value: Int
  ) {
    TYPE_VALUE(0),

    TYPE_TRANSFORM(1),

    TYPE_METHOD(2),

    TYPE_BEZIER(3),

    TYPE_AUDIO(4),

    TYPE_ANIMATION(5);

    companion object {
      fun from(value: Int): TrackType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class UpdateMode(
    val value: Int
  ) {
    UPDATE_CONTINUOUS(0),

    UPDATE_DISCRETE(1),

    UPDATE_TRIGGER(2),

    UPDATE_CAPTURE(3);

    companion object {
      fun from(value: Int): UpdateMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class InterpolationType(
    val value: Int
  ) {
    INTERPOLATION_NEAREST(0),

    INTERPOLATION_LINEAR(1),

    INTERPOLATION_CUBIC(2);

    companion object {
      fun from(value: Int): InterpolationType {
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
    val INTERPOLATION_CUBIC: Int = 2

    val INTERPOLATION_LINEAR: Int = 1

    val INTERPOLATION_NEAREST: Int = 0

    val TYPE_ANIMATION: Int = 5

    val TYPE_AUDIO: Int = 4

    val TYPE_BEZIER: Int = 3

    val TYPE_METHOD: Int = 2

    val TYPE_TRANSFORM: Int = 1

    val TYPE_VALUE: Int = 0

    val UPDATE_CAPTURE: Int = 3

    val UPDATE_CONTINUOUS: Int = 0

    val UPDATE_DISCRETE: Int = 1

    val UPDATE_TRIGGER: Int = 2

    fun new(): Animation = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Animation".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Animation" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Animation(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Animation = Animation(ptr)
    /**
     * Container for method_bind pointers for Animation
     */
    private object __method_bind {
      val addTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "add_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_track" }
        }
      val animationTrackGetKeyAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "animation_track_get_key_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_track_get_key_animation"
            }
        }
      val animationTrackInsertKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "animation_track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_track_insert_key" }
        }
      val animationTrackSetKeyAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "animation_track_set_key_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_track_set_key_animation"
            }
        }
      val audioTrackGetKeyEndOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_get_key_end_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_get_key_end_offset" }
        }
      val audioTrackGetKeyStartOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_get_key_start_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_get_key_start_offset" }
        }
      val audioTrackGetKeyStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_get_key_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_get_key_stream" }
        }
      val audioTrackInsertKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_insert_key" }
        }
      val audioTrackSetKeyEndOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_set_key_end_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_set_key_end_offset" }
        }
      val audioTrackSetKeyStartOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_set_key_start_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_set_key_start_offset" }
        }
      val audioTrackSetKeyStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_set_key_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_set_key_stream" }
        }
      val bezierTrackGetKeyInHandle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_get_key_in_handle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_get_key_in_handle" }
        }
      val bezierTrackGetKeyOutHandle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_get_key_out_handle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_get_key_out_handle" }
        }
      val bezierTrackGetKeyValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_get_key_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_get_key_value" }
        }
      val bezierTrackInsertKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_insert_key" }
        }
      val bezierTrackInterpolate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_interpolate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_interpolate" }
        }
      val bezierTrackSetKeyInHandle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_set_key_in_handle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_set_key_in_handle" }
        }
      val bezierTrackSetKeyOutHandle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_set_key_out_handle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_set_key_out_handle" }
        }
      val bezierTrackSetKeyValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_set_key_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_set_key_value" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val copyTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "copy_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copy_track" }
        }
      val findTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "find_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_track" }
        }
      val getLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "get_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_length" }
        }
      val getStep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "get_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_step" }
        }
      val getTrackCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "get_track_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_track_count" }
        }
      val hasLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "has_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_loop" }
        }
      val methodTrackGetKeyIndices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "method_track_get_key_indices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method method_track_get_key_indices" }
        }
      val methodTrackGetName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "method_track_get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method method_track_get_name" }
        }
      val methodTrackGetParams: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "method_track_get_params".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method method_track_get_params" }
        }
      val removeTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "remove_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_track" }
        }
      val setLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "set_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_length" }
        }
      val setLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "set_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop" }
        }
      val setStep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "set_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_step" }
        }
      val trackFindKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_find_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_find_key" }
        }
      val trackGetInterpolationLoopWrap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_interpolation_loop_wrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_interpolation_loop_wrap"
            }
        }
      val trackGetInterpolationType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_interpolation_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_interpolation_type" }
        }
      val trackGetKeyCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_key_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_key_count" }
        }
      val trackGetKeyTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_key_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_key_time" }
        }
      val trackGetKeyTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_key_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_key_transition" }
        }
      val trackGetKeyValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_key_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_key_value" }
        }
      val trackGetPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_path" }
        }
      val trackGetType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_type" }
        }
      val trackInsertKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_insert_key" }
        }
      val trackIsEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_is_enabled" }
        }
      val trackIsImported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_is_imported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_is_imported" }
        }
      val trackMoveDown: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_move_down".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_move_down" }
        }
      val trackMoveTo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_move_to".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_move_to" }
        }
      val trackMoveUp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_move_up".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_move_up" }
        }
      val trackRemoveKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_remove_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_remove_key" }
        }
      val trackRemoveKeyAtPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_remove_key_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_remove_key_at_position" }
        }
      val trackSetEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_enabled" }
        }
      val trackSetImported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_imported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_imported" }
        }
      val trackSetInterpolationLoopWrap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_interpolation_loop_wrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_interpolation_loop_wrap"
            }
        }
      val trackSetInterpolationType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_interpolation_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_interpolation_type" }
        }
      val trackSetKeyTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_key_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_key_time" }
        }
      val trackSetKeyTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_key_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_key_transition" }
        }
      val trackSetKeyValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_key_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_key_value" }
        }
      val trackSetPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_path" }
        }
      val trackSwap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_swap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_swap" }
        }
      val transformTrackInsertKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "transform_track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transform_track_insert_key" }
        }
      val transformTrackInterpolate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "transform_track_interpolate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transform_track_interpolate" }
        }
      val valueTrackGetKeyIndices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "value_track_get_key_indices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method value_track_get_key_indices" }
        }
      val valueTrackGetUpdateMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "value_track_get_update_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method value_track_get_update_mode" }
        }
      val valueTrackSetUpdateMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "value_track_set_update_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method value_track_set_update_mode" }
        }}
  }
}
