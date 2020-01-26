// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ScriptEditor internal constructor(
  _handle: COpaquePointer
) : PanelContainer(_handle) {
  fun canDropDataFw(
    point: Vector2,
    data: Variant,
    from: Control
  ): Boolean {
    TODO()
  }

  fun dropDataFw(
    point: Vector2,
    data: Variant,
    from: Control
  ) {
    TODO()
  }

  fun getCurrentScript(): Script {
    TODO()
  }

  fun getDragDataFw(point: Vector2, from: Control): Variant {
    TODO()
  }

  fun getOpenScripts(): VariantArray {
    TODO()
  }

  fun gotoLine(line_number: Int) {
    TODO()
  }

  fun openScriptCreateDialog(base_name: String, base_path: String) {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for ScriptEditor
     */
    private object __method_bind {
      val can_drop_data_fw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "can_drop_data_fw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method can_drop_data_fw" }
            }
          }

      val drop_data_fw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "drop_data_fw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method drop_data_fw" }
            }
          }

      val get_current_script: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "get_current_script".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_script" }
            }
          }

      val get_drag_data_fw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "get_drag_data_fw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_drag_data_fw" }
            }
          }

      val get_open_scripts: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "get_open_scripts".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_open_scripts" }
            }
          }

      val goto_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "goto_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method goto_line" }
            }
          }

      val open_script_create_dialog: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "open_script_create_dialog".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open_script_create_dialog" }
            }
          }
    }
  }
}
