// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolIntArray
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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
  fun addTrack(): Int {
    TODO()
  }

  fun animationTrackGetKeyAnimation(): String {
    TODO()
  }

  fun animationTrackInsertKey(): Int {
    TODO()
  }

  fun animationTrackSetKeyAnimation() {
    TODO()
  }

  fun audioTrackGetKeyEndOffset(): Float {
    TODO()
  }

  fun audioTrackGetKeyStartOffset(): Float {
    TODO()
  }

  fun audioTrackGetKeyStream(): Resource {
    TODO()
  }

  fun audioTrackInsertKey(): Int {
    TODO()
  }

  fun audioTrackSetKeyEndOffset() {
    TODO()
  }

  fun audioTrackSetKeyStartOffset() {
    TODO()
  }

  fun audioTrackSetKeyStream() {
    TODO()
  }

  fun bezierTrackGetKeyInHandle(): Vector2 {
    TODO()
  }

  fun bezierTrackGetKeyOutHandle(): Vector2 {
    TODO()
  }

  fun bezierTrackGetKeyValue(): Float {
    TODO()
  }

  fun bezierTrackInsertKey(): Int {
    TODO()
  }

  fun bezierTrackInterpolate(): Float {
    TODO()
  }

  fun bezierTrackSetKeyInHandle() {
    TODO()
  }

  fun bezierTrackSetKeyOutHandle() {
    TODO()
  }

  fun bezierTrackSetKeyValue() {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun copyTrack() {
    TODO()
  }

  fun findTrack(): Int {
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

  fun methodTrackGetKeyIndices(): PoolIntArray {
    TODO()
  }

  fun methodTrackGetName(): String {
    TODO()
  }

  fun methodTrackGetParams(): VariantArray {
    TODO()
  }

  fun removeTrack() {
    TODO()
  }

  fun setLength() {
    TODO()
  }

  fun setLoop() {
    TODO()
  }

  fun setStep() {
    TODO()
  }

  fun trackFindKey(): Int {
    TODO()
  }

  fun trackGetInterpolationLoopWrap(): Boolean {
    TODO()
  }

  fun trackGetInterpolationType(): InterpolationType {
    TODO()
  }

  fun trackGetKeyCount(): Int {
    TODO()
  }

  fun trackGetKeyTime(): Float {
    TODO()
  }

  fun trackGetKeyTransition(): Float {
    TODO()
  }

  fun trackGetKeyValue(): Variant {
    TODO()
  }

  fun trackGetPath(): NodePath {
    TODO()
  }

  fun trackGetType(): TrackType {
    TODO()
  }

  fun trackInsertKey() {
    TODO()
  }

  fun trackIsEnabled(): Boolean {
    TODO()
  }

  fun trackIsImported(): Boolean {
    TODO()
  }

  fun trackMoveDown() {
    TODO()
  }

  fun trackMoveTo() {
    TODO()
  }

  fun trackMoveUp() {
    TODO()
  }

  fun trackRemoveKey() {
    TODO()
  }

  fun trackRemoveKeyAtPosition() {
    TODO()
  }

  fun trackSetEnabled() {
    TODO()
  }

  fun trackSetImported() {
    TODO()
  }

  fun trackSetInterpolationLoopWrap() {
    TODO()
  }

  fun trackSetInterpolationType() {
    TODO()
  }

  fun trackSetKeyTime() {
    TODO()
  }

  fun trackSetKeyTransition() {
    TODO()
  }

  fun trackSetKeyValue() {
    TODO()
  }

  fun trackSetPath() {
    TODO()
  }

  fun trackSwap() {
    TODO()
  }

  fun transformTrackInsertKey(): Int {
    TODO()
  }

  fun transformTrackInterpolate(): VariantArray {
    TODO()
  }

  fun valueTrackGetKeyIndices(): PoolIntArray {
    TODO()
  }

  fun valueTrackGetUpdateMode(): UpdateMode {
    TODO()
  }

  fun valueTrackSetUpdateMode() {
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
  }

  enum class UpdateMode(
    val value: Int
  ) {
    UPDATE_CONTINUOUS(0),

    UPDATE_DISCRETE(1),

    UPDATE_TRIGGER(2),

    UPDATE_CAPTURE(3);
  }

  enum class InterpolationType(
    val value: Int
  ) {
    INTERPOLATION_NEAREST(0),

    INTERPOLATION_LINEAR(1),

    INTERPOLATION_CUBIC(2);
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
