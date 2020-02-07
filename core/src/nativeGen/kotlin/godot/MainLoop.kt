// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
    _handle = __new()
  }

  fun finish() {
    __method_bind.finish.call(this._handle)
  }

  fun idle(delta: Float): Boolean {
    val _arg = Variant.new(delta)
    val _ret = __method_bind.idle.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun init() {
    __method_bind.init.call(this._handle)
  }

  fun inputEvent(event: InputEvent) {
    val _arg = Variant.new(event)
    __method_bind.inputEvent.call(this._handle, listOf(_arg))
  }

  fun inputText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.inputText.call(this._handle, listOf(_arg))
  }

  fun iteration(delta: Float): Boolean {
    val _arg = Variant.new(delta)
    val _ret = __method_bind.iteration.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
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

    internal fun __new(): COpaquePointer = memScoped {
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
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
            "finish".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method finish" }
        }
      val idle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
            "idle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method idle" }
        }
      val init: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
            "init".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method init" }
        }
      val inputEvent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
            "input_event".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method input_event" }
        }
      val inputText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
            "input_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method input_text" }
        }
      val iteration: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
            "iteration".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method iteration" }
        }}
  }
}
