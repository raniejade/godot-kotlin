// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Float
import kotlin.Int
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
  var beginCapMode: Int
    get() {
       return Line2D.LineCapMode.from(getBeginCapMode()) 
    }
    set(value) {
      setBeginCapMode(Line2D.LineCapMode.from(value))
    }

  var defaultColor: Color
    get() {
       return getDefaultColor() 
    }
    set(value) {
      setDefaultColor(value)
    }

  var endCapMode: Int
    get() {
       return Line2D.LineCapMode.from(getEndCapMode()) 
    }
    set(value) {
      setEndCapMode(Line2D.LineCapMode.from(value))
    }

  var gradient: Gradient
    get() {
       return getGradient() 
    }
    set(value) {
      setGradient(value)
    }

  var jointMode: Int
    get() {
       return Line2D.LineJointMode.from(getJointMode()) 
    }
    set(value) {
      setJointMode(Line2D.LineJointMode.from(value))
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

  var textureMode: Int
    get() {
       return Line2D.LineTextureMode.from(getTextureMode()) 
    }
    set(value) {
      setTextureMode(Line2D.LineTextureMode.from(value))
    }

  var width: Float
    get() {
       return getWidth() 
    }
    set(value) {
      setWidth(value)
    }

  fun addPoint(position: Vector2, atPosition: Int) {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(atPosition)
    __method_bind.addPoint.call(this._handle, _args.toVariant(), 2)
  }

  fun clearPoints() {
    __method_bind.clearPoints.call(this._handle)
  }

  fun getBeginCapMode(): LineCapMode {
    val _ret = __method_bind.getBeginCapMode.call(this._handle)
    return Line2D.LineCapMode.from(_ret.asInt())
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
    val _ret = __method_bind.getPointPosition.call(this._handle, _arg, 1)
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
    __method_bind.removePoint.call(this._handle, _arg, 1)
  }

  fun setBeginCapMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setBeginCapMode.call(this._handle, _arg, 1)
  }

  fun setDefaultColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setDefaultColor.call(this._handle, _arg, 1)
  }

  fun setEndCapMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setEndCapMode.call(this._handle, _arg, 1)
  }

  fun setGradient(color: Gradient) {
    val _arg = Variant.new(color)
    __method_bind.setGradient.call(this._handle, _arg, 1)
  }

  fun setJointMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setJointMode.call(this._handle, _arg, 1)
  }

  fun setPointPosition(i: Int, position: Vector2) {
    val _args = VariantArray.new()
    _args.append(i)
    _args.append(position)
    __method_bind.setPointPosition.call(this._handle, _args.toVariant(), 2)
  }

  fun setPoints(points: PoolVector2Array) {
    val _arg = Variant.new(points)
    __method_bind.setPoints.call(this._handle, _arg, 1)
  }

  fun setRoundPrecision(precision: Int) {
    val _arg = Variant.new(precision)
    __method_bind.setRoundPrecision.call(this._handle, _arg, 1)
  }

  fun setSharpLimit(limit: Float) {
    val _arg = Variant.new(limit)
    __method_bind.setSharpLimit.call(this._handle, _arg, 1)
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, _arg, 1)
  }

  fun setTextureMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setTextureMode.call(this._handle, _arg, 1)
  }

  fun setWidth(width: Float) {
    val _arg = Variant.new(width)
    __method_bind.setWidth.call(this._handle, _arg, 1)
  }

  enum class LineTextureMode(
    val value: Int
  ) {
    LINE_TEXTURE_NONE(0),

    LINE_TEXTURE_TILE(1),

    LINE_TEXTURE_STRETCH(2);

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
    LINE_CAP_NONE(0),

    LINE_CAP_BOX(1),

    LINE_CAP_ROUND(2);

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
    LINE_JOINT_SHARP(0),

    LINE_JOINT_BEVEL(1),

    LINE_JOINT_ROUND(2);

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
    val LINE_CAP_BOX: Int = 1

    val LINE_CAP_NONE: Int = 0

    val LINE_CAP_ROUND: Int = 2

    val LINE_JOINT_BEVEL: Int = 1

    val LINE_JOINT_ROUND: Int = 2

    val LINE_JOINT_SHARP: Int = 0

    val LINE_TEXTURE_NONE: Int = 0

    val LINE_TEXTURE_STRETCH: Int = 2

    val LINE_TEXTURE_TILE: Int = 1

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
            "addPoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addPoint" }
        }
      val clearPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "clearPoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearPoints" }
        }
      val getBeginCapMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "getBeginCapMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBeginCapMode" }
        }
      val getDefaultColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "getDefaultColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDefaultColor" }
        }
      val getEndCapMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "getEndCapMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEndCapMode" }
        }
      val getGradient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "getGradient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGradient" }
        }
      val getJointMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "getJointMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getJointMode" }
        }
      val getPointCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "getPointCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointCount" }
        }
      val getPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "getPointPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointPosition" }
        }
      val getPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "getPoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPoints" }
        }
      val getRoundPrecision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "getRoundPrecision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRoundPrecision" }
        }
      val getSharpLimit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "getSharpLimit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSharpLimit" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "getTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTexture" }
        }
      val getTextureMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "getTextureMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTextureMode" }
        }
      val getWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "getWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWidth" }
        }
      val removePoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "removePoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removePoint" }
        }
      val setBeginCapMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "setBeginCapMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBeginCapMode" }
        }
      val setDefaultColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "setDefaultColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDefaultColor" }
        }
      val setEndCapMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "setEndCapMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEndCapMode" }
        }
      val setGradient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "setGradient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGradient" }
        }
      val setJointMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "setJointMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setJointMode" }
        }
      val setPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "setPointPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointPosition" }
        }
      val setPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "setPoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPoints" }
        }
      val setRoundPrecision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "setRoundPrecision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRoundPrecision" }
        }
      val setSharpLimit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "setSharpLimit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSharpLimit" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "setTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTexture" }
        }
      val setTextureMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "setTextureMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTextureMode" }
        }
      val setWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
            "setWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWidth" }
        }}
  }
}
