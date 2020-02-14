// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class Label(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
  var align: Align
    get() {
       return getAlign() 
    }
    set(value) {
      setAlign(value.value)
    }

  var autowrap: Boolean
    get() {
       return hasAutowrap() 
    }
    set(value) {
      setAutowrap(value)
    }

  var clipText: Boolean
    get() {
       return isClippingText() 
    }
    set(value) {
      setClipText(value)
    }

  var linesSkipped: Int
    get() {
       return getLinesSkipped() 
    }
    set(value) {
      setLinesSkipped(value)
    }

  var maxLinesVisible: Int
    get() {
       return getMaxLinesVisible() 
    }
    set(value) {
      setMaxLinesVisible(value)
    }

  var percentVisible: Float
    get() {
       return getPercentVisible() 
    }
    set(value) {
      setPercentVisible(value)
    }

  var text: String
    get() {
       return getText() 
    }
    set(value) {
      setText(value)
    }

  var uppercase: Boolean
    get() {
       return isUppercase() 
    }
    set(value) {
      setUppercase(value)
    }

  var valign: VAlign
    get() {
       return getValign() 
    }
    set(value) {
      setValign(value.value)
    }

  var visibleCharacters: Int
    get() {
       return getVisibleCharacters() 
    }
    set(value) {
      setVisibleCharacters(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAlign(): Align {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAlign.call(self._handle, emptyList(), _retPtr)
      Label.Align.from(_ret.value)
    }
  }

  fun getLineCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLineCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLineHeight(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLineHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLinesSkipped(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLinesSkipped.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMaxLinesVisible(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMaxLinesVisible.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPercentVisible(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPercentVisible.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
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

  fun getTotalCharacterCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTotalCharacterCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getValign(): VAlign {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getValign.call(self._handle, emptyList(), _retPtr)
      Label.VAlign.from(_ret.value)
    }
  }

  fun getVisibleCharacters(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVisibleCharacters.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getVisibleLineCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVisibleLineCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
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

  fun isClippingText(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isClippingText.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isUppercase(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUppercase.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAlign(align: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAlign.call(self._handle, listOf(align), null)
    }
  }

  fun setAutowrap(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAutowrap.call(self._handle, listOf(enable), null)
    }
  }

  fun setClipText(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setClipText.call(self._handle, listOf(enable), null)
    }
  }

  fun setLinesSkipped(linesSkipped: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLinesSkipped.call(self._handle, listOf(linesSkipped), null)
    }
  }

  fun setMaxLinesVisible(linesVisible: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaxLinesVisible.call(self._handle, listOf(linesVisible), null)
    }
  }

  fun setPercentVisible(percentVisible: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPercentVisible.call(self._handle, listOf(percentVisible), null)
    }
  }

  fun setText(text: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setText.call(self._handle, listOf(text), null)
    }
  }

  fun setUppercase(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUppercase.call(self._handle, listOf(enable), null)
    }
  }

  fun setValign(valign: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setValign.call(self._handle, listOf(valign), null)
    }
  }

  fun setVisibleCharacters(amount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVisibleCharacters.call(self._handle, listOf(amount), null)
    }
  }

  enum class Align(
    val value: Int
  ) {
    LEFT(0),

    CENTER(1),

    RIGHT(2),

    FILL(3);

    companion object {
      fun from(value: Int): Align {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class VAlign(
    val value: Int
  ) {
    TOP(0),

    CENTER(1),

    BOTTOM(2),

    FILL(3);

    companion object {
      fun from(value: Int): VAlign {
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Label".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Label" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Label
     */
    private object __method_bind {
      val getAlign: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_align" }
        }
      val getLineCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_line_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line_count" }
        }
      val getLineHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_line_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line_height" }
        }
      val getLinesSkipped: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_lines_skipped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lines_skipped" }
        }
      val getMaxLinesVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_max_lines_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_lines_visible" }
        }
      val getPercentVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_percent_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_percent_visible" }
        }
      val getText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val getTotalCharacterCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_total_character_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_character_count" }
        }
      val getValign: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_valign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_valign" }
        }
      val getVisibleCharacters: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_visible_characters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visible_characters" }
        }
      val getVisibleLineCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_visible_line_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visible_line_count" }
        }
      val hasAutowrap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "has_autowrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_autowrap" }
        }
      val isClippingText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "is_clipping_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_clipping_text" }
        }
      val isUppercase: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "is_uppercase".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_uppercase" }
        }
      val setAlign: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_align" }
        }
      val setAutowrap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_autowrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autowrap" }
        }
      val setClipText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_clip_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clip_text" }
        }
      val setLinesSkipped: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_lines_skipped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lines_skipped" }
        }
      val setMaxLinesVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_max_lines_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_lines_visible" }
        }
      val setPercentVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_percent_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_percent_visible" }
        }
      val setText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }
      val setUppercase: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_uppercase".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uppercase" }
        }
      val setValign: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_valign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_valign" }
        }
      val setVisibleCharacters: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_visible_characters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_visible_characters" }
        }}
  }
}
