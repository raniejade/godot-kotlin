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

open class SpatialMaterial internal constructor(
  _handle: COpaquePointer
) : Material(_handle) {
  enum class EmissionOperator(
    val value: Int
  ) {
    EMISSION_OP_ADD(0),

    EMISSION_OP_MULTIPLY(1);
  }

  enum class DiffuseMode(
    val value: Int
  ) {
    DIFFUSE_BURLEY(0),

    DIFFUSE_LAMBERT(1),

    DIFFUSE_LAMBERT_WRAP(2),

    DIFFUSE_OREN_NAYAR(3),

    DIFFUSE_TOON(4);
  }

  enum class SpecularMode(
    val value: Int
  ) {
    SPECULAR_SCHLICK_GGX(0),

    SPECULAR_BLINN(1),

    SPECULAR_PHONG(2),

    SPECULAR_TOON(3),

    SPECULAR_DISABLED(4);
  }

  enum class Feature(
    val value: Int
  ) {
    FEATURE_TRANSPARENT(0),

    FEATURE_EMISSION(1),

    FEATURE_NORMAL_MAPPING(2),

    FEATURE_RIM(3),

    FEATURE_CLEARCOAT(4),

    FEATURE_ANISOTROPY(5),

    FEATURE_AMBIENT_OCCLUSION(6),

    FEATURE_DEPTH_MAPPING(7),

    FEATURE_SUBSURACE_SCATTERING(8),

    FEATURE_TRANSMISSION(9),

    FEATURE_REFRACTION(10),

    FEATURE_DETAIL(11),

    FEATURE_MAX(12);
  }

  enum class Flags(
    val value: Int
  ) {
    FLAG_UNSHADED(0),

    FLAG_USE_VERTEX_LIGHTING(1),

    FLAG_DISABLE_DEPTH_TEST(2),

    FLAG_ALBEDO_FROM_VERTEX_COLOR(3),

    FLAG_SRGB_VERTEX_COLOR(4),

    FLAG_USE_POINT_SIZE(5),

    FLAG_FIXED_SIZE(6),

    FLAG_BILLBOARD_KEEP_SCALE(7),

    FLAG_UV1_USE_TRIPLANAR(8),

    FLAG_UV2_USE_TRIPLANAR(9),

    FLAG_TRIPLANAR_USE_WORLD(10),

    FLAG_AO_ON_UV2(11),

    FLAG_EMISSION_ON_UV2(12),

    FLAG_USE_ALPHA_SCISSOR(13),

    FLAG_ALBEDO_TEXTURE_FORCE_SRGB(14),

    FLAG_DONT_RECEIVE_SHADOWS(15),

    FLAG_ENSURE_CORRECT_NORMALS(16),

    FLAG_DISABLE_AMBIENT_LIGHT(17),

    FLAG_USE_SHADOW_TO_OPACITY(18),

    FLAG_MAX(19);
  }

  enum class CullMode(
    val value: Int
  ) {
    CULL_BACK(0),

    CULL_FRONT(1),

    CULL_DISABLED(2);
  }

  enum class DetailUV(
    val value: Int
  ) {
    DETAIL_UV_1(0),

    DETAIL_UV_2(1);
  }

  enum class DistanceFadeMode(
    val value: Int
  ) {
    DISTANCE_FADE_DISABLED(0),

    DISTANCE_FADE_PIXEL_ALPHA(1),

    DISTANCE_FADE_PIXEL_DITHER(2),

    DISTANCE_FADE_OBJECT_DITHER(3);
  }

  enum class BillboardMode(
    val value: Int
  ) {
    BILLBOARD_DISABLED(0),

    BILLBOARD_ENABLED(1),

    BILLBOARD_FIXED_Y(2),

    BILLBOARD_PARTICLES(3);
  }

  enum class DepthDrawMode(
    val value: Int
  ) {
    DEPTH_DRAW_OPAQUE_ONLY(0),

    DEPTH_DRAW_ALWAYS(1),

    DEPTH_DRAW_DISABLED(2),

    DEPTH_DRAW_ALPHA_OPAQUE_PREPASS(3);
  }

  enum class TextureChannel(
    val value: Int
  ) {
    TEXTURE_CHANNEL_RED(0),

    TEXTURE_CHANNEL_GREEN(1),

    TEXTURE_CHANNEL_BLUE(2),

    TEXTURE_CHANNEL_ALPHA(3),

    TEXTURE_CHANNEL_GRAYSCALE(4);
  }

  enum class BlendMode(
    val value: Int
  ) {
    BLEND_MODE_MIX(0),

    BLEND_MODE_ADD(1),

    BLEND_MODE_SUB(2),

    BLEND_MODE_MUL(3);
  }

  enum class TextureParam(
    val value: Int
  ) {
    TEXTURE_ALBEDO(0),

    TEXTURE_METALLIC(1),

    TEXTURE_ROUGHNESS(2),

    TEXTURE_EMISSION(3),

    TEXTURE_NORMAL(4),

    TEXTURE_RIM(5),

    TEXTURE_CLEARCOAT(6),

    TEXTURE_FLOWMAP(7),

    TEXTURE_AMBIENT_OCCLUSION(8),

    TEXTURE_DEPTH(9),

    TEXTURE_SUBSURFACE_SCATTERING(10),

    TEXTURE_TRANSMISSION(11),

    TEXTURE_REFRACTION(12),

    TEXTURE_DETAIL_MASK(13),

    TEXTURE_DETAIL_ALBEDO(14),

    TEXTURE_DETAIL_NORMAL(15),

    TEXTURE_MAX(16);
  }

  companion object {
    val BILLBOARD_DISABLED: Int = 0

    val BILLBOARD_ENABLED: Int = 1

    val BILLBOARD_FIXED_Y: Int = 2

    val BILLBOARD_PARTICLES: Int = 3

    val BLEND_MODE_ADD: Int = 1

    val BLEND_MODE_MIX: Int = 0

    val BLEND_MODE_MUL: Int = 3

    val BLEND_MODE_SUB: Int = 2

    val CULL_BACK: Int = 0

    val CULL_DISABLED: Int = 2

    val CULL_FRONT: Int = 1

    val DEPTH_DRAW_ALPHA_OPAQUE_PREPASS: Int = 3

    val DEPTH_DRAW_ALWAYS: Int = 1

    val DEPTH_DRAW_DISABLED: Int = 2

    val DEPTH_DRAW_OPAQUE_ONLY: Int = 0

    val DETAIL_UV_1: Int = 0

    val DETAIL_UV_2: Int = 1

    val DIFFUSE_BURLEY: Int = 0

    val DIFFUSE_LAMBERT: Int = 1

    val DIFFUSE_LAMBERT_WRAP: Int = 2

    val DIFFUSE_OREN_NAYAR: Int = 3

    val DIFFUSE_TOON: Int = 4

    val DISTANCE_FADE_DISABLED: Int = 0

    val DISTANCE_FADE_OBJECT_DITHER: Int = 3

    val DISTANCE_FADE_PIXEL_ALPHA: Int = 1

    val DISTANCE_FADE_PIXEL_DITHER: Int = 2

    val EMISSION_OP_ADD: Int = 0

    val EMISSION_OP_MULTIPLY: Int = 1

    val FEATURE_AMBIENT_OCCLUSION: Int = 6

    val FEATURE_ANISOTROPY: Int = 5

    val FEATURE_CLEARCOAT: Int = 4

    val FEATURE_DEPTH_MAPPING: Int = 7

    val FEATURE_DETAIL: Int = 11

    val FEATURE_EMISSION: Int = 1

    val FEATURE_MAX: Int = 12

    val FEATURE_NORMAL_MAPPING: Int = 2

    val FEATURE_REFRACTION: Int = 10

    val FEATURE_RIM: Int = 3

    val FEATURE_SUBSURACE_SCATTERING: Int = 8

    val FEATURE_TRANSMISSION: Int = 9

    val FEATURE_TRANSPARENT: Int = 0

    val FLAG_ALBEDO_FROM_VERTEX_COLOR: Int = 3

    val FLAG_ALBEDO_TEXTURE_FORCE_SRGB: Int = 14

    val FLAG_AO_ON_UV2: Int = 11

    val FLAG_BILLBOARD_KEEP_SCALE: Int = 7

    val FLAG_DISABLE_AMBIENT_LIGHT: Int = 17

    val FLAG_DISABLE_DEPTH_TEST: Int = 2

    val FLAG_DONT_RECEIVE_SHADOWS: Int = 15

    val FLAG_EMISSION_ON_UV2: Int = 12

    val FLAG_ENSURE_CORRECT_NORMALS: Int = 16

    val FLAG_FIXED_SIZE: Int = 6

    val FLAG_MAX: Int = 19

    val FLAG_SRGB_VERTEX_COLOR: Int = 4

    val FLAG_TRIPLANAR_USE_WORLD: Int = 10

    val FLAG_UNSHADED: Int = 0

    val FLAG_USE_ALPHA_SCISSOR: Int = 13

    val FLAG_USE_POINT_SIZE: Int = 5

    val FLAG_USE_SHADOW_TO_OPACITY: Int = 18

    val FLAG_USE_VERTEX_LIGHTING: Int = 1

    val FLAG_UV1_USE_TRIPLANAR: Int = 8

    val FLAG_UV2_USE_TRIPLANAR: Int = 9

    val SPECULAR_BLINN: Int = 1

    val SPECULAR_DISABLED: Int = 4

    val SPECULAR_PHONG: Int = 2

    val SPECULAR_SCHLICK_GGX: Int = 0

    val SPECULAR_TOON: Int = 3

    val TEXTURE_ALBEDO: Int = 0

    val TEXTURE_AMBIENT_OCCLUSION: Int = 8

    val TEXTURE_CHANNEL_ALPHA: Int = 3

    val TEXTURE_CHANNEL_BLUE: Int = 2

    val TEXTURE_CHANNEL_GRAYSCALE: Int = 4

    val TEXTURE_CHANNEL_GREEN: Int = 1

    val TEXTURE_CHANNEL_RED: Int = 0

    val TEXTURE_CLEARCOAT: Int = 6

    val TEXTURE_DEPTH: Int = 9

    val TEXTURE_DETAIL_ALBEDO: Int = 14

    val TEXTURE_DETAIL_MASK: Int = 13

    val TEXTURE_DETAIL_NORMAL: Int = 15

    val TEXTURE_EMISSION: Int = 3

    val TEXTURE_FLOWMAP: Int = 7

    val TEXTURE_MAX: Int = 16

    val TEXTURE_METALLIC: Int = 1

    val TEXTURE_NORMAL: Int = 4

    val TEXTURE_REFRACTION: Int = 12

    val TEXTURE_RIM: Int = 5

    val TEXTURE_ROUGHNESS: Int = 2

    val TEXTURE_SUBSURFACE_SCATTERING: Int = 10

    val TEXTURE_TRANSMISSION: Int = 11

    fun new(): SpatialMaterial = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpatialMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for SpatialMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SpatialMaterial(
        fn()
      )
    }}
}
