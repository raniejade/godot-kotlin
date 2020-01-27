// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptInputAction internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getActionMode(): Mode {
    val _ret = __method_bind.get_action_mode.call(this.toVariant())
    TODO()
  }

  fun getActionName(): String {
    val _ret = __method_bind.get_action_name.call(this.toVariant())
    TODO()
  }

  fun setActionMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    val _ret = __method_bind.set_action_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setActionName(name: String) {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.set_action_name.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  enum class Mode(
    val value: Int
  ) {
    MODE_PRESSED(0),

    MODE_RELEASED(1),

    MODE_JUST_PRESSED(2),

    MODE_JUST_RELEASED(3);

    companion object {
      fun from(value: Int): Mode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val MODE_JUST_PRESSED: Int = 2

    val MODE_JUST_RELEASED: Int = 3

    val MODE_PRESSED: Int = 0

    val MODE_RELEASED: Int = 1

    fun new(): VisualScriptInputAction = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptInputAction".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptInputAction" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptInputAction(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptInputAction = VisualScriptInputAction(ptr)
    /**
     * Container for method_bind pointers for VisualScriptInputAction
     */
    private object __method_bind {
      val get_action_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptInputAction".cstr.ptr,
              "get_action_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_action_mode" }
            }
          }

      val get_action_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptInputAction".cstr.ptr,
              "get_action_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_action_name" }
            }
          }

      val set_action_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptInputAction".cstr.ptr,
              "set_action_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_action_mode" }
            }
          }

      val set_action_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptInputAction".cstr.ptr,
              "set_action_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_action_name" }
            }
          }
    }
  }
}
