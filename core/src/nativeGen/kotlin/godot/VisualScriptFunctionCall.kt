// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class VisualScriptFunctionCall(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
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

  var basicType: Variant.Type
    get() {
       return getBasicType() 
    }
    set(value) {
      setBasicType(value.value)
    }

  var callMode: CallMode
    get() {
       return getCallMode() 
    }
    set(value) {
      setCallMode(value.value)
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

  var rpcCallMode: RPCCallMode
    get() {
       return getRpcCallMode() 
    }
    set(value) {
      setRpcCallMode(value.value)
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for nodePath
   */
  fun nodePath(cb: NodePath.() -> Unit) {
    val _p = nodePath
    cb(_p)
    nodePath = _p
  }

  open fun _get_argument_cache(): Dictionary {
    TODO()
  }

  open fun _set_argument_cache(argumentCache: Dictionary) {
    TODO()
  }

  fun getBasePath(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getBasePath.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBaseScript(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getBaseScript.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getBaseType(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getBaseType.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getBasicType(): Variant.Type {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBasicType.call(self._handle, emptyList(), _retPtr)
      Variant.Type.from(_ret.value)
    }
  }

  fun getCallMode(): CallMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCallMode.call(self._handle, emptyList(), _retPtr)
      VisualScriptFunctionCall.CallMode.from(_ret.value)
    }
  }

  fun getFunction(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getFunction.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getRpcCallMode(): RPCCallMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRpcCallMode.call(self._handle, emptyList(), _retPtr)
      VisualScriptFunctionCall.RPCCallMode.from(_ret.value)
    }
  }

  fun getSingleton(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getSingleton.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getUseDefaultArgs(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUseDefaultArgs.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getValidate(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getValidate.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setBasePath(basePath: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBasePath.call(self._handle, listOf(basePath), null)
    }
  }

  fun setBaseScript(baseScript: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBaseScript.call(self._handle, listOf(baseScript), null)
    }
  }

  fun setBaseType(baseType: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBaseType.call(self._handle, listOf(baseType), null)
    }
  }

  fun setBasicType(basicType: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBasicType.call(self._handle, listOf(basicType), null)
    }
  }

  fun setCallMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCallMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setFunction(function: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFunction.call(self._handle, listOf(function), null)
    }
  }

  fun setRpcCallMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRpcCallMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setSingleton(singleton: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSingleton.call(self._handle, listOf(singleton), null)
    }
  }

  fun setUseDefaultArgs(amount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseDefaultArgs.call(self._handle, listOf(amount), null)
    }
  }

  fun setValidate(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setValidate.call(self._handle, listOf(enable), null)
    }
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
    SELF(0),

    NODE_PATH(1),

    INSTANCE(2),

    BASIC_TYPE(3),

    SINGLETON(4);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptFunctionCall".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptFunctionCall" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptFunctionCall
     */
    private object __method_bind {
      val getBasePath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "get_base_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_path" }
        }
      val getBaseScript: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "get_base_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_script" }
        }
      val getBaseType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "get_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_type" }
        }
      val getBasicType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "get_basic_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_basic_type" }
        }
      val getCallMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "get_call_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_call_mode" }
        }
      val getFunction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "get_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_function" }
        }
      val getRpcCallMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "get_rpc_call_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rpc_call_mode" }
        }
      val getSingleton: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "get_singleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_singleton" }
        }
      val getUseDefaultArgs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "get_use_default_args".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_default_args" }
        }
      val getValidate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "get_validate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_validate" }
        }
      val setBasePath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "set_base_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base_path" }
        }
      val setBaseScript: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "set_base_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base_script" }
        }
      val setBaseType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "set_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base_type" }
        }
      val setBasicType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "set_basic_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_basic_type" }
        }
      val setCallMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "set_call_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_call_mode" }
        }
      val setFunction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "set_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_function" }
        }
      val setRpcCallMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "set_rpc_call_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rpc_call_mode" }
        }
      val setSingleton: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "set_singleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_singleton" }
        }
      val setUseDefaultArgs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "set_use_default_args".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_default_args" }
        }
      val setValidate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptFunctionCall".cstr.ptr,
            "set_validate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_validate" }
        }}
  }
}
