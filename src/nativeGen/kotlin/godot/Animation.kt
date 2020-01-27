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
    val _ret = __method_bind.add_track.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun animationTrackGetKeyAnimation(idx: Int, keyIdx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.animation_track_get_key_animation.call(this.toVariant(),
        _args.toVariant(), 2)
    TODO()
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
    val _ret = __method_bind.animation_track_insert_key.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
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
    val _ret = __method_bind.animation_track_set_key_animation.call(this.toVariant(),
        _args.toVariant(), 3)
    TODO()
  }

  fun audioTrackGetKeyEndOffset(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.audio_track_get_key_end_offset.call(this.toVariant(),
        _args.toVariant(), 2)
    TODO()
  }

  fun audioTrackGetKeyStartOffset(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.audio_track_get_key_start_offset.call(this.toVariant(),
        _args.toVariant(), 2)
    TODO()
  }

  fun audioTrackGetKeyStream(idx: Int, keyIdx: Int): Resource {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.audio_track_get_key_stream.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
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
    val _ret = __method_bind.audio_track_insert_key.call(this.toVariant(), _args.toVariant(), 5)
    TODO()
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
    val _ret = __method_bind.audio_track_set_key_end_offset.call(this.toVariant(),
        _args.toVariant(), 3)
    TODO()
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
    val _ret = __method_bind.audio_track_set_key_start_offset.call(this.toVariant(),
        _args.toVariant(), 3)
    TODO()
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
    val _ret = __method_bind.audio_track_set_key_stream.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun bezierTrackGetKeyInHandle(idx: Int, keyIdx: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.bezier_track_get_key_in_handle.call(this.toVariant(),
        _args.toVariant(), 2)
    TODO()
  }

  fun bezierTrackGetKeyOutHandle(idx: Int, keyIdx: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.bezier_track_get_key_out_handle.call(this.toVariant(),
        _args.toVariant(), 2)
    TODO()
  }

  fun bezierTrackGetKeyValue(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.bezier_track_get_key_value.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
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
    val _ret = __method_bind.bezier_track_insert_key.call(this.toVariant(), _args.toVariant(), 5)
    TODO()
  }

  fun bezierTrackInterpolate(track: Int, time: Float): Float {
    val _args = VariantArray.new()
    _args.append(track)
    _args.append(time)
    val _ret = __method_bind.bezier_track_interpolate.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
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
    val _ret = __method_bind.bezier_track_set_key_in_handle.call(this.toVariant(),
        _args.toVariant(), 3)
    TODO()
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
    val _ret = __method_bind.bezier_track_set_key_out_handle.call(this.toVariant(),
        _args.toVariant(), 3)
    TODO()
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
    val _ret = __method_bind.bezier_track_set_key_value.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun clear() {
    val _ret = __method_bind.clear.call(this.toVariant())
    TODO()
  }

  fun copyTrack(track: Int, toAnimation: Animation) {
    val _args = VariantArray.new()
    _args.append(track)
    _args.append(toAnimation)
    val _ret = __method_bind.copy_track.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun findTrack(path: NodePath): Int {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.find_track.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getLength(): Float {
    val _ret = __method_bind.get_length.call(this.toVariant())
    TODO()
  }

  fun getStep(): Float {
    val _ret = __method_bind.get_step.call(this.toVariant())
    TODO()
  }

  fun getTrackCount(): Int {
    val _ret = __method_bind.get_track_count.call(this.toVariant())
    TODO()
  }

  fun hasLoop(): Boolean {
    val _ret = __method_bind.has_loop.call(this.toVariant())
    TODO()
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
    val _ret = __method_bind.method_track_get_key_indices.call(this.toVariant(), _args.toVariant(),
        3)
    TODO()
  }

  fun methodTrackGetName(idx: Int, keyIdx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.method_track_get_name.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun methodTrackGetParams(idx: Int, keyIdx: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.method_track_get_params.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun removeTrack(idx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.remove_track.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setLength(timeSec: Float) {
    val _args = VariantArray.new()
    _args.append(timeSec)
    val _ret = __method_bind.set_length.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setLoop(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_loop.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setStep(sizeSec: Float) {
    val _args = VariantArray.new()
    _args.append(sizeSec)
    val _ret = __method_bind.set_step.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
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
    val _ret = __method_bind.track_find_key.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun trackGetInterpolationLoopWrap(idx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.track_get_interpolation_loop_wrap.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun trackGetInterpolationType(idx: Int): InterpolationType {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.track_get_interpolation_type.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun trackGetKeyCount(idx: Int): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.track_get_key_count.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun trackGetKeyTime(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.track_get_key_time.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun trackGetKeyTransition(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.track_get_key_transition.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun trackGetKeyValue(idx: Int, keyIdx: Int): Variant {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.track_get_key_value.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun trackGetPath(idx: Int): NodePath {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.track_get_path.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun trackGetType(idx: Int): TrackType {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.track_get_type.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
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
    val _ret = __method_bind.track_insert_key.call(this.toVariant(), _args.toVariant(), 4)
    TODO()
  }

  fun trackIsEnabled(idx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.track_is_enabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun trackIsImported(idx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.track_is_imported.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun trackMoveDown(idx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.track_move_down.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun trackMoveTo(idx: Int, toIdx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(toIdx)
    val _ret = __method_bind.track_move_to.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun trackMoveUp(idx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.track_move_up.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun trackRemoveKey(idx: Int, keyIdx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.track_remove_key.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun trackRemoveKeyAtPosition(idx: Int, position: Float) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(position)
    val _ret = __method_bind.track_remove_key_at_position.call(this.toVariant(), _args.toVariant(),
        2)
    TODO()
  }

  fun trackSetEnabled(idx: Int, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(enabled)
    val _ret = __method_bind.track_set_enabled.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun trackSetImported(idx: Int, imported: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(imported)
    val _ret = __method_bind.track_set_imported.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun trackSetInterpolationLoopWrap(idx: Int, interpolation: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(interpolation)
    val _ret = __method_bind.track_set_interpolation_loop_wrap.call(this.toVariant(),
        _args.toVariant(), 2)
    TODO()
  }

  fun trackSetInterpolationType(idx: Int, interpolation: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(interpolation)
    val _ret = __method_bind.track_set_interpolation_type.call(this.toVariant(), _args.toVariant(),
        2)
    TODO()
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
    val _ret = __method_bind.track_set_key_time.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
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
    val _ret = __method_bind.track_set_key_transition.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
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
    val _ret = __method_bind.track_set_key_value.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun trackSetPath(idx: Int, path: NodePath) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(path)
    val _ret = __method_bind.track_set_path.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun trackSwap(idx: Int, withIdx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(withIdx)
    val _ret = __method_bind.track_swap.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
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
    val _ret = __method_bind.transform_track_insert_key.call(this.toVariant(), _args.toVariant(), 5)
    TODO()
  }

  fun transformTrackInterpolate(idx: Int, timeSec: Float): VariantArray {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(timeSec)
    val _ret = __method_bind.transform_track_interpolate.call(this.toVariant(), _args.toVariant(),
        2)
    TODO()
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
    val _ret = __method_bind.value_track_get_key_indices.call(this.toVariant(), _args.toVariant(),
        3)
    TODO()
  }

  fun valueTrackGetUpdateMode(idx: Int): UpdateMode {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.value_track_get_update_mode.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun valueTrackSetUpdateMode(idx: Int, mode: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(mode)
    val _ret = __method_bind.value_track_set_update_mode.call(this.toVariant(), _args.toVariant(),
        2)
    TODO()
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
      requireNotNull(fnPtr) { "No instance found for singleton Animation" }
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
      val add_track: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "add_track".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_track" }
            }
          }

      val animation_track_get_key_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "animation_track_get_key_animation".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method animation_track_get_key_animation" }
            }
          }

      val animation_track_insert_key: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "animation_track_insert_key".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method animation_track_insert_key" }
            }
          }

      val animation_track_set_key_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "animation_track_set_key_animation".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method animation_track_set_key_animation" }
            }
          }

      val audio_track_get_key_end_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "audio_track_get_key_end_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method audio_track_get_key_end_offset"
              }
            }
          }

      val audio_track_get_key_start_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "audio_track_get_key_start_offset".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method audio_track_get_key_start_offset" }
            }
          }

      val audio_track_get_key_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "audio_track_get_key_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method audio_track_get_key_stream" }
            }
          }

      val audio_track_insert_key: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "audio_track_insert_key".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method audio_track_insert_key" }
            }
          }

      val audio_track_set_key_end_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "audio_track_set_key_end_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method audio_track_set_key_end_offset"
              }
            }
          }

      val audio_track_set_key_start_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "audio_track_set_key_start_offset".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method audio_track_set_key_start_offset" }
            }
          }

      val audio_track_set_key_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "audio_track_set_key_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method audio_track_set_key_stream" }
            }
          }

      val bezier_track_get_key_in_handle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "bezier_track_get_key_in_handle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method bezier_track_get_key_in_handle"
              }
            }
          }

      val bezier_track_get_key_out_handle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "bezier_track_get_key_out_handle".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method bezier_track_get_key_out_handle" }
            }
          }

      val bezier_track_get_key_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "bezier_track_get_key_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method bezier_track_get_key_value" }
            }
          }

      val bezier_track_insert_key: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "bezier_track_insert_key".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method bezier_track_insert_key" }
            }
          }

      val bezier_track_interpolate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "bezier_track_interpolate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method bezier_track_interpolate" }
            }
          }

      val bezier_track_set_key_in_handle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "bezier_track_set_key_in_handle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method bezier_track_set_key_in_handle"
              }
            }
          }

      val bezier_track_set_key_out_handle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "bezier_track_set_key_out_handle".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method bezier_track_set_key_out_handle" }
            }
          }

      val bezier_track_set_key_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "bezier_track_set_key_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method bezier_track_set_key_value" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val copy_track: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "copy_track".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method copy_track" }
            }
          }

      val find_track: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "find_track".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_track" }
            }
          }

      val get_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "get_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_length" }
            }
          }

      val get_step: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "get_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_step" }
            }
          }

      val get_track_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "get_track_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_track_count" }
            }
          }

      val has_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "has_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_loop" }
            }
          }

      val method_track_get_key_indices: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "method_track_get_key_indices".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method method_track_get_key_indices" }
            }
          }

      val method_track_get_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "method_track_get_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method method_track_get_name" }
            }
          }

      val method_track_get_params: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "method_track_get_params".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method method_track_get_params" }
            }
          }

      val remove_track: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "remove_track".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_track" }
            }
          }

      val set_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "set_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_length" }
            }
          }

      val set_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "set_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_loop" }
            }
          }

      val set_step: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "set_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_step" }
            }
          }

      val track_find_key: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_find_key".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_find_key" }
            }
          }

      val track_get_interpolation_loop_wrap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_get_interpolation_loop_wrap".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method track_get_interpolation_loop_wrap" }
            }
          }

      val track_get_interpolation_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_get_interpolation_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_get_interpolation_type" }
            }
          }

      val track_get_key_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_get_key_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_get_key_count" }
            }
          }

      val track_get_key_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_get_key_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_get_key_time" }
            }
          }

      val track_get_key_transition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_get_key_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_get_key_transition" }
            }
          }

      val track_get_key_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_get_key_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_get_key_value" }
            }
          }

      val track_get_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_get_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_get_path" }
            }
          }

      val track_get_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_get_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_get_type" }
            }
          }

      val track_insert_key: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_insert_key".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_insert_key" }
            }
          }

      val track_is_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_is_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_is_enabled" }
            }
          }

      val track_is_imported: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_is_imported".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_is_imported" }
            }
          }

      val track_move_down: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_move_down".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_move_down" }
            }
          }

      val track_move_to: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_move_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_move_to" }
            }
          }

      val track_move_up: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_move_up".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_move_up" }
            }
          }

      val track_remove_key: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_remove_key".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_remove_key" }
            }
          }

      val track_remove_key_at_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_remove_key_at_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_remove_key_at_position" }
            }
          }

      val track_set_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_set_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_set_enabled" }
            }
          }

      val track_set_imported: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_set_imported".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_set_imported" }
            }
          }

      val track_set_interpolation_loop_wrap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_set_interpolation_loop_wrap".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method track_set_interpolation_loop_wrap" }
            }
          }

      val track_set_interpolation_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_set_interpolation_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_set_interpolation_type" }
            }
          }

      val track_set_key_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_set_key_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_set_key_time" }
            }
          }

      val track_set_key_transition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_set_key_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_set_key_transition" }
            }
          }

      val track_set_key_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_set_key_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_set_key_value" }
            }
          }

      val track_set_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_set_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_set_path" }
            }
          }

      val track_swap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "track_swap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method track_swap" }
            }
          }

      val transform_track_insert_key: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "transform_track_insert_key".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method transform_track_insert_key" }
            }
          }

      val transform_track_interpolate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "transform_track_interpolate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method transform_track_interpolate" }
            }
          }

      val value_track_get_key_indices: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "value_track_get_key_indices".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method value_track_get_key_indices" }
            }
          }

      val value_track_get_update_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "value_track_get_update_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method value_track_get_update_mode" }
            }
          }

      val value_track_set_update_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
              "value_track_set_update_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method value_track_set_update_mode" }
            }
          }
    }
  }
}
