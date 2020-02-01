// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorInspectorPlugin(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addCustomControl(control: Control) {
    val _arg = Variant.new(control)
    __method_bind.addCustomControl.call(this._handle, listOf(_arg))
  }

  fun addPropertyEditor(property: String, editor: Control) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(property))
    _args.add(Variant.fromAny(editor))
    __method_bind.addPropertyEditor.call(this._handle, _args)
  }

  fun addPropertyEditorForMultipleProperties(
    label: String,
    properties: PoolStringArray,
    editor: Control
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(label))
    _args.add(Variant.fromAny(properties))
    _args.add(Variant.fromAny(editor))
    __method_bind.addPropertyEditorForMultipleProperties.call(this._handle, _args)
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorInspectorPlugin
     */
    private object __method_bind {
      val addCustomControl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
            "add_custom_control".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_custom_control" }
        }
      val addPropertyEditor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
            "add_property_editor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_property_editor" }
        }
      val addPropertyEditorForMultipleProperties: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
            "add_property_editor_for_multiple_properties".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method add_property_editor_for_multiple_properties" }
        }}
  }
}
