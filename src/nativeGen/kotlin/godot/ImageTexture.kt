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

open class ImageTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  companion object {
    val StorageCompressLossless: Int = 2

    val StorageCompressLossy: Int = 1

    val StorageRaw: Int = 0

    fun new(): ImageTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ImageTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ImageTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      ImageTexture(
        fn()
      )
    }}
}
