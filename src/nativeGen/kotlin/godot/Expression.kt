// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Expression internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun execute(): Variant {
    TODO()
  }

  fun getErrorText(): String {
    TODO()
  }

  fun hasExecuteFailed(): Boolean {
    TODO()
  }

  fun parse(): Error {
    TODO()
  }

  companion object {
    fun new(): Expression = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Expression".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Expression" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Expression(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Expression
     */
    private object __method_bind {
      val execute: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Expression".cstr.ptr,
              "execute".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method execute" }
            }
          }

      val get_error_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Expression".cstr.ptr,
              "get_error_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_error_text" }
            }
          }

      val has_execute_failed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Expression".cstr.ptr,
              "has_execute_failed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_execute_failed" }
            }
          }

      val parse: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Expression".cstr.ptr,
              "parse".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method parse" }
            }
          }
    }
  }
}
