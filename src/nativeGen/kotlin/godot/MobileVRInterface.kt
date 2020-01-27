// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MobileVRInterface(
  _handle: COpaquePointer
) : ARVRInterface(_handle) {
  fun getDisplayToLens(): Float {
    val _ret = __method_bind.get_display_to_lens.call(this._handle)
    return _ret.asFloat()
  }

  fun getDisplayWidth(): Float {
    val _ret = __method_bind.get_display_width.call(this._handle)
    return _ret.asFloat()
  }

  fun getEyeHeight(): Float {
    val _ret = __method_bind.get_eye_height.call(this._handle)
    return _ret.asFloat()
  }

  fun getIod(): Float {
    val _ret = __method_bind.get_iod.call(this._handle)
    return _ret.asFloat()
  }

  fun getK1(): Float {
    val _ret = __method_bind.get_k1.call(this._handle)
    return _ret.asFloat()
  }

  fun getK2(): Float {
    val _ret = __method_bind.get_k2.call(this._handle)
    return _ret.asFloat()
  }

  fun getOversample(): Float {
    val _ret = __method_bind.get_oversample.call(this._handle)
    return _ret.asFloat()
  }

  fun setDisplayToLens(displayToLens: Float) {
    val _arg = Variant.new(displayToLens)
    __method_bind.set_display_to_lens.call(this._handle, _arg, 1)
  }

  fun setDisplayWidth(displayWidth: Float) {
    val _arg = Variant.new(displayWidth)
    __method_bind.set_display_width.call(this._handle, _arg, 1)
  }

  fun setEyeHeight(eyeHeight: Float) {
    val _arg = Variant.new(eyeHeight)
    __method_bind.set_eye_height.call(this._handle, _arg, 1)
  }

  fun setIod(iod: Float) {
    val _arg = Variant.new(iod)
    __method_bind.set_iod.call(this._handle, _arg, 1)
  }

  fun setK1(k: Float) {
    val _arg = Variant.new(k)
    __method_bind.set_k1.call(this._handle, _arg, 1)
  }

  fun setK2(k: Float) {
    val _arg = Variant.new(k)
    __method_bind.set_k2.call(this._handle, _arg, 1)
  }

  fun setOversample(oversample: Float) {
    val _arg = Variant.new(oversample)
    __method_bind.set_oversample.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): MobileVRInterface = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("MobileVRInterface".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MobileVRInterface" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MobileVRInterface(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MobileVRInterface = MobileVRInterface(ptr)
    /**
     * Container for method_bind pointers for MobileVRInterface
     */
    private object __method_bind {
      val get_display_to_lens: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "get_display_to_lens".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_display_to_lens" }
        }
      val get_display_width: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "get_display_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_display_width" }
        }
      val get_eye_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "get_eye_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_eye_height" }
        }
      val get_iod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "get_iod".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_iod" }
        }
      val get_k1: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "get_k1".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_k1" }
        }
      val get_k2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "get_k2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_k2" }
        }
      val get_oversample: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "get_oversample".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_oversample" }
        }
      val set_display_to_lens: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "set_display_to_lens".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_display_to_lens" }
        }
      val set_display_width: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "set_display_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_display_width" }
        }
      val set_eye_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "set_eye_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_eye_height" }
        }
      val set_iod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "set_iod".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_iod" }
        }
      val set_k1: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "set_k1".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_k1" }
        }
      val set_k2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "set_k2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_k2" }
        }
      val set_oversample: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "set_oversample".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_oversample" }
        }}
  }
}
