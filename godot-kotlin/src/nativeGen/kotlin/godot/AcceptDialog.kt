// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

  open fun _builtin_text_entered(arg0: String) {
    TODO()
  }

  open fun _custom_action(arg0: String) {
    TODO()
  }

  open fun _ok() {
    TODO()
  }

  fun addButton(
    text: String,
    right: Boolean = false,
    action: String = ""
  ): Button {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Button
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(text)
      _args.add(right)
      _args.add(action)
      __method_bind.addButton.call(self._handle, _args, _retPtr)
      _ret = objectToType<Button>(_tmp.value!!)
      _ret
    }
  }

  fun addCancel(name: String): Button {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Button
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.addCancel.call(self._handle, listOf(name), _retPtr)
      _ret = objectToType<Button>(_tmp.value!!)
      _ret
    }
  }

  fun getHideOnOk(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHideOnOk.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLabel(): Label {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Label
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getLabel.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Label>(_tmp.value!!)
      _ret
    }
  }

  fun getOk(): Button {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Button
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getOk.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Button>(_tmp.value!!)
      _ret
    }
  }

  fun getText(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getText.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun hasAutowrap(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasAutowrap.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun registerTextEnter(lineEdit: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.registerTextEnter.call(self._handle, listOf(lineEdit), null)
    }
  }

  fun setAutowrap(autowrap: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAutowrap.call(self._handle, listOf(autowrap), null)
    }
  }

  fun setHideOnOk(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHideOnOk.call(self._handle, listOf(enabled), null)
    }
  }

  fun setText(text: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setText.call(self._handle, listOf(text), null)
    }
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
