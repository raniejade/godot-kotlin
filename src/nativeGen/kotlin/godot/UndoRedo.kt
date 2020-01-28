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

open class UndoRedo(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addDoMethod(`object`: Object, method: String): Variant {
    val _args = VariantArray.new()
    _args.append(`object`)
    _args.append(method)
    val _ret = __method_bind.addDoMethod.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun addDoProperty(
    `object`: Object,
    property: String,
    value: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(`object`)
    _args.append(property)
    _args.append(value)
    __method_bind.addDoProperty.call(this._handle, _args.toVariant(), 3)
  }

  fun addDoReference(`object`: Object) {
    val _arg = Variant.new(`object`)
    __method_bind.addDoReference.call(this._handle, _arg, 1)
  }

  fun addUndoMethod(`object`: Object, method: String): Variant {
    val _args = VariantArray.new()
    _args.append(`object`)
    _args.append(method)
    val _ret = __method_bind.addUndoMethod.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun addUndoProperty(
    `object`: Object,
    property: String,
    value: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(`object`)
    _args.append(property)
    _args.append(value)
    __method_bind.addUndoProperty.call(this._handle, _args.toVariant(), 3)
  }

  fun addUndoReference(`object`: Object) {
    val _arg = Variant.new(`object`)
    __method_bind.addUndoReference.call(this._handle, _arg, 1)
  }

  fun clearHistory(increaseVersion: Boolean) {
    val _arg = Variant.new(increaseVersion)
    __method_bind.clearHistory.call(this._handle, _arg, 1)
  }

  fun commitAction() {
    __method_bind.commitAction.call(this._handle)
  }

  fun createAction(name: String, mergeMode: Int) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(mergeMode)
    __method_bind.createAction.call(this._handle, _args.toVariant(), 2)
  }

  fun getCurrentActionName(): String {
    val _ret = __method_bind.getCurrentActionName.call(this._handle)
    return _ret.asString()
  }

  fun getVersion(): Int {
    val _ret = __method_bind.getVersion.call(this._handle)
    return _ret.asInt()
  }

  fun isCommitingAction(): Boolean {
    val _ret = __method_bind.isCommitingAction.call(this._handle)
    return _ret.asBoolean()
  }

  fun redo(): Boolean {
    val _ret = __method_bind.redo.call(this._handle)
    return _ret.asBoolean()
  }

  fun undo(): Boolean {
    val _ret = __method_bind.undo.call(this._handle)
    return _ret.asBoolean()
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
      requireNotNull(fnPtr) { "No instance found for UndoRedo" }
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
      val addDoMethod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "addDoMethod".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addDoMethod" }
        }
      val addDoProperty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "addDoProperty".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addDoProperty" }
        }
      val addDoReference: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "addDoReference".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addDoReference" }
        }
      val addUndoMethod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "addUndoMethod".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addUndoMethod" }
        }
      val addUndoProperty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "addUndoProperty".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addUndoProperty" }
        }
      val addUndoReference: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "addUndoReference".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addUndoReference" }
        }
      val clearHistory: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "clearHistory".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearHistory" }
        }
      val commitAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "commitAction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method commitAction" }
        }
      val createAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "createAction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createAction" }
        }
      val getCurrentActionName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "getCurrentActionName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentActionName" }
        }
      val getVersion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "getVersion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVersion" }
        }
      val isCommitingAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "isCommitingAction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCommitingAction" }
        }
      val redo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "redo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method redo" }
        }
      val undo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UndoRedo".cstr.ptr,
            "undo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method undo" }
        }}
  }
}
