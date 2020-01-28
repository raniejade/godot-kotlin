// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PathFollow2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
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
    val _arg = Variant.new(enable)
    __method_bind.setCubicInterpolation.call(this._handle, _arg, 1)
  }

  fun setHOffset(hOffset: Float) {
    val _arg = Variant.new(hOffset)
    __method_bind.setHOffset.call(this._handle, _arg, 1)
  }

  fun setLookahead(lookahead: Float) {
    val _arg = Variant.new(lookahead)
    __method_bind.setLookahead.call(this._handle, _arg, 1)
  }

  fun setLoop(loop: Boolean) {
    val _arg = Variant.new(loop)
    __method_bind.setLoop.call(this._handle, _arg, 1)
  }

  fun setOffset(offset: Float) {
    val _arg = Variant.new(offset)
    __method_bind.setOffset.call(this._handle, _arg, 1)
  }

  fun setRotate(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setRotate.call(this._handle, _arg, 1)
  }

  fun setUnitOffset(unitOffset: Float) {
    val _arg = Variant.new(unitOffset)
    __method_bind.setUnitOffset.call(this._handle, _arg, 1)
  }

  fun setVOffset(vOffset: Float) {
    val _arg = Variant.new(vOffset)
    __method_bind.setVOffset.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): PathFollow2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PathFollow2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PathFollow2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PathFollow2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PathFollow2D = PathFollow2D(ptr)
    /**
     * Container for method_bind pointers for PathFollow2D
     */
    private object __method_bind {
      val getCubicInterpolation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "getCubicInterpolation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCubicInterpolation" }
        }
      val getHOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "getHOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHOffset" }
        }
      val getLookahead: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "getLookahead".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLookahead" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "getOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOffset" }
        }
      val getUnitOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "getUnitOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUnitOffset" }
        }
      val getVOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "getVOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVOffset" }
        }
      val hasLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "hasLoop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasLoop" }
        }
      val isRotating: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "isRotating".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRotating" }
        }
      val setCubicInterpolation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "setCubicInterpolation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCubicInterpolation" }
        }
      val setHOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "setHOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHOffset" }
        }
      val setLookahead: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "setLookahead".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLookahead" }
        }
      val setLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "setLoop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLoop" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "setOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOffset" }
        }
      val setRotate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "setRotate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRotate" }
        }
      val setUnitOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "setUnitOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUnitOffset" }
        }
      val setVOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
            "setVOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVOffset" }
        }}
  }
}
