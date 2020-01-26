// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
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

open class UndoRedo internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addDoMethod(`object`: Object, method: String): Variant {
    TODO()
  }

  fun addDoProperty(
    `object`: Object,
    property: String,
    value: Variant
  ) {
    TODO()
  }

  fun addDoReference(`object`: Object) {
    TODO()
  }

  fun addUndoMethod(`object`: Object, method: String): Variant {
    TODO()
  }

  fun addUndoProperty(
    `object`: Object,
    property: String,
    value: Variant
  ) {
    TODO()
  }

  fun addUndoReference(`object`: Object) {
    TODO()
  }

  fun clearHistory(increase_version: Boolean) {
    TODO()
  }

  fun commitAction() {
    TODO()
  }

  fun createAction(name: String, merge_mode: Int) {
    TODO()
  }

  fun getCurrentActionName(): String {
    TODO()
  }

  fun getVersion(): Int {
    TODO()
  }

  fun isCommitingAction(): Boolean {
    TODO()
  }

  fun redo(): Boolean {
    TODO()
  }

  fun undo(): Boolean {
    TODO()
  }

  enum class MergeMode(
    val value: Int
  ) {
    MERGE_DISABLE(0),

    MERGE_ENDS(1),

    MERGE_ALL(2);

    companion object {
      fun from(value: Int): MergeMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val MERGE_ALL: Int = 2

    val MERGE_DISABLE: Int = 0

    val MERGE_ENDS: Int = 1

    fun new(): UndoRedo = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("UndoRedo".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton UndoRedo" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      UndoRedo(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): UndoRedo = UndoRedo(ptr)
    /**
     * Container for method_bind pointers for UndoRedo
     */
    private object __method_bind {
      val add_do_method: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
              "add_do_method".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_do_method" }
            }
          }

      val add_do_property: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
              "add_do_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_do_property" }
            }
          }

      val add_do_reference: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
              "add_do_reference".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_do_reference" }
            }
          }

      val add_undo_method: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
              "add_undo_method".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_undo_method" }
            }
          }

      val add_undo_property: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
              "add_undo_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_undo_property" }
            }
          }

      val add_undo_reference: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
              "add_undo_reference".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_undo_reference" }
            }
          }

      val clear_history: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
              "clear_history".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_history" }
            }
          }

      val commit_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
              "commit_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method commit_action" }
            }
          }

      val create_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
              "create_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_action" }
            }
          }

      val get_current_action_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
              "get_current_action_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_action_name" }
            }
          }

      val get_version: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
              "get_version".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_version" }
            }
          }

      val is_commiting_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
              "is_commiting_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_commiting_action" }
            }
          }

      val redo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
              "redo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method redo" }
            }
          }

      val undo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
              "undo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method undo" }
            }
          }
    }
  }
}
