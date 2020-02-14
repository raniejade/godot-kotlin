// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class ParallaxLayer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var motionMirroring: Vector2
    get() {
       return getMirroring() 
    }
    set(value) {
      setMirroring(value)
    }

  var motionOffset: Vector2
    get() {
       return getMotionOffset() 
    }
    set(value) {
      setMotionOffset(value)
    }

  var motionScale: Vector2
    get() {
       return getMotionScale() 
    }
    set(value) {
      setMotionScale(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for motionMirroring
   */
  fun motionMirroring(cb: Vector2.() -> Unit) {
    val _p = motionMirroring
    cb(_p)
    motionMirroring = _p
  }

  /**
   * Specialized setter for motionOffset
   */
  fun motionOffset(cb: Vector2.() -> Unit) {
    val _p = motionOffset
    cb(_p)
    motionOffset = _p
  }

  /**
   * Specialized setter for motionScale
   */
  fun motionScale(cb: Vector2.() -> Unit) {
    val _p = motionScale
    cb(_p)
    motionScale = _p
  }

  fun getMirroring(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getMirroring.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMotionOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getMotionOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMotionScale(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getMotionScale.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setMirroring(mirror: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMirroring.call(self._handle, listOf(mirror), null)
    }
  }

  fun setMotionOffset(offset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMotionOffset.call(self._handle, listOf(offset), null)
    }
  }

  fun setMotionScale(scale: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMotionScale.call(self._handle, listOf(scale), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ParallaxLayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ParallaxLayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ParallaxLayer
     */
    private object __method_bind {
      val getMirroring: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxLayer".cstr.ptr,
            "get_mirroring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mirroring" }
        }
      val getMotionOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxLayer".cstr.ptr,
            "get_motion_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_motion_offset" }
        }
      val getMotionScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxLayer".cstr.ptr,
            "get_motion_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_motion_scale" }
        }
      val setMirroring: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxLayer".cstr.ptr,
            "set_mirroring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mirroring" }
        }
      val setMotionOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxLayer".cstr.ptr,
            "set_motion_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_motion_offset" }
        }
      val setMotionScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxLayer".cstr.ptr,
            "set_motion_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_motion_scale" }
        }}
  }
}
