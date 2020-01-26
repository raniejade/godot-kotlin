// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorScript internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun run() {
    TODO()
  }

  fun addRootNode() {
    TODO()
  }

  fun getEditorInterface(): EditorInterface {
    TODO()
  }

  fun getScene(): Node {
    TODO()
  }

  companion object {
    fun new(): EditorScript = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorScript".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorScript" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorScript(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorScript
     */
    private object __method_bind {
      val _run: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorScript".cstr.ptr,
              "_run".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _run" }
            }
          }

      val add_root_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorScript".cstr.ptr,
              "add_root_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_root_node" }
            }
          }

      val get_editor_interface: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorScript".cstr.ptr,
              "get_editor_interface".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_editor_interface" }
            }
          }

      val get_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorScript".cstr.ptr,
              "get_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scene" }
            }
          }
    }
  }
}
