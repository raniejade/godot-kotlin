// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
    TODO()
  }

  fun getMax(): Float {
    TODO()
  }

  fun getMin(): Float {
    TODO()
  }

  fun getPage(): Float {
    TODO()
  }

  fun getStep(): Float {
    TODO()
  }

  fun getValue(): Float {
    TODO()
  }

  fun isGreaterAllowed(): Boolean {
    TODO()
  }

  fun isLesserAllowed(): Boolean {
    TODO()
  }

  fun isRatioExp(): Boolean {
    TODO()
  }

  fun isUsingRoundedValues(): Boolean {
    TODO()
  }

  fun setAllowGreater(allow: Boolean) {
    TODO()
  }

  fun setAllowLesser(allow: Boolean) {
    TODO()
  }

  fun setAsRatio(value: Float) {
    TODO()
  }

  fun setExpRatio(enabled: Boolean) {
    TODO()
  }

  fun setMax(maximum: Float) {
    TODO()
  }

  fun setMin(minimum: Float) {
    TODO()
  }

  fun setPage(pagesize: Float) {
    TODO()
  }

  fun setStep(step: Float) {
    TODO()
  }

  fun setUseRoundedValues(enabled: Boolean) {
    TODO()
  }

  fun setValue(value: Float) {
    TODO()
  }

  fun share(with: Node) {
    TODO()
  }

  fun unshare() {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for Range
     */
    private object __method_bind {
      val get_as_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "get_as_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_as_ratio" }
            }
          }

      val get_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "get_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max" }
            }
          }

      val get_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "get_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_min" }
            }
          }

      val get_page: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "get_page".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_page" }
            }
          }

      val get_step: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "get_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_step" }
            }
          }

      val get_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "get_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_value" }
            }
          }

      val is_greater_allowed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "is_greater_allowed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_greater_allowed" }
            }
          }

      val is_lesser_allowed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "is_lesser_allowed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_lesser_allowed" }
            }
          }

      val is_ratio_exp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "is_ratio_exp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_ratio_exp" }
            }
          }

      val is_using_rounded_values: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "is_using_rounded_values".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_rounded_values" }
            }
          }

      val set_allow_greater: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_allow_greater".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_allow_greater" }
            }
          }

      val set_allow_lesser: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_allow_lesser".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_allow_lesser" }
            }
          }

      val set_as_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_as_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_as_ratio" }
            }
          }

      val set_exp_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_exp_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_exp_ratio" }
            }
          }

      val set_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max" }
            }
          }

      val set_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_min" }
            }
          }

      val set_page: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_page".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_page" }
            }
          }

      val set_step: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_step" }
            }
          }

      val set_use_rounded_values: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_use_rounded_values".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_rounded_values" }
            }
          }

      val set_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "set_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_value" }
            }
          }

      val share: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "share".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method share" }
            }
          }

      val unshare: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Range".cstr.ptr,
              "unshare".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unshare" }
            }
          }
    }
  }
}
