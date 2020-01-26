// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.Vector3
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ProximityGroup internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun broadcast(name: String, parameters: Variant) {
    TODO()
  }

  fun getDispatchMode(): DispatchMode {
    TODO()
  }

  fun getGridRadius(): Vector3 {
    TODO()
  }

  fun getGroupName(): String {
    TODO()
  }

  fun setDispatchMode(mode: Int) {
    TODO()
  }

  fun setGridRadius(radius: Vector3) {
    TODO()
  }

  fun setGroupName(name: String) {
    TODO()
  }

  enum class DispatchMode(
    val value: Int
  ) {
    MODE_PROXY(0),

    MODE_SIGNAL(1);

    companion object {
      fun from(value: Int): DispatchMode {
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
    val MODE_PROXY: Int = 0

    val MODE_SIGNAL: Int = 1

    fun new(): ProximityGroup = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ProximityGroup".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ProximityGroup" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ProximityGroup(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ProximityGroup = ProximityGroup(ptr)
    /**
     * Container for method_bind pointers for ProximityGroup
     */
    private object __method_bind {
      val broadcast: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
              "broadcast".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method broadcast" }
            }
          }

      val get_dispatch_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
              "get_dispatch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dispatch_mode" }
            }
          }

      val get_grid_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
              "get_grid_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_grid_radius" }
            }
          }

      val get_group_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
              "get_group_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_group_name" }
            }
          }

      val set_dispatch_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
              "set_dispatch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dispatch_mode" }
            }
          }

      val set_grid_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
              "set_grid_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_grid_radius" }
            }
          }

      val set_group_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
              "set_group_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_group_name" }
            }
          }
    }
  }
}
