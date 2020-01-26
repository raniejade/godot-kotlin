// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Resource internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun setupLocalToScene() {
    TODO()
  }

  fun duplicate(): Resource {
    TODO()
  }

  fun getLocalScene(): Node {
    TODO()
  }

  fun getName(): String {
    TODO()
  }

  fun getPath(): String {
    TODO()
  }

  fun getRid(): RID {
    TODO()
  }

  fun isLocalToScene(): Boolean {
    TODO()
  }

  fun setLocalToScene() {
    TODO()
  }

  fun setName() {
    TODO()
  }

  fun setPath() {
    TODO()
  }

  fun setupLocalToScene() {
    TODO()
  }

  fun takeOverPath() {
    TODO()
  }

  companion object {
    fun new(): Resource = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Resource".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Resource" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Resource(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Resource
     */
    private object __method_bind {
      val _setup_local_to_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
              "_setup_local_to_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _setup_local_to_scene" }
            }
          }

      val duplicate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
              "duplicate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method duplicate" }
            }
          }

      val get_local_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
              "get_local_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_local_scene" }
            }
          }

      val get_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
              "get_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_name" }
            }
          }

      val get_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
              "get_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_path" }
            }
          }

      val get_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
              "get_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rid" }
            }
          }

      val is_local_to_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
              "is_local_to_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_local_to_scene" }
            }
          }

      val set_local_to_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
              "set_local_to_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_local_to_scene" }
            }
          }

      val set_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
              "set_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_name" }
            }
          }

      val set_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
              "set_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_path" }
            }
          }

      val setup_local_to_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
              "setup_local_to_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method setup_local_to_scene" }
            }
          }

      val take_over_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
              "take_over_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method take_over_path" }
            }
          }
    }
  }
}
