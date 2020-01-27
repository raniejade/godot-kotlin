// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorInspectorPlugin internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addCustomControl(control: Control) {
    val _arg = Variant.new(control)
    __method_bind.add_custom_control.call(this.toVariant(), _arg, 1)
  }

  fun addPropertyEditor(property: String, editor: Control) {
    val _args = VariantArray.new()
    _args.append(property)
    _args.append(editor)
    __method_bind.add_property_editor.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun addPropertyEditorForMultipleProperties(
    label: String,
    properties: PoolStringArray,
    editor: Control
  ) {
    val _args = VariantArray.new()
    _args.append(label)
    _args.append(properties)
    _args.append(editor)
    __method_bind.add_property_editor_for_multiple_properties.call(this.toVariant(),
        _args.toVariant(), 3)
  }

  companion object {
    fun new(): EditorInspectorPlugin = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorInspectorPlugin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for EditorInspectorPlugin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorInspectorPlugin(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EditorInspectorPlugin = EditorInspectorPlugin(ptr)
    /**
     * Container for method_bind pointers for EditorInspectorPlugin
     */
    private object __method_bind {
      val add_custom_control: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
            "add_custom_control".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_custom_control" }
        }
      val add_property_editor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
            "add_property_editor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_property_editor" }
        }
      val add_property_editor_for_multiple_properties: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
            "add_property_editor_for_multiple_properties".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method add_property_editor_for_multiple_properties" }
        }}
  }
}
