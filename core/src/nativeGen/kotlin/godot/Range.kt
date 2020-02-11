// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class Range(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
  var allowGreater: Boolean
    get() {
       return isGreaterAllowed() 
    }
    set(value) {
      setAllowGreater(value)
    }

  var allowLesser: Boolean
    get() {
       return isLesserAllowed() 
    }
    set(value) {
      setAllowLesser(value)
    }

  var expEdit: Boolean
    get() {
       return isRatioExp() 
    }
    set(value) {
      setExpRatio(value)
    }

  var maxValue: Float
    get() {
       return getMax() 
    }
    set(value) {
      setMax(value)
    }

  var minValue: Float
    get() {
       return getMin() 
    }
    set(value) {
      setMin(value)
    }

  var page: Float
    get() {
       return getPage() 
    }
    set(value) {
      setPage(value)
    }

  var ratio: Float
    get() {
       return getAsRatio() 
    }
    set(value) {
      setAsRatio(value)
    }

  var rounded: Boolean
    get() {
       return isUsingRoundedValues() 
    }
    set(value) {
      setUseRoundedValues(value)
    }

  var step: Float
    get() {
       return getStep() 
    }
    set(value) {
      setStep(value)
    }

  var value: Float
    get() {
       return getValue() 
    }
    set(value) {
      setValue(value)
    }

  /**
   * Range::changed signal
   */
  val signalChanged: Signal0 = Signal0("changed")

  /**
   * Range::value_changed signal
   */
  val signalValueChanged: Signal1<Float> = Signal1("value_changed")

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAsRatio(): Float {
    val _ret = __method_bind.getAsRatio.call(this._handle)
    return _ret.asFloat()
  }

  fun getMax(): Float {
    val _ret = __method_bind.getMax.call(this._handle)
    return _ret.asFloat()
  }

  fun getMin(): Float {
    val _ret = __method_bind.getMin.call(this._handle)
    return _ret.asFloat()
  }

  fun getPage(): Float {
    val _ret = __method_bind.getPage.call(this._handle)
    return _ret.asFloat()
  }

  fun getStep(): Float {
    val _ret = __method_bind.getStep.call(this._handle)
    return _ret.asFloat()
  }

  fun getValue(): Float {
    val _ret = __method_bind.getValue.call(this._handle)
    return _ret.asFloat()
  }

  fun isGreaterAllowed(): Boolean {
    val _ret = __method_bind.isGreaterAllowed.call(this._handle)
    return _ret.asBoolean()
  }

  fun isLesserAllowed(): Boolean {
    val _ret = __method_bind.isLesserAllowed.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRatioExp(): Boolean {
    val _ret = __method_bind.isRatioExp.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsingRoundedValues(): Boolean {
    val _ret = __method_bind.isUsingRoundedValues.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAllowGreater(allow: Boolean) {
    val _arg = Variant(allow)
    __method_bind.setAllowGreater.call(this._handle, listOf(_arg))
  }

  fun setAllowLesser(allow: Boolean) {
    val _arg = Variant(allow)
    __method_bind.setAllowLesser.call(this._handle, listOf(_arg))
  }

  fun setAsRatio(value: Float) {
    val _arg = Variant(value)
    __method_bind.setAsRatio.call(this._handle, listOf(_arg))
  }

  fun setExpRatio(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setExpRatio.call(this._handle, listOf(_arg))
  }

  fun setMax(maximum: Float) {
    val _arg = Variant(maximum)
    __method_bind.setMax.call(this._handle, listOf(_arg))
  }

  fun setMin(minimum: Float) {
    val _arg = Variant(minimum)
    __method_bind.setMin.call(this._handle, listOf(_arg))
  }

  fun setPage(pagesize: Float) {
    val _arg = Variant(pagesize)
    __method_bind.setPage.call(this._handle, listOf(_arg))
  }

  fun setStep(step: Float) {
    val _arg = Variant(step)
    __method_bind.setStep.call(this._handle, listOf(_arg))
  }

  fun setUseRoundedValues(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setUseRoundedValues.call(this._handle, listOf(_arg))
  }

  fun setValue(value: Float) {
    val _arg = Variant(value)
    __method_bind.setValue.call(this._handle, listOf(_arg))
  }

  fun share(with: Node) {
    val _arg = Variant(with)
    __method_bind.share.call(this._handle, listOf(_arg))
  }

  fun unshare() {
    __method_bind.unshare.call(this._handle)
  }

  companion object {
    /**
     * Container for method_bind pointers for Range
     */
    private object __method_bind {
      val getAsRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "get_as_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_as_ratio" }
        }
      val getMax: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "get_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max" }
        }
      val getMin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "get_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_min" }
        }
      val getPage: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "get_page".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_page" }
        }
      val getStep: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "get_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_step" }
        }
      val getValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "get_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_value" }
        }
      val isGreaterAllowed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "is_greater_allowed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_greater_allowed" }
        }
      val isLesserAllowed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "is_lesser_allowed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_lesser_allowed" }
        }
      val isRatioExp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "is_ratio_exp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ratio_exp" }
        }
      val isUsingRoundedValues: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "is_using_rounded_values".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_rounded_values" }
        }
      val setAllowGreater: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_allow_greater".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_greater" }
        }
      val setAllowLesser: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_allow_lesser".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_lesser" }
        }
      val setAsRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_as_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_ratio" }
        }
      val setExpRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_exp_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exp_ratio" }
        }
      val setMax: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max" }
        }
      val setMin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_min" }
        }
      val setPage: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_page".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_page" }
        }
      val setStep: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_step" }
        }
      val setUseRoundedValues: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_use_rounded_values".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_rounded_values" }
        }
      val setValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_value" }
        }
      val share: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "share".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method share" }
        }
      val unshare: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "unshare".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unshare" }
        }}
  }
}
