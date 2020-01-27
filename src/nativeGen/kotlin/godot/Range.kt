// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Range internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun getAsRatio(): Float {
    val _ret = __method_bind.get_as_ratio.call(this._handle)
    return _ret.asFloat()
  }

  fun getMax(): Float {
    val _ret = __method_bind.get_max.call(this._handle)
    return _ret.asFloat()
  }

  fun getMin(): Float {
    val _ret = __method_bind.get_min.call(this._handle)
    return _ret.asFloat()
  }

  fun getPage(): Float {
    val _ret = __method_bind.get_page.call(this._handle)
    return _ret.asFloat()
  }

  fun getStep(): Float {
    val _ret = __method_bind.get_step.call(this._handle)
    return _ret.asFloat()
  }

  fun getValue(): Float {
    val _ret = __method_bind.get_value.call(this._handle)
    return _ret.asFloat()
  }

  fun isGreaterAllowed(): Boolean {
    val _ret = __method_bind.is_greater_allowed.call(this._handle)
    return _ret.asBool()
  }

  fun isLesserAllowed(): Boolean {
    val _ret = __method_bind.is_lesser_allowed.call(this._handle)
    return _ret.asBool()
  }

  fun isRatioExp(): Boolean {
    val _ret = __method_bind.is_ratio_exp.call(this._handle)
    return _ret.asBool()
  }

  fun isUsingRoundedValues(): Boolean {
    val _ret = __method_bind.is_using_rounded_values.call(this._handle)
    return _ret.asBool()
  }

  fun setAllowGreater(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.set_allow_greater.call(this._handle, _arg, 1)
  }

  fun setAllowLesser(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.set_allow_lesser.call(this._handle, _arg, 1)
  }

  fun setAsRatio(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.set_as_ratio.call(this._handle, _arg, 1)
  }

  fun setExpRatio(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_exp_ratio.call(this._handle, _arg, 1)
  }

  fun setMax(maximum: Float) {
    val _arg = Variant.new(maximum)
    __method_bind.set_max.call(this._handle, _arg, 1)
  }

  fun setMin(minimum: Float) {
    val _arg = Variant.new(minimum)
    __method_bind.set_min.call(this._handle, _arg, 1)
  }

  fun setPage(pagesize: Float) {
    val _arg = Variant.new(pagesize)
    __method_bind.set_page.call(this._handle, _arg, 1)
  }

  fun setStep(step: Float) {
    val _arg = Variant.new(step)
    __method_bind.set_step.call(this._handle, _arg, 1)
  }

  fun setUseRoundedValues(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_use_rounded_values.call(this._handle, _arg, 1)
  }

  fun setValue(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.set_value.call(this._handle, _arg, 1)
  }

  fun share(with: Node) {
    val _arg = Variant.new(with)
    __method_bind.share.call(this._handle, _arg, 1)
  }

  fun unshare() {
    __method_bind.unshare.call(this._handle)
  }

  companion object {
    /**
     * Container for method_bind pointers for Range
     */
    private object __method_bind {
      val get_as_ratio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "get_as_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_as_ratio" }
        }
      val get_max: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "get_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max" }
        }
      val get_min: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "get_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_min" }
        }
      val get_page: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "get_page".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_page" }
        }
      val get_step: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "get_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_step" }
        }
      val get_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "get_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_value" }
        }
      val is_greater_allowed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "is_greater_allowed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_greater_allowed" }
        }
      val is_lesser_allowed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "is_lesser_allowed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_lesser_allowed" }
        }
      val is_ratio_exp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "is_ratio_exp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ratio_exp" }
        }
      val is_using_rounded_values: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "is_using_rounded_values".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_rounded_values" }
        }
      val set_allow_greater: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_allow_greater".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_greater" }
        }
      val set_allow_lesser: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_allow_lesser".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_lesser" }
        }
      val set_as_ratio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_as_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_ratio" }
        }
      val set_exp_ratio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_exp_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exp_ratio" }
        }
      val set_max: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max" }
        }
      val set_min: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_min" }
        }
      val set_page: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_page".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_page" }
        }
      val set_step: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_step" }
        }
      val set_use_rounded_values: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_use_rounded_values".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_rounded_values" }
        }
      val set_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "set_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_value" }
        }
      val share: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "share".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method share" }
        }
      val unshare: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "unshare".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unshare" }
        }}
  }
}
