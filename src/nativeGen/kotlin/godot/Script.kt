// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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

open class Script internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun canInstance(): Boolean {
    val _ret = __method_bind.can_instance.call(this._handle)
    return _ret.asBool()
  }

  fun getBaseScript(): Script {
    val _ret = __method_bind.get_base_script.call(this._handle)
    return _ret.asObject(::Script)!!
  }

  fun getInstanceBaseType(): String {
    val _ret = __method_bind.get_instance_base_type.call(this._handle)
    return _ret.asString()
  }

  fun getSourceCode(): String {
    val _ret = __method_bind.get_source_code.call(this._handle)
    return _ret.asString()
  }

  fun hasScriptSignal(signalName: String): Boolean {
    val _arg = Variant.new(signalName)
    val _ret = __method_bind.has_script_signal.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun hasSourceCode(): Boolean {
    val _ret = __method_bind.has_source_code.call(this._handle)
    return _ret.asBool()
  }

  fun instanceHas(baseObject: Object): Boolean {
    val _arg = Variant.new(baseObject)
    val _ret = __method_bind.instance_has.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun isTool(): Boolean {
    val _ret = __method_bind.is_tool.call(this._handle)
    return _ret.asBool()
  }

  fun reload(keepState: Boolean): GDError {
    val _arg = Variant.new(keepState)
    val _ret = __method_bind.reload.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun setSourceCode(source: String) {
    val _arg = Variant.new(source)
    __method_bind.set_source_code.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for Script
     */
    private object __method_bind {
      val can_instance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "can_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_instance" }
        }
      val get_base_script: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_base_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_script" }
        }
      val get_instance_base_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_instance_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_base_type" }
        }
      val get_source_code: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_source_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_source_code" }
        }
      val has_script_signal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "has_script_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_script_signal" }
        }
      val has_source_code: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "has_source_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_source_code" }
        }
      val instance_has: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "instance_has".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_has" }
        }
      val is_tool: CPointer<godot_method_bind>
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
      val set_source_code: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "set_source_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_source_code" }
        }}
  }
}
