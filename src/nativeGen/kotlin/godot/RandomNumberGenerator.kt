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

open class RandomNumberGenerator internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getSeed(): Int {
    val _ret = __method_bind.get_seed.call(this.toVariant())
    return _ret.asInt()
  }

  fun randf(): Float {
    val _ret = __method_bind.randf.call(this.toVariant())
    return _ret.asFloat()
  }

  fun randfRange(from: Float, to: Float): Float {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    val _ret = __method_bind.randf_range.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun randfn(mean: Float, deviation: Float): Float {
    val _args = VariantArray.new()
    _args.append(mean)
    _args.append(deviation)
    val _ret = __method_bind.randfn.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun randi(): Int {
    val _ret = __method_bind.randi.call(this.toVariant())
    return _ret.asInt()
  }

  fun randiRange(from: Int, to: Int): Int {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    val _ret = __method_bind.randi_range.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun randomize() {
    __method_bind.randomize.call(this.toVariant())
  }

  fun setSeed(seed: Int) {
    val _args = VariantArray.new()
    _args.append(seed)
    __method_bind.set_seed.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): RandomNumberGenerator = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("RandomNumberGenerator".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton RandomNumberGenerator" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RandomNumberGenerator(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RandomNumberGenerator = RandomNumberGenerator(ptr)
    /**
     * Container for method_bind pointers for RandomNumberGenerator
     */
    private object __method_bind {
      val get_seed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
              "get_seed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_seed" }
            }
          }

      val randf: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
              "randf".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method randf" }
            }
          }

      val randf_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
              "randf_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method randf_range" }
            }
          }

      val randfn: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
              "randfn".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method randfn" }
            }
          }

      val randi: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
              "randi".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method randi" }
            }
          }

      val randi_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
              "randi_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method randi_range" }
            }
          }

      val randomize: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
              "randomize".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method randomize" }
            }
          }

      val set_seed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RandomNumberGenerator".cstr.ptr,
              "set_seed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_seed" }
            }
          }
    }
  }
}
