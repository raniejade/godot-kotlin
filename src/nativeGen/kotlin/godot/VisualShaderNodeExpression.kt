// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeExpression internal constructor(
  _handle: COpaquePointer
) : VisualShaderNodeGroupBase(_handle) {
  fun build() {
    TODO()
  }

  fun getExpression(): String {
    TODO()
  }

  fun setExpression(expression: String) {
    TODO()
  }

  companion object {
    fun new(): VisualShaderNodeExpression = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeExpression".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeExpression" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeExpression(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeExpression
     */
    private object __method_bind {
      val build: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeExpression".cstr.ptr,
              "build".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method build" }
            }
          }

      val get_expression: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeExpression".cstr.ptr,
              "get_expression".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_expression" }
            }
          }

      val set_expression: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeExpression".cstr.ptr,
              "set_expression".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expression" }
            }
          }
    }
  }
}
