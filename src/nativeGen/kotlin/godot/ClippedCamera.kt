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

open class ClippedCamera internal constructor(
  _handle: COpaquePointer
) : Camera(_handle) {
  enum class ProcessMode(
    val value: Int
  ) {
    CLIP_PROCESS_PHYSICS(0),

    CLIP_PROCESS_IDLE(1);
  }

  companion object {
    val CLIP_PROCESS_IDLE: Int = 1

    val CLIP_PROCESS_PHYSICS: Int = 0

    fun new(): ClippedCamera = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ClippedCamera".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ClippedCamera" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ClippedCamera(
        fn()
      )
    }}
}
