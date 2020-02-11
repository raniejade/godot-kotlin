// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PathFollow2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var cubicInterp: Boolean
    get() {
       return getCubicInterpolation() 
    }
    set(value) {
      setCubicInterpolation(value)
    }

  var hOffset: Float
    get() {
       return getHOffset() 
    }
    set(value) {
      setHOffset(value)
    }

  var lookahead: Float
    get() {
       return getLookahead() 
    }
    set(value) {
      setLookahead(value)
    }

  var loop: Boolean
    get() {
       return hasLoop() 
    }
    set(value) {
      setLoop(value)
    }

  var offset: Float
    get() {
       return getOffset() 
    }
    set(value) {
      setOffset(value)
    }

  var rotate: Boolean
    get() {
       return isRotating() 
    }
    set(value) {
      setRotate(value)
    }

  var unitOffset: Float
    get() {
       return getUnitOffset() 
    }
    set(value) {
      setUnitOffset(value)
    }

  var vOffset: Float
    get() {
       return getVOffset() 
    }
    set(value) {
      setVOffset(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getCubicInterpolation(): Boolean {
    val _ret = __method_bind.getCubicInterpolation.call(this._handle)
    return _ret.asBoolean()
  }

  fun getHOffset(): Float {
    val _ret = __method_bind.getHOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun getLookahead(): Float {
    val _ret = __method_bind.getLookahead.call(this._handle)
    return _ret.asFloat()
  }

  fun getOffset(): Float {
    val _ret = __method_bind.getOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun getUnitOffset(): Float {
    val _ret = __method_bind.getUnitOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun getVOffset(): Float {
    val _ret = __method_bind.getVOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun hasLoop(): Boolean {
    val _ret = __method_bind.hasLoop.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRotating(): Boolean {
    val _ret = __method_bind.isRotating.call(this._handle)
    return _ret.asBoolean()
  }

  fun setCubicInterpolation(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setCubicInterpolation.call(this._handle, listOf(_arg))
  }

  fun setHOffset(hOffset: Float) {
    val _arg = Variant(hOffset)
    __method_bind.setHOffset.call(this._handle, listOf(_arg))
  }

  fun setLookahead(lookahead: Float) {
    val _arg = Variant(lookahead)
    __method_bind.setLookahead.call(this._handle, listOf(_arg))
  }

  fun setLoop(loop: Boolean) {
    val _arg = Variant(loop)
    __method_bind.setLoop.call(this._handle, listOf(_arg))
  }

  fun setOffset(offset: Float) {
    val _arg = Variant(offset)
    __method_bind.setOffset.call(this._handle, listOf(_arg))
  }

  fun setRotate(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setRotate.call(this._handle, listOf(_arg))
  }

  fun setUnitOffset(unitOffset: Float) {
    val _arg = Variant(unitOffset)
    __method_bind.setUnitOffset.call(this._handle, listOf(_arg))
  }

  fun setVOffset(vOffset: Float) {
    val _arg = Variant(vOffset)
    __method_bind.setVOffset.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PathFollow2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PathFollow2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for PathFollow2D
     */
    private object __method_bind {
      val getCubicInterpolation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "get_cubic_interpolation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cubic_interpolation" }
        }
      val getHOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "get_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_offset" }
        }
      val getLookahead: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "get_lookahead".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lookahead" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val getUnitOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "get_unit_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unit_offset" }
        }
      val getVOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "get_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_offset" }
        }
      val hasLoop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "has_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_loop" }
        }
      val isRotating: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "is_rotating".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_rotating" }
        }
      val setCubicInterpolation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "set_cubic_interpolation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cubic_interpolation" }
        }
      val setHOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "set_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_offset" }
        }
      val setLookahead: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "set_lookahead".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lookahead" }
        }
      val setLoop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "set_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val setRotate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "set_rotate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotate" }
        }
      val setUnitOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "set_unit_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_unit_offset" }
        }
      val setVOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "set_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_offset" }
        }}
  }
}
