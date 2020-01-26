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

open class GeometryInstance internal constructor(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  enum class Flags(
    val value: Int
  ) {
    FLAG_USE_BAKED_LIGHT(0),

    FLAG_MAX(2);
  }

  enum class ShadowCastingSetting(
    val value: Int
  ) {
    SHADOW_CASTING_SETTING_OFF(0),

    SHADOW_CASTING_SETTING_ON(1),

    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),

    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3);
  }

  companion object {
    val FLAG_MAX: Int = 2

    val FLAG_USE_BAKED_LIGHT: Int = 0

    val SHADOW_CASTING_SETTING_DOUBLE_SIDED: Int = 2

    val SHADOW_CASTING_SETTING_OFF: Int = 0

    val SHADOW_CASTING_SETTING_ON: Int = 1

    val SHADOW_CASTING_SETTING_SHADOWS_ONLY: Int = 3
  }
}
