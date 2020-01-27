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

open class SpatialMaterial internal constructor(
  _handle: COpaquePointer
) : Material(_handle) {
  fun getAlbedo(): Color {
    val _ret = __method_bind.get_albedo.call(this.toVariant())
    return _ret.asColor()
  }

  fun getAlphaScissorThreshold(): Float {
    val _ret = __method_bind.get_alpha_scissor_threshold.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getAnisotropy(): Float {
    val _ret = __method_bind.get_anisotropy.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getAoLightAffect(): Float {
    val _ret = __method_bind.get_ao_light_affect.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getAoTextureChannel(): TextureChannel {
    val _ret = __method_bind.get_ao_texture_channel.call(this.toVariant())
    return SpatialMaterial.TextureChannel.from(_ret.asInt())
  }

  fun getBillboardMode(): BillboardMode {
    val _ret = __method_bind.get_billboard_mode.call(this.toVariant())
    return SpatialMaterial.BillboardMode.from(_ret.asInt())
  }

  fun getBlendMode(): BlendMode {
    val _ret = __method_bind.get_blend_mode.call(this.toVariant())
    return SpatialMaterial.BlendMode.from(_ret.asInt())
  }

  fun getClearcoat(): Float {
    val _ret = __method_bind.get_clearcoat.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getClearcoatGloss(): Float {
    val _ret = __method_bind.get_clearcoat_gloss.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getCullMode(): CullMode {
    val _ret = __method_bind.get_cull_mode.call(this.toVariant())
    return SpatialMaterial.CullMode.from(_ret.asInt())
  }

  fun getDepthDeepParallaxFlipBinormal(): Boolean {
    val _ret = __method_bind.get_depth_deep_parallax_flip_binormal.call(this.toVariant())
    return _ret.asBool()
  }

  fun getDepthDeepParallaxFlipTangent(): Boolean {
    val _ret = __method_bind.get_depth_deep_parallax_flip_tangent.call(this.toVariant())
    return _ret.asBool()
  }

  fun getDepthDeepParallaxMaxLayers(): Int {
    val _ret = __method_bind.get_depth_deep_parallax_max_layers.call(this.toVariant())
    return _ret.asInt()
  }

  fun getDepthDeepParallaxMinLayers(): Int {
    val _ret = __method_bind.get_depth_deep_parallax_min_layers.call(this.toVariant())
    return _ret.asInt()
  }

  fun getDepthDrawMode(): DepthDrawMode {
    val _ret = __method_bind.get_depth_draw_mode.call(this.toVariant())
    return SpatialMaterial.DepthDrawMode.from(_ret.asInt())
  }

  fun getDepthScale(): Float {
    val _ret = __method_bind.get_depth_scale.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getDetailBlendMode(): BlendMode {
    val _ret = __method_bind.get_detail_blend_mode.call(this.toVariant())
    return SpatialMaterial.BlendMode.from(_ret.asInt())
  }

  fun getDetailUv(): DetailUV {
    val _ret = __method_bind.get_detail_uv.call(this.toVariant())
    return SpatialMaterial.DetailUV.from(_ret.asInt())
  }

  fun getDiffuseMode(): DiffuseMode {
    val _ret = __method_bind.get_diffuse_mode.call(this.toVariant())
    return SpatialMaterial.DiffuseMode.from(_ret.asInt())
  }

  fun getDistanceFade(): DistanceFadeMode {
    val _ret = __method_bind.get_distance_fade.call(this.toVariant())
    return SpatialMaterial.DistanceFadeMode.from(_ret.asInt())
  }

  fun getDistanceFadeMaxDistance(): Float {
    val _ret = __method_bind.get_distance_fade_max_distance.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getDistanceFadeMinDistance(): Float {
    val _ret = __method_bind.get_distance_fade_min_distance.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getEmission(): Color {
    val _ret = __method_bind.get_emission.call(this.toVariant())
    return _ret.asColor()
  }

  fun getEmissionEnergy(): Float {
    val _ret = __method_bind.get_emission_energy.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getEmissionOperator(): EmissionOperator {
    val _ret = __method_bind.get_emission_operator.call(this.toVariant())
    return SpatialMaterial.EmissionOperator.from(_ret.asInt())
  }

  fun getFeature(feature: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(feature)
    val _ret = __method_bind.get_feature.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun getFlag(flag: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(flag)
    val _ret = __method_bind.get_flag.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun getGrow(): Float {
    val _ret = __method_bind.get_grow.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getLineWidth(): Float {
    val _ret = __method_bind.get_line_width.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getMetallic(): Float {
    val _ret = __method_bind.get_metallic.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getMetallicTextureChannel(): TextureChannel {
    val _ret = __method_bind.get_metallic_texture_channel.call(this.toVariant())
    return SpatialMaterial.TextureChannel.from(_ret.asInt())
  }

  fun getNormalScale(): Float {
    val _ret = __method_bind.get_normal_scale.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getParticlesAnimHFrames(): Int {
    val _ret = __method_bind.get_particles_anim_h_frames.call(this.toVariant())
    return _ret.asInt()
  }

  fun getParticlesAnimLoop(): Boolean {
    val _ret = __method_bind.get_particles_anim_loop.call(this.toVariant())
    return _ret.asBool()
  }

  fun getParticlesAnimVFrames(): Int {
    val _ret = __method_bind.get_particles_anim_v_frames.call(this.toVariant())
    return _ret.asInt()
  }

  fun getPointSize(): Float {
    val _ret = __method_bind.get_point_size.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getProximityFadeDistance(): Float {
    val _ret = __method_bind.get_proximity_fade_distance.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getRefraction(): Float {
    val _ret = __method_bind.get_refraction.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getRefractionTextureChannel(): TextureChannel {
    val _ret = __method_bind.get_refraction_texture_channel.call(this.toVariant())
    return SpatialMaterial.TextureChannel.from(_ret.asInt())
  }

  fun getRim(): Float {
    val _ret = __method_bind.get_rim.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getRimTint(): Float {
    val _ret = __method_bind.get_rim_tint.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getRoughness(): Float {
    val _ret = __method_bind.get_roughness.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getRoughnessTextureChannel(): TextureChannel {
    val _ret = __method_bind.get_roughness_texture_channel.call(this.toVariant())
    return SpatialMaterial.TextureChannel.from(_ret.asInt())
  }

  fun getSpecular(): Float {
    val _ret = __method_bind.get_specular.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSpecularMode(): SpecularMode {
    val _ret = __method_bind.get_specular_mode.call(this.toVariant())
    return SpatialMaterial.SpecularMode.from(_ret.asInt())
  }

  fun getSubsurfaceScatteringStrength(): Float {
    val _ret = __method_bind.get_subsurface_scattering_strength.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getTexture(param: Int): Texture {
    val _args = VariantArray.new()
    _args.append(param)
    val _ret = __method_bind.get_texture.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asObject(::Texture)!!
  }

  fun getTransmission(): Color {
    val _ret = __method_bind.get_transmission.call(this.toVariant())
    return _ret.asColor()
  }

  fun getUv1Offset(): Vector3 {
    val _ret = __method_bind.get_uv1_offset.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getUv1Scale(): Vector3 {
    val _ret = __method_bind.get_uv1_scale.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getUv1TriplanarBlendSharpness(): Float {
    val _ret = __method_bind.get_uv1_triplanar_blend_sharpness.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getUv2Offset(): Vector3 {
    val _ret = __method_bind.get_uv2_offset.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getUv2Scale(): Vector3 {
    val _ret = __method_bind.get_uv2_scale.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getUv2TriplanarBlendSharpness(): Float {
    val _ret = __method_bind.get_uv2_triplanar_blend_sharpness.call(this.toVariant())
    return _ret.asFloat()
  }

  fun isDepthDeepParallaxEnabled(): Boolean {
    val _ret = __method_bind.is_depth_deep_parallax_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isGrowEnabled(): Boolean {
    val _ret = __method_bind.is_grow_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isProximityFadeEnabled(): Boolean {
    val _ret = __method_bind.is_proximity_fade_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun setAlbedo(albedo: Color) {
    val _args = VariantArray.new()
    _args.append(albedo)
    __method_bind.set_albedo.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setAlphaScissorThreshold(threshold: Float) {
    val _args = VariantArray.new()
    _args.append(threshold)
    __method_bind.set_alpha_scissor_threshold.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setAnisotropy(anisotropy: Float) {
    val _args = VariantArray.new()
    _args.append(anisotropy)
    __method_bind.set_anisotropy.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setAoLightAffect(amount: Float) {
    val _args = VariantArray.new()
    _args.append(amount)
    __method_bind.set_ao_light_affect.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setAoTextureChannel(channel: Int) {
    val _args = VariantArray.new()
    _args.append(channel)
    __method_bind.set_ao_texture_channel.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setBillboardMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    __method_bind.set_billboard_mode.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setBlendMode(blendMode: Int) {
    val _args = VariantArray.new()
    _args.append(blendMode)
    __method_bind.set_blend_mode.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setClearcoat(clearcoat: Float) {
    val _args = VariantArray.new()
    _args.append(clearcoat)
    __method_bind.set_clearcoat.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setClearcoatGloss(clearcoatGloss: Float) {
    val _args = VariantArray.new()
    _args.append(clearcoatGloss)
    __method_bind.set_clearcoat_gloss.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setCullMode(cullMode: Int) {
    val _args = VariantArray.new()
    _args.append(cullMode)
    __method_bind.set_cull_mode.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDepthDeepParallax(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_depth_deep_parallax.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDepthDeepParallaxFlipBinormal(flip: Boolean) {
    val _args = VariantArray.new()
    _args.append(flip)
    __method_bind.set_depth_deep_parallax_flip_binormal.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDepthDeepParallaxFlipTangent(flip: Boolean) {
    val _args = VariantArray.new()
    _args.append(flip)
    __method_bind.set_depth_deep_parallax_flip_tangent.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDepthDeepParallaxMaxLayers(layer: Int) {
    val _args = VariantArray.new()
    _args.append(layer)
    __method_bind.set_depth_deep_parallax_max_layers.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDepthDeepParallaxMinLayers(layer: Int) {
    val _args = VariantArray.new()
    _args.append(layer)
    __method_bind.set_depth_deep_parallax_min_layers.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDepthDrawMode(depthDrawMode: Int) {
    val _args = VariantArray.new()
    _args.append(depthDrawMode)
    __method_bind.set_depth_draw_mode.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDepthScale(depthScale: Float) {
    val _args = VariantArray.new()
    _args.append(depthScale)
    __method_bind.set_depth_scale.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDetailBlendMode(detailBlendMode: Int) {
    val _args = VariantArray.new()
    _args.append(detailBlendMode)
    __method_bind.set_detail_blend_mode.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDetailUv(detailUv: Int) {
    val _args = VariantArray.new()
    _args.append(detailUv)
    __method_bind.set_detail_uv.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDiffuseMode(diffuseMode: Int) {
    val _args = VariantArray.new()
    _args.append(diffuseMode)
    __method_bind.set_diffuse_mode.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDistanceFade(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    __method_bind.set_distance_fade.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDistanceFadeMaxDistance(distance: Float) {
    val _args = VariantArray.new()
    _args.append(distance)
    __method_bind.set_distance_fade_max_distance.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDistanceFadeMinDistance(distance: Float) {
    val _args = VariantArray.new()
    _args.append(distance)
    __method_bind.set_distance_fade_min_distance.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setEmission(emission: Color) {
    val _args = VariantArray.new()
    _args.append(emission)
    __method_bind.set_emission.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setEmissionEnergy(emissionEnergy: Float) {
    val _args = VariantArray.new()
    _args.append(emissionEnergy)
    __method_bind.set_emission_energy.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setEmissionOperator(operator: Int) {
    val _args = VariantArray.new()
    _args.append(operator)
    __method_bind.set_emission_operator.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setFeature(feature: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(feature)
    _args.append(enable)
    __method_bind.set_feature.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setFlag(flag: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(flag)
    _args.append(enable)
    __method_bind.set_flag.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setGrow(amount: Float) {
    val _args = VariantArray.new()
    _args.append(amount)
    __method_bind.set_grow.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setGrowEnabled(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_grow_enabled.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setLineWidth(lineWidth: Float) {
    val _args = VariantArray.new()
    _args.append(lineWidth)
    __method_bind.set_line_width.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMetallic(metallic: Float) {
    val _args = VariantArray.new()
    _args.append(metallic)
    __method_bind.set_metallic.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMetallicTextureChannel(channel: Int) {
    val _args = VariantArray.new()
    _args.append(channel)
    __method_bind.set_metallic_texture_channel.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setNormalScale(normalScale: Float) {
    val _args = VariantArray.new()
    _args.append(normalScale)
    __method_bind.set_normal_scale.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setParticlesAnimHFrames(frames: Int) {
    val _args = VariantArray.new()
    _args.append(frames)
    __method_bind.set_particles_anim_h_frames.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setParticlesAnimLoop(loop: Boolean) {
    val _args = VariantArray.new()
    _args.append(loop)
    __method_bind.set_particles_anim_loop.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setParticlesAnimVFrames(frames: Int) {
    val _args = VariantArray.new()
    _args.append(frames)
    __method_bind.set_particles_anim_v_frames.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setPointSize(pointSize: Float) {
    val _args = VariantArray.new()
    _args.append(pointSize)
    __method_bind.set_point_size.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setProximityFade(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    __method_bind.set_proximity_fade.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setProximityFadeDistance(distance: Float) {
    val _args = VariantArray.new()
    _args.append(distance)
    __method_bind.set_proximity_fade_distance.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setRefraction(refraction: Float) {
    val _args = VariantArray.new()
    _args.append(refraction)
    __method_bind.set_refraction.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setRefractionTextureChannel(channel: Int) {
    val _args = VariantArray.new()
    _args.append(channel)
    __method_bind.set_refraction_texture_channel.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setRim(rim: Float) {
    val _args = VariantArray.new()
    _args.append(rim)
    __method_bind.set_rim.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setRimTint(rimTint: Float) {
    val _args = VariantArray.new()
    _args.append(rimTint)
    __method_bind.set_rim_tint.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setRoughness(roughness: Float) {
    val _args = VariantArray.new()
    _args.append(roughness)
    __method_bind.set_roughness.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setRoughnessTextureChannel(channel: Int) {
    val _args = VariantArray.new()
    _args.append(channel)
    __method_bind.set_roughness_texture_channel.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setSpecular(specular: Float) {
    val _args = VariantArray.new()
    _args.append(specular)
    __method_bind.set_specular.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setSpecularMode(specularMode: Int) {
    val _args = VariantArray.new()
    _args.append(specularMode)
    __method_bind.set_specular_mode.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setSubsurfaceScatteringStrength(strength: Float) {
    val _args = VariantArray.new()
    _args.append(strength)
    __method_bind.set_subsurface_scattering_strength.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setTexture(param: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(texture)
    __method_bind.set_texture.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setTransmission(transmission: Color) {
    val _args = VariantArray.new()
    _args.append(transmission)
    __method_bind.set_transmission.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setUv1Offset(offset: Vector3) {
    val _args = VariantArray.new()
    _args.append(offset)
    __method_bind.set_uv1_offset.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setUv1Scale(scale: Vector3) {
    val _args = VariantArray.new()
    _args.append(scale)
    __method_bind.set_uv1_scale.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setUv1TriplanarBlendSharpness(sharpness: Float) {
    val _args = VariantArray.new()
    _args.append(sharpness)
    __method_bind.set_uv1_triplanar_blend_sharpness.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setUv2Offset(offset: Vector3) {
    val _args = VariantArray.new()
    _args.append(offset)
    __method_bind.set_uv2_offset.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setUv2Scale(scale: Vector3) {
    val _args = VariantArray.new()
    _args.append(scale)
    __method_bind.set_uv2_scale.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setUv2TriplanarBlendSharpness(sharpness: Float) {
    val _args = VariantArray.new()
    _args.append(sharpness)
    __method_bind.set_uv2_triplanar_blend_sharpness.call(this.toVariant(), _args.toVariant(), 1)
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
      requireNotNull(fnPtr) { "No instance found for singleton SpatialMaterial" }
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
      val get_albedo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_albedo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_albedo" }
            }
          }

      val get_alpha_scissor_threshold: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_alpha_scissor_threshold".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_alpha_scissor_threshold" }
            }
          }

      val get_anisotropy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_anisotropy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_anisotropy" }
            }
          }

      val get_ao_light_affect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_ao_light_affect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ao_light_affect" }
            }
          }

      val get_ao_texture_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_ao_texture_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ao_texture_channel" }
            }
          }

      val get_billboard_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_billboard_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_billboard_mode" }
            }
          }

      val get_blend_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_mode" }
            }
          }

      val get_clearcoat: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_clearcoat".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_clearcoat" }
            }
          }

      val get_clearcoat_gloss: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_clearcoat_gloss".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_clearcoat_gloss" }
            }
          }

      val get_cull_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_cull_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cull_mode" }
            }
          }

      val get_depth_deep_parallax_flip_binormal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_depth_deep_parallax_flip_binormal".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_depth_deep_parallax_flip_binormal" }
            }
          }

      val get_depth_deep_parallax_flip_tangent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_depth_deep_parallax_flip_tangent".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_depth_deep_parallax_flip_tangent" }
            }
          }

      val get_depth_deep_parallax_max_layers: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_depth_deep_parallax_max_layers".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_depth_deep_parallax_max_layers" }
            }
          }

      val get_depth_deep_parallax_min_layers: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_depth_deep_parallax_min_layers".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_depth_deep_parallax_min_layers" }
            }
          }

      val get_depth_draw_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_depth_draw_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_depth_draw_mode" }
            }
          }

      val get_depth_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_depth_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_depth_scale" }
            }
          }

      val get_detail_blend_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_detail_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_detail_blend_mode" }
            }
          }

      val get_detail_uv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_detail_uv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_detail_uv" }
            }
          }

      val get_diffuse_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_diffuse_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_diffuse_mode" }
            }
          }

      val get_distance_fade: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_distance_fade".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_distance_fade" }
            }
          }

      val get_distance_fade_max_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_distance_fade_max_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_distance_fade_max_distance"
              }
            }
          }

      val get_distance_fade_min_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_distance_fade_min_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_distance_fade_min_distance"
              }
            }
          }

      val get_emission: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_emission".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission" }
            }
          }

      val get_emission_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_emission_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_energy" }
            }
          }

      val get_emission_operator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_emission_operator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_emission_operator" }
            }
          }

      val get_feature: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_feature".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_feature" }
            }
          }

      val get_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flag" }
            }
          }

      val get_grow: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_grow".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_grow" }
            }
          }

      val get_line_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_line_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_line_width" }
            }
          }

      val get_metallic: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_metallic".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_metallic" }
            }
          }

      val get_metallic_texture_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_metallic_texture_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_metallic_texture_channel" }
            }
          }

      val get_normal_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_normal_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normal_scale" }
            }
          }

      val get_particles_anim_h_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_particles_anim_h_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_particles_anim_h_frames" }
            }
          }

      val get_particles_anim_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_particles_anim_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_particles_anim_loop" }
            }
          }

      val get_particles_anim_v_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_particles_anim_v_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_particles_anim_v_frames" }
            }
          }

      val get_point_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_point_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_size" }
            }
          }

      val get_proximity_fade_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_proximity_fade_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_proximity_fade_distance" }
            }
          }

      val get_refraction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_refraction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_refraction" }
            }
          }

      val get_refraction_texture_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_refraction_texture_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_refraction_texture_channel"
              }
            }
          }

      val get_rim: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_rim".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rim" }
            }
          }

      val get_rim_tint: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_rim_tint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rim_tint" }
            }
          }

      val get_roughness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_roughness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_roughness" }
            }
          }

      val get_roughness_texture_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_roughness_texture_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_roughness_texture_channel"
              }
            }
          }

      val get_specular: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_specular".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_specular" }
            }
          }

      val get_specular_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_specular_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_specular_mode" }
            }
          }

      val get_subsurface_scattering_strength: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_subsurface_scattering_strength".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_subsurface_scattering_strength" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_transmission: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_transmission".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transmission" }
            }
          }

      val get_uv1_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_uv1_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_uv1_offset" }
            }
          }

      val get_uv1_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_uv1_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_uv1_scale" }
            }
          }

      val get_uv1_triplanar_blend_sharpness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_uv1_triplanar_blend_sharpness".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_uv1_triplanar_blend_sharpness" }
            }
          }

      val get_uv2_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_uv2_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_uv2_offset" }
            }
          }

      val get_uv2_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_uv2_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_uv2_scale" }
            }
          }

      val get_uv2_triplanar_blend_sharpness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "get_uv2_triplanar_blend_sharpness".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_uv2_triplanar_blend_sharpness" }
            }
          }

      val is_depth_deep_parallax_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "is_depth_deep_parallax_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_depth_deep_parallax_enabled"
              }
            }
          }

      val is_grow_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "is_grow_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_grow_enabled" }
            }
          }

      val is_proximity_fade_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "is_proximity_fade_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_proximity_fade_enabled" }
            }
          }

      val set_albedo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_albedo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_albedo" }
            }
          }

      val set_alpha_scissor_threshold: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_alpha_scissor_threshold".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_alpha_scissor_threshold" }
            }
          }

      val set_anisotropy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_anisotropy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_anisotropy" }
            }
          }

      val set_ao_light_affect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_ao_light_affect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ao_light_affect" }
            }
          }

      val set_ao_texture_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_ao_texture_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ao_texture_channel" }
            }
          }

      val set_billboard_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_billboard_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_billboard_mode" }
            }
          }

      val set_blend_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_mode" }
            }
          }

      val set_clearcoat: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_clearcoat".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_clearcoat" }
            }
          }

      val set_clearcoat_gloss: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_clearcoat_gloss".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_clearcoat_gloss" }
            }
          }

      val set_cull_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_cull_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cull_mode" }
            }
          }

      val set_depth_deep_parallax: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_depth_deep_parallax".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_depth_deep_parallax" }
            }
          }

      val set_depth_deep_parallax_flip_binormal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_depth_deep_parallax_flip_binormal".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_depth_deep_parallax_flip_binormal" }
            }
          }

      val set_depth_deep_parallax_flip_tangent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_depth_deep_parallax_flip_tangent".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_depth_deep_parallax_flip_tangent" }
            }
          }

      val set_depth_deep_parallax_max_layers: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_depth_deep_parallax_max_layers".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_depth_deep_parallax_max_layers" }
            }
          }

      val set_depth_deep_parallax_min_layers: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_depth_deep_parallax_min_layers".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_depth_deep_parallax_min_layers" }
            }
          }

      val set_depth_draw_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_depth_draw_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_depth_draw_mode" }
            }
          }

      val set_depth_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_depth_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_depth_scale" }
            }
          }

      val set_detail_blend_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_detail_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_detail_blend_mode" }
            }
          }

      val set_detail_uv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_detail_uv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_detail_uv" }
            }
          }

      val set_diffuse_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_diffuse_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_diffuse_mode" }
            }
          }

      val set_distance_fade: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_distance_fade".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_distance_fade" }
            }
          }

      val set_distance_fade_max_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_distance_fade_max_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_distance_fade_max_distance"
              }
            }
          }

      val set_distance_fade_min_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_distance_fade_min_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_distance_fade_min_distance"
              }
            }
          }

      val set_emission: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_emission".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission" }
            }
          }

      val set_emission_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_emission_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_energy" }
            }
          }

      val set_emission_operator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_emission_operator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emission_operator" }
            }
          }

      val set_feature: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_feature".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_feature" }
            }
          }

      val set_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flag" }
            }
          }

      val set_grow: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_grow".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_grow" }
            }
          }

      val set_grow_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_grow_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_grow_enabled" }
            }
          }

      val set_line_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_line_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_line_width" }
            }
          }

      val set_metallic: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_metallic".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_metallic" }
            }
          }

      val set_metallic_texture_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_metallic_texture_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_metallic_texture_channel" }
            }
          }

      val set_normal_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_normal_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normal_scale" }
            }
          }

      val set_particles_anim_h_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_particles_anim_h_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_particles_anim_h_frames" }
            }
          }

      val set_particles_anim_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_particles_anim_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_particles_anim_loop" }
            }
          }

      val set_particles_anim_v_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_particles_anim_v_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_particles_anim_v_frames" }
            }
          }

      val set_point_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_point_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_size" }
            }
          }

      val set_proximity_fade: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_proximity_fade".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_proximity_fade" }
            }
          }

      val set_proximity_fade_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_proximity_fade_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_proximity_fade_distance" }
            }
          }

      val set_refraction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_refraction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_refraction" }
            }
          }

      val set_refraction_texture_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_refraction_texture_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_refraction_texture_channel"
              }
            }
          }

      val set_rim: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_rim".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rim" }
            }
          }

      val set_rim_tint: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_rim_tint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rim_tint" }
            }
          }

      val set_roughness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_roughness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_roughness" }
            }
          }

      val set_roughness_texture_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_roughness_texture_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_roughness_texture_channel"
              }
            }
          }

      val set_specular: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_specular".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_specular" }
            }
          }

      val set_specular_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_specular_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_specular_mode" }
            }
          }

      val set_subsurface_scattering_strength: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_subsurface_scattering_strength".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_subsurface_scattering_strength" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val set_transmission: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_transmission".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_transmission" }
            }
          }

      val set_uv1_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_uv1_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_uv1_offset" }
            }
          }

      val set_uv1_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_uv1_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_uv1_scale" }
            }
          }

      val set_uv1_triplanar_blend_sharpness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_uv1_triplanar_blend_sharpness".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_uv1_triplanar_blend_sharpness" }
            }
          }

      val set_uv2_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_uv2_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_uv2_offset" }
            }
          }

      val set_uv2_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_uv2_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_uv2_scale" }
            }
          }

      val set_uv2_triplanar_blend_sharpness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialMaterial".cstr.ptr,
              "set_uv2_triplanar_blend_sharpness".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_uv2_triplanar_blend_sharpness" }
            }
          }
    }
  }
}
