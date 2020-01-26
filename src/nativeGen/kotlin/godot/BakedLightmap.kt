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

open class BakedLightmap internal constructor(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  companion object {
    val BakeErrorCantCreateImage: Int = 3

    val BakeErrorNoMeshes: Int = 2

    val BakeErrorNoSavePath: Int = 1

    val BakeErrorOk: Int = 0

    val BakeErrorUserAborted: Int = 4

    val BakeModeConeTrace: Int = 0

    val BakeModeRayTrace: Int = 1

    val BakeQualityHigh: Int = 2

    val BakeQualityLow: Int = 0

    val BakeQualityMedium: Int = 1

    fun new(): BakedLightmap = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("BakedLightmap".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for BakedLightmap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      BakedLightmap(
        fn()
      )
    }}
}
