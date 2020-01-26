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

open class TextureLayered internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    val FlagsDefault: Int = 4

    val FlagFilter: Int = 4

    val FlagMipmaps: Int = 1

    val FlagRepeat: Int = 2
  }
}
