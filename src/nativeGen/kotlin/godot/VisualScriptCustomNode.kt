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

open class VisualScriptCustomNode internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  enum class StartMode(
    val value: Int
  ) {
    START_MODE_BEGIN_SEQUENCE(0),

    START_MODE_CONTINUE_SEQUENCE(1),

    START_MODE_RESUME_YIELD(2);
  }

  companion object {
    val START_MODE_BEGIN_SEQUENCE: Int = 0

    val START_MODE_CONTINUE_SEQUENCE: Int = 1

    val START_MODE_RESUME_YIELD: Int = 2

    val STEP_EXIT_FUNCTION_BIT: Int = 134217728

    val STEP_GO_BACK_BIT: Int = 33554432

    val STEP_NO_ADVANCE_BIT: Int = 67108864

    val STEP_PUSH_STACK_BIT: Int = 16777216

    val STEP_YIELD_BIT: Int = 268435456

    fun new(): VisualScriptCustomNode = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptCustomNode".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptCustomNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptCustomNode(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScriptCustomNode
     */
    private object __method_bind {
      val _get_caption: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_get_caption".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_caption" }
            }
          }

      val _get_category: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_get_category".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_category" }
            }
          }

      val _get_input_value_port_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_get_input_value_port_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_input_value_port_count" }
            }
          }

      val _get_input_value_port_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_get_input_value_port_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_input_value_port_name" }
            }
          }

      val _get_input_value_port_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_get_input_value_port_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_input_value_port_type" }
            }
          }

      val _get_output_sequence_port_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_get_output_sequence_port_count".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method _get_output_sequence_port_count" }
            }
          }

      val _get_output_sequence_port_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_get_output_sequence_port_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_output_sequence_port_text"
              }
            }
          }

      val _get_output_value_port_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_get_output_value_port_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_output_value_port_count" }
            }
          }

      val _get_output_value_port_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_get_output_value_port_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_output_value_port_name" }
            }
          }

      val _get_output_value_port_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_get_output_value_port_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_output_value_port_type" }
            }
          }

      val _get_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_get_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_text" }
            }
          }

      val _get_working_memory_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_get_working_memory_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_working_memory_size" }
            }
          }

      val _has_input_sequence_port: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_has_input_sequence_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _has_input_sequence_port" }
            }
          }

      val _script_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_script_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _script_changed" }
            }
          }

      val _step: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptCustomNode".cstr.ptr,
              "_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _step" }
            }
          }
    }
  }
}
