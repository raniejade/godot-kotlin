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

open class World internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    fun new(): World = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("World".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton World" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      World(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for World
     */
    private object __method_bind {
      val get_direct_space_state: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
              "get_direct_space_state".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_direct_space_state" }
            }
          }

      val get_environment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
              "get_environment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_environment" }
            }
          }

      val get_fallback_environment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
              "get_fallback_environment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fallback_environment" }
            }
          }

      val get_scenario: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
              "get_scenario".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scenario" }
            }
          }

      val get_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
              "get_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_space" }
            }
          }

      val set_environment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
              "set_environment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_environment" }
            }
          }

      val set_fallback_environment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
              "set_fallback_environment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fallback_environment" }
            }
          }
    }
  }
}
