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

open class Range(
  _handle: COpaquePointer
) : Control(_handle) {
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
    val _arg = Variant.new(allow)
    __method_bind.setAllowGreater.call(this._handle, _arg, 1)
  }

  fun setAllowLesser(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.setAllowLesser.call(this._handle, _arg, 1)
  }

  fun setAsRatio(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.setAsRatio.call(this._handle, _arg, 1)
  }

  fun setExpRatio(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setExpRatio.call(this._handle, _arg, 1)
  }

  fun setMax(maximum: Float) {
    val _arg = Variant.new(maximum)
    __method_bind.setMax.call(this._handle, _arg, 1)
  }

  fun setMin(minimum: Float) {
    val _arg = Variant.new(minimum)
    __method_bind.setMin.call(this._handle, _arg, 1)
  }

  fun setPage(pagesize: Float) {
    val _arg = Variant.new(pagesize)
    __method_bind.setPage.call(this._handle, _arg, 1)
  }

  fun setStep(step: Float) {
    val _arg = Variant.new(step)
    __method_bind.setStep.call(this._handle, _arg, 1)
  }

  fun setUseRoundedValues(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setUseRoundedValues.call(this._handle, _arg, 1)
  }

  fun setValue(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.setValue.call(this._handle, _arg, 1)
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
      val getAsRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "getAsRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAsRatio" }
        }
      val getMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "getMax".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMax" }
        }
      val getMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "getMin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMin" }
        }
      val getPage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "getPage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPage" }
        }
      val getStep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "getStep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStep" }
        }
      val getValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "getValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getValue" }
        }
      val isGreaterAllowed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "isGreaterAllowed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isGreaterAllowed" }
        }
      val isLesserAllowed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "isLesserAllowed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isLesserAllowed" }
        }
      val isRatioExp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "isRatioExp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRatioExp" }
        }
      val isUsingRoundedValues: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "isUsingRoundedValues".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUsingRoundedValues" }
        }
      val setAllowGreater: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "setAllowGreater".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAllowGreater" }
        }
      val setAllowLesser: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "setAllowLesser".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAllowLesser" }
        }
      val setAsRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "setAsRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAsRatio" }
        }
      val setExpRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "setExpRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExpRatio" }
        }
      val setMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "setMax".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMax" }
        }
      val setMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "setMin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMin" }
        }
      val setPage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "setPage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPage" }
        }
      val setStep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "setStep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setStep" }
        }
      val setUseRoundedValues: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "setUseRoundedValues".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseRoundedValues" }
        }
      val setValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
            "setValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setValue" }
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
