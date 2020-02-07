// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
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

open class Popup(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
  var popupExclusive: Boolean
    get() {
       return isExclusive() 
    }
    set(value) {
      setExclusive(value)
    }

  /**
   * Popup::about_to_show signal
   */
  val signalAboutToShow: Signal0 = Signal0("about_to_show")

  /**
   * Popup::popup_hide signal
   */
  val signalPopupHide: Signal0 = Signal0("popup_hide")

  constructor() : this(null) {
    _handle = __new()
  }

  fun isExclusive(): Boolean {
    val _ret = __method_bind.isExclusive.call(this._handle)
    return _ret.asBoolean()
  }

  fun popup(bounds: Rect2) {
    val _arg = Variant(bounds)
    __method_bind.popup.call(this._handle, listOf(_arg))
  }

  fun popupCentered(size: Vector2 = Vector2(0, 0)) {
    val _arg = Variant(size)
    __method_bind.popupCentered.call(this._handle, listOf(_arg))
  }

  fun popupCenteredClamped(size: Vector2 = Vector2(0, 0), fallbackRatio: Float = 0.75f) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(size))
    _args.add(Variant.fromAny(fallbackRatio))
    __method_bind.popupCenteredClamped.call(this._handle, _args)
  }

  fun popupCenteredMinsize(minsize: Vector2 = Vector2(0, 0)) {
    val _arg = Variant(minsize)
    __method_bind.popupCenteredMinsize.call(this._handle, listOf(_arg))
  }

  fun popupCenteredRatio(ratio: Float = 0.75f) {
    val _arg = Variant(ratio)
    __method_bind.popupCenteredRatio.call(this._handle, listOf(_arg))
  }

  fun setAsMinsize() {
    __method_bind.setAsMinsize.call(this._handle)
  }

  fun setExclusive(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setExclusive.call(this._handle, listOf(_arg))
  }

  companion object {
    val NOTIFICATION_POPUP_HIDE: Int = 81

    val NOTIFICATION_POST_POPUP: Int = 80

    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Popup".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Popup" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Popup
     */
    private object __method_bind {
      val isExclusive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "is_exclusive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_exclusive" }
        }
      val popup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup" }
        }
      val popupCentered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup_centered" }
        }
      val popupCenteredClamped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup_centered_clamped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup_centered_clamped" }
        }
      val popupCenteredMinsize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup_centered_minsize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup_centered_minsize" }
        }
      val popupCenteredRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup_centered_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup_centered_ratio" }
        }
      val setAsMinsize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "set_as_minsize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_minsize" }
        }
      val setExclusive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "set_exclusive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exclusive" }
        }}
  }
}
