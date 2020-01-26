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

open class Light internal constructor(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  enum class BakeMode(
    val value: Int
  ) {
    BAKE_DISABLED(0),

    BAKE_INDIRECT(1),

    BAKE_ALL(2);
  }

  enum class Param(
    val value: Int
  ) {
    PARAM_ENERGY(0),

    PARAM_INDIRECT_ENERGY(1),

    PARAM_SPECULAR(2),

    PARAM_RANGE(3),

    PARAM_ATTENUATION(4),

    PARAM_SPOT_ANGLE(5),

    PARAM_SPOT_ATTENUATION(6),

    PARAM_CONTACT_SHADOW_SIZE(7),

    PARAM_SHADOW_MAX_DISTANCE(8),

    PARAM_SHADOW_SPLIT_1_OFFSET(9),

    PARAM_SHADOW_SPLIT_2_OFFSET(10),

    PARAM_SHADOW_SPLIT_3_OFFSET(11),

    PARAM_SHADOW_NORMAL_BIAS(12),

    PARAM_SHADOW_BIAS(13),

    PARAM_SHADOW_BIAS_SPLIT_SCALE(14),

    PARAM_MAX(15);
  }

  companion object {
    val BAKE_ALL: Int = 2

    val BAKE_DISABLED: Int = 0

    val BAKE_INDIRECT: Int = 1

    val PARAM_ATTENUATION: Int = 4

    val PARAM_CONTACT_SHADOW_SIZE: Int = 7

    val PARAM_ENERGY: Int = 0

    val PARAM_INDIRECT_ENERGY: Int = 1

    val PARAM_MAX: Int = 15

    val PARAM_RANGE: Int = 3

    val PARAM_SHADOW_BIAS: Int = 13

    val PARAM_SHADOW_BIAS_SPLIT_SCALE: Int = 14

    val PARAM_SHADOW_MAX_DISTANCE: Int = 8

    val PARAM_SHADOW_NORMAL_BIAS: Int = 12

    val PARAM_SHADOW_SPLIT_1_OFFSET: Int = 9

    val PARAM_SHADOW_SPLIT_2_OFFSET: Int = 10

    val PARAM_SHADOW_SPLIT_3_OFFSET: Int = 11

    val PARAM_SPECULAR: Int = 2

    val PARAM_SPOT_ANGLE: Int = 5

    val PARAM_SPOT_ATTENUATION: Int = 6
  }
}
