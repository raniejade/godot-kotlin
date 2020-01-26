// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolStringArray
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

open class AnimationTreePlayer internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun addNode(type: Int, id: String) {
    TODO()
  }

  fun advance(delta: Float) {
    TODO()
  }

  fun animationNodeGetAnimation(id: String): Animation {
    TODO()
  }

  fun animationNodeGetMasterAnimation(id: String): String {
    TODO()
  }

  fun animationNodeGetPosition(id: String): Float {
    TODO()
  }

  fun animationNodeSetAnimation(id: String, animation: Animation) {
    TODO()
  }

  fun animationNodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    TODO()
  }

  fun animationNodeSetMasterAnimation(id: String, source: String) {
    TODO()
  }

  fun areNodesConnected(
    id: String,
    dst_id: String,
    dst_input_idx: Int
  ): Boolean {
    TODO()
  }

  fun blend2NodeGetAmount(id: String): Float {
    TODO()
  }

  fun blend2NodeSetAmount(id: String, blend: Float) {
    TODO()
  }

  fun blend2NodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    TODO()
  }

  fun blend3NodeGetAmount(id: String): Float {
    TODO()
  }

  fun blend3NodeSetAmount(id: String, blend: Float) {
    TODO()
  }

  fun blend4NodeGetAmount(id: String): Vector2 {
    TODO()
  }

  fun blend4NodeSetAmount(id: String, blend: Vector2) {
    TODO()
  }

  fun connectNodes(
    id: String,
    dst_id: String,
    dst_input_idx: Int
  ): Error {
    TODO()
  }

  fun disconnectNodes(id: String, dst_input_idx: Int) {
    TODO()
  }

  fun getAnimationProcessMode(): AnimationProcessMode {
    TODO()
  }

  fun getBasePath(): NodePath {
    TODO()
  }

  fun getMasterPlayer(): NodePath {
    TODO()
  }

  fun getNodeList(): PoolStringArray {
    TODO()
  }

  fun isActive(): Boolean {
    TODO()
  }

  fun mixNodeGetAmount(id: String): Float {
    TODO()
  }

  fun mixNodeSetAmount(id: String, ratio: Float) {
    TODO()
  }

  fun nodeExists(node: String): Boolean {
    TODO()
  }

  fun nodeGetInputCount(id: String): Int {
    TODO()
  }

  fun nodeGetInputSource(id: String, idx: Int): String {
    TODO()
  }

  fun nodeGetPosition(id: String): Vector2 {
    TODO()
  }

  fun nodeGetType(id: String): NodeType {
    TODO()
  }

  fun nodeRename(node: String, new_name: String): Error {
    TODO()
  }

  fun nodeSetPosition(id: String, screen_position: Vector2) {
    TODO()
  }

  fun oneshotNodeGetAutorestartDelay(id: String): Float {
    TODO()
  }

  fun oneshotNodeGetAutorestartRandomDelay(id: String): Float {
    TODO()
  }

  fun oneshotNodeGetFadeinTime(id: String): Float {
    TODO()
  }

  fun oneshotNodeGetFadeoutTime(id: String): Float {
    TODO()
  }

  fun oneshotNodeHasAutorestart(id: String): Boolean {
    TODO()
  }

  fun oneshotNodeIsActive(id: String): Boolean {
    TODO()
  }

  fun oneshotNodeSetAutorestart(id: String, enable: Boolean) {
    TODO()
  }

  fun oneshotNodeSetAutorestartDelay(id: String, delay_sec: Float) {
    TODO()
  }

  fun oneshotNodeSetAutorestartRandomDelay(id: String, rand_sec: Float) {
    TODO()
  }

  fun oneshotNodeSetFadeinTime(id: String, time_sec: Float) {
    TODO()
  }

  fun oneshotNodeSetFadeoutTime(id: String, time_sec: Float) {
    TODO()
  }

  fun oneshotNodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    TODO()
  }

  fun oneshotNodeStart(id: String) {
    TODO()
  }

  fun oneshotNodeStop(id: String) {
    TODO()
  }

  fun recomputeCaches() {
    TODO()
  }

  fun removeNode(id: String) {
    TODO()
  }

  fun reset() {
    TODO()
  }

  fun setActive(enabled: Boolean) {
    TODO()
  }

  fun setAnimationProcessMode(mode: Int) {
    TODO()
  }

  fun setBasePath(path: NodePath) {
    TODO()
  }

  fun setMasterPlayer(nodepath: NodePath) {
    TODO()
  }

  fun timescaleNodeGetScale(id: String): Float {
    TODO()
  }

  fun timescaleNodeSetScale(id: String, scale: Float) {
    TODO()
  }

  fun timeseekNodeSeek(id: String, seconds: Float) {
    TODO()
  }

  fun transitionNodeDeleteInput(id: String, input_idx: Int) {
    TODO()
  }

  fun transitionNodeGetCurrent(id: String): Int {
    TODO()
  }

  fun transitionNodeGetInputCount(id: String): Int {
    TODO()
  }

  fun transitionNodeGetXfadeTime(id: String): Float {
    TODO()
  }

  fun transitionNodeHasInputAutoAdvance(id: String, input_idx: Int): Boolean {
    TODO()
  }

  fun transitionNodeSetCurrent(id: String, input_idx: Int) {
    TODO()
  }

  fun transitionNodeSetInputAutoAdvance(
    id: String,
    input_idx: Int,
    enable: Boolean
  ) {
    TODO()
  }

  fun transitionNodeSetInputCount(id: String, count: Int) {
    TODO()
  }

  fun transitionNodeSetXfadeTime(id: String, time_sec: Float) {
    TODO()
  }

  enum class AnimationProcessMode(
    val value: Int
  ) {
    ANIMATION_PROCESS_PHYSICS(0),

    ANIMATION_PROCESS_IDLE(1);

    companion object {
      fun from(value: Int): AnimationProcessMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class NodeType(
    val value: Int
  ) {
    NODE_OUTPUT(0),

    NODE_ANIMATION(1),

    NODE_ONESHOT(2),

    NODE_MIX(3),

    NODE_BLEND2(4),

    NODE_BLEND3(5),

    NODE_BLEND4(6),

    NODE_TIMESCALE(7),

    NODE_TIMESEEK(8),

    NODE_TRANSITION(9);

    companion object {
      fun from(value: Int): NodeType {
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
    val ANIMATION_PROCESS_IDLE: Int = 1

    val ANIMATION_PROCESS_PHYSICS: Int = 0

    val NODE_ANIMATION: Int = 1

    val NODE_BLEND2: Int = 4

    val NODE_BLEND3: Int = 5

    val NODE_BLEND4: Int = 6

    val NODE_MIX: Int = 3

    val NODE_ONESHOT: Int = 2

    val NODE_OUTPUT: Int = 0

    val NODE_TIMESCALE: Int = 7

    val NODE_TIMESEEK: Int = 8

    val NODE_TRANSITION: Int = 9

    fun new(): AnimationTreePlayer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationTreePlayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationTreePlayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationTreePlayer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationTreePlayer = AnimationTreePlayer(ptr)
    /**
     * Container for method_bind pointers for AnimationTreePlayer
     */
    private object __method_bind {
      val add_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "add_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_node" }
            }
          }

      val advance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "advance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method advance" }
            }
          }

      val animation_node_get_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "animation_node_get_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method animation_node_get_animation" }
            }
          }

      val animation_node_get_master_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "animation_node_get_master_animation".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method animation_node_get_master_animation" }
            }
          }

      val animation_node_get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "animation_node_get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method animation_node_get_position" }
            }
          }

      val animation_node_set_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "animation_node_set_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method animation_node_set_animation" }
            }
          }

      val animation_node_set_filter_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "animation_node_set_filter_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method animation_node_set_filter_path"
              }
            }
          }

      val animation_node_set_master_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "animation_node_set_master_animation".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method animation_node_set_master_animation" }
            }
          }

      val are_nodes_connected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "are_nodes_connected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method are_nodes_connected" }
            }
          }

      val blend2_node_get_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "blend2_node_get_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend2_node_get_amount" }
            }
          }

      val blend2_node_set_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "blend2_node_set_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend2_node_set_amount" }
            }
          }

      val blend2_node_set_filter_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "blend2_node_set_filter_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend2_node_set_filter_path" }
            }
          }

      val blend3_node_get_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "blend3_node_get_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend3_node_get_amount" }
            }
          }

      val blend3_node_set_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "blend3_node_set_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend3_node_set_amount" }
            }
          }

      val blend4_node_get_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "blend4_node_get_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend4_node_get_amount" }
            }
          }

      val blend4_node_set_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "blend4_node_set_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend4_node_set_amount" }
            }
          }

      val connect_nodes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "connect_nodes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_nodes" }
            }
          }

      val disconnect_nodes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "disconnect_nodes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_nodes" }
            }
          }

      val get_animation_process_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "get_animation_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation_process_mode" }
            }
          }

      val get_base_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "get_base_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_path" }
            }
          }

      val get_master_player: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "get_master_player".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_master_player" }
            }
          }

      val get_node_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "get_node_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_list" }
            }
          }

      val is_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_active" }
            }
          }

      val mix_node_get_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "mix_node_get_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mix_node_get_amount" }
            }
          }

      val mix_node_set_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "mix_node_set_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mix_node_set_amount" }
            }
          }

      val node_exists: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "node_exists".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method node_exists" }
            }
          }

      val node_get_input_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "node_get_input_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method node_get_input_count" }
            }
          }

      val node_get_input_source: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "node_get_input_source".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method node_get_input_source" }
            }
          }

      val node_get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "node_get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method node_get_position" }
            }
          }

      val node_get_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "node_get_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method node_get_type" }
            }
          }

      val node_rename: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "node_rename".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method node_rename" }
            }
          }

      val node_set_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "node_set_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method node_set_position" }
            }
          }

      val oneshot_node_get_autorestart_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_get_autorestart_delay".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method oneshot_node_get_autorestart_delay" }
            }
          }

      val oneshot_node_get_autorestart_random_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_get_autorestart_random_delay".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method oneshot_node_get_autorestart_random_delay" }
            }
          }

      val oneshot_node_get_fadein_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_get_fadein_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_get_fadein_time" }
            }
          }

      val oneshot_node_get_fadeout_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_get_fadeout_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_get_fadeout_time"
              }
            }
          }

      val oneshot_node_has_autorestart: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_has_autorestart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_has_autorestart" }
            }
          }

      val oneshot_node_is_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_is_active" }
            }
          }

      val oneshot_node_set_autorestart: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_set_autorestart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_autorestart" }
            }
          }

      val oneshot_node_set_autorestart_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_set_autorestart_delay".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method oneshot_node_set_autorestart_delay" }
            }
          }

      val oneshot_node_set_autorestart_random_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_set_autorestart_random_delay".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method oneshot_node_set_autorestart_random_delay" }
            }
          }

      val oneshot_node_set_fadein_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_set_fadein_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_fadein_time" }
            }
          }

      val oneshot_node_set_fadeout_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_set_fadeout_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_fadeout_time"
              }
            }
          }

      val oneshot_node_set_filter_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_set_filter_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_filter_path" }
            }
          }

      val oneshot_node_start: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_start".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_start" }
            }
          }

      val oneshot_node_stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_stop" }
            }
          }

      val recompute_caches: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "recompute_caches".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method recompute_caches" }
            }
          }

      val remove_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "remove_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_node" }
            }
          }

      val reset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "reset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reset" }
            }
          }

      val set_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "set_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_active" }
            }
          }

      val set_animation_process_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "set_animation_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_animation_process_mode" }
            }
          }

      val set_base_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "set_base_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_path" }
            }
          }

      val set_master_player: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "set_master_player".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_master_player" }
            }
          }

      val timescale_node_get_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "timescale_node_get_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method timescale_node_get_scale" }
            }
          }

      val timescale_node_set_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "timescale_node_set_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method timescale_node_set_scale" }
            }
          }

      val timeseek_node_seek: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "timeseek_node_seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method timeseek_node_seek" }
            }
          }

      val transition_node_delete_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_delete_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method transition_node_delete_input" }
            }
          }

      val transition_node_get_current: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_get_current".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method transition_node_get_current" }
            }
          }

      val transition_node_get_input_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_get_input_count".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method transition_node_get_input_count" }
            }
          }

      val transition_node_get_xfade_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_get_xfade_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method transition_node_get_xfade_time"
              }
            }
          }

      val transition_node_has_input_auto_advance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_has_input_auto_advance".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method transition_node_has_input_auto_advance" }
            }
          }

      val transition_node_set_current: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_set_current".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method transition_node_set_current" }
            }
          }

      val transition_node_set_input_auto_advance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_set_input_auto_advance".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method transition_node_set_input_auto_advance" }
            }
          }

      val transition_node_set_input_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_set_input_count".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method transition_node_set_input_count" }
            }
          }

      val transition_node_set_xfade_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_set_xfade_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method transition_node_set_xfade_time"
              }
            }
          }
    }
  }
}
