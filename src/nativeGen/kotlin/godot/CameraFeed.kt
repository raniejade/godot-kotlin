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

open class CameraFeed internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    val FeedBack: Int = 2

    val FeedFront: Int = 1

    val FeedNoimage: Int = 0

    val FeedRgb: Int = 1

    val FeedUnspecified: Int = 0

    val FeedYcbcr: Int = 2

    val FeedYcbcrSep: Int = 3

    fun new(): CameraFeed = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CameraFeed".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for CameraFeed" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      CameraFeed(
        fn()
      )
    }}
}
