// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class NoiseTexture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Texture(null) {
  var asNormalmap: Boolean
    get() {
       return isNormalmap() 
    }
    set(value) {
      setAsNormalmap(value)
    }

  var bumpStrength: Float
    get() {
       return getBumpStrength() 
    }
    set(value) {
      setBumpStrength(value)
    }

  var height: Int
    get() {
       return getHeight() 
    }
    set(value) {
      setHeight(value)
    }

  var noise: OpenSimplexNoise
    get() {
       return getNoise() 
    }
    set(value) {
      setNoise(value)
    }

  var seamless: Boolean
    get() {
       return getSeamless() 
    }
    set(value) {
      setSeamless(value)
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

  fun getBumpStrength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBumpStrength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getNoise(): OpenSimplexNoise {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: OpenSimplexNoise
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNoise.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<OpenSimplexNoise>(_tmp.value!!)
      _ret
    }
  }

  fun getSeamless(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSeamless.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isNormalmap(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isNormalmap.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAsNormalmap(asNormalmap: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAsNormalmap.call(self._handle, listOf(asNormalmap), null)
    }
  }

  fun setBumpStrength(bumpStrength: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBumpStrength.call(self._handle, listOf(bumpStrength), null)
    }
  }

  fun setHeight(height: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHeight.call(self._handle, listOf(height), null)
    }
  }

  fun setNoise(noise: OpenSimplexNoise) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNoise.call(self._handle, listOf(noise), null)
    }
  }

  fun setSeamless(seamless: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSeamless.call(self._handle, listOf(seamless), null)
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("NoiseTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NoiseTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for NoiseTexture
     */
    private object __method_bind {
      val getBumpStrength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "get_bump_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bump_strength" }
        }
      val getNoise: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "get_noise".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_noise" }
        }
      val getSeamless: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "get_seamless".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_seamless" }
        }
      val isNormalmap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "is_normalmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_normalmap" }
        }
      val setAsNormalmap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_as_normalmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_normalmap" }
        }
      val setBumpStrength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_bump_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bump_strength" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_height" }
        }
      val setNoise: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_noise".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_noise" }
        }
      val setSeamless: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_seamless".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_seamless" }
        }
      val setWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NoiseTexture".cstr.ptr,
            "set_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_width" }
        }}
  }
}
