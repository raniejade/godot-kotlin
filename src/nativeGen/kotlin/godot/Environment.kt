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

open class Environment(
  _handle: COpaquePointer
) : Resource(_handle) {
  var adjustmentBrightness: Float
    get() {
       return getAdjustmentBrightness() 
    }
    set(value) {
      setAdjustmentBrightness(value)
    }

  var adjustmentColorCorrection: Texture
    get() {
       return getAdjustmentColorCorrection() 
    }
    set(value) {
      setAdjustmentColorCorrection(value)
    }

  var adjustmentContrast: Float
    get() {
       return getAdjustmentContrast() 
    }
    set(value) {
      setAdjustmentContrast(value)
    }

  var adjustmentEnabled: Boolean
    get() {
       return isAdjustmentEnabled() 
    }
    set(value) {
      setAdjustmentEnable(value)
    }

  var adjustmentSaturation: Float
    get() {
       return getAdjustmentSaturation() 
    }
    set(value) {
      setAdjustmentSaturation(value)
    }

  var ambientLightColor: Color
    get() {
       return getAmbientLightColor() 
    }
    set(value) {
      setAmbientLightColor(value)
    }

  var ambientLightEnergy: Float
    get() {
       return getAmbientLightEnergy() 
    }
    set(value) {
      setAmbientLightEnergy(value)
    }

  var ambientLightSkyContribution: Float
    get() {
       return getAmbientLightSkyContribution() 
    }
    set(value) {
      setAmbientLightSkyContribution(value)
    }

  var autoExposureEnabled: Boolean
    get() {
       return getTonemapAutoExposure() 
    }
    set(value) {
      setTonemapAutoExposure(value)
    }

  var autoExposureMaxLuma: Float
    get() {
       return getTonemapAutoExposureMax() 
    }
    set(value) {
      setTonemapAutoExposureMax(value)
    }

  var autoExposureMinLuma: Float
    get() {
       return getTonemapAutoExposureMin() 
    }
    set(value) {
      setTonemapAutoExposureMin(value)
    }

  var autoExposureScale: Float
    get() {
       return getTonemapAutoExposureGrey() 
    }
    set(value) {
      setTonemapAutoExposureGrey(value)
    }

  var autoExposureSpeed: Float
    get() {
       return getTonemapAutoExposureSpeed() 
    }
    set(value) {
      setTonemapAutoExposureSpeed(value)
    }

  var backgroundCameraFeedId: Int
    get() {
       return getCameraFeedId() 
    }
    set(value) {
      setCameraFeedId(value)
    }

  var backgroundCanvasMaxLayer: Int
    get() {
       return getCanvasMaxLayer() 
    }
    set(value) {
      setCanvasMaxLayer(value)
    }

  var backgroundColor: Color
    get() {
       return getBgColor() 
    }
    set(value) {
      setBgColor(value)
    }

  var backgroundEnergy: Float
    get() {
       return getBgEnergy() 
    }
    set(value) {
      setBgEnergy(value)
    }

  var backgroundMode: Int
    get() {
       return Environment.BGMode.from(getBackground()) 
    }
    set(value) {
      setBackground(Environment.BGMode.from(value))
    }

  var backgroundSky: Sky
    get() {
       return getSky() 
    }
    set(value) {
      setSky(value)
    }

  var backgroundSkyCustomFov: Float
    get() {
       return getSkyCustomFov() 
    }
    set(value) {
      setSkyCustomFov(value)
    }

  var backgroundSkyOrientation: Basis
    get() {
       return getSkyOrientation() 
    }
    set(value) {
      setSkyOrientation(value)
    }

  var backgroundSkyRotation: Vector3
    get() {
       return getSkyRotation() 
    }
    set(value) {
      setSkyRotation(value)
    }

  var backgroundSkyRotationDegrees: Vector3
    get() {
       return getSkyRotationDegrees() 
    }
    set(value) {
      setSkyRotationDegrees(value)
    }

  var dofBlurFarAmount: Float
    get() {
       return getDofBlurFarAmount() 
    }
    set(value) {
      setDofBlurFarAmount(value)
    }

  var dofBlurFarDistance: Float
    get() {
       return getDofBlurFarDistance() 
    }
    set(value) {
      setDofBlurFarDistance(value)
    }

  var dofBlurFarEnabled: Boolean
    get() {
       return isDofBlurFarEnabled() 
    }
    set(value) {
      setDofBlurFarEnabled(value)
    }

  var dofBlurFarQuality: Int
    get() {
       return Environment.DOFBlurQuality.from(getDofBlurFarQuality()) 
    }
    set(value) {
      setDofBlurFarQuality(Environment.DOFBlurQuality.from(value))
    }

  var dofBlurFarTransition: Float
    get() {
       return getDofBlurFarTransition() 
    }
    set(value) {
      setDofBlurFarTransition(value)
    }

  var dofBlurNearAmount: Float
    get() {
       return getDofBlurNearAmount() 
    }
    set(value) {
      setDofBlurNearAmount(value)
    }

  var dofBlurNearDistance: Float
    get() {
       return getDofBlurNearDistance() 
    }
    set(value) {
      setDofBlurNearDistance(value)
    }

  var dofBlurNearEnabled: Boolean
    get() {
       return isDofBlurNearEnabled() 
    }
    set(value) {
      setDofBlurNearEnabled(value)
    }

  var dofBlurNearQuality: Int
    get() {
       return Environment.DOFBlurQuality.from(getDofBlurNearQuality()) 
    }
    set(value) {
      setDofBlurNearQuality(Environment.DOFBlurQuality.from(value))
    }

  var dofBlurNearTransition: Float
    get() {
       return getDofBlurNearTransition() 
    }
    set(value) {
      setDofBlurNearTransition(value)
    }

  var fogColor: Color
    get() {
       return getFogColor() 
    }
    set(value) {
      setFogColor(value)
    }

  var fogDepthBegin: Float
    get() {
       return getFogDepthBegin() 
    }
    set(value) {
      setFogDepthBegin(value)
    }

  var fogDepthCurve: Float
    get() {
       return getFogDepthCurve() 
    }
    set(value) {
      setFogDepthCurve(value)
    }

  var fogDepthEnabled: Boolean
    get() {
       return isFogDepthEnabled() 
    }
    set(value) {
      setFogDepthEnabled(value)
    }

  var fogDepthEnd: Float
    get() {
       return getFogDepthEnd() 
    }
    set(value) {
      setFogDepthEnd(value)
    }

  var fogEnabled: Boolean
    get() {
       return isFogEnabled() 
    }
    set(value) {
      setFogEnabled(value)
    }

  var fogHeightCurve: Float
    get() {
       return getFogHeightCurve() 
    }
    set(value) {
      setFogHeightCurve(value)
    }

  var fogHeightEnabled: Boolean
    get() {
       return isFogHeightEnabled() 
    }
    set(value) {
      setFogHeightEnabled(value)
    }

  var fogHeightMax: Float
    get() {
       return getFogHeightMax() 
    }
    set(value) {
      setFogHeightMax(value)
    }

  var fogHeightMin: Float
    get() {
       return getFogHeightMin() 
    }
    set(value) {
      setFogHeightMin(value)
    }

  var fogSunAmount: Float
    get() {
       return getFogSunAmount() 
    }
    set(value) {
      setFogSunAmount(value)
    }

  var fogSunColor: Color
    get() {
       return getFogSunColor() 
    }
    set(value) {
      setFogSunColor(value)
    }

  var fogTransmitCurve: Float
    get() {
       return getFogTransmitCurve() 
    }
    set(value) {
      setFogTransmitCurve(value)
    }

  var fogTransmitEnabled: Boolean
    get() {
       return isFogTransmitEnabled() 
    }
    set(value) {
      setFogTransmitEnabled(value)
    }

  var glowBicubicUpscale: Boolean
    get() {
       return isGlowBicubicUpscaleEnabled() 
    }
    set(value) {
      setGlowBicubicUpscale(value)
    }

  var glowBlendMode: Int
    get() {
       return Environment.GlowBlendMode.from(getGlowBlendMode()) 
    }
    set(value) {
      setGlowBlendMode(Environment.GlowBlendMode.from(value))
    }

  var glowBloom: Float
    get() {
       return getGlowBloom() 
    }
    set(value) {
      setGlowBloom(value)
    }

  var glowEnabled: Boolean
    get() {
       return isGlowEnabled() 
    }
    set(value) {
      setGlowEnabled(value)
    }

  var glowHdrLuminanceCap: Float
    get() {
       return getGlowHdrLuminanceCap() 
    }
    set(value) {
      setGlowHdrLuminanceCap(value)
    }

  var glowHdrScale: Float
    get() {
       return getGlowHdrBleedScale() 
    }
    set(value) {
      setGlowHdrBleedScale(value)
    }

  var glowHdrThreshold: Float
    get() {
       return getGlowHdrBleedThreshold() 
    }
    set(value) {
      setGlowHdrBleedThreshold(value)
    }

  var glowIntensity: Float
    get() {
       return getGlowIntensity() 
    }
    set(value) {
      setGlowIntensity(value)
    }

  var glowStrength: Float
    get() {
       return getGlowStrength() 
    }
    set(value) {
      setGlowStrength(value)
    }

  var ssReflectionsDepthTolerance: Float
    get() {
       return getSsrDepthTolerance() 
    }
    set(value) {
      setSsrDepthTolerance(value)
    }

  var ssReflectionsEnabled: Boolean
    get() {
       return isSsrEnabled() 
    }
    set(value) {
      setSsrEnabled(value)
    }

  var ssReflectionsFadeIn: Float
    get() {
       return getSsrFadeIn() 
    }
    set(value) {
      setSsrFadeIn(value)
    }

  var ssReflectionsFadeOut: Float
    get() {
       return getSsrFadeOut() 
    }
    set(value) {
      setSsrFadeOut(value)
    }

  var ssReflectionsMaxSteps: Int
    get() {
       return getSsrMaxSteps() 
    }
    set(value) {
      setSsrMaxSteps(value)
    }

  var ssReflectionsRoughness: Boolean
    get() {
       return isSsrRough() 
    }
    set(value) {
      setSsrRough(value)
    }

  var ssaoAoChannelAffect: Float
    get() {
       return getSsaoAoChannelAffect() 
    }
    set(value) {
      setSsaoAoChannelAffect(value)
    }

  var ssaoBias: Float
    get() {
       return getSsaoBias() 
    }
    set(value) {
      setSsaoBias(value)
    }

  var ssaoBlur: Int
    get() {
       return Environment.SSAOBlur.from(getSsaoBlur()) 
    }
    set(value) {
      setSsaoBlur(Environment.SSAOBlur.from(value))
    }

  var ssaoColor: Color
    get() {
       return getSsaoColor() 
    }
    set(value) {
      setSsaoColor(value)
    }

  var ssaoEdgeSharpness: Float
    get() {
       return getSsaoEdgeSharpness() 
    }
    set(value) {
      setSsaoEdgeSharpness(value)
    }

  var ssaoEnabled: Boolean
    get() {
       return isSsaoEnabled() 
    }
    set(value) {
      setSsaoEnabled(value)
    }

  var ssaoIntensity: Float
    get() {
       return getSsaoIntensity() 
    }
    set(value) {
      setSsaoIntensity(value)
    }

  var ssaoIntensity2: Float
    get() {
       return getSsaoIntensity2() 
    }
    set(value) {
      setSsaoIntensity2(value)
    }

  var ssaoLightAffect: Float
    get() {
       return getSsaoDirectLightAffect() 
    }
    set(value) {
      setSsaoDirectLightAffect(value)
    }

  var ssaoQuality: Int
    get() {
       return Environment.SSAOQuality.from(getSsaoQuality()) 
    }
    set(value) {
      setSsaoQuality(Environment.SSAOQuality.from(value))
    }

  var ssaoRadius: Float
    get() {
       return getSsaoRadius() 
    }
    set(value) {
      setSsaoRadius(value)
    }

  var ssaoRadius2: Float
    get() {
       return getSsaoRadius2() 
    }
    set(value) {
      setSsaoRadius2(value)
    }

  var tonemapExposure: Float
    get() {
       return getTonemapExposure() 
    }
    set(value) {
      setTonemapExposure(value)
    }

  var tonemapMode: Int
    get() {
       return Environment.ToneMapper.from(getTonemapper()) 
    }
    set(value) {
      setTonemapper(Environment.ToneMapper.from(value))
    }

  var tonemapWhite: Float
    get() {
       return getTonemapWhite() 
    }
    set(value) {
      setTonemapWhite(value)
    }

  fun getAdjustmentBrightness(): Float {
    val _ret = __method_bind.getAdjustmentBrightness.call(this._handle)
    return _ret.asFloat()
  }

  fun getAdjustmentColorCorrection(): Texture {
    val _ret = __method_bind.getAdjustmentColorCorrection.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getAdjustmentContrast(): Float {
    val _ret = __method_bind.getAdjustmentContrast.call(this._handle)
    return _ret.asFloat()
  }

  fun getAdjustmentSaturation(): Float {
    val _ret = __method_bind.getAdjustmentSaturation.call(this._handle)
    return _ret.asFloat()
  }

  fun getAmbientLightColor(): Color {
    val _ret = __method_bind.getAmbientLightColor.call(this._handle)
    return _ret.asColor()
  }

  fun getAmbientLightEnergy(): Float {
    val _ret = __method_bind.getAmbientLightEnergy.call(this._handle)
    return _ret.asFloat()
  }

  fun getAmbientLightSkyContribution(): Float {
    val _ret = __method_bind.getAmbientLightSkyContribution.call(this._handle)
    return _ret.asFloat()
  }

  fun getBackground(): BGMode {
    val _ret = __method_bind.getBackground.call(this._handle)
    return Environment.BGMode.from(_ret.asInt())
  }

  fun getBgColor(): Color {
    val _ret = __method_bind.getBgColor.call(this._handle)
    return _ret.asColor()
  }

  fun getBgEnergy(): Float {
    val _ret = __method_bind.getBgEnergy.call(this._handle)
    return _ret.asFloat()
  }

  fun getCameraFeedId(): Int {
    val _ret = __method_bind.getCameraFeedId.call(this._handle)
    return _ret.asInt()
  }

  fun getCanvasMaxLayer(): Int {
    val _ret = __method_bind.getCanvasMaxLayer.call(this._handle)
    return _ret.asInt()
  }

  fun getDofBlurFarAmount(): Float {
    val _ret = __method_bind.getDofBlurFarAmount.call(this._handle)
    return _ret.asFloat()
  }

  fun getDofBlurFarDistance(): Float {
    val _ret = __method_bind.getDofBlurFarDistance.call(this._handle)
    return _ret.asFloat()
  }

  fun getDofBlurFarQuality(): DOFBlurQuality {
    val _ret = __method_bind.getDofBlurFarQuality.call(this._handle)
    return Environment.DOFBlurQuality.from(_ret.asInt())
  }

  fun getDofBlurFarTransition(): Float {
    val _ret = __method_bind.getDofBlurFarTransition.call(this._handle)
    return _ret.asFloat()
  }

  fun getDofBlurNearAmount(): Float {
    val _ret = __method_bind.getDofBlurNearAmount.call(this._handle)
    return _ret.asFloat()
  }

  fun getDofBlurNearDistance(): Float {
    val _ret = __method_bind.getDofBlurNearDistance.call(this._handle)
    return _ret.asFloat()
  }

  fun getDofBlurNearQuality(): DOFBlurQuality {
    val _ret = __method_bind.getDofBlurNearQuality.call(this._handle)
    return Environment.DOFBlurQuality.from(_ret.asInt())
  }

  fun getDofBlurNearTransition(): Float {
    val _ret = __method_bind.getDofBlurNearTransition.call(this._handle)
    return _ret.asFloat()
  }

  fun getFogColor(): Color {
    val _ret = __method_bind.getFogColor.call(this._handle)
    return _ret.asColor()
  }

  fun getFogDepthBegin(): Float {
    val _ret = __method_bind.getFogDepthBegin.call(this._handle)
    return _ret.asFloat()
  }

  fun getFogDepthCurve(): Float {
    val _ret = __method_bind.getFogDepthCurve.call(this._handle)
    return _ret.asFloat()
  }

  fun getFogDepthEnd(): Float {
    val _ret = __method_bind.getFogDepthEnd.call(this._handle)
    return _ret.asFloat()
  }

  fun getFogHeightCurve(): Float {
    val _ret = __method_bind.getFogHeightCurve.call(this._handle)
    return _ret.asFloat()
  }

  fun getFogHeightMax(): Float {
    val _ret = __method_bind.getFogHeightMax.call(this._handle)
    return _ret.asFloat()
  }

  fun getFogHeightMin(): Float {
    val _ret = __method_bind.getFogHeightMin.call(this._handle)
    return _ret.asFloat()
  }

  fun getFogSunAmount(): Float {
    val _ret = __method_bind.getFogSunAmount.call(this._handle)
    return _ret.asFloat()
  }

  fun getFogSunColor(): Color {
    val _ret = __method_bind.getFogSunColor.call(this._handle)
    return _ret.asColor()
  }

  fun getFogTransmitCurve(): Float {
    val _ret = __method_bind.getFogTransmitCurve.call(this._handle)
    return _ret.asFloat()
  }

  fun getGlowBlendMode(): GlowBlendMode {
    val _ret = __method_bind.getGlowBlendMode.call(this._handle)
    return Environment.GlowBlendMode.from(_ret.asInt())
  }

  fun getGlowBloom(): Float {
    val _ret = __method_bind.getGlowBloom.call(this._handle)
    return _ret.asFloat()
  }

  fun getGlowHdrBleedScale(): Float {
    val _ret = __method_bind.getGlowHdrBleedScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getGlowHdrBleedThreshold(): Float {
    val _ret = __method_bind.getGlowHdrBleedThreshold.call(this._handle)
    return _ret.asFloat()
  }

  fun getGlowHdrLuminanceCap(): Float {
    val _ret = __method_bind.getGlowHdrLuminanceCap.call(this._handle)
    return _ret.asFloat()
  }

  fun getGlowIntensity(): Float {
    val _ret = __method_bind.getGlowIntensity.call(this._handle)
    return _ret.asFloat()
  }

  fun getGlowStrength(): Float {
    val _ret = __method_bind.getGlowStrength.call(this._handle)
    return _ret.asFloat()
  }

  fun getSky(): Sky {
    val _ret = __method_bind.getSky.call(this._handle)
    return _ret.asObject(::Sky)!!
  }

  fun getSkyCustomFov(): Float {
    val _ret = __method_bind.getSkyCustomFov.call(this._handle)
    return _ret.asFloat()
  }

  fun getSkyOrientation(): Basis {
    val _ret = __method_bind.getSkyOrientation.call(this._handle)
    return _ret.asBasis()
  }

  fun getSkyRotation(): Vector3 {
    val _ret = __method_bind.getSkyRotation.call(this._handle)
    return _ret.asVector3()
  }

  fun getSkyRotationDegrees(): Vector3 {
    val _ret = __method_bind.getSkyRotationDegrees.call(this._handle)
    return _ret.asVector3()
  }

  fun getSsaoAoChannelAffect(): Float {
    val _ret = __method_bind.getSsaoAoChannelAffect.call(this._handle)
    return _ret.asFloat()
  }

  fun getSsaoBias(): Float {
    val _ret = __method_bind.getSsaoBias.call(this._handle)
    return _ret.asFloat()
  }

  fun getSsaoBlur(): SSAOBlur {
    val _ret = __method_bind.getSsaoBlur.call(this._handle)
    return Environment.SSAOBlur.from(_ret.asInt())
  }

  fun getSsaoColor(): Color {
    val _ret = __method_bind.getSsaoColor.call(this._handle)
    return _ret.asColor()
  }

  fun getSsaoDirectLightAffect(): Float {
    val _ret = __method_bind.getSsaoDirectLightAffect.call(this._handle)
    return _ret.asFloat()
  }

  fun getSsaoEdgeSharpness(): Float {
    val _ret = __method_bind.getSsaoEdgeSharpness.call(this._handle)
    return _ret.asFloat()
  }

  fun getSsaoIntensity(): Float {
    val _ret = __method_bind.getSsaoIntensity.call(this._handle)
    return _ret.asFloat()
  }

  fun getSsaoIntensity2(): Float {
    val _ret = __method_bind.getSsaoIntensity2.call(this._handle)
    return _ret.asFloat()
  }

  fun getSsaoQuality(): SSAOQuality {
    val _ret = __method_bind.getSsaoQuality.call(this._handle)
    return Environment.SSAOQuality.from(_ret.asInt())
  }

  fun getSsaoRadius(): Float {
    val _ret = __method_bind.getSsaoRadius.call(this._handle)
    return _ret.asFloat()
  }

  fun getSsaoRadius2(): Float {
    val _ret = __method_bind.getSsaoRadius2.call(this._handle)
    return _ret.asFloat()
  }

  fun getSsrDepthTolerance(): Float {
    val _ret = __method_bind.getSsrDepthTolerance.call(this._handle)
    return _ret.asFloat()
  }

  fun getSsrFadeIn(): Float {
    val _ret = __method_bind.getSsrFadeIn.call(this._handle)
    return _ret.asFloat()
  }

  fun getSsrFadeOut(): Float {
    val _ret = __method_bind.getSsrFadeOut.call(this._handle)
    return _ret.asFloat()
  }

  fun getSsrMaxSteps(): Int {
    val _ret = __method_bind.getSsrMaxSteps.call(this._handle)
    return _ret.asInt()
  }

  fun getTonemapAutoExposure(): Boolean {
    val _ret = __method_bind.getTonemapAutoExposure.call(this._handle)
    return _ret.asBoolean()
  }

  fun getTonemapAutoExposureGrey(): Float {
    val _ret = __method_bind.getTonemapAutoExposureGrey.call(this._handle)
    return _ret.asFloat()
  }

  fun getTonemapAutoExposureMax(): Float {
    val _ret = __method_bind.getTonemapAutoExposureMax.call(this._handle)
    return _ret.asFloat()
  }

  fun getTonemapAutoExposureMin(): Float {
    val _ret = __method_bind.getTonemapAutoExposureMin.call(this._handle)
    return _ret.asFloat()
  }

  fun getTonemapAutoExposureSpeed(): Float {
    val _ret = __method_bind.getTonemapAutoExposureSpeed.call(this._handle)
    return _ret.asFloat()
  }

  fun getTonemapExposure(): Float {
    val _ret = __method_bind.getTonemapExposure.call(this._handle)
    return _ret.asFloat()
  }

  fun getTonemapWhite(): Float {
    val _ret = __method_bind.getTonemapWhite.call(this._handle)
    return _ret.asFloat()
  }

  fun getTonemapper(): ToneMapper {
    val _ret = __method_bind.getTonemapper.call(this._handle)
    return Environment.ToneMapper.from(_ret.asInt())
  }

  fun isAdjustmentEnabled(): Boolean {
    val _ret = __method_bind.isAdjustmentEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDofBlurFarEnabled(): Boolean {
    val _ret = __method_bind.isDofBlurFarEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDofBlurNearEnabled(): Boolean {
    val _ret = __method_bind.isDofBlurNearEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFogDepthEnabled(): Boolean {
    val _ret = __method_bind.isFogDepthEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFogEnabled(): Boolean {
    val _ret = __method_bind.isFogEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFogHeightEnabled(): Boolean {
    val _ret = __method_bind.isFogHeightEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFogTransmitEnabled(): Boolean {
    val _ret = __method_bind.isFogTransmitEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isGlowBicubicUpscaleEnabled(): Boolean {
    val _ret = __method_bind.isGlowBicubicUpscaleEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isGlowEnabled(): Boolean {
    val _ret = __method_bind.isGlowEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isGlowLevelEnabled(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isGlowLevelEnabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isSsaoEnabled(): Boolean {
    val _ret = __method_bind.isSsaoEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSsrEnabled(): Boolean {
    val _ret = __method_bind.isSsrEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSsrRough(): Boolean {
    val _ret = __method_bind.isSsrRough.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAdjustmentBrightness(brightness: Float) {
    val _arg = Variant.new(brightness)
    __method_bind.setAdjustmentBrightness.call(this._handle, _arg, 1)
  }

  fun setAdjustmentColorCorrection(colorCorrection: Texture) {
    val _arg = Variant.new(colorCorrection)
    __method_bind.setAdjustmentColorCorrection.call(this._handle, _arg, 1)
  }

  fun setAdjustmentContrast(contrast: Float) {
    val _arg = Variant.new(contrast)
    __method_bind.setAdjustmentContrast.call(this._handle, _arg, 1)
  }

  fun setAdjustmentEnable(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setAdjustmentEnable.call(this._handle, _arg, 1)
  }

  fun setAdjustmentSaturation(saturation: Float) {
    val _arg = Variant.new(saturation)
    __method_bind.setAdjustmentSaturation.call(this._handle, _arg, 1)
  }

  fun setAmbientLightColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setAmbientLightColor.call(this._handle, _arg, 1)
  }

  fun setAmbientLightEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setAmbientLightEnergy.call(this._handle, _arg, 1)
  }

  fun setAmbientLightSkyContribution(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setAmbientLightSkyContribution.call(this._handle, _arg, 1)
  }

  fun setBackground(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setBackground.call(this._handle, _arg, 1)
  }

  fun setBgColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setBgColor.call(this._handle, _arg, 1)
  }

  fun setBgEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setBgEnergy.call(this._handle, _arg, 1)
  }

  fun setCameraFeedId(cameraFeedId: Int) {
    val _arg = Variant.new(cameraFeedId)
    __method_bind.setCameraFeedId.call(this._handle, _arg, 1)
  }

  fun setCanvasMaxLayer(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.setCanvasMaxLayer.call(this._handle, _arg, 1)
  }

  fun setDofBlurFarAmount(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setDofBlurFarAmount.call(this._handle, _arg, 1)
  }

  fun setDofBlurFarDistance(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setDofBlurFarDistance.call(this._handle, _arg, 1)
  }

  fun setDofBlurFarEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setDofBlurFarEnabled.call(this._handle, _arg, 1)
  }

  fun setDofBlurFarQuality(intensity: Int) {
    val _arg = Variant.new(intensity)
    __method_bind.setDofBlurFarQuality.call(this._handle, _arg, 1)
  }

  fun setDofBlurFarTransition(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setDofBlurFarTransition.call(this._handle, _arg, 1)
  }

  fun setDofBlurNearAmount(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setDofBlurNearAmount.call(this._handle, _arg, 1)
  }

  fun setDofBlurNearDistance(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setDofBlurNearDistance.call(this._handle, _arg, 1)
  }

  fun setDofBlurNearEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setDofBlurNearEnabled.call(this._handle, _arg, 1)
  }

  fun setDofBlurNearQuality(level: Int) {
    val _arg = Variant.new(level)
    __method_bind.setDofBlurNearQuality.call(this._handle, _arg, 1)
  }

  fun setDofBlurNearTransition(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setDofBlurNearTransition.call(this._handle, _arg, 1)
  }

  fun setFogColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setFogColor.call(this._handle, _arg, 1)
  }

  fun setFogDepthBegin(distance: Float) {
    val _arg = Variant.new(distance)
    __method_bind.setFogDepthBegin.call(this._handle, _arg, 1)
  }

  fun setFogDepthCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.setFogDepthCurve.call(this._handle, _arg, 1)
  }

  fun setFogDepthEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setFogDepthEnabled.call(this._handle, _arg, 1)
  }

  fun setFogDepthEnd(distance: Float) {
    val _arg = Variant.new(distance)
    __method_bind.setFogDepthEnd.call(this._handle, _arg, 1)
  }

  fun setFogEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setFogEnabled.call(this._handle, _arg, 1)
  }

  fun setFogHeightCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.setFogHeightCurve.call(this._handle, _arg, 1)
  }

  fun setFogHeightEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setFogHeightEnabled.call(this._handle, _arg, 1)
  }

  fun setFogHeightMax(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.setFogHeightMax.call(this._handle, _arg, 1)
  }

  fun setFogHeightMin(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.setFogHeightMin.call(this._handle, _arg, 1)
  }

  fun setFogSunAmount(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setFogSunAmount.call(this._handle, _arg, 1)
  }

  fun setFogSunColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setFogSunColor.call(this._handle, _arg, 1)
  }

  fun setFogTransmitCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.setFogTransmitCurve.call(this._handle, _arg, 1)
  }

  fun setFogTransmitEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setFogTransmitEnabled.call(this._handle, _arg, 1)
  }

  fun setGlowBicubicUpscale(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setGlowBicubicUpscale.call(this._handle, _arg, 1)
  }

  fun setGlowBlendMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setGlowBlendMode.call(this._handle, _arg, 1)
  }

  fun setGlowBloom(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setGlowBloom.call(this._handle, _arg, 1)
  }

  fun setGlowEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setGlowEnabled.call(this._handle, _arg, 1)
  }

  fun setGlowHdrBleedScale(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.setGlowHdrBleedScale.call(this._handle, _arg, 1)
  }

  fun setGlowHdrBleedThreshold(threshold: Float) {
    val _arg = Variant.new(threshold)
    __method_bind.setGlowHdrBleedThreshold.call(this._handle, _arg, 1)
  }

  fun setGlowHdrLuminanceCap(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setGlowHdrLuminanceCap.call(this._handle, _arg, 1)
  }

  fun setGlowIntensity(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setGlowIntensity.call(this._handle, _arg, 1)
  }

  fun setGlowLevel(idx: Int, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(enabled)
    __method_bind.setGlowLevel.call(this._handle, _args.toVariant(), 2)
  }

  fun setGlowStrength(strength: Float) {
    val _arg = Variant.new(strength)
    __method_bind.setGlowStrength.call(this._handle, _arg, 1)
  }

  fun setSky(sky: Sky) {
    val _arg = Variant.new(sky)
    __method_bind.setSky.call(this._handle, _arg, 1)
  }

  fun setSkyCustomFov(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.setSkyCustomFov.call(this._handle, _arg, 1)
  }

  fun setSkyOrientation(orientation: Basis) {
    val _arg = Variant.new(orientation)
    __method_bind.setSkyOrientation.call(this._handle, _arg, 1)
  }

  fun setSkyRotation(eulerRadians: Vector3) {
    val _arg = Variant.new(eulerRadians)
    __method_bind.setSkyRotation.call(this._handle, _arg, 1)
  }

  fun setSkyRotationDegrees(eulerDegrees: Vector3) {
    val _arg = Variant.new(eulerDegrees)
    __method_bind.setSkyRotationDegrees.call(this._handle, _arg, 1)
  }

  fun setSsaoAoChannelAffect(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setSsaoAoChannelAffect.call(this._handle, _arg, 1)
  }

  fun setSsaoBias(bias: Float) {
    val _arg = Variant.new(bias)
    __method_bind.setSsaoBias.call(this._handle, _arg, 1)
  }

  fun setSsaoBlur(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setSsaoBlur.call(this._handle, _arg, 1)
  }

  fun setSsaoColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setSsaoColor.call(this._handle, _arg, 1)
  }

  fun setSsaoDirectLightAffect(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setSsaoDirectLightAffect.call(this._handle, _arg, 1)
  }

  fun setSsaoEdgeSharpness(edgeSharpness: Float) {
    val _arg = Variant.new(edgeSharpness)
    __method_bind.setSsaoEdgeSharpness.call(this._handle, _arg, 1)
  }

  fun setSsaoEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setSsaoEnabled.call(this._handle, _arg, 1)
  }

  fun setSsaoIntensity(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setSsaoIntensity.call(this._handle, _arg, 1)
  }

  fun setSsaoIntensity2(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setSsaoIntensity2.call(this._handle, _arg, 1)
  }

  fun setSsaoQuality(quality: Int) {
    val _arg = Variant.new(quality)
    __method_bind.setSsaoQuality.call(this._handle, _arg, 1)
  }

  fun setSsaoRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setSsaoRadius.call(this._handle, _arg, 1)
  }

  fun setSsaoRadius2(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setSsaoRadius2.call(this._handle, _arg, 1)
  }

  fun setSsrDepthTolerance(depthTolerance: Float) {
    val _arg = Variant.new(depthTolerance)
    __method_bind.setSsrDepthTolerance.call(this._handle, _arg, 1)
  }

  fun setSsrEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setSsrEnabled.call(this._handle, _arg, 1)
  }

  fun setSsrFadeIn(fadeIn: Float) {
    val _arg = Variant.new(fadeIn)
    __method_bind.setSsrFadeIn.call(this._handle, _arg, 1)
  }

  fun setSsrFadeOut(fadeOut: Float) {
    val _arg = Variant.new(fadeOut)
    __method_bind.setSsrFadeOut.call(this._handle, _arg, 1)
  }

  fun setSsrMaxSteps(maxSteps: Int) {
    val _arg = Variant.new(maxSteps)
    __method_bind.setSsrMaxSteps.call(this._handle, _arg, 1)
  }

  fun setSsrRough(rough: Boolean) {
    val _arg = Variant.new(rough)
    __method_bind.setSsrRough.call(this._handle, _arg, 1)
  }

  fun setTonemapAutoExposure(autoExposure: Boolean) {
    val _arg = Variant.new(autoExposure)
    __method_bind.setTonemapAutoExposure.call(this._handle, _arg, 1)
  }

  fun setTonemapAutoExposureGrey(exposureGrey: Float) {
    val _arg = Variant.new(exposureGrey)
    __method_bind.setTonemapAutoExposureGrey.call(this._handle, _arg, 1)
  }

  fun setTonemapAutoExposureMax(exposureMax: Float) {
    val _arg = Variant.new(exposureMax)
    __method_bind.setTonemapAutoExposureMax.call(this._handle, _arg, 1)
  }

  fun setTonemapAutoExposureMin(exposureMin: Float) {
    val _arg = Variant.new(exposureMin)
    __method_bind.setTonemapAutoExposureMin.call(this._handle, _arg, 1)
  }

  fun setTonemapAutoExposureSpeed(exposureSpeed: Float) {
    val _arg = Variant.new(exposureSpeed)
    __method_bind.setTonemapAutoExposureSpeed.call(this._handle, _arg, 1)
  }

  fun setTonemapExposure(exposure: Float) {
    val _arg = Variant.new(exposure)
    __method_bind.setTonemapExposure.call(this._handle, _arg, 1)
  }

  fun setTonemapWhite(white: Float) {
    val _arg = Variant.new(white)
    __method_bind.setTonemapWhite.call(this._handle, _arg, 1)
  }

  fun setTonemapper(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setTonemapper.call(this._handle, _arg, 1)
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
      val getAdjustmentBrightness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getAdjustmentBrightness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAdjustmentBrightness" }
        }
      val getAdjustmentColorCorrection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getAdjustmentColorCorrection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAdjustmentColorCorrection" }
        }
      val getAdjustmentContrast: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getAdjustmentContrast".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAdjustmentContrast" }
        }
      val getAdjustmentSaturation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getAdjustmentSaturation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAdjustmentSaturation" }
        }
      val getAmbientLightColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getAmbientLightColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAmbientLightColor" }
        }
      val getAmbientLightEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getAmbientLightEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAmbientLightEnergy" }
        }
      val getAmbientLightSkyContribution: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getAmbientLightSkyContribution".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAmbientLightSkyContribution" }
        }
      val getBackground: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getBackground".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBackground" }
        }
      val getBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getBgColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBgColor" }
        }
      val getBgEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getBgEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBgEnergy" }
        }
      val getCameraFeedId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getCameraFeedId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCameraFeedId" }
        }
      val getCanvasMaxLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getCanvasMaxLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCanvasMaxLayer" }
        }
      val getDofBlurFarAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getDofBlurFarAmount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDofBlurFarAmount" }
        }
      val getDofBlurFarDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getDofBlurFarDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDofBlurFarDistance" }
        }
      val getDofBlurFarQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getDofBlurFarQuality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDofBlurFarQuality" }
        }
      val getDofBlurFarTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getDofBlurFarTransition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDofBlurFarTransition" }
        }
      val getDofBlurNearAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getDofBlurNearAmount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDofBlurNearAmount" }
        }
      val getDofBlurNearDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getDofBlurNearDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDofBlurNearDistance" }
        }
      val getDofBlurNearQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getDofBlurNearQuality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDofBlurNearQuality" }
        }
      val getDofBlurNearTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getDofBlurNearTransition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDofBlurNearTransition" }
        }
      val getFogColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getFogColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFogColor" }
        }
      val getFogDepthBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getFogDepthBegin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFogDepthBegin" }
        }
      val getFogDepthCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getFogDepthCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFogDepthCurve" }
        }
      val getFogDepthEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getFogDepthEnd".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFogDepthEnd" }
        }
      val getFogHeightCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getFogHeightCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFogHeightCurve" }
        }
      val getFogHeightMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getFogHeightMax".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFogHeightMax" }
        }
      val getFogHeightMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getFogHeightMin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFogHeightMin" }
        }
      val getFogSunAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getFogSunAmount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFogSunAmount" }
        }
      val getFogSunColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getFogSunColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFogSunColor" }
        }
      val getFogTransmitCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getFogTransmitCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFogTransmitCurve" }
        }
      val getGlowBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getGlowBlendMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlowBlendMode" }
        }
      val getGlowBloom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getGlowBloom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlowBloom" }
        }
      val getGlowHdrBleedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getGlowHdrBleedScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlowHdrBleedScale" }
        }
      val getGlowHdrBleedThreshold: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getGlowHdrBleedThreshold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlowHdrBleedThreshold" }
        }
      val getGlowHdrLuminanceCap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getGlowHdrLuminanceCap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlowHdrLuminanceCap" }
        }
      val getGlowIntensity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getGlowIntensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlowIntensity" }
        }
      val getGlowStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getGlowStrength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlowStrength" }
        }
      val getSky: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSky".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSky" }
        }
      val getSkyCustomFov: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSkyCustomFov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSkyCustomFov" }
        }
      val getSkyOrientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSkyOrientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSkyOrientation" }
        }
      val getSkyRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSkyRotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSkyRotation" }
        }
      val getSkyRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSkyRotationDegrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSkyRotationDegrees" }
        }
      val getSsaoAoChannelAffect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsaoAoChannelAffect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsaoAoChannelAffect" }
        }
      val getSsaoBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsaoBias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsaoBias" }
        }
      val getSsaoBlur: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsaoBlur".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsaoBlur" }
        }
      val getSsaoColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsaoColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsaoColor" }
        }
      val getSsaoDirectLightAffect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsaoDirectLightAffect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsaoDirectLightAffect" }
        }
      val getSsaoEdgeSharpness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsaoEdgeSharpness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsaoEdgeSharpness" }
        }
      val getSsaoIntensity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsaoIntensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsaoIntensity" }
        }
      val getSsaoIntensity2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsaoIntensity2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsaoIntensity2" }
        }
      val getSsaoQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsaoQuality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsaoQuality" }
        }
      val getSsaoRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsaoRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsaoRadius" }
        }
      val getSsaoRadius2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsaoRadius2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsaoRadius2" }
        }
      val getSsrDepthTolerance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsrDepthTolerance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsrDepthTolerance" }
        }
      val getSsrFadeIn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsrFadeIn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsrFadeIn" }
        }
      val getSsrFadeOut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsrFadeOut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsrFadeOut" }
        }
      val getSsrMaxSteps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getSsrMaxSteps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSsrMaxSteps" }
        }
      val getTonemapAutoExposure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getTonemapAutoExposure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTonemapAutoExposure" }
        }
      val getTonemapAutoExposureGrey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getTonemapAutoExposureGrey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTonemapAutoExposureGrey" }
        }
      val getTonemapAutoExposureMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getTonemapAutoExposureMax".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTonemapAutoExposureMax" }
        }
      val getTonemapAutoExposureMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getTonemapAutoExposureMin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTonemapAutoExposureMin" }
        }
      val getTonemapAutoExposureSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getTonemapAutoExposureSpeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTonemapAutoExposureSpeed" }
        }
      val getTonemapExposure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getTonemapExposure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTonemapExposure" }
        }
      val getTonemapWhite: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getTonemapWhite".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTonemapWhite" }
        }
      val getTonemapper: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "getTonemapper".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTonemapper" }
        }
      val isAdjustmentEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "isAdjustmentEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isAdjustmentEnabled" }
        }
      val isDofBlurFarEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "isDofBlurFarEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDofBlurFarEnabled" }
        }
      val isDofBlurNearEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "isDofBlurNearEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDofBlurNearEnabled" }
        }
      val isFogDepthEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "isFogDepthEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFogDepthEnabled" }
        }
      val isFogEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "isFogEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFogEnabled" }
        }
      val isFogHeightEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "isFogHeightEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFogHeightEnabled" }
        }
      val isFogTransmitEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "isFogTransmitEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFogTransmitEnabled" }
        }
      val isGlowBicubicUpscaleEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "isGlowBicubicUpscaleEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isGlowBicubicUpscaleEnabled" }
        }
      val isGlowEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "isGlowEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isGlowEnabled" }
        }
      val isGlowLevelEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "isGlowLevelEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isGlowLevelEnabled" }
        }
      val isSsaoEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "isSsaoEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSsaoEnabled" }
        }
      val isSsrEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "isSsrEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSsrEnabled" }
        }
      val isSsrRough: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "isSsrRough".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSsrRough" }
        }
      val setAdjustmentBrightness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setAdjustmentBrightness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAdjustmentBrightness" }
        }
      val setAdjustmentColorCorrection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setAdjustmentColorCorrection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAdjustmentColorCorrection" }
        }
      val setAdjustmentContrast: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setAdjustmentContrast".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAdjustmentContrast" }
        }
      val setAdjustmentEnable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setAdjustmentEnable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAdjustmentEnable" }
        }
      val setAdjustmentSaturation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setAdjustmentSaturation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAdjustmentSaturation" }
        }
      val setAmbientLightColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setAmbientLightColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAmbientLightColor" }
        }
      val setAmbientLightEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setAmbientLightEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAmbientLightEnergy" }
        }
      val setAmbientLightSkyContribution: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setAmbientLightSkyContribution".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAmbientLightSkyContribution" }
        }
      val setBackground: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setBackground".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBackground" }
        }
      val setBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setBgColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBgColor" }
        }
      val setBgEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setBgEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBgEnergy" }
        }
      val setCameraFeedId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setCameraFeedId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCameraFeedId" }
        }
      val setCanvasMaxLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setCanvasMaxLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCanvasMaxLayer" }
        }
      val setDofBlurFarAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setDofBlurFarAmount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDofBlurFarAmount" }
        }
      val setDofBlurFarDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setDofBlurFarDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDofBlurFarDistance" }
        }
      val setDofBlurFarEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setDofBlurFarEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDofBlurFarEnabled" }
        }
      val setDofBlurFarQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setDofBlurFarQuality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDofBlurFarQuality" }
        }
      val setDofBlurFarTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setDofBlurFarTransition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDofBlurFarTransition" }
        }
      val setDofBlurNearAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setDofBlurNearAmount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDofBlurNearAmount" }
        }
      val setDofBlurNearDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setDofBlurNearDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDofBlurNearDistance" }
        }
      val setDofBlurNearEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setDofBlurNearEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDofBlurNearEnabled" }
        }
      val setDofBlurNearQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setDofBlurNearQuality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDofBlurNearQuality" }
        }
      val setDofBlurNearTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setDofBlurNearTransition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDofBlurNearTransition" }
        }
      val setFogColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setFogColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFogColor" }
        }
      val setFogDepthBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setFogDepthBegin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFogDepthBegin" }
        }
      val setFogDepthCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setFogDepthCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFogDepthCurve" }
        }
      val setFogDepthEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setFogDepthEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFogDepthEnabled" }
        }
      val setFogDepthEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setFogDepthEnd".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFogDepthEnd" }
        }
      val setFogEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setFogEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFogEnabled" }
        }
      val setFogHeightCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setFogHeightCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFogHeightCurve" }
        }
      val setFogHeightEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setFogHeightEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFogHeightEnabled" }
        }
      val setFogHeightMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setFogHeightMax".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFogHeightMax" }
        }
      val setFogHeightMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setFogHeightMin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFogHeightMin" }
        }
      val setFogSunAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setFogSunAmount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFogSunAmount" }
        }
      val setFogSunColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setFogSunColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFogSunColor" }
        }
      val setFogTransmitCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setFogTransmitCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFogTransmitCurve" }
        }
      val setFogTransmitEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setFogTransmitEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFogTransmitEnabled" }
        }
      val setGlowBicubicUpscale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setGlowBicubicUpscale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlowBicubicUpscale" }
        }
      val setGlowBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setGlowBlendMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlowBlendMode" }
        }
      val setGlowBloom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setGlowBloom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlowBloom" }
        }
      val setGlowEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setGlowEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlowEnabled" }
        }
      val setGlowHdrBleedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setGlowHdrBleedScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlowHdrBleedScale" }
        }
      val setGlowHdrBleedThreshold: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setGlowHdrBleedThreshold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlowHdrBleedThreshold" }
        }
      val setGlowHdrLuminanceCap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setGlowHdrLuminanceCap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlowHdrLuminanceCap" }
        }
      val setGlowIntensity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setGlowIntensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlowIntensity" }
        }
      val setGlowLevel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setGlowLevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlowLevel" }
        }
      val setGlowStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setGlowStrength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlowStrength" }
        }
      val setSky: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSky".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSky" }
        }
      val setSkyCustomFov: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSkyCustomFov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSkyCustomFov" }
        }
      val setSkyOrientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSkyOrientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSkyOrientation" }
        }
      val setSkyRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSkyRotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSkyRotation" }
        }
      val setSkyRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSkyRotationDegrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSkyRotationDegrees" }
        }
      val setSsaoAoChannelAffect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsaoAoChannelAffect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsaoAoChannelAffect" }
        }
      val setSsaoBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsaoBias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsaoBias" }
        }
      val setSsaoBlur: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsaoBlur".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsaoBlur" }
        }
      val setSsaoColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsaoColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsaoColor" }
        }
      val setSsaoDirectLightAffect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsaoDirectLightAffect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsaoDirectLightAffect" }
        }
      val setSsaoEdgeSharpness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsaoEdgeSharpness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsaoEdgeSharpness" }
        }
      val setSsaoEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsaoEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsaoEnabled" }
        }
      val setSsaoIntensity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsaoIntensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsaoIntensity" }
        }
      val setSsaoIntensity2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsaoIntensity2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsaoIntensity2" }
        }
      val setSsaoQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsaoQuality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsaoQuality" }
        }
      val setSsaoRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsaoRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsaoRadius" }
        }
      val setSsaoRadius2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsaoRadius2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsaoRadius2" }
        }
      val setSsrDepthTolerance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsrDepthTolerance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsrDepthTolerance" }
        }
      val setSsrEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsrEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsrEnabled" }
        }
      val setSsrFadeIn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsrFadeIn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsrFadeIn" }
        }
      val setSsrFadeOut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsrFadeOut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsrFadeOut" }
        }
      val setSsrMaxSteps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsrMaxSteps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsrMaxSteps" }
        }
      val setSsrRough: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setSsrRough".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSsrRough" }
        }
      val setTonemapAutoExposure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setTonemapAutoExposure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTonemapAutoExposure" }
        }
      val setTonemapAutoExposureGrey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setTonemapAutoExposureGrey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTonemapAutoExposureGrey" }
        }
      val setTonemapAutoExposureMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setTonemapAutoExposureMax".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTonemapAutoExposureMax" }
        }
      val setTonemapAutoExposureMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setTonemapAutoExposureMin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTonemapAutoExposureMin" }
        }
      val setTonemapAutoExposureSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setTonemapAutoExposureSpeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTonemapAutoExposureSpeed" }
        }
      val setTonemapExposure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setTonemapExposure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTonemapExposure" }
        }
      val setTonemapWhite: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setTonemapWhite".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTonemapWhite" }
        }
      val setTonemapper: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "setTonemapper".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTonemapper" }
        }}
  }
}
