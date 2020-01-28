// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
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

open class VisualScriptFunctionCall(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var argumentCache: Dictionary
    get() {
       return _getArgumentCache() 
    }
    set(value) {
      _setArgumentCache(value)
    }

  var baseScript: String
    get() {
       return getBaseScript() 
    }
    set(value) {
      setBaseScript(value)
    }

  var baseType: String
    get() {
       return getBaseType() 
    }
    set(value) {
      setBaseType(value)
    }

  var basicType: Int
    get() {
       return Variant.Type.from(getBasicType()) 
    }
    set(value) {
      setBasicType(Variant.Type.from(value))
    }

  var callMode: Int
    get() {
       return VisualScriptFunctionCall.CallMode.from(getCallMode()) 
    }
    set(value) {
      setCallMode(VisualScriptFunctionCall.CallMode.from(value))
    }

  var function: String
    get() {
       return getFunction() 
    }
    set(value) {
      setFunction(value)
    }

  var nodePath: NodePath
    get() {
       return getBasePath() 
    }
    set(value) {
      setBasePath(value)
    }

  var rpcCallMode: Int
    get() {
       return VisualScriptFunctionCall.RPCCallMode.from(getRpcCallMode()) 
    }
    set(value) {
      setRpcCallMode(VisualScriptFunctionCall.RPCCallMode.from(value))
    }

  var singleton: String
    get() {
       return getSingleton() 
    }
    set(value) {
      setSingleton(value)
    }

  var useDefaultArgs: Int
    get() {
       return getUseDefaultArgs() 
    }
    set(value) {
      setUseDefaultArgs(value)
    }

  var validate: Boolean
    get() {
       return getValidate() 
    }
    set(value) {
      setValidate(value)
    }

  fun getBasePath(): NodePath {
    val _ret = __method_bind.getBasePath.call(this._handle)
    return _ret.asNodePath()
  }

  fun getBaseScript(): String {
    val _ret = __method_bind.getBaseScript.call(this._handle)
    return _ret.asString()
  }

  fun getBaseType(): String {
    val _ret = __method_bind.getBaseType.call(this._handle)
    return _ret.asString()
  }

  fun getBasicType(): Variant.Type {
    val _ret = __method_bind.getBasicType.call(this._handle)
    return Variant.Type.from(_ret.asInt())
  }

  fun getCallMode(): CallMode {
    val _ret = __method_bind.getCallMode.call(this._handle)
    return VisualScriptFunctionCall.CallMode.from(_ret.asInt())
  }

  fun getFunction(): String {
    val _ret = __method_bind.getFunction.call(this._handle)
    return _ret.asString()
  }

  fun getRpcCallMode(): RPCCallMode {
    val _ret = __method_bind.getRpcCallMode.call(this._handle)
    return VisualScriptFunctionCall.RPCCallMode.from(_ret.asInt())
  }

  fun getSingleton(): String {
    val _ret = __method_bind.getSingleton.call(this._handle)
    return _ret.asString()
  }

  fun getUseDefaultArgs(): Int {
    val _ret = __method_bind.getUseDefaultArgs.call(this._handle)
    return _ret.asInt()
  }

  fun getValidate(): Boolean {
    val _ret = __method_bind.getValidate.call(this._handle)
    return _ret.asBoolean()
  }

  fun setBasePath(basePath: NodePath) {
    val _arg = Variant.new(basePath)
    __method_bind.setBasePath.call(this._handle, _arg, 1)
  }

  fun setBaseScript(baseScript: String) {
    val _arg = Variant.new(baseScript)
    __method_bind.setBaseScript.call(this._handle, _arg, 1)
  }

  fun setBaseType(baseType: String) {
    val _arg = Variant.new(baseType)
    __method_bind.setBaseType.call(this._handle, _arg, 1)
  }

  fun setBasicType(basicType: Int) {
    val _arg = Variant.new(basicType)
    __method_bind.setBasicType.call(this._handle, _arg, 1)
  }

  fun setCallMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setCallMode.call(this._handle, _arg, 1)
  }

  fun setFunction(function: String) {
    val _arg = Variant.new(function)
    __method_bind.setFunction.call(this._handle, _arg, 1)
  }

  fun setRpcCallMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setRpcCallMode.call(this._handle, _arg, 1)
  }

  fun setSingleton(singleton: String) {
    val _arg = Variant.new(singleton)
    __method_bind.setSingleton.call(this._handle, _arg, 1)
  }

  fun setUseDefaultArgs(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setUseDefaultArgs.call(this._handle, _arg, 1)
  }

  fun setValidate(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setValidate.call(this._handle, _arg, 1)
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
      requireNotNull(fnPtr) { "No instance found for VisualScriptFunctionCall" }
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
      val getBasePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "getBasePath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBasePath" }
        }
      val getBaseScript: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "getBaseScript".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBaseScript" }
        }
      val getBaseType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "getBaseType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBaseType" }
        }
      val getBasicType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "getBasicType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBasicType" }
        }
      val getCallMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "getCallMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCallMode" }
        }
      val getFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "getFunction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFunction" }
        }
      val getRpcCallMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "getRpcCallMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRpcCallMode" }
        }
      val getSingleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "getSingleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSingleton" }
        }
      val getUseDefaultArgs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "getUseDefaultArgs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUseDefaultArgs" }
        }
      val getValidate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "getValidate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getValidate" }
        }
      val setBasePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "setBasePath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBasePath" }
        }
      val setBaseScript: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "setBaseScript".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBaseScript" }
        }
      val setBaseType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "setBaseType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBaseType" }
        }
      val setBasicType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "setBasicType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBasicType" }
        }
      val setCallMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "setCallMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCallMode" }
        }
      val setFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "setFunction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFunction" }
        }
      val setRpcCallMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "setRpcCallMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRpcCallMode" }
        }
      val setSingleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "setSingleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSingleton" }
        }
      val setUseDefaultArgs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "setUseDefaultArgs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseDefaultArgs" }
        }
      val setValidate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "setValidate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setValidate" }
        }}
  }
}
