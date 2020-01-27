// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Label(
  _handle: COpaquePointer
) : Control(_handle) {
  fun getAlign(): Align {
    val _ret = __method_bind.get_align.call(this._handle)
    return Label.Align.from(_ret.asInt())
  }

  fun getLineCount(): Int {
    val _ret = __method_bind.get_line_count.call(this._handle)
    return _ret.asInt()
  }

  fun getLineHeight(): Int {
    val _ret = __method_bind.get_line_height.call(this._handle)
    return _ret.asInt()
  }

  fun getLinesSkipped(): Int {
    val _ret = __method_bind.get_lines_skipped.call(this._handle)
    return _ret.asInt()
  }

  fun getMaxLinesVisible(): Int {
    val _ret = __method_bind.get_max_lines_visible.call(this._handle)
    return _ret.asInt()
  }

  fun getPercentVisible(): Float {
    val _ret = __method_bind.get_percent_visible.call(this._handle)
    return _ret.asFloat()
  }

  fun getText(): String {
    val _ret = __method_bind.get_text.call(this._handle)
    return _ret.asString()
  }

  fun getTotalCharacterCount(): Int {
    val _ret = __method_bind.get_total_character_count.call(this._handle)
    return _ret.asInt()
  }

  fun getValign(): VAlign {
    val _ret = __method_bind.get_valign.call(this._handle)
    return Label.VAlign.from(_ret.asInt())
  }

  fun getVisibleCharacters(): Int {
    val _ret = __method_bind.get_visible_characters.call(this._handle)
    return _ret.asInt()
  }

  fun getVisibleLineCount(): Int {
    val _ret = __method_bind.get_visible_line_count.call(this._handle)
    return _ret.asInt()
  }

  fun hasAutowrap(): Boolean {
    val _ret = __method_bind.has_autowrap.call(this._handle)
    return _ret.asBool()
  }

  fun isClippingText(): Boolean {
    val _ret = __method_bind.is_clipping_text.call(this._handle)
    return _ret.asBool()
  }

  fun isUppercase(): Boolean {
    val _ret = __method_bind.is_uppercase.call(this._handle)
    return _ret.asBool()
  }

  fun setAlign(align: Int) {
    val _arg = Variant.new(align)
    __method_bind.set_align.call(this._handle, _arg, 1)
  }

  fun setAutowrap(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_autowrap.call(this._handle, _arg, 1)
  }

  fun setClipText(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_clip_text.call(this._handle, _arg, 1)
  }

  fun setLinesSkipped(linesSkipped: Int) {
    val _arg = Variant.new(linesSkipped)
    __method_bind.set_lines_skipped.call(this._handle, _arg, 1)
  }

  fun setMaxLinesVisible(linesVisible: Int) {
    val _arg = Variant.new(linesVisible)
    __method_bind.set_max_lines_visible.call(this._handle, _arg, 1)
  }

  fun setPercentVisible(percentVisible: Float) {
    val _arg = Variant.new(percentVisible)
    __method_bind.set_percent_visible.call(this._handle, _arg, 1)
  }

  fun setText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.set_text.call(this._handle, _arg, 1)
  }

  fun setUppercase(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_uppercase.call(this._handle, _arg, 1)
  }

  fun setValign(valign: Int) {
    val _arg = Variant.new(valign)
    __method_bind.set_valign.call(this._handle, _arg, 1)
  }

  fun setVisibleCharacters(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.set_visible_characters.call(this._handle, _arg, 1)
  }

  enum class Align(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_FILL(3);

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
    VALIGN_TOP(0),

    VALIGN_CENTER(1),

    VALIGN_BOTTOM(2),

    VALIGN_FILL(3);

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
    val ALIGN_CENTER: Int = 1

    val ALIGN_FILL: Int = 3

    val ALIGN_LEFT: Int = 0

    val ALIGN_RIGHT: Int = 2

    val VALIGN_BOTTOM: Int = 2

    val VALIGN_CENTER: Int = 1

    val VALIGN_FILL: Int = 3

    val VALIGN_TOP: Int = 0

    fun new(): Label = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Label".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Label" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Label(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Label = Label(ptr)
    /**
     * Container for method_bind pointers for Label
     */
    private object __method_bind {
      val get_align: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_align" }
        }
      val get_line_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_line_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line_count" }
        }
      val get_line_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_line_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line_height" }
        }
      val get_lines_skipped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_lines_skipped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lines_skipped" }
        }
      val get_max_lines_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_max_lines_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_lines_visible" }
        }
      val get_percent_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_percent_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_percent_visible" }
        }
      val get_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val get_total_character_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_total_character_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_character_count" }
        }
      val get_valign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_valign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_valign" }
        }
      val get_visible_characters: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_visible_characters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visible_characters" }
        }
      val get_visible_line_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "get_visible_line_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visible_line_count" }
        }
      val has_autowrap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "has_autowrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_autowrap" }
        }
      val is_clipping_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "is_clipping_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_clipping_text" }
        }
      val is_uppercase: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "is_uppercase".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_uppercase" }
        }
      val set_align: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_align" }
        }
      val set_autowrap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_autowrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autowrap" }
        }
      val set_clip_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_clip_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clip_text" }
        }
      val set_lines_skipped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_lines_skipped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lines_skipped" }
        }
      val set_max_lines_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_max_lines_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_lines_visible" }
        }
      val set_percent_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_percent_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_percent_visible" }
        }
      val set_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }
      val set_uppercase: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_uppercase".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uppercase" }
        }
      val set_valign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_valign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_valign" }
        }
      val set_visible_characters: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "set_visible_characters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_visible_characters" }
        }}
  }
}
