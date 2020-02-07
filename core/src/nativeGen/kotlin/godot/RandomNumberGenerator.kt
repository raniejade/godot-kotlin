// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
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

open class RandomNumberGenerator(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  var seed: Int
    get() {
       return getSeed() 
    }
    set(value) {
      setSeed(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getSeed(): Int {
    val _ret = __method_bind.getSeed.call(this._handle)
    return _ret.asInt()
  }

  fun randf(): Float {
    val _ret = __method_bind.randf.call(this._handle)
    return _ret.asFloat()
  }

  fun randfRange(from: Float, to: Float): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    val _ret = __method_bind.randfRange.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun randfn(mean: Float = 0.0f, deviation: Float = 1.0f): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mean))
    _args.add(Variant.fromAny(deviation))
    val _ret = __method_bind.randfn.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun randi(): Int {
    val _ret = __method_bind.randi.call(this._handle)
    return _ret.asInt()
  }

  fun randiRange(from: Int, to: Int): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    val _ret = __method_bind.randiRange.call(this._handle, _args)
    return _ret.asInt()
  }

  fun randomize() {
    __method_bind.randomize.call(this._handle)
  }

  fun setSeed(seed: Int) {
    val _arg = Variant.new(seed)
    __method_bind.setSeed.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("RandomNumberGenerator".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RandomNumberGenerator" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for RandomNumberGenerator
     */
    private object __method_bind {
      val getSeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "get_seed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_seed" }
        }
      val randf: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "randf".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method randf" }
        }
      val randfRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "randf_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method randf_range" }
        }
      val randfn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "randfn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method randfn" }
        }
      val randi: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "randi".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method randi" }
        }
      val randiRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "randi_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method randi_range" }
        }
      val randomize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "randomize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method randomize" }
        }
      val setSeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "set_seed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_seed" }
        }}
  }
}
