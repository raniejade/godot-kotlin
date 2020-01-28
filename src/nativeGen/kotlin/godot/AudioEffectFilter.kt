// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectFilter(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  var cutoffHz: Float
    get() {
       return getCutoff() 
    }
    set(value) {
      setCutoff(value)
    }

  var db: Int
    get() {
       return AudioEffectFilter.FilterDB.from(getDb()) 
    }
    set(value) {
      setDb(AudioEffectFilter.FilterDB.from(value))
    }

  var gain: Float
    get() {
       return getGain() 
    }
    set(value) {
      setGain(value)
    }

  var resonance: Float
    get() {
       return getResonance() 
    }
    set(value) {
      setResonance(value)
    }

  fun getCutoff(): Float {
    val _ret = __method_bind.getCutoff.call(this._handle)
    return _ret.asFloat()
  }

  fun getDb(): FilterDB {
    val _ret = __method_bind.getDb.call(this._handle)
    return AudioEffectFilter.FilterDB.from(_ret.asInt())
  }

  fun getGain(): Float {
    val _ret = __method_bind.getGain.call(this._handle)
    return _ret.asFloat()
  }

  fun getResonance(): Float {
    val _ret = __method_bind.getResonance.call(this._handle)
    return _ret.asFloat()
  }

  fun setCutoff(freq: Float) {
    val _arg = Variant.new(freq)
    __method_bind.setCutoff.call(this._handle, _arg, 1)
  }

  fun setDb(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setDb.call(this._handle, _arg, 1)
  }

  fun setGain(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setGain.call(this._handle, _arg, 1)
  }

  fun setResonance(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setResonance.call(this._handle, _arg, 1)
  }

  enum class FilterDB(
    val value: Int
  ) {
    FILTER_6DB(0),

    FILTER_12DB(1),

    FILTER_18DB(2),

    FILTER_24DB(3);

    companion object {
      fun from(value: Int): FilterDB {
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
    val FILTER_12DB: Int = 1

    val FILTER_18DB: Int = 2

    val FILTER_24DB: Int = 3

    val FILTER_6DB: Int = 0

    fun new(): AudioEffectFilter = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectFilter".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectFilter" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectFilter(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectFilter = AudioEffectFilter(ptr)
    /**
     * Container for method_bind pointers for AudioEffectFilter
     */
    private object __method_bind {
      val getCutoff: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "getCutoff".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCutoff" }
        }
      val getDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "getDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDb" }
        }
      val getGain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "getGain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGain" }
        }
      val getResonance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "getResonance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getResonance" }
        }
      val setCutoff: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "setCutoff".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCutoff" }
        }
      val setDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "setDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDb" }
        }
      val setGain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "setGain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGain" }
        }
      val setResonance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "setResonance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setResonance" }
        }}
  }
}
