// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InstancePlaceholder internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun createInstance(replace: Boolean, custom_scene: PackedScene): Node {
    TODO()
  }

  fun getInstancePath(): String {
    TODO()
  }

  fun getStoredValues(with_order: Boolean): Dictionary {
    TODO()
  }

  fun replaceByInstance(custom_scene: PackedScene) {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for InstancePlaceholder
     */
    private object __method_bind {
      val create_instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
              "create_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_instance" }
            }
          }

      val get_instance_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
              "get_instance_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_instance_path" }
            }
          }

      val get_stored_values: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
              "get_stored_values".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stored_values" }
            }
          }

      val replace_by_instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
              "replace_by_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method replace_by_instance" }
            }
          }
    }
  }
}
