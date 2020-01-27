// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
  fun addFile(pckPath: String, sourcePath: String): Error {
    val _args = VariantArray.new()
    _args.append(pckPath)
    _args.append(sourcePath)
    val _ret = __method_bind.add_file.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun flush(verbose: Boolean): Error {
    val _args = VariantArray.new()
    _args.append(verbose)
    val _ret = __method_bind.flush.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun pckStart(pckName: String, alignment: Int): Error {
    val _args = VariantArray.new()
    _args.append(pckName)
    _args.append(alignment)
    val _ret = __method_bind.pck_start.call(this.toVariant(), _args.toVariant(), 2)
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
