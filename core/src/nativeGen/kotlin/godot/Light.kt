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

open class Light(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualInstance(null) {
  var editorOnly: Boolean
    get() {
       return isEditorOnly() 
    }
    set(value) {
      setEditorOnly(value)
    }

  var lightBakeMode: BakeMode
    get() {
       return getBakeMode() 
    }
    set(value) {
      setBakeMode(value.value)
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

  var lightEnergy: Float
    get() {
       return getParam(0) 
    }
    set(value) {
      setParam(0, value)
    }

  var lightIndirectEnergy: Float
    get() {
       return getParam(1) 
    }
    set(value) {
      setParam(1, value)
    }

  var lightNegative: Boolean
    get() {
       return isNegative() 
    }
    set(value) {
      setNegative(value)
    }

  var lightSpecular: Float
    get() {
       return getParam(2) 
    }
    set(value) {
      setParam(2, value)
    }

  var shadowBias: Float
    get() {
       return getParam(13) 
    }
    set(value) {
      setParam(13, value)
    }

  var shadowColor: Color
    get() {
       return getShadowColor() 
    }
    set(value) {
      setShadowColor(value)
    }

  var shadowContact: Float
    get() {
       return getParam(7) 
    }
    set(value) {
      setParam(7, value)
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

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for lightColor
   */
  fun lightColor(cb: Color.() -> Unit) {
    val _p = lightColor
    cb(_p)
    lightColor = _p
  }

  /**
   * Specialized setter for shadowColor
   */
  fun shadowColor(cb: Color.() -> Unit) {
    val _p = shadowColor
    cb(_p)
    shadowColor = _p
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
    val _ret = __method_bind.getParam.call(this._handle, listOf(_arg))
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
    __method_bind.setBakeMode.call(this._handle, listOf(_arg))
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setColor.call(this._handle, listOf(_arg))
  }

  fun setCullMask(cullMask: Int) {
    val _arg = Variant.new(cullMask)
    __method_bind.setCullMask.call(this._handle, listOf(_arg))
  }

  fun setEditorOnly(editorOnly: Boolean) {
    val _arg = Variant.new(editorOnly)
    __method_bind.setEditorOnly.call(this._handle, listOf(_arg))
  }

  fun setNegative(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setNegative.call(this._handle, listOf(_arg))
  }

  fun setParam(param: Int, value: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.setParam.call(this._handle, _args)
  }

  fun setShadow(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setShadow.call(this._handle, listOf(_arg))
  }

  fun setShadowColor(shadowColor: Color) {
    val _arg = Variant.new(shadowColor)
    __method_bind.setShadowColor.call(this._handle, listOf(_arg))
  }

  fun setShadowReverseCullFace(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setShadowReverseCullFace.call(this._handle, listOf(_arg))
  }

  enum class BakeMode(
    val value: Int
  ) {
    DISABLED(0),

    INDIRECT(1),

    ALL(2);

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
    ENERGY(0),

    INDIRECT_ENERGY(1),

    SPECULAR(2),

    RANGE(3),

    ATTENUATION(4),

    SPOT_ANGLE(5),

    SPOT_ATTENUATION(6),

    CONTACT_SHADOW_SIZE(7),

    SHADOW_MAX_DISTANCE(8),

    SHADOW_SPLIT_1_OFFSET(9),

    SHADOW_SPLIT_2_OFFSET(10),

    SHADOW_SPLIT_3_OFFSET(11),

    SHADOW_NORMAL_BIAS(12),

    SHADOW_BIAS(13),

    SHADOW_BIAS_SPLIT_SCALE(14),

    MAX(15);

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
    /**
     * Container for method_bind pointers for Light
     */
    private object __method_bind {
      val getBakeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "get_bake_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_mode" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "get_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cull_mask" }
        }
      val getParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param" }
        }
      val getShadowColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "get_shadow_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_color" }
        }
      val getShadowReverseCullFace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "get_shadow_reverse_cull_face".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_reverse_cull_face" }
        }
      val hasShadow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "has_shadow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_shadow" }
        }
      val isEditorOnly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "is_editor_only".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editor_only" }
        }
      val isNegative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "is_negative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_negative" }
        }
      val setBakeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "set_bake_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bake_mode" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "set_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cull_mask" }
        }
      val setEditorOnly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "set_editor_only".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_editor_only" }
        }
      val setNegative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "set_negative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_negative" }
        }
      val setParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param" }
        }
      val setShadow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "set_shadow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow" }
        }
      val setShadowColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "set_shadow_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_color" }
        }
      val setShadowReverseCullFace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
            "set_shadow_reverse_cull_face".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_reverse_cull_face" }
        }}
  }
}
