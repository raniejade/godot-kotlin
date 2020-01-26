// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Material internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    val RENDER_PRIORITY_MAX: Int = 127

    val RENDER_PRIORITY_MIN: Int = -128

    /**
     * Container for method_bind pointers for Material
     */
    private object __method_bind {
      val get_next_pass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
              "get_next_pass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_next_pass" }
            }
          }

      val get_render_priority: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
              "get_render_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_render_priority" }
            }
          }

      val set_next_pass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
              "set_next_pass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_next_pass" }
            }
          }

      val set_render_priority: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
              "set_render_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_render_priority" }
            }
          }
    }
  }
}
