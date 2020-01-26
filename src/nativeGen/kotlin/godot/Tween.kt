// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
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

open class Tween internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun followMethod(
    `object`: Object,
    method: String,
    initial_val: Variant,
    target: Object,
    target_method: String,
    duration: Float,
    trans_type: Int,
    ease_type: Int,
    delay: Float
  ): Boolean {
    TODO()
  }

  fun followProperty(
    `object`: Object,
    property: NodePath,
    initial_val: Variant,
    target: Object,
    target_property: NodePath,
    duration: Float,
    trans_type: Int,
    ease_type: Int,
    delay: Float
  ): Boolean {
    TODO()
  }

  fun getRuntime(): Float {
    TODO()
  }

  fun getSpeedScale(): Float {
    TODO()
  }

  fun getTweenProcessMode(): TweenProcessMode {
    TODO()
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
    TODO()
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
    TODO()
  }

  fun interpolateMethod(
    `object`: Object,
    method: String,
    initial_val: Variant,
    final_val: Variant,
    duration: Float,
    trans_type: Int,
    ease_type: Int,
    delay: Float
  ): Boolean {
    TODO()
  }

  fun interpolateProperty(
    `object`: Object,
    property: NodePath,
    initial_val: Variant,
    final_val: Variant,
    duration: Float,
    trans_type: Int,
    ease_type: Int,
    delay: Float
  ): Boolean {
    TODO()
  }

  fun isActive(): Boolean {
    TODO()
  }

  fun isRepeat(): Boolean {
    TODO()
  }

  fun remove(`object`: Object, key: String): Boolean {
    TODO()
  }

  fun removeAll(): Boolean {
    TODO()
  }

  fun reset(`object`: Object, key: String): Boolean {
    TODO()
  }

  fun resetAll(): Boolean {
    TODO()
  }

  fun resume(`object`: Object, key: String): Boolean {
    TODO()
  }

  fun resumeAll(): Boolean {
    TODO()
  }

  fun seek(time: Float): Boolean {
    TODO()
  }

  fun setActive(active: Boolean) {
    TODO()
  }

  fun setRepeat(repeat: Boolean) {
    TODO()
  }

  fun setSpeedScale(speed: Float) {
    TODO()
  }

  fun setTweenProcessMode(mode: Int) {
    TODO()
  }

  fun start(): Boolean {
    TODO()
  }

  fun stop(`object`: Object, key: String): Boolean {
    TODO()
  }

  fun stopAll(): Boolean {
    TODO()
  }

  fun targetingMethod(
    `object`: Object,
    method: String,
    initial: Object,
    initial_method: String,
    final_val: Variant,
    duration: Float,
    trans_type: Int,
    ease_type: Int,
    delay: Float
  ): Boolean {
    TODO()
  }

  fun targetingProperty(
    `object`: Object,
    property: NodePath,
    initial: Object,
    initial_val: NodePath,
    final_val: Variant,
    duration: Float,
    trans_type: Int,
    ease_type: Int,
    delay: Float
  ): Boolean {
    TODO()
  }

  fun tell(): Float {
    TODO()
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
    TWEEN_PROCESS_PHYSICS(0),

    TWEEN_PROCESS_IDLE(1);

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
    EASE_IN(0),

    EASE_OUT(1),

    EASE_IN_OUT(2),

    EASE_OUT_IN(3);

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
    val EASE_IN: Int = 0

    val EASE_IN_OUT: Int = 2

    val EASE_OUT: Int = 1

    val EASE_OUT_IN: Int = 3

    val TRANS_BACK: Int = 10

    val TRANS_BOUNCE: Int = 9

    val TRANS_CIRC: Int = 8

    val TRANS_CUBIC: Int = 7

    val TRANS_ELASTIC: Int = 6

    val TRANS_EXPO: Int = 5

    val TRANS_LINEAR: Int = 0

    val TRANS_QUAD: Int = 4

    val TRANS_QUART: Int = 3

    val TRANS_QUINT: Int = 2

    val TRANS_SINE: Int = 1

    val TWEEN_PROCESS_IDLE: Int = 1

    val TWEEN_PROCESS_PHYSICS: Int = 0

    fun new(): Tween = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tween".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Tween" }
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
      val follow_method: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "follow_method".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method follow_method" }
            }
          }

      val follow_property: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "follow_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method follow_property" }
            }
          }

      val get_runtime: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "get_runtime".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_runtime" }
            }
          }

      val get_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "get_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
            }
          }

      val get_tween_process_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "get_tween_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tween_process_mode" }
            }
          }

      val interpolate_callback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "interpolate_callback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate_callback" }
            }
          }

      val interpolate_deferred_callback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "interpolate_deferred_callback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate_deferred_callback"
              }
            }
          }

      val interpolate_method: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "interpolate_method".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate_method" }
            }
          }

      val interpolate_property: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "interpolate_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate_property" }
            }
          }

      val is_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_active" }
            }
          }

      val is_repeat: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "is_repeat".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_repeat" }
            }
          }

      val remove: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "remove".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove" }
            }
          }

      val remove_all: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "remove_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_all" }
            }
          }

      val reset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "reset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reset" }
            }
          }

      val reset_all: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "reset_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reset_all" }
            }
          }

      val resume: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "resume".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resume" }
            }
          }

      val resume_all: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "resume_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resume_all" }
            }
          }

      val seek: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek" }
            }
          }

      val set_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "set_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_active" }
            }
          }

      val set_repeat: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "set_repeat".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_repeat" }
            }
          }

      val set_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "set_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
            }
          }

      val set_tween_process_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "set_tween_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tween_process_mode" }
            }
          }

      val start: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "start".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method start" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }

      val stop_all: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "stop_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop_all" }
            }
          }

      val targeting_method: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "targeting_method".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method targeting_method" }
            }
          }

      val targeting_property: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "targeting_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method targeting_property" }
            }
          }

      val tell: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tween".cstr.ptr,
              "tell".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tell" }
            }
          }
    }
  }
}
