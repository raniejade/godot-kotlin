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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Animation internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addTrack(type: Int, atPosition: Int): Int {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(atPosition)
    val _ret = __method_bind.add_track.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun animationTrackGetKeyAnimation(idx: Int, keyIdx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.animation_track_get_key_animation.call(this._handle, _args.toVariant(),
        2)
    return _ret.asString()
  }

  fun animationTrackInsertKey(
    track: Int,
    time: Float,
    animation: String
  ): Int {
    val _args = VariantArray.new()
    _args.append(track)
    _args.append(time)
    _args.append(animation)
    val _ret = __method_bind.animation_track_insert_key.call(this._handle, _args.toVariant(), 3)
    return _ret.asInt()
  }

  fun animationTrackSetKeyAnimation(
    idx: Int,
    keyIdx: Int,
    animation: String
  ) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    _args.append(animation)
    __method_bind.animation_track_set_key_animation.call(this._handle, _args.toVariant(), 3)
  }

  fun audioTrackGetKeyEndOffset(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.audio_track_get_key_end_offset.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun audioTrackGetKeyStartOffset(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.audio_track_get_key_start_offset.call(this._handle, _args.toVariant(),
        2)
    return _ret.asFloat()
  }

  fun audioTrackGetKeyStream(idx: Int, keyIdx: Int): Resource {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.audio_track_get_key_stream.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Resource)!!
  }

  fun audioTrackInsertKey(
    track: Int,
    time: Float,
    stream: Resource,
    startOffset: Float,
    endOffset: Float
  ): Int {
    val _args = VariantArray.new()
    _args.append(track)
    _args.append(time)
    _args.append(stream)
    _args.append(startOffset)
    _args.append(endOffset)
    val _ret = __method_bind.audio_track_insert_key.call(this._handle, _args.toVariant(), 5)
    return _ret.asInt()
  }

  fun audioTrackSetKeyEndOffset(
    idx: Int,
    keyIdx: Int,
    offset: Float
  ) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    _args.append(offset)
    __method_bind.audio_track_set_key_end_offset.call(this._handle, _args.toVariant(), 3)
  }

  fun audioTrackSetKeyStartOffset(
    idx: Int,
    keyIdx: Int,
    offset: Float
  ) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    _args.append(offset)
    __method_bind.audio_track_set_key_start_offset.call(this._handle, _args.toVariant(), 3)
  }

  fun audioTrackSetKeyStream(
    idx: Int,
    keyIdx: Int,
    stream: Resource
  ) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    _args.append(stream)
    __method_bind.audio_track_set_key_stream.call(this._handle, _args.toVariant(), 3)
  }

  fun bezierTrackGetKeyInHandle(idx: Int, keyIdx: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.bezier_track_get_key_in_handle.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun bezierTrackGetKeyOutHandle(idx: Int, keyIdx: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.bezier_track_get_key_out_handle.call(this._handle, _args.toVariant(),
        2)
    return _ret.asVector2()
  }

  fun bezierTrackGetKeyValue(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.bezier_track_get_key_value.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun bezierTrackInsertKey(
    track: Int,
    time: Float,
    value: Float,
    inHandle: Vector2,
    outHandle: Vector2
  ): Int {
    val _args = VariantArray.new()
    _args.append(track)
    _args.append(time)
    _args.append(value)
    _args.append(inHandle)
    _args.append(outHandle)
    val _ret = __method_bind.bezier_track_insert_key.call(this._handle, _args.toVariant(), 5)
    return _ret.asInt()
  }

  fun bezierTrackInterpolate(track: Int, time: Float): Float {
    val _args = VariantArray.new()
    _args.append(track)
    _args.append(time)
    val _ret = __method_bind.bezier_track_interpolate.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun bezierTrackSetKeyInHandle(
    idx: Int,
    keyIdx: Int,
    inHandle: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    _args.append(inHandle)
    __method_bind.bezier_track_set_key_in_handle.call(this._handle, _args.toVariant(), 3)
  }

  fun bezierTrackSetKeyOutHandle(
    idx: Int,
    keyIdx: Int,
    outHandle: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    _args.append(outHandle)
    __method_bind.bezier_track_set_key_out_handle.call(this._handle, _args.toVariant(), 3)
  }

  fun bezierTrackSetKeyValue(
    idx: Int,
    keyIdx: Int,
    value: Float
  ) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    _args.append(value)
    __method_bind.bezier_track_set_key_value.call(this._handle, _args.toVariant(), 3)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun copyTrack(track: Int, toAnimation: Animation) {
    val _args = VariantArray.new()
    _args.append(track)
    _args.append(toAnimation)
    __method_bind.copy_track.call(this._handle, _args.toVariant(), 2)
  }

  fun findTrack(path: NodePath): Int {
    val _arg = Variant.new(path)
    val _ret = __method_bind.find_track.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getLength(): Float {
    val _ret = __method_bind.get_length.call(this._handle)
    return _ret.asFloat()
  }

  fun getStep(): Float {
    val _ret = __method_bind.get_step.call(this._handle)
    return _ret.asFloat()
  }

  fun getTrackCount(): Int {
    val _ret = __method_bind.get_track_count.call(this._handle)
    return _ret.asInt()
  }

  fun hasLoop(): Boolean {
    val _ret = __method_bind.has_loop.call(this._handle)
    return _ret.asBool()
  }

  fun methodTrackGetKeyIndices(
    idx: Int,
    timeSec: Float,
    delta: Float
  ): PoolIntArray {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(timeSec)
    _args.append(delta)
    val _ret = __method_bind.method_track_get_key_indices.call(this._handle, _args.toVariant(), 3)
    return _ret.asPoolIntArray()
  }

  fun methodTrackGetName(idx: Int, keyIdx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.method_track_get_name.call(this._handle, _args.toVariant(), 2)
    return _ret.asString()
  }

  fun methodTrackGetParams(idx: Int, keyIdx: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.method_track_get_params.call(this._handle, _args.toVariant(), 2)
    return _ret.asArray()
  }

  fun removeTrack(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.remove_track.call(this._handle, _arg, 1)
  }

  fun setLength(timeSec: Float) {
    val _arg = Variant.new(timeSec)
    __method_bind.set_length.call(this._handle, _arg, 1)
  }

  fun setLoop(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_loop.call(this._handle, _arg, 1)
  }

  fun setStep(sizeSec: Float) {
    val _arg = Variant.new(sizeSec)
    __method_bind.set_step.call(this._handle, _arg, 1)
  }

  fun trackFindKey(
    idx: Int,
    time: Float,
    exact: Boolean
  ): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(time)
    _args.append(exact)
    val _ret = __method_bind.track_find_key.call(this._handle, _args.toVariant(), 3)
    return _ret.asInt()
  }

  fun trackGetInterpolationLoopWrap(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.track_get_interpolation_loop_wrap.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun trackGetInterpolationType(idx: Int): InterpolationType {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.track_get_interpolation_type.call(this._handle, _arg, 1)
    return Animation.InterpolationType.from(_ret.asInt())
  }

  fun trackGetKeyCount(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.track_get_key_count.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun trackGetKeyTime(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.track_get_key_time.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun trackGetKeyTransition(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.track_get_key_transition.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun trackGetKeyValue(idx: Int, keyIdx: Int): Variant {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.track_get_key_value.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun trackGetPath(idx: Int): NodePath {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.track_get_path.call(this._handle, _arg, 1)
    return _ret.asNodePath()
  }

  fun trackGetType(idx: Int): TrackType {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.track_get_type.call(this._handle, _arg, 1)
    return Animation.TrackType.from(_ret.asInt())
  }

  fun trackInsertKey(
    idx: Int,
    time: Float,
    key: Variant,
    transition: Float
  ) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(time)
    _args.append(key)
    _args.append(transition)
    __method_bind.track_insert_key.call(this._handle, _args.toVariant(), 4)
  }

  fun trackIsEnabled(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.track_is_enabled.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun trackIsImported(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.track_is_imported.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun trackMoveDown(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.track_move_down.call(this._handle, _arg, 1)
  }

  fun trackMoveTo(idx: Int, toIdx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(toIdx)
    __method_bind.track_move_to.call(this._handle, _args.toVariant(), 2)
  }

  fun trackMoveUp(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.track_move_up.call(this._handle, _arg, 1)
  }

  fun trackRemoveKey(idx: Int, keyIdx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    __method_bind.track_remove_key.call(this._handle, _args.toVariant(), 2)
  }

  fun trackRemoveKeyAtPosition(idx: Int, position: Float) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(position)
    __method_bind.track_remove_key_at_position.call(this._handle, _args.toVariant(), 2)
  }

  fun trackSetEnabled(idx: Int, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(enabled)
    __method_bind.track_set_enabled.call(this._handle, _args.toVariant(), 2)
  }

  fun trackSetImported(idx: Int, imported: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(imported)
    __method_bind.track_set_imported.call(this._handle, _args.toVariant(), 2)
  }

  fun trackSetInterpolationLoopWrap(idx: Int, interpolation: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(interpolation)
    __method_bind.track_set_interpolation_loop_wrap.call(this._handle, _args.toVariant(), 2)
  }

  fun trackSetInterpolationType(idx: Int, interpolation: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(interpolation)
    __method_bind.track_set_interpolation_type.call(this._handle, _args.toVariant(), 2)
  }

  fun trackSetKeyTime(
    idx: Int,
    keyIdx: Int,
    time: Float
  ) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    _args.append(time)
    __method_bind.track_set_key_time.call(this._handle, _args.toVariant(), 3)
  }

  fun trackSetKeyTransition(
    idx: Int,
    keyIdx: Int,
    transition: Float
  ) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    _args.append(transition)
    __method_bind.track_set_key_transition.call(this._handle, _args.toVariant(), 3)
  }

  fun trackSetKeyValue(
    idx: Int,
    key: Int,
    value: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(key)
    _args.append(value)
    __method_bind.track_set_key_value.call(this._handle, _args.toVariant(), 3)
  }

  fun trackSetPath(idx: Int, path: NodePath) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(path)
    __method_bind.track_set_path.call(this._handle, _args.toVariant(), 2)
  }

  fun trackSwap(idx: Int, withIdx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(withIdx)
    __method_bind.track_swap.call(this._handle, _args.toVariant(), 2)
  }

  fun transformTrackInsertKey(
    idx: Int,
    time: Float,
    location: Vector3,
    rotation: Quat,
    scale: Vector3
  ): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(time)
    _args.append(location)
    _args.append(rotation)
    _args.append(scale)
    val _ret = __method_bind.transform_track_insert_key.call(this._handle, _args.toVariant(), 5)
    return _ret.asInt()
  }

  fun transformTrackInterpolate(idx: Int, timeSec: Float): VariantArray {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(timeSec)
    val _ret = __method_bind.transform_track_interpolate.call(this._handle, _args.toVariant(), 2)
    return _ret.asArray()
  }

  fun valueTrackGetKeyIndices(
    idx: Int,
    timeSec: Float,
    delta: Float
  ): PoolIntArray {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(timeSec)
    _args.append(delta)
    val _ret = __method_bind.value_track_get_key_indices.call(this._handle, _args.toVariant(), 3)
    return _ret.asPoolIntArray()
  }

  fun valueTrackGetUpdateMode(idx: Int): UpdateMode {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.value_track_get_update_mode.call(this._handle, _arg, 1)
    return Animation.UpdateMode.from(_ret.asInt())
  }

  fun valueTrackSetUpdateMode(idx: Int, mode: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(mode)
    __method_bind.value_track_set_update_mode.call(this._handle, _args.toVariant(), 2)
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
      val add_track: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "add_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_track" }
        }
      val animation_track_get_key_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "animation_track_get_key_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_track_get_key_animation"
            }
        }
      val animation_track_insert_key: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "animation_track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_track_insert_key" }
        }
      val animation_track_set_key_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "animation_track_set_key_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_track_set_key_animation"
            }
        }
      val audio_track_get_key_end_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_get_key_end_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_get_key_end_offset" }
        }
      val audio_track_get_key_start_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_get_key_start_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_get_key_start_offset" }
        }
      val audio_track_get_key_stream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_get_key_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_get_key_stream" }
        }
      val audio_track_insert_key: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_insert_key" }
        }
      val audio_track_set_key_end_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_set_key_end_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_set_key_end_offset" }
        }
      val audio_track_set_key_start_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_set_key_start_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_set_key_start_offset" }
        }
      val audio_track_set_key_stream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_set_key_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_set_key_stream" }
        }
      val bezier_track_get_key_in_handle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_get_key_in_handle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_get_key_in_handle" }
        }
      val bezier_track_get_key_out_handle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_get_key_out_handle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_get_key_out_handle" }
        }
      val bezier_track_get_key_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_get_key_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_get_key_value" }
        }
      val bezier_track_insert_key: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_insert_key" }
        }
      val bezier_track_interpolate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_interpolate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_interpolate" }
        }
      val bezier_track_set_key_in_handle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_set_key_in_handle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_set_key_in_handle" }
        }
      val bezier_track_set_key_out_handle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_set_key_out_handle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_set_key_out_handle" }
        }
      val bezier_track_set_key_value: CPointer<godot_method_bind>
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
      val copy_track: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "copy_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copy_track" }
        }
      val find_track: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "find_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_track" }
        }
      val get_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "get_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_length" }
        }
      val get_step: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "get_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_step" }
        }
      val get_track_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "get_track_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_track_count" }
        }
      val has_loop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "has_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_loop" }
        }
      val method_track_get_key_indices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "method_track_get_key_indices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method method_track_get_key_indices" }
        }
      val method_track_get_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "method_track_get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method method_track_get_name" }
        }
      val method_track_get_params: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "method_track_get_params".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method method_track_get_params" }
        }
      val remove_track: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "remove_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_track" }
        }
      val set_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "set_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_length" }
        }
      val set_loop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "set_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop" }
        }
      val set_step: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "set_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_step" }
        }
      val track_find_key: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_find_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_find_key" }
        }
      val track_get_interpolation_loop_wrap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_interpolation_loop_wrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_interpolation_loop_wrap"
            }
        }
      val track_get_interpolation_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_interpolation_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_interpolation_type" }
        }
      val track_get_key_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_key_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_key_count" }
        }
      val track_get_key_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_key_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_key_time" }
        }
      val track_get_key_transition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_key_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_key_transition" }
        }
      val track_get_key_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_key_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_key_value" }
        }
      val track_get_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_path" }
        }
      val track_get_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_type" }
        }
      val track_insert_key: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_insert_key" }
        }
      val track_is_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_is_enabled" }
        }
      val track_is_imported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_is_imported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_is_imported" }
        }
      val track_move_down: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_move_down".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_move_down" }
        }
      val track_move_to: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_move_to".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_move_to" }
        }
      val track_move_up: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_move_up".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_move_up" }
        }
      val track_remove_key: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_remove_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_remove_key" }
        }
      val track_remove_key_at_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_remove_key_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_remove_key_at_position" }
        }
      val track_set_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_enabled" }
        }
      val track_set_imported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_imported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_imported" }
        }
      val track_set_interpolation_loop_wrap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_interpolation_loop_wrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_interpolation_loop_wrap"
            }
        }
      val track_set_interpolation_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_interpolation_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_interpolation_type" }
        }
      val track_set_key_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_key_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_key_time" }
        }
      val track_set_key_transition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_key_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_key_transition" }
        }
      val track_set_key_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_key_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_key_value" }
        }
      val track_set_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_path" }
        }
      val track_swap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_swap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_swap" }
        }
      val transform_track_insert_key: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "transform_track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transform_track_insert_key" }
        }
      val transform_track_interpolate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "transform_track_interpolate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transform_track_interpolate" }
        }
      val value_track_get_key_indices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "value_track_get_key_indices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method value_track_get_key_indices" }
        }
      val value_track_get_update_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "value_track_get_update_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method value_track_get_update_mode" }
        }
      val value_track_set_update_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "value_track_set_update_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method value_track_set_update_mode" }
        }}
  }
}
