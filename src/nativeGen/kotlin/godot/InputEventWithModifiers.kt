// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventWithModifiers internal constructor(
  _handle: COpaquePointer
) : InputEvent(_handle) {
  fun getAlt(): Boolean {
    TODO()
  }

  fun getCommand(): Boolean {
    TODO()
  }

  fun getControl(): Boolean {
    TODO()
  }

  fun getMetakey(): Boolean {
    TODO()
  }

  fun getShift(): Boolean {
    TODO()
  }

  fun setAlt() {
    TODO()
  }

  fun setCommand() {
    TODO()
  }

  fun setControl() {
    TODO()
  }

  fun setMetakey() {
    TODO()
  }

  fun setShift() {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for InputEventWithModifiers
     */
    private object __method_bind {
      val get_alt: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
              "get_alt".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_alt" }
            }
          }

      val get_command: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
              "get_command".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_command" }
            }
          }

      val get_control: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
              "get_control".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_control" }
            }
          }

      val get_metakey: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
              "get_metakey".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_metakey" }
            }
          }

      val get_shift: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
              "get_shift".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shift" }
            }
          }

      val set_alt: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
              "set_alt".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_alt" }
            }
          }

      val set_command: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
              "set_command".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_command" }
            }
          }

      val set_control: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
              "set_control".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_control" }
            }
          }

      val set_metakey: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
              "set_metakey".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_metakey" }
            }
          }

      val set_shift: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
              "set_shift".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shift" }
            }
          }
    }
  }
}
