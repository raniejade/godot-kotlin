// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
import kotlin.Suppress
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

open class Animation(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
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

  /**
   * Animation::tracks_changed signal
   */
  val signalTracksChanged: Signal0 = Signal0("tracks_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addTrack(type: Int, atPosition: Int = -1): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(atPosition)
      __method_bind.addTrack.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun animationTrackGetKeyAnimation(trackIdx: Int, keyIdx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      __method_bind.animationTrackGetKeyAnimation.call(self._handle, _args, _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun animationTrackInsertKey(
    trackIdx: Int,
    time: Float,
    animation: String
  ): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(time)
      _args.add(animation)
      __method_bind.animationTrackInsertKey.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun animationTrackSetKeyAnimation(
    trackIdx: Int,
    keyIdx: Int,
    animation: String
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      _args.add(animation)
      __method_bind.animationTrackSetKeyAnimation.call(self._handle, _args, null)
    }
  }

  fun audioTrackGetKeyEndOffset(trackIdx: Int, keyIdx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      __method_bind.audioTrackGetKeyEndOffset.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun audioTrackGetKeyStartOffset(trackIdx: Int, keyIdx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      __method_bind.audioTrackGetKeyStartOffset.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun audioTrackGetKeyStream(trackIdx: Int, keyIdx: Int): Resource {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Resource
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      __method_bind.audioTrackGetKeyStream.call(self._handle, _args, _retPtr)
      _ret = objectToType<Resource>(_tmp.value!!)
      _ret
    }
  }

  fun audioTrackInsertKey(
    trackIdx: Int,
    time: Float,
    stream: Resource,
    startOffset: Float = 0.0f,
    endOffset: Float = 0.0f
  ): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(time)
      _args.add(stream)
      _args.add(startOffset)
      _args.add(endOffset)
      __method_bind.audioTrackInsertKey.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun audioTrackSetKeyEndOffset(
    trackIdx: Int,
    keyIdx: Int,
    offset: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      _args.add(offset)
      __method_bind.audioTrackSetKeyEndOffset.call(self._handle, _args, null)
    }
  }

  fun audioTrackSetKeyStartOffset(
    trackIdx: Int,
    keyIdx: Int,
    offset: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      _args.add(offset)
      __method_bind.audioTrackSetKeyStartOffset.call(self._handle, _args, null)
    }
  }

  fun audioTrackSetKeyStream(
    trackIdx: Int,
    keyIdx: Int,
    stream: Resource
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      _args.add(stream)
      __method_bind.audioTrackSetKeyStream.call(self._handle, _args, null)
    }
  }

  fun bezierTrackGetKeyInHandle(trackIdx: Int, keyIdx: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      __method_bind.bezierTrackGetKeyInHandle.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun bezierTrackGetKeyOutHandle(trackIdx: Int, keyIdx: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      __method_bind.bezierTrackGetKeyOutHandle.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun bezierTrackGetKeyValue(trackIdx: Int, keyIdx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      __method_bind.bezierTrackGetKeyValue.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun bezierTrackInsertKey(
    trackIdx: Int,
    time: Float,
    value: Float,
    inHandle: Vector2 = Vector2(0, 0),
    outHandle: Vector2 = Vector2(0, 0)
  ): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(time)
      _args.add(value)
      _args.add(inHandle)
      _args.add(outHandle)
      __method_bind.bezierTrackInsertKey.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun bezierTrackInterpolate(trackIdx: Int, time: Float): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(time)
      __method_bind.bezierTrackInterpolate.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun bezierTrackSetKeyInHandle(
    trackIdx: Int,
    keyIdx: Int,
    inHandle: Vector2
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      _args.add(inHandle)
      __method_bind.bezierTrackSetKeyInHandle.call(self._handle, _args, null)
    }
  }

  fun bezierTrackSetKeyOutHandle(
    trackIdx: Int,
    keyIdx: Int,
    outHandle: Vector2
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      _args.add(outHandle)
      __method_bind.bezierTrackSetKeyOutHandle.call(self._handle, _args, null)
    }
  }

  fun bezierTrackSetKeyValue(
    trackIdx: Int,
    keyIdx: Int,
    value: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      _args.add(value)
      __method_bind.bezierTrackSetKeyValue.call(self._handle, _args, null)
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun copyTrack(trackIdx: Int, toAnimation: Animation) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(toAnimation)
      __method_bind.copyTrack.call(self._handle, _args, null)
    }
  }

  fun findTrack(path: NodePath): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.findTrack.call(self._handle, listOf(path), _retPtr)
      _ret.value
    }
  }

  fun getLength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getStep(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStep.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTrackCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTrackCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun hasLoop(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasLoop.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun methodTrackGetKeyIndices(
    trackIdx: Int,
    timeSec: Float,
    delta: Float
  ): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(timeSec)
      _args.add(delta)
      __method_bind.methodTrackGetKeyIndices.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun methodTrackGetName(trackIdx: Int, keyIdx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      __method_bind.methodTrackGetName.call(self._handle, _args, _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun methodTrackGetParams(trackIdx: Int, keyIdx: Int): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      __method_bind.methodTrackGetParams.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun removeTrack(trackIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeTrack.call(self._handle, listOf(trackIdx), null)
    }
  }

  fun setLength(timeSec: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLength.call(self._handle, listOf(timeSec), null)
    }
  }

  fun setLoop(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLoop.call(self._handle, listOf(enabled), null)
    }
  }

  fun setStep(sizeSec: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStep.call(self._handle, listOf(sizeSec), null)
    }
  }

  fun trackFindKey(
    trackIdx: Int,
    time: Float,
    exact: Boolean = false
  ): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(time)
      _args.add(exact)
      __method_bind.trackFindKey.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun trackGetInterpolationLoopWrap(trackIdx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.trackGetInterpolationLoopWrap.call(self._handle, listOf(trackIdx), _retPtr)
      _ret.value
    }
  }

  fun trackGetInterpolationType(trackIdx: Int): InterpolationType {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.trackGetInterpolationType.call(self._handle, listOf(trackIdx), _retPtr)
      Animation.InterpolationType.from(_ret.value)
    }
  }

  fun trackGetKeyCount(trackIdx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.trackGetKeyCount.call(self._handle, listOf(trackIdx), _retPtr)
      _ret.value
    }
  }

  fun trackGetKeyTime(trackIdx: Int, keyIdx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      __method_bind.trackGetKeyTime.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun trackGetKeyTransition(trackIdx: Int, keyIdx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      __method_bind.trackGetKeyTransition.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun trackGetKeyValue(trackIdx: Int, keyIdx: Int): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      __method_bind.trackGetKeyValue.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun trackGetPath(trackIdx: Int): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.trackGetPath.call(self._handle, listOf(trackIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun trackGetType(trackIdx: Int): TrackType {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.trackGetType.call(self._handle, listOf(trackIdx), _retPtr)
      Animation.TrackType.from(_ret.value)
    }
  }

  fun trackInsertKey(
    trackIdx: Int,
    time: Float,
    key: Variant,
    transition: Float = 1.0f
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(time)
      _args.add(key)
      _args.add(transition)
      __method_bind.trackInsertKey.call(self._handle, _args, null)
    }
  }

  fun trackIsEnabled(trackIdx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.trackIsEnabled.call(self._handle, listOf(trackIdx), _retPtr)
      _ret.value
    }
  }

  fun trackIsImported(trackIdx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.trackIsImported.call(self._handle, listOf(trackIdx), _retPtr)
      _ret.value
    }
  }

  fun trackMoveDown(trackIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.trackMoveDown.call(self._handle, listOf(trackIdx), null)
    }
  }

  fun trackMoveTo(trackIdx: Int, toIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(toIdx)
      __method_bind.trackMoveTo.call(self._handle, _args, null)
    }
  }

  fun trackMoveUp(trackIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.trackMoveUp.call(self._handle, listOf(trackIdx), null)
    }
  }

  fun trackRemoveKey(trackIdx: Int, keyIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      __method_bind.trackRemoveKey.call(self._handle, _args, null)
    }
  }

  fun trackRemoveKeyAtPosition(trackIdx: Int, position: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(position)
      __method_bind.trackRemoveKeyAtPosition.call(self._handle, _args, null)
    }
  }

  fun trackSetEnabled(trackIdx: Int, enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(enabled)
      __method_bind.trackSetEnabled.call(self._handle, _args, null)
    }
  }

  fun trackSetImported(trackIdx: Int, imported: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(imported)
      __method_bind.trackSetImported.call(self._handle, _args, null)
    }
  }

  fun trackSetInterpolationLoopWrap(trackIdx: Int, interpolation: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(interpolation)
      __method_bind.trackSetInterpolationLoopWrap.call(self._handle, _args, null)
    }
  }

  fun trackSetInterpolationType(trackIdx: Int, interpolation: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(interpolation)
      __method_bind.trackSetInterpolationType.call(self._handle, _args, null)
    }
  }

  fun trackSetKeyTime(
    trackIdx: Int,
    keyIdx: Int,
    time: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      _args.add(time)
      __method_bind.trackSetKeyTime.call(self._handle, _args, null)
    }
  }

  fun trackSetKeyTransition(
    trackIdx: Int,
    keyIdx: Int,
    transition: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(keyIdx)
      _args.add(transition)
      __method_bind.trackSetKeyTransition.call(self._handle, _args, null)
    }
  }

  fun trackSetKeyValue(
    trackIdx: Int,
    key: Int,
    value: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(key)
      _args.add(value)
      __method_bind.trackSetKeyValue.call(self._handle, _args, null)
    }
  }

  fun trackSetPath(trackIdx: Int, path: NodePath) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(path)
      __method_bind.trackSetPath.call(self._handle, _args, null)
    }
  }

  fun trackSwap(trackIdx: Int, withIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(withIdx)
      __method_bind.trackSwap.call(self._handle, _args, null)
    }
  }

  fun transformTrackInsertKey(
    trackIdx: Int,
    time: Float,
    location: Vector3,
    rotation: Quat,
    scale: Vector3
  ): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(time)
      _args.add(location)
      _args.add(rotation)
      _args.add(scale)
      __method_bind.transformTrackInsertKey.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun transformTrackInterpolate(trackIdx: Int, timeSec: Float): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(timeSec)
      __method_bind.transformTrackInterpolate.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun valueTrackGetKeyIndices(
    trackIdx: Int,
    timeSec: Float,
    delta: Float
  ): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(timeSec)
      _args.add(delta)
      __method_bind.valueTrackGetKeyIndices.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun valueTrackGetUpdateMode(trackIdx: Int): UpdateMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.valueTrackGetUpdateMode.call(self._handle, listOf(trackIdx), _retPtr)
      Animation.UpdateMode.from(_ret.value)
    }
  }

  fun valueTrackSetUpdateMode(trackIdx: Int, mode: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(trackIdx)
      _args.add(mode)
      __method_bind.valueTrackSetUpdateMode.call(self._handle, _args, null)
    }
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
    CONTINUOUS(0),

    DISCRETE(1),

    TRIGGER(2),

    CAPTURE(3);

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
    NEAREST(0),

    LINEAR(1),

    CUBIC(2);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Animation".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Animation" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Animation
     */
    private object __method_bind {
      val addTrack: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "add_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_track" }
        }
      val animationTrackGetKeyAnimation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "animation_track_get_key_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_track_get_key_animation"
            }
        }
      val animationTrackInsertKey: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "animation_track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_track_insert_key" }
        }
      val animationTrackSetKeyAnimation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "animation_track_set_key_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_track_set_key_animation"
            }
        }
      val audioTrackGetKeyEndOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_get_key_end_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_get_key_end_offset" }
        }
      val audioTrackGetKeyStartOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_get_key_start_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_get_key_start_offset" }
        }
      val audioTrackGetKeyStream: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_get_key_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_get_key_stream" }
        }
      val audioTrackInsertKey: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_insert_key" }
        }
      val audioTrackSetKeyEndOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_set_key_end_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_set_key_end_offset" }
        }
      val audioTrackSetKeyStartOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_set_key_start_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_set_key_start_offset" }
        }
      val audioTrackSetKeyStream: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audio_track_set_key_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audio_track_set_key_stream" }
        }
      val bezierTrackGetKeyInHandle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_get_key_in_handle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_get_key_in_handle" }
        }
      val bezierTrackGetKeyOutHandle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_get_key_out_handle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_get_key_out_handle" }
        }
      val bezierTrackGetKeyValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_get_key_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_get_key_value" }
        }
      val bezierTrackInsertKey: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_insert_key" }
        }
      val bezierTrackInterpolate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_interpolate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_interpolate" }
        }
      val bezierTrackSetKeyInHandle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_set_key_in_handle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_set_key_in_handle" }
        }
      val bezierTrackSetKeyOutHandle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_set_key_out_handle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_set_key_out_handle" }
        }
      val bezierTrackSetKeyValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezier_track_set_key_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezier_track_set_key_value" }
        }
      val clear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val copyTrack: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "copy_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copy_track" }
        }
      val findTrack: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "find_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_track" }
        }
      val getLength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "get_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_length" }
        }
      val getStep: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "get_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_step" }
        }
      val getTrackCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "get_track_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_track_count" }
        }
      val hasLoop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "has_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_loop" }
        }
      val methodTrackGetKeyIndices: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "method_track_get_key_indices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method method_track_get_key_indices" }
        }
      val methodTrackGetName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "method_track_get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method method_track_get_name" }
        }
      val methodTrackGetParams: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "method_track_get_params".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method method_track_get_params" }
        }
      val removeTrack: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "remove_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_track" }
        }
      val setLength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "set_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_length" }
        }
      val setLoop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "set_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop" }
        }
      val setStep: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "set_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_step" }
        }
      val trackFindKey: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_find_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_find_key" }
        }
      val trackGetInterpolationLoopWrap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_interpolation_loop_wrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_interpolation_loop_wrap"
            }
        }
      val trackGetInterpolationType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_interpolation_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_interpolation_type" }
        }
      val trackGetKeyCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_key_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_key_count" }
        }
      val trackGetKeyTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_key_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_key_time" }
        }
      val trackGetKeyTransition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_key_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_key_transition" }
        }
      val trackGetKeyValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_key_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_key_value" }
        }
      val trackGetPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_path" }
        }
      val trackGetType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_get_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_get_type" }
        }
      val trackInsertKey: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_insert_key" }
        }
      val trackIsEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_is_enabled" }
        }
      val trackIsImported: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_is_imported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_is_imported" }
        }
      val trackMoveDown: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_move_down".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_move_down" }
        }
      val trackMoveTo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_move_to".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_move_to" }
        }
      val trackMoveUp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_move_up".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_move_up" }
        }
      val trackRemoveKey: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_remove_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_remove_key" }
        }
      val trackRemoveKeyAtPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_remove_key_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_remove_key_at_position" }
        }
      val trackSetEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_enabled" }
        }
      val trackSetImported: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_imported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_imported" }
        }
      val trackSetInterpolationLoopWrap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_interpolation_loop_wrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_interpolation_loop_wrap"
            }
        }
      val trackSetInterpolationType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_interpolation_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_interpolation_type" }
        }
      val trackSetKeyTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_key_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_key_time" }
        }
      val trackSetKeyTransition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_key_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_key_transition" }
        }
      val trackSetKeyValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_key_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_key_value" }
        }
      val trackSetPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_set_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_set_path" }
        }
      val trackSwap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "track_swap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method track_swap" }
        }
      val transformTrackInsertKey: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "transform_track_insert_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transform_track_insert_key" }
        }
      val transformTrackInterpolate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "transform_track_interpolate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transform_track_interpolate" }
        }
      val valueTrackGetKeyIndices: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "value_track_get_key_indices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method value_track_get_key_indices" }
        }
      val valueTrackGetUpdateMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "value_track_get_update_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method value_track_get_update_mode" }
        }
      val valueTrackSetUpdateMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "value_track_set_update_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method value_track_set_update_mode" }
        }}
  }
}
