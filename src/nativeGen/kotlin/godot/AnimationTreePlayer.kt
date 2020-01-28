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
  var active: Boolean
    get() {
       return isActive() 
    }
    set(value) {
      setActive(value)
    }

  var basePath: NodePath
    get() {
       return getBasePath() 
    }
    set(value) {
      setBasePath(value)
    }

  var masterPlayer: NodePath
    get() {
       return getMasterPlayer() 
    }
    set(value) {
      setMasterPlayer(value)
    }

  var playbackProcessMode: AnimationProcessMode
    get() {
       return getAnimationProcessMode() 
    }
    set(value) {
      setAnimationProcessMode(value.value)
    }

  fun addNode(type: Int, id: String) {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(id)
    __method_bind.addNode.call(this._handle, _args.toVariant(), 2)
  }

  fun advance(delta: Float) {
    val _arg = Variant.new(delta)
    __method_bind.advance.call(this._handle, _arg, 1)
  }

  fun animationNodeGetAnimation(id: String): Animation {
    val _arg = Variant.new(id)
    val _ret = __method_bind.animationNodeGetAnimation.call(this._handle, _arg, 1)
    return _ret.asObject(::Animation)!!
  }

  fun animationNodeGetMasterAnimation(id: String): String {
    val _arg = Variant.new(id)
    val _ret = __method_bind.animationNodeGetMasterAnimation.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun animationNodeGetPosition(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.animationNodeGetPosition.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun animationNodeSetAnimation(id: String, animation: Animation) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(animation)
    __method_bind.animationNodeSetAnimation.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.animationNodeSetFilterPath.call(this._handle, _args.toVariant(), 3)
  }

  fun animationNodeSetMasterAnimation(id: String, source: String) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(source)
    __method_bind.animationNodeSetMasterAnimation.call(this._handle, _args.toVariant(), 2)
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
    val _ret = __method_bind.areNodesConnected.call(this._handle, _args.toVariant(), 3)
    return _ret.asBoolean()
  }

  fun blend2NodeGetAmount(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.blend2NodeGetAmount.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun blend2NodeSetAmount(id: String, blend: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(blend)
    __method_bind.blend2NodeSetAmount.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.blend2NodeSetFilterPath.call(this._handle, _args.toVariant(), 3)
  }

  fun blend3NodeGetAmount(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.blend3NodeGetAmount.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun blend3NodeSetAmount(id: String, blend: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(blend)
    __method_bind.blend3NodeSetAmount.call(this._handle, _args.toVariant(), 2)
  }

  fun blend4NodeGetAmount(id: String): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.blend4NodeGetAmount.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun blend4NodeSetAmount(id: String, blend: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(blend)
    __method_bind.blend4NodeSetAmount.call(this._handle, _args.toVariant(), 2)
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
    val _ret = __method_bind.connectNodes.call(this._handle, _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun disconnectNodes(id: String, dstInputIdx: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(dstInputIdx)
    __method_bind.disconnectNodes.call(this._handle, _args.toVariant(), 2)
  }

  fun getAnimationProcessMode(): AnimationProcessMode {
    val _ret = __method_bind.getAnimationProcessMode.call(this._handle)
    return AnimationTreePlayer.AnimationProcessMode.from(_ret.asInt())
  }

  fun getBasePath(): NodePath {
    val _ret = __method_bind.getBasePath.call(this._handle)
    return _ret.asNodePath()
  }

  fun getMasterPlayer(): NodePath {
    val _ret = __method_bind.getMasterPlayer.call(this._handle)
    return _ret.asNodePath()
  }

  fun getNodeList(): PoolStringArray {
    val _ret = __method_bind.getNodeList.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun isActive(): Boolean {
    val _ret = __method_bind.isActive.call(this._handle)
    return _ret.asBoolean()
  }

  fun mixNodeGetAmount(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.mixNodeGetAmount.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun mixNodeSetAmount(id: String, ratio: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(ratio)
    __method_bind.mixNodeSetAmount.call(this._handle, _args.toVariant(), 2)
  }

  fun nodeExists(node: String): Boolean {
    val _arg = Variant.new(node)
    val _ret = __method_bind.nodeExists.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun nodeGetInputCount(id: String): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.nodeGetInputCount.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun nodeGetInputSource(id: String, idx: Int): String {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(idx)
    val _ret = __method_bind.nodeGetInputSource.call(this._handle, _args.toVariant(), 2)
    return _ret.asString()
  }

  fun nodeGetPosition(id: String): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.nodeGetPosition.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun nodeGetType(id: String): NodeType {
    val _arg = Variant.new(id)
    val _ret = __method_bind.nodeGetType.call(this._handle, _arg, 1)
    return AnimationTreePlayer.NodeType.from(_ret.asInt())
  }

  fun nodeRename(node: String, newName: String): GDError {
    val _args = VariantArray.new()
    _args.append(node)
    _args.append(newName)
    val _ret = __method_bind.nodeRename.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun nodeSetPosition(id: String, screenPosition: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(screenPosition)
    __method_bind.nodeSetPosition.call(this._handle, _args.toVariant(), 2)
  }

  fun oneshotNodeGetAutorestartDelay(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.oneshotNodeGetAutorestartDelay.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun oneshotNodeGetAutorestartRandomDelay(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.oneshotNodeGetAutorestartRandomDelay.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun oneshotNodeGetFadeinTime(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.oneshotNodeGetFadeinTime.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun oneshotNodeGetFadeoutTime(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.oneshotNodeGetFadeoutTime.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun oneshotNodeHasAutorestart(id: String): Boolean {
    val _arg = Variant.new(id)
    val _ret = __method_bind.oneshotNodeHasAutorestart.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun oneshotNodeIsActive(id: String): Boolean {
    val _arg = Variant.new(id)
    val _ret = __method_bind.oneshotNodeIsActive.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun oneshotNodeSetAutorestart(id: String, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(enable)
    __method_bind.oneshotNodeSetAutorestart.call(this._handle, _args.toVariant(), 2)
  }

  fun oneshotNodeSetAutorestartDelay(id: String, delaySec: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(delaySec)
    __method_bind.oneshotNodeSetAutorestartDelay.call(this._handle, _args.toVariant(), 2)
  }

  fun oneshotNodeSetAutorestartRandomDelay(id: String, randSec: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(randSec)
    __method_bind.oneshotNodeSetAutorestartRandomDelay.call(this._handle, _args.toVariant(), 2)
  }

  fun oneshotNodeSetFadeinTime(id: String, timeSec: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(timeSec)
    __method_bind.oneshotNodeSetFadeinTime.call(this._handle, _args.toVariant(), 2)
  }

  fun oneshotNodeSetFadeoutTime(id: String, timeSec: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(timeSec)
    __method_bind.oneshotNodeSetFadeoutTime.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.oneshotNodeSetFilterPath.call(this._handle, _args.toVariant(), 3)
  }

  fun oneshotNodeStart(id: String) {
    val _arg = Variant.new(id)
    __method_bind.oneshotNodeStart.call(this._handle, _arg, 1)
  }

  fun oneshotNodeStop(id: String) {
    val _arg = Variant.new(id)
    __method_bind.oneshotNodeStop.call(this._handle, _arg, 1)
  }

  fun recomputeCaches() {
    __method_bind.recomputeCaches.call(this._handle)
  }

  fun removeNode(id: String) {
    val _arg = Variant.new(id)
    __method_bind.removeNode.call(this._handle, _arg, 1)
  }

  fun reset() {
    __method_bind.reset.call(this._handle)
  }

  fun setActive(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setActive.call(this._handle, _arg, 1)
  }

  fun setAnimationProcessMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setAnimationProcessMode.call(this._handle, _arg, 1)
  }

  fun setBasePath(path: NodePath) {
    val _arg = Variant.new(path)
    __method_bind.setBasePath.call(this._handle, _arg, 1)
  }

  fun setMasterPlayer(nodepath: NodePath) {
    val _arg = Variant.new(nodepath)
    __method_bind.setMasterPlayer.call(this._handle, _arg, 1)
  }

  fun timescaleNodeGetScale(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.timescaleNodeGetScale.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun timescaleNodeSetScale(id: String, scale: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(scale)
    __method_bind.timescaleNodeSetScale.call(this._handle, _args.toVariant(), 2)
  }

  fun timeseekNodeSeek(id: String, seconds: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(seconds)
    __method_bind.timeseekNodeSeek.call(this._handle, _args.toVariant(), 2)
  }

  fun transitionNodeDeleteInput(id: String, inputIdx: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(inputIdx)
    __method_bind.transitionNodeDeleteInput.call(this._handle, _args.toVariant(), 2)
  }

  fun transitionNodeGetCurrent(id: String): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.transitionNodeGetCurrent.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun transitionNodeGetInputCount(id: String): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.transitionNodeGetInputCount.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun transitionNodeGetXfadeTime(id: String): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.transitionNodeGetXfadeTime.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun transitionNodeHasInputAutoAdvance(id: String, inputIdx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(inputIdx)
    val _ret = __method_bind.transitionNodeHasInputAutoAdvance.call(this._handle, _args.toVariant(),
        2)
    return _ret.asBoolean()
  }

  fun transitionNodeSetCurrent(id: String, inputIdx: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(inputIdx)
    __method_bind.transitionNodeSetCurrent.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.transitionNodeSetInputAutoAdvance.call(this._handle, _args.toVariant(), 3)
  }

  fun transitionNodeSetInputCount(id: String, count: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(count)
    __method_bind.transitionNodeSetInputCount.call(this._handle, _args.toVariant(), 2)
  }

  fun transitionNodeSetXfadeTime(id: String, timeSec: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(timeSec)
    __method_bind.transitionNodeSetXfadeTime.call(this._handle, _args.toVariant(), 2)
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
      val addNode: CPointer<godot_method_bind>
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
      val animationNodeGetAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "animation_node_get_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_node_get_animation" }
        }
      val animationNodeGetMasterAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "animation_node_get_master_animation".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method animation_node_get_master_animation" }
        }
      val animationNodeGetPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "animation_node_get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_node_get_position" }
        }
      val animationNodeSetAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "animation_node_set_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_node_set_animation" }
        }
      val animationNodeSetFilterPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "animation_node_set_filter_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_node_set_filter_path" }
        }
      val animationNodeSetMasterAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "animation_node_set_master_animation".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method animation_node_set_master_animation" }
        }
      val areNodesConnected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "are_nodes_connected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method are_nodes_connected" }
        }
      val blend2NodeGetAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "blend2_node_get_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend2_node_get_amount" }
        }
      val blend2NodeSetAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "blend2_node_set_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend2_node_set_amount" }
        }
      val blend2NodeSetFilterPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "blend2_node_set_filter_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend2_node_set_filter_path" }
        }
      val blend3NodeGetAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "blend3_node_get_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend3_node_get_amount" }
        }
      val blend3NodeSetAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "blend3_node_set_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend3_node_set_amount" }
        }
      val blend4NodeGetAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "blend4_node_get_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend4_node_get_amount" }
        }
      val blend4NodeSetAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "blend4_node_set_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend4_node_set_amount" }
        }
      val connectNodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "connect_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_nodes" }
        }
      val disconnectNodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "disconnect_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_nodes" }
        }
      val getAnimationProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "get_animation_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation_process_mode" }
        }
      val getBasePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "get_base_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_path" }
        }
      val getMasterPlayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "get_master_player".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_master_player" }
        }
      val getNodeList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "get_node_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_list" }
        }
      val isActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_active" }
        }
      val mixNodeGetAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "mix_node_get_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mix_node_get_amount" }
        }
      val mixNodeSetAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "mix_node_set_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mix_node_set_amount" }
        }
      val nodeExists: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "node_exists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method node_exists" }
        }
      val nodeGetInputCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "node_get_input_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method node_get_input_count" }
        }
      val nodeGetInputSource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "node_get_input_source".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method node_get_input_source" }
        }
      val nodeGetPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "node_get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method node_get_position" }
        }
      val nodeGetType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "node_get_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method node_get_type" }
        }
      val nodeRename: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "node_rename".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method node_rename" }
        }
      val nodeSetPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "node_set_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method node_set_position" }
        }
      val oneshotNodeGetAutorestartDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_get_autorestart_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_get_autorestart_delay"
            }
        }
      val oneshotNodeGetAutorestartRandomDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_get_autorestart_random_delay".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method oneshot_node_get_autorestart_random_delay" }
        }
      val oneshotNodeGetFadeinTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_get_fadein_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_get_fadein_time" }
        }
      val oneshotNodeGetFadeoutTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_get_fadeout_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_get_fadeout_time" }
        }
      val oneshotNodeHasAutorestart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_has_autorestart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_has_autorestart" }
        }
      val oneshotNodeIsActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_is_active" }
        }
      val oneshotNodeSetAutorestart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_set_autorestart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_autorestart" }
        }
      val oneshotNodeSetAutorestartDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_set_autorestart_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_autorestart_delay"
            }
        }
      val oneshotNodeSetAutorestartRandomDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_set_autorestart_random_delay".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method oneshot_node_set_autorestart_random_delay" }
        }
      val oneshotNodeSetFadeinTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_set_fadein_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_fadein_time" }
        }
      val oneshotNodeSetFadeoutTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_set_fadeout_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_fadeout_time" }
        }
      val oneshotNodeSetFilterPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_set_filter_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_filter_path" }
        }
      val oneshotNodeStart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_start".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_start" }
        }
      val oneshotNodeStop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "oneshot_node_stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method oneshot_node_stop" }
        }
      val recomputeCaches: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "recompute_caches".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method recompute_caches" }
        }
      val removeNode: CPointer<godot_method_bind>
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
      val setActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_active" }
        }
      val setAnimationProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "set_animation_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_animation_process_mode" }
        }
      val setBasePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "set_base_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base_path" }
        }
      val setMasterPlayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "set_master_player".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_master_player" }
        }
      val timescaleNodeGetScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "timescale_node_get_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method timescale_node_get_scale" }
        }
      val timescaleNodeSetScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "timescale_node_set_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method timescale_node_set_scale" }
        }
      val timeseekNodeSeek: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "timeseek_node_seek".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method timeseek_node_seek" }
        }
      val transitionNodeDeleteInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_delete_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transition_node_delete_input" }
        }
      val transitionNodeGetCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_get_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transition_node_get_current" }
        }
      val transitionNodeGetInputCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_get_input_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transition_node_get_input_count" }
        }
      val transitionNodeGetXfadeTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_get_xfade_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transition_node_get_xfade_time" }
        }
      val transitionNodeHasInputAutoAdvance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_has_input_auto_advance".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method transition_node_has_input_auto_advance" }
        }
      val transitionNodeSetCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_set_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transition_node_set_current" }
        }
      val transitionNodeSetInputAutoAdvance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_set_input_auto_advance".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method transition_node_set_input_auto_advance" }
        }
      val transitionNodeSetInputCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_set_input_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transition_node_set_input_count" }
        }
      val transitionNodeSetXfadeTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
            "transition_node_set_xfade_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transition_node_set_xfade_time" }
        }}
  }
}
