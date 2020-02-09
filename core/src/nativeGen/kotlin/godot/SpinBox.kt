// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SpinBox(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Range(null) {
  var align: LineEdit.Align
    get() {
       return getAlign() 
    }
    set(value) {
      setAlign(value.value)
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

  constructor() : this(null) {
    _handle = __new()
  }

  fun apply() {
    __method_bind.apply.call(this._handle)
  }

  fun getAlign(): LineEdit.Align {
    val _ret = __method_bind.getAlign.call(this._handle)
    return LineEdit.Align.from(_ret.asInt())
  }

  fun getLineEdit(): LineEdit {
    val _ret = __method_bind.getLineEdit.call(this._handle)
    return _ret.toAny() as LineEdit
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
    val _arg = Variant(align)
    __method_bind.setAlign.call(this._handle, listOf(_arg))
  }

  fun setEditable(editable: Boolean) {
    val _arg = Variant(editable)
    __method_bind.setEditable.call(this._handle, listOf(_arg))
  }

  fun setPrefix(prefix: String) {
    val _arg = Variant(prefix)
    __method_bind.setPrefix.call(this._handle, listOf(_arg))
  }

  fun setSuffix(suffix: String) {
    val _arg = Variant(suffix)
    __method_bind.setSuffix.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpinBox".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SpinBox" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SpinBox
     */
    private object __method_bind {
      val apply: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "apply".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply" }
        }
      val getAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "get_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_align" }
        }
      val getLineEdit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "get_line_edit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line_edit" }
        }
      val getPrefix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "get_prefix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_prefix" }
        }
      val getSuffix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "get_suffix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_suffix" }
        }
      val isEditable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "is_editable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editable" }
        }
      val setAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "set_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_align" }
        }
      val setEditable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "set_editable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_editable" }
        }
      val setPrefix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "set_prefix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_prefix" }
        }
      val setSuffix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "set_suffix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_suffix" }
        }}
  }
}
