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

  var db: FilterDB
    get() {
       return getDb() 
    }
    set(value) {
      setDb(value.value)
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
    __method_bind.setCutoff.call(this._handle, listOf(_arg))
  }

  fun setDb(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setDb.call(this._handle, listOf(_arg))
  }

  fun setGain(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setGain.call(this._handle, listOf(_arg))
  }

  fun setResonance(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setResonance.call(this._handle, listOf(_arg))
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
            "get_cutoff".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cutoff" }
        }
      val getDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "get_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_db" }
        }
      val getGain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "get_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gain" }
        }
      val getResonance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "get_resonance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_resonance" }
        }
      val setCutoff: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "set_cutoff".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cutoff" }
        }
      val setDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "set_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_db" }
        }
      val setGain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "set_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gain" }
        }
      val setResonance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
            "set_resonance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_resonance" }
        }}
  }
}
