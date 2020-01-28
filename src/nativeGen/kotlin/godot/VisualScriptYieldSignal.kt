// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptYieldSignal(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var baseType: String
    get() {
       return getBaseType() 
    }
    set(value) {
      setBaseType(value)
    }

  var callMode: Int
    get() {
       return VisualScriptYieldSignal.CallMode.from(getCallMode()) 
    }
    set(value) {
      setCallMode(VisualScriptYieldSignal.CallMode.from(value))
    }

  var nodePath: NodePath
    get() {
       return getBasePath() 
    }
    set(value) {
      setBasePath(value)
    }

  var signal: String
    get() {
       return getSignal() 
    }
    set(value) {
      setSignal(value)
    }

  fun getBasePath(): NodePath {
    val _ret = __method_bind.getBasePath.call(this._handle)
    return _ret.asNodePath()
  }

  fun getBaseType(): String {
    val _ret = __method_bind.getBaseType.call(this._handle)
    return _ret.asString()
  }

  fun getCallMode(): CallMode {
    val _ret = __method_bind.getCallMode.call(this._handle)
    return VisualScriptYieldSignal.CallMode.from(_ret.asInt())
  }

  fun getSignal(): String {
    val _ret = __method_bind.getSignal.call(this._handle)
    return _ret.asString()
  }

  fun setBasePath(basePath: NodePath) {
    val _arg = Variant.new(basePath)
    __method_bind.setBasePath.call(this._handle, _arg, 1)
  }

  fun setBaseType(baseType: String) {
    val _arg = Variant.new(baseType)
    __method_bind.setBaseType.call(this._handle, _arg, 1)
  }

  fun setCallMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setCallMode.call(this._handle, _arg, 1)
  }

  fun setSignal(signal: String) {
    val _arg = Variant.new(signal)
    __method_bind.setSignal.call(this._handle, _arg, 1)
  }

  enum class CallMode(
    val value: Int
  ) {
    CALL_MODE_SELF(0),

    CALL_MODE_NODE_PATH(1),

    CALL_MODE_INSTANCE(2);

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
    val CALL_MODE_INSTANCE: Int = 2

    val CALL_MODE_NODE_PATH: Int = 1

    val CALL_MODE_SELF: Int = 0

    fun new(): VisualScriptYieldSignal = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptYieldSignal".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptYieldSignal" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptYieldSignal(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptYieldSignal = VisualScriptYieldSignal(ptr)
    /**
     * Container for method_bind pointers for VisualScriptYieldSignal
     */
    private object __method_bind {
      val getBasePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "getBasePath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBasePath" }
        }
      val getBaseType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "getBaseType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBaseType" }
        }
      val getCallMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "getCallMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCallMode" }
        }
      val getSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "getSignal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSignal" }
        }
      val setBasePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "setBasePath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBasePath" }
        }
      val setBaseType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "setBaseType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBaseType" }
        }
      val setCallMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "setCallMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCallMode" }
        }
      val setSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "setSignal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSignal" }
        }}
  }
}
