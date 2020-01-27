// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Basis
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

open class Environment internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getAdjustmentBrightness(): Float {
    val _ret = __method_bind.get_adjustment_brightness.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getAdjustmentColorCorrection(): Texture {
    val _ret = __method_bind.get_adjustment_color_correction.call(this.toVariant())
    return _ret.asObject(::Texture)!!
  }

  fun getAdjustmentContrast(): Float {
    val _ret = __method_bind.get_adjustment_contrast.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getAdjustmentSaturation(): Float {
    val _ret = __method_bind.get_adjustment_saturation.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getAmbientLightColor(): Color {
    val _ret = __method_bind.get_ambient_light_color.call(this.toVariant())
    return _ret.asColor()
  }

  fun getAmbientLightEnergy(): Float {
    val _ret = __method_bind.get_ambient_light_energy.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getAmbientLightSkyContribution(): Float {
    val _ret = __method_bind.get_ambient_light_sky_contribution.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getBackground(): BGMode {
    val _ret = __method_bind.get_background.call(this.toVariant())
    return Environment.BGMode.from(_ret.asInt())
  }

  fun getBgColor(): Color {
    val _ret = __method_bind.get_bg_color.call(this.toVariant())
    return _ret.asColor()
  }

  fun getBgEnergy(): Float {
    val _ret = __method_bind.get_bg_energy.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getCameraFeedId(): Int {
    val _ret = __method_bind.get_camera_feed_id.call(this.toVariant())
    return _ret.asInt()
  }

  fun getCanvasMaxLayer(): Int {
    val _ret = __method_bind.get_canvas_max_layer.call(this.toVariant())
    return _ret.asInt()
  }

  fun getDofBlurFarAmount(): Float {
    val _ret = __method_bind.get_dof_blur_far_amount.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getDofBlurFarDistance(): Float {
    val _ret = __method_bind.get_dof_blur_far_distance.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getDofBlurFarQuality(): DOFBlurQuality {
    val _ret = __method_bind.get_dof_blur_far_quality.call(this.toVariant())
    return Environment.DOFBlurQuality.from(_ret.asInt())
  }

  fun getDofBlurFarTransition(): Float {
    val _ret = __method_bind.get_dof_blur_far_transition.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getDofBlurNearAmount(): Float {
    val _ret = __method_bind.get_dof_blur_near_amount.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getDofBlurNearDistance(): Float {
    val _ret = __method_bind.get_dof_blur_near_distance.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getDofBlurNearQuality(): DOFBlurQuality {
    val _ret = __method_bind.get_dof_blur_near_quality.call(this.toVariant())
    return Environment.DOFBlurQuality.from(_ret.asInt())
  }

  fun getDofBlurNearTransition(): Float {
    val _ret = __method_bind.get_dof_blur_near_transition.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFogColor(): Color {
    val _ret = __method_bind.get_fog_color.call(this.toVariant())
    return _ret.asColor()
  }

  fun getFogDepthBegin(): Float {
    val _ret = __method_bind.get_fog_depth_begin.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFogDepthCurve(): Float {
    val _ret = __method_bind.get_fog_depth_curve.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFogDepthEnd(): Float {
    val _ret = __method_bind.get_fog_depth_end.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFogHeightCurve(): Float {
    val _ret = __method_bind.get_fog_height_curve.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFogHeightMax(): Float {
    val _ret = __method_bind.get_fog_height_max.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFogHeightMin(): Float {
    val _ret = __method_bind.get_fog_height_min.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFogSunAmount(): Float {
    val _ret = __method_bind.get_fog_sun_amount.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFogSunColor(): Color {
    val _ret = __method_bind.get_fog_sun_color.call(this.toVariant())
    return _ret.asColor()
  }

  fun getFogTransmitCurve(): Float {
    val _ret = __method_bind.get_fog_transmit_curve.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getGlowBlendMode(): GlowBlendMode {
    val _ret = __method_bind.get_glow_blend_mode.call(this.toVariant())
    return Environment.GlowBlendMode.from(_ret.asInt())
  }

  fun getGlowBloom(): Float {
    val _ret = __method_bind.get_glow_bloom.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getGlowHdrBleedScale(): Float {
    val _ret = __method_bind.get_glow_hdr_bleed_scale.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getGlowHdrBleedThreshold(): Float {
    val _ret = __method_bind.get_glow_hdr_bleed_threshold.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getGlowHdrLuminanceCap(): Float {
    val _ret = __method_bind.get_glow_hdr_luminance_cap.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getGlowIntensity(): Float {
    val _ret = __method_bind.get_glow_intensity.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getGlowStrength(): Float {
    val _ret = __method_bind.get_glow_strength.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSky(): Sky {
    val _ret = __method_bind.get_sky.call(this.toVariant())
    return _ret.asObject(::Sky)!!
  }

  fun getSkyCustomFov(): Float {
    val _ret = __method_bind.get_sky_custom_fov.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSkyOrientation(): Basis {
    val _ret = __method_bind.get_sky_orientation.call(this.toVariant())
    return _ret.asBasis()
  }

  fun getSkyRotation(): Vector3 {
    val _ret = __method_bind.get_sky_rotation.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getSkyRotationDegrees(): Vector3 {
    val _ret = __method_bind.get_sky_rotation_degrees.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getSsaoAoChannelAffect(): Float {
    val _ret = __method_bind.get_ssao_ao_channel_affect.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSsaoBias(): Float {
    val _ret = __method_bind.get_ssao_bias.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSsaoBlur(): SSAOBlur {
    val _ret = __method_bind.get_ssao_blur.call(this.toVariant())
    return Environment.SSAOBlur.from(_ret.asInt())
  }

  fun getSsaoColor(): Color {
    val _ret = __method_bind.get_ssao_color.call(this.toVariant())
    return _ret.asColor()
  }

  fun getSsaoDirectLightAffect(): Float {
    val _ret = __method_bind.get_ssao_direct_light_affect.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSsaoEdgeSharpness(): Float {
    val _ret = __method_bind.get_ssao_edge_sharpness.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSsaoIntensity(): Float {
    val _ret = __method_bind.get_ssao_intensity.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSsaoIntensity2(): Float {
    val _ret = __method_bind.get_ssao_intensity2.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSsaoQuality(): SSAOQuality {
    val _ret = __method_bind.get_ssao_quality.call(this.toVariant())
    return Environment.SSAOQuality.from(_ret.asInt())
  }

  fun getSsaoRadius(): Float {
    val _ret = __method_bind.get_ssao_radius.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSsaoRadius2(): Float {
    val _ret = __method_bind.get_ssao_radius2.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSsrDepthTolerance(): Float {
    val _ret = __method_bind.get_ssr_depth_tolerance.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSsrFadeIn(): Float {
    val _ret = __method_bind.get_ssr_fade_in.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSsrFadeOut(): Float {
    val _ret = __method_bind.get_ssr_fade_out.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSsrMaxSteps(): Int {
    val _ret = __method_bind.get_ssr_max_steps.call(this.toVariant())
    return _ret.asInt()
  }

  fun getTonemapAutoExposure(): Boolean {
    val _ret = __method_bind.get_tonemap_auto_exposure.call(this.toVariant())
    return _ret.asBool()
  }

  fun getTonemapAutoExposureGrey(): Float {
    val _ret = __method_bind.get_tonemap_auto_exposure_grey.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getTonemapAutoExposureMax(): Float {
    val _ret = __method_bind.get_tonemap_auto_exposure_max.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getTonemapAutoExposureMin(): Float {
    val _ret = __method_bind.get_tonemap_auto_exposure_min.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getTonemapAutoExposureSpeed(): Float {
    val _ret = __method_bind.get_tonemap_auto_exposure_speed.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getTonemapExposure(): Float {
    val _ret = __method_bind.get_tonemap_exposure.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getTonemapWhite(): Float {
    val _ret = __method_bind.get_tonemap_white.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getTonemapper(): ToneMapper {
    val _ret = __method_bind.get_tonemapper.call(this.toVariant())
    return Environment.ToneMapper.from(_ret.asInt())
  }

  fun isAdjustmentEnabled(): Boolean {
    val _ret = __method_bind.is_adjustment_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isDofBlurFarEnabled(): Boolean {
    val _ret = __method_bind.is_dof_blur_far_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isDofBlurNearEnabled(): Boolean {
    val _ret = __method_bind.is_dof_blur_near_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isFogDepthEnabled(): Boolean {
    val _ret = __method_bind.is_fog_depth_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isFogEnabled(): Boolean {
    val _ret = __method_bind.is_fog_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isFogHeightEnabled(): Boolean {
    val _ret = __method_bind.is_fog_height_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isFogTransmitEnabled(): Boolean {
    val _ret = __method_bind.is_fog_transmit_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isGlowBicubicUpscaleEnabled(): Boolean {
    val _ret = __method_bind.is_glow_bicubic_upscale_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isGlowEnabled(): Boolean {
    val _ret = __method_bind.is_glow_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isGlowLevelEnabled(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.is_glow_level_enabled.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun isSsaoEnabled(): Boolean {
    val _ret = __method_bind.is_ssao_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isSsrEnabled(): Boolean {
    val _ret = __method_bind.is_ssr_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isSsrRough(): Boolean {
    val _ret = __method_bind.is_ssr_rough.call(this.toVariant())
    return _ret.asBool()
  }

  fun setAdjustmentBrightness(brightness: Float) {
    val _arg = Variant.new(brightness)
    __method_bind.set_adjustment_brightness.call(this.toVariant(), _arg, 1)
  }

  fun setAdjustmentColorCorrection(colorCorrection: Texture) {
    val _arg = Variant.new(colorCorrection)
    __method_bind.set_adjustment_color_correction.call(this.toVariant(), _arg, 1)
  }

  fun setAdjustmentContrast(contrast: Float) {
    val _arg = Variant.new(contrast)
    __method_bind.set_adjustment_contrast.call(this.toVariant(), _arg, 1)
  }

  fun setAdjustmentEnable(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_adjustment_enable.call(this.toVariant(), _arg, 1)
  }

  fun setAdjustmentSaturation(saturation: Float) {
    val _arg = Variant.new(saturation)
    __method_bind.set_adjustment_saturation.call(this.toVariant(), _arg, 1)
  }

  fun setAmbientLightColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.set_ambient_light_color.call(this.toVariant(), _arg, 1)
  }

  fun setAmbientLightEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.set_ambient_light_energy.call(this.toVariant(), _arg, 1)
  }

  fun setAmbientLightSkyContribution(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.set_ambient_light_sky_contribution.call(this.toVariant(), _arg, 1)
  }

  fun setBackground(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_background.call(this.toVariant(), _arg, 1)
  }

  fun setBgColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.set_bg_color.call(this.toVariant(), _arg, 1)
  }

  fun setBgEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.set_bg_energy.call(this.toVariant(), _arg, 1)
  }

  fun setCameraFeedId(cameraFeedId: Int) {
    val _arg = Variant.new(cameraFeedId)
    __method_bind.set_camera_feed_id.call(this.toVariant(), _arg, 1)
  }

  fun setCanvasMaxLayer(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.set_canvas_max_layer.call(this.toVariant(), _arg, 1)
  }

  fun setDofBlurFarAmount(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.set_dof_blur_far_amount.call(this.toVariant(), _arg, 1)
  }

  fun setDofBlurFarDistance(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.set_dof_blur_far_distance.call(this.toVariant(), _arg, 1)
  }

  fun setDofBlurFarEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_dof_blur_far_enabled.call(this.toVariant(), _arg, 1)
  }

  fun setDofBlurFarQuality(intensity: Int) {
    val _arg = Variant.new(intensity)
    __method_bind.set_dof_blur_far_quality.call(this.toVariant(), _arg, 1)
  }

  fun setDofBlurFarTransition(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.set_dof_blur_far_transition.call(this.toVariant(), _arg, 1)
  }

  fun setDofBlurNearAmount(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.set_dof_blur_near_amount.call(this.toVariant(), _arg, 1)
  }

  fun setDofBlurNearDistance(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.set_dof_blur_near_distance.call(this.toVariant(), _arg, 1)
  }

  fun setDofBlurNearEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_dof_blur_near_enabled.call(this.toVariant(), _arg, 1)
  }

  fun setDofBlurNearQuality(level: Int) {
    val _arg = Variant.new(level)
    __method_bind.set_dof_blur_near_quality.call(this.toVariant(), _arg, 1)
  }

  fun setDofBlurNearTransition(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.set_dof_blur_near_transition.call(this.toVariant(), _arg, 1)
  }

  fun setFogColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.set_fog_color.call(this.toVariant(), _arg, 1)
  }

  fun setFogDepthBegin(distance: Float) {
    val _arg = Variant.new(distance)
    __method_bind.set_fog_depth_begin.call(this.toVariant(), _arg, 1)
  }

  fun setFogDepthCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.set_fog_depth_curve.call(this.toVariant(), _arg, 1)
  }

  fun setFogDepthEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_fog_depth_enabled.call(this.toVariant(), _arg, 1)
  }

  fun setFogDepthEnd(distance: Float) {
    val _arg = Variant.new(distance)
    __method_bind.set_fog_depth_end.call(this.toVariant(), _arg, 1)
  }

  fun setFogEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_fog_enabled.call(this.toVariant(), _arg, 1)
  }

  fun setFogHeightCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.set_fog_height_curve.call(this.toVariant(), _arg, 1)
  }

  fun setFogHeightEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_fog_height_enabled.call(this.toVariant(), _arg, 1)
  }

  fun setFogHeightMax(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.set_fog_height_max.call(this.toVariant(), _arg, 1)
  }

  fun setFogHeightMin(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.set_fog_height_min.call(this.toVariant(), _arg, 1)
  }

  fun setFogSunAmount(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_fog_sun_amount.call(this.toVariant(), _arg, 1)
  }

  fun setFogSunColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.set_fog_sun_color.call(this.toVariant(), _arg, 1)
  }

  fun setFogTransmitCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.set_fog_transmit_curve.call(this.toVariant(), _arg, 1)
  }

  fun setFogTransmitEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_fog_transmit_enabled.call(this.toVariant(), _arg, 1)
  }

  fun setGlowBicubicUpscale(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_glow_bicubic_upscale.call(this.toVariant(), _arg, 1)
  }

  fun setGlowBlendMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_glow_blend_mode.call(this.toVariant(), _arg, 1)
  }

  fun setGlowBloom(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_glow_bloom.call(this.toVariant(), _arg, 1)
  }

  fun setGlowEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_glow_enabled.call(this.toVariant(), _arg, 1)
  }

  fun setGlowHdrBleedScale(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.set_glow_hdr_bleed_scale.call(this.toVariant(), _arg, 1)
  }

  fun setGlowHdrBleedThreshold(threshold: Float) {
    val _arg = Variant.new(threshold)
    __method_bind.set_glow_hdr_bleed_threshold.call(this.toVariant(), _arg, 1)
  }

  fun setGlowHdrLuminanceCap(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_glow_hdr_luminance_cap.call(this.toVariant(), _arg, 1)
  }

  fun setGlowIntensity(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.set_glow_intensity.call(this.toVariant(), _arg, 1)
  }

  fun setGlowLevel(idx: Int, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(enabled)
    __method_bind.set_glow_level.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setGlowStrength(strength: Float) {
    val _arg = Variant.new(strength)
    __method_bind.set_glow_strength.call(this.toVariant(), _arg, 1)
  }

  fun setSky(sky: Sky) {
    val _arg = Variant.new(sky)
    __method_bind.set_sky.call(this.toVariant(), _arg, 1)
  }

  fun setSkyCustomFov(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.set_sky_custom_fov.call(this.toVariant(), _arg, 1)
  }

  fun setSkyOrientation(orientation: Basis) {
    val _arg = Variant.new(orientation)
    __method_bind.set_sky_orientation.call(this.toVariant(), _arg, 1)
  }

  fun setSkyRotation(eulerRadians: Vector3) {
    val _arg = Variant.new(eulerRadians)
    __method_bind.set_sky_rotation.call(this.toVariant(), _arg, 1)
  }

  fun setSkyRotationDegrees(eulerDegrees: Vector3) {
    val _arg = Variant.new(eulerDegrees)
    __method_bind.set_sky_rotation_degrees.call(this.toVariant(), _arg, 1)
  }

  fun setSsaoAoChannelAffect(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_ssao_ao_channel_affect.call(this.toVariant(), _arg, 1)
  }

  fun setSsaoBias(bias: Float) {
    val _arg = Variant.new(bias)
    __method_bind.set_ssao_bias.call(this.toVariant(), _arg, 1)
  }

  fun setSsaoBlur(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_ssao_blur.call(this.toVariant(), _arg, 1)
  }

  fun setSsaoColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.set_ssao_color.call(this.toVariant(), _arg, 1)
  }

  fun setSsaoDirectLightAffect(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_ssao_direct_light_affect.call(this.toVariant(), _arg, 1)
  }

  fun setSsaoEdgeSharpness(edgeSharpness: Float) {
    val _arg = Variant.new(edgeSharpness)
    __method_bind.set_ssao_edge_sharpness.call(this.toVariant(), _arg, 1)
  }

  fun setSsaoEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_ssao_enabled.call(this.toVariant(), _arg, 1)
  }

  fun setSsaoIntensity(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.set_ssao_intensity.call(this.toVariant(), _arg, 1)
  }

  fun setSsaoIntensity2(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.set_ssao_intensity2.call(this.toVariant(), _arg, 1)
  }

  fun setSsaoQuality(quality: Int) {
    val _arg = Variant.new(quality)
    __method_bind.set_ssao_quality.call(this.toVariant(), _arg, 1)
  }

  fun setSsaoRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.set_ssao_radius.call(this.toVariant(), _arg, 1)
  }

  fun setSsaoRadius2(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.set_ssao_radius2.call(this.toVariant(), _arg, 1)
  }

  fun setSsrDepthTolerance(depthTolerance: Float) {
    val _arg = Variant.new(depthTolerance)
    __method_bind.set_ssr_depth_tolerance.call(this.toVariant(), _arg, 1)
  }

  fun setSsrEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_ssr_enabled.call(this.toVariant(), _arg, 1)
  }

  fun setSsrFadeIn(fadeIn: Float) {
    val _arg = Variant.new(fadeIn)
    __method_bind.set_ssr_fade_in.call(this.toVariant(), _arg, 1)
  }

  fun setSsrFadeOut(fadeOut: Float) {
    val _arg = Variant.new(fadeOut)
    __method_bind.set_ssr_fade_out.call(this.toVariant(), _arg, 1)
  }

  fun setSsrMaxSteps(maxSteps: Int) {
    val _arg = Variant.new(maxSteps)
    __method_bind.set_ssr_max_steps.call(this.toVariant(), _arg, 1)
  }

  fun setSsrRough(rough: Boolean) {
    val _arg = Variant.new(rough)
    __method_bind.set_ssr_rough.call(this.toVariant(), _arg, 1)
  }

  fun setTonemapAutoExposure(autoExposure: Boolean) {
    val _arg = Variant.new(autoExposure)
    __method_bind.set_tonemap_auto_exposure.call(this.toVariant(), _arg, 1)
  }

  fun setTonemapAutoExposureGrey(exposureGrey: Float) {
    val _arg = Variant.new(exposureGrey)
    __method_bind.set_tonemap_auto_exposure_grey.call(this.toVariant(), _arg, 1)
  }

  fun setTonemapAutoExposureMax(exposureMax: Float) {
    val _arg = Variant.new(exposureMax)
    __method_bind.set_tonemap_auto_exposure_max.call(this.toVariant(), _arg, 1)
  }

  fun setTonemapAutoExposureMin(exposureMin: Float) {
    val _arg = Variant.new(exposureMin)
    __method_bind.set_tonemap_auto_exposure_min.call(this.toVariant(), _arg, 1)
  }

  fun setTonemapAutoExposureSpeed(exposureSpeed: Float) {
    val _arg = Variant.new(exposureSpeed)
    __method_bind.set_tonemap_auto_exposure_speed.call(this.toVariant(), _arg, 1)
  }

  fun setTonemapExposure(exposure: Float) {
    val _arg = Variant.new(exposure)
    __method_bind.set_tonemap_exposure.call(this.toVariant(), _arg, 1)
  }

  fun setTonemapWhite(white: Float) {
    val _arg = Variant.new(white)
    __method_bind.set_tonemap_white.call(this.toVariant(), _arg, 1)
  }

  fun setTonemapper(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_tonemapper.call(this.toVariant(), _arg, 1)
  }

  enum class SSAOBlur(
    val value: Int
  ) {
    SSAO_BLUR_DISABLED(0),

    SSAO_BLUR_1x1(1),

    SSAO_BLUR_2x2(2),

    SSAO_BLUR_3x3(3);

    companion object {
      fun from(value: Int): SSAOBlur {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ToneMapper(
    val value: Int
  ) {
    TONE_MAPPER_LINEAR(0),

    TONE_MAPPER_REINHARDT(1),

    TONE_MAPPER_FILMIC(2),

    TONE_MAPPER_ACES(3);

    companion object {
      fun from(value: Int): ToneMapper {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class GlowBlendMode(
    val value: Int
  ) {
    GLOW_BLEND_MODE_ADDITIVE(0),

    GLOW_BLEND_MODE_SCREEN(1),

    GLOW_BLEND_MODE_SOFTLIGHT(2),

    GLOW_BLEND_MODE_REPLACE(3);

    companion object {
      fun from(value: Int): GlowBlendMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class BGMode(
    val value: Int
  ) {
    BG_CLEAR_COLOR(0),

    BG_COLOR(1),

    BG_SKY(2),

    BG_COLOR_SKY(3),

    BG_CANVAS(4),

    BG_KEEP(5),

    BG_CAMERA_FEED(6),

    BG_MAX(7);

    companion object {
      fun from(value: Int): BGMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class SSAOQuality(
    val value: Int
  ) {
    SSAO_QUALITY_LOW(0),

    SSAO_QUALITY_MEDIUM(1),

    SSAO_QUALITY_HIGH(2);

    companion object {
      fun from(value: Int): SSAOQuality {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DOFBlurQuality(
    val value: Int
  ) {
    DOF_BLUR_QUALITY_LOW(0),

    DOF_BLUR_QUALITY_MEDIUM(1),

    DOF_BLUR_QUALITY_HIGH(2);

    companion object {
      fun from(value: Int): DOFBlurQuality {
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
    val BG_CAMERA_FEED: Int = 6

    val BG_CANVAS: Int = 4

    val BG_CLEAR_COLOR: Int = 0

    val BG_COLOR: Int = 1

    val BG_COLOR_SKY: Int = 3

    val BG_KEEP: Int = 5

    val BG_MAX: Int = 7

    val BG_SKY: Int = 2

    val DOF_BLUR_QUALITY_HIGH: Int = 2

    val DOF_BLUR_QUALITY_LOW: Int = 0

    val DOF_BLUR_QUALITY_MEDIUM: Int = 1

    val GLOW_BLEND_MODE_ADDITIVE: Int = 0

    val GLOW_BLEND_MODE_REPLACE: Int = 3

    val GLOW_BLEND_MODE_SCREEN: Int = 1

    val GLOW_BLEND_MODE_SOFTLIGHT: Int = 2

    val SSAO_BLUR_1x1: Int = 1

    val SSAO_BLUR_2x2: Int = 2

    val SSAO_BLUR_3x3: Int = 3

    val SSAO_BLUR_DISABLED: Int = 0

    val SSAO_QUALITY_HIGH: Int = 2

    val SSAO_QUALITY_LOW: Int = 0

    val SSAO_QUALITY_MEDIUM: Int = 1

    val TONE_MAPPER_ACES: Int = 3

    val TONE_MAPPER_FILMIC: Int = 2

    val TONE_MAPPER_LINEAR: Int = 0

    val TONE_MAPPER_REINHARDT: Int = 1

    fun new(): Environment = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Environment".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Environment" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Environment(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Environment = Environment(ptr)
    /**
     * Container for method_bind pointers for Environment
     */
    private object __method_bind {
      val get_adjustment_brightness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_adjustment_brightness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_adjustment_brightness" }
            }
          }

      val get_adjustment_color_correction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_adjustment_color_correction".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_adjustment_color_correction" }
            }
          }

      val get_adjustment_contrast: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_adjustment_contrast".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_adjustment_contrast" }
            }
          }

      val get_adjustment_saturation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_adjustment_saturation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_adjustment_saturation" }
            }
          }

      val get_ambient_light_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ambient_light_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ambient_light_color" }
            }
          }

      val get_ambient_light_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ambient_light_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ambient_light_energy" }
            }
          }

      val get_ambient_light_sky_contribution: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ambient_light_sky_contribution".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_ambient_light_sky_contribution" }
            }
          }

      val get_background: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_background".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_background" }
            }
          }

      val get_bg_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bg_color" }
            }
          }

      val get_bg_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_bg_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bg_energy" }
            }
          }

      val get_camera_feed_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_camera_feed_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_camera_feed_id" }
            }
          }

      val get_canvas_max_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_canvas_max_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_canvas_max_layer" }
            }
          }

      val get_dof_blur_far_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_far_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_amount" }
            }
          }

      val get_dof_blur_far_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_far_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_distance" }
            }
          }

      val get_dof_blur_far_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_far_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_quality" }
            }
          }

      val get_dof_blur_far_transition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_far_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_transition" }
            }
          }

      val get_dof_blur_near_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_near_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_amount" }
            }
          }

      val get_dof_blur_near_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_near_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_distance" }
            }
          }

      val get_dof_blur_near_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_near_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_quality" }
            }
          }

      val get_dof_blur_near_transition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_dof_blur_near_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_transition" }
            }
          }

      val get_fog_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_color" }
            }
          }

      val get_fog_depth_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_depth_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_depth_begin" }
            }
          }

      val get_fog_depth_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_depth_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_depth_curve" }
            }
          }

      val get_fog_depth_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_depth_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_depth_end" }
            }
          }

      val get_fog_height_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_height_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_height_curve" }
            }
          }

      val get_fog_height_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_height_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_height_max" }
            }
          }

      val get_fog_height_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_height_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_height_min" }
            }
          }

      val get_fog_sun_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_sun_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_sun_amount" }
            }
          }

      val get_fog_sun_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_sun_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_sun_color" }
            }
          }

      val get_fog_transmit_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_fog_transmit_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fog_transmit_curve" }
            }
          }

      val get_glow_blend_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_glow_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_glow_blend_mode" }
            }
          }

      val get_glow_bloom: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_glow_bloom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_glow_bloom" }
            }
          }

      val get_glow_hdr_bleed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_glow_hdr_bleed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_glow_hdr_bleed_scale" }
            }
          }

      val get_glow_hdr_bleed_threshold: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_glow_hdr_bleed_threshold".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_glow_hdr_bleed_threshold" }
            }
          }

      val get_glow_hdr_luminance_cap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_glow_hdr_luminance_cap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_glow_hdr_luminance_cap" }
            }
          }

      val get_glow_intensity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_glow_intensity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_glow_intensity" }
            }
          }

      val get_glow_strength: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_glow_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_glow_strength" }
            }
          }

      val get_sky: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_sky".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sky" }
            }
          }

      val get_sky_custom_fov: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_sky_custom_fov".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sky_custom_fov" }
            }
          }

      val get_sky_orientation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_sky_orientation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sky_orientation" }
            }
          }

      val get_sky_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_sky_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sky_rotation" }
            }
          }

      val get_sky_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_sky_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sky_rotation_degrees" }
            }
          }

      val get_ssao_ao_channel_affect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_ao_channel_affect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_ao_channel_affect" }
            }
          }

      val get_ssao_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_bias" }
            }
          }

      val get_ssao_blur: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_blur".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_blur" }
            }
          }

      val get_ssao_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_color" }
            }
          }

      val get_ssao_direct_light_affect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_direct_light_affect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_direct_light_affect" }
            }
          }

      val get_ssao_edge_sharpness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_edge_sharpness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_edge_sharpness" }
            }
          }

      val get_ssao_intensity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_intensity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_intensity" }
            }
          }

      val get_ssao_intensity2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_intensity2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_intensity2" }
            }
          }

      val get_ssao_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_quality" }
            }
          }

      val get_ssao_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_radius" }
            }
          }

      val get_ssao_radius2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssao_radius2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssao_radius2" }
            }
          }

      val get_ssr_depth_tolerance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssr_depth_tolerance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssr_depth_tolerance" }
            }
          }

      val get_ssr_fade_in: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssr_fade_in".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssr_fade_in" }
            }
          }

      val get_ssr_fade_out: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssr_fade_out".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssr_fade_out" }
            }
          }

      val get_ssr_max_steps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_ssr_max_steps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ssr_max_steps" }
            }
          }

      val get_tonemap_auto_exposure: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemap_auto_exposure".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure" }
            }
          }

      val get_tonemap_auto_exposure_grey: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemap_auto_exposure_grey".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure_grey"
              }
            }
          }

      val get_tonemap_auto_exposure_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemap_auto_exposure_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure_max"
              }
            }
          }

      val get_tonemap_auto_exposure_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemap_auto_exposure_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure_min"
              }
            }
          }

      val get_tonemap_auto_exposure_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemap_auto_exposure_speed".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_tonemap_auto_exposure_speed" }
            }
          }

      val get_tonemap_exposure: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemap_exposure".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tonemap_exposure" }
            }
          }

      val get_tonemap_white: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemap_white".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tonemap_white" }
            }
          }

      val get_tonemapper: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "get_tonemapper".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tonemapper" }
            }
          }

      val is_adjustment_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_adjustment_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_adjustment_enabled" }
            }
          }

      val is_dof_blur_far_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_dof_blur_far_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_dof_blur_far_enabled" }
            }
          }

      val is_dof_blur_near_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_dof_blur_near_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_dof_blur_near_enabled" }
            }
          }

      val is_fog_depth_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_fog_depth_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_fog_depth_enabled" }
            }
          }

      val is_fog_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_fog_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_fog_enabled" }
            }
          }

      val is_fog_height_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_fog_height_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_fog_height_enabled" }
            }
          }

      val is_fog_transmit_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_fog_transmit_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_fog_transmit_enabled" }
            }
          }

      val is_glow_bicubic_upscale_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_glow_bicubic_upscale_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_glow_bicubic_upscale_enabled" }
            }
          }

      val is_glow_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_glow_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_glow_enabled" }
            }
          }

      val is_glow_level_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_glow_level_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_glow_level_enabled" }
            }
          }

      val is_ssao_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_ssao_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_ssao_enabled" }
            }
          }

      val is_ssr_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_ssr_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_ssr_enabled" }
            }
          }

      val is_ssr_rough: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "is_ssr_rough".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_ssr_rough" }
            }
          }

      val set_adjustment_brightness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_adjustment_brightness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_adjustment_brightness" }
            }
          }

      val set_adjustment_color_correction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_adjustment_color_correction".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_adjustment_color_correction" }
            }
          }

      val set_adjustment_contrast: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_adjustment_contrast".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_adjustment_contrast" }
            }
          }

      val set_adjustment_enable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_adjustment_enable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_adjustment_enable" }
            }
          }

      val set_adjustment_saturation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_adjustment_saturation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_adjustment_saturation" }
            }
          }

      val set_ambient_light_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ambient_light_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ambient_light_color" }
            }
          }

      val set_ambient_light_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ambient_light_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ambient_light_energy" }
            }
          }

      val set_ambient_light_sky_contribution: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ambient_light_sky_contribution".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_ambient_light_sky_contribution" }
            }
          }

      val set_background: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_background".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_background" }
            }
          }

      val set_bg_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bg_color" }
            }
          }

      val set_bg_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_bg_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bg_energy" }
            }
          }

      val set_camera_feed_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_camera_feed_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_camera_feed_id" }
            }
          }

      val set_canvas_max_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_canvas_max_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_canvas_max_layer" }
            }
          }

      val set_dof_blur_far_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_far_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_amount" }
            }
          }

      val set_dof_blur_far_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_far_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_distance" }
            }
          }

      val set_dof_blur_far_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_far_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_enabled" }
            }
          }

      val set_dof_blur_far_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_far_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_quality" }
            }
          }

      val set_dof_blur_far_transition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_far_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_transition" }
            }
          }

      val set_dof_blur_near_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_near_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_amount" }
            }
          }

      val set_dof_blur_near_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_near_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_distance" }
            }
          }

      val set_dof_blur_near_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_near_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_enabled" }
            }
          }

      val set_dof_blur_near_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_near_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_quality" }
            }
          }

      val set_dof_blur_near_transition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_dof_blur_near_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_transition" }
            }
          }

      val set_fog_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_color" }
            }
          }

      val set_fog_depth_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_depth_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_depth_begin" }
            }
          }

      val set_fog_depth_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_depth_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_depth_curve" }
            }
          }

      val set_fog_depth_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_depth_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_depth_enabled" }
            }
          }

      val set_fog_depth_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_depth_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_depth_end" }
            }
          }

      val set_fog_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_enabled" }
            }
          }

      val set_fog_height_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_height_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_height_curve" }
            }
          }

      val set_fog_height_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_height_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_height_enabled" }
            }
          }

      val set_fog_height_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_height_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_height_max" }
            }
          }

      val set_fog_height_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_height_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_height_min" }
            }
          }

      val set_fog_sun_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_sun_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_sun_amount" }
            }
          }

      val set_fog_sun_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_sun_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_sun_color" }
            }
          }

      val set_fog_transmit_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_transmit_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_transmit_curve" }
            }
          }

      val set_fog_transmit_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_fog_transmit_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fog_transmit_enabled" }
            }
          }

      val set_glow_bicubic_upscale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_bicubic_upscale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_bicubic_upscale" }
            }
          }

      val set_glow_blend_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_blend_mode" }
            }
          }

      val set_glow_bloom: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_bloom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_bloom" }
            }
          }

      val set_glow_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_enabled" }
            }
          }

      val set_glow_hdr_bleed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_hdr_bleed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_hdr_bleed_scale" }
            }
          }

      val set_glow_hdr_bleed_threshold: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_hdr_bleed_threshold".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_hdr_bleed_threshold" }
            }
          }

      val set_glow_hdr_luminance_cap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_hdr_luminance_cap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_hdr_luminance_cap" }
            }
          }

      val set_glow_intensity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_intensity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_intensity" }
            }
          }

      val set_glow_level: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_level".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_level" }
            }
          }

      val set_glow_strength: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_glow_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_glow_strength" }
            }
          }

      val set_sky: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_sky".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sky" }
            }
          }

      val set_sky_custom_fov: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_sky_custom_fov".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sky_custom_fov" }
            }
          }

      val set_sky_orientation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_sky_orientation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sky_orientation" }
            }
          }

      val set_sky_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_sky_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sky_rotation" }
            }
          }

      val set_sky_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_sky_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sky_rotation_degrees" }
            }
          }

      val set_ssao_ao_channel_affect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_ao_channel_affect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_ao_channel_affect" }
            }
          }

      val set_ssao_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_bias" }
            }
          }

      val set_ssao_blur: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_blur".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_blur" }
            }
          }

      val set_ssao_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_color" }
            }
          }

      val set_ssao_direct_light_affect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_direct_light_affect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_direct_light_affect" }
            }
          }

      val set_ssao_edge_sharpness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_edge_sharpness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_edge_sharpness" }
            }
          }

      val set_ssao_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_enabled" }
            }
          }

      val set_ssao_intensity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_intensity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_intensity" }
            }
          }

      val set_ssao_intensity2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_intensity2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_intensity2" }
            }
          }

      val set_ssao_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_quality" }
            }
          }

      val set_ssao_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_radius" }
            }
          }

      val set_ssao_radius2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssao_radius2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssao_radius2" }
            }
          }

      val set_ssr_depth_tolerance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssr_depth_tolerance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssr_depth_tolerance" }
            }
          }

      val set_ssr_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssr_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssr_enabled" }
            }
          }

      val set_ssr_fade_in: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssr_fade_in".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssr_fade_in" }
            }
          }

      val set_ssr_fade_out: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssr_fade_out".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssr_fade_out" }
            }
          }

      val set_ssr_max_steps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssr_max_steps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssr_max_steps" }
            }
          }

      val set_ssr_rough: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_ssr_rough".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ssr_rough" }
            }
          }

      val set_tonemap_auto_exposure: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemap_auto_exposure".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure" }
            }
          }

      val set_tonemap_auto_exposure_grey: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemap_auto_exposure_grey".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure_grey"
              }
            }
          }

      val set_tonemap_auto_exposure_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemap_auto_exposure_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure_max"
              }
            }
          }

      val set_tonemap_auto_exposure_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemap_auto_exposure_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure_min"
              }
            }
          }

      val set_tonemap_auto_exposure_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemap_auto_exposure_speed".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_tonemap_auto_exposure_speed" }
            }
          }

      val set_tonemap_exposure: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemap_exposure".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tonemap_exposure" }
            }
          }

      val set_tonemap_white: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemap_white".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tonemap_white" }
            }
          }

      val set_tonemapper: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
              "set_tonemapper".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tonemapper" }
            }
          }
    }
  }
}
