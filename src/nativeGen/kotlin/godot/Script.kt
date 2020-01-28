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

  fun getSourceCode(): String {
    val _ret = __method_bind.getSourceCode.call(this._handle)
    return _ret.asString()
  }

  fun hasScriptSignal(signalName: String): Boolean {
    val _arg = Variant.new(signalName)
    val _ret = __method_bind.hasScriptSignal.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasSourceCode(): Boolean {
    val _ret = __method_bind.hasSourceCode.call(this._handle)
    return _ret.asBoolean()
  }

  fun instanceHas(baseObject: Object): Boolean {
    val _arg = Variant.new(baseObject)
    val _ret = __method_bind.instanceHas.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isTool(): Boolean {
    val _ret = __method_bind.isTool.call(this._handle)
    return _ret.asBoolean()
  }

  fun reload(keepState: Boolean): GDError {
    val _arg = Variant.new(keepState)
    val _ret = __method_bind.reload.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun setSourceCode(source: String) {
    val _arg = Variant.new(source)
    __method_bind.setSourceCode.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for Script
     */
    private object __method_bind {
      val canInstance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "canInstance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canInstance" }
        }
      val getBaseScript: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "getBaseScript".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBaseScript" }
        }
      val getInstanceBaseType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "getInstanceBaseType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInstanceBaseType" }
        }
      val getSourceCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "getSourceCode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSourceCode" }
        }
      val hasScriptSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "hasScriptSignal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasScriptSignal" }
        }
      val hasSourceCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "hasSourceCode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasSourceCode" }
        }
      val instanceHas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "instanceHas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceHas" }
        }
      val isTool: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "isTool".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isTool" }
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
            "setSourceCode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSourceCode" }
        }}
  }
}
