// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
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

open class PCKPacker(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addFile(pckPath: String, sourcePath: String): GDError {
    val _args = VariantArray.new()
    _args.append(pckPath)
    _args.append(sourcePath)
    val _ret = __method_bind.add_file.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun flush(verbose: Boolean): GDError {
    val _arg = Variant.new(verbose)
    val _ret = __method_bind.flush.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun pckStart(pckName: String, alignment: Int): GDError {
    val _args = VariantArray.new()
    _args.append(pckName)
    _args.append(alignment)
    val _ret = __method_bind.pck_start.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  companion object {
    fun new(): PCKPacker = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PCKPacker".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PCKPacker" }
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
      val add_file: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PCKPacker".cstr.ptr,
            "add_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_file" }
        }
      val flush: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PCKPacker".cstr.ptr,
            "flush".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method flush" }
        }
      val pck_start: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PCKPacker".cstr.ptr,
            "pck_start".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pck_start" }
        }}
  }
}
