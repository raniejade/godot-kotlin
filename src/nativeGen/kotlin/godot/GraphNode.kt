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

open class GraphNode internal constructor(
  _handle: COpaquePointer
) : Container(_handle) {
  enum class Overlay(
    val value: Int
  ) {
    OVERLAY_DISABLED(0),

    OVERLAY_BREAKPOINT(1),

    OVERLAY_POSITION(2);
  }

  companion object {
    val OVERLAY_BREAKPOINT: Int = 1

    val OVERLAY_DISABLED: Int = 0

    val OVERLAY_POSITION: Int = 2

    fun new(): GraphNode = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GraphNode".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for GraphNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GraphNode(
        fn()
      )
    }}
}
