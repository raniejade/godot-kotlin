// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisibilityEnabler(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisibilityNotifier(null) {
  var freezeBodies: Boolean
    get() {
       return isEnablerEnabled(1) 
    }
    set(value) {
      setEnabler(1, value)
    }

  var pauseAnimations: Boolean
    get() {
       return isEnablerEnabled(0) 
    }
    set(value) {
      setEnabler(0, value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun isEnablerEnabled(enabler: Int): Boolean {
    val _arg = Variant(enabler)
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
    PAUSE_ANIMATIONS(0),

    FREEZE_BODIES(1),

    MAX(2);

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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisibilityEnabler".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisibilityEnabler" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisibilityEnabler
     */
    private object __method_bind {
      val isEnablerEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityEnabler".cstr.ptr,
            "is_enabler_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_enabler_enabled" }
        }
      val setEnabler: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityEnabler".cstr.ptr,
            "set_enabler".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enabler" }
        }}
  }
}
