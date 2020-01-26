// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class VisualServer internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    val ArrayBones: Int = 6

    val ArrayColor: Int = 3

    val ArrayCompressBones: Int = 32768

    val ArrayCompressColor: Int = 4096

    val ArrayCompressDefault: Int = 97280

    val ArrayCompressIndex: Int = 131072

    val ArrayCompressNormal: Int = 1024

    val ArrayCompressTangent: Int = 2048

    val ArrayCompressTexUv: Int = 8192

    val ArrayCompressTexUv2: Int = 16384

    val ArrayCompressVertex: Int = 512

    val ArrayCompressWeights: Int = 65536

    val ArrayFlagUse16BitBones: Int = 524288

    val ArrayFlagUse2dVertices: Int = 262144

    val ArrayFormatBones: Int = 64

    val ArrayFormatColor: Int = 8

    val ArrayFormatIndex: Int = 256

    val ArrayFormatNormal: Int = 2

    val ArrayFormatTangent: Int = 4

    val ArrayFormatTexUv: Int = 16

    val ArrayFormatTexUv2: Int = 32

    val ArrayFormatVertex: Int = 1

    val ArrayFormatWeights: Int = 128

    val ArrayIndex: Int = 8

    val ArrayMax: Int = 9

    val ArrayNormal: Int = 1

    val ArrayTangent: Int = 2

    val ArrayTexUv: Int = 4

    val ArrayTexUv2: Int = 5

    val ArrayVertex: Int = 0

    val ArrayWeights: Int = 7

    val ArrayWeightsSize: Int = 4

    val BlendShapeModeNormalized: Int = 0

    val BlendShapeModeRelative: Int = 1

    val CanvasItemZMax: Int = 4096

    val CanvasItemZMin: Int = -4096

    val CanvasLightFilterNone: Int = 0

    val CanvasLightFilterPcf13: Int = 5

    val CanvasLightFilterPcf3: Int = 1

    val CanvasLightFilterPcf5: Int = 2

    val CanvasLightFilterPcf7: Int = 3

    val CanvasLightFilterPcf9: Int = 4

    val CanvasLightModeAdd: Int = 0

    val CanvasLightModeMask: Int = 3

    val CanvasLightModeMix: Int = 2

    val CanvasLightModeSub: Int = 1

    val CanvasOccluderPolygonCullClockwise: Int = 1

    val CanvasOccluderPolygonCullCounterClockwise: Int = 2

    val CanvasOccluderPolygonCullDisabled: Int = 0

    val CubemapBack: Int = 5

    val CubemapBottom: Int = 2

    val CubemapFront: Int = 4

    val CubemapLeft: Int = 0

    val CubemapRight: Int = 1

    val CubemapTop: Int = 3

    val EnvBgCanvas: Int = 4

    val EnvBgClearColor: Int = 0

    val EnvBgColor: Int = 1

    val EnvBgColorSky: Int = 3

    val EnvBgKeep: Int = 5

    val EnvBgMax: Int = 7

    val EnvBgSky: Int = 2

    val EnvDofBlurQualityHigh: Int = 2

    val EnvDofBlurQualityLow: Int = 0

    val EnvDofBlurQualityMedium: Int = 1

    val EnvSsaoBlur1x1: Int = 1

    val EnvSsaoBlur2x2: Int = 2

    val EnvSsaoBlur3x3: Int = 3

    val EnvSsaoBlurDisabled: Int = 0

    val EnvSsaoQualityHigh: Int = 2

    val EnvSsaoQualityLow: Int = 0

    val EnvSsaoQualityMedium: Int = 1

    val EnvToneMapperAces: Int = 3

    val EnvToneMapperFilmic: Int = 2

    val EnvToneMapperLinear: Int = 0

    val EnvToneMapperReinhard: Int = 1

    val FeatureMultithreaded: Int = 1

    val FeatureShaders: Int = 0

    val GlowBlendModeAdditive: Int = 0

    val GlowBlendModeReplace: Int = 3

    val GlowBlendModeScreen: Int = 1

    val GlowBlendModeSoftlight: Int = 2

    val InfoDrawCallsInFrame: Int = 5

    val InfoMaterialChangesInFrame: Int = 2

    val InfoObjectsInFrame: Int = 0

    val InfoShaderChangesInFrame: Int = 3

    val InfoSurfaceChangesInFrame: Int = 4

    val InfoTextureMemUsed: Int = 8

    val InfoUsageVideoMemTotal: Int = 6

    val InfoVertexMemUsed: Int = 9

    val InfoVerticesInFrame: Int = 1

    val InfoVideoMemUsed: Int = 7

    val InstanceFlagDrawNextFrameIfVisible: Int = 1

    val InstanceFlagMax: Int = 2

    val InstanceFlagUseBakedLight: Int = 0

    val InstanceGeometryMask: Int = 30

    val InstanceGiProbe: Int = 7

    val InstanceImmediate: Int = 3

    val InstanceLight: Int = 5

    val InstanceLightmapCapture: Int = 8

    val InstanceMax: Int = 9

    val InstanceMesh: Int = 1

    val InstanceMultimesh: Int = 2

    val InstanceNone: Int = 0

    val InstanceParticles: Int = 4

    val InstanceReflectionProbe: Int = 6

    val LightDirectional: Int = 0

    val LightDirectionalShadowDepthRangeOptimized: Int = 1

    val LightDirectionalShadowDepthRangeStable: Int = 0

    val LightDirectionalShadowOrthogonal: Int = 0

    val LightDirectionalShadowParallel2Splits: Int = 1

    val LightDirectionalShadowParallel4Splits: Int = 2

    val LightOmni: Int = 1

    val LightOmniShadowCube: Int = 1

    val LightOmniShadowDetailHorizontal: Int = 1

    val LightOmniShadowDetailVertical: Int = 0

    val LightOmniShadowDualParaboloid: Int = 0

    val LightParamAttenuation: Int = 4

    val LightParamContactShadowSize: Int = 7

    val LightParamEnergy: Int = 0

    val LightParamMax: Int = 15

    val LightParamRange: Int = 3

    val LightParamShadowBias: Int = 13

    val LightParamShadowBiasSplitScale: Int = 14

    val LightParamShadowMaxDistance: Int = 8

    val LightParamShadowNormalBias: Int = 12

    val LightParamShadowSplit1Offset: Int = 9

    val LightParamShadowSplit2Offset: Int = 10

    val LightParamShadowSplit3Offset: Int = 11

    val LightParamSpecular: Int = 2

    val LightParamSpotAngle: Int = 5

    val LightParamSpotAttenuation: Int = 6

    val LightSpot: Int = 2

    val MaterialRenderPriorityMax: Int = 127

    val MaterialRenderPriorityMin: Int = -128

    val MaxCursors: Int = 8

    val MaxGlowLevels: Int = 7

    val MultimeshColor8bit: Int = 1

    val MultimeshColorFloat: Int = 2

    val MultimeshColorNone: Int = 0

    val MultimeshCustomData8bit: Int = 1

    val MultimeshCustomDataFloat: Int = 2

    val MultimeshCustomDataNone: Int = 0

    val MultimeshTransform2d: Int = 0

    val MultimeshTransform3d: Int = 1

    val NinePatchStretch: Int = 0

    val NinePatchTile: Int = 1

    val NinePatchTileFit: Int = 2

    val NoIndexArray: Int = -1

    val ParticlesDrawOrderIndex: Int = 0

    val ParticlesDrawOrderLifetime: Int = 1

    val ParticlesDrawOrderViewDepth: Int = 2

    val PrimitiveLines: Int = 1

    val PrimitiveLineLoop: Int = 3

    val PrimitiveLineStrip: Int = 2

    val PrimitiveMax: Int = 7

    val PrimitivePoints: Int = 0

    val PrimitiveTriangles: Int = 4

    val PrimitiveTriangleFan: Int = 6

    val PrimitiveTriangleStrip: Int = 5

    val ReflectionProbeUpdateAlways: Int = 1

    val ReflectionProbeUpdateOnce: Int = 0

    val ScenarioDebugDisabled: Int = 0

    val ScenarioDebugOverdraw: Int = 2

    val ScenarioDebugShadeless: Int = 3

    val ScenarioDebugWireframe: Int = 1

    val ShaderCanvasItem: Int = 1

    val ShaderMax: Int = 3

    val ShaderParticles: Int = 2

    val ShaderSpatial: Int = 0

    val ShadowCastingSettingDoubleSided: Int = 2

    val ShadowCastingSettingOff: Int = 0

    val ShadowCastingSettingOn: Int = 1

    val ShadowCastingSettingShadowsOnly: Int = 3

    val TextureFlagsDefault: Int = 7

    val TextureFlagAnisotropicFilter: Int = 8

    val TextureFlagConvertToLinear: Int = 16

    val TextureFlagFilter: Int = 4

    val TextureFlagMipmaps: Int = 1

    val TextureFlagMirroredRepeat: Int = 32

    val TextureFlagRepeat: Int = 2

    val TextureFlagUsedForStreaming: Int = 2048

    val TextureType2d: Int = 0

    val TextureType2dArray: Int = 2

    val TextureType3d: Int = 3

    val TextureTypeCubemap: Int = 1

    val ViewportClearAlways: Int = 0

    val ViewportClearNever: Int = 1

    val ViewportClearOnlyNextFrame: Int = 2

    val ViewportDebugDrawDisabled: Int = 0

    val ViewportDebugDrawOverdraw: Int = 2

    val ViewportDebugDrawUnshaded: Int = 1

    val ViewportDebugDrawWireframe: Int = 3

    val ViewportMsaa16x: Int = 4

    val ViewportMsaa2x: Int = 1

    val ViewportMsaa4x: Int = 2

    val ViewportMsaa8x: Int = 3

    val ViewportMsaaDisabled: Int = 0

    val ViewportRenderInfoDrawCallsInFrame: Int = 5

    val ViewportRenderInfoMaterialChangesInFrame: Int = 2

    val ViewportRenderInfoMax: Int = 6

    val ViewportRenderInfoObjectsInFrame: Int = 0

    val ViewportRenderInfoShaderChangesInFrame: Int = 3

    val ViewportRenderInfoSurfaceChangesInFrame: Int = 4

    val ViewportRenderInfoVerticesInFrame: Int = 1

    val ViewportUpdateAlways: Int = 3

    val ViewportUpdateDisabled: Int = 0

    val ViewportUpdateOnce: Int = 1

    val ViewportUpdateWhenVisible: Int = 2

    val ViewportUsage2d: Int = 0

    val ViewportUsage2dNoSampling: Int = 1

    val ViewportUsage3d: Int = 2

    val ViewportUsage3dNoEffects: Int = 3
  }
}
