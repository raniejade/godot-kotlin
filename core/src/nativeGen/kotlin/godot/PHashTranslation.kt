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

open class PHashTranslation(
  _handle: COpaquePointer
) : Translation(_handle) {
  fun generate(from: Translation) {
    val _arg = Variant.new(from)
    __method_bind.generate.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): PHashTranslation = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PHashTranslation".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PHashTranslation" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PHashTranslation(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PHashTranslation = PHashTranslation(ptr)
    /**
     * Container for method_bind pointers for PHashTranslation
     */
    private object __method_bind {
      val generate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PHashTranslation".cstr.ptr,
            "generate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generate" }
        }}
  }
}
