// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
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

open class SliderJoint(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Joint(null) {
  var angularLimitDamping: Float
    get() {
       return getParam(15) 
    }
    set(value) {
      setParam(15, value)
    }

  var angularLimitRestitution: Float
    get() {
       return getParam(14) 
    }
    set(value) {
      setParam(14, value)
    }

  var angularLimitSoftness: Float
    get() {
       return getParam(13) 
    }
    set(value) {
      setParam(13, value)
    }

  var angularMotionDamping: Float
    get() {
       return getParam(18) 
    }
    set(value) {
      setParam(18, value)
    }

  var angularMotionRestitution: Float
    get() {
       return getParam(17) 
    }
    set(value) {
      setParam(17, value)
    }

  var angularMotionSoftness: Float
    get() {
       return getParam(16) 
    }
    set(value) {
      setParam(16, value)
    }

  var angularOrthoDamping: Float
    get() {
       return getParam(21) 
    }
    set(value) {
      setParam(21, value)
    }

  var angularOrthoRestitution: Float
    get() {
       return getParam(20) 
    }
    set(value) {
      setParam(20, value)
    }

  var angularOrthoSoftness: Float
    get() {
       return getParam(19) 
    }
    set(value) {
      setParam(19, value)
    }

  var linearLimitDamping: Float
    get() {
       return getParam(4) 
    }
    set(value) {
      setParam(4, value)
    }

  var linearLimitLowerDistance: Float
    get() {
       return getParam(1) 
    }
    set(value) {
      setParam(1, value)
    }

  var linearLimitRestitution: Float
    get() {
       return getParam(3) 
    }
    set(value) {
      setParam(3, value)
    }

  var linearLimitSoftness: Float
    get() {
       return getParam(2) 
    }
    set(value) {
      setParam(2, value)
    }

  var linearLimitUpperDistance: Float
    get() {
       return getParam(0) 
    }
    set(value) {
      setParam(0, value)
    }

  var linearMotionDamping: Float
    get() {
       return getParam(7) 
    }
    set(value) {
      setParam(7, value)
    }

  var linearMotionRestitution: Float
    get() {
       return getParam(6) 
    }
    set(value) {
      setParam(6, value)
    }

  var linearMotionSoftness: Float
    get() {
       return getParam(5) 
    }
    set(value) {
      setParam(5, value)
    }

  var linearOrthoDamping: Float
    get() {
       return getParam(10) 
    }
    set(value) {
      setParam(10, value)
    }

  var linearOrthoRestitution: Float
    get() {
       return getParam(9) 
    }
    set(value) {
      setParam(9, value)
    }

  var linearOrthoSoftness: Float
    get() {
       return getParam(8) 
    }
    set(value) {
      setParam(8, value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getParam(param: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getParam.call(self._handle, listOf(param), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setParam(param: Int, value: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(param)
      _args.add(value)
      __method_bind.setParam.call(self._handle, _args, null)
    }
  }

  enum class Param(
    val value: Int
  ) {
    LINEAR_LIMIT_UPPER(0),

    LINEAR_LIMIT_LOWER(1),

    LINEAR_LIMIT_SOFTNESS(2),

    LINEAR_LIMIT_RESTITUTION(3),

    LINEAR_LIMIT_DAMPING(4),

    LINEAR_MOTION_SOFTNESS(5),

    LINEAR_MOTION_RESTITUTION(6),

    LINEAR_MOTION_DAMPING(7),

    LINEAR_ORTHOGONAL_SOFTNESS(8),

    LINEAR_ORTHOGONAL_RESTITUTION(9),

    LINEAR_ORTHOGONAL_DAMPING(10),

    ANGULAR_LIMIT_UPPER(11),

    ANGULAR_LIMIT_LOWER(12),

    ANGULAR_LIMIT_SOFTNESS(13),

    ANGULAR_LIMIT_RESTITUTION(14),

    ANGULAR_LIMIT_DAMPING(15),

    ANGULAR_MOTION_SOFTNESS(16),

    ANGULAR_MOTION_RESTITUTION(17),

    ANGULAR_MOTION_DAMPING(18),

    ANGULAR_ORTHOGONAL_SOFTNESS(19),

    ANGULAR_ORTHOGONAL_RESTITUTION(20),

    ANGULAR_ORTHOGONAL_DAMPING(21),

    MAX(22);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SliderJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SliderJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SliderJoint
     */
    private object __method_bind {
      val getParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SliderJoint".cstr.ptr,
            "get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_param" }
        }
      val setParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SliderJoint".cstr.ptr,
            "set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_param" }
        }}
  }
}
