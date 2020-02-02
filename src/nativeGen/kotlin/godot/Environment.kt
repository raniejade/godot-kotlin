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
import kotlin.Unit
import kotlin.reflect.KCallable
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

  var backgroundMode: BGMode
    get() {
       return getBackground() 
    }
    set(value) {
      setBackground(value.value)
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

  var dofBlurFarQuality: DOFBlurQuality
    get() {
       return getDofBlurFarQuality() 
    }
    set(value) {
      setDofBlurFarQuality(value.value)
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

  var dofBlurNearQuality: DOFBlurQuality
    get() {
       return getDofBlurNearQuality() 
    }
    set(value) {
      setDofBlurNearQuality(value.value)
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

  var glowBlendMode: GlowBlendMode
    get() {
       return getGlowBlendMode() 
    }
    set(value) {
      setGlowBlendMode(value.value)
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

  var glowLevels1: Boolean
    get() {
       return isGlowLevelEnabled(0) 
    }
    set(value) {
      setGlowLevel(0, value)
    }

  var glowLevels2: Boolean
    get() {
       return isGlowLevelEnabled(1) 
    }
    set(value) {
      setGlowLevel(1, value)
    }

  var glowLevels3: Boolean
    get() {
       return isGlowLevelEnabled(2) 
    }
    set(value) {
      setGlowLevel(2, value)
    }

  var glowLevels4: Boolean
    get() {
       return isGlowLevelEnabled(3) 
    }
    set(value) {
      setGlowLevel(3, value)
    }

  var glowLevels5: Boolean
    get() {
       return isGlowLevelEnabled(4) 
    }
    set(value) {
      setGlowLevel(4, value)
    }

  var glowLevels6: Boolean
    get() {
       return isGlowLevelEnabled(5) 
    }
    set(value) {
      setGlowLevel(5, value)
    }

  var glowLevels7: Boolean
    get() {
       return isGlowLevelEnabled(6) 
    }
    set(value) {
      setGlowLevel(6, value)
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

  var ssaoBlur: SSAOBlur
    get() {
       return getSsaoBlur() 
    }
    set(value) {
      setSsaoBlur(value.value)
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

  var ssaoQuality: SSAOQuality
    get() {
       return getSsaoQuality() 
    }
    set(value) {
      setSsaoQuality(value.value)
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

  var tonemapMode: ToneMapper
    get() {
       return getTonemapper() 
    }
    set(value) {
      setTonemapper(value.value)
    }

  var tonemapWhite: Float
    get() {
       return getTonemapWhite() 
    }
    set(value) {
      setTonemapWhite(value)
    }

  /**
   * Specialized setter for ambientLightColor
   */
  fun ambientLightColor(cb: Color.() -> Unit) {
    val _p = ambientLightColor
    cb(_p)
    ambientLightColor = _p
  }

  /**
   * Specialized setter for backgroundColor
   */
  fun backgroundColor(cb: Color.() -> Unit) {
    val _p = backgroundColor
    cb(_p)
    backgroundColor = _p
  }

  /**
   * Specialized setter for backgroundSkyOrientation
   */
  fun backgroundSkyOrientation(cb: Basis.() -> Unit) {
    val _p = backgroundSkyOrientation
    cb(_p)
    backgroundSkyOrientation = _p
  }

  /**
   * Specialized setter for backgroundSkyRotation
   */
  fun backgroundSkyRotation(cb: Vector3.() -> Unit) {
    val _p = backgroundSkyRotation
    cb(_p)
    backgroundSkyRotation = _p
  }

  /**
   * Specialized setter for backgroundSkyRotationDegrees
   */
  fun backgroundSkyRotationDegrees(cb: Vector3.() -> Unit) {
    val _p = backgroundSkyRotationDegrees
    cb(_p)
    backgroundSkyRotationDegrees = _p
  }

  /**
   * Specialized setter for fogColor
   */
  fun fogColor(cb: Color.() -> Unit) {
    val _p = fogColor
    cb(_p)
    fogColor = _p
  }

  /**
   * Specialized setter for fogSunColor
   */
  fun fogSunColor(cb: Color.() -> Unit) {
    val _p = fogSunColor
    cb(_p)
    fogSunColor = _p
  }

  /**
   * Specialized setter for ssaoColor
   */
  fun ssaoColor(cb: Color.() -> Unit) {
    val _p = ssaoColor
    cb(_p)
    ssaoColor = _p
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
    val _ret = __method_bind.isGlowLevelEnabled.call(this._handle, listOf(_arg))
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
    __method_bind.setAdjustmentBrightness.call(this._handle, listOf(_arg))
  }

  fun setAdjustmentColorCorrection(colorCorrection: Texture) {
    val _arg = Variant.new(colorCorrection)
    __method_bind.setAdjustmentColorCorrection.call(this._handle, listOf(_arg))
  }

  fun setAdjustmentContrast(contrast: Float) {
    val _arg = Variant.new(contrast)
    __method_bind.setAdjustmentContrast.call(this._handle, listOf(_arg))
  }

  fun setAdjustmentEnable(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setAdjustmentEnable.call(this._handle, listOf(_arg))
  }

  fun setAdjustmentSaturation(saturation: Float) {
    val _arg = Variant.new(saturation)
    __method_bind.setAdjustmentSaturation.call(this._handle, listOf(_arg))
  }

  fun setAmbientLightColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setAmbientLightColor.call(this._handle, listOf(_arg))
  }

  fun setAmbientLightEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setAmbientLightEnergy.call(this._handle, listOf(_arg))
  }

  fun setAmbientLightSkyContribution(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setAmbientLightSkyContribution.call(this._handle, listOf(_arg))
  }

  fun setBackground(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setBackground.call(this._handle, listOf(_arg))
  }

  fun setBgColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setBgColor.call(this._handle, listOf(_arg))
  }

  fun setBgEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setBgEnergy.call(this._handle, listOf(_arg))
  }

  fun setCameraFeedId(cameraFeedId: Int) {
    val _arg = Variant.new(cameraFeedId)
    __method_bind.setCameraFeedId.call(this._handle, listOf(_arg))
  }

  fun setCanvasMaxLayer(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.setCanvasMaxLayer.call(this._handle, listOf(_arg))
  }

  fun setDofBlurFarAmount(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setDofBlurFarAmount.call(this._handle, listOf(_arg))
  }

  fun setDofBlurFarDistance(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setDofBlurFarDistance.call(this._handle, listOf(_arg))
  }

  fun setDofBlurFarEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setDofBlurFarEnabled.call(this._handle, listOf(_arg))
  }

  fun setDofBlurFarQuality(intensity: Int) {
    val _arg = Variant.new(intensity)
    __method_bind.setDofBlurFarQuality.call(this._handle, listOf(_arg))
  }

  fun setDofBlurFarTransition(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setDofBlurFarTransition.call(this._handle, listOf(_arg))
  }

  fun setDofBlurNearAmount(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setDofBlurNearAmount.call(this._handle, listOf(_arg))
  }

  fun setDofBlurNearDistance(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setDofBlurNearDistance.call(this._handle, listOf(_arg))
  }

  fun setDofBlurNearEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setDofBlurNearEnabled.call(this._handle, listOf(_arg))
  }

  fun setDofBlurNearQuality(level: Int) {
    val _arg = Variant.new(level)
    __method_bind.setDofBlurNearQuality.call(this._handle, listOf(_arg))
  }

  fun setDofBlurNearTransition(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setDofBlurNearTransition.call(this._handle, listOf(_arg))
  }

  fun setFogColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setFogColor.call(this._handle, listOf(_arg))
  }

  fun setFogDepthBegin(distance: Float) {
    val _arg = Variant.new(distance)
    __method_bind.setFogDepthBegin.call(this._handle, listOf(_arg))
  }

  fun setFogDepthCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.setFogDepthCurve.call(this._handle, listOf(_arg))
  }

  fun setFogDepthEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setFogDepthEnabled.call(this._handle, listOf(_arg))
  }

  fun setFogDepthEnd(distance: Float) {
    val _arg = Variant.new(distance)
    __method_bind.setFogDepthEnd.call(this._handle, listOf(_arg))
  }

  fun setFogEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setFogEnabled.call(this._handle, listOf(_arg))
  }

  fun setFogHeightCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.setFogHeightCurve.call(this._handle, listOf(_arg))
  }

  fun setFogHeightEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setFogHeightEnabled.call(this._handle, listOf(_arg))
  }

  fun setFogHeightMax(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.setFogHeightMax.call(this._handle, listOf(_arg))
  }

  fun setFogHeightMin(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.setFogHeightMin.call(this._handle, listOf(_arg))
  }

  fun setFogSunAmount(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setFogSunAmount.call(this._handle, listOf(_arg))
  }

  fun setFogSunColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setFogSunColor.call(this._handle, listOf(_arg))
  }

  fun setFogTransmitCurve(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.setFogTransmitCurve.call(this._handle, listOf(_arg))
  }

  fun setFogTransmitEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setFogTransmitEnabled.call(this._handle, listOf(_arg))
  }

  fun setGlowBicubicUpscale(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setGlowBicubicUpscale.call(this._handle, listOf(_arg))
  }

  fun setGlowBlendMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setGlowBlendMode.call(this._handle, listOf(_arg))
  }

  fun setGlowBloom(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setGlowBloom.call(this._handle, listOf(_arg))
  }

  fun setGlowEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setGlowEnabled.call(this._handle, listOf(_arg))
  }

  fun setGlowHdrBleedScale(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.setGlowHdrBleedScale.call(this._handle, listOf(_arg))
  }

  fun setGlowHdrBleedThreshold(threshold: Float) {
    val _arg = Variant.new(threshold)
    __method_bind.setGlowHdrBleedThreshold.call(this._handle, listOf(_arg))
  }

  fun setGlowHdrLuminanceCap(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setGlowHdrLuminanceCap.call(this._handle, listOf(_arg))
  }

  fun setGlowIntensity(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setGlowIntensity.call(this._handle, listOf(_arg))
  }

  fun setGlowLevel(idx: Int, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(enabled))
    __method_bind.setGlowLevel.call(this._handle, _args)
  }

  fun setGlowStrength(strength: Float) {
    val _arg = Variant.new(strength)
    __method_bind.setGlowStrength.call(this._handle, listOf(_arg))
  }

  fun setSky(sky: Sky) {
    val _arg = Variant.new(sky)
    __method_bind.setSky.call(this._handle, listOf(_arg))
  }

  fun setSkyCustomFov(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.setSkyCustomFov.call(this._handle, listOf(_arg))
  }

  fun setSkyOrientation(orientation: Basis) {
    val _arg = Variant.new(orientation)
    __method_bind.setSkyOrientation.call(this._handle, listOf(_arg))
  }

  fun setSkyRotation(eulerRadians: Vector3) {
    val _arg = Variant.new(eulerRadians)
    __method_bind.setSkyRotation.call(this._handle, listOf(_arg))
  }

  fun setSkyRotationDegrees(eulerDegrees: Vector3) {
    val _arg = Variant.new(eulerDegrees)
    __method_bind.setSkyRotationDegrees.call(this._handle, listOf(_arg))
  }

  fun setSsaoAoChannelAffect(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setSsaoAoChannelAffect.call(this._handle, listOf(_arg))
  }

  fun setSsaoBias(bias: Float) {
    val _arg = Variant.new(bias)
    __method_bind.setSsaoBias.call(this._handle, listOf(_arg))
  }

  fun setSsaoBlur(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setSsaoBlur.call(this._handle, listOf(_arg))
  }

  fun setSsaoColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setSsaoColor.call(this._handle, listOf(_arg))
  }

  fun setSsaoDirectLightAffect(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setSsaoDirectLightAffect.call(this._handle, listOf(_arg))
  }

  fun setSsaoEdgeSharpness(edgeSharpness: Float) {
    val _arg = Variant.new(edgeSharpness)
    __method_bind.setSsaoEdgeSharpness.call(this._handle, listOf(_arg))
  }

  fun setSsaoEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setSsaoEnabled.call(this._handle, listOf(_arg))
  }

  fun setSsaoIntensity(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setSsaoIntensity.call(this._handle, listOf(_arg))
  }

  fun setSsaoIntensity2(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setSsaoIntensity2.call(this._handle, listOf(_arg))
  }

  fun setSsaoQuality(quality: Int) {
    val _arg = Variant.new(quality)
    __method_bind.setSsaoQuality.call(this._handle, listOf(_arg))
  }

  fun setSsaoRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setSsaoRadius.call(this._handle, listOf(_arg))
  }

  fun setSsaoRadius2(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setSsaoRadius2.call(this._handle, listOf(_arg))
  }

  fun setSsrDepthTolerance(depthTolerance: Float) {
    val _arg = Variant.new(depthTolerance)
    __method_bind.setSsrDepthTolerance.call(this._handle, listOf(_arg))
  }

  fun setSsrEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setSsrEnabled.call(this._handle, listOf(_arg))
  }

  fun setSsrFadeIn(fadeIn: Float) {
    val _arg = Variant.new(fadeIn)
    __method_bind.setSsrFadeIn.call(this._handle, listOf(_arg))
  }

  fun setSsrFadeOut(fadeOut: Float) {
    val _arg = Variant.new(fadeOut)
    __method_bind.setSsrFadeOut.call(this._handle, listOf(_arg))
  }

  fun setSsrMaxSteps(maxSteps: Int) {
    val _arg = Variant.new(maxSteps)
    __method_bind.setSsrMaxSteps.call(this._handle, listOf(_arg))
  }

  fun setSsrRough(rough: Boolean) {
    val _arg = Variant.new(rough)
    __method_bind.setSsrRough.call(this._handle, listOf(_arg))
  }

  fun setTonemapAutoExposure(autoExposure: Boolean) {
    val _arg = Variant.new(autoExposure)
    __method_bind.setTonemapAutoExposure.call(this._handle, listOf(_arg))
  }

  fun setTonemapAutoExposureGrey(exposureGrey: Float) {
    val _arg = Variant.new(exposureGrey)
    __method_bind.setTonemapAutoExposureGrey.call(this._handle, listOf(_arg))
  }

  fun setTonemapAutoExposureMax(exposureMax: Float) {
    val _arg = Variant.new(exposureMax)
    __method_bind.setTonemapAutoExposureMax.call(this._handle, listOf(_arg))
  }

  fun setTonemapAutoExposureMin(exposureMin: Float) {
    val _arg = Variant.new(exposureMin)
    __method_bind.setTonemapAutoExposureMin.call(this._handle, listOf(_arg))
  }

  fun setTonemapAutoExposureSpeed(exposureSpeed: Float) {
    val _arg = Variant.new(exposureSpeed)
    __method_bind.setTonemapAutoExposureSpeed.call(this._handle, listOf(_arg))
  }

  fun setTonemapExposure(exposure: Float) {
    val _arg = Variant.new(exposure)
    __method_bind.setTonemapExposure.call(this._handle, listOf(_arg))
  }

  fun setTonemapWhite(white: Float) {
    val _arg = Variant.new(white)
    __method_bind.setTonemapWhite.call(this._handle, listOf(_arg))
  }

  fun setTonemapper(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setTonemapper.call(this._handle, listOf(_arg))
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
    LINEAR(0),

    REINHARDT(1),

    FILMIC(2),

    ACES(3);

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
    ADDITIVE(0),

    SCREEN(1),

    SOFTLIGHT(2),

    REPLACE(3);

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
            "get_adjustment_brightness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_adjustment_brightness" }
        }
      val getAdjustmentColorCorrection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_adjustment_color_correction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_adjustment_color_correction" }
        }
      val getAdjustmentContrast: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_adjustment_contrast".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_adjustment_contrast" }
        }
      val getAdjustmentSaturation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_adjustment_saturation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_adjustment_saturation" }
        }
      val getAmbientLightColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ambient_light_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ambient_light_color" }
        }
      val getAmbientLightEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ambient_light_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ambient_light_energy" }
        }
      val getAmbientLightSkyContribution: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ambient_light_sky_contribution".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ambient_light_sky_contribution"
            }
        }
      val getBackground: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_background".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_background" }
        }
      val getBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bg_color" }
        }
      val getBgEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_bg_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bg_energy" }
        }
      val getCameraFeedId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_camera_feed_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_feed_id" }
        }
      val getCanvasMaxLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_canvas_max_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_canvas_max_layer" }
        }
      val getDofBlurFarAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_far_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_amount" }
        }
      val getDofBlurFarDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_far_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_distance" }
        }
      val getDofBlurFarQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_far_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_quality" }
        }
      val getDofBlurFarTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_far_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_transition" }
        }
      val getDofBlurNearAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_near_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_amount" }
        }
      val getDofBlurNearDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_near_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_distance" }
        }
      val getDofBlurNearQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_near_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_quality" }
        }
      val getDofBlurNearTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_near_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_transition" }
        }
      val getFogColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_color" }
        }
      val getFogDepthBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_depth_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_depth_begin" }
        }
      val getFogDepthCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_depth_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_depth_curve" }
        }
      val getFogDepthEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_depth_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_depth_end" }
        }
      val getFogHeightCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_height_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_height_curve" }
        }
      val getFogHeightMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_height_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_height_max" }
        }
      val getFogHeightMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_height_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_height_min" }
        }
      val getFogSunAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_sun_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_sun_amount" }
        }
      val getFogSunColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_sun_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_sun_color" }
        }
      val getFogTransmitCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_transmit_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_transmit_curve" }
        }
      val getGlowBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_glow_blend_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_glow_blend_mode" }
        }
      val getGlowBloom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_glow_bloom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_glow_bloom" }
        }
      val getGlowHdrBleedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_glow_hdr_bleed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_glow_hdr_bleed_scale" }
        }
      val getGlowHdrBleedThreshold: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_glow_hdr_bleed_threshold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_glow_hdr_bleed_threshold" }
        }
      val getGlowHdrLuminanceCap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_glow_hdr_luminance_cap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_glow_hdr_luminance_cap" }
        }
      val getGlowIntensity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_glow_intensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_glow_intensity" }
        }
      val getGlowStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_glow_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_glow_strength" }
        }
      val getSky: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_sky".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky" }
        }
      val getSkyCustomFov: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_sky_custom_fov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_custom_fov" }
        }
      val getSkyOrientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_sky_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_orientation" }
        }
      val getSkyRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_sky_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_rotation" }
        }
      val getSkyRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_sky_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_rotation_degrees" }
        }
      val getSsaoAoChannelAffect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_ao_channel_affect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_ao_channel_affect" }
        }
      val getSsaoBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_bias" }
        }
      val getSsaoBlur: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_blur".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_blur" }
        }
      val getSsaoColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_color" }
        }
      val getSsaoDirectLightAffect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_direct_light_affect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_direct_light_affect" }
        }
      val getSsaoEdgeSharpness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_edge_sharpness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_edge_sharpness" }
        }
      val getSsaoIntensity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_intensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_intensity" }
        }
      val getSsaoIntensity2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_intensity2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_intensity2" }
        }
      val getSsaoQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_quality" }
        }
      val getSsaoRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_radius" }
        }
      val getSsaoRadius2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_radius2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_radius2" }
        }
      val getSsrDepthTolerance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssr_depth_tolerance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssr_depth_tolerance" }
        }
      val getSsrFadeIn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssr_fade_in".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssr_fade_in" }
        }
      val getSsrFadeOut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssr_fade_out".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssr_fade_out" }
        }
      val getSsrMaxSteps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssr_max_steps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssr_max_steps" }
        }
      val getTonemapAutoExposure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemap_auto_exposure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure" }
        }
      val getTonemapAutoExposureGrey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemap_auto_exposure_grey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure_grey" }
        }
      val getTonemapAutoExposureMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemap_auto_exposure_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure_max" }
        }
      val getTonemapAutoExposureMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemap_auto_exposure_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure_min" }
        }
      val getTonemapAutoExposureSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemap_auto_exposure_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure_speed" }
        }
      val getTonemapExposure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemap_exposure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemap_exposure" }
        }
      val getTonemapWhite: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemap_white".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemap_white" }
        }
      val getTonemapper: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemapper".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemapper" }
        }
      val isAdjustmentEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_adjustment_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_adjustment_enabled" }
        }
      val isDofBlurFarEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_dof_blur_far_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_dof_blur_far_enabled" }
        }
      val isDofBlurNearEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_dof_blur_near_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_dof_blur_near_enabled" }
        }
      val isFogDepthEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_fog_depth_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_fog_depth_enabled" }
        }
      val isFogEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_fog_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_fog_enabled" }
        }
      val isFogHeightEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_fog_height_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_fog_height_enabled" }
        }
      val isFogTransmitEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_fog_transmit_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_fog_transmit_enabled" }
        }
      val isGlowBicubicUpscaleEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_glow_bicubic_upscale_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_glow_bicubic_upscale_enabled" }
        }
      val isGlowEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_glow_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_glow_enabled" }
        }
      val isGlowLevelEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_glow_level_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_glow_level_enabled" }
        }
      val isSsaoEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_ssao_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ssao_enabled" }
        }
      val isSsrEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_ssr_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ssr_enabled" }
        }
      val isSsrRough: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_ssr_rough".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ssr_rough" }
        }
      val setAdjustmentBrightness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_adjustment_brightness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_adjustment_brightness" }
        }
      val setAdjustmentColorCorrection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_adjustment_color_correction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_adjustment_color_correction" }
        }
      val setAdjustmentContrast: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_adjustment_contrast".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_adjustment_contrast" }
        }
      val setAdjustmentEnable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_adjustment_enable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_adjustment_enable" }
        }
      val setAdjustmentSaturation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_adjustment_saturation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_adjustment_saturation" }
        }
      val setAmbientLightColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ambient_light_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ambient_light_color" }
        }
      val setAmbientLightEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ambient_light_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ambient_light_energy" }
        }
      val setAmbientLightSkyContribution: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ambient_light_sky_contribution".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ambient_light_sky_contribution"
            }
        }
      val setBackground: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_background".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_background" }
        }
      val setBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bg_color" }
        }
      val setBgEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_bg_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bg_energy" }
        }
      val setCameraFeedId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_camera_feed_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_camera_feed_id" }
        }
      val setCanvasMaxLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_canvas_max_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_canvas_max_layer" }
        }
      val setDofBlurFarAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_far_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_amount" }
        }
      val setDofBlurFarDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_far_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_distance" }
        }
      val setDofBlurFarEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_far_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_enabled" }
        }
      val setDofBlurFarQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_far_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_quality" }
        }
      val setDofBlurFarTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_far_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_transition" }
        }
      val setDofBlurNearAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_near_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_amount" }
        }
      val setDofBlurNearDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_near_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_distance" }
        }
      val setDofBlurNearEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_near_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_enabled" }
        }
      val setDofBlurNearQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_near_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_quality" }
        }
      val setDofBlurNearTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_near_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_transition" }
        }
      val setFogColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_color" }
        }
      val setFogDepthBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_depth_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_depth_begin" }
        }
      val setFogDepthCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_depth_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_depth_curve" }
        }
      val setFogDepthEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_depth_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_depth_enabled" }
        }
      val setFogDepthEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_depth_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_depth_end" }
        }
      val setFogEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_enabled" }
        }
      val setFogHeightCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_height_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_height_curve" }
        }
      val setFogHeightEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_height_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_height_enabled" }
        }
      val setFogHeightMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_height_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_height_max" }
        }
      val setFogHeightMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_height_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_height_min" }
        }
      val setFogSunAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_sun_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_sun_amount" }
        }
      val setFogSunColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_sun_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_sun_color" }
        }
      val setFogTransmitCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_transmit_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_transmit_curve" }
        }
      val setFogTransmitEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_transmit_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_transmit_enabled" }
        }
      val setGlowBicubicUpscale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_bicubic_upscale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_bicubic_upscale" }
        }
      val setGlowBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_blend_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_blend_mode" }
        }
      val setGlowBloom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_bloom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_bloom" }
        }
      val setGlowEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_enabled" }
        }
      val setGlowHdrBleedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_hdr_bleed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_hdr_bleed_scale" }
        }
      val setGlowHdrBleedThreshold: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_hdr_bleed_threshold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_hdr_bleed_threshold" }
        }
      val setGlowHdrLuminanceCap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_hdr_luminance_cap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_hdr_luminance_cap" }
        }
      val setGlowIntensity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_intensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_intensity" }
        }
      val setGlowLevel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_level".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_level" }
        }
      val setGlowStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_strength" }
        }
      val setSky: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_sky".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky" }
        }
      val setSkyCustomFov: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_sky_custom_fov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_custom_fov" }
        }
      val setSkyOrientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_sky_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_orientation" }
        }
      val setSkyRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_sky_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_rotation" }
        }
      val setSkyRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_sky_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_rotation_degrees" }
        }
      val setSsaoAoChannelAffect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_ao_channel_affect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_ao_channel_affect" }
        }
      val setSsaoBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_bias" }
        }
      val setSsaoBlur: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_blur".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_blur" }
        }
      val setSsaoColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_color" }
        }
      val setSsaoDirectLightAffect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_direct_light_affect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_direct_light_affect" }
        }
      val setSsaoEdgeSharpness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_edge_sharpness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_edge_sharpness" }
        }
      val setSsaoEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_enabled" }
        }
      val setSsaoIntensity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_intensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_intensity" }
        }
      val setSsaoIntensity2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_intensity2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_intensity2" }
        }
      val setSsaoQuality: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_quality" }
        }
      val setSsaoRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_radius" }
        }
      val setSsaoRadius2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_radius2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_radius2" }
        }
      val setSsrDepthTolerance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssr_depth_tolerance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssr_depth_tolerance" }
        }
      val setSsrEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssr_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssr_enabled" }
        }
      val setSsrFadeIn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssr_fade_in".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssr_fade_in" }
        }
      val setSsrFadeOut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssr_fade_out".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssr_fade_out" }
        }
      val setSsrMaxSteps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssr_max_steps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssr_max_steps" }
        }
      val setSsrRough: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssr_rough".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssr_rough" }
        }
      val setTonemapAutoExposure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemap_auto_exposure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure" }
        }
      val setTonemapAutoExposureGrey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemap_auto_exposure_grey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure_grey" }
        }
      val setTonemapAutoExposureMax: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemap_auto_exposure_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure_max" }
        }
      val setTonemapAutoExposureMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemap_auto_exposure_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure_min" }
        }
      val setTonemapAutoExposureSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemap_auto_exposure_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure_speed" }
        }
      val setTonemapExposure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemap_exposure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemap_exposure" }
        }
      val setTonemapWhite: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemap_white".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemap_white" }
        }
      val setTonemapper: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemapper".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemapper" }
        }}
  }
}
