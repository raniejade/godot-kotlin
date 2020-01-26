// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class SpinBox internal constructor(
  _handle: COpaquePointer
) : Range(_handle) {
  fun getAlign(): LineEdit.Align {
    TODO()
  }

  fun getLineEdit(): LineEdit {
    TODO()
  }

  fun getPrefix(): String {
    TODO()
  }

  fun getSuffix(): String {
    TODO()
  }

  fun isEditable(): Boolean {
    TODO()
  }

  fun setAlign(align: Int) {
    TODO()
  }

  fun setEditable(editable: Boolean) {
    TODO()
  }

  fun setPrefix(prefix: String) {
    TODO()
  }

  fun setSuffix(suffix: String) {
    TODO()
  }

  companion object {
    fun new(): SpinBox = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpinBox".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton SpinBox" }
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
      val get_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
              "get_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_align" }
            }
          }

      val get_line_edit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
              "get_line_edit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_line_edit" }
            }
          }

      val get_prefix: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
              "get_prefix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_prefix" }
            }
          }

      val get_suffix: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
              "get_suffix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_suffix" }
            }
          }

      val is_editable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
              "is_editable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editable" }
            }
          }

      val set_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
              "set_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_align" }
            }
          }

      val set_editable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
              "set_editable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_editable" }
            }
          }

      val set_prefix: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
              "set_prefix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_prefix" }
            }
          }

      val set_suffix: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
              "set_suffix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_suffix" }
            }
          }
    }
  }
}
