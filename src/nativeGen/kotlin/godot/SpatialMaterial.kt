// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SpatialMaterial(
  _handle: COpaquePointer
) : Material(_handle) {
  var albedoColor: Color
    get() {
       return getAlbedo() 
    }
    set(value) {
      setAlbedo(value)
    }

  var anisotropy: Float
    get() {
       return getAnisotropy() 
    }
    set(value) {
      setAnisotropy(value)
    }

  var aoLightAffect: Float
    get() {
       return getAoLightAffect() 
    }
    set(value) {
      setAoLightAffect(value)
    }

  var aoTextureChannel: Int
    get() {
       return SpatialMaterial.TextureChannel.from(getAoTextureChannel()) 
    }
    set(value) {
      setAoTextureChannel(SpatialMaterial.TextureChannel.from(value))
    }

  var clearcoat: Float
    get() {
       return getClearcoat() 
    }
    set(value) {
      setClearcoat(value)
    }

  var clearcoatGloss: Float
    get() {
       return getClearcoatGloss() 
    }
    set(value) {
      setClearcoatGloss(value)
    }

  var depthDeepParallax: Boolean
    get() {
       return isDepthDeepParallaxEnabled() 
    }
    set(value) {
      setDepthDeepParallax(value)
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

  var detailBlendMode: Int
    get() {
       return SpatialMaterial.BlendMode.from(getDetailBlendMode()) 
    }
    set(value) {
      setDetailBlendMode(SpatialMaterial.BlendMode.from(value))
    }

  var detailUvLayer: Int
    get() {
       return SpatialMaterial.DetailUV.from(getDetailUv()) 
    }
    set(value) {
      setDetailUv(SpatialMaterial.DetailUV.from(value))
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

  var distanceFadeMode: Int
    get() {
       return SpatialMaterial.DistanceFadeMode.from(getDistanceFade()) 
    }
    set(value) {
      setDistanceFade(SpatialMaterial.DistanceFadeMode.from(value))
    }

  var emission: Color
    get() {
       return getEmission() 
    }
    set(value) {
      setEmission(value)
    }

  var emissionEnergy: Float
    get() {
       return getEmissionEnergy() 
    }
    set(value) {
      setEmissionEnergy(value)
    }

  var emissionOperator: Int
    get() {
       return SpatialMaterial.EmissionOperator.from(getEmissionOperator()) 
    }
    set(value) {
      setEmissionOperator(SpatialMaterial.EmissionOperator.from(value))
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

  var metallicTextureChannel: Int
    get() {
       return SpatialMaterial.TextureChannel.from(getMetallicTextureChannel()) 
    }
    set(value) {
      setMetallicTextureChannel(SpatialMaterial.TextureChannel.from(value))
    }

  var normalScale: Float
    get() {
       return getNormalScale() 
    }
    set(value) {
      setNormalScale(value)
    }

  var paramsAlphaScissorThreshold: Float
    get() {
       return getAlphaScissorThreshold() 
    }
    set(value) {
      setAlphaScissorThreshold(value)
    }

  var paramsBillboardMode: Int
    get() {
       return SpatialMaterial.BillboardMode.from(getBillboardMode()) 
    }
    set(value) {
      setBillboardMode(SpatialMaterial.BillboardMode.from(value))
    }

  var paramsBlendMode: Int
    get() {
       return SpatialMaterial.BlendMode.from(getBlendMode()) 
    }
    set(value) {
      setBlendMode(SpatialMaterial.BlendMode.from(value))
    }

  var paramsCullMode: Int
    get() {
       return SpatialMaterial.CullMode.from(getCullMode()) 
    }
    set(value) {
      setCullMode(SpatialMaterial.CullMode.from(value))
    }

  var paramsDepthDrawMode: Int
    get() {
       return SpatialMaterial.DepthDrawMode.from(getDepthDrawMode()) 
    }
    set(value) {
      setDepthDrawMode(SpatialMaterial.DepthDrawMode.from(value))
    }

  var paramsDiffuseMode: Int
    get() {
       return SpatialMaterial.DiffuseMode.from(getDiffuseMode()) 
    }
    set(value) {
      setDiffuseMode(SpatialMaterial.DiffuseMode.from(value))
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

  var paramsSpecularMode: Int
    get() {
       return SpatialMaterial.SpecularMode.from(getSpecularMode()) 
    }
    set(value) {
      setSpecularMode(SpatialMaterial.SpecularMode.from(value))
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

  var refractionScale: Float
    get() {
       return getRefraction() 
    }
    set(value) {
      setRefraction(value)
    }

  var refractionTextureChannel: Int
    get() {
       return SpatialMaterial.TextureChannel.from(getRefractionTextureChannel()) 
    }
    set(value) {
      setRefractionTextureChannel(SpatialMaterial.TextureChannel.from(value))
    }

  var rim: Float
    get() {
       return getRim() 
    }
    set(value) {
      setRim(value)
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

  var roughnessTextureChannel: Int
    get() {
       return SpatialMaterial.TextureChannel.from(getRoughnessTextureChannel()) 
    }
    set(value) {
      setRoughnessTextureChannel(SpatialMaterial.TextureChannel.from(value))
    }

  var subsurfScatterStrength: Float
    get() {
       return getSubsurfaceScatteringStrength() 
    }
    set(value) {
      setSubsurfaceScatteringStrength(value)
    }

  var transmission: Color
    get() {
       return getTransmission() 
    }
    set(value) {
      setTransmission(value)
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

  var uv2TriplanarSharpness: Float
    get() {
       return getUv2TriplanarBlendSharpness() 
    }
    set(value) {
      setUv2TriplanarBlendSharpness(value)
    }

  fun getAlbedo(): Color {
    val _ret = __method_bind.getAlbedo.call(this._handle)
    return _ret.asColor()
  }

  fun getAlphaScissorThreshold(): Float {
    val _ret = __method_bind.getAlphaScissorThreshold.call(this._handle)
    return _ret.asFloat()
  }

  fun getAnisotropy(): Float {
    val _ret = __method_bind.getAnisotropy.call(this._handle)
    return _ret.asFloat()
  }

  fun getAoLightAffect(): Float {
    val _ret = __method_bind.getAoLightAffect.call(this._handle)
    return _ret.asFloat()
  }

  fun getAoTextureChannel(): TextureChannel {
    val _ret = __method_bind.getAoTextureChannel.call(this._handle)
    return SpatialMaterial.TextureChannel.from(_ret.asInt())
  }

  fun getBillboardMode(): BillboardMode {
    val _ret = __method_bind.getBillboardMode.call(this._handle)
    return SpatialMaterial.BillboardMode.from(_ret.asInt())
  }

  fun getBlendMode(): BlendMode {
    val _ret = __method_bind.getBlendMode.call(this._handle)
    return SpatialMaterial.BlendMode.from(_ret.asInt())
  }

  fun getClearcoat(): Float {
    val _ret = __method_bind.getClearcoat.call(this._handle)
    return _ret.asFloat()
  }

  fun getClearcoatGloss(): Float {
    val _ret = __method_bind.getClearcoatGloss.call(this._handle)
    return _ret.asFloat()
  }

  fun getCullMode(): CullMode {
    val _ret = __method_bind.getCullMode.call(this._handle)
    return SpatialMaterial.CullMode.from(_ret.asInt())
  }

  fun getDepthDeepParallaxFlipBinormal(): Boolean {
    val _ret = __method_bind.getDepthDeepParallaxFlipBinormal.call(this._handle)
    return _ret.asBoolean()
  }

  fun getDepthDeepParallaxFlipTangent(): Boolean {
    val _ret = __method_bind.getDepthDeepParallaxFlipTangent.call(this._handle)
    return _ret.asBoolean()
  }

  fun getDepthDeepParallaxMaxLayers(): Int {
    val _ret = __method_bind.getDepthDeepParallaxMaxLayers.call(this._handle)
    return _ret.asInt()
  }

  fun getDepthDeepParallaxMinLayers(): Int {
    val _ret = __method_bind.getDepthDeepParallaxMinLayers.call(this._handle)
    return _ret.asInt()
  }

  fun getDepthDrawMode(): DepthDrawMode {
    val _ret = __method_bind.getDepthDrawMode.call(this._handle)
    return SpatialMaterial.DepthDrawMode.from(_ret.asInt())
  }

  fun getDepthScale(): Float {
    val _ret = __method_bind.getDepthScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getDetailBlendMode(): BlendMode {
    val _ret = __method_bind.getDetailBlendMode.call(this._handle)
    return SpatialMaterial.BlendMode.from(_ret.asInt())
  }

  fun getDetailUv(): DetailUV {
    val _ret = __method_bind.getDetailUv.call(this._handle)
    return SpatialMaterial.DetailUV.from(_ret.asInt())
  }

  fun getDiffuseMode(): DiffuseMode {
    val _ret = __method_bind.getDiffuseMode.call(this._handle)
    return SpatialMaterial.DiffuseMode.from(_ret.asInt())
  }

  fun getDistanceFade(): DistanceFadeMode {
    val _ret = __method_bind.getDistanceFade.call(this._handle)
    return SpatialMaterial.DistanceFadeMode.from(_ret.asInt())
  }

  fun getDistanceFadeMaxDistance(): Float {
    val _ret = __method_bind.getDistanceFadeMaxDistance.call(this._handle)
    return _ret.asFloat()
  }

  fun getDistanceFadeMinDistance(): Float {
    val _ret = __method_bind.getDistanceFadeMinDistance.call(this._handle)
    return _ret.asFloat()
  }

  fun getEmission(): Color {
    val _ret = __method_bind.getEmission.call(this._handle)
    return _ret.asColor()
  }

  fun getEmissionEnergy(): Float {
    val _ret = __method_bind.getEmissionEnergy.call(this._handle)
    return _ret.asFloat()
  }

  fun getEmissionOperator(): EmissionOperator {
    val _ret = __method_bind.getEmissionOperator.call(this._handle)
    return SpatialMaterial.EmissionOperator.from(_ret.asInt())
  }

  fun getFeature(feature: Int): Boolean {
    val _arg = Variant.new(feature)
    val _ret = __method_bind.getFeature.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getFlag(flag: Int): Boolean {
    val _arg = Variant.new(flag)
    val _ret = __method_bind.getFlag.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getGrow(): Float {
    val _ret = __method_bind.getGrow.call(this._handle)
    return _ret.asFloat()
  }

  fun getLineWidth(): Float {
    val _ret = __method_bind.getLineWidth.call(this._handle)
    return _ret.asFloat()
  }

  fun getMetallic(): Float {
    val _ret = __method_bind.getMetallic.call(this._handle)
    return _ret.asFloat()
  }

  fun getMetallicTextureChannel(): TextureChannel {
    val _ret = __method_bind.getMetallicTextureChannel.call(this._handle)
    return SpatialMaterial.TextureChannel.from(_ret.asInt())
  }

  fun getNormalScale(): Float {
    val _ret = __method_bind.getNormalScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getParticlesAnimHFrames(): Int {
    val _ret = __method_bind.getParticlesAnimHFrames.call(this._handle)
    return _ret.asInt()
  }

  fun getParticlesAnimLoop(): Boolean {
    val _ret = __method_bind.getParticlesAnimLoop.call(this._handle)
    return _ret.asBoolean()
  }

  fun getParticlesAnimVFrames(): Int {
    val _ret = __method_bind.getParticlesAnimVFrames.call(this._handle)
    return _ret.asInt()
  }

  fun getPointSize(): Float {
    val _ret = __method_bind.getPointSize.call(this._handle)
    return _ret.asFloat()
  }

  fun getProximityFadeDistance(): Float {
    val _ret = __method_bind.getProximityFadeDistance.call(this._handle)
    return _ret.asFloat()
  }

  fun getRefraction(): Float {
    val _ret = __method_bind.getRefraction.call(this._handle)
    return _ret.asFloat()
  }

  fun getRefractionTextureChannel(): TextureChannel {
    val _ret = __method_bind.getRefractionTextureChannel.call(this._handle)
    return SpatialMaterial.TextureChannel.from(_ret.asInt())
  }

  fun getRim(): Float {
    val _ret = __method_bind.getRim.call(this._handle)
    return _ret.asFloat()
  }

  fun getRimTint(): Float {
    val _ret = __method_bind.getRimTint.call(this._handle)
    return _ret.asFloat()
  }

  fun getRoughness(): Float {
    val _ret = __method_bind.getRoughness.call(this._handle)
    return _ret.asFloat()
  }

  fun getRoughnessTextureChannel(): TextureChannel {
    val _ret = __method_bind.getRoughnessTextureChannel.call(this._handle)
    return SpatialMaterial.TextureChannel.from(_ret.asInt())
  }

  fun getSpecular(): Float {
    val _ret = __method_bind.getSpecular.call(this._handle)
    return _ret.asFloat()
  }

  fun getSpecularMode(): SpecularMode {
    val _ret = __method_bind.getSpecularMode.call(this._handle)
    return SpatialMaterial.SpecularMode.from(_ret.asInt())
  }

  fun getSubsurfaceScatteringStrength(): Float {
    val _ret = __method_bind.getSubsurfaceScatteringStrength.call(this._handle)
    return _ret.asFloat()
  }

  fun getTexture(param: Int): Texture {
    val _arg = Variant.new(param)
    val _ret = __method_bind.getTexture.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getTransmission(): Color {
    val _ret = __method_bind.getTransmission.call(this._handle)
    return _ret.asColor()
  }

  fun getUv1Offset(): Vector3 {
    val _ret = __method_bind.getUv1Offset.call(this._handle)
    return _ret.asVector3()
  }

  fun getUv1Scale(): Vector3 {
    val _ret = __method_bind.getUv1Scale.call(this._handle)
    return _ret.asVector3()
  }

  fun getUv1TriplanarBlendSharpness(): Float {
    val _ret = __method_bind.getUv1TriplanarBlendSharpness.call(this._handle)
    return _ret.asFloat()
  }

  fun getUv2Offset(): Vector3 {
    val _ret = __method_bind.getUv2Offset.call(this._handle)
    return _ret.asVector3()
  }

  fun getUv2Scale(): Vector3 {
    val _ret = __method_bind.getUv2Scale.call(this._handle)
    return _ret.asVector3()
  }

  fun getUv2TriplanarBlendSharpness(): Float {
    val _ret = __method_bind.getUv2TriplanarBlendSharpness.call(this._handle)
    return _ret.asFloat()
  }

  fun isDepthDeepParallaxEnabled(): Boolean {
    val _ret = __method_bind.isDepthDeepParallaxEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isGrowEnabled(): Boolean {
    val _ret = __method_bind.isGrowEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isProximityFadeEnabled(): Boolean {
    val _ret = __method_bind.isProximityFadeEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAlbedo(albedo: Color) {
    val _arg = Variant.new(albedo)
    __method_bind.setAlbedo.call(this._handle, _arg, 1)
  }

  fun setAlphaScissorThreshold(threshold: Float) {
    val _arg = Variant.new(threshold)
    __method_bind.setAlphaScissorThreshold.call(this._handle, _arg, 1)
  }

  fun setAnisotropy(anisotropy: Float) {
    val _arg = Variant.new(anisotropy)
    __method_bind.setAnisotropy.call(this._handle, _arg, 1)
  }

  fun setAoLightAffect(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setAoLightAffect.call(this._handle, _arg, 1)
  }

  fun setAoTextureChannel(channel: Int) {
    val _arg = Variant.new(channel)
    __method_bind.setAoTextureChannel.call(this._handle, _arg, 1)
  }

  fun setBillboardMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setBillboardMode.call(this._handle, _arg, 1)
  }

  fun setBlendMode(blendMode: Int) {
    val _arg = Variant.new(blendMode)
    __method_bind.setBlendMode.call(this._handle, _arg, 1)
  }

  fun setClearcoat(clearcoat: Float) {
    val _arg = Variant.new(clearcoat)
    __method_bind.setClearcoat.call(this._handle, _arg, 1)
  }

  fun setClearcoatGloss(clearcoatGloss: Float) {
    val _arg = Variant.new(clearcoatGloss)
    __method_bind.setClearcoatGloss.call(this._handle, _arg, 1)
  }

  fun setCullMode(cullMode: Int) {
    val _arg = Variant.new(cullMode)
    __method_bind.setCullMode.call(this._handle, _arg, 1)
  }

  fun setDepthDeepParallax(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setDepthDeepParallax.call(this._handle, _arg, 1)
  }

  fun setDepthDeepParallaxFlipBinormal(flip: Boolean) {
    val _arg = Variant.new(flip)
    __method_bind.setDepthDeepParallaxFlipBinormal.call(this._handle, _arg, 1)
  }

  fun setDepthDeepParallaxFlipTangent(flip: Boolean) {
    val _arg = Variant.new(flip)
    __method_bind.setDepthDeepParallaxFlipTangent.call(this._handle, _arg, 1)
  }

  fun setDepthDeepParallaxMaxLayers(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.setDepthDeepParallaxMaxLayers.call(this._handle, _arg, 1)
  }

  fun setDepthDeepParallaxMinLayers(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.setDepthDeepParallaxMinLayers.call(this._handle, _arg, 1)
  }

  fun setDepthDrawMode(depthDrawMode: Int) {
    val _arg = Variant.new(depthDrawMode)
    __method_bind.setDepthDrawMode.call(this._handle, _arg, 1)
  }

  fun setDepthScale(depthScale: Float) {
    val _arg = Variant.new(depthScale)
    __method_bind.setDepthScale.call(this._handle, _arg, 1)
  }

  fun setDetailBlendMode(detailBlendMode: Int) {
    val _arg = Variant.new(detailBlendMode)
    __method_bind.setDetailBlendMode.call(this._handle, _arg, 1)
  }

  fun setDetailUv(detailUv: Int) {
    val _arg = Variant.new(detailUv)
    __method_bind.setDetailUv.call(this._handle, _arg, 1)
  }

  fun setDiffuseMode(diffuseMode: Int) {
    val _arg = Variant.new(diffuseMode)
    __method_bind.setDiffuseMode.call(this._handle, _arg, 1)
  }

  fun setDistanceFade(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setDistanceFade.call(this._handle, _arg, 1)
  }

  fun setDistanceFadeMaxDistance(distance: Float) {
    val _arg = Variant.new(distance)
    __method_bind.setDistanceFadeMaxDistance.call(this._handle, _arg, 1)
  }

  fun setDistanceFadeMinDistance(distance: Float) {
    val _arg = Variant.new(distance)
    __method_bind.setDistanceFadeMinDistance.call(this._handle, _arg, 1)
  }

  fun setEmission(emission: Color) {
    val _arg = Variant.new(emission)
    __method_bind.setEmission.call(this._handle, _arg, 1)
  }

  fun setEmissionEnergy(emissionEnergy: Float) {
    val _arg = Variant.new(emissionEnergy)
    __method_bind.setEmissionEnergy.call(this._handle, _arg, 1)
  }

  fun setEmissionOperator(operator: Int) {
    val _arg = Variant.new(operator)
    __method_bind.setEmissionOperator.call(this._handle, _arg, 1)
  }

  fun setFeature(feature: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(feature)
    _args.append(enable)
    __method_bind.setFeature.call(this._handle, _args.toVariant(), 2)
  }

  fun setFlag(flag: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(flag)
    _args.append(enable)
    __method_bind.setFlag.call(this._handle, _args.toVariant(), 2)
  }

  fun setGrow(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setGrow.call(this._handle, _arg, 1)
  }

  fun setGrowEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setGrowEnabled.call(this._handle, _arg, 1)
  }

  fun setLineWidth(lineWidth: Float) {
    val _arg = Variant.new(lineWidth)
    __method_bind.setLineWidth.call(this._handle, _arg, 1)
  }

  fun setMetallic(metallic: Float) {
    val _arg = Variant.new(metallic)
    __method_bind.setMetallic.call(this._handle, _arg, 1)
  }

  fun setMetallicTextureChannel(channel: Int) {
    val _arg = Variant.new(channel)
    __method_bind.setMetallicTextureChannel.call(this._handle, _arg, 1)
  }

  fun setNormalScale(normalScale: Float) {
    val _arg = Variant.new(normalScale)
    __method_bind.setNormalScale.call(this._handle, _arg, 1)
  }

  fun setParticlesAnimHFrames(frames: Int) {
    val _arg = Variant.new(frames)
    __method_bind.setParticlesAnimHFrames.call(this._handle, _arg, 1)
  }

  fun setParticlesAnimLoop(loop: Boolean) {
    val _arg = Variant.new(loop)
    __method_bind.setParticlesAnimLoop.call(this._handle, _arg, 1)
  }

  fun setParticlesAnimVFrames(frames: Int) {
    val _arg = Variant.new(frames)
    __method_bind.setParticlesAnimVFrames.call(this._handle, _arg, 1)
  }

  fun setPointSize(pointSize: Float) {
    val _arg = Variant.new(pointSize)
    __method_bind.setPointSize.call(this._handle, _arg, 1)
  }

  fun setProximityFade(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setProximityFade.call(this._handle, _arg, 1)
  }

  fun setProximityFadeDistance(distance: Float) {
    val _arg = Variant.new(distance)
    __method_bind.setProximityFadeDistance.call(this._handle, _arg, 1)
  }

  fun setRefraction(refraction: Float) {
    val _arg = Variant.new(refraction)
    __method_bind.setRefraction.call(this._handle, _arg, 1)
  }

  fun setRefractionTextureChannel(channel: Int) {
    val _arg = Variant.new(channel)
    __method_bind.setRefractionTextureChannel.call(this._handle, _arg, 1)
  }

  fun setRim(rim: Float) {
    val _arg = Variant.new(rim)
    __method_bind.setRim.call(this._handle, _arg, 1)
  }

  fun setRimTint(rimTint: Float) {
    val _arg = Variant.new(rimTint)
    __method_bind.setRimTint.call(this._handle, _arg, 1)
  }

  fun setRoughness(roughness: Float) {
    val _arg = Variant.new(roughness)
    __method_bind.setRoughness.call(this._handle, _arg, 1)
  }

  fun setRoughnessTextureChannel(channel: Int) {
    val _arg = Variant.new(channel)
    __method_bind.setRoughnessTextureChannel.call(this._handle, _arg, 1)
  }

  fun setSpecular(specular: Float) {
    val _arg = Variant.new(specular)
    __method_bind.setSpecular.call(this._handle, _arg, 1)
  }

  fun setSpecularMode(specularMode: Int) {
    val _arg = Variant.new(specularMode)
    __method_bind.setSpecularMode.call(this._handle, _arg, 1)
  }

  fun setSubsurfaceScatteringStrength(strength: Float) {
    val _arg = Variant.new(strength)
    __method_bind.setSubsurfaceScatteringStrength.call(this._handle, _arg, 1)
  }

  fun setTexture(param: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(texture)
    __method_bind.setTexture.call(this._handle, _args.toVariant(), 2)
  }

  fun setTransmission(transmission: Color) {
    val _arg = Variant.new(transmission)
    __method_bind.setTransmission.call(this._handle, _arg, 1)
  }

  fun setUv1Offset(offset: Vector3) {
    val _arg = Variant.new(offset)
    __method_bind.setUv1Offset.call(this._handle, _arg, 1)
  }

  fun setUv1Scale(scale: Vector3) {
    val _arg = Variant.new(scale)
    __method_bind.setUv1Scale.call(this._handle, _arg, 1)
  }

  fun setUv1TriplanarBlendSharpness(sharpness: Float) {
    val _arg = Variant.new(sharpness)
    __method_bind.setUv1TriplanarBlendSharpness.call(this._handle, _arg, 1)
  }

  fun setUv2Offset(offset: Vector3) {
    val _arg = Variant.new(offset)
    __method_bind.setUv2Offset.call(this._handle, _arg, 1)
  }

  fun setUv2Scale(scale: Vector3) {
    val _arg = Variant.new(scale)
    __method_bind.setUv2Scale.call(this._handle, _arg, 1)
  }

  fun setUv2TriplanarBlendSharpness(sharpness: Float) {
    val _arg = Variant.new(sharpness)
    __method_bind.setUv2TriplanarBlendSharpness.call(this._handle, _arg, 1)
  }

  enum class EmissionOperator(
    val value: Int
  ) {
    EMISSION_OP_ADD(0),

    EMISSION_OP_MULTIPLY(1);

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
    DIFFUSE_BURLEY(0),

    DIFFUSE_LAMBERT(1),

    DIFFUSE_LAMBERT_WRAP(2),

    DIFFUSE_OREN_NAYAR(3),

    DIFFUSE_TOON(4);

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
    SPECULAR_SCHLICK_GGX(0),

    SPECULAR_BLINN(1),

    SPECULAR_PHONG(2),

    SPECULAR_TOON(3),

    SPECULAR_DISABLED(4);

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
    CULL_BACK(0),

    CULL_FRONT(1),

    CULL_DISABLED(2);

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
    DETAIL_UV_1(0),

    DETAIL_UV_2(1);

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
    DISTANCE_FADE_DISABLED(0),

    DISTANCE_FADE_PIXEL_ALPHA(1),

    DISTANCE_FADE_PIXEL_DITHER(2),

    DISTANCE_FADE_OBJECT_DITHER(3);

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
    BILLBOARD_DISABLED(0),

    BILLBOARD_ENABLED(1),

    BILLBOARD_FIXED_Y(2),

    BILLBOARD_PARTICLES(3);

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
    DEPTH_DRAW_OPAQUE_ONLY(0),

    DEPTH_DRAW_ALWAYS(1),

    DEPTH_DRAW_DISABLED(2),

    DEPTH_DRAW_ALPHA_OPAQUE_PREPASS(3);

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
    TEXTURE_CHANNEL_RED(0),

    TEXTURE_CHANNEL_GREEN(1),

    TEXTURE_CHANNEL_BLUE(2),

    TEXTURE_CHANNEL_ALPHA(3),

    TEXTURE_CHANNEL_GRAYSCALE(4);

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
    BLEND_MODE_MIX(0),

    BLEND_MODE_ADD(1),

    BLEND_MODE_SUB(2),

    BLEND_MODE_MUL(3);

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
      requireNotNull(fnPtr) { "No instance found for SpatialMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SpatialMaterial(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SpatialMaterial = SpatialMaterial(ptr)
    /**
     * Container for method_bind pointers for SpatialMaterial
     */
    private object __method_bind {
      val getAlbedo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getAlbedo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAlbedo" }
        }
      val getAlphaScissorThreshold: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getAlphaScissorThreshold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAlphaScissorThreshold" }
        }
      val getAnisotropy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getAnisotropy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAnisotropy" }
        }
      val getAoLightAffect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getAoLightAffect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAoLightAffect" }
        }
      val getAoTextureChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getAoTextureChannel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAoTextureChannel" }
        }
      val getBillboardMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getBillboardMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBillboardMode" }
        }
      val getBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getBlendMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBlendMode" }
        }
      val getClearcoat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getClearcoat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClearcoat" }
        }
      val getClearcoatGloss: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getClearcoatGloss".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClearcoatGloss" }
        }
      val getCullMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getCullMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCullMode" }
        }
      val getDepthDeepParallaxFlipBinormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getDepthDeepParallaxFlipBinormal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDepthDeepParallaxFlipBinormal" }
        }
      val getDepthDeepParallaxFlipTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getDepthDeepParallaxFlipTangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDepthDeepParallaxFlipTangent" }
        }
      val getDepthDeepParallaxMaxLayers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getDepthDeepParallaxMaxLayers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDepthDeepParallaxMaxLayers" }
        }
      val getDepthDeepParallaxMinLayers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getDepthDeepParallaxMinLayers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDepthDeepParallaxMinLayers" }
        }
      val getDepthDrawMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getDepthDrawMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDepthDrawMode" }
        }
      val getDepthScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getDepthScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDepthScale" }
        }
      val getDetailBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getDetailBlendMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDetailBlendMode" }
        }
      val getDetailUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getDetailUv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDetailUv" }
        }
      val getDiffuseMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getDiffuseMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDiffuseMode" }
        }
      val getDistanceFade: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getDistanceFade".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDistanceFade" }
        }
      val getDistanceFadeMaxDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getDistanceFadeMaxDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDistanceFadeMaxDistance" }
        }
      val getDistanceFadeMinDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getDistanceFadeMinDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDistanceFadeMinDistance" }
        }
      val getEmission: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getEmission".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEmission" }
        }
      val getEmissionEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getEmissionEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEmissionEnergy" }
        }
      val getEmissionOperator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getEmissionOperator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEmissionOperator" }
        }
      val getFeature: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getFeature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFeature" }
        }
      val getFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getFlag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFlag" }
        }
      val getGrow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getGrow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGrow" }
        }
      val getLineWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getLineWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLineWidth" }
        }
      val getMetallic: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getMetallic".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMetallic" }
        }
      val getMetallicTextureChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getMetallicTextureChannel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMetallicTextureChannel" }
        }
      val getNormalScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getNormalScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNormalScale" }
        }
      val getParticlesAnimHFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getParticlesAnimHFrames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParticlesAnimHFrames" }
        }
      val getParticlesAnimLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getParticlesAnimLoop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParticlesAnimLoop" }
        }
      val getParticlesAnimVFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getParticlesAnimVFrames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParticlesAnimVFrames" }
        }
      val getPointSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getPointSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointSize" }
        }
      val getProximityFadeDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getProximityFadeDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProximityFadeDistance" }
        }
      val getRefraction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getRefraction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRefraction" }
        }
      val getRefractionTextureChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getRefractionTextureChannel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRefractionTextureChannel" }
        }
      val getRim: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getRim".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRim" }
        }
      val getRimTint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getRimTint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRimTint" }
        }
      val getRoughness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getRoughness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRoughness" }
        }
      val getRoughnessTextureChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getRoughnessTextureChannel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRoughnessTextureChannel" }
        }
      val getSpecular: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getSpecular".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpecular" }
        }
      val getSpecularMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getSpecularMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpecularMode" }
        }
      val getSubsurfaceScatteringStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getSubsurfaceScatteringStrength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSubsurfaceScatteringStrength" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTexture" }
        }
      val getTransmission: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getTransmission".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTransmission" }
        }
      val getUv1Offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getUv1Offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUv1Offset" }
        }
      val getUv1Scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getUv1Scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUv1Scale" }
        }
      val getUv1TriplanarBlendSharpness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getUv1TriplanarBlendSharpness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUv1TriplanarBlendSharpness" }
        }
      val getUv2Offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getUv2Offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUv2Offset" }
        }
      val getUv2Scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getUv2Scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUv2Scale" }
        }
      val getUv2TriplanarBlendSharpness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "getUv2TriplanarBlendSharpness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUv2TriplanarBlendSharpness" }
        }
      val isDepthDeepParallaxEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "isDepthDeepParallaxEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDepthDeepParallaxEnabled" }
        }
      val isGrowEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "isGrowEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isGrowEnabled" }
        }
      val isProximityFadeEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "isProximityFadeEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isProximityFadeEnabled" }
        }
      val setAlbedo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setAlbedo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAlbedo" }
        }
      val setAlphaScissorThreshold: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setAlphaScissorThreshold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAlphaScissorThreshold" }
        }
      val setAnisotropy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setAnisotropy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAnisotropy" }
        }
      val setAoLightAffect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setAoLightAffect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAoLightAffect" }
        }
      val setAoTextureChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setAoTextureChannel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAoTextureChannel" }
        }
      val setBillboardMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setBillboardMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBillboardMode" }
        }
      val setBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setBlendMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBlendMode" }
        }
      val setClearcoat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setClearcoat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setClearcoat" }
        }
      val setClearcoatGloss: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setClearcoatGloss".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setClearcoatGloss" }
        }
      val setCullMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setCullMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCullMode" }
        }
      val setDepthDeepParallax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setDepthDeepParallax".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDepthDeepParallax" }
        }
      val setDepthDeepParallaxFlipBinormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setDepthDeepParallaxFlipBinormal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDepthDeepParallaxFlipBinormal" }
        }
      val setDepthDeepParallaxFlipTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setDepthDeepParallaxFlipTangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDepthDeepParallaxFlipTangent" }
        }
      val setDepthDeepParallaxMaxLayers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setDepthDeepParallaxMaxLayers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDepthDeepParallaxMaxLayers" }
        }
      val setDepthDeepParallaxMinLayers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setDepthDeepParallaxMinLayers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDepthDeepParallaxMinLayers" }
        }
      val setDepthDrawMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setDepthDrawMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDepthDrawMode" }
        }
      val setDepthScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setDepthScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDepthScale" }
        }
      val setDetailBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setDetailBlendMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDetailBlendMode" }
        }
      val setDetailUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setDetailUv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDetailUv" }
        }
      val setDiffuseMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setDiffuseMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDiffuseMode" }
        }
      val setDistanceFade: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setDistanceFade".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDistanceFade" }
        }
      val setDistanceFadeMaxDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setDistanceFadeMaxDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDistanceFadeMaxDistance" }
        }
      val setDistanceFadeMinDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setDistanceFadeMinDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDistanceFadeMinDistance" }
        }
      val setEmission: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setEmission".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEmission" }
        }
      val setEmissionEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setEmissionEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEmissionEnergy" }
        }
      val setEmissionOperator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setEmissionOperator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEmissionOperator" }
        }
      val setFeature: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setFeature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFeature" }
        }
      val setFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setFlag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFlag" }
        }
      val setGrow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setGrow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGrow" }
        }
      val setGrowEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setGrowEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGrowEnabled" }
        }
      val setLineWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setLineWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLineWidth" }
        }
      val setMetallic: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setMetallic".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMetallic" }
        }
      val setMetallicTextureChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setMetallicTextureChannel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMetallicTextureChannel" }
        }
      val setNormalScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setNormalScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNormalScale" }
        }
      val setParticlesAnimHFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setParticlesAnimHFrames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setParticlesAnimHFrames" }
        }
      val setParticlesAnimLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setParticlesAnimLoop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setParticlesAnimLoop" }
        }
      val setParticlesAnimVFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setParticlesAnimVFrames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setParticlesAnimVFrames" }
        }
      val setPointSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setPointSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointSize" }
        }
      val setProximityFade: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setProximityFade".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProximityFade" }
        }
      val setProximityFadeDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setProximityFadeDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProximityFadeDistance" }
        }
      val setRefraction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setRefraction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRefraction" }
        }
      val setRefractionTextureChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setRefractionTextureChannel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRefractionTextureChannel" }
        }
      val setRim: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setRim".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRim" }
        }
      val setRimTint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setRimTint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRimTint" }
        }
      val setRoughness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setRoughness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRoughness" }
        }
      val setRoughnessTextureChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setRoughnessTextureChannel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRoughnessTextureChannel" }
        }
      val setSpecular: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setSpecular".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSpecular" }
        }
      val setSpecularMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setSpecularMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSpecularMode" }
        }
      val setSubsurfaceScatteringStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setSubsurfaceScatteringStrength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSubsurfaceScatteringStrength" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTexture" }
        }
      val setTransmission: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setTransmission".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTransmission" }
        }
      val setUv1Offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setUv1Offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUv1Offset" }
        }
      val setUv1Scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setUv1Scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUv1Scale" }
        }
      val setUv1TriplanarBlendSharpness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setUv1TriplanarBlendSharpness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUv1TriplanarBlendSharpness" }
        }
      val setUv2Offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setUv2Offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUv2Offset" }
        }
      val setUv2Scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setUv2Scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUv2Scale" }
        }
      val setUv2TriplanarBlendSharpness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
            "setUv2TriplanarBlendSharpness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUv2TriplanarBlendSharpness" }
        }}
  }
}
