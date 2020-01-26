// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptYieldSignal internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getBasePath(): NodePath {
    TODO()
  }

  fun getBaseType(): String {
    TODO()
  }

  fun getCallMode(): CallMode {
    TODO()
  }

  fun getSignal(): String {
    TODO()
  }

  fun setBasePath(base_path: NodePath) {
    TODO()
  }

  fun setBaseType(base_type: String) {
    TODO()
  }

  fun setCallMode(mode: Int) {
    TODO()
  }

  fun setSignal(signal: String) {
    TODO()
  }

  enum class CallMode(
    val value: Int
  ) {
    CALL_MODE_SELF(0),

    CALL_MODE_NODE_PATH(1),

    CALL_MODE_INSTANCE(2);
  }

  companion object {
    val CALL_MODE_INSTANCE: Int = 2

    val CALL_MODE_NODE_PATH: Int = 1

    val CALL_MODE_SELF: Int = 0

    fun new(): VisualScriptYieldSignal = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptYieldSignal".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptYieldSignal" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptYieldSignal(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualScriptYieldSignal
     */
    private object __method_bind {
      val get_base_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
              "get_base_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_path" }
            }
          }

      val get_base_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
              "get_base_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_type" }
            }
          }

      val get_call_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
              "get_call_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_call_mode" }
            }
          }

      val get_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
              "get_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_signal" }
            }
          }

      val set_base_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
              "set_base_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_path" }
            }
          }

      val set_base_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
              "set_base_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_type" }
            }
          }

      val set_call_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
              "set_call_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_call_mode" }
            }
          }

      val set_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
              "set_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_signal" }
            }
          }
    }
  }
}
