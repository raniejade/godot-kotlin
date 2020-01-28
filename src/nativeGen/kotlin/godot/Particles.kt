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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Particles(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  var amount: Int
    get() {
       return getAmount() 
    }
    set(value) {
      setAmount(value)
    }

  var drawOrder: Int
    get() {
       return Particles.DrawOrder.from(getDrawOrder()) 
    }
    set(value) {
      setDrawOrder(Particles.DrawOrder.from(value))
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

  var processMaterial: `ShaderMaterial,ParticlesMaterial`
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
    val _arg = Variant.new(pass)
    val _ret = __method_bind.getDrawPassMesh.call(this._handle, _arg, 1)
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
    val _arg = Variant.new(amount)
    __method_bind.setAmount.call(this._handle, _arg, 1)
  }

  fun setDrawOrder(order: Int) {
    val _arg = Variant.new(order)
    __method_bind.setDrawOrder.call(this._handle, _arg, 1)
  }

  fun setDrawPassMesh(pass: Int, mesh: Mesh) {
    val _args = VariantArray.new()
    _args.append(pass)
    _args.append(mesh)
    __method_bind.setDrawPassMesh.call(this._handle, _args.toVariant(), 2)
  }

  fun setDrawPasses(passes: Int) {
    val _arg = Variant.new(passes)
    __method_bind.setDrawPasses.call(this._handle, _arg, 1)
  }

  fun setEmitting(emitting: Boolean) {
    val _arg = Variant.new(emitting)
    __method_bind.setEmitting.call(this._handle, _arg, 1)
  }

  fun setExplosivenessRatio(ratio: Float) {
    val _arg = Variant.new(ratio)
    __method_bind.setExplosivenessRatio.call(this._handle, _arg, 1)
  }

  fun setFixedFps(fps: Int) {
    val _arg = Variant.new(fps)
    __method_bind.setFixedFps.call(this._handle, _arg, 1)
  }

  fun setFractionalDelta(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setFractionalDelta.call(this._handle, _arg, 1)
  }

  fun setLifetime(secs: Float) {
    val _arg = Variant.new(secs)
    __method_bind.setLifetime.call(this._handle, _arg, 1)
  }

  fun setOneShot(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setOneShot.call(this._handle, _arg, 1)
  }

  fun setPreProcessTime(secs: Float) {
    val _arg = Variant.new(secs)
    __method_bind.setPreProcessTime.call(this._handle, _arg, 1)
  }

  fun setProcessMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.setProcessMaterial.call(this._handle, _arg, 1)
  }

  fun setRandomnessRatio(ratio: Float) {
    val _arg = Variant.new(ratio)
    __method_bind.setRandomnessRatio.call(this._handle, _arg, 1)
  }

  fun setSpeedScale(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.setSpeedScale.call(this._handle, _arg, 1)
  }

  fun setUseLocalCoordinates(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseLocalCoordinates.call(this._handle, _arg, 1)
  }

  fun setVisibilityAabb(aabb: AABB) {
    val _arg = Variant.new(aabb)
    __method_bind.setVisibilityAabb.call(this._handle, _arg, 1)
  }

  enum class DrawOrder(
    val value: Int
  ) {
    DRAW_ORDER_INDEX(0),

    DRAW_ORDER_LIFETIME(1),

    DRAW_ORDER_VIEW_DEPTH(2);

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
    val DRAW_ORDER_INDEX: Int = 0

    val DRAW_ORDER_LIFETIME: Int = 1

    val DRAW_ORDER_VIEW_DEPTH: Int = 2

    val MAX_DRAW_PASSES: Int = 4

    fun new(): Particles = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Particles".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Particles" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Particles(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Particles = Particles(ptr)
    /**
     * Container for method_bind pointers for Particles
     */
    private object __method_bind {
      val captureAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "captureAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method captureAabb" }
        }
      val getAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getAmount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAmount" }
        }
      val getDrawOrder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getDrawOrder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDrawOrder" }
        }
      val getDrawPassMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getDrawPassMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDrawPassMesh" }
        }
      val getDrawPasses: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getDrawPasses".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDrawPasses" }
        }
      val getExplosivenessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getExplosivenessRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExplosivenessRatio" }
        }
      val getFixedFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getFixedFps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFixedFps" }
        }
      val getFractionalDelta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getFractionalDelta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFractionalDelta" }
        }
      val getLifetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getLifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLifetime" }
        }
      val getOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getOneShot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOneShot" }
        }
      val getPreProcessTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getPreProcessTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPreProcessTime" }
        }
      val getProcessMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getProcessMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProcessMaterial" }
        }
      val getRandomnessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getRandomnessRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRandomnessRatio" }
        }
      val getSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getSpeedScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpeedScale" }
        }
      val getUseLocalCoordinates: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getUseLocalCoordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUseLocalCoordinates" }
        }
      val getVisibilityAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "getVisibilityAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVisibilityAabb" }
        }
      val isEmitting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "isEmitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEmitting" }
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
            "setAmount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAmount" }
        }
      val setDrawOrder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setDrawOrder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDrawOrder" }
        }
      val setDrawPassMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setDrawPassMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDrawPassMesh" }
        }
      val setDrawPasses: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setDrawPasses".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDrawPasses" }
        }
      val setEmitting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setEmitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEmitting" }
        }
      val setExplosivenessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setExplosivenessRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExplosivenessRatio" }
        }
      val setFixedFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setFixedFps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFixedFps" }
        }
      val setFractionalDelta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setFractionalDelta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFractionalDelta" }
        }
      val setLifetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setLifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLifetime" }
        }
      val setOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setOneShot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOneShot" }
        }
      val setPreProcessTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setPreProcessTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPreProcessTime" }
        }
      val setProcessMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setProcessMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProcessMaterial" }
        }
      val setRandomnessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setRandomnessRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRandomnessRatio" }
        }
      val setSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setSpeedScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSpeedScale" }
        }
      val setUseLocalCoordinates: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setUseLocalCoordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseLocalCoordinates" }
        }
      val setVisibilityAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
            "setVisibilityAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVisibilityAabb" }
        }}
  }
}
