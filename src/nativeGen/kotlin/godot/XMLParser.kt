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
  companion object {
    val NodeCdata: Int = 5

    val NodeComment: Int = 4

    val NodeElement: Int = 1

    val NodeElementEnd: Int = 2

    val NodeNone: Int = 0

    val NodeText: Int = 3

    val NodeUnknown: Int = 6

    fun new(): XMLParser = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("XMLParser".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for XMLParser" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      XMLParser(
        fn()
      )
    }}
}
