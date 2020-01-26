// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
