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
  companion object {
    val TextureSize1024: Int = 2

    val TextureSize2048: Int = 3

    val TextureSize256: Int = 0

    val TextureSize4096: Int = 4

    val TextureSize512: Int = 1

    val TextureSizeMax: Int = 5

    fun new(): ProceduralSky = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ProceduralSky".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ProceduralSky" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      ProceduralSky(
        fn()
      )
    }}
}
