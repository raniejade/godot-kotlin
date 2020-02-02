// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Button(
  _handle: COpaquePointer
) : BaseButton(_handle) {
  var align: TextAlign
    get() {
       return getTextAlign() 
    }
    set(value) {
      setTextAlign(value.value)
    }

  var clipText: Boolean
    get() {
       return getClipText() 
    }
    set(value) {
      setClipText(value)
    }

  var expandIcon: Boolean
    get() {
       return isExpandIcon() 
    }
    set(value) {
      setExpandIcon(value)
    }

  var flat: Boolean
    get() {
       return isFlat() 
    }
    set(value) {
      setFlat(value)
    }

  var icon: Texture
    get() {
       return getButtonIcon() 
    }
    set(value) {
      setButtonIcon(value)
    }

  var text: String
    get() {
       return getText() 
    }
    set(value) {
      setText(value)
    }

  fun getButtonIcon(): Texture {
    val _ret = __method_bind.getButtonIcon.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getClipText(): Boolean {
    val _ret = __method_bind.getClipText.call(this._handle)
    return _ret.asBoolean()
  }

  fun getText(): String {
    val _ret = __method_bind.getText.call(this._handle)
    return _ret.asString()
  }

  fun getTextAlign(): TextAlign {
    val _ret = __method_bind.getTextAlign.call(this._handle)
    return Button.TextAlign.from(_ret.asInt())
  }

  fun isExpandIcon(): Boolean {
    val _ret = __method_bind.isExpandIcon.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFlat(): Boolean {
    val _ret = __method_bind.isFlat.call(this._handle)
    return _ret.asBoolean()
  }

  fun setButtonIcon(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setButtonIcon.call(this._handle, listOf(_arg))
  }

  fun setClipText(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setClipText.call(this._handle, listOf(_arg))
  }

  fun setExpandIcon(arg0: Boolean) {
    val _arg = Variant.new(arg0)
    __method_bind.setExpandIcon.call(this._handle, listOf(_arg))
  }

  fun setFlat(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setFlat.call(this._handle, listOf(_arg))
  }

  fun setText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setText.call(this._handle, listOf(_arg))
  }

  fun setTextAlign(align: Int) {
    val _arg = Variant.new(align)
    __method_bind.setTextAlign.call(this._handle, listOf(_arg))
  }

  enum class TextAlign(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2);

    companion object {
      fun from(value: Int): TextAlign {
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
    fun new(): Button = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Button".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Button" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Button(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Button = Button(ptr)
    /**
     * Container for method_bind pointers for Button
     */
    private object __method_bind {
      val getButtonIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "get_button_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_button_icon" }
        }
      val getClipText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "get_clip_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_clip_text" }
        }
      val getText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val getTextAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "get_text_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text_align" }
        }
      val isExpandIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "is_expand_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_expand_icon" }
        }
      val isFlat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "is_flat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flat" }
        }
      val setButtonIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "set_button_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_button_icon" }
        }
      val setClipText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "set_clip_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clip_text" }
        }
      val setExpandIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "set_expand_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expand_icon" }
        }
      val setFlat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "set_flat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flat" }
        }
      val setText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }
      val setTextAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "set_text_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text_align" }
        }}
  }
}
