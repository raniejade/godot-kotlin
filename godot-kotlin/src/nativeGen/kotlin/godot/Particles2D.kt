// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
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

open class Particles2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var amount: Int
    get() {
       return getAmount() 
    }
    set(value) {
      setAmount(value)
    }

  var drawOrder: DrawOrder
    get() {
       return getDrawOrder() 
    }
    set(value) {
      setDrawOrder(value.value)
    }

  var emitting: Boolean
    get() {
       return isEmitting() 
    }
    set(value) {
      setEmitting(value)
    }

  var explosiveness: Float
    get() {
       return getExplosivenessRatio() 
    }
    set(value) {
      setExplosivenessRatio(value)
    }

  var fixedFps: Int
    get() {
       return getFixedFps() 
    }
    set(value) {
      setFixedFps(value)
    }

  var fractDelta: Boolean
    get() {
       return getFractionalDelta() 
    }
    set(value) {
      setFractionalDelta(value)
    }

  var lifetime: Float
    get() {
       return getLifetime() 
    }
    set(value) {
      setLifetime(value)
    }

  var localCoords: Boolean
    get() {
       return getUseLocalCoordinates() 
    }
    set(value) {
      setUseLocalCoordinates(value)
    }

  var normalMap: Texture
    get() {
       return getNormalMap() 
    }
    set(value) {
      setNormalMap(value)
    }

  var oneShot: Boolean
    get() {
       return getOneShot() 
    }
    set(value) {
      setOneShot(value)
    }

  var preprocess: Float
    get() {
       return getPreProcessTime() 
    }
    set(value) {
      setPreProcessTime(value)
    }

  var processMaterial: Material
    get() {
       return getProcessMaterial() 
    }
    set(value) {
      setProcessMaterial(value)
    }

  var randomness: Float
    get() {
       return getRandomnessRatio() 
    }
    set(value) {
      setRandomnessRatio(value)
    }

  var speedScale: Float
    get() {
       return getSpeedScale() 
    }
    set(value) {
      setSpeedScale(value)
    }

  var texture: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
    }

  var visibilityRect: Rect2
    get() {
       return getVisibilityRect() 
    }
    set(value) {
      setVisibilityRect(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for visibilityRect
   */
  fun visibilityRect(cb: Rect2.() -> Unit) {
    val _p = visibilityRect
    cb(_p)
    visibilityRect = _p
  }

  fun captureRect(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.captureRect.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getAmount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAmount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getDrawOrder(): DrawOrder {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDrawOrder.call(self._handle, emptyList(), _retPtr)
      Particles2D.DrawOrder.from(_ret.value)
    }
  }

  fun getExplosivenessRatio(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getExplosivenessRatio.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFixedFps(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFixedFps.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFractionalDelta(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFractionalDelta.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLifetime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLifetime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getNormalMap(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNormalMap.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getOneShot(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOneShot.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPreProcessTime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPreProcessTime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getProcessMaterial(): Material {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Material
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getProcessMaterial.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Material>(_tmp.value!!)
      _ret
    }
  }

  fun getRandomnessRatio(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRandomnessRatio.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSpeedScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpeedScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getUseLocalCoordinates(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUseLocalCoordinates.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getVisibilityRect(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getVisibilityRect.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isEmitting(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEmitting.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun restart() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.restart.call(self._handle, emptyList(), null)
    }
  }

  fun setAmount(amount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAmount.call(self._handle, listOf(amount), null)
    }
  }

  fun setDrawOrder(order: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDrawOrder.call(self._handle, listOf(order), null)
    }
  }

  fun setEmitting(emitting: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEmitting.call(self._handle, listOf(emitting), null)
    }
  }

  fun setExplosivenessRatio(ratio: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExplosivenessRatio.call(self._handle, listOf(ratio), null)
    }
  }

  fun setFixedFps(fps: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFixedFps.call(self._handle, listOf(fps), null)
    }
  }

  fun setFractionalDelta(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFractionalDelta.call(self._handle, listOf(enable), null)
    }
  }

  fun setLifetime(secs: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLifetime.call(self._handle, listOf(secs), null)
    }
  }

  fun setNormalMap(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNormalMap.call(self._handle, listOf(texture), null)
    }
  }

  fun setOneShot(secs: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOneShot.call(self._handle, listOf(secs), null)
    }
  }

  fun setPreProcessTime(secs: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPreProcessTime.call(self._handle, listOf(secs), null)
    }
  }

  fun setProcessMaterial(material: Material) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProcessMaterial.call(self._handle, listOf(material), null)
    }
  }

  fun setRandomnessRatio(ratio: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRandomnessRatio.call(self._handle, listOf(ratio), null)
    }
  }

  fun setSpeedScale(scale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpeedScale.call(self._handle, listOf(scale), null)
    }
  }

  fun setTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setUseLocalCoordinates(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseLocalCoordinates.call(self._handle, listOf(enable), null)
    }
  }

  fun setVisibilityRect(visibilityRect: Rect2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVisibilityRect.call(self._handle, listOf(visibilityRect), null)
    }
  }

  enum class DrawOrder(
    val value: Int
  ) {
    INDEX(0),

    LIFETIME(1);

    companion object {
      fun from(value: Int): DrawOrder {
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Particles2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Particles2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Particles2D
     */
    private object __method_bind {
      val captureRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "capture_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method capture_rect" }
            }
          }

      val getAmount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_amount" }
            }
          }

      val getDrawOrder: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_draw_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_draw_order" }
            }
          }

      val getExplosivenessRatio: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_explosiveness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_explosiveness_ratio" }
            }
          }

      val getFixedFps: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_fixed_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fixed_fps" }
            }
          }

      val getFractionalDelta: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_fractional_delta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fractional_delta" }
            }
          }

      val getLifetime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_lifetime".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lifetime" }
            }
          }

      val getNormalMap: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normal_map" }
            }
          }

      val getOneShot: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_one_shot" }
            }
          }

      val getPreProcessTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_pre_process_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pre_process_time" }
            }
          }

      val getProcessMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_process_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_process_material" }
            }
          }

      val getRandomnessRatio: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_randomness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_randomness_ratio" }
            }
          }

      val getSpeedScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
            }
          }

      val getTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val getUseLocalCoordinates: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_use_local_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_use_local_coordinates" }
            }
          }

      val getVisibilityRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_visibility_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_visibility_rect" }
            }
          }

      val isEmitting: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "is_emitting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_emitting" }
            }
          }

      val restart: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "restart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method restart" }
            }
          }

      val setAmount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_amount" }
            }
          }

      val setDrawOrder: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_draw_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_order" }
            }
          }

      val setEmitting: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_emitting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emitting" }
            }
          }

      val setExplosivenessRatio: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_explosiveness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_explosiveness_ratio" }
            }
          }

      val setFixedFps: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_fixed_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fixed_fps" }
            }
          }

      val setFractionalDelta: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_fractional_delta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fractional_delta" }
            }
          }

      val setLifetime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_lifetime".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lifetime" }
            }
          }

      val setNormalMap: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normal_map" }
            }
          }

      val setOneShot: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_one_shot" }
            }
          }

      val setPreProcessTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_pre_process_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pre_process_time" }
            }
          }

      val setProcessMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_process_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_process_material" }
            }
          }

      val setRandomnessRatio: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_randomness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_randomness_ratio" }
            }
          }

      val setSpeedScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
            }
          }

      val setTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val setUseLocalCoordinates: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_use_local_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_local_coordinates" }
            }
          }

      val setVisibilityRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_visibility_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_visibility_rect" }
            }
          }
    }
  }
}
