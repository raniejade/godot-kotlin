// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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
    _handle = __new()
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
    val _ret = __method_bind.captureAabb.call(this._handle)
    return _ret.asAABB()
  }

  fun getAmount(): Int {
    val _ret = __method_bind.getAmount.call(this._handle)
    return _ret.asInt()
  }

  fun getDrawOrder(): DrawOrder {
    val _ret = __method_bind.getDrawOrder.call(this._handle)
    return Particles.DrawOrder.from(_ret.asInt())
  }

  fun getDrawPassMesh(pass: Int): Mesh {
    val _arg = Variant(pass)
    val _ret = __method_bind.getDrawPassMesh.call(this._handle, listOf(_arg))
    return _ret.asObject(::Mesh)!!
  }

  fun getDrawPasses(): Int {
    val _ret = __method_bind.getDrawPasses.call(this._handle)
    return _ret.asInt()
  }

  fun getExplosivenessRatio(): Float {
    val _ret = __method_bind.getExplosivenessRatio.call(this._handle)
    return _ret.asFloat()
  }

  fun getFixedFps(): Int {
    val _ret = __method_bind.getFixedFps.call(this._handle)
    return _ret.asInt()
  }

  fun getFractionalDelta(): Boolean {
    val _ret = __method_bind.getFractionalDelta.call(this._handle)
    return _ret.asBoolean()
  }

  fun getLifetime(): Float {
    val _ret = __method_bind.getLifetime.call(this._handle)
    return _ret.asFloat()
  }

  fun getOneShot(): Boolean {
    val _ret = __method_bind.getOneShot.call(this._handle)
    return _ret.asBoolean()
  }

  fun getPreProcessTime(): Float {
    val _ret = __method_bind.getPreProcessTime.call(this._handle)
    return _ret.asFloat()
  }

  fun getProcessMaterial(): Material {
    val _ret = __method_bind.getProcessMaterial.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun getRandomnessRatio(): Float {
    val _ret = __method_bind.getRandomnessRatio.call(this._handle)
    return _ret.asFloat()
  }

  fun getSpeedScale(): Float {
    val _ret = __method_bind.getSpeedScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getUseLocalCoordinates(): Boolean {
    val _ret = __method_bind.getUseLocalCoordinates.call(this._handle)
    return _ret.asBoolean()
  }

  fun getVisibilityAabb(): AABB {
    val _ret = __method_bind.getVisibilityAabb.call(this._handle)
    return _ret.asAABB()
  }

  fun isEmitting(): Boolean {
    val _ret = __method_bind.isEmitting.call(this._handle)
    return _ret.asBoolean()
  }

  fun restart() {
    __method_bind.restart.call(this._handle)
  }

  fun setAmount(amount: Int) {
    val _arg = Variant(amount)
    __method_bind.setAmount.call(this._handle, listOf(_arg))
  }

  fun setDrawOrder(order: Int) {
    val _arg = Variant(order)
    __method_bind.setDrawOrder.call(this._handle, listOf(_arg))
  }

  fun setDrawPassMesh(pass: Int, mesh: Mesh) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(pass))
    _args.add(Variant.fromAny(mesh))
    __method_bind.setDrawPassMesh.call(this._handle, _args)
  }

  fun setDrawPasses(passes: Int) {
    val _arg = Variant(passes)
    __method_bind.setDrawPasses.call(this._handle, listOf(_arg))
  }

  fun setEmitting(emitting: Boolean) {
    val _arg = Variant(emitting)
    __method_bind.setEmitting.call(this._handle, listOf(_arg))
  }

  fun setExplosivenessRatio(ratio: Float) {
    val _arg = Variant(ratio)
    __method_bind.setExplosivenessRatio.call(this._handle, listOf(_arg))
  }

  fun setFixedFps(fps: Int) {
    val _arg = Variant(fps)
    __method_bind.setFixedFps.call(this._handle, listOf(_arg))
  }

  fun setFractionalDelta(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setFractionalDelta.call(this._handle, listOf(_arg))
  }

  fun setLifetime(secs: Float) {
    val _arg = Variant(secs)
    __method_bind.setLifetime.call(this._handle, listOf(_arg))
  }

  fun setOneShot(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setOneShot.call(this._handle, listOf(_arg))
  }

  fun setPreProcessTime(secs: Float) {
    val _arg = Variant(secs)
    __method_bind.setPreProcessTime.call(this._handle, listOf(_arg))
  }

  fun setProcessMaterial(material: Material) {
    val _arg = Variant(material)
    __method_bind.setProcessMaterial.call(this._handle, listOf(_arg))
  }

  fun setRandomnessRatio(ratio: Float) {
    val _arg = Variant(ratio)
    __method_bind.setRandomnessRatio.call(this._handle, listOf(_arg))
  }

  fun setSpeedScale(scale: Float) {
    val _arg = Variant(scale)
    __method_bind.setSpeedScale.call(this._handle, listOf(_arg))
  }

  fun setUseLocalCoordinates(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setUseLocalCoordinates.call(this._handle, listOf(_arg))
  }

  fun setVisibilityAabb(aabb: AABB) {
    val _arg = Variant(aabb)
    __method_bind.setVisibilityAabb.call(this._handle, listOf(_arg))
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

    internal fun __new(): COpaquePointer = memScoped {
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
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "capture_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method capture_aabb" }
        }
      val getAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_amount" }
        }
      val getDrawOrder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_draw_order".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_draw_order" }
        }
      val getDrawPassMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_draw_pass_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_draw_pass_mesh" }
        }
      val getDrawPasses: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_draw_passes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_draw_passes" }
        }
      val getExplosivenessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_explosiveness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_explosiveness_ratio" }
        }
      val getFixedFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_fixed_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fixed_fps" }
        }
      val getFractionalDelta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_fractional_delta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fractional_delta" }
        }
      val getLifetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_lifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lifetime" }
        }
      val getOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_one_shot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_one_shot" }
        }
      val getPreProcessTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_pre_process_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pre_process_time" }
        }
      val getProcessMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_process_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_material" }
        }
      val getRandomnessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_randomness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_randomness_ratio" }
        }
      val getSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
        }
      val getUseLocalCoordinates: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_use_local_coordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_local_coordinates" }
        }
      val getVisibilityAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "get_visibility_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visibility_aabb" }
        }
      val isEmitting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "is_emitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_emitting" }
        }
      val restart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "restart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method restart" }
        }
      val setAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_amount" }
        }
      val setDrawOrder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_draw_order".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_order" }
        }
      val setDrawPassMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_draw_pass_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_pass_mesh" }
        }
      val setDrawPasses: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_draw_passes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_passes" }
        }
      val setEmitting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_emitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_emitting" }
        }
      val setExplosivenessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_explosiveness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_explosiveness_ratio" }
        }
      val setFixedFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_fixed_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fixed_fps" }
        }
      val setFractionalDelta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_fractional_delta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fractional_delta" }
        }
      val setLifetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_lifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lifetime" }
        }
      val setOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_one_shot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_one_shot" }
        }
      val setPreProcessTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_pre_process_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pre_process_time" }
        }
      val setProcessMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_process_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_material" }
        }
      val setRandomnessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_randomness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_randomness_ratio" }
        }
      val setSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
        }
      val setUseLocalCoordinates: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_use_local_coordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_local_coordinates" }
        }
      val setVisibilityAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "set_visibility_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_visibility_aabb" }
        }}
  }
}
