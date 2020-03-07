// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class Line2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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

  open fun _curve_changed() {
    TODO()
  }

  open fun _gradient_changed() {
    TODO()
  }

  fun addPoint(position: Vector2, atPosition: Int = -1) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(position)
      _args.add(atPosition)
      __method_bind.addPoint.call(self._handle, _args, null)
    }
  }

  fun clearPoints() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearPoints.call(self._handle, emptyList(), null)
    }
  }

  fun getAntialiased(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAntialiased.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getBeginCapMode(): LineCapMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBeginCapMode.call(self._handle, emptyList(), _retPtr)
      Line2D.LineCapMode.from(_ret.value)
    }
  }

  fun getCurve(): Curve {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Curve
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getCurve.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Curve>(_tmp.value!!)
      _ret
    }
  }

  fun getDefaultColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getDefaultColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getEndCapMode(): LineCapMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEndCapMode.call(self._handle, emptyList(), _retPtr)
      Line2D.LineCapMode.from(_ret.value)
    }
  }

  fun getGradient(): Gradient {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Gradient
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getGradient.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Gradient>(_tmp.value!!)
      _ret
    }
  }

  fun getJointMode(): LineJointMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getJointMode.call(self._handle, emptyList(), _retPtr)
      Line2D.LineJointMode.from(_ret.value)
    }
  }

  fun getPointCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPointCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPointPosition(i: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getPointPosition.call(self._handle, listOf(i), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPoints(): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      __method_bind.getPoints.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRoundPrecision(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRoundPrecision.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSharpLimit(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSharpLimit.call(self._handle, emptyList(), _retPtr)
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

  fun getTextureMode(): LineTextureMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTextureMode.call(self._handle, emptyList(), _retPtr)
      Line2D.LineTextureMode.from(_ret.value)
    }
  }

  fun getWidth(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWidth.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun removePoint(i: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removePoint.call(self._handle, listOf(i), null)
    }
  }

  fun setAntialiased(antialiased: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAntialiased.call(self._handle, listOf(antialiased), null)
    }
  }

  fun setBeginCapMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBeginCapMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setCurve(curve: Curve) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCurve.call(self._handle, listOf(curve), null)
    }
  }

  fun setDefaultColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDefaultColor.call(self._handle, listOf(color), null)
    }
  }

  fun setEndCapMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEndCapMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setGradient(color: Gradient) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGradient.call(self._handle, listOf(color), null)
    }
  }

  fun setJointMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setJointMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setPointPosition(i: Int, position: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(i)
      _args.add(position)
      __method_bind.setPointPosition.call(self._handle, _args, null)
    }
  }

  fun setPoints(points: PoolVector2Array) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPoints.call(self._handle, listOf(points), null)
    }
  }

  fun setRoundPrecision(precision: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRoundPrecision.call(self._handle, listOf(precision), null)
    }
  }

  fun setSharpLimit(limit: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSharpLimit.call(self._handle, listOf(limit), null)
    }
  }

  fun setTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setTextureMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTextureMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setWidth(width: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWidth.call(self._handle, listOf(width), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Line2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Line2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Line2D
     */
    private object __method_bind {
      val addPoint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "add_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_point" }
            }
          }

      val clearPoints: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "clear_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_points" }
            }
          }

      val getAntialiased: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_antialiased".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_antialiased" }
            }
          }

      val getBeginCapMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_begin_cap_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_begin_cap_mode" }
            }
          }

      val getCurve: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_curve" }
            }
          }

      val getDefaultColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_default_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_default_color" }
            }
          }

      val getEndCapMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_end_cap_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_end_cap_mode" }
            }
          }

      val getGradient: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_gradient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gradient" }
            }
          }

      val getJointMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_joint_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joint_mode" }
            }
          }

      val getPointCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_point_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_count" }
            }
          }

      val getPointPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_position" }
            }
          }

      val getPoints: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_points" }
            }
          }

      val getRoundPrecision: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_round_precision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_round_precision" }
            }
          }

      val getSharpLimit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_sharp_limit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sharp_limit" }
            }
          }

      val getTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val getTextureMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_texture_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_mode" }
            }
          }

      val getWidth: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_width" }
            }
          }

      val removePoint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "remove_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_point" }
            }
          }

      val setAntialiased: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_antialiased".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_antialiased" }
            }
          }

      val setBeginCapMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_begin_cap_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_begin_cap_mode" }
            }
          }

      val setCurve: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_curve" }
            }
          }

      val setDefaultColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_default_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_color" }
            }
          }

      val setEndCapMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_end_cap_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_end_cap_mode" }
            }
          }

      val setGradient: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_gradient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gradient" }
            }
          }

      val setJointMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_joint_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_joint_mode" }
            }
          }

      val setPointPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_position" }
            }
          }

      val setPoints: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_points" }
            }
          }

      val setRoundPrecision: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_round_precision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_round_precision" }
            }
          }

      val setSharpLimit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_sharp_limit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sharp_limit" }
            }
          }

      val setTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val setTextureMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_texture_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_mode" }
            }
          }

      val setWidth: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_width" }
            }
          }
    }
  }
}
