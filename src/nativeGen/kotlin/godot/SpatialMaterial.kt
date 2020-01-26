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
  companion object {
    val BillboardDisabled: Int = 0

    val BillboardEnabled: Int = 1

    val BillboardFixedY: Int = 2

    val BillboardParticles: Int = 3

    val BlendModeAdd: Int = 1

    val BlendModeMix: Int = 0

    val BlendModeMul: Int = 3

    val BlendModeSub: Int = 2

    val CullBack: Int = 0

    val CullDisabled: Int = 2

    val CullFront: Int = 1

    val DepthDrawAlphaOpaquePrepass: Int = 3

    val DepthDrawAlways: Int = 1

    val DepthDrawDisabled: Int = 2

    val DepthDrawOpaqueOnly: Int = 0

    val DetailUv1: Int = 0

    val DetailUv2: Int = 1

    val DiffuseBurley: Int = 0

    val DiffuseLambert: Int = 1

    val DiffuseLambertWrap: Int = 2

    val DiffuseOrenNayar: Int = 3

    val DiffuseToon: Int = 4

    val DistanceFadeDisabled: Int = 0

    val DistanceFadeObjectDither: Int = 3

    val DistanceFadePixelAlpha: Int = 1

    val DistanceFadePixelDither: Int = 2

    val EmissionOpAdd: Int = 0

    val EmissionOpMultiply: Int = 1

    val FeatureAmbientOcclusion: Int = 6

    val FeatureAnisotropy: Int = 5

    val FeatureClearcoat: Int = 4

    val FeatureDepthMapping: Int = 7

    val FeatureDetail: Int = 11

    val FeatureEmission: Int = 1

    val FeatureMax: Int = 12

    val FeatureNormalMapping: Int = 2

    val FeatureRefraction: Int = 10

    val FeatureRim: Int = 3

    val FeatureSubsuraceScattering: Int = 8

    val FeatureTransmission: Int = 9

    val FeatureTransparent: Int = 0

    val FlagAlbedoFromVertexColor: Int = 3

    val FlagAlbedoTextureForceSrgb: Int = 14

    val FlagAoOnUv2: Int = 11

    val FlagBillboardKeepScale: Int = 7

    val FlagDisableAmbientLight: Int = 17

    val FlagDisableDepthTest: Int = 2

    val FlagDontReceiveShadows: Int = 15

    val FlagEmissionOnUv2: Int = 12

    val FlagEnsureCorrectNormals: Int = 16

    val FlagFixedSize: Int = 6

    val FlagMax: Int = 19

    val FlagSrgbVertexColor: Int = 4

    val FlagTriplanarUseWorld: Int = 10

    val FlagUnshaded: Int = 0

    val FlagUseAlphaScissor: Int = 13

    val FlagUsePointSize: Int = 5

    val FlagUseShadowToOpacity: Int = 18

    val FlagUseVertexLighting: Int = 1

    val FlagUv1UseTriplanar: Int = 8

    val FlagUv2UseTriplanar: Int = 9

    val SpecularBlinn: Int = 1

    val SpecularDisabled: Int = 4

    val SpecularPhong: Int = 2

    val SpecularSchlickGgx: Int = 0

    val SpecularToon: Int = 3

    val TextureAlbedo: Int = 0

    val TextureAmbientOcclusion: Int = 8

    val TextureChannelAlpha: Int = 3

    val TextureChannelBlue: Int = 2

    val TextureChannelGrayscale: Int = 4

    val TextureChannelGreen: Int = 1

    val TextureChannelRed: Int = 0

    val TextureClearcoat: Int = 6

    val TextureDepth: Int = 9

    val TextureDetailAlbedo: Int = 14

    val TextureDetailMask: Int = 13

    val TextureDetailNormal: Int = 15

    val TextureEmission: Int = 3

    val TextureFlowmap: Int = 7

    val TextureMax: Int = 16

    val TextureMetallic: Int = 1

    val TextureNormal: Int = 4

    val TextureRefraction: Int = 12

    val TextureRim: Int = 5

    val TextureRoughness: Int = 2

    val TextureSubsurfaceScattering: Int = 10

    val TextureTransmission: Int = 11

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
