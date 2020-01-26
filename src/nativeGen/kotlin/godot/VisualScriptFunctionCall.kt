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

open class VisualScriptFunctionCall internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  enum class RPCCallMode(
    val value: Int
  ) {
    RPC_DISABLED(0),

    RPC_RELIABLE(1),

    RPC_UNRELIABLE(2),

    RPC_RELIABLE_TO_ID(3),

    RPC_UNRELIABLE_TO_ID(4);
  }

  enum class CallMode(
    val value: Int
  ) {
    CALL_MODE_SELF(0),

    CALL_MODE_NODE_PATH(1),

    CALL_MODE_INSTANCE(2),

    CALL_MODE_BASIC_TYPE(3),

    CALL_MODE_SINGLETON(4);
  }

  companion object {
    val CALL_MODE_BASIC_TYPE: Int = 3

    val CALL_MODE_INSTANCE: Int = 2

    val CALL_MODE_NODE_PATH: Int = 1

    val CALL_MODE_SELF: Int = 0

    val CALL_MODE_SINGLETON: Int = 4

    val RPC_DISABLED: Int = 0

    val RPC_RELIABLE: Int = 1

    val RPC_RELIABLE_TO_ID: Int = 3

    val RPC_UNRELIABLE: Int = 2

    val RPC_UNRELIABLE_TO_ID: Int = 4

    fun new(): VisualScriptFunctionCall = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptFunctionCall".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptFunctionCall" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptFunctionCall(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScriptFunctionCall
     */
    private object __method_bind {
      val _get_argument_cache: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "_get_argument_cache".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_argument_cache" }
            }
          }

      val _set_argument_cache: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "_set_argument_cache".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_argument_cache" }
            }
          }

      val get_base_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "get_base_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_path" }
            }
          }

      val get_base_script: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "get_base_script".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_script" }
            }
          }

      val get_base_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "get_base_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_type" }
            }
          }

      val get_basic_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "get_basic_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_basic_type" }
            }
          }

      val get_call_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "get_call_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_call_mode" }
            }
          }

      val get_function: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "get_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_function" }
            }
          }

      val get_rpc_call_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "get_rpc_call_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rpc_call_mode" }
            }
          }

      val get_singleton: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "get_singleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_singleton" }
            }
          }

      val get_use_default_args: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "get_use_default_args".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_use_default_args" }
            }
          }

      val get_validate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "get_validate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_validate" }
            }
          }

      val set_base_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "set_base_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_path" }
            }
          }

      val set_base_script: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "set_base_script".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_script" }
            }
          }

      val set_base_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "set_base_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_type" }
            }
          }

      val set_basic_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "set_basic_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_basic_type" }
            }
          }

      val set_call_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "set_call_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_call_mode" }
            }
          }

      val set_function: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "set_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_function" }
            }
          }

      val set_rpc_call_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "set_rpc_call_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rpc_call_mode" }
            }
          }

      val set_singleton: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "set_singleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_singleton" }
            }
          }

      val set_use_default_args: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "set_use_default_args".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_default_args" }
            }
          }

      val set_validate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
              "set_validate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_validate" }
            }
          }
    }
  }
}
