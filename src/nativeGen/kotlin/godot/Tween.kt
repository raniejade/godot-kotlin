// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Tween(
  _handle: COpaquePointer
) : Node(_handle) {
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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(initialVal))
    _args.add(Variant.fromAny(target))
    _args.add(Variant.fromAny(targetMethod))
    _args.add(Variant.fromAny(duration))
    _args.add(Variant.fromAny(transType))
    _args.add(Variant.fromAny(easeType))
    _args.add(Variant.fromAny(delay))
    val _ret = __method_bind.followMethod.call(this._handle, _args)
    return _ret.asBoolean()
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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(property))
    _args.add(Variant.fromAny(initialVal))
    _args.add(Variant.fromAny(target))
    _args.add(Variant.fromAny(targetProperty))
    _args.add(Variant.fromAny(duration))
    _args.add(Variant.fromAny(transType))
    _args.add(Variant.fromAny(easeType))
    _args.add(Variant.fromAny(delay))
    val _ret = __method_bind.followProperty.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun getRuntime(): Float {
    val _ret = __method_bind.getRuntime.call(this._handle)
    return _ret.asFloat()
  }

  fun getSpeedScale(): Float {
    val _ret = __method_bind.getSpeedScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getTweenProcessMode(): TweenProcessMode {
    val _ret = __method_bind.getTweenProcessMode.call(this._handle)
    return Tween.TweenProcessMode.from(_ret.asInt())
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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(duration))
    _args.add(Variant.fromAny(callback))
    _args.add(Variant.fromAny(arg1))
    _args.add(Variant.fromAny(arg2))
    _args.add(Variant.fromAny(arg3))
    _args.add(Variant.fromAny(arg4))
    _args.add(Variant.fromAny(arg5))
    val _ret = __method_bind.interpolateCallback.call(this._handle, _args)
    return _ret.asBoolean()
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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(duration))
    _args.add(Variant.fromAny(callback))
    _args.add(Variant.fromAny(arg1))
    _args.add(Variant.fromAny(arg2))
    _args.add(Variant.fromAny(arg3))
    _args.add(Variant.fromAny(arg4))
    _args.add(Variant.fromAny(arg5))
    val _ret = __method_bind.interpolateDeferredCallback.call(this._handle, _args)
    return _ret.asBoolean()
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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(initialVal))
    _args.add(Variant.fromAny(finalVal))
    _args.add(Variant.fromAny(duration))
    _args.add(Variant.fromAny(transType))
    _args.add(Variant.fromAny(easeType))
    _args.add(Variant.fromAny(delay))
    val _ret = __method_bind.interpolateMethod.call(this._handle, _args)
    return _ret.asBoolean()
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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(property))
    _args.add(Variant.fromAny(initialVal))
    _args.add(Variant.fromAny(finalVal))
    _args.add(Variant.fromAny(duration))
    _args.add(Variant.fromAny(transType))
    _args.add(Variant.fromAny(easeType))
    _args.add(Variant.fromAny(delay))
    val _ret = __method_bind.interpolateProperty.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun isActive(): Boolean {
    val _ret = __method_bind.isActive.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRepeat(): Boolean {
    val _ret = __method_bind.isRepeat.call(this._handle)
    return _ret.asBoolean()
  }

  fun remove(`object`: Object, key: String = ""): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(key))
    val _ret = __method_bind.remove.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun removeAll(): Boolean {
    val _ret = __method_bind.removeAll.call(this._handle)
    return _ret.asBoolean()
  }

  fun reset(`object`: Object, key: String = ""): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(key))
    val _ret = __method_bind.reset.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun resetAll(): Boolean {
    val _ret = __method_bind.resetAll.call(this._handle)
    return _ret.asBoolean()
  }

  fun resume(`object`: Object, key: String = ""): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(key))
    val _ret = __method_bind.resume.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun resumeAll(): Boolean {
    val _ret = __method_bind.resumeAll.call(this._handle)
    return _ret.asBoolean()
  }

  fun seek(time: Float): Boolean {
    val _arg = Variant.new(time)
    val _ret = __method_bind.seek.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun setActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.setActive.call(this._handle, listOf(_arg))
  }

  fun setRepeat(repeat: Boolean) {
    val _arg = Variant.new(repeat)
    __method_bind.setRepeat.call(this._handle, listOf(_arg))
  }

  fun setSpeedScale(speed: Float) {
    val _arg = Variant.new(speed)
    __method_bind.setSpeedScale.call(this._handle, listOf(_arg))
  }

  fun setTweenProcessMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setTweenProcessMode.call(this._handle, listOf(_arg))
  }

  fun start(): Boolean {
    val _ret = __method_bind.start.call(this._handle)
    return _ret.asBoolean()
  }

  fun stop(`object`: Object, key: String = ""): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(key))
    val _ret = __method_bind.stop.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun stopAll(): Boolean {
    val _ret = __method_bind.stopAll.call(this._handle)
    return _ret.asBoolean()
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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(initial))
    _args.add(Variant.fromAny(initialMethod))
    _args.add(Variant.fromAny(finalVal))
    _args.add(Variant.fromAny(duration))
    _args.add(Variant.fromAny(transType))
    _args.add(Variant.fromAny(easeType))
    _args.add(Variant.fromAny(delay))
    val _ret = __method_bind.targetingMethod.call(this._handle, _args)
    return _ret.asBoolean()
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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(property))
    _args.add(Variant.fromAny(initial))
    _args.add(Variant.fromAny(initialVal))
    _args.add(Variant.fromAny(finalVal))
    _args.add(Variant.fromAny(duration))
    _args.add(Variant.fromAny(transType))
    _args.add(Variant.fromAny(easeType))
    _args.add(Variant.fromAny(delay))
    val _ret = __method_bind.targetingProperty.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun tell(): Float {
    val _ret = __method_bind.tell.call(this._handle)
    return _ret.asFloat()
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
    fun new(): Tween = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tween".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Tween" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Tween(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Tween = Tween(ptr)
    /**
     * Container for method_bind pointers for Tween
     */
    private object __method_bind {
      val followMethod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "follow_method".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method follow_method" }
        }
      val followProperty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "follow_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method follow_property" }
        }
      val getRuntime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "get_runtime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_runtime" }
        }
      val getSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "get_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
        }
      val getTweenProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "get_tween_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tween_process_mode" }
        }
      val interpolateCallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "interpolate_callback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate_callback" }
        }
      val interpolateDeferredCallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "interpolate_deferred_callback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate_deferred_callback" }
        }
      val interpolateMethod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "interpolate_method".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate_method" }
        }
      val interpolateProperty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "interpolate_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate_property" }
        }
      val isActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_active" }
        }
      val isRepeat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "is_repeat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_repeat" }
        }
      val remove: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "remove".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove" }
        }
      val removeAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "remove_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_all" }
        }
      val reset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "reset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reset" }
        }
      val resetAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "reset_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reset_all" }
        }
      val resume: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "resume".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resume" }
        }
      val resumeAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "resume_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resume_all" }
        }
      val seek: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "seek".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method seek" }
        }
      val setActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_active" }
        }
      val setRepeat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "set_repeat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_repeat" }
        }
      val setSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "set_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
        }
      val setTweenProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "set_tween_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tween_process_mode" }
        }
      val start: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "start".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method start" }
        }
      val stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }
      val stopAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "stop_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop_all" }
        }
      val targetingMethod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "targeting_method".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method targeting_method" }
        }
      val targetingProperty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "targeting_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method targeting_property" }
        }
      val tell: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
            "tell".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tell" }
        }}
  }
}
