// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
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

open class MobileVRInterface(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : ARVRInterface(null) {
  var displayToLens: Float
    get() {
       return getDisplayToLens() 
    }
    set(value) {
      setDisplayToLens(value)
    }

  var displayWidth: Float
    get() {
       return getDisplayWidth() 
    }
    set(value) {
      setDisplayWidth(value)
    }

  var eyeHeight: Float
    get() {
       return getEyeHeight() 
    }
    set(value) {
      setEyeHeight(value)
    }

  var iod: Float
    get() {
       return getIod() 
    }
    set(value) {
      setIod(value)
    }

  var k1: Float
    get() {
       return getK1() 
    }
    set(value) {
      setK1(value)
    }

  var k2: Float
    get() {
       return getK2() 
    }
    set(value) {
      setK2(value)
    }

  var oversample: Float
    get() {
       return getOversample() 
    }
    set(value) {
      setOversample(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getDisplayToLens(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDisplayToLens.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDisplayWidth(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDisplayWidth.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getEyeHeight(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEyeHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getIod(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getIod.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getK1(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getK1.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getK2(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getK2.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getOversample(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOversample.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setDisplayToLens(displayToLens: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDisplayToLens.call(self._handle, listOf(displayToLens), null)
    }
  }

  fun setDisplayWidth(displayWidth: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDisplayWidth.call(self._handle, listOf(displayWidth), null)
    }
  }

  fun setEyeHeight(eyeHeight: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEyeHeight.call(self._handle, listOf(eyeHeight), null)
    }
  }

  fun setIod(iod: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setIod.call(self._handle, listOf(iod), null)
    }
  }

  fun setK1(k: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setK1.call(self._handle, listOf(k), null)
    }
  }

  fun setK2(k: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setK2.call(self._handle, listOf(k), null)
    }
  }

  fun setOversample(oversample: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOversample.call(self._handle, listOf(oversample), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("MobileVRInterface".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MobileVRInterface" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for MobileVRInterface
     */
    private object __method_bind {
      val getDisplayToLens: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "get_display_to_lens".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_display_to_lens" }
        }
      val getDisplayWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "get_display_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_display_width" }
        }
      val getEyeHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "get_eye_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_eye_height" }
        }
      val getIod: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "get_iod".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_iod" }
        }
      val getK1: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "get_k1".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_k1" }
        }
      val getK2: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "get_k2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_k2" }
        }
      val getOversample: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "get_oversample".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_oversample" }
        }
      val setDisplayToLens: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "set_display_to_lens".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_display_to_lens" }
        }
      val setDisplayWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "set_display_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_display_width" }
        }
      val setEyeHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "set_eye_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_eye_height" }
        }
      val setIod: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "set_iod".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_iod" }
        }
      val setK1: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "set_k1".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_k1" }
        }
      val setK2: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "set_k2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_k2" }
        }
      val setOversample: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "set_oversample".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_oversample" }
        }}
  }
}
