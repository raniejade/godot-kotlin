// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
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
    val _ret = __method_bind.get_base_path.call(this.toVariant())
    TODO()
  }

  fun getBaseScript(): String {
    val _ret = __method_bind.get_base_script.call(this.toVariant())
    TODO()
  }

  fun getBaseType(): String {
    val _ret = __method_bind.get_base_type.call(this.toVariant())
    TODO()
  }

  fun getBasicType(): Variant.Type {
    val _ret = __method_bind.get_basic_type.call(this.toVariant())
    TODO()
  }

  fun getCallMode(): CallMode {
    val _ret = __method_bind.get_call_mode.call(this.toVariant())
    TODO()
  }

  fun getFunction(): String {
    val _ret = __method_bind.get_function.call(this.toVariant())
    TODO()
  }

  fun getRpcCallMode(): RPCCallMode {
    val _ret = __method_bind.get_rpc_call_mode.call(this.toVariant())
    TODO()
  }

  fun getSingleton(): String {
    val _ret = __method_bind.get_singleton.call(this.toVariant())
    TODO()
  }

  fun getUseDefaultArgs(): Int {
    val _ret = __method_bind.get_use_default_args.call(this.toVariant())
    TODO()
  }

  fun getValidate(): Boolean {
    val _ret = __method_bind.get_validate.call(this.toVariant())
    TODO()
  }

  fun setBasePath(basePath: NodePath) {
    val _args = VariantArray.new()
    _args.append(basePath)
    val _ret = __method_bind.set_base_path.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBaseScript(baseScript: String) {
    val _args = VariantArray.new()
    _args.append(baseScript)
    val _ret = __method_bind.set_base_script.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBaseType(baseType: String) {
    val _args = VariantArray.new()
    _args.append(baseType)
    val _ret = __method_bind.set_base_type.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBasicType(basicType: Int) {
    val _args = VariantArray.new()
    _args.append(basicType)
    val _ret = __method_bind.set_basic_type.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCallMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    val _ret = __method_bind.set_call_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setFunction(function: String) {
    val _args = VariantArray.new()
    _args.append(function)
    val _ret = __method_bind.set_function.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRpcCallMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    val _ret = __method_bind.set_rpc_call_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSingleton(singleton: String) {
    val _args = VariantArray.new()
    _args.append(singleton)
    val _ret = __method_bind.set_singleton.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setUseDefaultArgs(amount: Int) {
    val _args = VariantArray.new()
    _args.append(amount)
    val _ret = __method_bind.set_use_default_args.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setValidate(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_validate.call(this.toVariant(), _args.toVariant(), 1)
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
