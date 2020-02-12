// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun isExclusive(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isExclusive.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun popup(bounds: Rect2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.popup.call(self._handle, listOf(bounds), null)
    }
  }

  fun popupCentered(size: Vector2 = Vector2(0, 0)) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.popupCentered.call(self._handle, listOf(size), null)
    }
  }

  fun popupCenteredClamped(size: Vector2 = Vector2(0, 0), fallbackRatio: Float = 0.75f) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(size)
      _args.add(fallbackRatio)
      __method_bind.popupCenteredClamped.call(self._handle, _args, null)
    }
  }

  fun popupCenteredMinsize(minsize: Vector2 = Vector2(0, 0)) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.popupCenteredMinsize.call(self._handle, listOf(minsize), null)
    }
  }

  fun popupCenteredRatio(ratio: Float = 0.75f) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.popupCenteredRatio.call(self._handle, listOf(ratio), null)
    }
  }

  fun setAsMinsize() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAsMinsize.call(self._handle, emptyList(), null)
    }
  }

  fun setExclusive(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExclusive.call(self._handle, listOf(enable), null)
    }
  }

  companion object {
    val NOTIFICATION_POPUP_HIDE: Int = 81

    val NOTIFICATION_POST_POPUP: Int = 80

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "is_exclusive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_exclusive" }
        }
      val popup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup" }
        }
      val popupCentered: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup_centered" }
        }
      val popupCenteredClamped: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup_centered_clamped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup_centered_clamped" }
        }
      val popupCenteredMinsize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup_centered_minsize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup_centered_minsize" }
        }
      val popupCenteredRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "popup_centered_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method popup_centered_ratio" }
        }
      val setAsMinsize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "set_as_minsize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_minsize" }
        }
      val setExclusive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
            "set_exclusive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exclusive" }
        }}
  }
}
