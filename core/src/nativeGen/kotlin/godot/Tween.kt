// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
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

open class Tween(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  var playbackProcessMode: TweenProcessMode
    get() {
       return getTweenProcessMode() 
    }
    set(value) {
      setTweenProcessMode(value.value)
    }

  var playbackSpeed: Float
    get() {
       return getSpeedScale() 
    }
    set(value) {
      setSpeedScale(value)
    }

  var repeat: Boolean
    get() {
       return isRepeat() 
    }
    set(value) {
      setRepeat(value)
    }

  /**
   * Tween::tween_all_completed signal
   */
  val signalTweenAllCompleted: Signal0 = Signal0("tween_all_completed")

  /**
   * Tween::tween_completed signal
   */
  val signalTweenCompleted: Signal2<Object, NodePath> = Signal2("tween_completed")

  /**
   * Tween::tween_started signal
   */
  val signalTweenStarted: Signal2<Object, NodePath> = Signal2("tween_started")

  /**
   * Tween::tween_step signal
   */
  val signalTweenStep: Signal4<Object, NodePath, Float, Object> = Signal4("tween_step")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun followMethod(
    `object`: Object,
    method: String,
    initialVal: Variant,
    target: Object,
    targetMethod: String,
    duration: Float,
    transType: Int = 0,
    easeType: Int = 2,
    delay: Float = 0.0f
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(method)
      _args.add(initialVal)
      _args.add(target)
      _args.add(targetMethod)
      _args.add(duration)
      _args.add(transType)
      _args.add(easeType)
      _args.add(delay)
      __method_bind.followMethod.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun followProperty(
    `object`: Object,
    property: NodePath,
    initialVal: Variant,
    target: Object,
    targetProperty: NodePath,
    duration: Float,
    transType: Int = 0,
    easeType: Int = 2,
    delay: Float = 0.0f
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(property)
      _args.add(initialVal)
      _args.add(target)
      _args.add(targetProperty)
      _args.add(duration)
      _args.add(transType)
      _args.add(easeType)
      _args.add(delay)
      __method_bind.followProperty.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun getRuntime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRuntime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSpeedScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpeedScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTweenProcessMode(): TweenProcessMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTweenProcessMode.call(self._handle, emptyList(), _retPtr)
      Tween.TweenProcessMode.from(_ret.value)
    }
  }

  fun interpolateCallback(
    `object`: Object,
    duration: Float,
    callback: String,
    arg1: Variant,
    arg2: Variant,
    arg3: Variant,
    arg4: Variant,
    arg5: Variant
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(duration)
      _args.add(callback)
      _args.add(arg1)
      _args.add(arg2)
      _args.add(arg3)
      _args.add(arg4)
      _args.add(arg5)
      __method_bind.interpolateCallback.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun interpolateDeferredCallback(
    `object`: Object,
    duration: Float,
    callback: String,
    arg1: Variant,
    arg2: Variant,
    arg3: Variant,
    arg4: Variant,
    arg5: Variant
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(duration)
      _args.add(callback)
      _args.add(arg1)
      _args.add(arg2)
      _args.add(arg3)
      _args.add(arg4)
      _args.add(arg5)
      __method_bind.interpolateDeferredCallback.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun interpolateMethod(
    `object`: Object,
    method: String,
    initialVal: Variant,
    finalVal: Variant,
    duration: Float,
    transType: Int = 0,
    easeType: Int = 2,
    delay: Float = 0.0f
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(method)
      _args.add(initialVal)
      _args.add(finalVal)
      _args.add(duration)
      _args.add(transType)
      _args.add(easeType)
      _args.add(delay)
      __method_bind.interpolateMethod.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun interpolateProperty(
    `object`: Object,
    property: NodePath,
    initialVal: Variant,
    finalVal: Variant,
    duration: Float,
    transType: Int = 0,
    easeType: Int = 2,
    delay: Float = 0.0f
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(property)
      _args.add(initialVal)
      _args.add(finalVal)
      _args.add(duration)
      _args.add(transType)
      _args.add(easeType)
      _args.add(delay)
      __method_bind.interpolateProperty.call(self._handle, _args, _retPtr)
      _ret.value
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

  fun isRepeat(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRepeat.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun remove(`object`: Object, key: String = ""): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(key)
      __method_bind.remove.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun removeAll(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.removeAll.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun reset(`object`: Object, key: String = ""): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(key)
      __method_bind.reset.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun resetAll(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.resetAll.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun resume(`object`: Object, key: String = ""): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(key)
      __method_bind.resume.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun resumeAll(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.resumeAll.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun seek(time: Float): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.seek.call(self._handle, listOf(time), _retPtr)
      _ret.value
    }
  }

  fun setActive(active: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setActive.call(self._handle, listOf(active), null)
    }
  }

  fun setRepeat(repeat: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRepeat.call(self._handle, listOf(repeat), null)
    }
  }

  fun setSpeedScale(speed: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpeedScale.call(self._handle, listOf(speed), null)
    }
  }

  fun setTweenProcessMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTweenProcessMode.call(self._handle, listOf(mode), null)
    }
  }

  fun start(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.start.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun stop(`object`: Object, key: String = ""): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(key)
      __method_bind.stop.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun stopAll(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.stopAll.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun targetingMethod(
    `object`: Object,
    method: String,
    initial: Object,
    initialMethod: String,
    finalVal: Variant,
    duration: Float,
    transType: Int = 0,
    easeType: Int = 2,
    delay: Float = 0.0f
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(method)
      _args.add(initial)
      _args.add(initialMethod)
      _args.add(finalVal)
      _args.add(duration)
      _args.add(transType)
      _args.add(easeType)
      _args.add(delay)
      __method_bind.targetingMethod.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun targetingProperty(
    `object`: Object,
    property: NodePath,
    initial: Object,
    initialVal: NodePath,
    finalVal: Variant,
    duration: Float,
    transType: Int = 0,
    easeType: Int = 2,
    delay: Float = 0.0f
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(property)
      _args.add(initial)
      _args.add(initialVal)
      _args.add(finalVal)
      _args.add(duration)
      _args.add(transType)
      _args.add(easeType)
      _args.add(delay)
      __method_bind.targetingProperty.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun tell(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.tell.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  enum class TransitionType(
    val value: Int
  ) {
    TRANS_LINEAR(0),

    TRANS_SINE(1),

    TRANS_QUINT(2),

    TRANS_QUART(3),

    TRANS_QUAD(4),

    TRANS_EXPO(5),

    TRANS_ELASTIC(6),

    TRANS_CUBIC(7),

    TRANS_CIRC(8),

    TRANS_BOUNCE(9),

    TRANS_BACK(10);

    companion object {
      fun from(value: Int): TransitionType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class TweenProcessMode(
    val value: Int
  ) {
    PHYSICS(0),

    IDLE(1);

    companion object {
      fun from(value: Int): TweenProcessMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class EaseType(
    val value: Int
  ) {
    IN(0),

    OUT(1),

    IN_OUT(2),

    OUT_IN(3);

    companion object {
      fun from(value: Int): EaseType {
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tween".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Tween" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Tween
     */
    private object __method_bind {
      val followMethod: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "follow_method".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method follow_method" }
        }
      val followProperty: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "follow_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method follow_property" }
        }
      val getRuntime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "get_runtime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_runtime" }
        }
      val getSpeedScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "get_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
        }
      val getTweenProcessMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "get_tween_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tween_process_mode" }
        }
      val interpolateCallback: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "interpolate_callback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate_callback" }
        }
      val interpolateDeferredCallback: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "interpolate_deferred_callback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate_deferred_callback" }
        }
      val interpolateMethod: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "interpolate_method".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate_method" }
        }
      val interpolateProperty: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "interpolate_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate_property" }
        }
      val isActive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_active" }
        }
      val isRepeat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "is_repeat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_repeat" }
        }
      val remove: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "remove".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove" }
        }
      val removeAll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "remove_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_all" }
        }
      val reset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "reset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reset" }
        }
      val resetAll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "reset_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reset_all" }
        }
      val resume: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "resume".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resume" }
        }
      val resumeAll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "resume_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resume_all" }
        }
      val seek: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "seek".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method seek" }
        }
      val setActive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_active" }
        }
      val setRepeat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "set_repeat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_repeat" }
        }
      val setSpeedScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "set_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
        }
      val setTweenProcessMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "set_tween_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tween_process_mode" }
        }
      val start: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "start".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method start" }
        }
      val stop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }
      val stopAll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "stop_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop_all" }
        }
      val targetingMethod: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "targeting_method".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method targeting_method" }
        }
      val targetingProperty: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "targeting_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method targeting_property" }
        }
      val tell: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "tell".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tell" }
        }}
  }
}
