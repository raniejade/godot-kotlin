// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ResourceFormatLoader internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getDependencies() {
    TODO()
  }

  fun getRecognizedExtensions(): PoolStringArray {
    TODO()
  }

  fun getResourceType(): String {
    TODO()
  }

  fun handlesType(): Boolean {
    TODO()
  }

  fun load(): Variant {
    TODO()
  }

  fun renameDependencies(): Int {
    TODO()
  }

  companion object {
    fun new(): ResourceFormatLoader = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ResourceFormatLoader".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ResourceFormatLoader" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ResourceFormatLoader(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ResourceFormatLoader
     */
    private object __method_bind {
      val get_dependencies: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceFormatLoader".cstr.ptr,
              "get_dependencies".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dependencies" }
            }
          }

      val get_recognized_extensions: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceFormatLoader".cstr.ptr,
              "get_recognized_extensions".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_recognized_extensions" }
            }
          }

      val get_resource_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceFormatLoader".cstr.ptr,
              "get_resource_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resource_type" }
            }
          }

      val handles_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceFormatLoader".cstr.ptr,
              "handles_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method handles_type" }
            }
          }

      val load: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceFormatLoader".cstr.ptr,
              "load".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load" }
            }
          }

      val rename_dependencies: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceFormatLoader".cstr.ptr,
              "rename_dependencies".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_dependencies" }
            }
          }
    }
  }
}
