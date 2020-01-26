// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorResourceConversionPlugin internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun convert(): Resource {
    TODO()
  }

  fun convertsTo(): String {
    TODO()
  }

  companion object {
    fun new(): EditorResourceConversionPlugin = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorResourceConversionPlugin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorResourceConversionPlugin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorResourceConversionPlugin(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorResourceConversionPlugin
     */
    private object __method_bind {
      val _convert: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourceConversionPlugin".cstr.ptr,
              "_convert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _convert" }
            }
          }

      val _converts_to: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourceConversionPlugin".cstr.ptr,
              "_converts_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _converts_to" }
            }
          }
    }
  }
}
