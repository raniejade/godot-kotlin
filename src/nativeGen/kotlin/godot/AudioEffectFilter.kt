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

open class AudioEffectFilter internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getCutoff(): Float {
    val _ret = __method_bind.get_cutoff.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getDb(): FilterDB {
    val _ret = __method_bind.get_db.call(this.toVariant())
    return AudioEffectFilter.FilterDB.from(_ret.asInt())
  }

  fun getGain(): Float {
    val _ret = __method_bind.get_gain.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getResonance(): Float {
    val _ret = __method_bind.get_resonance.call(this.toVariant())
    return _ret.asFloat()
  }

  fun setCutoff(freq: Float) {
    val _arg = Variant.new(freq)
    __method_bind.set_cutoff.call(this.toVariant(), _arg, 1)
  }

  fun setDb(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.set_db.call(this.toVariant(), _arg, 1)
  }

  fun setGain(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_gain.call(this.toVariant(), _arg, 1)
  }

  fun setResonance(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_resonance.call(this.toVariant(), _arg, 1)
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
      val get_cutoff: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "get_cutoff".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cutoff" }
            }
          }

      val get_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "get_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_db" }
            }
          }

      val get_gain: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "get_gain".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gain" }
            }
          }

      val get_resonance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "get_resonance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resonance" }
            }
          }

      val set_cutoff: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "set_cutoff".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cutoff" }
            }
          }

      val set_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "set_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_db" }
            }
          }

      val set_gain: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "set_gain".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gain" }
            }
          }

      val set_resonance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "set_resonance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_resonance" }
            }
          }
    }
  }
}
