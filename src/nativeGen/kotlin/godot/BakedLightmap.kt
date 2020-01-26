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
  enum class BakeQuality(
    val value: Int
  ) {
    BAKE_QUALITY_LOW(0),

    BAKE_QUALITY_MEDIUM(1),

    BAKE_QUALITY_HIGH(2);
  }

  enum class BakeError(
    val value: Int
  ) {
    BAKE_ERROR_OK(0),

    BAKE_ERROR_NO_SAVE_PATH(1),

    BAKE_ERROR_NO_MESHES(2),

    BAKE_ERROR_CANT_CREATE_IMAGE(3),

    BAKE_ERROR_USER_ABORTED(4);
  }

  enum class BakeMode(
    val value: Int
  ) {
    BAKE_MODE_CONE_TRACE(0),

    BAKE_MODE_RAY_TRACE(1);
  }

  companion object {
    val BAKE_ERROR_CANT_CREATE_IMAGE: Int = 3

    val BAKE_ERROR_NO_MESHES: Int = 2

    val BAKE_ERROR_NO_SAVE_PATH: Int = 1

    val BAKE_ERROR_OK: Int = 0

    val BAKE_ERROR_USER_ABORTED: Int = 4

    val BAKE_MODE_CONE_TRACE: Int = 0

    val BAKE_MODE_RAY_TRACE: Int = 1

    val BAKE_QUALITY_HIGH: Int = 2

    val BAKE_QUALITY_LOW: Int = 0

    val BAKE_QUALITY_MEDIUM: Int = 1

    fun new(): BakedLightmap = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("BakedLightmap".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for BakedLightmap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      BakedLightmap(
        fn()
      )
    }}
}
