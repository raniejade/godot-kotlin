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

open class CubeMap internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    val FlagsDefault: Int = 7

    val FlagFilter: Int = 4

    val FlagMipmaps: Int = 1

    val FlagRepeat: Int = 2

    val SideBack: Int = 5

    val SideBottom: Int = 2

    val SideFront: Int = 4

    val SideLeft: Int = 0

    val SideRight: Int = 1

    val SideTop: Int = 3

    val StorageCompressLossless: Int = 2

    val StorageCompressLossy: Int = 1

    val StorageRaw: Int = 0

    fun new(): CubeMap = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CubeMap".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for CubeMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      CubeMap(
        fn()
      )
    }}
}
