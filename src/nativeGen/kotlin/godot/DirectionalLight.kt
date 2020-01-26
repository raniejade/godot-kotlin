// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class DirectionalLight internal constructor(
  _handle: COpaquePointer
) : Light(_handle) {
  companion object {
    val ShadowDepthRangeOptimized: Int = 1

    val ShadowDepthRangeStable: Int = 0

    val ShadowOrthogonal: Int = 0

    val ShadowParallel2Splits: Int = 1

    val ShadowParallel4Splits: Int = 2

    fun new(): DirectionalLight {
      TODO()
    }
  }
}
