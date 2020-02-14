// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Any
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

open class UndoRedo(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  /**
   * UndoRedo::version_changed signal
   */
  val signalVersionChanged: Signal0 = Signal0("version_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addDoMethod(
    `object`: Object,
    method: String,
    vararg varargs: Any?
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(method)
      varargs.forEach { _args.add(it) }
      __method_bind.addDoMethod.call(self._handle, _args, null)
    }
  }

  fun addDoProperty(
    `object`: Object,
    property: String,
    value: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(property)
      _args.add(value)
      __method_bind.addDoProperty.call(self._handle, _args, null)
    }
  }

  fun addDoReference(`object`: Object) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addDoReference.call(self._handle, listOf(`object`), null)
    }
  }

  fun addUndoMethod(
    `object`: Object,
    method: String,
    vararg varargs: Any?
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(method)
      varargs.forEach { _args.add(it) }
      __method_bind.addUndoMethod.call(self._handle, _args, null)
    }
  }

  fun addUndoProperty(
    `object`: Object,
    property: String,
    value: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(property)
      _args.add(value)
      __method_bind.addUndoProperty.call(self._handle, _args, null)
    }
  }

  fun addUndoReference(`object`: Object) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addUndoReference.call(self._handle, listOf(`object`), null)
    }
  }

  fun clearHistory(increaseVersion: Boolean = true) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearHistory.call(self._handle, listOf(increaseVersion), null)
    }
  }

  fun commitAction() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.commitAction.call(self._handle, emptyList(), null)
    }
  }

  fun createAction(name: String, mergeMode: Int = 0) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(mergeMode)
      __method_bind.createAction.call(self._handle, _args, null)
    }
  }

  fun getCurrentActionName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getCurrentActionName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getVersion(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVersion.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun hasRedo(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasRedo.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun hasUndo(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasUndo.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isCommitingAction(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCommitingAction.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun redo(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.redo.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun undo(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.undo.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  enum class MergeMode(
    val value: Int
  ) {
    DISABLE(0),

    ENDS(1),

    ALL(2);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("UndoRedo".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for UndoRedo" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for UndoRedo
     */
    private object __method_bind {
      val addDoMethod: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "add_do_method".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_do_method" }
        }
      val addDoProperty: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "add_do_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_do_property" }
        }
      val addDoReference: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "add_do_reference".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_do_reference" }
        }
      val addUndoMethod: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "add_undo_method".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_undo_method" }
        }
      val addUndoProperty: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "add_undo_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_undo_property" }
        }
      val addUndoReference: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "add_undo_reference".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_undo_reference" }
        }
      val clearHistory: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "clear_history".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_history" }
        }
      val commitAction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "commit_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method commit_action" }
        }
      val createAction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "create_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_action" }
        }
      val getCurrentActionName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "get_current_action_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_action_name" }
        }
      val getVersion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "get_version".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_version" }
        }
      val hasRedo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "has_redo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_redo" }
        }
      val hasUndo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "has_undo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_undo" }
        }
      val isCommitingAction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "is_commiting_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_commiting_action" }
        }
      val redo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "redo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method redo" }
        }
      val undo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "undo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method undo" }
        }}
  }
}
