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
  var align: Int
    get() {
       return Label.Align.from(getAlign()) 
    }
    set(value) {
      setAlign(Label.Align.from(value))
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

  var valign: Int
    get() {
       return Label.VAlign.from(getValign()) 
    }
    set(value) {
      setValign(Label.VAlign.from(value))
    }

  var visibleCharacters: Int
    get() {
       return getVisibleCharacters() 
    }
    set(value) {
      setVisibleCharacters(value)
    }

  fun getAlign(): Align {
    val _ret = __method_bind.getAlign.call(this._handle)
    return Label.Align.from(_ret.asInt())
  }

  fun getLineCount(): Int {
    val _ret = __method_bind.getLineCount.call(this._handle)
    return _ret.asInt()
  }

  fun getLineHeight(): Int {
    val _ret = __method_bind.getLineHeight.call(this._handle)
    return _ret.asInt()
  }

  fun getLinesSkipped(): Int {
    val _ret = __method_bind.getLinesSkipped.call(this._handle)
    return _ret.asInt()
  }

  fun getMaxLinesVisible(): Int {
    val _ret = __method_bind.getMaxLinesVisible.call(this._handle)
    return _ret.asInt()
  }

  fun getPercentVisible(): Float {
    val _ret = __method_bind.getPercentVisible.call(this._handle)
    return _ret.asFloat()
  }

  fun getText(): String {
    val _ret = __method_bind.getText.call(this._handle)
    return _ret.asString()
  }

  fun getTotalCharacterCount(): Int {
    val _ret = __method_bind.getTotalCharacterCount.call(this._handle)
    return _ret.asInt()
  }

  fun getValign(): VAlign {
    val _ret = __method_bind.getValign.call(this._handle)
    return Label.VAlign.from(_ret.asInt())
  }

  fun getVisibleCharacters(): Int {
    val _ret = __method_bind.getVisibleCharacters.call(this._handle)
    return _ret.asInt()
  }

  fun getVisibleLineCount(): Int {
    val _ret = __method_bind.getVisibleLineCount.call(this._handle)
    return _ret.asInt()
  }

  fun hasAutowrap(): Boolean {
    val _ret = __method_bind.hasAutowrap.call(this._handle)
    return _ret.asBoolean()
  }

  fun isClippingText(): Boolean {
    val _ret = __method_bind.isClippingText.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUppercase(): Boolean {
    val _ret = __method_bind.isUppercase.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAlign(align: Int) {
    val _arg = Variant.new(align)
    __method_bind.setAlign.call(this._handle, _arg, 1)
  }

  fun setAutowrap(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAutowrap.call(this._handle, _arg, 1)
  }

  fun setClipText(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setClipText.call(this._handle, _arg, 1)
  }

  fun setLinesSkipped(linesSkipped: Int) {
    val _arg = Variant.new(linesSkipped)
    __method_bind.setLinesSkipped.call(this._handle, _arg, 1)
  }

  fun setMaxLinesVisible(linesVisible: Int) {
    val _arg = Variant.new(linesVisible)
    __method_bind.setMaxLinesVisible.call(this._handle, _arg, 1)
  }

  fun setPercentVisible(percentVisible: Float) {
    val _arg = Variant.new(percentVisible)
    __method_bind.setPercentVisible.call(this._handle, _arg, 1)
  }

  fun setText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setText.call(this._handle, _arg, 1)
  }

  fun setUppercase(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUppercase.call(this._handle, _arg, 1)
  }

  fun setValign(valign: Int) {
    val _arg = Variant.new(valign)
    __method_bind.setValign.call(this._handle, _arg, 1)
  }

  fun setVisibleCharacters(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setVisibleCharacters.call(this._handle, _arg, 1)
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
      val getAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "getAlign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAlign" }
        }
      val getLineCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "getLineCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLineCount" }
        }
      val getLineHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "getLineHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLineHeight" }
        }
      val getLinesSkipped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "getLinesSkipped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLinesSkipped" }
        }
      val getMaxLinesVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "getMaxLinesVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaxLinesVisible" }
        }
      val getPercentVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "getPercentVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPercentVisible" }
        }
      val getText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "getText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getText" }
        }
      val getTotalCharacterCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "getTotalCharacterCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTotalCharacterCount" }
        }
      val getValign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "getValign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getValign" }
        }
      val getVisibleCharacters: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "getVisibleCharacters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVisibleCharacters" }
        }
      val getVisibleLineCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "getVisibleLineCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVisibleLineCount" }
        }
      val hasAutowrap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "hasAutowrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasAutowrap" }
        }
      val isClippingText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "isClippingText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isClippingText" }
        }
      val isUppercase: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "isUppercase".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUppercase" }
        }
      val setAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "setAlign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAlign" }
        }
      val setAutowrap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "setAutowrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAutowrap" }
        }
      val setClipText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "setClipText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setClipText" }
        }
      val setLinesSkipped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "setLinesSkipped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLinesSkipped" }
        }
      val setMaxLinesVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "setMaxLinesVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaxLinesVisible" }
        }
      val setPercentVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "setPercentVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPercentVisible" }
        }
      val setText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "setText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setText" }
        }
      val setUppercase: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "setUppercase".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUppercase" }
        }
      val setValign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "setValign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setValign" }
        }
      val setVisibleCharacters: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
            "setVisibleCharacters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVisibleCharacters" }
        }}
  }
}
