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

open class VisualServer internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  enum class ReflectionProbeUpdateMode(
    val value: Int
  ) {
    REFLECTION_PROBE_UPDATE_ONCE(0),

    REFLECTION_PROBE_UPDATE_ALWAYS(1);
  }

  enum class LightDirectionalShadowDepthRangeMode(
    val value: Int
  ) {
    LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_STABLE(0),

    LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_OPTIMIZED(1);
  }

  enum class BlendShapeMode(
    val value: Int
  ) {
    BLEND_SHAPE_MODE_NORMALIZED(0),

    BLEND_SHAPE_MODE_RELATIVE(1);
  }

  enum class PrimitiveType(
    val value: Int
  ) {
    PRIMITIVE_POINTS(0),

    PRIMITIVE_LINES(1),

    PRIMITIVE_LINE_STRIP(2),

    PRIMITIVE_LINE_LOOP(3),

    PRIMITIVE_TRIANGLES(4),

    PRIMITIVE_TRIANGLE_STRIP(5),

    PRIMITIVE_TRIANGLE_FAN(6),

    PRIMITIVE_MAX(7);
  }

  enum class TextureType(
    val value: Int
  ) {
    TEXTURE_TYPE_2D(0),

    TEXTURE_TYPE_CUBEMAP(1),

    TEXTURE_TYPE_2D_ARRAY(2),

    TEXTURE_TYPE_3D(3);
  }

  enum class EnvironmentSSAOQuality(
    val value: Int
  ) {
    ENV_SSAO_QUALITY_LOW(0),

    ENV_SSAO_QUALITY_MEDIUM(1),

    ENV_SSAO_QUALITY_HIGH(2);
  }

  enum class EnvironmentDOFBlurQuality(
    val value: Int
  ) {
    ENV_DOF_BLUR_QUALITY_LOW(0),

    ENV_DOF_BLUR_QUALITY_MEDIUM(1),

    ENV_DOF_BLUR_QUALITY_HIGH(2);
  }

  enum class RenderInfo(
    val value: Int
  ) {
    INFO_OBJECTS_IN_FRAME(0),

    INFO_VERTICES_IN_FRAME(1),

    INFO_MATERIAL_CHANGES_IN_FRAME(2),

    INFO_SHADER_CHANGES_IN_FRAME(3),

    INFO_SURFACE_CHANGES_IN_FRAME(4),

    INFO_DRAW_CALLS_IN_FRAME(5),

    INFO_USAGE_VIDEO_MEM_TOTAL(6),

    INFO_VIDEO_MEM_USED(7),

    INFO_TEXTURE_MEM_USED(8),

    INFO_VERTEX_MEM_USED(9);
  }

  enum class NinePatchAxisMode(
    val value: Int
  ) {
    NINE_PATCH_STRETCH(0),

    NINE_PATCH_TILE(1),

    NINE_PATCH_TILE_FIT(2);
  }

  enum class ViewportRenderInfo(
    val value: Int
  ) {
    VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME(0),

    VIEWPORT_RENDER_INFO_VERTICES_IN_FRAME(1),

    VIEWPORT_RENDER_INFO_MATERIAL_CHANGES_IN_FRAME(2),

    VIEWPORT_RENDER_INFO_SHADER_CHANGES_IN_FRAME(3),

    VIEWPORT_RENDER_INFO_SURFACE_CHANGES_IN_FRAME(4),

    VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME(5),

    VIEWPORT_RENDER_INFO_MAX(6);
  }

  enum class ViewportClearMode(
    val value: Int
  ) {
    VIEWPORT_CLEAR_ALWAYS(0),

    VIEWPORT_CLEAR_NEVER(1),

    VIEWPORT_CLEAR_ONLY_NEXT_FRAME(2);
  }

  enum class LightOmniShadowDetail(
    val value: Int
  ) {
    LIGHT_OMNI_SHADOW_DETAIL_VERTICAL(0),

    LIGHT_OMNI_SHADOW_DETAIL_HORIZONTAL(1);
  }

  enum class ShaderMode(
    val value: Int
  ) {
    SHADER_SPATIAL(0),

    SHADER_CANVAS_ITEM(1),

    SHADER_PARTICLES(2),

    SHADER_MAX(3);
  }

  enum class MultimeshTransformFormat(
    val value: Int
  ) {
    MULTIMESH_TRANSFORM_2D(0),

    MULTIMESH_TRANSFORM_3D(1);
  }

  enum class ShadowCastingSetting(
    val value: Int
  ) {
    SHADOW_CASTING_SETTING_OFF(0),

    SHADOW_CASTING_SETTING_ON(1),

    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),

    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3);
  }

  enum class ViewportDebugDraw(
    val value: Int
  ) {
    VIEWPORT_DEBUG_DRAW_DISABLED(0),

    VIEWPORT_DEBUG_DRAW_UNSHADED(1),

    VIEWPORT_DEBUG_DRAW_OVERDRAW(2),

    VIEWPORT_DEBUG_DRAW_WIREFRAME(3);
  }

  enum class ViewportUsage(
    val value: Int
  ) {
    VIEWPORT_USAGE_2D(0),

    VIEWPORT_USAGE_2D_NO_SAMPLING(1),

    VIEWPORT_USAGE_3D(2),

    VIEWPORT_USAGE_3D_NO_EFFECTS(3);
  }

  enum class EnvironmentBG(
    val value: Int
  ) {
    ENV_BG_CLEAR_COLOR(0),

    ENV_BG_COLOR(1),

    ENV_BG_SKY(2),

    ENV_BG_COLOR_SKY(3),

    ENV_BG_CANVAS(4),

    ENV_BG_KEEP(5),

    ENV_BG_MAX(7);
  }

  enum class MultimeshCustomDataFormat(
    val value: Int
  ) {
    MULTIMESH_CUSTOM_DATA_NONE(0),

    MULTIMESH_CUSTOM_DATA_8BIT(1),

    MULTIMESH_CUSTOM_DATA_FLOAT(2);
  }

  enum class LightOmniShadowMode(
    val value: Int
  ) {
    LIGHT_OMNI_SHADOW_DUAL_PARABOLOID(0),

    LIGHT_OMNI_SHADOW_CUBE(1);
  }

  enum class TextureFlags(
    val value: Int
  ) {
    TEXTURE_FLAG_MIPMAPS(1),

    TEXTURE_FLAG_REPEAT(2),

    TEXTURE_FLAG_FILTER(4),

    TEXTURE_FLAGS_DEFAULT(7),

    TEXTURE_FLAG_ANISOTROPIC_FILTER(8),

    TEXTURE_FLAG_CONVERT_TO_LINEAR(16),

    TEXTURE_FLAG_MIRRORED_REPEAT(32),

    TEXTURE_FLAG_USED_FOR_STREAMING(2048);
  }

  enum class Features(
    val value: Int
  ) {
    FEATURE_SHADERS(0),

    FEATURE_MULTITHREADED(1);
  }

  enum class InstanceType(
    val value: Int
  ) {
    INSTANCE_NONE(0),

    INSTANCE_MESH(1),

    INSTANCE_MULTIMESH(2),

    INSTANCE_IMMEDIATE(3),

    INSTANCE_PARTICLES(4),

    INSTANCE_LIGHT(5),

    INSTANCE_REFLECTION_PROBE(6),

    INSTANCE_GI_PROBE(7),

    INSTANCE_LIGHTMAP_CAPTURE(8),

    INSTANCE_MAX(9),

    INSTANCE_GEOMETRY_MASK(30);
  }

  enum class EnvironmentSSAOBlur(
    val value: Int
  ) {
    ENV_SSAO_BLUR_DISABLED(0),

    ENV_SSAO_BLUR_1x1(1),

    ENV_SSAO_BLUR_2x2(2),

    ENV_SSAO_BLUR_3x3(3);
  }

  enum class EnvironmentToneMapper(
    val value: Int
  ) {
    ENV_TONE_MAPPER_LINEAR(0),

    ENV_TONE_MAPPER_REINHARD(1),

    ENV_TONE_MAPPER_FILMIC(2),

    ENV_TONE_MAPPER_ACES(3);
  }

  enum class EnvironmentGlowBlendMode(
    val value: Int
  ) {
    GLOW_BLEND_MODE_ADDITIVE(0),

    GLOW_BLEND_MODE_SCREEN(1),

    GLOW_BLEND_MODE_SOFTLIGHT(2),

    GLOW_BLEND_MODE_REPLACE(3);
  }

  enum class MultimeshColorFormat(
    val value: Int
  ) {
    MULTIMESH_COLOR_NONE(0),

    MULTIMESH_COLOR_8BIT(1),

    MULTIMESH_COLOR_FLOAT(2);
  }

  enum class CanvasLightShadowFilter(
    val value: Int
  ) {
    CANVAS_LIGHT_FILTER_NONE(0),

    CANVAS_LIGHT_FILTER_PCF3(1),

    CANVAS_LIGHT_FILTER_PCF5(2),

    CANVAS_LIGHT_FILTER_PCF7(3),

    CANVAS_LIGHT_FILTER_PCF9(4),

    CANVAS_LIGHT_FILTER_PCF13(5);
  }

  enum class ScenarioDebugMode(
    val value: Int
  ) {
    SCENARIO_DEBUG_DISABLED(0),

    SCENARIO_DEBUG_WIREFRAME(1),

    SCENARIO_DEBUG_OVERDRAW(2),

    SCENARIO_DEBUG_SHADELESS(3);
  }

  enum class ViewportUpdateMode(
    val value: Int
  ) {
    VIEWPORT_UPDATE_DISABLED(0),

    VIEWPORT_UPDATE_ONCE(1),

    VIEWPORT_UPDATE_WHEN_VISIBLE(2),

    VIEWPORT_UPDATE_ALWAYS(3);
  }

  enum class ArrayFormat(
    val value: Int
  ) {
    ARRAY_FORMAT_VERTEX(1),

    ARRAY_FORMAT_NORMAL(2),

    ARRAY_FORMAT_TANGENT(4),

    ARRAY_FORMAT_COLOR(8),

    ARRAY_FORMAT_TEX_UV(16),

    ARRAY_FORMAT_TEX_UV2(32),

    ARRAY_FORMAT_BONES(64),

    ARRAY_FORMAT_WEIGHTS(128),

    ARRAY_FORMAT_INDEX(256),

    ARRAY_COMPRESS_VERTEX(512),

    ARRAY_COMPRESS_NORMAL(1024),

    ARRAY_COMPRESS_TANGENT(2048),

    ARRAY_COMPRESS_COLOR(4096),

    ARRAY_COMPRESS_TEX_UV(8192),

    ARRAY_COMPRESS_TEX_UV2(16384),

    ARRAY_COMPRESS_BONES(32768),

    ARRAY_COMPRESS_WEIGHTS(65536),

    ARRAY_COMPRESS_DEFAULT(97280),

    ARRAY_COMPRESS_INDEX(131072),

    ARRAY_FLAG_USE_2D_VERTICES(262144),

    ARRAY_FLAG_USE_16_BIT_BONES(524288);
  }

  enum class ParticlesDrawOrder(
    val value: Int
  ) {
    PARTICLES_DRAW_ORDER_INDEX(0),

    PARTICLES_DRAW_ORDER_LIFETIME(1),

    PARTICLES_DRAW_ORDER_VIEW_DEPTH(2);
  }

  enum class CanvasLightMode(
    val value: Int
  ) {
    CANVAS_LIGHT_MODE_ADD(0),

    CANVAS_LIGHT_MODE_SUB(1),

    CANVAS_LIGHT_MODE_MIX(2),

    CANVAS_LIGHT_MODE_MASK(3);
  }

  enum class LightDirectionalShadowMode(
    val value: Int
  ) {
    LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL(0),

    LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS(1),

    LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS(2);
  }

  enum class LightParam(
    val value: Int
  ) {
    LIGHT_PARAM_ENERGY(0),

    LIGHT_PARAM_SPECULAR(2),

    LIGHT_PARAM_RANGE(3),

    LIGHT_PARAM_ATTENUATION(4),

    LIGHT_PARAM_SPOT_ANGLE(5),

    LIGHT_PARAM_SPOT_ATTENUATION(6),

    LIGHT_PARAM_CONTACT_SHADOW_SIZE(7),

    LIGHT_PARAM_SHADOW_MAX_DISTANCE(8),

    LIGHT_PARAM_SHADOW_SPLIT_1_OFFSET(9),

    LIGHT_PARAM_SHADOW_SPLIT_2_OFFSET(10),

    LIGHT_PARAM_SHADOW_SPLIT_3_OFFSET(11),

    LIGHT_PARAM_SHADOW_NORMAL_BIAS(12),

    LIGHT_PARAM_SHADOW_BIAS(13),

    LIGHT_PARAM_SHADOW_BIAS_SPLIT_SCALE(14),

    LIGHT_PARAM_MAX(15);
  }

  enum class ArrayType(
    val value: Int
  ) {
    ARRAY_VERTEX(0),

    ARRAY_NORMAL(1),

    ARRAY_TANGENT(2),

    ARRAY_COLOR(3),

    ARRAY_TEX_UV(4),

    ARRAY_TEX_UV2(5),

    ARRAY_BONES(6),

    ARRAY_WEIGHTS(7),

    ARRAY_INDEX(8),

    ARRAY_MAX(9);
  }

  enum class CanvasOccluderPolygonCullMode(
    val value: Int
  ) {
    CANVAS_OCCLUDER_POLYGON_CULL_DISABLED(0),

    CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE(1),

    CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE(2);
  }

  enum class InstanceFlags(
    val value: Int
  ) {
    INSTANCE_FLAG_USE_BAKED_LIGHT(0),

    INSTANCE_FLAG_DRAW_NEXT_FRAME_IF_VISIBLE(1),

    INSTANCE_FLAG_MAX(2);
  }

  enum class ViewportMSAA(
    val value: Int
  ) {
    VIEWPORT_MSAA_DISABLED(0),

    VIEWPORT_MSAA_2X(1),

    VIEWPORT_MSAA_4X(2),

    VIEWPORT_MSAA_8X(3),

    VIEWPORT_MSAA_16X(4);
  }

  enum class LightType(
    val value: Int
  ) {
    LIGHT_DIRECTIONAL(0),

    LIGHT_OMNI(1),

    LIGHT_SPOT(2);
  }

  enum class CubeMapSide(
    val value: Int
  ) {
    CUBEMAP_LEFT(0),

    CUBEMAP_RIGHT(1),

    CUBEMAP_BOTTOM(2),

    CUBEMAP_TOP(3),

    CUBEMAP_FRONT(4),

    CUBEMAP_BACK(5);
  }

  companion object {
    val Instance: VisualServer = memScoped {
          val handle =
            checkNotNull(Godot.gdnative.godot_global_get_singleton)("VisualServer".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton VisualServer" }
          VisualServer(
            handle
          )
        }

    val ARRAY_BONES: Int = 6

    val ARRAY_COLOR: Int = 3

    val ARRAY_COMPRESS_BONES: Int = 32768

    val ARRAY_COMPRESS_COLOR: Int = 4096

    val ARRAY_COMPRESS_DEFAULT: Int = 97280

    val ARRAY_COMPRESS_INDEX: Int = 131072

    val ARRAY_COMPRESS_NORMAL: Int = 1024

    val ARRAY_COMPRESS_TANGENT: Int = 2048

    val ARRAY_COMPRESS_TEX_UV: Int = 8192

    val ARRAY_COMPRESS_TEX_UV2: Int = 16384

    val ARRAY_COMPRESS_VERTEX: Int = 512

    val ARRAY_COMPRESS_WEIGHTS: Int = 65536

    val ARRAY_FLAG_USE_16_BIT_BONES: Int = 524288

    val ARRAY_FLAG_USE_2D_VERTICES: Int = 262144

    val ARRAY_FORMAT_BONES: Int = 64

    val ARRAY_FORMAT_COLOR: Int = 8

    val ARRAY_FORMAT_INDEX: Int = 256

    val ARRAY_FORMAT_NORMAL: Int = 2

    val ARRAY_FORMAT_TANGENT: Int = 4

    val ARRAY_FORMAT_TEX_UV: Int = 16

    val ARRAY_FORMAT_TEX_UV2: Int = 32

    val ARRAY_FORMAT_VERTEX: Int = 1

    val ARRAY_FORMAT_WEIGHTS: Int = 128

    val ARRAY_INDEX: Int = 8

    val ARRAY_MAX: Int = 9

    val ARRAY_NORMAL: Int = 1

    val ARRAY_TANGENT: Int = 2

    val ARRAY_TEX_UV: Int = 4

    val ARRAY_TEX_UV2: Int = 5

    val ARRAY_VERTEX: Int = 0

    val ARRAY_WEIGHTS: Int = 7

    val ARRAY_WEIGHTS_SIZE: Int = 4

    val BLEND_SHAPE_MODE_NORMALIZED: Int = 0

    val BLEND_SHAPE_MODE_RELATIVE: Int = 1

    val CANVAS_ITEM_Z_MAX: Int = 4096

    val CANVAS_ITEM_Z_MIN: Int = -4096

    val CANVAS_LIGHT_FILTER_NONE: Int = 0

    val CANVAS_LIGHT_FILTER_PCF13: Int = 5

    val CANVAS_LIGHT_FILTER_PCF3: Int = 1

    val CANVAS_LIGHT_FILTER_PCF5: Int = 2

    val CANVAS_LIGHT_FILTER_PCF7: Int = 3

    val CANVAS_LIGHT_FILTER_PCF9: Int = 4

    val CANVAS_LIGHT_MODE_ADD: Int = 0

    val CANVAS_LIGHT_MODE_MASK: Int = 3

    val CANVAS_LIGHT_MODE_MIX: Int = 2

    val CANVAS_LIGHT_MODE_SUB: Int = 1

    val CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE: Int = 1

    val CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE: Int = 2

    val CANVAS_OCCLUDER_POLYGON_CULL_DISABLED: Int = 0

    val CUBEMAP_BACK: Int = 5

    val CUBEMAP_BOTTOM: Int = 2

    val CUBEMAP_FRONT: Int = 4

    val CUBEMAP_LEFT: Int = 0

    val CUBEMAP_RIGHT: Int = 1

    val CUBEMAP_TOP: Int = 3

    val ENV_BG_CANVAS: Int = 4

    val ENV_BG_CLEAR_COLOR: Int = 0

    val ENV_BG_COLOR: Int = 1

    val ENV_BG_COLOR_SKY: Int = 3

    val ENV_BG_KEEP: Int = 5

    val ENV_BG_MAX: Int = 7

    val ENV_BG_SKY: Int = 2

    val ENV_DOF_BLUR_QUALITY_HIGH: Int = 2

    val ENV_DOF_BLUR_QUALITY_LOW: Int = 0

    val ENV_DOF_BLUR_QUALITY_MEDIUM: Int = 1

    val ENV_SSAO_BLUR_1x1: Int = 1

    val ENV_SSAO_BLUR_2x2: Int = 2

    val ENV_SSAO_BLUR_3x3: Int = 3

    val ENV_SSAO_BLUR_DISABLED: Int = 0

    val ENV_SSAO_QUALITY_HIGH: Int = 2

    val ENV_SSAO_QUALITY_LOW: Int = 0

    val ENV_SSAO_QUALITY_MEDIUM: Int = 1

    val ENV_TONE_MAPPER_ACES: Int = 3

    val ENV_TONE_MAPPER_FILMIC: Int = 2

    val ENV_TONE_MAPPER_LINEAR: Int = 0

    val ENV_TONE_MAPPER_REINHARD: Int = 1

    val FEATURE_MULTITHREADED: Int = 1

    val FEATURE_SHADERS: Int = 0

    val GLOW_BLEND_MODE_ADDITIVE: Int = 0

    val GLOW_BLEND_MODE_REPLACE: Int = 3

    val GLOW_BLEND_MODE_SCREEN: Int = 1

    val GLOW_BLEND_MODE_SOFTLIGHT: Int = 2

    val INFO_DRAW_CALLS_IN_FRAME: Int = 5

    val INFO_MATERIAL_CHANGES_IN_FRAME: Int = 2

    val INFO_OBJECTS_IN_FRAME: Int = 0

    val INFO_SHADER_CHANGES_IN_FRAME: Int = 3

    val INFO_SURFACE_CHANGES_IN_FRAME: Int = 4

    val INFO_TEXTURE_MEM_USED: Int = 8

    val INFO_USAGE_VIDEO_MEM_TOTAL: Int = 6

    val INFO_VERTEX_MEM_USED: Int = 9

    val INFO_VERTICES_IN_FRAME: Int = 1

    val INFO_VIDEO_MEM_USED: Int = 7

    val INSTANCE_FLAG_DRAW_NEXT_FRAME_IF_VISIBLE: Int = 1

    val INSTANCE_FLAG_MAX: Int = 2

    val INSTANCE_FLAG_USE_BAKED_LIGHT: Int = 0

    val INSTANCE_GEOMETRY_MASK: Int = 30

    val INSTANCE_GI_PROBE: Int = 7

    val INSTANCE_IMMEDIATE: Int = 3

    val INSTANCE_LIGHT: Int = 5

    val INSTANCE_LIGHTMAP_CAPTURE: Int = 8

    val INSTANCE_MAX: Int = 9

    val INSTANCE_MESH: Int = 1

    val INSTANCE_MULTIMESH: Int = 2

    val INSTANCE_NONE: Int = 0

    val INSTANCE_PARTICLES: Int = 4

    val INSTANCE_REFLECTION_PROBE: Int = 6

    val LIGHT_DIRECTIONAL: Int = 0

    val LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_OPTIMIZED: Int = 1

    val LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_STABLE: Int = 0

    val LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL: Int = 0

    val LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS: Int = 1

    val LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS: Int = 2

    val LIGHT_OMNI: Int = 1

    val LIGHT_OMNI_SHADOW_CUBE: Int = 1

    val LIGHT_OMNI_SHADOW_DETAIL_HORIZONTAL: Int = 1

    val LIGHT_OMNI_SHADOW_DETAIL_VERTICAL: Int = 0

    val LIGHT_OMNI_SHADOW_DUAL_PARABOLOID: Int = 0

    val LIGHT_PARAM_ATTENUATION: Int = 4

    val LIGHT_PARAM_CONTACT_SHADOW_SIZE: Int = 7

    val LIGHT_PARAM_ENERGY: Int = 0

    val LIGHT_PARAM_MAX: Int = 15

    val LIGHT_PARAM_RANGE: Int = 3

    val LIGHT_PARAM_SHADOW_BIAS: Int = 13

    val LIGHT_PARAM_SHADOW_BIAS_SPLIT_SCALE: Int = 14

    val LIGHT_PARAM_SHADOW_MAX_DISTANCE: Int = 8

    val LIGHT_PARAM_SHADOW_NORMAL_BIAS: Int = 12

    val LIGHT_PARAM_SHADOW_SPLIT_1_OFFSET: Int = 9

    val LIGHT_PARAM_SHADOW_SPLIT_2_OFFSET: Int = 10

    val LIGHT_PARAM_SHADOW_SPLIT_3_OFFSET: Int = 11

    val LIGHT_PARAM_SPECULAR: Int = 2

    val LIGHT_PARAM_SPOT_ANGLE: Int = 5

    val LIGHT_PARAM_SPOT_ATTENUATION: Int = 6

    val LIGHT_SPOT: Int = 2

    val MATERIAL_RENDER_PRIORITY_MAX: Int = 127

    val MATERIAL_RENDER_PRIORITY_MIN: Int = -128

    val MAX_CURSORS: Int = 8

    val MAX_GLOW_LEVELS: Int = 7

    val MULTIMESH_COLOR_8BIT: Int = 1

    val MULTIMESH_COLOR_FLOAT: Int = 2

    val MULTIMESH_COLOR_NONE: Int = 0

    val MULTIMESH_CUSTOM_DATA_8BIT: Int = 1

    val MULTIMESH_CUSTOM_DATA_FLOAT: Int = 2

    val MULTIMESH_CUSTOM_DATA_NONE: Int = 0

    val MULTIMESH_TRANSFORM_2D: Int = 0

    val MULTIMESH_TRANSFORM_3D: Int = 1

    val NINE_PATCH_STRETCH: Int = 0

    val NINE_PATCH_TILE: Int = 1

    val NINE_PATCH_TILE_FIT: Int = 2

    val NO_INDEX_ARRAY: Int = -1

    val PARTICLES_DRAW_ORDER_INDEX: Int = 0

    val PARTICLES_DRAW_ORDER_LIFETIME: Int = 1

    val PARTICLES_DRAW_ORDER_VIEW_DEPTH: Int = 2

    val PRIMITIVE_LINES: Int = 1

    val PRIMITIVE_LINE_LOOP: Int = 3

    val PRIMITIVE_LINE_STRIP: Int = 2

    val PRIMITIVE_MAX: Int = 7

    val PRIMITIVE_POINTS: Int = 0

    val PRIMITIVE_TRIANGLES: Int = 4

    val PRIMITIVE_TRIANGLE_FAN: Int = 6

    val PRIMITIVE_TRIANGLE_STRIP: Int = 5

    val REFLECTION_PROBE_UPDATE_ALWAYS: Int = 1

    val REFLECTION_PROBE_UPDATE_ONCE: Int = 0

    val SCENARIO_DEBUG_DISABLED: Int = 0

    val SCENARIO_DEBUG_OVERDRAW: Int = 2

    val SCENARIO_DEBUG_SHADELESS: Int = 3

    val SCENARIO_DEBUG_WIREFRAME: Int = 1

    val SHADER_CANVAS_ITEM: Int = 1

    val SHADER_MAX: Int = 3

    val SHADER_PARTICLES: Int = 2

    val SHADER_SPATIAL: Int = 0

    val SHADOW_CASTING_SETTING_DOUBLE_SIDED: Int = 2

    val SHADOW_CASTING_SETTING_OFF: Int = 0

    val SHADOW_CASTING_SETTING_ON: Int = 1

    val SHADOW_CASTING_SETTING_SHADOWS_ONLY: Int = 3

    val TEXTURE_FLAGS_DEFAULT: Int = 7

    val TEXTURE_FLAG_ANISOTROPIC_FILTER: Int = 8

    val TEXTURE_FLAG_CONVERT_TO_LINEAR: Int = 16

    val TEXTURE_FLAG_FILTER: Int = 4

    val TEXTURE_FLAG_MIPMAPS: Int = 1

    val TEXTURE_FLAG_MIRRORED_REPEAT: Int = 32

    val TEXTURE_FLAG_REPEAT: Int = 2

    val TEXTURE_FLAG_USED_FOR_STREAMING: Int = 2048

    val TEXTURE_TYPE_2D: Int = 0

    val TEXTURE_TYPE_2D_ARRAY: Int = 2

    val TEXTURE_TYPE_3D: Int = 3

    val TEXTURE_TYPE_CUBEMAP: Int = 1

    val VIEWPORT_CLEAR_ALWAYS: Int = 0

    val VIEWPORT_CLEAR_NEVER: Int = 1

    val VIEWPORT_CLEAR_ONLY_NEXT_FRAME: Int = 2

    val VIEWPORT_DEBUG_DRAW_DISABLED: Int = 0

    val VIEWPORT_DEBUG_DRAW_OVERDRAW: Int = 2

    val VIEWPORT_DEBUG_DRAW_UNSHADED: Int = 1

    val VIEWPORT_DEBUG_DRAW_WIREFRAME: Int = 3

    val VIEWPORT_MSAA_16X: Int = 4

    val VIEWPORT_MSAA_2X: Int = 1

    val VIEWPORT_MSAA_4X: Int = 2

    val VIEWPORT_MSAA_8X: Int = 3

    val VIEWPORT_MSAA_DISABLED: Int = 0

    val VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME: Int = 5

    val VIEWPORT_RENDER_INFO_MATERIAL_CHANGES_IN_FRAME: Int = 2

    val VIEWPORT_RENDER_INFO_MAX: Int = 6

    val VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME: Int = 0

    val VIEWPORT_RENDER_INFO_SHADER_CHANGES_IN_FRAME: Int = 3

    val VIEWPORT_RENDER_INFO_SURFACE_CHANGES_IN_FRAME: Int = 4

    val VIEWPORT_RENDER_INFO_VERTICES_IN_FRAME: Int = 1

    val VIEWPORT_UPDATE_ALWAYS: Int = 3

    val VIEWPORT_UPDATE_DISABLED: Int = 0

    val VIEWPORT_UPDATE_ONCE: Int = 1

    val VIEWPORT_UPDATE_WHEN_VISIBLE: Int = 2

    val VIEWPORT_USAGE_2D: Int = 0

    val VIEWPORT_USAGE_2D_NO_SAMPLING: Int = 1

    val VIEWPORT_USAGE_3D: Int = 2

    val VIEWPORT_USAGE_3D_NO_EFFECTS: Int = 3
  }
}
