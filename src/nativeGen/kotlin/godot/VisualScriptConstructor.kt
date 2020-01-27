// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
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

open class VisualScriptConstructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getConstructor(): Dictionary {
    val _ret = __method_bind.get_constructor.call(this._handle)
    return _ret.asDictionary()
  }

  fun getConstructorType(): Variant.Type {
    val _ret = __method_bind.get_constructor_type.call(this._handle)
    return Variant.Type.from(_ret.asInt())
  }

  fun setConstructor(constructor: Dictionary) {
    val _arg = Variant.new(constructor)
    __method_bind.set_constructor.call(this._handle, _arg, 1)
  }

  fun setConstructorType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.set_constructor_type.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualScriptConstructor = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptConstructor".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptConstructor" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptConstructor(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptConstructor = VisualScriptConstructor(ptr)
    /**
     * Container for method_bind pointers for VisualScriptConstructor
     */
    private object __method_bind {
      val get_constructor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstructor".cstr.ptr,
            "get_constructor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constructor" }
        }
      val get_constructor_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstructor".cstr.ptr,
            "get_constructor_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constructor_type" }
        }
      val set_constructor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstructor".cstr.ptr,
            "set_constructor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constructor" }
        }
      val set_constructor_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstructor".cstr.ptr,
            "set_constructor_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constructor_type" }
        }}
  }
}
