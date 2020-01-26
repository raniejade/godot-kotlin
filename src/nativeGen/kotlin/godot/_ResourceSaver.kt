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

open class _ResourceSaver internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    val FlagBundleResources: Int = 2

    val FlagChangePath: Int = 4

    val FlagCompress: Int = 32

    val FlagOmitEditorProperties: Int = 8

    val FlagRelativePaths: Int = 1

    val FlagReplaceSubresourcePaths: Int = 64

    val FlagSaveBigEndian: Int = 16
  }
}
