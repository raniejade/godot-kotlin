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

open class Shape2D internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    /**
     * Container for method_bind pointers for Shape2D
     */
    private object __method_bind {
      val collide: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "collide".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method collide" }
            }
          }

      val collide_and_get_contacts: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "collide_and_get_contacts".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method collide_and_get_contacts" }
            }
          }

      val collide_with_motion: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "collide_with_motion".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method collide_with_motion" }
            }
          }

      val collide_with_motion_and_get_contacts: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "collide_with_motion_and_get_contacts".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method collide_with_motion_and_get_contacts" }
            }
          }

      val get_custom_solver_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "get_custom_solver_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_solver_bias" }
            }
          }

      val set_custom_solver_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "set_custom_solver_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_solver_bias" }
            }
          }
    }
  }
}
