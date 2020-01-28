// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolStringArray
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

open class AnimationTreePlayer(
  _handle: COpaquePointer
) : Node(_handle) {
  fun addNode(type: Int, id: String) {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(id)
    __method_bind.add_node.call(this._handle, _args.toVariant(), 2)
  }

  fun advance(delta: Float) {
    val _arg = Variant.new(delta)
    __method_bind.advance.call(this._handle, _arg, 1)
  }

  fun animationNodeGetAnimation(id: String): Animation {
    val _arg = Variant.new(id)
    val _ret = __method_bind.animation_node_get_animation.call(this._handle, _arg, 1)
    return _ret.asObject(::Animation)!!
  }

  fun animationNodeGetMasterAnimation(id: String): String {
    val _arg = Variant.new(id)
    val _ret = __method_bind.animation_node_get_master_animation.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun animationNodeGetPosition(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.animation_node_get_position.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun animationNodeSetAnimation(id: String, animation: Animation) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(animation)
    __method_bind.animation_node_set_animation.call(this._handle, _args.toVariant(), 2)
  }

  fun animationNodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(path)
    _args.append(enable)
    __method_bind.animation_node_set_filter_path.call(this._handle, _args.toVariant(), 3)
  }

  fun animationNodeSetMasterAnimation(id: String, source: String) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(source)
    __method_bind.animation_node_set_master_animation.call(this._handle, _args.toVariant(), 2)
  }

  fun areNodesConnected(
    id: String,
    dstId: String,
    dstInputIdx: Int
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(dstId)
    _args.append(dstInputIdx)
    val _ret = __method_bind.are_nodes_connected.call(this._handle, _args.toVariant(), 3)
    return _ret.asBoolean()
  }

  fun blend2NodeGetAmount(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.blend2_node_get_amount.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun blend2NodeSetAmount(id: String, blend: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(blend)
    __method_bind.blend2_node_set_amount.call(this._handle, _args.toVariant(), 2)
  }

  fun blend2NodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(path)
    _args.append(enable)
    __method_bind.blend2_node_set_filter_path.call(this._handle, _args.toVariant(), 3)
  }

  fun blend3NodeGetAmount(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.blend3_node_get_amount.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun blend3NodeSetAmount(id: String, blend: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(blend)
    __method_bind.blend3_node_set_amount.call(this._handle, _args.toVariant(), 2)
  }

  fun blend4NodeGetAmount(id: String): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.blend4_node_get_amount.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun blend4NodeSetAmount(id: String, blend: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(blend)
    __method_bind.blend4_node_set_amount.call(this._handle, _args.toVariant(), 2)
  }

  fun connectNodes(
    id: String,
    dstId: String,
    dstInputIdx: Int
  ): GDError {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(dstId)
    _args.append(dstInputIdx)
    val _ret = __method_bind.connect_nodes.call(this._handle, _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun disconnectNodes(id: String, dstInputIdx: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(dstInputIdx)
    __method_bind.disconnect_nodes.call(this._handle, _args.toVariant(), 2)
  }

  fun getAnimationProcessMode(): AnimationProcessMode {
    val _ret = __method_bind.get_animation_process_mode.call(this._handle)
    return AnimationTreePlayer.AnimationProcessMode.from(_ret.asInt())
  }

  fun getBasePath(): NodePath {
    val _ret = __method_bind.get_base_path.call(this._handle)
    return _ret.asNodePath()
  }

  fun getMasterPlayer(): NodePath {
    val _ret = __method_bind.get_master_player.call(this._handle)
    return _ret.asNodePath()
  }

  fun getNodeList(): PoolStringArray {
    val _ret = __method_bind.get_node_list.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun isActive(): Boolean {
    val _ret = __method_bind.is_active.call(this._handle)
    return _ret.asBoolean()
  }

  fun mixNodeGetAmount(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.mix_node_get_amount.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun mixNodeSetAmount(id: String, ratio: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(ratio)
    __method_bind.mix_node_set_amount.call(this._handle, _args.toVariant(), 2)
  }

  fun nodeExists(node: String): Boolean {
    val _arg = Variant.new(node)
    val _ret = __method_bind.node_exists.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun nodeGetInputCount(id: String): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.node_get_input_count.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun nodeGetInputSource(id: String, idx: Int): String {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(idx)
    val _ret = __method_bind.node_get_input_source.call(this._handle, _args.toVariant(), 2)
    return _ret.asString()
  }

  fun nodeGetPosition(id: String): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.node_get_position.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun nodeGetType(id: String): NodeType {
    val _arg = Variant.new(id)
    val _ret = __method_bind.node_get_type.call(this._handle, _arg, 1)
    return AnimationTreePlayer.NodeType.from(_ret.asInt())
  }

  fun nodeRename(node: String, newName: String): GDError {
    val _args = VariantArray.new()
    _args.append(node)
    _args.append(newName)
    val _ret = __method_bind.node_rename.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun nodeSetPosition(id: String, screenPosition: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(screenPosition)
    __method_bind.node_set_position.call(this._handle, _args.toVariant(), 2)
  }

  fun oneshotNodeGetAutorestartDelay(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.oneshot_node_get_autorestart_delay.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun oneshotNodeGetAutorestartRandomDelay(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.oneshot_node_get_autorestart_random_delay.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun oneshotNodeGetFadeinTime(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.oneshot_node_get_fadein_time.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun oneshotNodeGetFadeoutTime(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.oneshot_node_get_fadeout_time.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun oneshotNodeHasAutorestart(id: String): Boolean {
    val _arg = Variant.new(id)
    val _ret = __method_bind.oneshot_node_has_autorestart.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun oneshotNodeIsActive(id: String): Boolean {
    val _arg = Variant.new(id)
    val _ret = __method_bind.oneshot_node_is_active.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun oneshotNodeSetAutorestart(id: String, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(enable)
    __method_bind.oneshot_node_set_autorestart.call(this._handle, _args.toVariant(), 2)
  }

  fun oneshotNodeSetAutorestartDelay(id: String, delaySec: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(delaySec)
    __method_bind.oneshot_node_set_autorestart_delay.call(this._handle, _args.toVariant(), 2)
  }

  fun oneshotNodeSetAutorestartRandomDelay(id: String, randSec: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(randSec)
    __method_bind.oneshot_node_set_autorestart_random_delay.call(this._handle, _args.toVariant(), 2)
  }

  fun oneshotNodeSetFadeinTime(id: String, timeSec: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(timeSec)
    __method_bind.oneshot_node_set_fadein_time.call(this._handle, _args.toVariant(), 2)
  }

  fun oneshotNodeSetFadeoutTime(id: String, timeSec: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(timeSec)
    __method_bind.oneshot_node_set_fadeout_time.call(this._handle, _args.toVariant(), 2)
  }

  fun oneshotNodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(path)
    _args.append(enable)
    __method_bind.oneshot_node_set_filter_path.call(this._handle, _args.toVariant(), 3)
  }

  fun oneshotNodeStart(id: String) {
    val _arg = Variant.new(id)
    __method_bind.oneshot_node_start.call(this._handle, _arg, 1)
  }

  fun oneshotNodeStop(id: String) {
    val _arg = Variant.new(id)
    __method_bind.oneshot_node_stop.call(this._handle, _arg, 1)
  }

  fun recomputeCaches() {
    __method_bind.recompute_caches.call(this._handle)
  }

  fun removeNode(id: String) {
    val _arg = Variant.new(id)
    __method_bind.remove_node.call(this._handle, _arg, 1)
  }

  fun reset() {
    __method_bind.reset.call(this._handle)
  }

  fun setActive(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_active.call(this._handle, _arg, 1)
  }

  fun setAnimationProcessMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_animation_process_mode.call(this._handle, _arg, 1)
  }

  fun setBasePath(path: NodePath) {
    val _arg = Variant.new(path)
    __method_bind.set_base_path.call(this._handle, _arg, 1)
  }

  fun setMasterPlayer(nodepath: NodePath) {
    val _arg = Variant.new(nodepath)
    __method_bind.set_master_player.call(this._handle, _arg, 1)
  }

  fun timescaleNodeGetScale(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.timescale_node_get_scale.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun timescaleNodeSetScale(id: String, scale: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(scale)
    __method_bind.timescale_node_set_scale.call(this._handle, _args.toVariant(), 2)
  }

  fun timeseekNodeSeek(id: String, seconds: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(seconds)
    __method_bind.timeseek_node_seek.call(this._handle, _args.toVariant(), 2)
  }

  fun transitionNodeDeleteInput(id: String, inputIdx: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(inputIdx)
    __method_bind.transition_node_delete_input.call(this._handle, _args.toVariant(), 2)
  }

  fun transitionNodeGetCurrent(id: String): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.transition_node_get_current.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun transitionNodeGetInputCount(id: String): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.transition_node_get_input_count.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun transitionNodeGetXfadeTime(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.transition_node_get_xfade_time.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun transitionNodeHasInputAutoAdvance(id: String, inputIdx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(inputIdx)
    val _ret = __method_bind.transition_node_has_input_auto_advance.call(this._handle,
        _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun transitionNodeSetCurrent(id: String, inputIdx: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(inputIdx)
    __method_bind.transition_node_set_current.call(this._handle, _args.toVariant(), 2)
  }

  fun transitionNodeSetInputAutoAdvance(
    id: String,
    inputIdx: Int,
    enable: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(inputIdx)
    _args.append(enable)
    __method_bind.transition_node_set_input_auto_advance.call(this._handle, _args.toVariant(), 3)
  }

  fun transitionNodeSetInputCount(id: String, count: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(count)
    __method_bind.transition_node_set_input_count.call(this._handle, _args.toVariant(), 2)
  }

  fun transitionNodeSetXfadeTime(id: String, timeSec: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(timeSec)
    __method_bind.transition_node_set_xfade_time.call(this._handle, _args.toVariant(), 2)
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
      requireNotNull(fnPtr) { "No instance found for AnimationTreePlayer" }
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
      val add_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "add_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_node" }
        }
      val advance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "advance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method advance" }
        }
      val animation_node_get_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "animation_node_get_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_node_get_animation" }
        }
      val animation_node_get_master_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "animation_node_get_master_animation".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method animation_node_get_master_animation" }
        }
      val animation_node_get_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "animation_node_get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_node_get_position" }
        }
      val animation_node_set_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "animation_node_set_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_node_set_animation" }
        }
      val animation_node_set_filter_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "animation_node_set_filter_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_node_set_filter_path" }
        }
      val animation_node_set_master_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "animation_node_set_master_animation".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method animation_node_set_master_animation" }
        }
      val are_nodes_connected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "are_nodes_connected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method are_nodes_connected" }
        }
      val blend2_node_get_amount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "blend2_node_get_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend2_node_get_amount" }
        }
      val blend2_node_set_amount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "blend2_node_set_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend2_node_set_amount" }
        }
      val blend2_node_set_filter_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "blend2_node_set_filter_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend2_node_set_filter_path" }
        }
      val blend3_node_get_amount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "blend3_node_get_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend3_node_get_amount" }
        }
      val blend3_node_set_amount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "blend3_node_set_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend3_node_set_amount" }
        }
      val blend4_node_get_amount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "blend4_node_get_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend4_node_get_amount" }
        }
      val blend4_node_set_amount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "blend4_node_set_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend4_node_set_amount" }
        }
      val connect_nodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "connect_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_nodes" }
        }
      val disconnect_nodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "disconnect_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_nodes" }
        }
      val get_animation_process_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "get_animation_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation_process_mode" }
        }
      val get_base_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "get_base_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_path" }
        }
      val get_master_player: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "get_master_player".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_master_player" }
        }
      val get_node_list: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "get_node_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_list" }
        }
      val is_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_active" }
        }
      val mix_node_get_amount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "mix_node_get_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mix_node_get_amount" }
        }
      val mix_node_set_amount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "mix_node_set_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mix_node_set_amount" }
        }
      val node_exists: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "node_exists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method node_exists" }
        }
      val node_get_input_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "node_get_input_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method node_get_input_count" }
        }
      val node_get_input_source: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "node_get_input_source".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method node_get_input_source" }
        }
      val node_get_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "node_get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method node_get_position" }
        }
      val node_get_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "node_get_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method node_get_type" }
        }
      val node_rename: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "node_rename".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method node_rename" }
        }
      val node_set_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "node_set_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method node_set_position" }
        }
      val oneshot_node_get_autorestart_delay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_get_autorestart_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_get_autorestart_delay"
            }
        }
      val oneshot_node_get_autorestart_random_delay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_get_autorestart_random_delay".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method oneshot_node_get_autorestart_random_delay" }
        }
      val oneshot_node_get_fadein_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_get_fadein_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_get_fadein_time" }
        }
      val oneshot_node_get_fadeout_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_get_fadeout_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_get_fadeout_time" }
        }
      val oneshot_node_has_autorestart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_has_autorestart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_has_autorestart" }
        }
      val oneshot_node_is_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_is_active" }
        }
      val oneshot_node_set_autorestart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_set_autorestart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_autorestart" }
        }
      val oneshot_node_set_autorestart_delay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_set_autorestart_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_autorestart_delay"
            }
        }
      val oneshot_node_set_autorestart_random_delay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_set_autorestart_random_delay".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method oneshot_node_set_autorestart_random_delay" }
        }
      val oneshot_node_set_fadein_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_set_fadein_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_fadein_time" }
        }
      val oneshot_node_set_fadeout_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_set_fadeout_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_fadeout_time" }
        }
      val oneshot_node_set_filter_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_set_filter_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_filter_path" }
        }
      val oneshot_node_start: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_start".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_start" }
        }
      val oneshot_node_stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_stop" }
        }
      val recompute_caches: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "recompute_caches".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method recompute_caches" }
        }
      val remove_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "remove_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_node" }
        }
      val reset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "reset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reset" }
        }
      val set_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_active" }
        }
      val set_animation_process_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "set_animation_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_animation_process_mode" }
        }
      val set_base_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "set_base_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base_path" }
        }
      val set_master_player: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "set_master_player".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_master_player" }
        }
      val timescale_node_get_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "timescale_node_get_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method timescale_node_get_scale" }
        }
      val timescale_node_set_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "timescale_node_set_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method timescale_node_set_scale" }
        }
      val timeseek_node_seek: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "timeseek_node_seek".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method timeseek_node_seek" }
        }
      val transition_node_delete_input: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_delete_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transition_node_delete_input" }
        }
      val transition_node_get_current: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_get_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transition_node_get_current" }
        }
      val transition_node_get_input_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_get_input_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transition_node_get_input_count" }
        }
      val transition_node_get_xfade_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_get_xfade_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transition_node_get_xfade_time" }
        }
      val transition_node_has_input_auto_advance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_has_input_auto_advance".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method transition_node_has_input_auto_advance" }
        }
      val transition_node_set_current: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_set_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transition_node_set_current" }
        }
      val transition_node_set_input_auto_advance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_set_input_auto_advance".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method transition_node_set_input_auto_advance" }
        }
      val transition_node_set_input_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_set_input_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transition_node_set_input_count" }
        }
      val transition_node_set_xfade_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_set_xfade_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transition_node_set_xfade_time" }
        }}
  }
}
