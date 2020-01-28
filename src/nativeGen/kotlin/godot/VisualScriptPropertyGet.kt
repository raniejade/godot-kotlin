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

open class VisualScriptPropertyGet(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
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

  var index: String
    get() {
       return getIndex() 
    }
    set(value) {
      setIndex(value)
    }

  var nodePath: NodePath
    get() {
       return getBasePath() 
    }
    set(value) {
      setBasePath(value)
    }

  var property: String
    get() {
       return getProperty() 
    }
    set(value) {
      setProperty(value)
    }

  var setMode: CallMode
    get() {
       return getCallMode() 
    }
    set(value) {
      setCallMode(value.value)
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
    return VisualScriptPropertyGet.CallMode.from(_ret.asInt())
  }

  fun getIndex(): String {
    val _ret = __method_bind.getIndex.call(this._handle)
    return _ret.asString()
  }

  fun getProperty(): String {
    val _ret = __method_bind.getProperty.call(this._handle)
    return _ret.asString()
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

  fun setIndex(index: String) {
    val _arg = Variant.new(index)
    __method_bind.setIndex.call(this._handle, _arg, 1)
  }

  fun setProperty(property: String) {
    val _arg = Variant.new(property)
    __method_bind.setProperty.call(this._handle, _arg, 1)
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

    fun new(): VisualScriptPropertyGet = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptPropertyGet".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptPropertyGet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptPropertyGet(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptPropertyGet = VisualScriptPropertyGet(ptr)
    /**
     * Container for method_bind pointers for VisualScriptPropertyGet
     */
    private object __method_bind {
      val getBasePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
            "get_base_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_path" }
        }
      val getBaseScript: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
            "get_base_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_script" }
        }
      val getBaseType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
            "get_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_type" }
        }
      val getBasicType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
            "get_basic_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_basic_type" }
        }
      val getCallMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
            "get_call_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_call_mode" }
        }
      val getIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
            "get_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_index" }
        }
      val getProperty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
            "get_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_property" }
        }
      val setBasePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
            "set_base_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base_path" }
        }
      val setBaseScript: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
            "set_base_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base_script" }
        }
      val setBaseType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
            "set_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base_type" }
        }
      val setBasicType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
            "set_basic_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_basic_type" }
        }
      val setCallMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
            "set_call_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_call_mode" }
        }
      val setIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
            "set_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_index" }
        }
      val setProperty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
            "set_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_property" }
        }}
  }
}
