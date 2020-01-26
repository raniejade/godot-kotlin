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
  fun addNode() {
    TODO()
  }

  fun advance() {
    TODO()
  }

  fun animationNodeGetAnimation(): Animation {
    TODO()
  }

  fun animationNodeGetMasterAnimation(): String {
    TODO()
  }

  fun animationNodeGetPosition(): Float {
    TODO()
  }

  fun animationNodeSetAnimation() {
    TODO()
  }

  fun animationNodeSetFilterPath() {
    TODO()
  }

  fun animationNodeSetMasterAnimation() {
    TODO()
  }

  fun areNodesConnected(): Boolean {
    TODO()
  }

  fun blend2NodeGetAmount(): Float {
    TODO()
  }

  fun blend2NodeSetAmount() {
    TODO()
  }

  fun blend2NodeSetFilterPath() {
    TODO()
  }

  fun blend3NodeGetAmount(): Float {
    TODO()
  }

  fun blend3NodeSetAmount() {
    TODO()
  }

  fun blend4NodeGetAmount(): Vector2 {
    TODO()
  }

  fun blend4NodeSetAmount() {
    TODO()
  }

  fun connectNodes(): Error {
    TODO()
  }

  fun disconnectNodes() {
    TODO()
  }

  fun getAnimationProcessMode(): AnimationTreePlayer.AnimationProcessMode {
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

  fun mixNodeGetAmount(): Float {
    TODO()
  }

  fun mixNodeSetAmount() {
    TODO()
  }

  fun nodeExists(): Boolean {
    TODO()
  }

  fun nodeGetInputCount(): Int {
    TODO()
  }

  fun nodeGetInputSource(): String {
    TODO()
  }

  fun nodeGetPosition(): Vector2 {
    TODO()
  }

  fun nodeGetType(): AnimationTreePlayer.NodeType {
    TODO()
  }

  fun nodeRename(): Error {
    TODO()
  }

  fun nodeSetPosition() {
    TODO()
  }

  fun oneshotNodeGetAutorestartDelay(): Float {
    TODO()
  }

  fun oneshotNodeGetAutorestartRandomDelay(): Float {
    TODO()
  }

  fun oneshotNodeGetFadeinTime(): Float {
    TODO()
  }

  fun oneshotNodeGetFadeoutTime(): Float {
    TODO()
  }

  fun oneshotNodeHasAutorestart(): Boolean {
    TODO()
  }

  fun oneshotNodeIsActive(): Boolean {
    TODO()
  }

  fun oneshotNodeSetAutorestart() {
    TODO()
  }

  fun oneshotNodeSetAutorestartDelay() {
    TODO()
  }

  fun oneshotNodeSetAutorestartRandomDelay() {
    TODO()
  }

  fun oneshotNodeSetFadeinTime() {
    TODO()
  }

  fun oneshotNodeSetFadeoutTime() {
    TODO()
  }

  fun oneshotNodeSetFilterPath() {
    TODO()
  }

  fun oneshotNodeStart() {
    TODO()
  }

  fun oneshotNodeStop() {
    TODO()
  }

  fun recomputeCaches() {
    TODO()
  }

  fun removeNode() {
    TODO()
  }

  fun reset() {
    TODO()
  }

  fun setActive() {
    TODO()
  }

  fun setAnimationProcessMode() {
    TODO()
  }

  fun setBasePath() {
    TODO()
  }

  fun setMasterPlayer() {
    TODO()
  }

  fun timescaleNodeGetScale(): Float {
    TODO()
  }

  fun timescaleNodeSetScale() {
    TODO()
  }

  fun timeseekNodeSeek() {
    TODO()
  }

  fun transitionNodeDeleteInput() {
    TODO()
  }

  fun transitionNodeGetCurrent(): Int {
    TODO()
  }

  fun transitionNodeGetInputCount(): Int {
    TODO()
  }

  fun transitionNodeGetXfadeTime(): Float {
    TODO()
  }

  fun transitionNodeHasInputAutoAdvance(): Boolean {
    TODO()
  }

  fun transitionNodeSetCurrent() {
    TODO()
  }

  fun transitionNodeSetInputAutoAdvance() {
    TODO()
  }

  fun transitionNodeSetInputCount() {
    TODO()
  }

  fun transitionNodeSetXfadeTime() {
    TODO()
  }

  enum class AnimationProcessMode(
    val value: Int
  ) {
    ANIMATION_PROCESS_PHYSICS(0),

    ANIMATION_PROCESS_IDLE(1);
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
