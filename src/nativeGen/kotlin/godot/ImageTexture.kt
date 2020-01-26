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
  enum class Storage(
    val value: Int
  ) {
    STORAGE_RAW(0),

    STORAGE_COMPRESS_LOSSY(1),

    STORAGE_COMPRESS_LOSSLESS(2);
  }

  companion object {
    val STORAGE_COMPRESS_LOSSLESS: Int = 2

    val STORAGE_COMPRESS_LOSSY: Int = 1

    val STORAGE_RAW: Int = 0

    fun new(): ImageTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ImageTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ImageTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ImageTexture(
        fn()
      )
    }}
}
