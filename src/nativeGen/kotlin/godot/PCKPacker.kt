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

open class PCKPacker internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addFile(pck_path: String, source_path: String): Error {
    TODO()
  }

  fun flush(verbose: Boolean): Error {
    TODO()
  }

  fun pckStart(pck_name: String, alignment: Int): Error {
    TODO()
  }

  companion object {
    fun new(): PCKPacker = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PCKPacker".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PCKPacker" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PCKPacker(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PCKPacker = PCKPacker(ptr)
    /**
     * Container for method_bind pointers for PCKPacker
     */
    private object __method_bind {
      val add_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PCKPacker".cstr.ptr,
              "add_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_file" }
            }
          }

      val flush: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PCKPacker".cstr.ptr,
              "flush".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method flush" }
            }
          }

      val pck_start: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PCKPacker".cstr.ptr,
              "pck_start".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method pck_start" }
            }
          }
    }
  }
}
