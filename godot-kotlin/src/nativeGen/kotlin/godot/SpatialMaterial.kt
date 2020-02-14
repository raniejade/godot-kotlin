// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class SpatialMaterial(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Material(null) {
  var albedoColor: Color
    get() {
       return getAlbedo() 
    }
    set(value) {
      setAlbedo(value)
    }

  var albedoTexture: Texture
    get() {
       return getTexture(0) 
    }
    set(value) {
      setTexture(0, value)
    }

  var anisotropy: Float
    get() {
       return getAnisotropy() 
    }
    set(value) {
      setAnisotropy(value)
    }

  var anisotropyEnabled: Boolean
    get() {
       return getFeature(5) 
    }
    set(value) {
      setFeature(5, value)
    }

  var anisotropyFlowmap: Texture
    get() {
       return getTexture(7) 
    }
    set(value) {
      setTexture(7, value)
    }

  var aoEnabled: Boolean
    get() {
       return getFeature(6) 
    }
    set(value) {
      setFeature(6, value)
    }

  var aoLightAffect: Float
    get() {
       return getAoLightAffect() 
    }
    set(value) {
      setAoLightAffect(value)
    }

  var aoOnUv2: Boolean
    get() {
       return getFlag(11) 
    }
    set(value) {
      setFlag(11, value)
    }

  var aoTexture: Texture
    get() {
       return getTexture(8) 
    }
    set(value) {
      setTexture(8, value)
    }

  var aoTextureChannel: TextureChannel
    get() {
       return getAoTextureChannel() 
    }
    set(value) {
      setAoTextureChannel(value.value)
    }

  var clearcoat: Float
    get() {
       return getClearcoat() 
    }
    set(value) {
      setClearcoat(value)
    }

  var clearcoatEnabled: Boolean
    get() {
       return getFeature(4) 
    }
    set(value) {
      setFeature(4, value)
    }

  var clearcoatGloss: Float
    get() {
       return getClearcoatGloss() 
    }
    set(value) {
      setClearcoatGloss(value)
    }

  var clearcoatTexture: Texture
    get() {
       return getTexture(6) 
    }
    set(value) {
      setTexture(6, value)
    }

  var depthDeepParallax: Boolean
    get() {
       return isDepthDeepParallaxEnabled() 
    }
    set(value) {
      setDepthDeepParallax(value)
    }

  var depthEnabled: Boolean
    get() {
       return getFeature(7) 
    }
    set(value) {
      setFeature(7, value)
    }

  var depthFlipBinormal: Boolean
    get() {
       return getDepthDeepParallaxFlipBinormal() 
    }
    set(value) {
      setDepthDeepParallaxFlipBinormal(value)
    }

  var depthFlipTangent: Boolean
    get() {
       return getDepthDeepParallaxFlipTangent() 
    }
    set(value) {
      setDepthDeepParallaxFlipTangent(value)
    }

  var depthMaxLayers: Int
    get() {
       return getDepthDeepParallaxMaxLayers() 
    }
    set(value) {
      setDepthDeepParallaxMaxLayers(value)
    }

  var depthMinLayers: Int
    get() {
       return getDepthDeepParallaxMinLayers() 
    }
    set(value) {
      setDepthDeepParallaxMinLayers(value)
    }

  var depthScale: Float
    get() {
       return getDepthScale() 
    }
    set(value) {
      setDepthScale(value)
    }

  var depthTexture: Texture
    get() {
       return getTexture(9) 
    }
    set(value) {
      setTexture(9, value)
    }

  var detailAlbedo: Texture
    get() {
       return getTexture(14) 
    }
    set(value) {
      setTexture(14, value)
    }

  var detailBlendMode: BlendMode
    get() {
       return getDetailBlendMode() 
    }
    set(value) {
      setDetailBlendMode(value.value)
    }

  var detailEnabled: Boolean
    get() {
       return getFeature(11) 
    }
    set(value) {
      setFeature(11, value)
    }

  var detailMask: Texture
    get() {
       return getTexture(13) 
    }
    set(value) {
      setTexture(13, value)
    }

  var detailNormal: Texture
    get() {
       return getTexture(15) 
    }
    set(value) {
      setTexture(15, value)
    }

  var detailUvLayer: DetailUV
    get() {
       return getDetailUv() 
    }
    set(value) {
      setDetailUv(value.value)
    }

  var distanceFadeMaxDistance: Float
    get() {
       return getDistanceFadeMaxDistance() 
    }
    set(value) {
      setDistanceFadeMaxDistance(value)
    }

  var distanceFadeMinDistance: Float
    get() {
       return getDistanceFadeMinDistance() 
    }
    set(value) {
      setDistanceFadeMinDistance(value)
    }

  var distanceFadeMode: DistanceFadeMode
    get() {
       return getDistanceFade() 
    }
    set(value) {
      setDistanceFade(value.value)
    }

  var emission: Color
    get() {
       return getEmission() 
    }
    set(value) {
      setEmission(value)
    }

  var emissionEnabled: Boolean
    get() {
       return getFeature(1) 
    }
    set(value) {
      setFeature(1, value)
    }

  var emissionEnergy: Float
    get() {
       return getEmissionEnergy() 
    }
    set(value) {
      setEmissionEnergy(value)
    }

  var emissionOnUv2: Boolean
    get() {
       return getFlag(12) 
    }
    set(value) {
      setFlag(12, value)
    }

  var emissionOperator: EmissionOperator
    get() {
       return getEmissionOperator() 
    }
    set(value) {
      setEmissionOperator(value.value)
    }

  var emissionTexture: Texture
    get() {
       return getTexture(3) 
    }
    set(value) {
      setTexture(3, value)
    }

  var flagsAlbedoTexForceSrgb: Boolean
    get() {
       return getFlag(14) 
    }
    set(value) {
      setFlag(14, value)
    }

  var flagsDisableAmbientLight: Boolean
    get() {
       return getFlag(17) 
    }
    set(value) {
      setFlag(17, value)
    }

  var flagsDoNotReceiveShadows: Boolean
    get() {
       return getFlag(15) 
    }
    set(value) {
      setFlag(15, value)
    }

  var flagsEnsureCorrectNormals: Boolean
    get() {
       return getFlag(16) 
    }
    set(value) {
      setFlag(16, value)
    }

  var flagsFixedSize: Boolean
    get() {
       return getFlag(6) 
    }
    set(value) {
      setFlag(6, value)
    }

  var flagsNoDepthTest: Boolean
    get() {
       return getFlag(2) 
    }
    set(value) {
      setFlag(2, value)
    }

  var flagsTransparent: Boolean
    get() {
       return getFeature(0) 
    }
    set(value) {
      setFeature(0, value)
    }

  var flagsUnshaded: Boolean
    get() {
       return getFlag(0) 
    }
    set(value) {
      setFlag(0, value)
    }

  var flagsUsePointSize: Boolean
    get() {
       return getFlag(5) 
    }
    set(value) {
      setFlag(5, value)
    }

  var flagsUseShadowToOpacity: Boolean
    get() {
       return getFlag(18) 
    }
    set(value) {
      setFlag(18, value)
    }

  var flagsVertexLighting: Boolean
    get() {
       return getFlag(1) 
    }
    set(value) {
      setFlag(1, value)
    }

  var flagsWorldTriplanar: Boolean
    get() {
       return getFlag(10) 
    }
    set(value) {
      setFlag(10, value)
    }

  var metallic: Float
    get() {
       return getMetallic() 
    }
    set(value) {
      setMetallic(value)
    }

  var metallicSpecular: Float
    get() {
       return getSpecular() 
    }
    set(value) {
      setSpecular(value)
    }

  var metallicTexture: Texture
    get() {
       return getTexture(1) 
    }
    set(value) {
      setTexture(1, value)
    }

  var metallicTextureChannel: TextureChannel
    get() {
       return getMetallicTextureChannel() 
    }
    set(value) {
      setMetallicTextureChannel(value.value)
    }

  var normalEnabled: Boolean
    get() {
       return getFeature(2) 
    }
    set(value) {
      setFeature(2, value)
    }

  var normalScale: Float
    get() {
       return getNormalScale() 
    }
    set(value) {
      setNormalScale(value)
    }

  var normalTexture: Texture
    get() {
       return getTexture(4) 
    }
    set(value) {
      setTexture(4, value)
    }

  var paramsAlphaScissorThreshold: Float
    get() {
       return getAlphaScissorThreshold() 
    }
    set(value) {
      setAlphaScissorThreshold(value)
    }

  var paramsBillboardKeepScale: Boolean
    get() {
       return getFlag(7) 
    }
    set(value) {
      setFlag(7, value)
    }

  var paramsBillboardMode: BillboardMode
    get() {
       return getBillboardMode() 
    }
    set(value) {
      setBillboardMode(value.value)
    }

  var paramsBlendMode: BlendMode
    get() {
       return getBlendMode() 
    }
    set(value) {
      setBlendMode(value.value)
    }

  var paramsCullMode: CullMode
    get() {
       return getCullMode() 
    }
    set(value) {
      setCullMode(value.value)
    }

  var paramsDepthDrawMode: DepthDrawMode
    get() {
       return getDepthDrawMode() 
    }
    set(value) {
      setDepthDrawMode(value.value)
    }

  var paramsDiffuseMode: DiffuseMode
    get() {
       return getDiffuseMode() 
    }
    set(value) {
      setDiffuseMode(value.value)
    }

  var paramsGrow: Boolean
    get() {
       return isGrowEnabled() 
    }
    set(value) {
      setGrowEnabled(value)
    }

  var paramsGrowAmount: Float
    get() {
       return getGrow() 
    }
    set(value) {
      setGrow(value)
    }

  var paramsLineWidth: Float
    get() {
       return getLineWidth() 
    }
    set(value) {
      setLineWidth(value)
    }

  var paramsPointSize: Float
    get() {
       return getPointSize() 
    }
    set(value) {
      setPointSize(value)
    }

  var paramsSpecularMode: SpecularMode
    get() {
       return getSpecularMode() 
    }
    set(value) {
      setSpecularMode(value.value)
    }

  var paramsUseAlphaScissor: Boolean
    get() {
       return getFlag(13) 
    }
    set(value) {
      setFlag(13, value)
    }

  var particlesAnimHFrames: Int
    get() {
       return getParticlesAnimHFrames() 
    }
    set(value) {
      setParticlesAnimHFrames(value)
    }

  var particlesAnimLoop: Boolean
    get() {
       return getParticlesAnimLoop() 
    }
    set(value) {
      setParticlesAnimLoop(value)
    }

  var particlesAnimVFrames: Int
    get() {
       return getParticlesAnimVFrames() 
    }
    set(value) {
      setParticlesAnimVFrames(value)
    }

  var proximityFadeDistance: Float
    get() {
       return getProximityFadeDistance() 
    }
    set(value) {
      setProximityFadeDistance(value)
    }

  var proximityFadeEnable: Boolean
    get() {
       return isProximityFadeEnabled() 
    }
    set(value) {
      setProximityFade(value)
    }

  var refractionEnabled: Boolean
    get() {
       return getFeature(10) 
    }
    set(value) {
      setFeature(10, value)
    }

  var refractionScale: Float
    get() {
       return getRefraction() 
    }
    set(value) {
      setRefraction(value)
    }

  var refractionTexture: Texture
    get() {
       return getTexture(12) 
    }
    set(value) {
      setTexture(12, value)
    }

  var refractionTextureChannel: TextureChannel
    get() {
       return getRefractionTextureChannel() 
    }
    set(value) {
      setRefractionTextureChannel(value.value)
    }

  var rim: Float
    get() {
       return getRim() 
    }
    set(value) {
      setRim(value)
    }

  var rimEnabled: Boolean
    get() {
       return getFeature(3) 
    }
    set(value) {
      setFeature(3, value)
    }

  var rimTexture: Texture
    get() {
       return getTexture(5) 
    }
    set(value) {
      setTexture(5, value)
    }

  var rimTint: Float
    get() {
       return getRimTint() 
    }
    set(value) {
      setRimTint(value)
    }

  var roughness: Float
    get() {
       return getRoughness() 
    }
    set(value) {
      setRoughness(value)
    }

  var roughnessTexture: Texture
    get() {
       return getTexture(2) 
    }
    set(value) {
      setTexture(2, value)
    }

  var roughnessTextureChannel: TextureChannel
    get() {
       return getRoughnessTextureChannel() 
    }
    set(value) {
      setRoughnessTextureChannel(value.value)
    }

  var subsurfScatterEnabled: Boolean
    get() {
       return getFeature(8) 
    }
    set(value) {
      setFeature(8, value)
    }

  var subsurfScatterStrength: Float
    get() {
       return getSubsurfaceScatteringStrength() 
    }
    set(value) {
      setSubsurfaceScatteringStrength(value)
    }

  var subsurfScatterTexture: Texture
    get() {
       return getTexture(10) 
    }
    set(value) {
      setTexture(10, value)
    }

  var transmission: Color
    get() {
       return getTransmission() 
    }
    set(value) {
      setTransmission(value)
    }

  var transmissionEnabled: Boolean
    get() {
       return getFeature(9) 
    }
    set(value) {
      setFeature(9, value)
    }

  var transmissionTexture: Texture
    get() {
       return getTexture(11) 
    }
    set(value) {
      setTexture(11, value)
    }

  var uv1Offset: Vector3
    get() {
       return getUv1Offset() 
    }
    set(value) {
      setUv1Offset(value)
    }

  var uv1Scale: Vector3
    get() {
       return getUv1Scale() 
    }
    set(value) {
      setUv1Scale(value)
    }

  var uv1Triplanar: Boolean
    get() {
       return getFlag(8) 
    }
    set(value) {
      setFlag(8, value)
    }

  var uv1TriplanarSharpness: Float
    get() {
       return getUv1TriplanarBlendSharpness() 
    }
    set(value) {
      setUv1TriplanarBlendSharpness(value)
    }

  var uv2Offset: Vector3
    get() {
       return getUv2Offset() 
    }
    set(value) {
      setUv2Offset(value)
    }

  var uv2Scale: Vector3
    get() {
       return getUv2Scale() 
    }
    set(value) {
      setUv2Scale(value)
    }

  var uv2Triplanar: Boolean
    get() {
       return getFlag(9) 
    }
    set(value) {
      setFlag(9, value)
    }

  var uv2TriplanarSharpness: Float
    get() {
       return getUv2TriplanarBlendSharpness() 
    }
    set(value) {
      setUv2TriplanarBlendSharpness(value)
    }

  var vertexColorIsSrgb: Boolean
    get() {
       return getFlag(4) 
    }
    set(value) {
      setFlag(4, value)
    }

  var vertexColorUseAsAlbedo: Boolean
    get() {
       return getFlag(3) 
    }
    set(value) {
      setFlag(3, value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for albedoColor
   */
  fun albedoColor(cb: Color.() -> Unit) {
    val _p = albedoColor
    cb(_p)
    albedoColor = _p
  }

  /**
   * Specialized setter for emission
   */
  fun emission(cb: Color.() -> Unit) {
    val _p = emission
    cb(_p)
    emission = _p
  }

  /**
   * Specialized setter for transmission
   */
  fun transmission(cb: Color.() -> Unit) {
    val _p = transmission
    cb(_p)
    transmission = _p
  }

  /**
   * Specialized setter for uv1Offset
   */
  fun uv1Offset(cb: Vector3.() -> Unit) {
    val _p = uv1Offset
    cb(_p)
    uv1Offset = _p
  }

  /**
   * Specialized setter for uv1Scale
   */
  fun uv1Scale(cb: Vector3.() -> Unit) {
    val _p = uv1Scale
    cb(_p)
    uv1Scale = _p
  }

  /**
   * Specialized setter for uv2Offset
   */
  fun uv2Offset(cb: Vector3.() -> Unit) {
    val _p = uv2Offset
    cb(_p)
    uv2Offset = _p
  }

  /**
   * Specialized setter for uv2Scale
   */
  fun uv2Scale(cb: Vector3.() -> Unit) {
    val _p = uv2Scale
    cb(_p)
    uv2Scale = _p
  }

  fun getAlbedo(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getAlbedo.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getAlphaScissorThreshold(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAlphaScissorThreshold.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAnisotropy(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAnisotropy.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAoLightAffect(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAoLightAffect.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAoTextureChannel(): TextureChannel {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAoTextureChannel.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.TextureChannel.from(_ret.value)
    }
  }

  fun getBillboardMode(): BillboardMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBillboardMode.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.BillboardMode.from(_ret.value)
    }
  }

  fun getBlendMode(): BlendMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBlendMode.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.BlendMode.from(_ret.value)
    }
  }

  fun getClearcoat(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getClearcoat.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getClearcoatGloss(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getClearcoatGloss.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getCullMode(): CullMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCullMode.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.CullMode.from(_ret.value)
    }
  }

  fun getDepthDeepParallaxFlipBinormal(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDepthDeepParallaxFlipBinormal.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getDepthDeepParallaxFlipTangent(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDepthDeepParallaxFlipTangent.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getDepthDeepParallaxMaxLayers(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDepthDeepParallaxMaxLayers.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getDepthDeepParallaxMinLayers(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDepthDeepParallaxMinLayers.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getDepthDrawMode(): DepthDrawMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDepthDrawMode.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.DepthDrawMode.from(_ret.value)
    }
  }

  fun getDepthScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDepthScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDetailBlendMode(): BlendMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDetailBlendMode.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.BlendMode.from(_ret.value)
    }
  }

  fun getDetailUv(): DetailUV {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDetailUv.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.DetailUV.from(_ret.value)
    }
  }

  fun getDiffuseMode(): DiffuseMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDiffuseMode.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.DiffuseMode.from(_ret.value)
    }
  }

  fun getDistanceFade(): DistanceFadeMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDistanceFade.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.DistanceFadeMode.from(_ret.value)
    }
  }

  fun getDistanceFadeMaxDistance(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDistanceFadeMaxDistance.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDistanceFadeMinDistance(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDistanceFadeMinDistance.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getEmission(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getEmission.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getEmissionEnergy(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEmissionEnergy.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getEmissionOperator(): EmissionOperator {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEmissionOperator.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.EmissionOperator.from(_ret.value)
    }
  }

  fun getFeature(feature: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFeature.call(self._handle, listOf(feature), _retPtr)
      _ret.value
    }
  }

  fun getFlag(flag: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFlag.call(self._handle, listOf(flag), _retPtr)
      _ret.value
    }
  }

  fun getGrow(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGrow.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getLineWidth(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLineWidth.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMetallic(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMetallic.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMetallicTextureChannel(): TextureChannel {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMetallicTextureChannel.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.TextureChannel.from(_ret.value)
    }
  }

  fun getNormalScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNormalScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getParticlesAnimHFrames(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getParticlesAnimHFrames.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getParticlesAnimLoop(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getParticlesAnimLoop.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getParticlesAnimVFrames(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getParticlesAnimVFrames.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPointSize(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPointSize.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getProximityFadeDistance(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getProximityFadeDistance.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRefraction(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRefraction.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRefractionTextureChannel(): TextureChannel {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRefractionTextureChannel.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.TextureChannel.from(_ret.value)
    }
  }

  fun getRim(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRim.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRimTint(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRimTint.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRoughness(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRoughness.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRoughnessTextureChannel(): TextureChannel {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRoughnessTextureChannel.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.TextureChannel.from(_ret.value)
    }
  }

  fun getSpecular(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpecular.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSpecularMode(): SpecularMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpecularMode.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.SpecularMode.from(_ret.value)
    }
  }

  fun getSubsurfaceScatteringStrength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSubsurfaceScatteringStrength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTexture(param: Int): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTexture.call(self._handle, listOf(param), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getTransmission(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getTransmission.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUv1Offset(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getUv1Offset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUv1Scale(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getUv1Scale.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUv1TriplanarBlendSharpness(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUv1TriplanarBlendSharpness.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getUv2Offset(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getUv2Offset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUv2Scale(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getUv2Scale.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUv2TriplanarBlendSharpness(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUv2TriplanarBlendSharpness.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isDepthDeepParallaxEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDepthDeepParallaxEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isGrowEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isGrowEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isProximityFadeEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isProximityFadeEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAlbedo(albedo: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAlbedo.call(self._handle, listOf(albedo), null)
    }
  }

  fun setAlphaScissorThreshold(threshold: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAlphaScissorThreshold.call(self._handle, listOf(threshold), null)
    }
  }

  fun setAnisotropy(anisotropy: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAnisotropy.call(self._handle, listOf(anisotropy), null)
    }
  }

  fun setAoLightAffect(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAoLightAffect.call(self._handle, listOf(amount), null)
    }
  }

  fun setAoTextureChannel(channel: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAoTextureChannel.call(self._handle, listOf(channel), null)
    }
  }

  fun setBillboardMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBillboardMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setBlendMode(blendMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBlendMode.call(self._handle, listOf(blendMode), null)
    }
  }

  fun setClearcoat(clearcoat: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setClearcoat.call(self._handle, listOf(clearcoat), null)
    }
  }

  fun setClearcoatGloss(clearcoatGloss: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setClearcoatGloss.call(self._handle, listOf(clearcoatGloss), null)
    }
  }

  fun setCullMode(cullMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCullMode.call(self._handle, listOf(cullMode), null)
    }
  }

  fun setDepthDeepParallax(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDepthDeepParallax.call(self._handle, listOf(enable), null)
    }
  }

  fun setDepthDeepParallaxFlipBinormal(flip: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDepthDeepParallaxFlipBinormal.call(self._handle, listOf(flip), null)
    }
  }

  fun setDepthDeepParallaxFlipTangent(flip: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDepthDeepParallaxFlipTangent.call(self._handle, listOf(flip), null)
    }
  }

  fun setDepthDeepParallaxMaxLayers(layer: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDepthDeepParallaxMaxLayers.call(self._handle, listOf(layer), null)
    }
  }

  fun setDepthDeepParallaxMinLayers(layer: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDepthDeepParallaxMinLayers.call(self._handle, listOf(layer), null)
    }
  }

  fun setDepthDrawMode(depthDrawMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDepthDrawMode.call(self._handle, listOf(depthDrawMode), null)
    }
  }

  fun setDepthScale(depthScale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDepthScale.call(self._handle, listOf(depthScale), null)
    }
  }

  fun setDetailBlendMode(detailBlendMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDetailBlendMode.call(self._handle, listOf(detailBlendMode), null)
    }
  }

  fun setDetailUv(detailUv: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDetailUv.call(self._handle, listOf(detailUv), null)
    }
  }

  fun setDiffuseMode(diffuseMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDiffuseMode.call(self._handle, listOf(diffuseMode), null)
    }
  }

  fun setDistanceFade(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDistanceFade.call(self._handle, listOf(mode), null)
    }
  }

  fun setDistanceFadeMaxDistance(distance: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDistanceFadeMaxDistance.call(self._handle, listOf(distance), null)
    }
  }

  fun setDistanceFadeMinDistance(distance: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDistanceFadeMinDistance.call(self._handle, listOf(distance), null)
    }
  }

  fun setEmission(emission: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmission.call(self._handle, listOf(emission), null)
    }
  }

  fun setEmissionEnergy(emissionEnergy: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionEnergy.call(self._handle, listOf(emissionEnergy), null)
    }
  }

  fun setEmissionOperator(operator: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmissionOperator.call(self._handle, listOf(operator), null)
    }
  }

  fun setFeature(feature: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(feature)
      _args.add(enable)
      __method_bind.setFeature.call(self._handle, _args, null)
    }
  }

  fun setFlag(flag: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(flag)
      _args.add(enable)
      __method_bind.setFlag.call(self._handle, _args, null)
    }
  }

  fun setGrow(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGrow.call(self._handle, listOf(amount), null)
    }
  }

  fun setGrowEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGrowEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun setLineWidth(lineWidth: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLineWidth.call(self._handle, listOf(lineWidth), null)
    }
  }

  fun setMetallic(metallic: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMetallic.call(self._handle, listOf(metallic), null)
    }
  }

  fun setMetallicTextureChannel(channel: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMetallicTextureChannel.call(self._handle, listOf(channel), null)
    }
  }

  fun setNormalScale(normalScale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNormalScale.call(self._handle, listOf(normalScale), null)
    }
  }

  fun setParticlesAnimHFrames(frames: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setParticlesAnimHFrames.call(self._handle, listOf(frames), null)
    }
  }

  fun setParticlesAnimLoop(loop: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setParticlesAnimLoop.call(self._handle, listOf(loop), null)
    }
  }

  fun setParticlesAnimVFrames(frames: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setParticlesAnimVFrames.call(self._handle, listOf(frames), null)
    }
  }

  fun setPointSize(pointSize: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPointSize.call(self._handle, listOf(pointSize), null)
    }
  }

  fun setProximityFade(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProximityFade.call(self._handle, listOf(enabled), null)
    }
  }

  fun setProximityFadeDistance(distance: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProximityFadeDistance.call(self._handle, listOf(distance), null)
    }
  }

  fun setRefraction(refraction: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRefraction.call(self._handle, listOf(refraction), null)
    }
  }

  fun setRefractionTextureChannel(channel: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRefractionTextureChannel.call(self._handle, listOf(channel), null)
    }
  }

  fun setRim(rim: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRim.call(self._handle, listOf(rim), null)
    }
  }

  fun setRimTint(rimTint: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRimTint.call(self._handle, listOf(rimTint), null)
    }
  }

  fun setRoughness(roughness: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRoughness.call(self._handle, listOf(roughness), null)
    }
  }

  fun setRoughnessTextureChannel(channel: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRoughnessTextureChannel.call(self._handle, listOf(channel), null)
    }
  }

  fun setSpecular(specular: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpecular.call(self._handle, listOf(specular), null)
    }
  }

  fun setSpecularMode(specularMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpecularMode.call(self._handle, listOf(specularMode), null)
    }
  }

  fun setSubsurfaceScatteringStrength(strength: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSubsurfaceScatteringStrength.call(self._handle, listOf(strength), null)
    }
  }

  fun setTexture(param: Int, texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(param)
      _args.add(texture)
      __method_bind.setTexture.call(self._handle, _args, null)
    }
  }

  fun setTransmission(transmission: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTransmission.call(self._handle, listOf(transmission), null)
    }
  }

  fun setUv1Offset(offset: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUv1Offset.call(self._handle, listOf(offset), null)
    }
  }

  fun setUv1Scale(scale: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUv1Scale.call(self._handle, listOf(scale), null)
    }
  }

  fun setUv1TriplanarBlendSharpness(sharpness: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUv1TriplanarBlendSharpness.call(self._handle, listOf(sharpness), null)
    }
  }

  fun setUv2Offset(offset: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUv2Offset.call(self._handle, listOf(offset), null)
    }
  }

  fun setUv2Scale(scale: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUv2Scale.call(self._handle, listOf(scale), null)
    }
  }

  fun setUv2TriplanarBlendSharpness(sharpness: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUv2TriplanarBlendSharpness.call(self._handle, listOf(sharpness), null)
    }
  }

  enum class EmissionOperator(
    val value: Int
  ) {
    OP_ADD(0),

    OP_MULTIPLY(1);

    companion object {
      fun from(value: Int): EmissionOperator {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DiffuseMode(
    val value: Int
  ) {
    BURLEY(0),

    LAMBERT(1),

    LAMBERT_WRAP(2),

    OREN_NAYAR(3),

    TOON(4);

    companion object {
      fun from(value: Int): DiffuseMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class SpecularMode(
    val value: Int
  ) {
    SCHLICK_GGX(0),

    BLINN(1),

    PHONG(2),

    TOON(3),

    DISABLED(4);

    companion object {
      fun from(value: Int): SpecularMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Feature(
    val value: Int
  ) {
    TRANSPARENT(0),

    EMISSION(1),

    NORMAL_MAPPING(2),

    RIM(3),

    CLEARCOAT(4),

    ANISOTROPY(5),

    AMBIENT_OCCLUSION(6),

    DEPTH_MAPPING(7),

    SUBSURACE_SCATTERING(8),

    TRANSMISSION(9),

    REFRACTION(10),

    DETAIL(11),

    MAX(12);

    companion object {
      fun from(value: Int): Feature {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
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

    companion object {
      fun from(value: Int): Flags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class CullMode(
    val value: Int
  ) {
    BACK(0),

    FRONT(1),

    DISABLED(2);

    companion object {
      fun from(value: Int): CullMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DetailUV(
    val value: Int
  ) {
    `1`(0),

    `2`(1);

    companion object {
      fun from(value: Int): DetailUV {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DistanceFadeMode(
    val value: Int
  ) {
    DISABLED(0),

    PIXEL_ALPHA(1),

    PIXEL_DITHER(2),

    OBJECT_DITHER(3);

    companion object {
      fun from(value: Int): DistanceFadeMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class BillboardMode(
    val value: Int
  ) {
    DISABLED(0),

    ENABLED(1),

    FIXED_Y(2),

    PARTICLES(3);

    companion object {
      fun from(value: Int): BillboardMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DepthDrawMode(
    val value: Int
  ) {
    OPAQUE_ONLY(0),

    ALWAYS(1),

    DISABLED(2),

    ALPHA_OPAQUE_PREPASS(3);

    companion object {
      fun from(value: Int): DepthDrawMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class TextureChannel(
    val value: Int
  ) {
    RED(0),

    GREEN(1),

    BLUE(2),

    ALPHA(3),

    GRAYSCALE(4);

    companion object {
      fun from(value: Int): TextureChannel {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class BlendMode(
    val value: Int
  ) {
    MIX(0),

    ADD(1),

    SUB(2),

    MUL(3);

    companion object {
      fun from(value: Int): BlendMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class TextureParam(
    val value: Int
  ) {
    ALBEDO(0),

    METALLIC(1),

    ROUGHNESS(2),

    EMISSION(3),

    NORMAL(4),

    RIM(5),

    CLEARCOAT(6),

    FLOWMAP(7),

    AMBIENT_OCCLUSION(8),

    DEPTH(9),

    SUBSURFACE_SCATTERING(10),

    TRANSMISSION(11),

    REFRACTION(12),

    DETAIL_MASK(13),

    DETAIL_ALBEDO(14),

    DETAIL_NORMAL(15),

    MAX(16);

    companion object {
      fun from(value: Int): TextureParam {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpatialMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SpatialMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SpatialMaterial
     */
    private object __method_bind {
      val getAlbedo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_albedo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_albedo" }
        }
      val getAlphaScissorThreshold: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_alpha_scissor_threshold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_alpha_scissor_threshold" }
        }
      val getAnisotropy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_anisotropy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_anisotropy" }
        }
      val getAoLightAffect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_ao_light_affect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ao_light_affect" }
        }
      val getAoTextureChannel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_ao_texture_channel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ao_texture_channel" }
        }
      val getBillboardMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_billboard_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_billboard_mode" }
        }
      val getBlendMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_blend_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_mode" }
        }
      val getClearcoat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_clearcoat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_clearcoat" }
        }
      val getClearcoatGloss: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_clearcoat_gloss".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_clearcoat_gloss" }
        }
      val getCullMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_cull_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cull_mode" }
        }
      val getDepthDeepParallaxFlipBinormal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_depth_deep_parallax_flip_binormal".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_depth_deep_parallax_flip_binormal" }
        }
      val getDepthDeepParallaxFlipTangent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_depth_deep_parallax_flip_tangent".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_depth_deep_parallax_flip_tangent" }
        }
      val getDepthDeepParallaxMaxLayers: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_depth_deep_parallax_max_layers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_depth_deep_parallax_max_layers"
            }
        }
      val getDepthDeepParallaxMinLayers: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_depth_deep_parallax_min_layers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_depth_deep_parallax_min_layers"
            }
        }
      val getDepthDrawMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_depth_draw_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_depth_draw_mode" }
        }
      val getDepthScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_depth_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_depth_scale" }
        }
      val getDetailBlendMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_detail_blend_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_detail_blend_mode" }
        }
      val getDetailUv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_detail_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_detail_uv" }
        }
      val getDiffuseMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_diffuse_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_diffuse_mode" }
        }
      val getDistanceFade: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_distance_fade".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_distance_fade" }
        }
      val getDistanceFadeMaxDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_distance_fade_max_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_distance_fade_max_distance" }
        }
      val getDistanceFadeMinDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_distance_fade_min_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_distance_fade_min_distance" }
        }
      val getEmission: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_emission".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission" }
        }
      val getEmissionEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_emission_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_energy" }
        }
      val getEmissionOperator: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_emission_operator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_emission_operator" }
        }
      val getFeature: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_feature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feature" }
        }
      val getFlag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flag" }
        }
      val getGrow: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_grow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_grow" }
        }
      val getLineWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_line_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line_width" }
        }
      val getMetallic: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_metallic".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_metallic" }
        }
      val getMetallicTextureChannel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_metallic_texture_channel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_metallic_texture_channel" }
        }
      val getNormalScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_normal_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_normal_scale" }
        }
      val getParticlesAnimHFrames: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_particles_anim_h_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_particles_anim_h_frames" }
        }
      val getParticlesAnimLoop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_particles_anim_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_particles_anim_loop" }
        }
      val getParticlesAnimVFrames: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_particles_anim_v_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_particles_anim_v_frames" }
        }
      val getPointSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_point_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_size" }
        }
      val getProximityFadeDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_proximity_fade_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_proximity_fade_distance" }
        }
      val getRefraction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_refraction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_refraction" }
        }
      val getRefractionTextureChannel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_refraction_texture_channel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_refraction_texture_channel" }
        }
      val getRim: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_rim".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rim" }
        }
      val getRimTint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_rim_tint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rim_tint" }
        }
      val getRoughness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_roughness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_roughness" }
        }
      val getRoughnessTextureChannel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_roughness_texture_channel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_roughness_texture_channel" }
        }
      val getSpecular: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_specular".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_specular" }
        }
      val getSpecularMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_specular_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_specular_mode" }
        }
      val getSubsurfaceScatteringStrength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_subsurface_scattering_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subsurface_scattering_strength"
            }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getTransmission: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_transmission".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transmission" }
        }
      val getUv1Offset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_uv1_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_uv1_offset" }
        }
      val getUv1Scale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_uv1_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_uv1_scale" }
        }
      val getUv1TriplanarBlendSharpness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_uv1_triplanar_blend_sharpness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_uv1_triplanar_blend_sharpness"
            }
        }
      val getUv2Offset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_uv2_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_uv2_offset" }
        }
      val getUv2Scale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_uv2_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_uv2_scale" }
        }
      val getUv2TriplanarBlendSharpness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "get_uv2_triplanar_blend_sharpness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_uv2_triplanar_blend_sharpness"
            }
        }
      val isDepthDeepParallaxEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "is_depth_deep_parallax_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_depth_deep_parallax_enabled" }
        }
      val isGrowEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "is_grow_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_grow_enabled" }
        }
      val isProximityFadeEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "is_proximity_fade_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_proximity_fade_enabled" }
        }
      val setAlbedo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_albedo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_albedo" }
        }
      val setAlphaScissorThreshold: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_alpha_scissor_threshold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_alpha_scissor_threshold" }
        }
      val setAnisotropy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_anisotropy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anisotropy" }
        }
      val setAoLightAffect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_ao_light_affect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ao_light_affect" }
        }
      val setAoTextureChannel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_ao_texture_channel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ao_texture_channel" }
        }
      val setBillboardMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_billboard_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_billboard_mode" }
        }
      val setBlendMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_blend_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_mode" }
        }
      val setClearcoat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_clearcoat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clearcoat" }
        }
      val setClearcoatGloss: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_clearcoat_gloss".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clearcoat_gloss" }
        }
      val setCullMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_cull_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cull_mode" }
        }
      val setDepthDeepParallax: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_depth_deep_parallax".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_depth_deep_parallax" }
        }
      val setDepthDeepParallaxFlipBinormal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_depth_deep_parallax_flip_binormal".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_depth_deep_parallax_flip_binormal" }
        }
      val setDepthDeepParallaxFlipTangent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_depth_deep_parallax_flip_tangent".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_depth_deep_parallax_flip_tangent" }
        }
      val setDepthDeepParallaxMaxLayers: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_depth_deep_parallax_max_layers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_depth_deep_parallax_max_layers"
            }
        }
      val setDepthDeepParallaxMinLayers: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_depth_deep_parallax_min_layers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_depth_deep_parallax_min_layers"
            }
        }
      val setDepthDrawMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_depth_draw_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_depth_draw_mode" }
        }
      val setDepthScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_depth_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_depth_scale" }
        }
      val setDetailBlendMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_detail_blend_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_detail_blend_mode" }
        }
      val setDetailUv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_detail_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_detail_uv" }
        }
      val setDiffuseMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_diffuse_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_diffuse_mode" }
        }
      val setDistanceFade: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_distance_fade".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_distance_fade" }
        }
      val setDistanceFadeMaxDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_distance_fade_max_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_distance_fade_max_distance" }
        }
      val setDistanceFadeMinDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_distance_fade_min_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_distance_fade_min_distance" }
        }
      val setEmission: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_emission".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission" }
        }
      val setEmissionEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_emission_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_energy" }
        }
      val setEmissionOperator: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_emission_operator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emission_operator" }
        }
      val setFeature: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_feature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_feature" }
        }
      val setFlag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flag" }
        }
      val setGrow: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_grow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_grow" }
        }
      val setGrowEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_grow_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_grow_enabled" }
        }
      val setLineWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_line_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_line_width" }
        }
      val setMetallic: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_metallic".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_metallic" }
        }
      val setMetallicTextureChannel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_metallic_texture_channel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_metallic_texture_channel" }
        }
      val setNormalScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_normal_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normal_scale" }
        }
      val setParticlesAnimHFrames: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_particles_anim_h_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_particles_anim_h_frames" }
        }
      val setParticlesAnimLoop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_particles_anim_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_particles_anim_loop" }
        }
      val setParticlesAnimVFrames: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_particles_anim_v_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_particles_anim_v_frames" }
        }
      val setPointSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_point_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_size" }
        }
      val setProximityFade: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_proximity_fade".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_proximity_fade" }
        }
      val setProximityFadeDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_proximity_fade_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_proximity_fade_distance" }
        }
      val setRefraction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_refraction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_refraction" }
        }
      val setRefractionTextureChannel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_refraction_texture_channel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_refraction_texture_channel" }
        }
      val setRim: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_rim".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rim" }
        }
      val setRimTint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_rim_tint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rim_tint" }
        }
      val setRoughness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_roughness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_roughness" }
        }
      val setRoughnessTextureChannel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_roughness_texture_channel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_roughness_texture_channel" }
        }
      val setSpecular: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_specular".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_specular" }
        }
      val setSpecularMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_specular_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_specular_mode" }
        }
      val setSubsurfaceScatteringStrength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_subsurface_scattering_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_subsurface_scattering_strength"
            }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val setTransmission: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_transmission".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transmission" }
        }
      val setUv1Offset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_uv1_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uv1_offset" }
        }
      val setUv1Scale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_uv1_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uv1_scale" }
        }
      val setUv1TriplanarBlendSharpness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_uv1_triplanar_blend_sharpness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uv1_triplanar_blend_sharpness"
            }
        }
      val setUv2Offset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_uv2_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uv2_offset" }
        }
      val setUv2Scale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_uv2_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uv2_scale" }
        }
      val setUv2TriplanarBlendSharpness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "set_uv2_triplanar_blend_sharpness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uv2_triplanar_blend_sharpness"
            }
        }}
  }
}
