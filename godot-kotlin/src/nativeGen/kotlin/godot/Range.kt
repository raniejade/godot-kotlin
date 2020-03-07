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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAsRatio(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAsRatio.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMax(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMax.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMin(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMin.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPage(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPage.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getStep(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStep.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getValue(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getValue.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isGreaterAllowed(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isGreaterAllowed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isLesserAllowed(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isLesserAllowed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isRatioExp(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRatioExp.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isUsingRoundedValues(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUsingRoundedValues.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAllowGreater(allow: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAllowGreater.call(self._handle, listOf(allow), null)
    }
  }

  fun setAllowLesser(allow: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAllowLesser.call(self._handle, listOf(allow), null)
    }
  }

  fun setAsRatio(value: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAsRatio.call(self._handle, listOf(value), null)
    }
  }

  fun setExpRatio(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExpRatio.call(self._handle, listOf(enabled), null)
    }
  }

  fun setMax(maximum: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMax.call(self._handle, listOf(maximum), null)
    }
  }

  fun setMin(minimum: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMin.call(self._handle, listOf(minimum), null)
    }
  }

  fun setPage(pagesize: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPage.call(self._handle, listOf(pagesize), null)
    }
  }

  fun setStep(step: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStep.call(self._handle, listOf(step), null)
    }
  }

  fun setUseRoundedValues(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseRoundedValues.call(self._handle, listOf(enabled), null)
    }
  }

  fun setValue(value: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setValue.call(self._handle, listOf(value), null)
    }
  }

  fun share(with: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.share.call(self._handle, listOf(with), null)
    }
  }

  fun unshare() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.unshare.call(self._handle, emptyList(), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for Range
     */
    private object __method_bind {
      val getAsRatio: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "get_as_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_as_ratio" }
            }
          }

      val getMax: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "get_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max" }
            }
          }

      val getMin: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "get_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_min" }
            }
          }

      val getPage: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "get_page".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_page" }
            }
          }

      val getStep: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "get_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_step" }
            }
          }

      val getValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "get_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_value" }
            }
          }

      val isGreaterAllowed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "is_greater_allowed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_greater_allowed" }
            }
          }

      val isLesserAllowed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "is_lesser_allowed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_lesser_allowed" }
            }
          }

      val isRatioExp: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "is_ratio_exp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_ratio_exp" }
            }
          }

      val isUsingRoundedValues: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "is_using_rounded_values".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_rounded_values" }
            }
          }

      val setAllowGreater: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_allow_greater".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_allow_greater" }
            }
          }

      val setAllowLesser: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_allow_lesser".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_allow_lesser" }
            }
          }

      val setAsRatio: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_as_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_as_ratio" }
            }
          }

      val setExpRatio: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_exp_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_exp_ratio" }
            }
          }

      val setMax: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max" }
            }
          }

      val setMin: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_min" }
            }
          }

      val setPage: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_page".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_page" }
            }
          }

      val setStep: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_step" }
            }
          }

      val setUseRoundedValues: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_use_rounded_values".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_rounded_values" }
            }
          }

      val setValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_value" }
            }
          }

      val share: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "share".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method share" }
            }
          }

      val unshare: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "unshare".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unshare" }
            }
          }
    }
  }
}
