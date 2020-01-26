// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TranslationServer internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    val Instance: TranslationServer = memScoped {
          val handle =
            checkNotNull(Godot.gdnative.godot_global_get_singleton)("TranslationServer".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton TranslationServer" }
          TranslationServer(
            handle
          )
        }
  }
}
