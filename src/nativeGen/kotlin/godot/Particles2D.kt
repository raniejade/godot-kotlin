// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
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

open class Particles2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var amount: Int
    get() {
       return getAmount() 
    }
    set(value) {
      setAmount(value)
    }

  var drawOrder: Int
    get() {
       return Particles2D.DrawOrder.from(getDrawOrder()) 
    }
    set(value) {
      setDrawOrder(Particles2D.DrawOrder.from(value))
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

  fun captureRect(): Rect2 {
    val _ret = __method_bind.captureRect.call(this._handle)
    return _ret.asRect2()
  }

  fun getAmount(): Int {
    val _ret = __method_bind.getAmount.call(this._handle)
    return _ret.asInt()
  }

  fun getDrawOrder(): DrawOrder {
    val _ret = __method_bind.getDrawOrder.call(this._handle)
    return Particles2D.DrawOrder.from(_ret.asInt())
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

  fun getNormalMap(): Texture {
    val _ret = __method_bind.getNormalMap.call(this._handle)
    return _ret.asObject(::Texture)!!
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

  fun getTexture(): Texture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getUseLocalCoordinates(): Boolean {
    val _ret = __method_bind.getUseLocalCoordinates.call(this._handle)
    return _ret.asBoolean()
  }

  fun getVisibilityRect(): Rect2 {
    val _ret = __method_bind.getVisibilityRect.call(this._handle)
    return _ret.asRect2()
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

  fun setNormalMap(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setNormalMap.call(this._handle, _arg, 1)
  }

  fun setOneShot(secs: Boolean) {
    val _arg = Variant.new(secs)
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

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, _arg, 1)
  }

  fun setUseLocalCoordinates(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseLocalCoordinates.call(this._handle, _arg, 1)
  }

  fun setVisibilityRect(visibilityRect: Rect2) {
    val _arg = Variant.new(visibilityRect)
    __method_bind.setVisibilityRect.call(this._handle, _arg, 1)
  }

  enum class DrawOrder(
    val value: Int
  ) {
    DRAW_ORDER_INDEX(0),

    DRAW_ORDER_LIFETIME(1);

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

    fun new(): Particles2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Particles2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Particles2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Particles2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Particles2D = Particles2D(ptr)
    /**
     * Container for method_bind pointers for Particles2D
     */
    private object __method_bind {
      val captureRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "captureRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method captureRect" }
        }
      val getAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getAmount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAmount" }
        }
      val getDrawOrder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getDrawOrder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDrawOrder" }
        }
      val getExplosivenessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getExplosivenessRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExplosivenessRatio" }
        }
      val getFixedFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getFixedFps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFixedFps" }
        }
      val getFractionalDelta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getFractionalDelta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFractionalDelta" }
        }
      val getLifetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getLifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLifetime" }
        }
      val getNormalMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getNormalMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNormalMap" }
        }
      val getOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getOneShot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOneShot" }
        }
      val getPreProcessTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getPreProcessTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPreProcessTime" }
        }
      val getProcessMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getProcessMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProcessMaterial" }
        }
      val getRandomnessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getRandomnessRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRandomnessRatio" }
        }
      val getSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getSpeedScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpeedScale" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTexture" }
        }
      val getUseLocalCoordinates: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getUseLocalCoordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUseLocalCoordinates" }
        }
      val getVisibilityRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "getVisibilityRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVisibilityRect" }
        }
      val isEmitting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "isEmitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEmitting" }
        }
      val restart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "restart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method restart" }
        }
      val setAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setAmount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAmount" }
        }
      val setDrawOrder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setDrawOrder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDrawOrder" }
        }
      val setEmitting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setEmitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEmitting" }
        }
      val setExplosivenessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setExplosivenessRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExplosivenessRatio" }
        }
      val setFixedFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setFixedFps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFixedFps" }
        }
      val setFractionalDelta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setFractionalDelta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFractionalDelta" }
        }
      val setLifetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setLifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLifetime" }
        }
      val setNormalMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setNormalMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNormalMap" }
        }
      val setOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setOneShot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOneShot" }
        }
      val setPreProcessTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setPreProcessTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPreProcessTime" }
        }
      val setProcessMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setProcessMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProcessMaterial" }
        }
      val setRandomnessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setRandomnessRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRandomnessRatio" }
        }
      val setSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setSpeedScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSpeedScale" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTexture" }
        }
      val setUseLocalCoordinates: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setUseLocalCoordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseLocalCoordinates" }
        }
      val setVisibilityRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
            "setVisibilityRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVisibilityRect" }
        }}
  }
}
