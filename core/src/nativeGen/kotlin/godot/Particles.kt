// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.AABB
import godot.core.Allocator
import godot.core.Godot
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

open class Particles(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : GeometryInstance(null) {
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

  var drawPass1: Mesh
    get() {
       return getDrawPassMesh(0) 
    }
    set(value) {
      setDrawPassMesh(0, value)
    }

  var drawPass2: Mesh
    get() {
       return getDrawPassMesh(1) 
    }
    set(value) {
      setDrawPassMesh(1, value)
    }

  var drawPass3: Mesh
    get() {
       return getDrawPassMesh(2) 
    }
    set(value) {
      setDrawPassMesh(2, value)
    }

  var drawPass4: Mesh
    get() {
       return getDrawPassMesh(3) 
    }
    set(value) {
      setDrawPassMesh(3, value)
    }

  var drawPasses: Int
    get() {
       return getDrawPasses() 
    }
    set(value) {
      setDrawPasses(value)
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

  var visibilityAabb: AABB
    get() {
       return getVisibilityAabb() 
    }
    set(value) {
      setVisibilityAabb(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for visibilityAabb
   */
  fun visibilityAabb(cb: AABB.() -> Unit) {
    val _p = visibilityAabb
    cb(_p)
    visibilityAabb = _p
  }

  fun captureAabb(): AABB {
    val self = this
    return Allocator.allocationScope {
      val _ret = AABB()
      val _retPtr = _ret._value.ptr
      __method_bind.captureAabb.call(self._handle, emptyList(), _retPtr)
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
      Particles.DrawOrder.from(_ret.value)
    }
  }

  fun getDrawPassMesh(pass: Int): Mesh {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Mesh
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getDrawPassMesh.call(self._handle, listOf(pass), _retPtr)
      _ret = objectToType<Mesh>(_tmp.value!!)
      _ret
    }
  }

  fun getDrawPasses(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDrawPasses.call(self._handle, emptyList(), _retPtr)
      _ret.value
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

  fun getUseLocalCoordinates(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUseLocalCoordinates.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getVisibilityAabb(): AABB {
    val self = this
    return Allocator.allocationScope {
      val _ret = AABB()
      val _retPtr = _ret._value.ptr
      __method_bind.getVisibilityAabb.call(self._handle, emptyList(), _retPtr)
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

  fun setDrawPassMesh(pass: Int, mesh: Mesh) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(pass)
      _args.add(mesh)
      __method_bind.setDrawPassMesh.call(self._handle, _args, null)
    }
  }

  fun setDrawPasses(passes: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDrawPasses.call(self._handle, listOf(passes), null)
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

  fun setOneShot(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOneShot.call(self._handle, listOf(enable), null)
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

  fun setUseLocalCoordinates(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseLocalCoordinates.call(self._handle, listOf(enable), null)
    }
  }

  fun setVisibilityAabb(aabb: AABB) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVisibilityAabb.call(self._handle, listOf(aabb), null)
    }
  }

  enum class DrawOrder(
    val value: Int
  ) {
    INDEX(0),

    LIFETIME(1),

    VIEW_DEPTH(2);

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
    val MAX_DRAW_PASSES: Int = 4

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Particles".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Particles" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Particles
     */
    private object __method_bind {
      val captureAabb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "capture_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method capture_aabb" }
        }
      val getAmount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_amount" }
        }
      val getDrawOrder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_draw_order".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_draw_order" }
        }
      val getDrawPassMesh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_draw_pass_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_draw_pass_mesh" }
        }
      val getDrawPasses: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_draw_passes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_draw_passes" }
        }
      val getExplosivenessRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_explosiveness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_explosiveness_ratio" }
        }
      val getFixedFps: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_fixed_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fixed_fps" }
        }
      val getFractionalDelta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_fractional_delta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fractional_delta" }
        }
      val getLifetime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_lifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lifetime" }
        }
      val getOneShot: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_one_shot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_one_shot" }
        }
      val getPreProcessTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_pre_process_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pre_process_time" }
        }
      val getProcessMaterial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_process_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_material" }
        }
      val getRandomnessRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_randomness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_randomness_ratio" }
        }
      val getSpeedScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
        }
      val getUseLocalCoordinates: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_use_local_coordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_local_coordinates" }
        }
      val getVisibilityAabb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_visibility_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visibility_aabb" }
        }
      val isEmitting: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "is_emitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_emitting" }
        }
      val restart: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "restart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method restart" }
        }
      val setAmount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_amount" }
        }
      val setDrawOrder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_draw_order".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_order" }
        }
      val setDrawPassMesh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_draw_pass_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_pass_mesh" }
        }
      val setDrawPasses: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_draw_passes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_passes" }
        }
      val setEmitting: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_emitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emitting" }
        }
      val setExplosivenessRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_explosiveness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_explosiveness_ratio" }
        }
      val setFixedFps: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_fixed_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fixed_fps" }
        }
      val setFractionalDelta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_fractional_delta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fractional_delta" }
        }
      val setLifetime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_lifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lifetime" }
        }
      val setOneShot: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_one_shot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_one_shot" }
        }
      val setPreProcessTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_pre_process_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pre_process_time" }
        }
      val setProcessMaterial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_process_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_material" }
        }
      val setRandomnessRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_randomness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_randomness_ratio" }
        }
      val setSpeedScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
        }
      val setUseLocalCoordinates: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_use_local_coordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_local_coordinates" }
        }
      val setVisibilityAabb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_visibility_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_visibility_aabb" }
        }}
  }
}
