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

open class Animation(
  _handle: COpaquePointer
) : Resource(_handle) {
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

  fun addTrack(type: Int, atPosition: Int): Int {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(atPosition)
    val _ret = __method_bind.addTrack.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun animationTrackGetKeyAnimation(idx: Int, keyIdx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.animationTrackGetKeyAnimation.call(this._handle, _args.toVariant(), 2)
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
    val _ret = __method_bind.animationTrackInsertKey.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.animationTrackSetKeyAnimation.call(this._handle, _args.toVariant(), 3)
  }

  fun audioTrackGetKeyEndOffset(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.audioTrackGetKeyEndOffset.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun audioTrackGetKeyStartOffset(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.audioTrackGetKeyStartOffset.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun audioTrackGetKeyStream(idx: Int, keyIdx: Int): Resource {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.audioTrackGetKeyStream.call(this._handle, _args.toVariant(), 2)
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
    val _ret = __method_bind.audioTrackInsertKey.call(this._handle, _args.toVariant(), 5)
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
    __method_bind.audioTrackSetKeyEndOffset.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.audioTrackSetKeyStartOffset.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.audioTrackSetKeyStream.call(this._handle, _args.toVariant(), 3)
  }

  fun bezierTrackGetKeyInHandle(idx: Int, keyIdx: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.bezierTrackGetKeyInHandle.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun bezierTrackGetKeyOutHandle(idx: Int, keyIdx: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.bezierTrackGetKeyOutHandle.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun bezierTrackGetKeyValue(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.bezierTrackGetKeyValue.call(this._handle, _args.toVariant(), 2)
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
    val _ret = __method_bind.bezierTrackInsertKey.call(this._handle, _args.toVariant(), 5)
    return _ret.asInt()
  }

  fun bezierTrackInterpolate(track: Int, time: Float): Float {
    val _args = VariantArray.new()
    _args.append(track)
    _args.append(time)
    val _ret = __method_bind.bezierTrackInterpolate.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.bezierTrackSetKeyInHandle.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.bezierTrackSetKeyOutHandle.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.bezierTrackSetKeyValue.call(this._handle, _args.toVariant(), 3)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun copyTrack(track: Int, toAnimation: Animation) {
    val _args = VariantArray.new()
    _args.append(track)
    _args.append(toAnimation)
    __method_bind.copyTrack.call(this._handle, _args.toVariant(), 2)
  }

  fun findTrack(path: NodePath): Int {
    val _arg = Variant.new(path)
    val _ret = __method_bind.findTrack.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getLength(): Float {
    val _ret = __method_bind.getLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getStep(): Float {
    val _ret = __method_bind.getStep.call(this._handle)
    return _ret.asFloat()
  }

  fun getTrackCount(): Int {
    val _ret = __method_bind.getTrackCount.call(this._handle)
    return _ret.asInt()
  }

  fun hasLoop(): Boolean {
    val _ret = __method_bind.hasLoop.call(this._handle)
    return _ret.asBoolean()
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
    val _ret = __method_bind.methodTrackGetKeyIndices.call(this._handle, _args.toVariant(), 3)
    return _ret.asPoolIntArray()
  }

  fun methodTrackGetName(idx: Int, keyIdx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.methodTrackGetName.call(this._handle, _args.toVariant(), 2)
    return _ret.asString()
  }

  fun methodTrackGetParams(idx: Int, keyIdx: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.methodTrackGetParams.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun removeTrack(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.removeTrack.call(this._handle, _arg, 1)
  }

  fun setLength(timeSec: Float) {
    val _arg = Variant.new(timeSec)
    __method_bind.setLength.call(this._handle, _arg, 1)
  }

  fun setLoop(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setLoop.call(this._handle, _arg, 1)
  }

  fun setStep(sizeSec: Float) {
    val _arg = Variant.new(sizeSec)
    __method_bind.setStep.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.trackFindKey.call(this._handle, _args.toVariant(), 3)
    return _ret.asInt()
  }

  fun trackGetInterpolationLoopWrap(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.trackGetInterpolationLoopWrap.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun trackGetInterpolationType(idx: Int): InterpolationType {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.trackGetInterpolationType.call(this._handle, _arg, 1)
    return Animation.InterpolationType.from(_ret.asInt())
  }

  fun trackGetKeyCount(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.trackGetKeyCount.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun trackGetKeyTime(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.trackGetKeyTime.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun trackGetKeyTransition(idx: Int, keyIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.trackGetKeyTransition.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun trackGetKeyValue(idx: Int, keyIdx: Int): Variant {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    val _ret = __method_bind.trackGetKeyValue.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun trackGetPath(idx: Int): NodePath {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.trackGetPath.call(this._handle, _arg, 1)
    return _ret.asNodePath()
  }

  fun trackGetType(idx: Int): TrackType {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.trackGetType.call(this._handle, _arg, 1)
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
    __method_bind.trackInsertKey.call(this._handle, _args.toVariant(), 4)
  }

  fun trackIsEnabled(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.trackIsEnabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun trackIsImported(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.trackIsImported.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun trackMoveDown(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.trackMoveDown.call(this._handle, _arg, 1)
  }

  fun trackMoveTo(idx: Int, toIdx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(toIdx)
    __method_bind.trackMoveTo.call(this._handle, _args.toVariant(), 2)
  }

  fun trackMoveUp(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.trackMoveUp.call(this._handle, _arg, 1)
  }

  fun trackRemoveKey(idx: Int, keyIdx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(keyIdx)
    __method_bind.trackRemoveKey.call(this._handle, _args.toVariant(), 2)
  }

  fun trackRemoveKeyAtPosition(idx: Int, position: Float) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(position)
    __method_bind.trackRemoveKeyAtPosition.call(this._handle, _args.toVariant(), 2)
  }

  fun trackSetEnabled(idx: Int, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(enabled)
    __method_bind.trackSetEnabled.call(this._handle, _args.toVariant(), 2)
  }

  fun trackSetImported(idx: Int, imported: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(imported)
    __method_bind.trackSetImported.call(this._handle, _args.toVariant(), 2)
  }

  fun trackSetInterpolationLoopWrap(idx: Int, interpolation: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(interpolation)
    __method_bind.trackSetInterpolationLoopWrap.call(this._handle, _args.toVariant(), 2)
  }

  fun trackSetInterpolationType(idx: Int, interpolation: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(interpolation)
    __method_bind.trackSetInterpolationType.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.trackSetKeyTime.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.trackSetKeyTransition.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.trackSetKeyValue.call(this._handle, _args.toVariant(), 3)
  }

  fun trackSetPath(idx: Int, path: NodePath) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(path)
    __method_bind.trackSetPath.call(this._handle, _args.toVariant(), 2)
  }

  fun trackSwap(idx: Int, withIdx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(withIdx)
    __method_bind.trackSwap.call(this._handle, _args.toVariant(), 2)
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
    val _ret = __method_bind.transformTrackInsertKey.call(this._handle, _args.toVariant(), 5)
    return _ret.asInt()
  }

  fun transformTrackInterpolate(idx: Int, timeSec: Float): VariantArray {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(timeSec)
    val _ret = __method_bind.transformTrackInterpolate.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
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
    val _ret = __method_bind.valueTrackGetKeyIndices.call(this._handle, _args.toVariant(), 3)
    return _ret.asPoolIntArray()
  }

  fun valueTrackGetUpdateMode(idx: Int): UpdateMode {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.valueTrackGetUpdateMode.call(this._handle, _arg, 1)
    return Animation.UpdateMode.from(_ret.asInt())
  }

  fun valueTrackSetUpdateMode(idx: Int, mode: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(mode)
    __method_bind.valueTrackSetUpdateMode.call(this._handle, _args.toVariant(), 2)
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
      val addTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "addTrack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addTrack" }
        }
      val animationTrackGetKeyAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "animationTrackGetKeyAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animationTrackGetKeyAnimation" }
        }
      val animationTrackInsertKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "animationTrackInsertKey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animationTrackInsertKey" }
        }
      val animationTrackSetKeyAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "animationTrackSetKeyAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animationTrackSetKeyAnimation" }
        }
      val audioTrackGetKeyEndOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audioTrackGetKeyEndOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audioTrackGetKeyEndOffset" }
        }
      val audioTrackGetKeyStartOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audioTrackGetKeyStartOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audioTrackGetKeyStartOffset" }
        }
      val audioTrackGetKeyStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audioTrackGetKeyStream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audioTrackGetKeyStream" }
        }
      val audioTrackInsertKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audioTrackInsertKey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audioTrackInsertKey" }
        }
      val audioTrackSetKeyEndOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audioTrackSetKeyEndOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audioTrackSetKeyEndOffset" }
        }
      val audioTrackSetKeyStartOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audioTrackSetKeyStartOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audioTrackSetKeyStartOffset" }
        }
      val audioTrackSetKeyStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "audioTrackSetKeyStream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method audioTrackSetKeyStream" }
        }
      val bezierTrackGetKeyInHandle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezierTrackGetKeyInHandle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezierTrackGetKeyInHandle" }
        }
      val bezierTrackGetKeyOutHandle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezierTrackGetKeyOutHandle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezierTrackGetKeyOutHandle" }
        }
      val bezierTrackGetKeyValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezierTrackGetKeyValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezierTrackGetKeyValue" }
        }
      val bezierTrackInsertKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezierTrackInsertKey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezierTrackInsertKey" }
        }
      val bezierTrackInterpolate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezierTrackInterpolate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezierTrackInterpolate" }
        }
      val bezierTrackSetKeyInHandle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezierTrackSetKeyInHandle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezierTrackSetKeyInHandle" }
        }
      val bezierTrackSetKeyOutHandle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezierTrackSetKeyOutHandle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezierTrackSetKeyOutHandle" }
        }
      val bezierTrackSetKeyValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "bezierTrackSetKeyValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bezierTrackSetKeyValue" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val copyTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "copyTrack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copyTrack" }
        }
      val findTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "findTrack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method findTrack" }
        }
      val getLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "getLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLength" }
        }
      val getStep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "getStep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStep" }
        }
      val getTrackCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "getTrackCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTrackCount" }
        }
      val hasLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "hasLoop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasLoop" }
        }
      val methodTrackGetKeyIndices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "methodTrackGetKeyIndices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method methodTrackGetKeyIndices" }
        }
      val methodTrackGetName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "methodTrackGetName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method methodTrackGetName" }
        }
      val methodTrackGetParams: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "methodTrackGetParams".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method methodTrackGetParams" }
        }
      val removeTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "removeTrack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeTrack" }
        }
      val setLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "setLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLength" }
        }
      val setLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "setLoop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLoop" }
        }
      val setStep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "setStep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setStep" }
        }
      val trackFindKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackFindKey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackFindKey" }
        }
      val trackGetInterpolationLoopWrap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackGetInterpolationLoopWrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackGetInterpolationLoopWrap" }
        }
      val trackGetInterpolationType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackGetInterpolationType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackGetInterpolationType" }
        }
      val trackGetKeyCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackGetKeyCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackGetKeyCount" }
        }
      val trackGetKeyTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackGetKeyTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackGetKeyTime" }
        }
      val trackGetKeyTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackGetKeyTransition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackGetKeyTransition" }
        }
      val trackGetKeyValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackGetKeyValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackGetKeyValue" }
        }
      val trackGetPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackGetPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackGetPath" }
        }
      val trackGetType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackGetType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackGetType" }
        }
      val trackInsertKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackInsertKey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackInsertKey" }
        }
      val trackIsEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackIsEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackIsEnabled" }
        }
      val trackIsImported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackIsImported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackIsImported" }
        }
      val trackMoveDown: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackMoveDown".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackMoveDown" }
        }
      val trackMoveTo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackMoveTo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackMoveTo" }
        }
      val trackMoveUp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackMoveUp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackMoveUp" }
        }
      val trackRemoveKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackRemoveKey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackRemoveKey" }
        }
      val trackRemoveKeyAtPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackRemoveKeyAtPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackRemoveKeyAtPosition" }
        }
      val trackSetEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackSetEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackSetEnabled" }
        }
      val trackSetImported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackSetImported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackSetImported" }
        }
      val trackSetInterpolationLoopWrap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackSetInterpolationLoopWrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackSetInterpolationLoopWrap" }
        }
      val trackSetInterpolationType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackSetInterpolationType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackSetInterpolationType" }
        }
      val trackSetKeyTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackSetKeyTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackSetKeyTime" }
        }
      val trackSetKeyTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackSetKeyTransition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackSetKeyTransition" }
        }
      val trackSetKeyValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackSetKeyValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackSetKeyValue" }
        }
      val trackSetPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackSetPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackSetPath" }
        }
      val trackSwap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "trackSwap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method trackSwap" }
        }
      val transformTrackInsertKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "transformTrackInsertKey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transformTrackInsertKey" }
        }
      val transformTrackInterpolate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "transformTrackInterpolate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transformTrackInterpolate" }
        }
      val valueTrackGetKeyIndices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "valueTrackGetKeyIndices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method valueTrackGetKeyIndices" }
        }
      val valueTrackGetUpdateMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "valueTrackGetUpdateMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method valueTrackGetUpdateMode" }
        }
      val valueTrackSetUpdateMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Animation".cstr.ptr,
            "valueTrackSetUpdateMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method valueTrackSetUpdateMode" }
        }}
  }
}
