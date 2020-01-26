// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class _Directory internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun changeDir(): Error {
    TODO()
  }

  fun copy(): Error {
    TODO()
  }

  fun currentIsDir(): Boolean {
    TODO()
  }

  fun dirExists(): Boolean {
    TODO()
  }

  fun fileExists(): Boolean {
    TODO()
  }

  fun getCurrentDir(): String {
    TODO()
  }

  fun getCurrentDrive(): Int {
    TODO()
  }

  fun getDrive(): String {
    TODO()
  }

  fun getDriveCount(): Int {
    TODO()
  }

  fun getNext(): String {
    TODO()
  }

  fun getSpaceLeft(): Int {
    TODO()
  }

  fun listDirBegin(): Error {
    TODO()
  }

  fun listDirEnd() {
    TODO()
  }

  fun makeDir(): Error {
    TODO()
  }

  fun makeDirRecursive(): Error {
    TODO()
  }

  fun open(): Error {
    TODO()
  }

  fun remove(): Error {
    TODO()
  }

  fun rename(): Error {
    TODO()
  }

  companion object {
    fun new(): _Directory = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("_Directory".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton _Directory" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      _Directory(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for _Directory
     */
    private object __method_bind {
      val change_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "change_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method change_dir" }
            }
          }

      val copy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "copy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method copy" }
            }
          }

      val current_is_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "current_is_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method current_is_dir" }
            }
          }

      val dir_exists: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "dir_exists".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method dir_exists" }
            }
          }

      val file_exists: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "file_exists".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method file_exists" }
            }
          }

      val get_current_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "get_current_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_dir" }
            }
          }

      val get_current_drive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "get_current_drive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_drive" }
            }
          }

      val get_drive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "get_drive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_drive" }
            }
          }

      val get_drive_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "get_drive_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_drive_count" }
            }
          }

      val get_next: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "get_next".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_next" }
            }
          }

      val get_space_left: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "get_space_left".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_space_left" }
            }
          }

      val list_dir_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "list_dir_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method list_dir_begin" }
            }
          }

      val list_dir_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "list_dir_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method list_dir_end" }
            }
          }

      val make_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "make_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_dir" }
            }
          }

      val make_dir_recursive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "make_dir_recursive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_dir_recursive" }
            }
          }

      val open: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "open".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open" }
            }
          }

      val remove: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "remove".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove" }
            }
          }

      val rename: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Directory".cstr.ptr,
              "rename".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename" }
            }
          }
    }
  }
}
