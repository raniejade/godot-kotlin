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

open class XMLParser internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  enum class NodeType(
    val value: Int
  ) {
    NODE_NONE(0),

    NODE_ELEMENT(1),

    NODE_ELEMENT_END(2),

    NODE_TEXT(3),

    NODE_COMMENT(4),

    NODE_CDATA(5),

    NODE_UNKNOWN(6);
  }

  companion object {
    val NODE_CDATA: Int = 5

    val NODE_COMMENT: Int = 4

    val NODE_ELEMENT: Int = 1

    val NODE_ELEMENT_END: Int = 2

    val NODE_NONE: Int = 0

    val NODE_TEXT: Int = 3

    val NODE_UNKNOWN: Int = 6

    fun new(): XMLParser = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("XMLParser".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for XMLParser" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      XMLParser(
        fn()
      )
    }}
}
