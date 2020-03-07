// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class AudioEffectFilter(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioEffect(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getCutoff(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCutoff.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDb(): FilterDB {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDb.call(self._handle, emptyList(), _retPtr)
      AudioEffectFilter.FilterDB.from(_ret.value)
    }
  }

  fun getGain(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGain.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getResonance(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getResonance.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setCutoff(freq: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCutoff.call(self._handle, listOf(freq), null)
    }
  }

  fun setDb(amount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDb.call(self._handle, listOf(amount), null)
    }
  }

  fun setGain(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGain.call(self._handle, listOf(amount), null)
    }
  }

  fun setResonance(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setResonance.call(self._handle, listOf(amount), null)
    }
  }

  enum class FilterDB(
    val value: Int
  ) {
    `6DB`(0),

    `12DB`(1),

    `18DB`(2),

    `24DB`(3);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectFilter".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectFilter" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioEffectFilter
     */
    private object __method_bind {
      val getCutoff: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "get_cutoff".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cutoff" }
            }
          }

      val getDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "get_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_db" }
            }
          }

      val getGain: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "get_gain".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gain" }
            }
          }

      val getResonance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "get_resonance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resonance" }
            }
          }

      val setCutoff: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "set_cutoff".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cutoff" }
            }
          }

      val setDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "set_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_db" }
            }
          }

      val setGain: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "set_gain".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gain" }
            }
          }

      val setResonance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectFilter".cstr.ptr,
              "set_resonance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_resonance" }
            }
          }
    }
  }
}
