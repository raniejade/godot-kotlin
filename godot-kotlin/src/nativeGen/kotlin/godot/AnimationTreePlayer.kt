// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class AnimationTreePlayer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for basePath
   */
  fun basePath(cb: NodePath.() -> Unit) {
    val _p = basePath
    cb(_p)
    basePath = _p
  }

  /**
   * Specialized setter for masterPlayer
   */
  fun masterPlayer(cb: NodePath.() -> Unit) {
    val _p = masterPlayer
    cb(_p)
    masterPlayer = _p
  }

  fun addNode(type: Int, id: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(id)
      __method_bind.addNode.call(self._handle, _args, null)
    }
  }

  fun advance(delta: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.advance.call(self._handle, listOf(delta), null)
    }
  }

  fun animationNodeGetAnimation(id: String): Animation {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Animation
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.animationNodeGetAnimation.call(self._handle, listOf(id), _retPtr)
      _ret = objectToType<Animation>(_tmp.value!!)
      _ret
    }
  }

  fun animationNodeGetMasterAnimation(id: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.animationNodeGetMasterAnimation.call(self._handle, listOf(id), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun animationNodeGetPosition(id: String): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.animationNodeGetPosition.call(self._handle, listOf(id), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun animationNodeSetAnimation(id: String, animation: Animation) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(animation)
      __method_bind.animationNodeSetAnimation.call(self._handle, _args, null)
    }
  }

  fun animationNodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(path)
      _args.add(enable)
      __method_bind.animationNodeSetFilterPath.call(self._handle, _args, null)
    }
  }

  fun animationNodeSetMasterAnimation(id: String, source: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(source)
      __method_bind.animationNodeSetMasterAnimation.call(self._handle, _args, null)
    }
  }

  fun areNodesConnected(
    id: String,
    dstId: String,
    dstInputIdx: Int
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(dstId)
      _args.add(dstInputIdx)
      __method_bind.areNodesConnected.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun blend2NodeGetAmount(id: String): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.blend2NodeGetAmount.call(self._handle, listOf(id), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun blend2NodeSetAmount(id: String, blend: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(blend)
      __method_bind.blend2NodeSetAmount.call(self._handle, _args, null)
    }
  }

  fun blend2NodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(path)
      _args.add(enable)
      __method_bind.blend2NodeSetFilterPath.call(self._handle, _args, null)
    }
  }

  fun blend3NodeGetAmount(id: String): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.blend3NodeGetAmount.call(self._handle, listOf(id), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun blend3NodeSetAmount(id: String, blend: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(blend)
      __method_bind.blend3NodeSetAmount.call(self._handle, _args, null)
    }
  }

  fun blend4NodeGetAmount(id: String): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.blend4NodeGetAmount.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun blend4NodeSetAmount(id: String, blend: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(blend)
      __method_bind.blend4NodeSetAmount.call(self._handle, _args, null)
    }
  }

  fun connectNodes(
    id: String,
    dstId: String,
    dstInputIdx: Int
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(dstId)
      _args.add(dstInputIdx)
      __method_bind.connectNodes.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun disconnectNodes(id: String, dstInputIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(dstInputIdx)
      __method_bind.disconnectNodes.call(self._handle, _args, null)
    }
  }

  fun getAnimationProcessMode(): AnimationProcessMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAnimationProcessMode.call(self._handle, emptyList(), _retPtr)
      AnimationTreePlayer.AnimationProcessMode.from(_ret.value)
    }
  }

  fun getBasePath(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getBasePath.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMasterPlayer(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getMasterPlayer.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNodeList(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getNodeList.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isActive(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isActive.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun mixNodeGetAmount(id: String): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.mixNodeGetAmount.call(self._handle, listOf(id), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun mixNodeSetAmount(id: String, ratio: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(ratio)
      __method_bind.mixNodeSetAmount.call(self._handle, _args, null)
    }
  }

  fun nodeExists(node: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.nodeExists.call(self._handle, listOf(node), _retPtr)
      _ret.value
    }
  }

  fun nodeGetInputCount(id: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.nodeGetInputCount.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun nodeGetInputSource(id: String, idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(idx)
      __method_bind.nodeGetInputSource.call(self._handle, _args, _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun nodeGetPosition(id: String): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.nodeGetPosition.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun nodeGetType(id: String): NodeType {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.nodeGetType.call(self._handle, listOf(id), _retPtr)
      AnimationTreePlayer.NodeType.from(_ret.value)
    }
  }

  fun nodeRename(node: String, newName: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(node)
      _args.add(newName)
      __method_bind.nodeRename.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun nodeSetPosition(id: String, screenPosition: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(screenPosition)
      __method_bind.nodeSetPosition.call(self._handle, _args, null)
    }
  }

  fun oneshotNodeGetAutorestartDelay(id: String): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.oneshotNodeGetAutorestartDelay.call(self._handle, listOf(id), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun oneshotNodeGetAutorestartRandomDelay(id: String): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.oneshotNodeGetAutorestartRandomDelay.call(self._handle, listOf(id), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun oneshotNodeGetFadeinTime(id: String): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.oneshotNodeGetFadeinTime.call(self._handle, listOf(id), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun oneshotNodeGetFadeoutTime(id: String): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.oneshotNodeGetFadeoutTime.call(self._handle, listOf(id), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun oneshotNodeHasAutorestart(id: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.oneshotNodeHasAutorestart.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun oneshotNodeIsActive(id: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.oneshotNodeIsActive.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun oneshotNodeSetAutorestart(id: String, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(enable)
      __method_bind.oneshotNodeSetAutorestart.call(self._handle, _args, null)
    }
  }

  fun oneshotNodeSetAutorestartDelay(id: String, delaySec: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(delaySec)
      __method_bind.oneshotNodeSetAutorestartDelay.call(self._handle, _args, null)
    }
  }

  fun oneshotNodeSetAutorestartRandomDelay(id: String, randSec: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(randSec)
      __method_bind.oneshotNodeSetAutorestartRandomDelay.call(self._handle, _args, null)
    }
  }

  fun oneshotNodeSetFadeinTime(id: String, timeSec: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(timeSec)
      __method_bind.oneshotNodeSetFadeinTime.call(self._handle, _args, null)
    }
  }

  fun oneshotNodeSetFadeoutTime(id: String, timeSec: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(timeSec)
      __method_bind.oneshotNodeSetFadeoutTime.call(self._handle, _args, null)
    }
  }

  fun oneshotNodeSetFilterPath(
    id: String,
    path: NodePath,
    enable: Boolean
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(path)
      _args.add(enable)
      __method_bind.oneshotNodeSetFilterPath.call(self._handle, _args, null)
    }
  }

  fun oneshotNodeStart(id: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.oneshotNodeStart.call(self._handle, listOf(id), null)
    }
  }

  fun oneshotNodeStop(id: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.oneshotNodeStop.call(self._handle, listOf(id), null)
    }
  }

  fun recomputeCaches() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.recomputeCaches.call(self._handle, emptyList(), null)
    }
  }

  fun removeNode(id: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeNode.call(self._handle, listOf(id), null)
    }
  }

  fun reset() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.reset.call(self._handle, emptyList(), null)
    }
  }

  fun setActive(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setActive.call(self._handle, listOf(enabled), null)
    }
  }

  fun setAnimationProcessMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAnimationProcessMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setBasePath(path: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBasePath.call(self._handle, listOf(path), null)
    }
  }

  fun setMasterPlayer(nodepath: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMasterPlayer.call(self._handle, listOf(nodepath), null)
    }
  }

  fun timescaleNodeGetScale(id: String): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.timescaleNodeGetScale.call(self._handle, listOf(id), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun timescaleNodeSetScale(id: String, scale: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(scale)
      __method_bind.timescaleNodeSetScale.call(self._handle, _args, null)
    }
  }

  fun timeseekNodeSeek(id: String, seconds: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(seconds)
      __method_bind.timeseekNodeSeek.call(self._handle, _args, null)
    }
  }

  fun transitionNodeDeleteInput(id: String, inputIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(inputIdx)
      __method_bind.transitionNodeDeleteInput.call(self._handle, _args, null)
    }
  }

  fun transitionNodeGetCurrent(id: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.transitionNodeGetCurrent.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun transitionNodeGetInputCount(id: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.transitionNodeGetInputCount.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun transitionNodeGetXfadeTime(id: String): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.transitionNodeGetXfadeTime.call(self._handle, listOf(id), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun transitionNodeHasInputAutoAdvance(id: String, inputIdx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(inputIdx)
      __method_bind.transitionNodeHasInputAutoAdvance.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun transitionNodeSetCurrent(id: String, inputIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(inputIdx)
      __method_bind.transitionNodeSetCurrent.call(self._handle, _args, null)
    }
  }

  fun transitionNodeSetInputAutoAdvance(
    id: String,
    inputIdx: Int,
    enable: Boolean
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(inputIdx)
      _args.add(enable)
      __method_bind.transitionNodeSetInputAutoAdvance.call(self._handle, _args, null)
    }
  }

  fun transitionNodeSetInputCount(id: String, count: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(count)
      __method_bind.transitionNodeSetInputCount.call(self._handle, _args, null)
    }
  }

  fun transitionNodeSetXfadeTime(id: String, timeSec: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(timeSec)
      __method_bind.transitionNodeSetXfadeTime.call(self._handle, _args, null)
    }
  }

  enum class AnimationProcessMode(
    val value: Int
  ) {
    PHYSICS(0),

    IDLE(1);

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
    OUTPUT(0),

    ANIMATION(1),

    ONESHOT(2),

    MIX(3),

    BLEND2(4),

    BLEND3(5),

    BLEND4(6),

    TIMESCALE(7),

    TIMESEEK(8),

    TRANSITION(9);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationTreePlayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationTreePlayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AnimationTreePlayer
     */
    private object __method_bind {
      val addNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "add_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_node" }
            }
          }

      val advance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "advance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method advance" }
            }
          }

      val animationNodeGetAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "animation_node_get_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method animation_node_get_animation" }
            }
          }

      val animationNodeGetMasterAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "animation_node_get_master_animation".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method animation_node_get_master_animation" }
            }
          }

      val animationNodeGetPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "animation_node_get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method animation_node_get_position" }
            }
          }

      val animationNodeSetAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "animation_node_set_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method animation_node_set_animation" }
            }
          }

      val animationNodeSetFilterPath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "animation_node_set_filter_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method animation_node_set_filter_path"
              }
            }
          }

      val animationNodeSetMasterAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "animation_node_set_master_animation".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method animation_node_set_master_animation" }
            }
          }

      val areNodesConnected: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "are_nodes_connected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method are_nodes_connected" }
            }
          }

      val blend2NodeGetAmount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "blend2_node_get_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend2_node_get_amount" }
            }
          }

      val blend2NodeSetAmount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "blend2_node_set_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend2_node_set_amount" }
            }
          }

      val blend2NodeSetFilterPath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "blend2_node_set_filter_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend2_node_set_filter_path" }
            }
          }

      val blend3NodeGetAmount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "blend3_node_get_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend3_node_get_amount" }
            }
          }

      val blend3NodeSetAmount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "blend3_node_set_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend3_node_set_amount" }
            }
          }

      val blend4NodeGetAmount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "blend4_node_get_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend4_node_get_amount" }
            }
          }

      val blend4NodeSetAmount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "blend4_node_set_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend4_node_set_amount" }
            }
          }

      val connectNodes: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "connect_nodes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_nodes" }
            }
          }

      val disconnectNodes: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "disconnect_nodes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_nodes" }
            }
          }

      val getAnimationProcessMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "get_animation_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation_process_mode" }
            }
          }

      val getBasePath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "get_base_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_path" }
            }
          }

      val getMasterPlayer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "get_master_player".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_master_player" }
            }
          }

      val getNodeList: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "get_node_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_list" }
            }
          }

      val isActive: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_active" }
            }
          }

      val mixNodeGetAmount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "mix_node_get_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mix_node_get_amount" }
            }
          }

      val mixNodeSetAmount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "mix_node_set_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mix_node_set_amount" }
            }
          }

      val nodeExists: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "node_exists".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method node_exists" }
            }
          }

      val nodeGetInputCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "node_get_input_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method node_get_input_count" }
            }
          }

      val nodeGetInputSource: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "node_get_input_source".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method node_get_input_source" }
            }
          }

      val nodeGetPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "node_get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method node_get_position" }
            }
          }

      val nodeGetType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "node_get_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method node_get_type" }
            }
          }

      val nodeRename: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "node_rename".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method node_rename" }
            }
          }

      val nodeSetPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "node_set_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method node_set_position" }
            }
          }

      val oneshotNodeGetAutorestartDelay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_get_autorestart_delay".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method oneshot_node_get_autorestart_delay" }
            }
          }

      val oneshotNodeGetAutorestartRandomDelay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_get_autorestart_random_delay".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method oneshot_node_get_autorestart_random_delay" }
            }
          }

      val oneshotNodeGetFadeinTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_get_fadein_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_get_fadein_time" }
            }
          }

      val oneshotNodeGetFadeoutTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_get_fadeout_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_get_fadeout_time"
              }
            }
          }

      val oneshotNodeHasAutorestart: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_has_autorestart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_has_autorestart" }
            }
          }

      val oneshotNodeIsActive: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_is_active" }
            }
          }

      val oneshotNodeSetAutorestart: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_set_autorestart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_autorestart" }
            }
          }

      val oneshotNodeSetAutorestartDelay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_set_autorestart_delay".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method oneshot_node_set_autorestart_delay" }
            }
          }

      val oneshotNodeSetAutorestartRandomDelay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_set_autorestart_random_delay".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method oneshot_node_set_autorestart_random_delay" }
            }
          }

      val oneshotNodeSetFadeinTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_set_fadein_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_fadein_time" }
            }
          }

      val oneshotNodeSetFadeoutTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_set_fadeout_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_fadeout_time"
              }
            }
          }

      val oneshotNodeSetFilterPath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_set_filter_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_set_filter_path" }
            }
          }

      val oneshotNodeStart: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_start".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_start" }
            }
          }

      val oneshotNodeStop: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "oneshot_node_stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method oneshot_node_stop" }
            }
          }

      val recomputeCaches: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "recompute_caches".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method recompute_caches" }
            }
          }

      val removeNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "remove_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_node" }
            }
          }

      val reset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "reset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reset" }
            }
          }

      val setActive: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "set_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_active" }
            }
          }

      val setAnimationProcessMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "set_animation_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_animation_process_mode" }
            }
          }

      val setBasePath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "set_base_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_path" }
            }
          }

      val setMasterPlayer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "set_master_player".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_master_player" }
            }
          }

      val timescaleNodeGetScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "timescale_node_get_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method timescale_node_get_scale" }
            }
          }

      val timescaleNodeSetScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "timescale_node_set_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method timescale_node_set_scale" }
            }
          }

      val timeseekNodeSeek: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "timeseek_node_seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method timeseek_node_seek" }
            }
          }

      val transitionNodeDeleteInput: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_delete_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method transition_node_delete_input" }
            }
          }

      val transitionNodeGetCurrent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_get_current".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method transition_node_get_current" }
            }
          }

      val transitionNodeGetInputCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_get_input_count".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method transition_node_get_input_count" }
            }
          }

      val transitionNodeGetXfadeTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_get_xfade_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method transition_node_get_xfade_time"
              }
            }
          }

      val transitionNodeHasInputAutoAdvance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_has_input_auto_advance".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method transition_node_has_input_auto_advance" }
            }
          }

      val transitionNodeSetCurrent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_set_current".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method transition_node_set_current" }
            }
          }

      val transitionNodeSetInputAutoAdvance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_set_input_auto_advance".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method transition_node_set_input_auto_advance" }
            }
          }

      val transitionNodeSetInputCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTreePlayer".cstr.ptr,
              "transition_node_set_input_count".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method transition_node_set_input_count" }
            }
          }

      val transitionNodeSetXfadeTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
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
