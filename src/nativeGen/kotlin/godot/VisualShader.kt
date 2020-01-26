// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShader internal constructor(
  _handle: COpaquePointer
) : Shader(_handle) {
  enum class Type(
    val value: Int
  ) {
    TYPE_VERTEX(0),

    TYPE_FRAGMENT(1),

    TYPE_LIGHT(2),

    TYPE_MAX(3);
  }

  companion object {
    val NODE_ID_INVALID: Int = -1

    val NODE_ID_OUTPUT: Int = 0

    val TYPE_FRAGMENT: Int = 1

    val TYPE_LIGHT: Int = 2

    val TYPE_MAX: Int = 3

    val TYPE_VERTEX: Int = 0

    fun new(): VisualShader = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShader".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualShader" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShader(
        fn()
      )
    }}
}
