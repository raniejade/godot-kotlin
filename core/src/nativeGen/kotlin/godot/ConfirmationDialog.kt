// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ConfirmationDialog(
  _handle: COpaquePointer
) : AcceptDialog(_handle) {
  fun getCancel(): Button {
    val _ret = __method_bind.getCancel.call(this._handle)
    return _ret.asObject(::Button)!!
  }

  companion object {
    fun new(): ConfirmationDialog = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConfirmationDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ConfirmationDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ConfirmationDialog(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ConfirmationDialog = ConfirmationDialog(ptr)
    /**
     * Container for method_bind pointers for ConfirmationDialog
     */
    private object __method_bind {
      val getCancel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfirmationDialog".cstr.ptr,
            "get_cancel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cancel" }
        }}
  }
}
