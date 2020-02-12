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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getSeed(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSeed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun randf(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.randf.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun randfRange(from: Float, to: Float): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      __method_bind.randfRange.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun randfn(mean: Float = 0.0f, deviation: Float = 1.0f): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(mean)
      _args.add(deviation)
      __method_bind.randfn.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun randi(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.randi.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun randiRange(from: Int, to: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      __method_bind.randiRange.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun randomize() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.randomize.call(self._handle, emptyList(), null)
    }
  }

  fun setSeed(seed: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSeed.call(self._handle, listOf(seed), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "get_seed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_seed" }
        }
      val randf: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "randf".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method randf" }
        }
      val randfRange: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "randf_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method randf_range" }
        }
      val randfn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "randfn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method randfn" }
        }
      val randi: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "randi".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method randi" }
        }
      val randiRange: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "randi_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method randi_range" }
        }
      val randomize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "randomize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method randomize" }
        }
      val setSeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
            "set_seed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_seed" }
        }}
  }
}
