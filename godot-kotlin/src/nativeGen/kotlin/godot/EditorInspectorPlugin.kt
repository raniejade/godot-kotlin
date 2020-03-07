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

open class EditorInspectorPlugin(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addCustomControl(control: Control) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addCustomControl.call(self._handle, listOf(control), null)
    }
  }

  fun addPropertyEditor(property: String, editor: Control) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(property)
      _args.add(editor)
      __method_bind.addPropertyEditor.call(self._handle, _args, null)
    }
  }

  fun addPropertyEditorForMultipleProperties(
    label: String,
    properties: PoolStringArray,
    editor: Control
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(label)
      _args.add(properties)
      _args.add(editor)
      __method_bind.addPropertyEditorForMultipleProperties.call(self._handle, _args, null)
    }
  }

  open fun can_handle(`object`: Object): Boolean {
    TODO()
  }

  open fun parse_begin(`object`: Object) {
    TODO()
  }

  open fun parse_category(`object`: Object, category: String) {
    TODO()
  }

  open fun parse_end() {
    TODO()
  }

  open fun parse_property(
    `object`: Object,
    type: Int,
    path: String,
    hint: Int,
    hintText: String,
    usage: Int
  ): Boolean {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorInspectorPlugin
     */
    private object __method_bind {
      val addCustomControl: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
              "add_custom_control".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_custom_control" }
            }
          }

      val addPropertyEditor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
              "add_property_editor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_property_editor" }
            }
          }

      val addPropertyEditorForMultipleProperties: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
              "add_property_editor_for_multiple_properties".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method add_property_editor_for_multiple_properties" }
            }
          }
    }
  }
}
