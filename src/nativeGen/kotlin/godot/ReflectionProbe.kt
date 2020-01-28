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

open class ReflectionProbe(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  var boxProjection: Boolean
    get() {
       return isBoxProjectionEnabled() 
    }
    set(value) {
      setEnableBoxProjection(value)
    }

  var cullMask: Int
    get() {
       return getCullMask() 
    }
    set(value) {
      setCullMask(value)
    }

  var enableShadows: Boolean
    get() {
       return areShadowsEnabled() 
    }
    set(value) {
      setEnableShadows(value)
    }

  var extents: Vector3
    get() {
       return getExtents() 
    }
    set(value) {
      setExtents(value)
    }

  var intensity: Float
    get() {
       return getIntensity() 
    }
    set(value) {
      setIntensity(value)
    }

  var interiorAmbientColor: Color
    get() {
       return getInteriorAmbient() 
    }
    set(value) {
      setInteriorAmbient(value)
    }

  var interiorAmbientContrib: Float
    get() {
       return getInteriorAmbientProbeContribution() 
    }
    set(value) {
      setInteriorAmbientProbeContribution(value)
    }

  var interiorAmbientEnergy: Float
    get() {
       return getInteriorAmbientEnergy() 
    }
    set(value) {
      setInteriorAmbientEnergy(value)
    }

  var interiorEnable: Boolean
    get() {
       return isSetAsInterior() 
    }
    set(value) {
      setAsInterior(value)
    }

  var maxDistance: Float
    get() {
       return getMaxDistance() 
    }
    set(value) {
      setMaxDistance(value)
    }

  var originOffset: Vector3
    get() {
       return getOriginOffset() 
    }
    set(value) {
      setOriginOffset(value)
    }

  var updateMode: Int
    get() {
       return ReflectionProbe.UpdateMode.from(getUpdateMode()) 
    }
    set(value) {
      setUpdateMode(ReflectionProbe.UpdateMode.from(value))
    }

  fun areShadowsEnabled(): Boolean {
    val _ret = __method_bind.areShadowsEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun getCullMask(): Int {
    val _ret = __method_bind.getCullMask.call(this._handle)
    return _ret.asInt()
  }

  fun getExtents(): Vector3 {
    val _ret = __method_bind.getExtents.call(this._handle)
    return _ret.asVector3()
  }

  fun getIntensity(): Float {
    val _ret = __method_bind.getIntensity.call(this._handle)
    return _ret.asFloat()
  }

  fun getInteriorAmbient(): Color {
    val _ret = __method_bind.getInteriorAmbient.call(this._handle)
    return _ret.asColor()
  }

  fun getInteriorAmbientEnergy(): Float {
    val _ret = __method_bind.getInteriorAmbientEnergy.call(this._handle)
    return _ret.asFloat()
  }

  fun getInteriorAmbientProbeContribution(): Float {
    val _ret = __method_bind.getInteriorAmbientProbeContribution.call(this._handle)
    return _ret.asFloat()
  }

  fun getMaxDistance(): Float {
    val _ret = __method_bind.getMaxDistance.call(this._handle)
    return _ret.asFloat()
  }

  fun getOriginOffset(): Vector3 {
    val _ret = __method_bind.getOriginOffset.call(this._handle)
    return _ret.asVector3()
  }

  fun getUpdateMode(): UpdateMode {
    val _ret = __method_bind.getUpdateMode.call(this._handle)
    return ReflectionProbe.UpdateMode.from(_ret.asInt())
  }

  fun isBoxProjectionEnabled(): Boolean {
    val _ret = __method_bind.isBoxProjectionEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSetAsInterior(): Boolean {
    val _ret = __method_bind.isSetAsInterior.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAsInterior(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAsInterior.call(this._handle, _arg, 1)
  }

  fun setCullMask(layers: Int) {
    val _arg = Variant.new(layers)
    __method_bind.setCullMask.call(this._handle, _arg, 1)
  }

  fun setEnableBoxProjection(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setEnableBoxProjection.call(this._handle, _arg, 1)
  }

  fun setEnableShadows(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setEnableShadows.call(this._handle, _arg, 1)
  }

  fun setExtents(extents: Vector3) {
    val _arg = Variant.new(extents)
    __method_bind.setExtents.call(this._handle, _arg, 1)
  }

  fun setIntensity(intensity: Float) {
    val _arg = Variant.new(intensity)
    __method_bind.setIntensity.call(this._handle, _arg, 1)
  }

  fun setInteriorAmbient(ambient: Color) {
    val _arg = Variant.new(ambient)
    __method_bind.setInteriorAmbient.call(this._handle, _arg, 1)
  }

  fun setInteriorAmbientEnergy(ambientEnergy: Float) {
    val _arg = Variant.new(ambientEnergy)
    __method_bind.setInteriorAmbientEnergy.call(this._handle, _arg, 1)
  }

  fun setInteriorAmbientProbeContribution(ambientProbeContribution: Float) {
    val _arg = Variant.new(ambientProbeContribution)
    __method_bind.setInteriorAmbientProbeContribution.call(this._handle, _arg, 1)
  }

  fun setMaxDistance(maxDistance: Float) {
    val _arg = Variant.new(maxDistance)
    __method_bind.setMaxDistance.call(this._handle, _arg, 1)
  }

  fun setOriginOffset(originOffset: Vector3) {
    val _arg = Variant.new(originOffset)
    __method_bind.setOriginOffset.call(this._handle, _arg, 1)
  }

  fun setUpdateMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setUpdateMode.call(this._handle, _arg, 1)
  }

  enum class UpdateMode(
    val value: Int
  ) {
    UPDATE_ONCE(0),

    UPDATE_ALWAYS(1);

    companion object {
      fun from(value: Int): UpdateMode {
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
    val UPDATE_ALWAYS: Int = 1

    val UPDATE_ONCE: Int = 0

    fun new(): ReflectionProbe = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ReflectionProbe".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ReflectionProbe" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ReflectionProbe(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ReflectionProbe = ReflectionProbe(ptr)
    /**
     * Container for method_bind pointers for ReflectionProbe
     */
    private object __method_bind {
      val areShadowsEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "areShadowsEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areShadowsEnabled" }
        }
      val getCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "getCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCullMask" }
        }
      val getExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "getExtents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExtents" }
        }
      val getIntensity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "getIntensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIntensity" }
        }
      val getInteriorAmbient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "getInteriorAmbient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInteriorAmbient" }
        }
      val getInteriorAmbientEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "getInteriorAmbientEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInteriorAmbientEnergy" }
        }
      val getInteriorAmbientProbeContribution: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "getInteriorAmbientProbeContribution".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method getInteriorAmbientProbeContribution" }
        }
      val getMaxDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "getMaxDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaxDistance" }
        }
      val getOriginOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "getOriginOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOriginOffset" }
        }
      val getUpdateMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "getUpdateMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUpdateMode" }
        }
      val isBoxProjectionEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "isBoxProjectionEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isBoxProjectionEnabled" }
        }
      val isSetAsInterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "isSetAsInterior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSetAsInterior" }
        }
      val setAsInterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "setAsInterior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAsInterior" }
        }
      val setCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "setCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCullMask" }
        }
      val setEnableBoxProjection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "setEnableBoxProjection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEnableBoxProjection" }
        }
      val setEnableShadows: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "setEnableShadows".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEnableShadows" }
        }
      val setExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "setExtents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExtents" }
        }
      val setIntensity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "setIntensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIntensity" }
        }
      val setInteriorAmbient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "setInteriorAmbient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInteriorAmbient" }
        }
      val setInteriorAmbientEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "setInteriorAmbientEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInteriorAmbientEnergy" }
        }
      val setInteriorAmbientProbeContribution: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "setInteriorAmbientProbeContribution".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method setInteriorAmbientProbeContribution" }
        }
      val setMaxDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "setMaxDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaxDistance" }
        }
      val setOriginOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "setOriginOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOriginOffset" }
        }
      val setUpdateMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
            "setUpdateMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUpdateMode" }
        }}
  }
}
