// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class VisibilityNotifier2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var rect: Rect2
    get() {
       return getRect() 
    }
    set(value) {
      setRect(value)
    }

  /**
   * VisibilityNotifier2D::screen_entered signal
   */
  val signalScreenEntered: Signal0 = Signal0("screen_entered")

  /**
   * VisibilityNotifier2D::screen_exited signal
   */
  val signalScreenExited: Signal0 = Signal0("screen_exited")

  /**
   * VisibilityNotifier2D::viewport_entered signal
   */
  val signalViewportEntered: Signal1<Viewport> = Signal1("viewport_entered")

  /**
   * VisibilityNotifier2D::viewport_exited signal
   */
  val signalViewportExited: Signal1<Viewport> = Signal1("viewport_exited")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for rect
   */
  fun rect(cb: Rect2.() -> Unit) {
    val _p = rect
    cb(_p)
    rect = _p
  }

  fun getRect(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getRect.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isOnScreen(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isOnScreen.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setRect(rect: Rect2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRect.call(self._handle, listOf(rect), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisibilityNotifier2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisibilityNotifier2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisibilityNotifier2D
     */
    private object __method_bind {
      val getRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier2D".cstr.ptr,
            "get_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rect" }
        }
      val isOnScreen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier2D".cstr.ptr,
            "is_on_screen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_on_screen" }
        }
      val setRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier2D".cstr.ptr,
            "set_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rect" }
        }}
  }
}
