// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class GradientTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  fun getGradient(): Gradient {
    val _ret = __method_bind.get_gradient.call(this.toVariant())
    TODO()
  }

  fun setGradient(gradient: Gradient) {
    val _args = VariantArray.new()
    _args.append(gradient)
    val _ret = __method_bind.set_gradient.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setWidth(width: Int) {
    val _args = VariantArray.new()
    _args.append(width)
    val _ret = __method_bind.set_width.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): GradientTexture = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("GradientTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton GradientTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GradientTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): GradientTexture = GradientTexture(ptr)
    /**
     * Container for method_bind pointers for GradientTexture
     */
    private object __method_bind {
      val get_gradient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GradientTexture".cstr.ptr,
              "get_gradient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gradient" }
            }
          }

      val set_gradient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GradientTexture".cstr.ptr,
              "set_gradient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gradient" }
            }
          }

      val set_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GradientTexture".cstr.ptr,
              "set_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_width" }
            }
          }
    }
  }
}
