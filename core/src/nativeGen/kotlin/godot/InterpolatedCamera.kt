// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class InterpolatedCamera(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Camera(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpeed.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTargetPath(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getTargetPath.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isInterpolationEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isInterpolationEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setInterpolationEnabled(targetPath: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInterpolationEnabled.call(self._handle, listOf(targetPath), null)
    }
  }

  fun setSpeed(speed: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpeed.call(self._handle, listOf(speed), null)
    }
  }

  fun setTarget(target: Object) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTarget.call(self._handle, listOf(target), null)
    }
  }

  fun setTargetPath(targetPath: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTargetPath.call(self._handle, listOf(targetPath), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InterpolatedCamera".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InterpolatedCamera" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for InterpolatedCamera
     */
    private object __method_bind {
      val getSpeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
            "get_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed" }
        }
      val getTargetPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
            "get_target_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_target_path" }
        }
      val isInterpolationEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
            "is_interpolation_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_interpolation_enabled" }
        }
      val setInterpolationEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
            "set_interpolation_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_interpolation_enabled" }
        }
      val setSpeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
            "set_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed" }
        }
      val setTarget: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
            "set_target".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_target" }
        }
      val setTargetPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InterpolatedCamera".cstr.ptr,
            "set_target_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_target_path" }
        }}
  }
}
