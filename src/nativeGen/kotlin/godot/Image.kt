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

open class Image internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  enum class AlphaMode(
    val value: Int
  ) {
    ALPHA_NONE(0),

    ALPHA_BIT(1),

    ALPHA_BLEND(2);
  }

  enum class CompressSource(
    val value: Int
  ) {
    COMPRESS_SOURCE_GENERIC(0),

    COMPRESS_SOURCE_SRGB(1),

    COMPRESS_SOURCE_NORMAL(2);
  }

  enum class Interpolation(
    val value: Int
  ) {
    INTERPOLATE_NEAREST(0),

    INTERPOLATE_BILINEAR(1),

    INTERPOLATE_CUBIC(2),

    INTERPOLATE_TRILINEAR(3),

    INTERPOLATE_LANCZOS(4);
  }

  enum class CompressMode(
    val value: Int
  ) {
    COMPRESS_S3TC(0),

    COMPRESS_PVRTC2(1),

    COMPRESS_PVRTC4(2),

    COMPRESS_ETC(3),

    COMPRESS_ETC2(4);
  }

  enum class Format(
    val value: Int
  ) {
    FORMAT_L8(0),

    FORMAT_LA8(1),

    FORMAT_R8(2),

    FORMAT_RG8(3),

    FORMAT_RGB8(4),

    FORMAT_RGBA8(5),

    FORMAT_RGBA4444(6),

    FORMAT_RGBA5551(7),

    FORMAT_RF(8),

    FORMAT_RGF(9),

    FORMAT_RGBF(10),

    FORMAT_RGBAF(11),

    FORMAT_RH(12),

    FORMAT_RGH(13),

    FORMAT_RGBH(14),

    FORMAT_RGBAH(15),

    FORMAT_RGBE9995(16),

    FORMAT_DXT1(17),

    FORMAT_DXT3(18),

    FORMAT_DXT5(19),

    FORMAT_RGTC_R(20),

    FORMAT_RGTC_RG(21),

    FORMAT_BPTC_RGBA(22),

    FORMAT_BPTC_RGBF(23),

    FORMAT_BPTC_RGBFU(24),

    FORMAT_PVRTC2(25),

    FORMAT_PVRTC2A(26),

    FORMAT_PVRTC4(27),

    FORMAT_PVRTC4A(28),

    FORMAT_ETC(29),

    FORMAT_ETC2_R11(30),

    FORMAT_ETC2_R11S(31),

    FORMAT_ETC2_RG11(32),

    FORMAT_ETC2_RG11S(33),

    FORMAT_ETC2_RGB8(34),

    FORMAT_ETC2_RGBA8(35),

    FORMAT_ETC2_RGB8A1(36),

    FORMAT_MAX(37);
  }

  companion object {
    val ALPHA_BIT: Int = 1

    val ALPHA_BLEND: Int = 2

    val ALPHA_NONE: Int = 0

    val COMPRESS_ETC: Int = 3

    val COMPRESS_ETC2: Int = 4

    val COMPRESS_PVRTC2: Int = 1

    val COMPRESS_PVRTC4: Int = 2

    val COMPRESS_S3TC: Int = 0

    val COMPRESS_SOURCE_GENERIC: Int = 0

    val COMPRESS_SOURCE_NORMAL: Int = 2

    val COMPRESS_SOURCE_SRGB: Int = 1

    val FORMAT_BPTC_RGBA: Int = 22

    val FORMAT_BPTC_RGBF: Int = 23

    val FORMAT_BPTC_RGBFU: Int = 24

    val FORMAT_DXT1: Int = 17

    val FORMAT_DXT3: Int = 18

    val FORMAT_DXT5: Int = 19

    val FORMAT_ETC: Int = 29

    val FORMAT_ETC2_R11: Int = 30

    val FORMAT_ETC2_R11S: Int = 31

    val FORMAT_ETC2_RG11: Int = 32

    val FORMAT_ETC2_RG11S: Int = 33

    val FORMAT_ETC2_RGB8: Int = 34

    val FORMAT_ETC2_RGB8A1: Int = 36

    val FORMAT_ETC2_RGBA8: Int = 35

    val FORMAT_L8: Int = 0

    val FORMAT_LA8: Int = 1

    val FORMAT_MAX: Int = 37

    val FORMAT_PVRTC2: Int = 25

    val FORMAT_PVRTC2A: Int = 26

    val FORMAT_PVRTC4: Int = 27

    val FORMAT_PVRTC4A: Int = 28

    val FORMAT_R8: Int = 2

    val FORMAT_RF: Int = 8

    val FORMAT_RG8: Int = 3

    val FORMAT_RGB8: Int = 4

    val FORMAT_RGBA4444: Int = 6

    val FORMAT_RGBA5551: Int = 7

    val FORMAT_RGBA8: Int = 5

    val FORMAT_RGBAF: Int = 11

    val FORMAT_RGBAH: Int = 15

    val FORMAT_RGBE9995: Int = 16

    val FORMAT_RGBF: Int = 10

    val FORMAT_RGBH: Int = 14

    val FORMAT_RGF: Int = 9

    val FORMAT_RGH: Int = 13

    val FORMAT_RGTC_R: Int = 20

    val FORMAT_RGTC_RG: Int = 21

    val FORMAT_RH: Int = 12

    val INTERPOLATE_BILINEAR: Int = 1

    val INTERPOLATE_CUBIC: Int = 2

    val INTERPOLATE_LANCZOS: Int = 4

    val INTERPOLATE_NEAREST: Int = 0

    val INTERPOLATE_TRILINEAR: Int = 3

    val MAX_HEIGHT: Int = 16384

    val MAX_WIDTH: Int = 16384

    fun new(): Image = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Image".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Image" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Image(
        fn()
      )
    }}
}
