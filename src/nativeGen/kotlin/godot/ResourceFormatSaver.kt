// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ResourceFormatSaver internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getRecognizedExtensions(): PoolStringArray {
    TODO()
  }

  fun recognize(): Boolean {
    TODO()
  }

  fun save(): Int {
    TODO()
  }

  companion object {
    fun new(): ResourceFormatSaver = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ResourceFormatSaver".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ResourceFormatSaver" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ResourceFormatSaver(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ResourceFormatSaver
     */
    private object __method_bind {
      val get_recognized_extensions: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceFormatSaver".cstr.ptr,
              "get_recognized_extensions".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_recognized_extensions" }
            }
          }

      val recognize: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceFormatSaver".cstr.ptr,
              "recognize".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method recognize" }
            }
          }

      val save: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceFormatSaver".cstr.ptr,
              "save".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save" }
            }
          }
    }
  }
}
