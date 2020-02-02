// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class Line2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var antialiased: Boolean
    get() {
       return getAntialiased() 
    }
    set(value) {
      setAntialiased(value)
    }

  var beginCapMode: LineCapMode
    get() {
       return getBeginCapMode() 
    }
    set(value) {
      setBeginCapMode(value.value)
    }

  var defaultColor: Color
    get() {
       return getDefaultColor() 
    }
    set(value) {
      setDefaultColor(value)
    }

  var endCapMode: LineCapMode
    get() {
       return getEndCapMode() 
    }
    set(value) {
      setEndCapMode(value.value)
    }

  var gradient: Gradient
    get() {
       return getGradient() 
    }
    set(value) {
      setGradient(value)
    }

  var jointMode: LineJointMode
    get() {
       return getJointMode() 
    }
    set(value) {
      setJointMode(value.value)
    }

  var points: PoolVector2Array
    get() {
       return getPoints() 
    }
    set(value) {
      setPoints(value)
    }

  var roundPrecision: Int
    get() {
       return getRoundPrecision() 
    }
    set(value) {
      setRoundPrecision(value)
    }

  var sharpLimit: Float
    get() {
       return getSharpLimit() 
    }
    set(value) {
      setSharpLimit(value)
    }

  var texture: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
    }

  var textureMode: LineTextureMode
    get() {
       return getTextureMode() 
    }
    set(value) {
      setTextureMode(value.value)
    }

  var width: Float
    get() {
       return getWidth() 
    }
    set(value) {
      setWidth(value)
    }

  var widthCurve: Curve
    get() {
       return getCurve() 
    }
    set(value) {
      setCurve(value)
    }

  /**
   * Specialized setter for defaultColor
   */
  fun defaultColor(cb: Color.() -> Unit) {
    val _p = defaultColor
    cb(_p)
    defaultColor = _p
  }

  /**
   * Specialized setter for points
   */
  fun points(cb: PoolVector2Array.() -> Unit) {
    val _p = points
    cb(_p)
    points = _p
  }

  fun addPoint(position: Vector2, atPosition: Int = -1) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(atPosition))
    __method_bind.addPoint.call(this._handle, _args)
  }

  fun clearPoints() {
    __method_bind.clearPoints.call(this._handle)
  }

  fun getAntialiased(): Boolean {
    val _ret = __method_bind.getAntialiased.call(this._handle)
    return _ret.asBoolean()
  }

  fun getBeginCapMode(): LineCapMode {
    val _ret = __method_bind.getBeginCapMode.call(this._handle)
    return Line2D.LineCapMode.from(_ret.asInt())
  }

  fun getCurve(): Curve {
    val _ret = __method_bind.getCurve.call(this._handle)
    return _ret.asObject(::Curve)!!
  }

  fun getDefaultColor(): Color {
    val _ret = __method_bind.getDefaultColor.call(this._handle)
    return _ret.asColor()
  }

  fun getEndCapMode(): LineCapMode {
    val _ret = __method_bind.getEndCapMode.call(this._handle)
    return Line2D.LineCapMode.from(_ret.asInt())
  }

  fun getGradient(): Gradient {
    val _ret = __method_bind.getGradient.call(this._handle)
    return _ret.asObject(::Gradient)!!
  }

  fun getJointMode(): LineJointMode {
    val _ret = __method_bind.getJointMode.call(this._handle)
    return Line2D.LineJointMode.from(_ret.asInt())
  }

  fun getPointCount(): Int {
    val _ret = __method_bind.getPointCount.call(this._handle)
    return _ret.asInt()
  }

  fun getPointPosition(i: Int): Vector2 {
    val _arg = Variant.new(i)
    val _ret = __method_bind.getPointPosition.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun getPoints(): PoolVector2Array {
    val _ret = __method_bind.getPoints.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun getRoundPrecision(): Int {
    val _ret = __method_bind.getRoundPrecision.call(this._handle)
    return _ret.asInt()
  }

  fun getSharpLimit(): Float {
    val _ret = __method_bind.getSharpLimit.call(this._handle)
    return _ret.asFloat()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getTextureMode(): LineTextureMode {
    val _ret = __method_bind.getTextureMode.call(this._handle)
    return Line2D.LineTextureMode.from(_ret.asInt())
  }

  fun getWidth(): Float {
    val _ret = __method_bind.getWidth.call(this._handle)
    return _ret.asFloat()
  }

  fun removePoint(i: Int) {
    val _arg = Variant.new(i)
    __method_bind.removePoint.call(this._handle, listOf(_arg))
  }

  fun setAntialiased(antialiased: Boolean) {
    val _arg = Variant.new(antialiased)
    __method_bind.setAntialiased.call(this._handle, listOf(_arg))
  }

  fun setBeginCapMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setBeginCapMode.call(this._handle, listOf(_arg))
  }

  fun setCurve(curve: Curve) {
    val _arg = Variant.new(curve)
    __method_bind.setCurve.call(this._handle, listOf(_arg))
  }

  fun setDefaultColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setDefaultColor.call(this._handle, listOf(_arg))
  }

  fun setEndCapMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setEndCapMode.call(this._handle, listOf(_arg))
  }

  fun setGradient(color: Gradient) {
    val _arg = Variant.new(color)
    __method_bind.setGradient.call(this._handle, listOf(_arg))
  }

  fun setJointMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setJointMode.call(this._handle, listOf(_arg))
  }

  fun setPointPosition(i: Int, position: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(i))
    _args.add(Variant.fromAny(position))
    __method_bind.setPointPosition.call(this._handle, _args)
  }

  fun setPoints(points: PoolVector2Array) {
    val _arg = Variant.new(points)
    __method_bind.setPoints.call(this._handle, listOf(_arg))
  }

  fun setRoundPrecision(precision: Int) {
    val _arg = Variant.new(precision)
    __method_bind.setRoundPrecision.call(this._handle, listOf(_arg))
  }

  fun setSharpLimit(limit: Float) {
    val _arg = Variant.new(limit)
    __method_bind.setSharpLimit.call(this._handle, listOf(_arg))
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, listOf(_arg))
  }

  fun setTextureMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setTextureMode.call(this._handle, listOf(_arg))
  }

  fun setWidth(width: Float) {
    val _arg = Variant.new(width)
    __method_bind.setWidth.call(this._handle, listOf(_arg))
  }

  enum class LineTextureMode(
    val value: Int
  ) {
    NONE(0),

    TILE(1),

    STRETCH(2);

    companion object {
      fun from(value: Int): LineTextureMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class LineCapMode(
    val value: Int
  ) {
    NONE(0),

    BOX(1),

    ROUND(2);

    companion object {
      fun from(value: Int): LineCapMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class LineJointMode(
    val value: Int
  ) {
    SHARP(0),

    BEVEL(1),

    ROUND(2);

    companion object {
      fun from(value: Int): LineJointMode {
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
    fun new(): Line2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Line2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Line2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Line2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Line2D = Line2D(ptr)
    /**
     * Container for method_bind pointers for Line2D
     */
    private object __method_bind {
      val addPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "add_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_point" }
        }
      val clearPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "clear_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_points" }
        }
      val getAntialiased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_antialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_antialiased" }
        }
      val getBeginCapMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_begin_cap_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_begin_cap_mode" }
        }
      val getCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_curve" }
        }
      val getDefaultColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_default_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_color" }
        }
      val getEndCapMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_end_cap_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_end_cap_mode" }
        }
      val getGradient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_gradient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gradient" }
        }
      val getJointMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_joint_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joint_mode" }
        }
      val getPointCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_count" }
        }
      val getPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_position" }
        }
      val getPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_points" }
        }
      val getRoundPrecision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_round_precision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_round_precision" }
        }
      val getSharpLimit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_sharp_limit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sharp_limit" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getTextureMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_texture_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_mode" }
        }
      val getWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "get_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_width" }
        }
      val removePoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "remove_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_point" }
        }
      val setAntialiased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "set_antialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_antialiased" }
        }
      val setBeginCapMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "set_begin_cap_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_begin_cap_mode" }
        }
      val setCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "set_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_curve" }
        }
      val setDefaultColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "set_default_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_color" }
        }
      val setEndCapMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "set_end_cap_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_end_cap_mode" }
        }
      val setGradient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "set_gradient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gradient" }
        }
      val setJointMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "set_joint_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_joint_mode" }
        }
      val setPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "set_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_position" }
        }
      val setPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "set_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_points" }
        }
      val setRoundPrecision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "set_round_precision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_round_precision" }
        }
      val setSharpLimit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "set_sharp_limit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sharp_limit" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val setTextureMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "set_texture_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_mode" }
        }
      val setWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "set_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_width" }
        }}
  }
}
