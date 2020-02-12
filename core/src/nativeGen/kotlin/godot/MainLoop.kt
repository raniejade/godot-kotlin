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

open class MainLoop(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  /**
   * MainLoop::on_request_permissions_result signal
   */
  val signalOnRequestPermissionsResult: Signal2<String, Boolean> =
      Signal2("on_request_permissions_result")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun finish() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.finish.call(self._handle, emptyList(), null)
    }
  }

  fun idle(delta: Float): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.idle.call(self._handle, listOf(delta), _retPtr)
      _ret.value
    }
  }

  fun init() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.init.call(self._handle, emptyList(), null)
    }
  }

  fun inputEvent(event: InputEvent) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.inputEvent.call(self._handle, listOf(event), null)
    }
  }

  fun inputText(text: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.inputText.call(self._handle, listOf(text), null)
    }
  }

  fun iteration(delta: Float): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.iteration.call(self._handle, listOf(delta), _retPtr)
      _ret.value
    }
  }

  companion object {
    val NOTIFICATION_APP_PAUSED: Int = 1015

    val NOTIFICATION_APP_RESUMED: Int = 1014

    val NOTIFICATION_CRASH: Int = 1012

    val NOTIFICATION_OS_IME_UPDATE: Int = 1013

    val NOTIFICATION_OS_MEMORY_WARNING: Int = 1009

    val NOTIFICATION_TRANSLATION_CHANGED: Int = 1010

    val NOTIFICATION_WM_ABOUT: Int = 1011

    val NOTIFICATION_WM_FOCUS_IN: Int = 1004

    val NOTIFICATION_WM_FOCUS_OUT: Int = 1005

    val NOTIFICATION_WM_GO_BACK_REQUEST: Int = 1007

    val NOTIFICATION_WM_MOUSE_ENTER: Int = 1002

    val NOTIFICATION_WM_MOUSE_EXIT: Int = 1003

    val NOTIFICATION_WM_QUIT_REQUEST: Int = 1006

    val NOTIFICATION_WM_UNFOCUS_REQUEST: Int = 1008

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MainLoop".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MainLoop" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for MainLoop
     */
    private object __method_bind {
      val finish: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
            "finish".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method finish" }
        }
      val idle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
            "idle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method idle" }
        }
      val init: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
            "init".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method init" }
        }
      val inputEvent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
            "input_event".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method input_event" }
        }
      val inputText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
            "input_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method input_text" }
        }
      val iteration: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
            "iteration".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method iteration" }
        }}
  }
}
