// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Script(
  _handle: COpaquePointer
) : Resource(_handle) {
  var sourceCode: String
    get() {
       return getSourceCode() 
    }
    set(value) {
      setSourceCode(value)
    }

  fun canInstance(): Boolean {
    val _ret = __method_bind.canInstance.call(this._handle)
    return _ret.asBoolean()
  }

  fun getBaseScript(): Script {
    val _ret = __method_bind.getBaseScript.call(this._handle)
    return _ret.asObject(::Script)!!
  }

  fun getInstanceBaseType(): String {
    val _ret = __method_bind.getInstanceBaseType.call(this._handle)
    return _ret.asString()
  }

  fun getPropertyDefaultValue(property: String): Variant {
    val _arg = Variant.new(property)
    val _ret = __method_bind.getPropertyDefaultValue.call(this._handle, listOf(_arg))
    return _ret
  }

  fun getScriptConstantMap(): Dictionary {
    val _ret = __method_bind.getScriptConstantMap.call(this._handle)
    return _ret.asDictionary()
  }

  fun getScriptMethodList(): VariantArray {
    val _ret = __method_bind.getScriptMethodList.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getScriptPropertyList(): VariantArray {
    val _ret = __method_bind.getScriptPropertyList.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getScriptSignalList(): VariantArray {
    val _ret = __method_bind.getScriptSignalList.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getSourceCode(): String {
    val _ret = __method_bind.getSourceCode.call(this._handle)
    return _ret.asString()
  }

  fun hasScriptSignal(signalName: String): Boolean {
    val _arg = Variant.new(signalName)
    val _ret = __method_bind.hasScriptSignal.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun hasSourceCode(): Boolean {
    val _ret = __method_bind.hasSourceCode.call(this._handle)
    return _ret.asBoolean()
  }

  fun instanceHas(baseObject: Object): Boolean {
    val _arg = Variant.new(baseObject)
    val _ret = __method_bind.instanceHas.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isTool(): Boolean {
    val _ret = __method_bind.isTool.call(this._handle)
    return _ret.asBoolean()
  }

  fun reload(keepState: Boolean = false): GDError {
    val _arg = Variant.new(keepState)
    val _ret = __method_bind.reload.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun setSourceCode(source: String) {
    val _arg = Variant.new(source)
    __method_bind.setSourceCode.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for Script
     */
    private object __method_bind {
      val canInstance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "can_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_instance" }
        }
      val getBaseScript: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_base_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_script" }
        }
      val getInstanceBaseType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_instance_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_base_type" }
        }
      val getPropertyDefaultValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_property_default_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_property_default_value" }
        }
      val getScriptConstantMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_script_constant_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_constant_map" }
        }
      val getScriptMethodList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_script_method_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_method_list" }
        }
      val getScriptPropertyList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_script_property_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_property_list" }
        }
      val getScriptSignalList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_script_signal_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_signal_list" }
        }
      val getSourceCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_source_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_source_code" }
        }
      val hasScriptSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "has_script_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_script_signal" }
        }
      val hasSourceCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "has_source_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_source_code" }
        }
      val instanceHas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "instance_has".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_has" }
        }
      val isTool: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "is_tool".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_tool" }
        }
      val reload: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "reload".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reload" }
        }
      val setSourceCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "set_source_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_source_code" }
        }}
  }
}
