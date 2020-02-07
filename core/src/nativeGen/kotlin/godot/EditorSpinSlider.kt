// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class EditorSpinSlider(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Range(null) {
  var flat: Boolean
    get() {
       return isFlat() 
    }
    set(value) {
      setFlat(value)
    }

  var label: String
    get() {
       return getLabel() 
    }
    set(value) {
      setLabel(value)
    }

  var readOnly: Boolean
    get() {
       return isReadOnly() 
    }
    set(value) {
      setReadOnly(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getLabel(): String {
    val _ret = __method_bind.getLabel.call(this._handle)
    return _ret.asString()
  }

  fun isFlat(): Boolean {
    val _ret = __method_bind.isFlat.call(this._handle)
    return _ret.asBoolean()
  }

  fun isReadOnly(): Boolean {
    val _ret = __method_bind.isReadOnly.call(this._handle)
    return _ret.asBoolean()
  }

  fun setFlat(flat: Boolean) {
    val _arg = Variant.new(flat)
    __method_bind.setFlat.call(this._handle, listOf(_arg))
  }

  fun setLabel(label: String) {
    val _arg = Variant.new(label)
    __method_bind.setLabel.call(this._handle, listOf(_arg))
  }

  fun setReadOnly(readOnly: Boolean) {
    val _arg = Variant.new(readOnly)
    __method_bind.setReadOnly.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorSpinSlider
     */
    private object __method_bind {
      val getLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpinSlider".cstr.ptr,
            "get_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_label" }
        }
      val isFlat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpinSlider".cstr.ptr,
            "is_flat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flat" }
        }
      val isReadOnly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpinSlider".cstr.ptr,
            "is_read_only".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_read_only" }
        }
      val setFlat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpinSlider".cstr.ptr,
            "set_flat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flat" }
        }
      val setLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpinSlider".cstr.ptr,
            "set_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_label" }
        }
      val setReadOnly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpinSlider".cstr.ptr,
            "set_read_only".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_read_only" }
        }}
  }
}
