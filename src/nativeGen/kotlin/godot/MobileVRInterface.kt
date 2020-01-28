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

  fun getDisplayToLens(): Float {
    val _ret = __method_bind.getDisplayToLens.call(this._handle)
    return _ret.asFloat()
  }

  fun getDisplayWidth(): Float {
    val _ret = __method_bind.getDisplayWidth.call(this._handle)
    return _ret.asFloat()
  }

  fun getEyeHeight(): Float {
    val _ret = __method_bind.getEyeHeight.call(this._handle)
    return _ret.asFloat()
  }

  fun getIod(): Float {
    val _ret = __method_bind.getIod.call(this._handle)
    return _ret.asFloat()
  }

  fun getK1(): Float {
    val _ret = __method_bind.getK1.call(this._handle)
    return _ret.asFloat()
  }

  fun getK2(): Float {
    val _ret = __method_bind.getK2.call(this._handle)
    return _ret.asFloat()
  }

  fun getOversample(): Float {
    val _ret = __method_bind.getOversample.call(this._handle)
    return _ret.asFloat()
  }

  fun setDisplayToLens(displayToLens: Float) {
    val _arg = Variant.new(displayToLens)
    __method_bind.setDisplayToLens.call(this._handle, _arg, 1)
  }

  fun setDisplayWidth(displayWidth: Float) {
    val _arg = Variant.new(displayWidth)
    __method_bind.setDisplayWidth.call(this._handle, _arg, 1)
  }

  fun setEyeHeight(eyeHeight: Float) {
    val _arg = Variant.new(eyeHeight)
    __method_bind.setEyeHeight.call(this._handle, _arg, 1)
  }

  fun setIod(iod: Float) {
    val _arg = Variant.new(iod)
    __method_bind.setIod.call(this._handle, _arg, 1)
  }

  fun setK1(k: Float) {
    val _arg = Variant.new(k)
    __method_bind.setK1.call(this._handle, _arg, 1)
  }

  fun setK2(k: Float) {
    val _arg = Variant.new(k)
    __method_bind.setK2.call(this._handle, _arg, 1)
  }

  fun setOversample(oversample: Float) {
    val _arg = Variant.new(oversample)
    __method_bind.setOversample.call(this._handle, _arg, 1)
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
      val getDisplayToLens: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "getDisplayToLens".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDisplayToLens" }
        }
      val getDisplayWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "getDisplayWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDisplayWidth" }
        }
      val getEyeHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "getEyeHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEyeHeight" }
        }
      val getIod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "getIod".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIod" }
        }
      val getK1: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "getK1".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getK1" }
        }
      val getK2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "getK2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getK2" }
        }
      val getOversample: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "getOversample".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOversample" }
        }
      val setDisplayToLens: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "setDisplayToLens".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDisplayToLens" }
        }
      val setDisplayWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "setDisplayWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDisplayWidth" }
        }
      val setEyeHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "setEyeHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEyeHeight" }
        }
      val setIod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "setIod".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIod" }
        }
      val setK1: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "setK1".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setK1" }
        }
      val setK2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "setK2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setK2" }
        }
      val setOversample: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MobileVRInterface".cstr.ptr,
            "setOversample".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOversample" }
        }}
  }
}
