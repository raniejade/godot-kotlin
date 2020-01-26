// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

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

    fun new(): BakedLightmap {
      TODO()
    }
  }
}
