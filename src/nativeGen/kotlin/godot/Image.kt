// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
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
      requireNotNull(fnPtr) { "No instance found for singleton Image" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Image(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Image
     */
    private object __method_bind {
      val _get_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "_get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_data" }
            }
          }

      val _set_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "_set_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_data" }
            }
          }

      val blend_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "blend_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend_rect" }
            }
          }

      val blend_rect_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "blend_rect_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend_rect_mask" }
            }
          }

      val blit_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "blit_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blit_rect" }
            }
          }

      val blit_rect_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "blit_rect_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blit_rect_mask" }
            }
          }

      val bumpmap_to_normalmap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "bumpmap_to_normalmap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method bumpmap_to_normalmap" }
            }
          }

      val clear_mipmaps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "clear_mipmaps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_mipmaps" }
            }
          }

      val compress: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "compress".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method compress" }
            }
          }

      val convert: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "convert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method convert" }
            }
          }

      val copy_from: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "copy_from".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method copy_from" }
            }
          }

      val create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create" }
            }
          }

      val create_from_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "create_from_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_from_data" }
            }
          }

      val crop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "crop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method crop" }
            }
          }

      val decompress: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "decompress".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method decompress" }
            }
          }

      val detect_alpha: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "detect_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method detect_alpha" }
            }
          }

      val expand_x2_hq2x: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "expand_x2_hq2x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method expand_x2_hq2x" }
            }
          }

      val fill: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "fill".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method fill" }
            }
          }

      val fix_alpha_edges: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "fix_alpha_edges".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method fix_alpha_edges" }
            }
          }

      val flip_x: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "flip_x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method flip_x" }
            }
          }

      val flip_y: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "flip_y".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method flip_y" }
            }
          }

      val generate_mipmaps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "generate_mipmaps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method generate_mipmaps" }
            }
          }

      val get_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_data" }
            }
          }

      val get_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_format" }
            }
          }

      val get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val get_mipmap_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_mipmap_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mipmap_offset" }
            }
          }

      val get_pixel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_pixel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pixel" }
            }
          }

      val get_pixelv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_pixelv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pixelv" }
            }
          }

      val get_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rect" }
            }
          }

      val get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val get_used_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_used_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_used_rect" }
            }
          }

      val get_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_width" }
            }
          }

      val has_mipmaps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "has_mipmaps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_mipmaps" }
            }
          }

      val is_compressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "is_compressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_compressed" }
            }
          }

      val is_empty: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "is_empty".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_empty" }
            }
          }

      val is_invisible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "is_invisible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_invisible" }
            }
          }

      val load: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "load".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load" }
            }
          }

      val load_jpg_from_buffer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "load_jpg_from_buffer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load_jpg_from_buffer" }
            }
          }

      val load_png_from_buffer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "load_png_from_buffer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load_png_from_buffer" }
            }
          }

      val load_webp_from_buffer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "load_webp_from_buffer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load_webp_from_buffer" }
            }
          }

      val lock: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "lock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method lock" }
            }
          }

      val normalmap_to_xy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "normalmap_to_xy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method normalmap_to_xy" }
            }
          }

      val premultiply_alpha: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "premultiply_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method premultiply_alpha" }
            }
          }

      val resize: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "resize".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resize" }
            }
          }

      val resize_to_po2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "resize_to_po2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resize_to_po2" }
            }
          }

      val rgbe_to_srgb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "rgbe_to_srgb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rgbe_to_srgb" }
            }
          }

      val save_png: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "save_png".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save_png" }
            }
          }

      val set_pixel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "set_pixel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pixel" }
            }
          }

      val set_pixelv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "set_pixelv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pixelv" }
            }
          }

      val shrink_x2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "shrink_x2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shrink_x2" }
            }
          }

      val srgb_to_linear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "srgb_to_linear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method srgb_to_linear" }
            }
          }

      val unlock: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "unlock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unlock" }
            }
          }
    }
  }
}
