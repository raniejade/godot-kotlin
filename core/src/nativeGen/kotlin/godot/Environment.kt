// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Basis
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

open class Environment(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAdjustmentBrightness.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAdjustmentColorCorrection(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getAdjustmentColorCorrection.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getAdjustmentContrast(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAdjustmentContrast.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAdjustmentSaturation(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAdjustmentSaturation.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAmbientLightColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getAmbientLightColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getAmbientLightEnergy(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAmbientLightEnergy.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAmbientLightSkyContribution(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAmbientLightSkyContribution.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getBackground(): BGMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBackground.call(self._handle, emptyList(), _retPtr)
      Environment.BGMode.from(_ret.value)
    }
  }

  fun getBgColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getBgColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBgEnergy(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBgEnergy.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getCameraFeedId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCameraFeedId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCanvasMaxLayer(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCanvasMaxLayer.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getDofBlurFarAmount(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDofBlurFarAmount.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDofBlurFarDistance(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDofBlurFarDistance.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDofBlurFarQuality(): DOFBlurQuality {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDofBlurFarQuality.call(self._handle, emptyList(), _retPtr)
      Environment.DOFBlurQuality.from(_ret.value)
    }
  }

  fun getDofBlurFarTransition(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDofBlurFarTransition.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDofBlurNearAmount(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDofBlurNearAmount.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDofBlurNearDistance(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDofBlurNearDistance.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDofBlurNearQuality(): DOFBlurQuality {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDofBlurNearQuality.call(self._handle, emptyList(), _retPtr)
      Environment.DOFBlurQuality.from(_ret.value)
    }
  }

  fun getDofBlurNearTransition(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDofBlurNearTransition.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFogColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getFogColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFogDepthBegin(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFogDepthBegin.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFogDepthCurve(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFogDepthCurve.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFogDepthEnd(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFogDepthEnd.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFogHeightCurve(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFogHeightCurve.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFogHeightMax(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFogHeightMax.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFogHeightMin(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFogHeightMin.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFogSunAmount(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFogSunAmount.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFogSunColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getFogSunColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFogTransmitCurve(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFogTransmitCurve.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGlowBlendMode(): GlowBlendMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGlowBlendMode.call(self._handle, emptyList(), _retPtr)
      Environment.GlowBlendMode.from(_ret.value)
    }
  }

  fun getGlowBloom(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGlowBloom.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGlowHdrBleedScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGlowHdrBleedScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGlowHdrBleedThreshold(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGlowHdrBleedThreshold.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGlowHdrLuminanceCap(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGlowHdrLuminanceCap.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGlowIntensity(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGlowIntensity.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGlowStrength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGlowStrength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSky(): Sky {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Sky
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSky.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Sky>(_tmp.value!!)
      _ret
    }
  }

  fun getSkyCustomFov(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSkyCustomFov.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSkyOrientation(): Basis {
    val self = this
    return Allocator.allocationScope {
      val _ret = Basis()
      val _retPtr = _ret._value.ptr
      __method_bind.getSkyOrientation.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSkyRotation(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getSkyRotation.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSkyRotationDegrees(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getSkyRotationDegrees.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSsaoAoChannelAffect(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSsaoAoChannelAffect.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSsaoBias(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSsaoBias.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSsaoBlur(): SSAOBlur {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSsaoBlur.call(self._handle, emptyList(), _retPtr)
      Environment.SSAOBlur.from(_ret.value)
    }
  }

  fun getSsaoColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getSsaoColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSsaoDirectLightAffect(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSsaoDirectLightAffect.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSsaoEdgeSharpness(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSsaoEdgeSharpness.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSsaoIntensity(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSsaoIntensity.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSsaoIntensity2(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSsaoIntensity2.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSsaoQuality(): SSAOQuality {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSsaoQuality.call(self._handle, emptyList(), _retPtr)
      Environment.SSAOQuality.from(_ret.value)
    }
  }

  fun getSsaoRadius(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSsaoRadius.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSsaoRadius2(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSsaoRadius2.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSsrDepthTolerance(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSsrDepthTolerance.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSsrFadeIn(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSsrFadeIn.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSsrFadeOut(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSsrFadeOut.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSsrMaxSteps(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSsrMaxSteps.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTonemapAutoExposure(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTonemapAutoExposure.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTonemapAutoExposureGrey(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTonemapAutoExposureGrey.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTonemapAutoExposureMax(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTonemapAutoExposureMax.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTonemapAutoExposureMin(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTonemapAutoExposureMin.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTonemapAutoExposureSpeed(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTonemapAutoExposureSpeed.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTonemapExposure(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTonemapExposure.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTonemapWhite(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTonemapWhite.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTonemapper(): ToneMapper {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTonemapper.call(self._handle, emptyList(), _retPtr)
      Environment.ToneMapper.from(_ret.value)
    }
  }

  fun isAdjustmentEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isAdjustmentEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isDofBlurFarEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDofBlurFarEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isDofBlurNearEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDofBlurNearEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isFogDepthEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFogDepthEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isFogEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFogEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isFogHeightEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFogHeightEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isFogTransmitEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFogTransmitEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isGlowBicubicUpscaleEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isGlowBicubicUpscaleEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isGlowEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isGlowEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isGlowLevelEnabled(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isGlowLevelEnabled.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun isSsaoEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSsaoEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSsrEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSsrEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSsrRough(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSsrRough.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAdjustmentBrightness(brightness: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAdjustmentBrightness.call(self._handle, listOf(brightness), null)
    }
  }

  fun setAdjustmentColorCorrection(colorCorrection: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAdjustmentColorCorrection.call(self._handle, listOf(colorCorrection), null)
    }
  }

  fun setAdjustmentContrast(contrast: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAdjustmentContrast.call(self._handle, listOf(contrast), null)
    }
  }

  fun setAdjustmentEnable(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAdjustmentEnable.call(self._handle, listOf(enabled), null)
    }
  }

  fun setAdjustmentSaturation(saturation: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAdjustmentSaturation.call(self._handle, listOf(saturation), null)
    }
  }

  fun setAmbientLightColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAmbientLightColor.call(self._handle, listOf(color), null)
    }
  }

  fun setAmbientLightEnergy(energy: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAmbientLightEnergy.call(self._handle, listOf(energy), null)
    }
  }

  fun setAmbientLightSkyContribution(energy: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAmbientLightSkyContribution.call(self._handle, listOf(energy), null)
    }
  }

  fun setBackground(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBackground.call(self._handle, listOf(mode), null)
    }
  }

  fun setBgColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBgColor.call(self._handle, listOf(color), null)
    }
  }

  fun setBgEnergy(energy: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBgEnergy.call(self._handle, listOf(energy), null)
    }
  }

  fun setCameraFeedId(cameraFeedId: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCameraFeedId.call(self._handle, listOf(cameraFeedId), null)
    }
  }

  fun setCanvasMaxLayer(layer: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCanvasMaxLayer.call(self._handle, listOf(layer), null)
    }
  }

  fun setDofBlurFarAmount(intensity: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDofBlurFarAmount.call(self._handle, listOf(intensity), null)
    }
  }

  fun setDofBlurFarDistance(intensity: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDofBlurFarDistance.call(self._handle, listOf(intensity), null)
    }
  }

  fun setDofBlurFarEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDofBlurFarEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setDofBlurFarQuality(intensity: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDofBlurFarQuality.call(self._handle, listOf(intensity), null)
    }
  }

  fun setDofBlurFarTransition(intensity: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDofBlurFarTransition.call(self._handle, listOf(intensity), null)
    }
  }

  fun setDofBlurNearAmount(intensity: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDofBlurNearAmount.call(self._handle, listOf(intensity), null)
    }
  }

  fun setDofBlurNearDistance(intensity: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDofBlurNearDistance.call(self._handle, listOf(intensity), null)
    }
  }

  fun setDofBlurNearEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDofBlurNearEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setDofBlurNearQuality(level: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDofBlurNearQuality.call(self._handle, listOf(level), null)
    }
  }

  fun setDofBlurNearTransition(intensity: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDofBlurNearTransition.call(self._handle, listOf(intensity), null)
    }
  }

  fun setFogColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFogColor.call(self._handle, listOf(color), null)
    }
  }

  fun setFogDepthBegin(distance: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFogDepthBegin.call(self._handle, listOf(distance), null)
    }
  }

  fun setFogDepthCurve(curve: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFogDepthCurve.call(self._handle, listOf(curve), null)
    }
  }

  fun setFogDepthEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFogDepthEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setFogDepthEnd(distance: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFogDepthEnd.call(self._handle, listOf(distance), null)
    }
  }

  fun setFogEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFogEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setFogHeightCurve(curve: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFogHeightCurve.call(self._handle, listOf(curve), null)
    }
  }

  fun setFogHeightEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFogHeightEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setFogHeightMax(height: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFogHeightMax.call(self._handle, listOf(height), null)
    }
  }

  fun setFogHeightMin(height: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFogHeightMin.call(self._handle, listOf(height), null)
    }
  }

  fun setFogSunAmount(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFogSunAmount.call(self._handle, listOf(amount), null)
    }
  }

  fun setFogSunColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFogSunColor.call(self._handle, listOf(color), null)
    }
  }

  fun setFogTransmitCurve(curve: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFogTransmitCurve.call(self._handle, listOf(curve), null)
    }
  }

  fun setFogTransmitEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFogTransmitEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setGlowBicubicUpscale(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlowBicubicUpscale.call(self._handle, listOf(enabled), null)
    }
  }

  fun setGlowBlendMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlowBlendMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setGlowBloom(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlowBloom.call(self._handle, listOf(amount), null)
    }
  }

  fun setGlowEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlowEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setGlowHdrBleedScale(scale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlowHdrBleedScale.call(self._handle, listOf(scale), null)
    }
  }

  fun setGlowHdrBleedThreshold(threshold: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlowHdrBleedThreshold.call(self._handle, listOf(threshold), null)
    }
  }

  fun setGlowHdrLuminanceCap(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlowHdrLuminanceCap.call(self._handle, listOf(amount), null)
    }
  }

  fun setGlowIntensity(intensity: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlowIntensity.call(self._handle, listOf(intensity), null)
    }
  }

  fun setGlowLevel(idx: Int, enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(enabled)
      __method_bind.setGlowLevel.call(self._handle, _args, null)
    }
  }

  fun setGlowStrength(strength: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlowStrength.call(self._handle, listOf(strength), null)
    }
  }

  fun setSky(sky: Sky) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSky.call(self._handle, listOf(sky), null)
    }
  }

  fun setSkyCustomFov(scale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSkyCustomFov.call(self._handle, listOf(scale), null)
    }
  }

  fun setSkyOrientation(orientation: Basis) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSkyOrientation.call(self._handle, listOf(orientation), null)
    }
  }

  fun setSkyRotation(eulerRadians: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSkyRotation.call(self._handle, listOf(eulerRadians), null)
    }
  }

  fun setSkyRotationDegrees(eulerDegrees: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSkyRotationDegrees.call(self._handle, listOf(eulerDegrees), null)
    }
  }

  fun setSsaoAoChannelAffect(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsaoAoChannelAffect.call(self._handle, listOf(amount), null)
    }
  }

  fun setSsaoBias(bias: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsaoBias.call(self._handle, listOf(bias), null)
    }
  }

  fun setSsaoBlur(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsaoBlur.call(self._handle, listOf(mode), null)
    }
  }

  fun setSsaoColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsaoColor.call(self._handle, listOf(color), null)
    }
  }

  fun setSsaoDirectLightAffect(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsaoDirectLightAffect.call(self._handle, listOf(amount), null)
    }
  }

  fun setSsaoEdgeSharpness(edgeSharpness: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsaoEdgeSharpness.call(self._handle, listOf(edgeSharpness), null)
    }
  }

  fun setSsaoEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsaoEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setSsaoIntensity(intensity: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsaoIntensity.call(self._handle, listOf(intensity), null)
    }
  }

  fun setSsaoIntensity2(intensity: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsaoIntensity2.call(self._handle, listOf(intensity), null)
    }
  }

  fun setSsaoQuality(quality: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsaoQuality.call(self._handle, listOf(quality), null)
    }
  }

  fun setSsaoRadius(radius: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsaoRadius.call(self._handle, listOf(radius), null)
    }
  }

  fun setSsaoRadius2(radius: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsaoRadius2.call(self._handle, listOf(radius), null)
    }
  }

  fun setSsrDepthTolerance(depthTolerance: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsrDepthTolerance.call(self._handle, listOf(depthTolerance), null)
    }
  }

  fun setSsrEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsrEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setSsrFadeIn(fadeIn: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsrFadeIn.call(self._handle, listOf(fadeIn), null)
    }
  }

  fun setSsrFadeOut(fadeOut: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsrFadeOut.call(self._handle, listOf(fadeOut), null)
    }
  }

  fun setSsrMaxSteps(maxSteps: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsrMaxSteps.call(self._handle, listOf(maxSteps), null)
    }
  }

  fun setSsrRough(rough: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSsrRough.call(self._handle, listOf(rough), null)
    }
  }

  fun setTonemapAutoExposure(autoExposure: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTonemapAutoExposure.call(self._handle, listOf(autoExposure), null)
    }
  }

  fun setTonemapAutoExposureGrey(exposureGrey: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTonemapAutoExposureGrey.call(self._handle, listOf(exposureGrey), null)
    }
  }

  fun setTonemapAutoExposureMax(exposureMax: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTonemapAutoExposureMax.call(self._handle, listOf(exposureMax), null)
    }
  }

  fun setTonemapAutoExposureMin(exposureMin: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTonemapAutoExposureMin.call(self._handle, listOf(exposureMin), null)
    }
  }

  fun setTonemapAutoExposureSpeed(exposureSpeed: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTonemapAutoExposureSpeed.call(self._handle, listOf(exposureSpeed), null)
    }
  }

  fun setTonemapExposure(exposure: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTonemapExposure.call(self._handle, listOf(exposure), null)
    }
  }

  fun setTonemapWhite(white: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTonemapWhite.call(self._handle, listOf(white), null)
    }
  }

  fun setTonemapper(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTonemapper.call(self._handle, listOf(mode), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Environment".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Environment" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Environment
     */
    private object __method_bind {
      val getAdjustmentBrightness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_adjustment_brightness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_adjustment_brightness" }
        }
      val getAdjustmentColorCorrection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_adjustment_color_correction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_adjustment_color_correction" }
        }
      val getAdjustmentContrast: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_adjustment_contrast".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_adjustment_contrast" }
        }
      val getAdjustmentSaturation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_adjustment_saturation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_adjustment_saturation" }
        }
      val getAmbientLightColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ambient_light_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ambient_light_color" }
        }
      val getAmbientLightEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ambient_light_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ambient_light_energy" }
        }
      val getAmbientLightSkyContribution: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ambient_light_sky_contribution".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ambient_light_sky_contribution"
            }
        }
      val getBackground: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_background".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_background" }
        }
      val getBgColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bg_color" }
        }
      val getBgEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_bg_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bg_energy" }
        }
      val getCameraFeedId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_camera_feed_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_feed_id" }
        }
      val getCanvasMaxLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_canvas_max_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_canvas_max_layer" }
        }
      val getDofBlurFarAmount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_far_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_amount" }
        }
      val getDofBlurFarDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_far_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_distance" }
        }
      val getDofBlurFarQuality: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_far_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_quality" }
        }
      val getDofBlurFarTransition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_far_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_far_transition" }
        }
      val getDofBlurNearAmount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_near_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_amount" }
        }
      val getDofBlurNearDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_near_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_distance" }
        }
      val getDofBlurNearQuality: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_near_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_quality" }
        }
      val getDofBlurNearTransition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_dof_blur_near_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dof_blur_near_transition" }
        }
      val getFogColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_color" }
        }
      val getFogDepthBegin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_depth_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_depth_begin" }
        }
      val getFogDepthCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_depth_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_depth_curve" }
        }
      val getFogDepthEnd: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_depth_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_depth_end" }
        }
      val getFogHeightCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_height_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_height_curve" }
        }
      val getFogHeightMax: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_height_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_height_max" }
        }
      val getFogHeightMin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_height_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_height_min" }
        }
      val getFogSunAmount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_sun_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_sun_amount" }
        }
      val getFogSunColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_sun_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_sun_color" }
        }
      val getFogTransmitCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_fog_transmit_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fog_transmit_curve" }
        }
      val getGlowBlendMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_glow_blend_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_glow_blend_mode" }
        }
      val getGlowBloom: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_glow_bloom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_glow_bloom" }
        }
      val getGlowHdrBleedScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_glow_hdr_bleed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_glow_hdr_bleed_scale" }
        }
      val getGlowHdrBleedThreshold: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_glow_hdr_bleed_threshold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_glow_hdr_bleed_threshold" }
        }
      val getGlowHdrLuminanceCap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_glow_hdr_luminance_cap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_glow_hdr_luminance_cap" }
        }
      val getGlowIntensity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_glow_intensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_glow_intensity" }
        }
      val getGlowStrength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_glow_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_glow_strength" }
        }
      val getSky: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_sky".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky" }
        }
      val getSkyCustomFov: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_sky_custom_fov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_custom_fov" }
        }
      val getSkyOrientation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_sky_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_orientation" }
        }
      val getSkyRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_sky_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_rotation" }
        }
      val getSkyRotationDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_sky_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sky_rotation_degrees" }
        }
      val getSsaoAoChannelAffect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_ao_channel_affect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_ao_channel_affect" }
        }
      val getSsaoBias: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_bias" }
        }
      val getSsaoBlur: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_blur".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_blur" }
        }
      val getSsaoColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_color" }
        }
      val getSsaoDirectLightAffect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_direct_light_affect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_direct_light_affect" }
        }
      val getSsaoEdgeSharpness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_edge_sharpness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_edge_sharpness" }
        }
      val getSsaoIntensity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_intensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_intensity" }
        }
      val getSsaoIntensity2: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_intensity2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_intensity2" }
        }
      val getSsaoQuality: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_quality" }
        }
      val getSsaoRadius: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_radius" }
        }
      val getSsaoRadius2: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssao_radius2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssao_radius2" }
        }
      val getSsrDepthTolerance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssr_depth_tolerance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssr_depth_tolerance" }
        }
      val getSsrFadeIn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssr_fade_in".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssr_fade_in" }
        }
      val getSsrFadeOut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssr_fade_out".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssr_fade_out" }
        }
      val getSsrMaxSteps: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_ssr_max_steps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssr_max_steps" }
        }
      val getTonemapAutoExposure: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemap_auto_exposure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure" }
        }
      val getTonemapAutoExposureGrey: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemap_auto_exposure_grey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure_grey" }
        }
      val getTonemapAutoExposureMax: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemap_auto_exposure_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure_max" }
        }
      val getTonemapAutoExposureMin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemap_auto_exposure_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure_min" }
        }
      val getTonemapAutoExposureSpeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemap_auto_exposure_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemap_auto_exposure_speed" }
        }
      val getTonemapExposure: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemap_exposure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemap_exposure" }
        }
      val getTonemapWhite: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemap_white".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemap_white" }
        }
      val getTonemapper: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "get_tonemapper".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tonemapper" }
        }
      val isAdjustmentEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_adjustment_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_adjustment_enabled" }
        }
      val isDofBlurFarEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_dof_blur_far_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_dof_blur_far_enabled" }
        }
      val isDofBlurNearEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_dof_blur_near_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_dof_blur_near_enabled" }
        }
      val isFogDepthEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_fog_depth_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_fog_depth_enabled" }
        }
      val isFogEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_fog_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_fog_enabled" }
        }
      val isFogHeightEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_fog_height_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_fog_height_enabled" }
        }
      val isFogTransmitEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_fog_transmit_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_fog_transmit_enabled" }
        }
      val isGlowBicubicUpscaleEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_glow_bicubic_upscale_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_glow_bicubic_upscale_enabled" }
        }
      val isGlowEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_glow_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_glow_enabled" }
        }
      val isGlowLevelEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_glow_level_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_glow_level_enabled" }
        }
      val isSsaoEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_ssao_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ssao_enabled" }
        }
      val isSsrEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_ssr_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ssr_enabled" }
        }
      val isSsrRough: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "is_ssr_rough".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ssr_rough" }
        }
      val setAdjustmentBrightness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_adjustment_brightness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_adjustment_brightness" }
        }
      val setAdjustmentColorCorrection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_adjustment_color_correction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_adjustment_color_correction" }
        }
      val setAdjustmentContrast: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_adjustment_contrast".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_adjustment_contrast" }
        }
      val setAdjustmentEnable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_adjustment_enable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_adjustment_enable" }
        }
      val setAdjustmentSaturation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_adjustment_saturation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_adjustment_saturation" }
        }
      val setAmbientLightColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ambient_light_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ambient_light_color" }
        }
      val setAmbientLightEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ambient_light_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ambient_light_energy" }
        }
      val setAmbientLightSkyContribution: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ambient_light_sky_contribution".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ambient_light_sky_contribution"
            }
        }
      val setBackground: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_background".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_background" }
        }
      val setBgColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bg_color" }
        }
      val setBgEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_bg_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bg_energy" }
        }
      val setCameraFeedId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_camera_feed_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_camera_feed_id" }
        }
      val setCanvasMaxLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_canvas_max_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_canvas_max_layer" }
        }
      val setDofBlurFarAmount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_far_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_amount" }
        }
      val setDofBlurFarDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_far_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_distance" }
        }
      val setDofBlurFarEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_far_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_enabled" }
        }
      val setDofBlurFarQuality: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_far_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_quality" }
        }
      val setDofBlurFarTransition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_far_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_far_transition" }
        }
      val setDofBlurNearAmount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_near_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_amount" }
        }
      val setDofBlurNearDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_near_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_distance" }
        }
      val setDofBlurNearEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_near_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_enabled" }
        }
      val setDofBlurNearQuality: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_near_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_quality" }
        }
      val setDofBlurNearTransition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_dof_blur_near_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dof_blur_near_transition" }
        }
      val setFogColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_color" }
        }
      val setFogDepthBegin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_depth_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_depth_begin" }
        }
      val setFogDepthCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_depth_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_depth_curve" }
        }
      val setFogDepthEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_depth_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_depth_enabled" }
        }
      val setFogDepthEnd: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_depth_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_depth_end" }
        }
      val setFogEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_enabled" }
        }
      val setFogHeightCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_height_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_height_curve" }
        }
      val setFogHeightEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_height_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_height_enabled" }
        }
      val setFogHeightMax: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_height_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_height_max" }
        }
      val setFogHeightMin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_height_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_height_min" }
        }
      val setFogSunAmount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_sun_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_sun_amount" }
        }
      val setFogSunColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_sun_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_sun_color" }
        }
      val setFogTransmitCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_transmit_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_transmit_curve" }
        }
      val setFogTransmitEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_fog_transmit_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fog_transmit_enabled" }
        }
      val setGlowBicubicUpscale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_bicubic_upscale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_bicubic_upscale" }
        }
      val setGlowBlendMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_blend_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_blend_mode" }
        }
      val setGlowBloom: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_bloom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_bloom" }
        }
      val setGlowEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_enabled" }
        }
      val setGlowHdrBleedScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_hdr_bleed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_hdr_bleed_scale" }
        }
      val setGlowHdrBleedThreshold: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_hdr_bleed_threshold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_hdr_bleed_threshold" }
        }
      val setGlowHdrLuminanceCap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_hdr_luminance_cap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_hdr_luminance_cap" }
        }
      val setGlowIntensity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_intensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_intensity" }
        }
      val setGlowLevel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_level".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_level" }
        }
      val setGlowStrength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_glow_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_glow_strength" }
        }
      val setSky: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_sky".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky" }
        }
      val setSkyCustomFov: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_sky_custom_fov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_custom_fov" }
        }
      val setSkyOrientation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_sky_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_orientation" }
        }
      val setSkyRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_sky_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_rotation" }
        }
      val setSkyRotationDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_sky_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sky_rotation_degrees" }
        }
      val setSsaoAoChannelAffect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_ao_channel_affect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_ao_channel_affect" }
        }
      val setSsaoBias: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_bias" }
        }
      val setSsaoBlur: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_blur".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_blur" }
        }
      val setSsaoColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_color" }
        }
      val setSsaoDirectLightAffect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_direct_light_affect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_direct_light_affect" }
        }
      val setSsaoEdgeSharpness: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_edge_sharpness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_edge_sharpness" }
        }
      val setSsaoEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_enabled" }
        }
      val setSsaoIntensity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_intensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_intensity" }
        }
      val setSsaoIntensity2: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_intensity2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_intensity2" }
        }
      val setSsaoQuality: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_quality".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_quality" }
        }
      val setSsaoRadius: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_radius" }
        }
      val setSsaoRadius2: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssao_radius2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssao_radius2" }
        }
      val setSsrDepthTolerance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssr_depth_tolerance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssr_depth_tolerance" }
        }
      val setSsrEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssr_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssr_enabled" }
        }
      val setSsrFadeIn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssr_fade_in".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssr_fade_in" }
        }
      val setSsrFadeOut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssr_fade_out".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssr_fade_out" }
        }
      val setSsrMaxSteps: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssr_max_steps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssr_max_steps" }
        }
      val setSsrRough: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_ssr_rough".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssr_rough" }
        }
      val setTonemapAutoExposure: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemap_auto_exposure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure" }
        }
      val setTonemapAutoExposureGrey: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemap_auto_exposure_grey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure_grey" }
        }
      val setTonemapAutoExposureMax: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemap_auto_exposure_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure_max" }
        }
      val setTonemapAutoExposureMin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemap_auto_exposure_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure_min" }
        }
      val setTonemapAutoExposureSpeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemap_auto_exposure_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemap_auto_exposure_speed" }
        }
      val setTonemapExposure: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemap_exposure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemap_exposure" }
        }
      val setTonemapWhite: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemap_white".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemap_white" }
        }
      val setTonemapper: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Environment".cstr.ptr,
            "set_tonemapper".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tonemapper" }
        }}
  }
}
