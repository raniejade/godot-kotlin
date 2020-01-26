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

open class ARVRServer internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    val DontResetRotation: Int = 2

    val ResetButKeepTilt: Int = 1

    val ResetFullRotation: Int = 0

    val TrackerAnchor: Int = 4

    val TrackerAny: Int = 255

    val TrackerAnyKnown: Int = 127

    val TrackerBasestation: Int = 2

    val TrackerController: Int = 1

    val TrackerUnknown: Int = 128
  }
}
