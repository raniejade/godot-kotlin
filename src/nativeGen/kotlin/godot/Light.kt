// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
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

open class Light(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  var editorOnly: Boolean
    get() {
       return isEditorOnly() 
    }
    set(value) {
      setEditorOnly(value)
    }

  var lightBakeMode: Int
    get() {
       return Light.BakeMode.from(getBakeMode()) 
    }
    set(value) {
      setBakeMode(Light.BakeMode.from(value))
    }

  var lightColor: Color
    get() {
       return getColor() 
    }
    set(value) {
      setColor(value)
    }

  var lightCullMask: Int
    get() {
       return getCullMask() 
    }
    set(value) {
      setCullMask(value)
    }

  var lightNegative: Boolean
    get() {
       return isNegative() 
    }
    set(value) {
      setNegative(value)
    }

  var shadowColor: Color
    get() {
       return getShadowColor() 
    }
    set(value) {
      setShadowColor(value)
    }

  var shadowEnabled: Boolean
    get() {
       return hasShadow() 
    }
    set(value) {
      setShadow(value)
    }

  var shadowReverseCullFace: Boolean
    get() {
       return getShadowReverseCullFace() 
    }
    set(value) {
      setShadowReverseCullFace(value)
    }

  fun getBakeMode(): BakeMode {
    val _ret = __method_bind.getBakeMode.call(this._handle)
    return Light.BakeMode.from(_ret.asInt())
  }

  fun getColor(): Color {
    val _ret = __method_bind.getColor.call(this._handle)
    return _ret.asColor()
  }

  fun getCullMask(): Int {
    val _ret = __method_bind.getCullMask.call(this._handle)
    return _ret.asInt()
  }

  fun getParam(param: Int): Float {
    val _arg = Variant.new(param)
    val _ret = __method_bind.getParam.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getShadowColor(): Color {
    val _ret = __method_bind.getShadowColor.call(this._handle)
    return _ret.asColor()
  }

  fun getShadowReverseCullFace(): Boolean {
    val _ret = __method_bind.getShadowReverseCullFace.call(this._handle)
    return _ret.asBoolean()
  }

  fun hasShadow(): Boolean {
    val _ret = __method_bind.hasShadow.call(this._handle)
    return _ret.asBoolean()
  }

  fun isEditorOnly(): Boolean {
    val _ret = __method_bind.isEditorOnly.call(this._handle)
    return _ret.asBoolean()
  }

  fun isNegative(): Boolean {
    val _ret = __method_bind.isNegative.call(this._handle)
    return _ret.asBoolean()
  }

  fun setBakeMode(bakeMode: Int) {
    val _arg = Variant.new(bakeMode)
    __method_bind.setBakeMode.call(this._handle, _arg, 1)
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setColor.call(this._handle, _arg, 1)
  }

  fun setCullMask(cullMask: Int) {
    val _arg = Variant.new(cullMask)
    __method_bind.setCullMask.call(this._handle, _arg, 1)
  }

  fun setEditorOnly(editorOnly: Boolean) {
    val _arg = Variant.new(editorOnly)
    __method_bind.setEditorOnly.call(this._handle, _arg, 1)
  }

  fun setNegative(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setNegative.call(this._handle, _arg, 1)
  }

  fun setParam(param: Int, value: Float) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(value)
    __method_bind.setParam.call(this._handle, _args.toVariant(), 2)
  }

  fun setShadow(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setShadow.call(this._handle, _arg, 1)
  }

  fun setShadowColor(shadowColor: Color) {
    val _arg = Variant.new(shadowColor)
    __method_bind.setShadowColor.call(this._handle, _arg, 1)
  }

  fun setShadowReverseCullFace(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setShadowReverseCullFace.call(this._handle, _arg, 1)
  }

  enum class BakeMode(
    val value: Int
  ) {
    BAKE_DISABLED(0),

    BAKE_INDIRECT(1),

    BAKE_ALL(2);

    companion object {
      fun from(value: Int): BakeMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Param(
    val value: Int
  ) {
    PARAM_ENERGY(0),

    PARAM_INDIRECT_ENERGY(1),

    PARAM_SPECULAR(2),

    PARAM_RANGE(3),

    PARAM_ATTENUATION(4),

    PARAM_SPOT_ANGLE(5),

    PARAM_SPOT_ATTENUATION(6),

    PARAM_CONTACT_SHADOW_SIZE(7),

    PARAM_SHADOW_MAX_DISTANCE(8),

    PARAM_SHADOW_SPLIT_1_OFFSET(9),

    PARAM_SHADOW_SPLIT_2_OFFSET(10),

    PARAM_SHADOW_SPLIT_3_OFFSET(11),

    PARAM_SHADOW_NORMAL_BIAS(12),

    PARAM_SHADOW_BIAS(13),

    PARAM_SHADOW_BIAS_SPLIT_SCALE(14),

    PARAM_MAX(15);

    companion object {
      fun from(value: Int): Param {
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
    val BAKE_ALL: Int = 2

    val BAKE_DISABLED: Int = 0

    val BAKE_INDIRECT: Int = 1

    val PARAM_ATTENUATION: Int = 4

    val PARAM_CONTACT_SHADOW_SIZE: Int = 7

    val PARAM_ENERGY: Int = 0

    val PARAM_INDIRECT_ENERGY: Int = 1

    val PARAM_MAX: Int = 15

    val PARAM_RANGE: Int = 3

    val PARAM_SHADOW_BIAS: Int = 13

    val PARAM_SHADOW_BIAS_SPLIT_SCALE: Int = 14

    val PARAM_SHADOW_MAX_DISTANCE: Int = 8

    val PARAM_SHADOW_NORMAL_BIAS: Int = 12

    val PARAM_SHADOW_SPLIT_1_OFFSET: Int = 9

    val PARAM_SHADOW_SPLIT_2_OFFSET: Int = 10

    val PARAM_SHADOW_SPLIT_3_OFFSET: Int = 11

    val PARAM_SPECULAR: Int = 2

    val PARAM_SPOT_ANGLE: Int = 5

    val PARAM_SPOT_ATTENUATION: Int = 6

    /**
     * Container for method_bind pointers for Light
     */
    private object __method_bind {
      val getBakeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "getBakeMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBakeMode" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "getColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColor" }
        }
      val getCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "getCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCullMask" }
        }
      val getParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "getParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParam" }
        }
      val getShadowColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "getShadowColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShadowColor" }
        }
      val getShadowReverseCullFace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "getShadowReverseCullFace".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShadowReverseCullFace" }
        }
      val hasShadow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "hasShadow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasShadow" }
        }
      val isEditorOnly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "isEditorOnly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEditorOnly" }
        }
      val isNegative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "isNegative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isNegative" }
        }
      val setBakeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "setBakeMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBakeMode" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "setColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setColor" }
        }
      val setCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "setCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCullMask" }
        }
      val setEditorOnly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "setEditorOnly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEditorOnly" }
        }
      val setNegative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "setNegative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNegative" }
        }
      val setParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "setParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setParam" }
        }
      val setShadow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "setShadow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShadow" }
        }
      val setShadowColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "setShadowColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShadowColor" }
        }
      val setShadowReverseCullFace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "setShadowReverseCullFace".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShadowReverseCullFace" }
        }}
  }
}
