// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
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

open class EditorProperty(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Container(null) {
  var checkable: Boolean
    get() {
       return isCheckable() 
    }
    set(value) {
      setCheckable(value)
    }

  var checked: Boolean
    get() {
       return isChecked() 
    }
    set(value) {
      setChecked(value)
    }

  var drawRed: Boolean
    get() {
       return isDrawRed() 
    }
    set(value) {
      setDrawRed(value)
    }

  var keying: Boolean
    get() {
       return isKeying() 
    }
    set(value) {
      setKeying(value)
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

  /**
   * EditorProperty::multiple_properties_changed signal
   */
  val signalMultiplePropertiesChanged: Signal2<PoolStringArray, VariantArray> =
      Signal2("multiple_properties_changed")

  /**
   * EditorProperty::object_id_selected signal
   */
  val signalObjectIdSelected: Signal2<String, Int> = Signal2("object_id_selected")

  /**
   * EditorProperty::property_changed signal
   */
  val signalPropertyChanged: Signal2<String, Variant> = Signal2("property_changed")

  /**
   * EditorProperty::property_checked signal
   */
  val signalPropertyChecked: Signal2<String, String> = Signal2("property_checked")

  /**
   * EditorProperty::property_keyed signal
   */
  val signalPropertyKeyed: Signal1<String> = Signal1("property_keyed")

  /**
   * EditorProperty::property_keyed_with_value signal
   */
  val signalPropertyKeyedWithValue: Signal2<String, Variant> = Signal2("property_keyed_with_value")

  /**
   * EditorProperty::resource_selected signal
   */
  val signalResourceSelected: Signal2<String, Resource> = Signal2("resource_selected")

  /**
   * EditorProperty::selected signal
   */
  val signalSelected: Signal2<String, Int> = Signal2("selected")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _focusable_focused(arg0: Int) {
    TODO()
  }

  fun addFocusable(control: Control) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addFocusable.call(self._handle, listOf(control), null)
    }
  }

  fun emitChanged(
    property: String,
    value: Variant,
    field: String = "",
    changing: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(property)
      _args.add(value)
      _args.add(field)
      _args.add(changing)
      __method_bind.emitChanged.call(self._handle, _args, null)
    }
  }

  fun getEditedObject(): Object {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Object
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getEditedObject.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Object>(_tmp.value!!)
      _ret
    }
  }

  fun getEditedProperty(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getEditedProperty.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getLabel(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getLabel.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getTooltipText(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getTooltipText.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun isCheckable(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCheckable.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isChecked(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isChecked.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isDrawRed(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDrawRed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isKeying(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isKeying.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isReadOnly(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isReadOnly.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setBottomEditor(editor: Control) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBottomEditor.call(self._handle, listOf(editor), null)
    }
  }

  fun setCheckable(checkable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCheckable.call(self._handle, listOf(checkable), null)
    }
  }

  fun setChecked(checked: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setChecked.call(self._handle, listOf(checked), null)
    }
  }

  fun setDrawRed(drawRed: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDrawRed.call(self._handle, listOf(drawRed), null)
    }
  }

  fun setKeying(keying: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setKeying.call(self._handle, listOf(keying), null)
    }
  }

  fun setLabel(text: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLabel.call(self._handle, listOf(text), null)
    }
  }

  fun setReadOnly(readOnly: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setReadOnly.call(self._handle, listOf(readOnly), null)
    }
  }

  open fun update_property() {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorProperty
     */
    private object __method_bind {
      val addFocusable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "add_focusable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_focusable" }
            }
          }

      val emitChanged: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "emit_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method emit_changed" }
            }
          }

      val getEditedObject: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "get_edited_object".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edited_object" }
            }
          }

      val getEditedProperty: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "get_edited_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edited_property" }
            }
          }

      val getLabel: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "get_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_label" }
            }
          }

      val getTooltipText: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "get_tooltip_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tooltip_text" }
            }
          }

      val isCheckable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "is_checkable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_checkable" }
            }
          }

      val isChecked: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "is_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_checked" }
            }
          }

      val isDrawRed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "is_draw_red".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_draw_red" }
            }
          }

      val isKeying: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "is_keying".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_keying" }
            }
          }

      val isReadOnly: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "is_read_only".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_read_only" }
            }
          }

      val setBottomEditor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "set_bottom_editor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bottom_editor" }
            }
          }

      val setCheckable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "set_checkable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_checkable" }
            }
          }

      val setChecked: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "set_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_checked" }
            }
          }

      val setDrawRed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "set_draw_red".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_red" }
            }
          }

      val setKeying: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "set_keying".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_keying" }
            }
          }

      val setLabel: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "set_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_label" }
            }
          }

      val setReadOnly: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "set_read_only".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_read_only" }
            }
          }
    }
  }
}
