// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class GradientTexture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Texture(null) {
  var gradient: Gradient
    get() {
       return getGradient() 
    }
    set(value) {
      setGradient(value)
    }

  var width: Int
    get() {
       return getWidth() 
    }
    set(value) {
      setWidth(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
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

  fun setGradient(gradient: Gradient) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGradient.call(self._handle, listOf(gradient), null)
    }
  }

  fun setWidth(width: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWidth.call(self._handle, listOf(width), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("GradientTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GradientTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for GradientTexture
     */
    private object __method_bind {
      val getGradient: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GradientTexture".cstr.ptr,
            "get_gradient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gradient" }
        }
      val setGradient: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GradientTexture".cstr.ptr,
            "set_gradient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gradient" }
        }
      val setWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GradientTexture".cstr.ptr,
            "set_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_width" }
        }}
  }
}
