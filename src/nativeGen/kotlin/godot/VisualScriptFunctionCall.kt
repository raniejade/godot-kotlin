// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
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

open class VisualScriptFunctionCall internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getBasePath(): NodePath {
    TODO()
  }

  fun getBaseScript(): String {
    TODO()
  }

  fun getBaseType(): String {
    TODO()
  }

  fun getBasicType(): Variant.Type {
    TODO()
  }

  fun getCallMode(): CallMode {
    TODO()
  }

  fun getFunction(): String {
    TODO()
  }

  fun getRpcCallMode(): RPCCallMode {
    TODO()
  }

  fun getSingleton(): String {
    TODO()
  }

  fun getUseDefaultArgs(): Int {
    TODO()
  }

  fun getValidate(): Boolean {
    TODO()
  }

  fun setBasePath(base_path: NodePath) {
    TODO()
  }

  fun setBaseScript(base_script: String) {
    TODO()
  }

  fun setBaseType(base_type: String) {
    TODO()
  }

  fun setBasicType(basic_type: Int) {
    TODO()
  }

  fun setCallMode(mode: Int) {
    TODO()
  }

  fun setFunction(function: String) {
    TODO()
  }

  fun setRpcCallMode(mode: Int) {
    TODO()
  }

  fun setSingleton(singleton: String) {
    TODO()
  }

  fun setUseDefaultArgs(amount: Int) {
    TODO()
  }

  fun setValidate(enable: Boolean) {
    TODO()
  }

  enum class RPCCallMode(
    val value: Int
  ) {
    RPC_DISABLED(0),

    RPC_RELIABLE(1),

    RPC_UNRELIABLE(2),

    RPC_RELIABLE_TO_ID(3),

    RPC_UNRELIABLE_TO_ID(4);

    companion object {
      fun from(value: Int): RPCCallMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class CallMode(
    val value: Int
  ) {
    CALL_MODE_SELF(0),

    CALL_MODE_NODE_PATH(1),

    CALL_MODE_INSTANCE(2),

    CALL_MODE_BASIC_TYPE(3),

    CALL_MODE_SINGLETON(4);

    companion object {
      fun from(value: Int): CallMode {
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
    fun from(ptr: COpaquePointer): VisualScriptFunctionCall = VisualScriptFunctionCall(ptr)
    /**
     * Container for method_bind pointers for VisualScriptFunctionCall
     */
    private object __method_bind {
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
