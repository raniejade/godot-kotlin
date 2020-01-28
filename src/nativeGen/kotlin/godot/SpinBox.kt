// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class SpinBox(
  _handle: COpaquePointer
) : Range(_handle) {
  var align: Int
    get() {
       return LineEdit.Align.from(getAlign()) 
    }
    set(value) {
      setAlign(LineEdit.Align.from(value))
    }

  var editable: Boolean
    get() {
       return isEditable() 
    }
    set(value) {
      setEditable(value)
    }

  var prefix: String
    get() {
       return getPrefix() 
    }
    set(value) {
      setPrefix(value)
    }

  var suffix: String
    get() {
       return getSuffix() 
    }
    set(value) {
      setSuffix(value)
    }

  fun getAlign(): LineEdit.Align {
    val _ret = __method_bind.getAlign.call(this._handle)
    return LineEdit.Align.from(_ret.asInt())
  }

  fun getLineEdit(): LineEdit {
    val _ret = __method_bind.getLineEdit.call(this._handle)
    return _ret.asObject(::LineEdit)!!
  }

  fun getPrefix(): String {
    val _ret = __method_bind.getPrefix.call(this._handle)
    return _ret.asString()
  }

  fun getSuffix(): String {
    val _ret = __method_bind.getSuffix.call(this._handle)
    return _ret.asString()
  }

  fun isEditable(): Boolean {
    val _ret = __method_bind.isEditable.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAlign(align: Int) {
    val _arg = Variant.new(align)
    __method_bind.setAlign.call(this._handle, _arg, 1)
  }

  fun setEditable(editable: Boolean) {
    val _arg = Variant.new(editable)
    __method_bind.setEditable.call(this._handle, _arg, 1)
  }

  fun setPrefix(prefix: String) {
    val _arg = Variant.new(prefix)
    __method_bind.setPrefix.call(this._handle, _arg, 1)
  }

  fun setSuffix(suffix: String) {
    val _arg = Variant.new(suffix)
    __method_bind.setSuffix.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): SpinBox = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpinBox".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SpinBox" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SpinBox(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SpinBox = SpinBox(ptr)
    /**
     * Container for method_bind pointers for SpinBox
     */
    private object __method_bind {
      val getAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "getAlign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAlign" }
        }
      val getLineEdit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "getLineEdit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLineEdit" }
        }
      val getPrefix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "getPrefix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPrefix" }
        }
      val getSuffix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "getSuffix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSuffix" }
        }
      val isEditable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "isEditable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEditable" }
        }
      val setAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "setAlign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAlign" }
        }
      val setEditable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "setEditable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEditable" }
        }
      val setPrefix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "setPrefix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPrefix" }
        }
      val setSuffix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "setSuffix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSuffix" }
        }}
  }
}
