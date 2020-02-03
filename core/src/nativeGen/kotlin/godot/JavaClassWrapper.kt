// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class JavaClassWrapper(
  _handle: COpaquePointer
) : Object(_handle) {
  fun wrap(name: String): JavaClass {
    val _arg = Variant.new(name)
    val _ret = __method_bind.wrap.call(this._handle, listOf(_arg))
    return _ret.asObject(::JavaClass)!!
  }

  companion object {
    val Instance: JavaClassWrapper
      get() = memScoped {
        val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("JavaClassWrapper".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton JavaClassWrapper" }
        JavaClassWrapper(
          handle
        )
      }
    /**
     * Container for method_bind pointers for JavaClassWrapper
     */
    private object __method_bind {
      val wrap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JavaClassWrapper".cstr.ptr,
            "wrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method wrap" }
        }}
  }
}
