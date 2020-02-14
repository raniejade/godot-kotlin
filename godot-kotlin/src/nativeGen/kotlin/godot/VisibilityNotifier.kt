// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.AABB
import godot.core.Allocator
import godot.core.Godot
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

open class VisibilityNotifier(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var aabb: AABB
    get() {
       return getAabb() 
    }
    set(value) {
      setAabb(value)
    }

  /**
   * VisibilityNotifier::camera_entered signal
   */
  val signalCameraEntered: Signal1<Camera> = Signal1("camera_entered")

  /**
   * VisibilityNotifier::camera_exited signal
   */
  val signalCameraExited: Signal1<Camera> = Signal1("camera_exited")

  /**
   * VisibilityNotifier::screen_entered signal
   */
  val signalScreenEntered: Signal0 = Signal0("screen_entered")

  /**
   * VisibilityNotifier::screen_exited signal
   */
  val signalScreenExited: Signal0 = Signal0("screen_exited")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for aabb
   */
  fun aabb(cb: AABB.() -> Unit) {
    val _p = aabb
    cb(_p)
    aabb = _p
  }

  fun getAabb(): AABB {
    val self = this
    return Allocator.allocationScope {
      val _ret = AABB()
      val _retPtr = _ret._value.ptr
      __method_bind.getAabb.call(self._handle, emptyList(), _retPtr)
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

  fun setAabb(rect: AABB) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAabb.call(self._handle, listOf(rect), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisibilityNotifier".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisibilityNotifier" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisibilityNotifier
     */
    private object __method_bind {
      val getAabb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier".cstr.ptr,
            "get_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_aabb" }
        }
      val isOnScreen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier".cstr.ptr,
            "is_on_screen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_on_screen" }
        }
      val setAabb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier".cstr.ptr,
            "set_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_aabb" }
        }}
  }
}
