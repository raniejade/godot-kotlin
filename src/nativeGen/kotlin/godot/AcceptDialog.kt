// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AcceptDialog(
  _handle: COpaquePointer
) : WindowDialog(_handle) {
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

  fun addButton(
    text: String,
    right: Boolean,
    action: String
  ): Button {
    val _args = VariantArray.new()
    _args.append(text)
    _args.append(right)
    _args.append(action)
    val _ret = __method_bind.addButton.call(this._handle, _args.toVariant(), 3)
    return _ret.asObject(::Button)!!
  }

  fun addCancel(name: String): Button {
    val _arg = Variant.new(name)
    val _ret = __method_bind.addCancel.call(this._handle, _arg, 1)
    return _ret.asObject(::Button)!!
  }

  fun getHideOnOk(): Boolean {
    val _ret = __method_bind.getHideOnOk.call(this._handle)
    return _ret.asBoolean()
  }

  fun getLabel(): Label {
    val _ret = __method_bind.getLabel.call(this._handle)
    return _ret.asObject(::Label)!!
  }

  fun getOk(): Button {
    val _ret = __method_bind.getOk.call(this._handle)
    return _ret.asObject(::Button)!!
  }

  fun getText(): String {
    val _ret = __method_bind.getText.call(this._handle)
    return _ret.asString()
  }

  fun registerTextEnter(lineEdit: Node) {
    val _arg = Variant.new(lineEdit)
    __method_bind.registerTextEnter.call(this._handle, _arg, 1)
  }

  fun setHideOnOk(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setHideOnOk.call(this._handle, _arg, 1)
  }

  fun setText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setText.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AcceptDialog = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AcceptDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AcceptDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AcceptDialog(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AcceptDialog = AcceptDialog(ptr)
    /**
     * Container for method_bind pointers for AcceptDialog
     */
    private object __method_bind {
      val addButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "addButton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addButton" }
        }
      val addCancel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "addCancel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addCancel" }
        }
      val getHideOnOk: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "getHideOnOk".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHideOnOk" }
        }
      val getLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "getLabel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLabel" }
        }
      val getOk: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "getOk".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOk" }
        }
      val getText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "getText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getText" }
        }
      val registerTextEnter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "registerTextEnter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method registerTextEnter" }
        }
      val setHideOnOk: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "setHideOnOk".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHideOnOk" }
        }
      val setText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
            "setText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setText" }
        }}
  }
}
