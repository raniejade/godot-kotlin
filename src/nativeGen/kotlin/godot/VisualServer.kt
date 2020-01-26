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

    /**
     * Container for method_bind pointers for VisualServer
     */
    private object __method_bind {
      val black_bars_set_images: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "black_bars_set_images".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method black_bars_set_images" }
            }
          }

      val black_bars_set_margins: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "black_bars_set_margins".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method black_bars_set_margins" }
            }
          }

      val camera_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "camera_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method camera_create" }
            }
          }

      val camera_set_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "camera_set_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method camera_set_cull_mask" }
            }
          }

      val camera_set_environment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "camera_set_environment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method camera_set_environment" }
            }
          }

      val camera_set_frustum: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "camera_set_frustum".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method camera_set_frustum" }
            }
          }

      val camera_set_orthogonal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "camera_set_orthogonal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method camera_set_orthogonal" }
            }
          }

      val camera_set_perspective: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "camera_set_perspective".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method camera_set_perspective" }
            }
          }

      val camera_set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "camera_set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method camera_set_transform" }
            }
          }

      val camera_set_use_vertical_aspect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "camera_set_use_vertical_aspect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method camera_set_use_vertical_aspect"
              }
            }
          }

      val canvas_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_create" }
            }
          }

      val canvas_item_add_circle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_circle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_add_circle" }
            }
          }

      val canvas_item_add_clip_ignore: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_clip_ignore".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_add_clip_ignore" }
            }
          }

      val canvas_item_add_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_add_line" }
            }
          }

      val canvas_item_add_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_add_mesh" }
            }
          }

      val canvas_item_add_multimesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_multimesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_add_multimesh" }
            }
          }

      val canvas_item_add_nine_patch: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_nine_patch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_add_nine_patch" }
            }
          }

      val canvas_item_add_particles: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_particles".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_add_particles" }
            }
          }

      val canvas_item_add_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_add_polygon" }
            }
          }

      val canvas_item_add_polyline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_polyline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_add_polyline" }
            }
          }

      val canvas_item_add_primitive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_primitive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_add_primitive" }
            }
          }

      val canvas_item_add_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_add_rect" }
            }
          }

      val canvas_item_add_set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_add_set_transform"
              }
            }
          }

      val canvas_item_add_texture_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_texture_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_add_texture_rect" }
            }
          }

      val canvas_item_add_texture_rect_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_texture_rect_region".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_item_add_texture_rect_region" }
            }
          }

      val canvas_item_add_triangle_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_add_triangle_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_add_triangle_array"
              }
            }
          }

      val canvas_item_clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_clear" }
            }
          }

      val canvas_item_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_create" }
            }
          }

      val canvas_item_set_clip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_clip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_set_clip" }
            }
          }

      val canvas_item_set_copy_to_backbuffer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_copy_to_backbuffer".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_item_set_copy_to_backbuffer" }
            }
          }

      val canvas_item_set_custom_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_custom_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_set_custom_rect" }
            }
          }

      val canvas_item_set_distance_field_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_distance_field_mode".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_item_set_distance_field_mode" }
            }
          }

      val canvas_item_set_draw_behind_parent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_draw_behind_parent".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_item_set_draw_behind_parent" }
            }
          }

      val canvas_item_set_draw_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_draw_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_set_draw_index" }
            }
          }

      val canvas_item_set_light_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_light_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_set_light_mask" }
            }
          }

      val canvas_item_set_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_set_material" }
            }
          }

      val canvas_item_set_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_set_modulate" }
            }
          }

      val canvas_item_set_parent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_parent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_set_parent" }
            }
          }

      val canvas_item_set_self_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_self_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_set_self_modulate"
              }
            }
          }

      val canvas_item_set_sort_children_by_y: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_sort_children_by_y".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_item_set_sort_children_by_y" }
            }
          }

      val canvas_item_set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_set_transform" }
            }
          }

      val canvas_item_set_use_parent_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_use_parent_material".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_item_set_use_parent_material" }
            }
          }

      val canvas_item_set_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_set_visible" }
            }
          }

      val canvas_item_set_z_as_relative_to_parent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_z_as_relative_to_parent".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_item_set_z_as_relative_to_parent" }
            }
          }

      val canvas_item_set_z_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_item_set_z_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_item_set_z_index" }
            }
          }

      val canvas_light_attach_to_canvas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_attach_to_canvas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_attach_to_canvas"
              }
            }
          }

      val canvas_light_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_create" }
            }
          }

      val canvas_light_occluder_attach_to_canvas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_occluder_attach_to_canvas".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_light_occluder_attach_to_canvas" }
            }
          }

      val canvas_light_occluder_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_occluder_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_occluder_create" }
            }
          }

      val canvas_light_occluder_set_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_occluder_set_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_light_occluder_set_enabled" }
            }
          }

      val canvas_light_occluder_set_light_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_occluder_set_light_mask".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_light_occluder_set_light_mask" }
            }
          }

      val canvas_light_occluder_set_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_occluder_set_polygon".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_light_occluder_set_polygon" }
            }
          }

      val canvas_light_occluder_set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_occluder_set_transform".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_light_occluder_set_transform" }
            }
          }

      val canvas_light_set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_set_color" }
            }
          }

      val canvas_light_set_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_set_enabled" }
            }
          }

      val canvas_light_set_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_set_energy" }
            }
          }

      val canvas_light_set_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_set_height" }
            }
          }

      val canvas_light_set_item_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_item_cull_mask".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_light_set_item_cull_mask" }
            }
          }

      val canvas_light_set_item_shadow_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_item_shadow_cull_mask".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_light_set_item_shadow_cull_mask" }
            }
          }

      val canvas_light_set_layer_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_layer_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_set_layer_range" }
            }
          }

      val canvas_light_set_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_set_mode" }
            }
          }

      val canvas_light_set_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_set_scale" }
            }
          }

      val canvas_light_set_shadow_buffer_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_shadow_buffer_size".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_light_set_shadow_buffer_size" }
            }
          }

      val canvas_light_set_shadow_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_shadow_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_set_shadow_color"
              }
            }
          }

      val canvas_light_set_shadow_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_shadow_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_light_set_shadow_enabled" }
            }
          }

      val canvas_light_set_shadow_filter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_shadow_filter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_set_shadow_filter"
              }
            }
          }

      val canvas_light_set_shadow_gradient_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_shadow_gradient_length".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_light_set_shadow_gradient_length" }
            }
          }

      val canvas_light_set_shadow_smooth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_shadow_smooth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_set_shadow_smooth"
              }
            }
          }

      val canvas_light_set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_set_texture" }
            }
          }

      val canvas_light_set_texture_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_texture_offset".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_light_set_texture_offset" }
            }
          }

      val canvas_light_set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_set_transform" }
            }
          }

      val canvas_light_set_z_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_light_set_z_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_light_set_z_range" }
            }
          }

      val canvas_occluder_polygon_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_occluder_polygon_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_occluder_polygon_create"
              }
            }
          }

      val canvas_occluder_polygon_set_cull_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_occluder_polygon_set_cull_mode".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_occluder_polygon_set_cull_mode" }
            }
          }

      val canvas_occluder_polygon_set_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_occluder_polygon_set_shape".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_occluder_polygon_set_shape" }
            }
          }

      val canvas_occluder_polygon_set_shape_as_lines: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_occluder_polygon_set_shape_as_lines".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method canvas_occluder_polygon_set_shape_as_lines" }
            }
          }

      val canvas_set_item_mirroring: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_set_item_mirroring".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_set_item_mirroring" }
            }
          }

      val canvas_set_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "canvas_set_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method canvas_set_modulate" }
            }
          }

      val directional_light_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "directional_light_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method directional_light_create" }
            }
          }

      val draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw" }
            }
          }

      val environment_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_create" }
            }
          }

      val environment_set_adjustment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_adjustment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_adjustment" }
            }
          }

      val environment_set_ambient_light: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_ambient_light".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_ambient_light"
              }
            }
          }

      val environment_set_background: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_background".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_background" }
            }
          }

      val environment_set_bg_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_bg_color" }
            }
          }

      val environment_set_bg_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_bg_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_bg_energy" }
            }
          }

      val environment_set_canvas_max_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_canvas_max_layer".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method environment_set_canvas_max_layer" }
            }
          }

      val environment_set_dof_blur_far: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_dof_blur_far".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_dof_blur_far" }
            }
          }

      val environment_set_dof_blur_near: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_dof_blur_near".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_dof_blur_near"
              }
            }
          }

      val environment_set_fog: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_fog".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_fog" }
            }
          }

      val environment_set_fog_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_fog_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_fog_depth" }
            }
          }

      val environment_set_fog_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_fog_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_fog_height" }
            }
          }

      val environment_set_glow: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_glow".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_glow" }
            }
          }

      val environment_set_sky: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_sky".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_sky" }
            }
          }

      val environment_set_sky_custom_fov: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_sky_custom_fov".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_sky_custom_fov"
              }
            }
          }

      val environment_set_sky_orientation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_sky_orientation".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method environment_set_sky_orientation" }
            }
          }

      val environment_set_ssao: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_ssao".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_ssao" }
            }
          }

      val environment_set_ssr: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_ssr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_ssr" }
            }
          }

      val environment_set_tonemap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "environment_set_tonemap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method environment_set_tonemap" }
            }
          }

      val finish: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "finish".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method finish" }
            }
          }

      val force_draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "force_draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method force_draw" }
            }
          }

      val force_sync: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "force_sync".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method force_sync" }
            }
          }

      val free_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "free_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method free_rid" }
            }
          }

      val get_render_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "get_render_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_render_info" }
            }
          }

      val get_test_cube: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "get_test_cube".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_test_cube" }
            }
          }

      val get_test_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "get_test_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_test_texture" }
            }
          }

      val get_white_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "get_white_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_white_texture" }
            }
          }

      val gi_probe_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_create" }
            }
          }

      val gi_probe_get_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_get_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_get_bias" }
            }
          }

      val gi_probe_get_bounds: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_get_bounds".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_get_bounds" }
            }
          }

      val gi_probe_get_cell_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_get_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_get_cell_size" }
            }
          }

      val gi_probe_get_dynamic_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_get_dynamic_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_get_dynamic_data" }
            }
          }

      val gi_probe_get_dynamic_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_get_dynamic_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_get_dynamic_range" }
            }
          }

      val gi_probe_get_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_get_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_get_energy" }
            }
          }

      val gi_probe_get_normal_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_get_normal_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_get_normal_bias" }
            }
          }

      val gi_probe_get_propagation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_get_propagation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_get_propagation" }
            }
          }

      val gi_probe_get_to_cell_xform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_get_to_cell_xform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_get_to_cell_xform" }
            }
          }

      val gi_probe_is_compressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_is_compressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_is_compressed" }
            }
          }

      val gi_probe_is_interior: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_is_interior".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_is_interior" }
            }
          }

      val gi_probe_set_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_set_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_set_bias" }
            }
          }

      val gi_probe_set_bounds: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_set_bounds".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_set_bounds" }
            }
          }

      val gi_probe_set_cell_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_set_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_set_cell_size" }
            }
          }

      val gi_probe_set_compress: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_set_compress".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_set_compress" }
            }
          }

      val gi_probe_set_dynamic_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_set_dynamic_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_set_dynamic_data" }
            }
          }

      val gi_probe_set_dynamic_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_set_dynamic_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_set_dynamic_range" }
            }
          }

      val gi_probe_set_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_set_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_set_energy" }
            }
          }

      val gi_probe_set_interior: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_set_interior".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_set_interior" }
            }
          }

      val gi_probe_set_normal_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_set_normal_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_set_normal_bias" }
            }
          }

      val gi_probe_set_propagation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_set_propagation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_set_propagation" }
            }
          }

      val gi_probe_set_to_cell_xform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "gi_probe_set_to_cell_xform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gi_probe_set_to_cell_xform" }
            }
          }

      val has_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "has_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_changed" }
            }
          }

      val has_feature: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "has_feature".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_feature" }
            }
          }

      val has_os_feature: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "has_os_feature".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_os_feature" }
            }
          }

      val immediate_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "immediate_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method immediate_begin" }
            }
          }

      val immediate_clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "immediate_clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method immediate_clear" }
            }
          }

      val immediate_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "immediate_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method immediate_color" }
            }
          }

      val immediate_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "immediate_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method immediate_create" }
            }
          }

      val immediate_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "immediate_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method immediate_end" }
            }
          }

      val immediate_get_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "immediate_get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method immediate_get_material" }
            }
          }

      val immediate_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "immediate_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method immediate_normal" }
            }
          }

      val immediate_set_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "immediate_set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method immediate_set_material" }
            }
          }

      val immediate_tangent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "immediate_tangent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method immediate_tangent" }
            }
          }

      val immediate_uv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "immediate_uv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method immediate_uv" }
            }
          }

      val immediate_uv2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "immediate_uv2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method immediate_uv2" }
            }
          }

      val immediate_vertex: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "immediate_vertex".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method immediate_vertex" }
            }
          }

      val immediate_vertex_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "immediate_vertex_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method immediate_vertex_2d" }
            }
          }

      val init: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "init".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method init" }
            }
          }

      val instance_attach_object_instance_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_attach_object_instance_id".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method instance_attach_object_instance_id" }
            }
          }

      val instance_attach_skeleton: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_attach_skeleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance_attach_skeleton" }
            }
          }

      val instance_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance_create" }
            }
          }

      val instance_create2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_create2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance_create2" }
            }
          }

      val instance_geometry_set_as_instance_lod: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_geometry_set_as_instance_lod".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method instance_geometry_set_as_instance_lod" }
            }
          }

      val instance_geometry_set_cast_shadows_setting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_geometry_set_cast_shadows_setting".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method instance_geometry_set_cast_shadows_setting" }
            }
          }

      val instance_geometry_set_draw_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_geometry_set_draw_range".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method instance_geometry_set_draw_range" }
            }
          }

      val instance_geometry_set_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_geometry_set_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance_geometry_set_flag" }
            }
          }

      val instance_geometry_set_material_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_geometry_set_material_override".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method instance_geometry_set_material_override" }
            }
          }

      val instance_set_base: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_set_base".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance_set_base" }
            }
          }

      val instance_set_blend_shape_weight: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_set_blend_shape_weight".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method instance_set_blend_shape_weight" }
            }
          }

      val instance_set_custom_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_set_custom_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance_set_custom_aabb" }
            }
          }

      val instance_set_exterior: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_set_exterior".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance_set_exterior" }
            }
          }

      val instance_set_extra_visibility_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_set_extra_visibility_margin".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method instance_set_extra_visibility_margin" }
            }
          }

      val instance_set_layer_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_set_layer_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance_set_layer_mask" }
            }
          }

      val instance_set_scenario: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_set_scenario".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance_set_scenario" }
            }
          }

      val instance_set_surface_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_set_surface_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance_set_surface_material"
              }
            }
          }

      val instance_set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance_set_transform" }
            }
          }

      val instance_set_use_lightmap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_set_use_lightmap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance_set_use_lightmap" }
            }
          }

      val instance_set_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instance_set_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance_set_visible" }
            }
          }

      val instances_cull_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instances_cull_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instances_cull_aabb" }
            }
          }

      val instances_cull_convex: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instances_cull_convex".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instances_cull_convex" }
            }
          }

      val instances_cull_ray: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "instances_cull_ray".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instances_cull_ray" }
            }
          }

      val light_directional_set_blend_splits: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "light_directional_set_blend_splits".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method light_directional_set_blend_splits" }
            }
          }

      val light_directional_set_shadow_depth_range_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "light_directional_set_shadow_depth_range_mode".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method light_directional_set_shadow_depth_range_mode" }
            }
          }

      val light_directional_set_shadow_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "light_directional_set_shadow_mode".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method light_directional_set_shadow_mode" }
            }
          }

      val light_omni_set_shadow_detail: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "light_omni_set_shadow_detail".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method light_omni_set_shadow_detail" }
            }
          }

      val light_omni_set_shadow_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "light_omni_set_shadow_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method light_omni_set_shadow_mode" }
            }
          }

      val light_set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "light_set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method light_set_color" }
            }
          }

      val light_set_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "light_set_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method light_set_cull_mask" }
            }
          }

      val light_set_negative: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "light_set_negative".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method light_set_negative" }
            }
          }

      val light_set_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "light_set_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method light_set_param" }
            }
          }

      val light_set_projector: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "light_set_projector".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method light_set_projector" }
            }
          }

      val light_set_reverse_cull_face_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "light_set_reverse_cull_face_mode".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method light_set_reverse_cull_face_mode" }
            }
          }

      val light_set_shadow: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "light_set_shadow".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method light_set_shadow" }
            }
          }

      val light_set_shadow_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "light_set_shadow_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method light_set_shadow_color" }
            }
          }

      val light_set_use_gi: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "light_set_use_gi".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method light_set_use_gi" }
            }
          }

      val lightmap_capture_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "lightmap_capture_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method lightmap_capture_create" }
            }
          }

      val lightmap_capture_get_bounds: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "lightmap_capture_get_bounds".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method lightmap_capture_get_bounds" }
            }
          }

      val lightmap_capture_get_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "lightmap_capture_get_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method lightmap_capture_get_energy" }
            }
          }

      val lightmap_capture_get_octree: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "lightmap_capture_get_octree".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method lightmap_capture_get_octree" }
            }
          }

      val lightmap_capture_get_octree_cell_subdiv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "lightmap_capture_get_octree_cell_subdiv".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method lightmap_capture_get_octree_cell_subdiv" }
            }
          }

      val lightmap_capture_get_octree_cell_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "lightmap_capture_get_octree_cell_transform".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method lightmap_capture_get_octree_cell_transform" }
            }
          }

      val lightmap_capture_set_bounds: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "lightmap_capture_set_bounds".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method lightmap_capture_set_bounds" }
            }
          }

      val lightmap_capture_set_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "lightmap_capture_set_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method lightmap_capture_set_energy" }
            }
          }

      val lightmap_capture_set_octree: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "lightmap_capture_set_octree".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method lightmap_capture_set_octree" }
            }
          }

      val lightmap_capture_set_octree_cell_subdiv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "lightmap_capture_set_octree_cell_subdiv".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method lightmap_capture_set_octree_cell_subdiv" }
            }
          }

      val lightmap_capture_set_octree_cell_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "lightmap_capture_set_octree_cell_transform".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method lightmap_capture_set_octree_cell_transform" }
            }
          }

      val make_sphere_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "make_sphere_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_sphere_mesh" }
            }
          }

      val material_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "material_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method material_create" }
            }
          }

      val material_get_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "material_get_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method material_get_param" }
            }
          }

      val material_get_param_default: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "material_get_param_default".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method material_get_param_default" }
            }
          }

      val material_get_shader: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "material_get_shader".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method material_get_shader" }
            }
          }

      val material_set_line_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "material_set_line_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method material_set_line_width" }
            }
          }

      val material_set_next_pass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "material_set_next_pass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method material_set_next_pass" }
            }
          }

      val material_set_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "material_set_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method material_set_param" }
            }
          }

      val material_set_render_priority: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "material_set_render_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method material_set_render_priority" }
            }
          }

      val material_set_shader: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "material_set_shader".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method material_set_shader" }
            }
          }

      val mesh_add_surface_from_arrays: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_add_surface_from_arrays".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_add_surface_from_arrays" }
            }
          }

      val mesh_clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_clear" }
            }
          }

      val mesh_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_create" }
            }
          }

      val mesh_get_blend_shape_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_get_blend_shape_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_get_blend_shape_count" }
            }
          }

      val mesh_get_blend_shape_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_get_blend_shape_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_get_blend_shape_mode" }
            }
          }

      val mesh_get_custom_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_get_custom_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_get_custom_aabb" }
            }
          }

      val mesh_get_surface_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_get_surface_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_get_surface_count" }
            }
          }

      val mesh_remove_surface: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_remove_surface".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_remove_surface" }
            }
          }

      val mesh_set_blend_shape_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_set_blend_shape_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_set_blend_shape_count" }
            }
          }

      val mesh_set_blend_shape_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_set_blend_shape_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_set_blend_shape_mode" }
            }
          }

      val mesh_set_custom_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_set_custom_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_set_custom_aabb" }
            }
          }

      val mesh_surface_get_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_get_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_aabb" }
            }
          }

      val mesh_surface_get_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_get_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_array" }
            }
          }

      val mesh_surface_get_array_index_len: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_get_array_index_len".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method mesh_surface_get_array_index_len" }
            }
          }

      val mesh_surface_get_array_len: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_get_array_len".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_array_len" }
            }
          }

      val mesh_surface_get_arrays: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_get_arrays".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_arrays" }
            }
          }

      val mesh_surface_get_blend_shape_arrays: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_get_blend_shape_arrays".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method mesh_surface_get_blend_shape_arrays" }
            }
          }

      val mesh_surface_get_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_get_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_format" }
            }
          }

      val mesh_surface_get_format_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_get_format_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_format_offset"
              }
            }
          }

      val mesh_surface_get_format_stride: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_get_format_stride".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_format_stride"
              }
            }
          }

      val mesh_surface_get_index_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_get_index_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_index_array" }
            }
          }

      val mesh_surface_get_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_material" }
            }
          }

      val mesh_surface_get_primitive_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_get_primitive_type".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method mesh_surface_get_primitive_type" }
            }
          }

      val mesh_surface_get_skeleton_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_get_skeleton_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_skeleton_aabb"
              }
            }
          }

      val mesh_surface_set_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_surface_set_material" }
            }
          }

      val mesh_surface_update_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "mesh_surface_update_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method mesh_surface_update_region" }
            }
          }

      val multimesh_allocate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_allocate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method multimesh_allocate" }
            }
          }

      val multimesh_get_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_get_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method multimesh_get_aabb" }
            }
          }

      val multimesh_get_instance_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_get_instance_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method multimesh_get_instance_count" }
            }
          }

      val multimesh_get_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_get_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method multimesh_get_mesh" }
            }
          }

      val multimesh_get_visible_instances: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_get_visible_instances".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method multimesh_get_visible_instances" }
            }
          }

      val multimesh_instance_get_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_instance_get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method multimesh_instance_get_color" }
            }
          }

      val multimesh_instance_get_custom_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_instance_get_custom_data".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method multimesh_instance_get_custom_data" }
            }
          }

      val multimesh_instance_get_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_instance_get_transform".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method multimesh_instance_get_transform" }
            }
          }

      val multimesh_instance_get_transform_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_instance_get_transform_2d".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method multimesh_instance_get_transform_2d" }
            }
          }

      val multimesh_instance_set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_instance_set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method multimesh_instance_set_color" }
            }
          }

      val multimesh_instance_set_custom_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_instance_set_custom_data".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method multimesh_instance_set_custom_data" }
            }
          }

      val multimesh_instance_set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_instance_set_transform".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method multimesh_instance_set_transform" }
            }
          }

      val multimesh_instance_set_transform_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_instance_set_transform_2d".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method multimesh_instance_set_transform_2d" }
            }
          }

      val multimesh_set_as_bulk_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_set_as_bulk_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method multimesh_set_as_bulk_array" }
            }
          }

      val multimesh_set_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_set_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method multimesh_set_mesh" }
            }
          }

      val multimesh_set_visible_instances: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "multimesh_set_visible_instances".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method multimesh_set_visible_instances" }
            }
          }

      val omni_light_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "omni_light_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method omni_light_create" }
            }
          }

      val particles_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_create" }
            }
          }

      val particles_get_current_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_get_current_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_get_current_aabb" }
            }
          }

      val particles_get_emitting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_get_emitting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_get_emitting" }
            }
          }

      val particles_restart: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_restart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_restart" }
            }
          }

      val particles_set_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_set_amount" }
            }
          }

      val particles_set_custom_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_custom_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_set_custom_aabb" }
            }
          }

      val particles_set_draw_order: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_draw_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_set_draw_order" }
            }
          }

      val particles_set_draw_pass_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_draw_pass_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_set_draw_pass_mesh" }
            }
          }

      val particles_set_draw_passes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_draw_passes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_set_draw_passes" }
            }
          }

      val particles_set_emission_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_emission_transform".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method particles_set_emission_transform" }
            }
          }

      val particles_set_emitting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_emitting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_set_emitting" }
            }
          }

      val particles_set_explosiveness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_explosiveness_ratio".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method particles_set_explosiveness_ratio" }
            }
          }

      val particles_set_fixed_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_fixed_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_set_fixed_fps" }
            }
          }

      val particles_set_fractional_delta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_fractional_delta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_set_fractional_delta"
              }
            }
          }

      val particles_set_lifetime: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_lifetime".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_set_lifetime" }
            }
          }

      val particles_set_one_shot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_set_one_shot" }
            }
          }

      val particles_set_pre_process_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_pre_process_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_set_pre_process_time"
              }
            }
          }

      val particles_set_process_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_process_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_set_process_material"
              }
            }
          }

      val particles_set_randomness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_randomness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_set_randomness_ratio"
              }
            }
          }

      val particles_set_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method particles_set_speed_scale" }
            }
          }

      val particles_set_use_local_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "particles_set_use_local_coordinates".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method particles_set_use_local_coordinates" }
            }
          }

      val reflection_probe_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "reflection_probe_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reflection_probe_create" }
            }
          }

      val reflection_probe_set_as_interior: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "reflection_probe_set_as_interior".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method reflection_probe_set_as_interior" }
            }
          }

      val reflection_probe_set_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "reflection_probe_set_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reflection_probe_set_cull_mask"
              }
            }
          }

      val reflection_probe_set_enable_box_projection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "reflection_probe_set_enable_box_projection".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method reflection_probe_set_enable_box_projection" }
            }
          }

      val reflection_probe_set_enable_shadows: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "reflection_probe_set_enable_shadows".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method reflection_probe_set_enable_shadows" }
            }
          }

      val reflection_probe_set_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "reflection_probe_set_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reflection_probe_set_extents" }
            }
          }

      val reflection_probe_set_intensity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "reflection_probe_set_intensity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reflection_probe_set_intensity"
              }
            }
          }

      val reflection_probe_set_interior_ambient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "reflection_probe_set_interior_ambient".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method reflection_probe_set_interior_ambient" }
            }
          }

      val reflection_probe_set_interior_ambient_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "reflection_probe_set_interior_ambient_energy".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method reflection_probe_set_interior_ambient_energy" }
            }
          }

      val reflection_probe_set_interior_ambient_probe_contribution: CPointer<godot_method_bind> by
          lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "reflection_probe_set_interior_ambient_probe_contribution".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method reflection_probe_set_interior_ambient_probe_contribution"
              }
            }
          }

      val reflection_probe_set_max_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "reflection_probe_set_max_distance".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method reflection_probe_set_max_distance" }
            }
          }

      val reflection_probe_set_origin_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "reflection_probe_set_origin_offset".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method reflection_probe_set_origin_offset" }
            }
          }

      val reflection_probe_set_update_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "reflection_probe_set_update_mode".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method reflection_probe_set_update_mode" }
            }
          }

      val request_frame_drawn_callback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "request_frame_drawn_callback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method request_frame_drawn_callback" }
            }
          }

      val scenario_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "scenario_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method scenario_create" }
            }
          }

      val scenario_set_debug: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "scenario_set_debug".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method scenario_set_debug" }
            }
          }

      val scenario_set_environment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "scenario_set_environment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method scenario_set_environment" }
            }
          }

      val scenario_set_fallback_environment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "scenario_set_fallback_environment".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method scenario_set_fallback_environment" }
            }
          }

      val scenario_set_reflection_atlas_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "scenario_set_reflection_atlas_size".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method scenario_set_reflection_atlas_size" }
            }
          }

      val set_boot_image: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "set_boot_image".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_boot_image" }
            }
          }

      val set_debug_generate_wireframes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "set_debug_generate_wireframes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_debug_generate_wireframes"
              }
            }
          }

      val set_default_clear_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "set_default_clear_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_clear_color" }
            }
          }

      val shader_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "shader_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shader_create" }
            }
          }

      val shader_get_code: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "shader_get_code".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shader_get_code" }
            }
          }

      val shader_get_default_texture_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "shader_get_default_texture_param".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method shader_get_default_texture_param" }
            }
          }

      val shader_get_param_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "shader_get_param_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shader_get_param_list" }
            }
          }

      val shader_set_code: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "shader_set_code".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shader_set_code" }
            }
          }

      val shader_set_default_texture_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "shader_set_default_texture_param".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method shader_set_default_texture_param" }
            }
          }

      val skeleton_allocate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "skeleton_allocate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method skeleton_allocate" }
            }
          }

      val skeleton_bone_get_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "skeleton_bone_get_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method skeleton_bone_get_transform" }
            }
          }

      val skeleton_bone_get_transform_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "skeleton_bone_get_transform_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method skeleton_bone_get_transform_2d"
              }
            }
          }

      val skeleton_bone_set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "skeleton_bone_set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method skeleton_bone_set_transform" }
            }
          }

      val skeleton_bone_set_transform_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "skeleton_bone_set_transform_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method skeleton_bone_set_transform_2d"
              }
            }
          }

      val skeleton_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "skeleton_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method skeleton_create" }
            }
          }

      val skeleton_get_bone_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "skeleton_get_bone_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method skeleton_get_bone_count" }
            }
          }

      val sky_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "sky_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method sky_create" }
            }
          }

      val sky_set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "sky_set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method sky_set_texture" }
            }
          }

      val spot_light_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "spot_light_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method spot_light_create" }
            }
          }

      val sync: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "sync".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method sync" }
            }
          }

      val texture_allocate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_allocate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_allocate" }
            }
          }

      val texture_bind: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_bind".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_bind" }
            }
          }

      val texture_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_create" }
            }
          }

      val texture_create_from_image: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_create_from_image".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_create_from_image" }
            }
          }

      val texture_debug_usage: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_debug_usage".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_debug_usage" }
            }
          }

      val texture_get_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_get_data" }
            }
          }

      val texture_get_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_get_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_get_depth" }
            }
          }

      val texture_get_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_get_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_get_flags" }
            }
          }

      val texture_get_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_get_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_get_format" }
            }
          }

      val texture_get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_get_height" }
            }
          }

      val texture_get_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_get_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_get_path" }
            }
          }

      val texture_get_texid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_get_texid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_get_texid" }
            }
          }

      val texture_get_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_get_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_get_type" }
            }
          }

      val texture_get_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_get_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_get_width" }
            }
          }

      val texture_set_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_set_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_set_data" }
            }
          }

      val texture_set_data_partial: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_set_data_partial".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_set_data_partial" }
            }
          }

      val texture_set_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_set_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_set_flags" }
            }
          }

      val texture_set_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_set_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_set_path" }
            }
          }

      val texture_set_shrink_all_x2_on_set_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_set_shrink_all_x2_on_set_data".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method texture_set_shrink_all_x2_on_set_data" }
            }
          }

      val texture_set_size_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "texture_set_size_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method texture_set_size_override" }
            }
          }

      val textures_keep_original: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "textures_keep_original".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method textures_keep_original" }
            }
          }

      val viewport_attach_camera: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_attach_camera".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_attach_camera" }
            }
          }

      val viewport_attach_canvas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_attach_canvas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_attach_canvas" }
            }
          }

      val viewport_attach_to_screen: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_attach_to_screen".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_attach_to_screen" }
            }
          }

      val viewport_create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_create" }
            }
          }

      val viewport_detach: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_detach".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_detach" }
            }
          }

      val viewport_get_render_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_get_render_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_get_render_info" }
            }
          }

      val viewport_get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_get_texture" }
            }
          }

      val viewport_remove_canvas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_remove_canvas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_remove_canvas" }
            }
          }

      val viewport_set_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_active" }
            }
          }

      val viewport_set_canvas_stacking: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_canvas_stacking".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_canvas_stacking" }
            }
          }

      val viewport_set_canvas_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_canvas_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_canvas_transform"
              }
            }
          }

      val viewport_set_clear_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_clear_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_clear_mode" }
            }
          }

      val viewport_set_debug_draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_debug_draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_debug_draw" }
            }
          }

      val viewport_set_disable_3d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_disable_3d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_disable_3d" }
            }
          }

      val viewport_set_disable_environment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_disable_environment".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method viewport_set_disable_environment" }
            }
          }

      val viewport_set_global_canvas_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_global_canvas_transform".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method viewport_set_global_canvas_transform" }
            }
          }

      val viewport_set_hdr: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_hdr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_hdr" }
            }
          }

      val viewport_set_hide_canvas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_hide_canvas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_hide_canvas" }
            }
          }

      val viewport_set_hide_scenario: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_hide_scenario".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_hide_scenario" }
            }
          }

      val viewport_set_msaa: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_msaa".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_msaa" }
            }
          }

      val viewport_set_parent_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_parent_viewport".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_parent_viewport" }
            }
          }

      val viewport_set_render_direct_to_screen: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_render_direct_to_screen".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method viewport_set_render_direct_to_screen" }
            }
          }

      val viewport_set_scenario: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_scenario".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_scenario" }
            }
          }

      val viewport_set_shadow_atlas_quadrant_subdivision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_shadow_atlas_quadrant_subdivision".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method viewport_set_shadow_atlas_quadrant_subdivision" }
            }
          }

      val viewport_set_shadow_atlas_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_shadow_atlas_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_shadow_atlas_size"
              }
            }
          }

      val viewport_set_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_size" }
            }
          }

      val viewport_set_transparent_background: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_transparent_background".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method viewport_set_transparent_background" }
            }
          }

      val viewport_set_update_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_update_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_update_mode" }
            }
          }

      val viewport_set_usage: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_usage".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_usage" }
            }
          }

      val viewport_set_use_arvr: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_use_arvr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_use_arvr" }
            }
          }

      val viewport_set_vflip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
              "viewport_set_vflip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method viewport_set_vflip" }
            }
          }
    }
  }
}
