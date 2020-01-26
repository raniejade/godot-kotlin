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

open class Environment internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  enum class SSAOBlur(
    val value: Int
  ) {
    SSAO_BLUR_DISABLED(0),

    SSAO_BLUR_1x1(1),

    SSAO_BLUR_2x2(2),

    SSAO_BLUR_3x3(3);
  }

  enum class ToneMapper(
    val value: Int
  ) {
    TONE_MAPPER_LINEAR(0),

    TONE_MAPPER_REINHARDT(1),

    TONE_MAPPER_FILMIC(2),

    TONE_MAPPER_ACES(3);
  }

  enum class GlowBlendMode(
    val value: Int
  ) {
    GLOW_BLEND_MODE_ADDITIVE(0),

    GLOW_BLEND_MODE_SCREEN(1),

    GLOW_BLEND_MODE_SOFTLIGHT(2),

    GLOW_BLEND_MODE_REPLACE(3);
  }

  enum class BGMode(
    val value: Int
  ) {
    BG_CLEAR_COLOR(0),

    BG_COLOR(1),

    BG_SKY(2),

    BG_COLOR_SKY(3),

    BG_CANVAS(4),

    BG_KEEP(5),

    BG_CAMERA_FEED(6),

    BG_MAX(7);
  }

  enum class SSAOQuality(
    val value: Int
  ) {
    SSAO_QUALITY_LOW(0),

    SSAO_QUALITY_MEDIUM(1),

    SSAO_QUALITY_HIGH(2);
  }

  enum class DOFBlurQuality(
    val value: Int
  ) {
    DOF_BLUR_QUALITY_LOW(0),

    DOF_BLUR_QUALITY_MEDIUM(1),

    DOF_BLUR_QUALITY_HIGH(2);
  }

  companion object {
    val BG_CAMERA_FEED: Int = 6

    val BG_CANVAS: Int = 4

    val BG_CLEAR_COLOR: Int = 0

    val BG_COLOR: Int = 1

    val BG_COLOR_SKY: Int = 3

    val BG_KEEP: Int = 5

    val BG_MAX: Int = 7

    val BG_SKY: Int = 2

    val DOF_BLUR_QUALITY_HIGH: Int = 2

    val DOF_BLUR_QUALITY_LOW: Int = 0

    val DOF_BLUR_QUALITY_MEDIUM: Int = 1

    val GLOW_BLEND_MODE_ADDITIVE: Int = 0

    val GLOW_BLEND_MODE_REPLACE: Int = 3

    val GLOW_BLEND_MODE_SCREEN: Int = 1

    val GLOW_BLEND_MODE_SOFTLIGHT: Int = 2

    val SSAO_BLUR_1x1: Int = 1

    val SSAO_BLUR_2x2: Int = 2

    val SSAO_BLUR_3x3: Int = 3

    val SSAO_BLUR_DISABLED: Int = 0

    val SSAO_QUALITY_HIGH: Int = 2

    val SSAO_QUALITY_LOW: Int = 0

    val SSAO_QUALITY_MEDIUM: Int = 1

    val TONE_MAPPER_ACES: Int = 3

    val TONE_MAPPER_FILMIC: Int = 2

    val TONE_MAPPER_LINEAR: Int = 0

    val TONE_MAPPER_REINHARDT: Int = 1

    fun new(): Environment = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Environment".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Environment" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Environment(
        fn()
      )
    }}
}
