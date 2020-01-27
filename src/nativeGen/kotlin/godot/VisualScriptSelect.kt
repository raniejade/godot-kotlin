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

open class VisualScriptSelect internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getTyped(): Variant.Type {
    val _ret = __method_bind.get_typed.call(this.toVariant())
    TODO()
  }

  fun setTyped(type: Int) {
    val _args = VariantArray.new()
    _args.append(type)
    val _ret = __method_bind.set_typed.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): VisualScriptSelect = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptSelect".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptSelect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptSelect(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptSelect = VisualScriptSelect(ptr)
    /**
     * Container for method_bind pointers for VisualScriptSelect
     */
    private object __method_bind {
      val get_typed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSelect".cstr.ptr,
              "get_typed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_typed" }
            }
          }

      val set_typed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptSelect".cstr.ptr,
              "set_typed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_typed" }
            }
          }
    }
  }
}
