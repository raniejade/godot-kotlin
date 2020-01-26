// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class Texture internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    val FlagsDefault: Int = 7

    val FlagAnisotropicFilter: Int = 8

    val FlagConvertToLinear: Int = 16

    val FlagFilter: Int = 4

    val FlagMipmaps: Int = 1

    val FlagMirroredRepeat: Int = 32

    val FlagRepeat: Int = 2

    val FlagVideoSurface: Int = 2048
  }
}
