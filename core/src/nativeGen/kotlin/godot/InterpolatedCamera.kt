// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InterpolatedCamera(
  _handle: COpaquePointer
) : Camera(_handle) {
  var enabled: Boolean
    get() {
       return isInterpolationEnabled() 
    }
    set(value) {
      setInterpolationEnabled(value)
    }

  var speed: Float
    get() {
       return getSpeed() 
    }
    set(value) {
      setSpeed(value)
    }

  var target: NodePath
    get() {
       return getTargetPath() 
    }
    set(value) {
      setTargetPath(value)
    }

  /**
   * Specialized setter for target
   */
  fun target(cb: NodePath.() -> Unit) {
    val _p = target
    cb(_p)
    target = _p
  }

  fun getSpeed(): Float {
    val _ret = __method_bind.getSpeed.call(this._handle)
    return _ret.asFloat()
  }

  fun getTargetPath(): NodePath {
    val _ret = __method_bind.getTargetPath.call(this._handle)
    return _ret.asNodePath()
  }

  fun isInterpolationEnabled(): Boolean {
    val _ret = __method_bind.isInterpolationEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setInterpolationEnabled(targetPath: Boolean) {
    val _arg = Variant.new(targetPath)
    __method_bind.setInterpolationEnabled.call(this._handle, listOf(_arg))
  }

  fun setSpeed(speed: Float) {
    val _arg = Variant.new(speed)
    __method_bind.setSpeed.call(this._handle, listOf(_arg))
  }

  fun setTarget(target: Object) {
    val _arg = Variant.new(target)
    __method_bind.setTarget.call(this._handle, listOf(_arg))
  }

  fun setTargetPath(targetPath: NodePath) {
    val _arg = Variant.new(targetPath)
    __method_bind.setTargetPath.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): InterpolatedCamera = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InterpolatedCamera".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InterpolatedCamera" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InterpolatedCamera(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InterpolatedCamera = InterpolatedCamera(ptr)
    /**
     * Container for method_bind pointers for InterpolatedCamera
     */
    private object __method_bind {
      val getSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
            "get_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed" }
        }
      val getTargetPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
            "get_target_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_target_path" }
        }
      val isInterpolationEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
            "is_interpolation_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_interpolation_enabled" }
        }
      val setInterpolationEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
            "set_interpolation_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_interpolation_enabled" }
        }
      val setSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
            "set_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed" }
        }
      val setTarget: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
            "set_target".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_target" }
        }
      val setTargetPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
            "set_target_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_target_path" }
        }}
  }
}
