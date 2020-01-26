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

open class ProceduralSky internal constructor(
  _handle: COpaquePointer
) : Sky(_handle) {
  enum class TextureSize(
    val value: Int
  ) {
    TEXTURE_SIZE_256(0),

    TEXTURE_SIZE_512(1),

    TEXTURE_SIZE_1024(2),

    TEXTURE_SIZE_2048(3),

    TEXTURE_SIZE_4096(4),

    TEXTURE_SIZE_MAX(5);
  }

  companion object {
    val TEXTURE_SIZE_1024: Int = 2

    val TEXTURE_SIZE_2048: Int = 3

    val TEXTURE_SIZE_256: Int = 0

    val TEXTURE_SIZE_4096: Int = 4

    val TEXTURE_SIZE_512: Int = 1

    val TEXTURE_SIZE_MAX: Int = 5

    fun new(): ProceduralSky = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ProceduralSky".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ProceduralSky" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ProceduralSky(
        fn()
      )
    }}
}
