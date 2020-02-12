// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
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

open class Button(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : BaseButton(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getButtonIcon(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getButtonIcon.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getClipText(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getClipText.call(self._handle, emptyList(), _retPtr)
      _ret.value
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

  fun getTextAlign(): TextAlign {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTextAlign.call(self._handle, emptyList(), _retPtr)
      Button.TextAlign.from(_ret.value)
    }
  }

  fun isExpandIcon(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isExpandIcon.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isFlat(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFlat.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setButtonIcon(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setButtonIcon.call(self._handle, listOf(texture), null)
    }
  }

  fun setClipText(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setClipText.call(self._handle, listOf(enabled), null)
    }
  }

  fun setExpandIcon(arg0: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExpandIcon.call(self._handle, listOf(arg0), null)
    }
  }

  fun setFlat(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFlat.call(self._handle, listOf(enabled), null)
    }
  }

  fun setText(text: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setText.call(self._handle, listOf(text), null)
    }
  }

  fun setTextAlign(align: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTextAlign.call(self._handle, listOf(align), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Button".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Button" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Button
     */
    private object __method_bind {
      val getButtonIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "get_button_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_button_icon" }
        }
      val getClipText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "get_clip_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_clip_text" }
        }
      val getText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val getTextAlign: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "get_text_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text_align" }
        }
      val isExpandIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "is_expand_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_expand_icon" }
        }
      val isFlat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "is_flat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flat" }
        }
      val setButtonIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "set_button_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_button_icon" }
        }
      val setClipText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "set_clip_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clip_text" }
        }
      val setExpandIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "set_expand_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expand_icon" }
        }
      val setFlat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "set_flat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flat" }
        }
      val setText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }
      val setTextAlign: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
            "set_text_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text_align" }
        }}
  }
}
