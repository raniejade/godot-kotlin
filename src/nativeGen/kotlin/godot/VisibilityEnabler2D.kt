// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisibilityEnabler2D(
  _handle: COpaquePointer
) : VisibilityNotifier2D(_handle) {
  var freezeBodies: Boolean
    get() {
       return isEnablerEnabled(1) 
    }
    set(value) {
      setEnabler(1, value)
    }

  var pauseAnimatedSprites: Boolean
    get() {
       return isEnablerEnabled(5) 
    }
    set(value) {
      setEnabler(5, value)
    }

  var pauseAnimations: Boolean
    get() {
       return isEnablerEnabled(0) 
    }
    set(value) {
      setEnabler(0, value)
    }

  var pauseParticles: Boolean
    get() {
       return isEnablerEnabled(2) 
    }
    set(value) {
      setEnabler(2, value)
    }

  var physicsProcessParent: Boolean
    get() {
       return isEnablerEnabled(4) 
    }
    set(value) {
      setEnabler(4, value)
    }

  var processParent: Boolean
    get() {
       return isEnablerEnabled(3) 
    }
    set(value) {
      setEnabler(3, value)
    }

  fun isEnablerEnabled(enabler: Int): Boolean {
    val _arg = Variant.new(enabler)
    val _ret = __method_bind.isEnablerEnabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun setEnabler(enabler: Int, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(enabler))
    _args.add(Variant.fromAny(enabled))
    __method_bind.setEnabler.call(this._handle, _args)
  }

  enum class Enabler(
    val value: Int
  ) {
    ENABLER_PAUSE_ANIMATIONS(0),

    ENABLER_FREEZE_BODIES(1),

    ENABLER_PAUSE_PARTICLES(2),

    ENABLER_PARENT_PROCESS(3),

    ENABLER_PARENT_PHYSICS_PROCESS(4),

    ENABLER_PAUSE_ANIMATED_SPRITES(5),

    ENABLER_MAX(6);

    companion object {
      fun from(value: Int): Enabler {
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
    val ENABLER_FREEZE_BODIES: Int = 1

    val ENABLER_MAX: Int = 6

    val ENABLER_PARENT_PHYSICS_PROCESS: Int = 4

    val ENABLER_PARENT_PROCESS: Int = 3

    val ENABLER_PAUSE_ANIMATED_SPRITES: Int = 5

    val ENABLER_PAUSE_ANIMATIONS: Int = 0

    val ENABLER_PAUSE_PARTICLES: Int = 2

    fun new(): VisibilityEnabler2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisibilityEnabler2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisibilityEnabler2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisibilityEnabler2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisibilityEnabler2D = VisibilityEnabler2D(ptr)
    /**
     * Container for method_bind pointers for VisibilityEnabler2D
     */
    private object __method_bind {
      val isEnablerEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityEnabler2D".cstr.ptr,
            "is_enabler_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_enabler_enabled" }
        }
      val setEnabler: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityEnabler2D".cstr.ptr,
            "set_enabler".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enabler" }
        }}
  }
}
