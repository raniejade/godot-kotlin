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

open class DirectionalLight internal constructor(
  _handle: COpaquePointer
) : Light(_handle) {
  enum class ShadowMode(
    val value: Int
  ) {
    SHADOW_ORTHOGONAL(0),

    SHADOW_PARALLEL_2_SPLITS(1),

    SHADOW_PARALLEL_4_SPLITS(2);
  }

  enum class ShadowDepthRange(
    val value: Int
  ) {
    SHADOW_DEPTH_RANGE_STABLE(0),

    SHADOW_DEPTH_RANGE_OPTIMIZED(1);
  }

  companion object {
    val SHADOW_DEPTH_RANGE_OPTIMIZED: Int = 1

    val SHADOW_DEPTH_RANGE_STABLE: Int = 0

    val SHADOW_ORTHOGONAL: Int = 0

    val SHADOW_PARALLEL_2_SPLITS: Int = 1

    val SHADOW_PARALLEL_4_SPLITS: Int = 2

    fun new(): DirectionalLight = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("DirectionalLight".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for DirectionalLight" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      DirectionalLight(
        fn()
      )
    }}
}
