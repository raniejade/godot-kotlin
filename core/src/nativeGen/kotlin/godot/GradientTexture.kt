// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
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
    _handle = __new()
  }

  fun getGradient(): Gradient {
    val _ret = __method_bind.getGradient.call(this._handle)
    return _ret.asObject(::Gradient)!!
  }

  fun setGradient(gradient: Gradient) {
    val _arg = Variant(gradient)
    __method_bind.setGradient.call(this._handle, listOf(_arg))
  }

  fun setWidth(width: Int) {
    val _arg = Variant(width)
    __method_bind.setWidth.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
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
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GradientTexture".cstr.ptr,
            "get_gradient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gradient" }
        }
      val setGradient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GradientTexture".cstr.ptr,
            "set_gradient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gradient" }
        }
      val setWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GradientTexture".cstr.ptr,
            "set_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_width" }
        }}
  }
}
