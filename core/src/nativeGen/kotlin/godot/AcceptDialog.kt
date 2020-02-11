// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
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

open class AcceptDialog(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : WindowDialog(null) {
  var dialogAutowrap: Boolean
    get() {
       return hasAutowrap() 
    }
    set(value) {
      setAutowrap(value)
    }

  var dialogHideOnOk: Boolean
    get() {
       return getHideOnOk() 
    }
    set(value) {
      setHideOnOk(value)
    }

  var dialogText: String
    get() {
       return getText() 
    }
    set(value) {
      setText(value)
    }

  /**
   * AcceptDialog::confirmed signal
   */
  val signalConfirmed: Signal0 = Signal0("confirmed")

  /**
   * AcceptDialog::custom_action signal
   */
  val signalCustomAction: Signal1<String> = Signal1("custom_action")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addButton(
    text: String,
    right: Boolean = false,
    action: String = ""
  ): Button {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(text))
    _args.add(Variant.fromAny(right))
    _args.add(Variant.fromAny(action))
    val _ret = __method_bind.addButton.call(this._handle, _args)
    return _ret.toAny() as Button
  }

  fun addCancel(name: String): Button {
    val _arg = Variant(name)
    val _ret = __method_bind.addCancel.call(this._handle, listOf(_arg))
    return _ret.toAny() as Button
  }

  fun getHideOnOk(): Boolean {
    val _ret = __method_bind.getHideOnOk.call(this._handle)
    return _ret.asBoolean()
  }

  fun getLabel(): Label {
    val _ret = __method_bind.getLabel.call(this._handle)
    return _ret.toAny() as Label
  }

  fun getOk(): Button {
    val _ret = __method_bind.getOk.call(this._handle)
    return _ret.toAny() as Button
  }

  fun getText(): String {
    val _ret = __method_bind.getText.call(this._handle)
    return _ret.asString()
  }

  fun hasAutowrap(): Boolean {
    val _ret = __method_bind.hasAutowrap.call(this._handle)
    return _ret.asBoolean()
  }

  fun registerTextEnter(lineEdit: Node) {
    val _arg = Variant(lineEdit)
    __method_bind.registerTextEnter.call(this._handle, listOf(_arg))
  }

  fun setAutowrap(autowrap: Boolean) {
    val _arg = Variant(autowrap)
    __method_bind.setAutowrap.call(this._handle, listOf(_arg))
  }

  fun setHideOnOk(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setHideOnOk.call(this._handle, listOf(_arg))
  }

  fun setText(text: String) {
    val _arg = Variant(text)
    __method_bind.setText.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AcceptDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AcceptDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AcceptDialog
     */
    private object __method_bind {
      val addButton: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "add_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_button" }
        }
      val addCancel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "add_cancel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_cancel" }
        }
      val getHideOnOk: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "get_hide_on_ok".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hide_on_ok" }
        }
      val getLabel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "get_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_label" }
        }
      val getOk: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "get_ok".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ok" }
        }
      val getText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val hasAutowrap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "has_autowrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_autowrap" }
        }
      val registerTextEnter: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "register_text_enter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method register_text_enter" }
        }
      val setAutowrap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "set_autowrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autowrap" }
        }
      val setHideOnOk: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "set_hide_on_ok".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hide_on_ok" }
        }
      val setText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }}
  }
}
