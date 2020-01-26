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
  fun addTrack(type: Int, at_position: Int): Int {
    TODO()
  }

  fun animationTrackGetKeyAnimation(idx: Int, key_idx: Int): String {
    TODO()
  }

  fun animationTrackInsertKey(
    track: Int,
    time: Float,
    animation: String
  ): Int {
    TODO()
  }

  fun animationTrackSetKeyAnimation(
    idx: Int,
    key_idx: Int,
    animation: String
  ) {
    TODO()
  }

  fun audioTrackGetKeyEndOffset(idx: Int, key_idx: Int): Float {
    TODO()
  }

  fun audioTrackGetKeyStartOffset(idx: Int, key_idx: Int): Float {
    TODO()
  }

  fun audioTrackGetKeyStream(idx: Int, key_idx: Int): Resource {
    TODO()
  }

  fun audioTrackInsertKey(
    track: Int,
    time: Float,
    stream: Resource,
    start_offset: Float,
    end_offset: Float
  ): Int {
    TODO()
  }

  fun audioTrackSetKeyEndOffset(
    idx: Int,
    key_idx: Int,
    offset: Float
  ) {
    TODO()
  }

  fun audioTrackSetKeyStartOffset(
    idx: Int,
    key_idx: Int,
    offset: Float
  ) {
    TODO()
  }

  fun audioTrackSetKeyStream(
    idx: Int,
    key_idx: Int,
    stream: Resource
  ) {
    TODO()
  }

  fun bezierTrackGetKeyInHandle(idx: Int, key_idx: Int): Vector2 {
    TODO()
  }

  fun bezierTrackGetKeyOutHandle(idx: Int, key_idx: Int): Vector2 {
    TODO()
  }

  fun bezierTrackGetKeyValue(idx: Int, key_idx: Int): Float {
    TODO()
  }

  fun bezierTrackInsertKey(
    track: Int,
    time: Float,
    value: Float,
    in_handle: Vector2,
    out_handle: Vector2
  ): Int {
    TODO()
  }

  fun bezierTrackInterpolate(track: Int, time: Float): Float {
    TODO()
  }

  fun bezierTrackSetKeyInHandle(
    idx: Int,
    key_idx: Int,
    in_handle: Vector2
  ) {
    TODO()
  }

  fun bezierTrackSetKeyOutHandle(
    idx: Int,
    key_idx: Int,
    out_handle: Vector2
  ) {
    TODO()
  }

  fun bezierTrackSetKeyValue(
    idx: Int,
    key_idx: Int,
    value: Float
  ) {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun copyTrack(track: Int, to_animation: Animation) {
    TODO()
  }

  fun findTrack(path: NodePath): Int {
    TODO()
  }

  fun getLength(): Float {
    TODO()
  }

  fun getStep(): Float {
    TODO()
  }

  fun getTrackCount(): Int {
    TODO()
  }

  fun hasLoop(): Boolean {
    TODO()
  }

  fun methodTrackGetKeyIndices(
    idx: Int,
    time_sec: Float,
    delta: Float
  ): PoolIntArray {
    TODO()
  }

  fun methodTrackGetName(idx: Int, key_idx: Int): String {
    TODO()
  }

  fun methodTrackGetParams(idx: Int, key_idx: Int): VariantArray {
    TODO()
  }

  fun removeTrack(idx: Int) {
    TODO()
  }

  fun setLength(time_sec: Float) {
    TODO()
  }

  fun setLoop(enabled: Boolean) {
    TODO()
  }

  fun setStep(size_sec: Float) {
    TODO()
  }

  fun trackFindKey(
    idx: Int,
    time: Float,
    exact: Boolean
  ): Int {
    TODO()
  }

  fun trackGetInterpolationLoopWrap(idx: Int): Boolean {
    TODO()
  }

  fun trackGetInterpolationType(idx: Int): InterpolationType {
    TODO()
  }

  fun trackGetKeyCount(idx: Int): Int {
    TODO()
  }

  fun trackGetKeyTime(idx: Int, key_idx: Int): Float {
    TODO()
  }

  fun trackGetKeyTransition(idx: Int, key_idx: Int): Float {
    TODO()
  }

  fun trackGetKeyValue(idx: Int, key_idx: Int): Variant {
    TODO()
  }

  fun trackGetPath(idx: Int): NodePath {
    TODO()
  }

  fun trackGetType(idx: Int): TrackType {
    TODO()
  }

  fun trackInsertKey(
    idx: Int,
    time: Float,
    key: Variant,
    transition: Float
  ) {
    TODO()
  }

  fun trackIsEnabled(idx: Int): Boolean {
    TODO()
  }

  fun trackIsImported(idx: Int): Boolean {
    TODO()
  }

  fun trackMoveDown(idx: Int) {
    TODO()
  }

  fun trackMoveTo(idx: Int, to_idx: Int) {
    TODO()
  }

  fun trackMoveUp(idx: Int) {
    TODO()
  }

  fun trackRemoveKey(idx: Int, key_idx: Int) {
    TODO()
  }

  fun trackRemoveKeyAtPosition(idx: Int, position: Float) {
    TODO()
  }

  fun trackSetEnabled(idx: Int, enabled: Boolean) {
    TODO()
  }

  fun trackSetImported(idx: Int, imported: Boolean) {
    TODO()
  }

  fun trackSetInterpolationLoopWrap(idx: Int, interpolation: Boolean) {
    TODO()
  }

  fun trackSetInterpolationType(idx: Int, interpolation: Int) {
    TODO()
  }

  fun trackSetKeyTime(
    idx: Int,
    key_idx: Int,
    time: Float
  ) {
    TODO()
  }

  fun trackSetKeyTransition(
    idx: Int,
    key_idx: Int,
    transition: Float
  ) {
    TODO()
  }

  fun trackSetKeyValue(
    idx: Int,
    key: Int,
    value: Variant
  ) {
    TODO()
  }

  fun trackSetPath(idx: Int, path: NodePath) {
    TODO()
  }

  fun trackSwap(idx: Int, with_idx: Int) {
    TODO()
  }

  fun transformTrackInsertKey(
    idx: Int,
    time: Float,
    location: Vector3,
    rotation: Quat,
    scale: Vector3
  ): Int {
    TODO()
  }

  fun transformTrackInterpolate(idx: Int, time_sec: Float): VariantArray {
    TODO()
  }

  fun valueTrackGetKeyIndices(
    idx: Int,
    time_sec: Float,
    delta: Float
  ): PoolIntArray {
    TODO()
  }

  fun valueTrackGetUpdateMode(idx: Int): UpdateMode {
    TODO()
  }

  fun valueTrackSetUpdateMode(idx: Int, mode: Int) {
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
