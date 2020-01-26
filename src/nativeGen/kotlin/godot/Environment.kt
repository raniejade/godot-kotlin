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
  companion object {
    val BgCameraFeed: Int = 6

    val BgCanvas: Int = 4

    val BgClearColor: Int = 0

    val BgColor: Int = 1

    val BgColorSky: Int = 3

    val BgKeep: Int = 5

    val BgMax: Int = 7

    val BgSky: Int = 2

    val DofBlurQualityHigh: Int = 2

    val DofBlurQualityLow: Int = 0

    val DofBlurQualityMedium: Int = 1

    val GlowBlendModeAdditive: Int = 0

    val GlowBlendModeReplace: Int = 3

    val GlowBlendModeScreen: Int = 1

    val GlowBlendModeSoftlight: Int = 2

    val SsaoBlur1x1: Int = 1

    val SsaoBlur2x2: Int = 2

    val SsaoBlur3x3: Int = 3

    val SsaoBlurDisabled: Int = 0

    val SsaoQualityHigh: Int = 2

    val SsaoQualityLow: Int = 0

    val SsaoQualityMedium: Int = 1

    val ToneMapperAces: Int = 3

    val ToneMapperFilmic: Int = 2

    val ToneMapperLinear: Int = 0

    val ToneMapperReinhardt: Int = 1

    fun new(): Environment = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Environment".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Environment" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Environment(
        fn()
      )
    }}
}
