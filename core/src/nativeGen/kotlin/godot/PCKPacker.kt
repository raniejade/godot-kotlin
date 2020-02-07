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
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PCKPacker(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun addFile(pckPath: String, sourcePath: String): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(pckPath))
    _args.add(Variant.fromAny(sourcePath))
    val _ret = __method_bind.addFile.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun flush(verbose: Boolean = false): GDError {
    val _arg = Variant(verbose)
    val _ret = __method_bind.flush.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun pckStart(pckName: String, alignment: Int = 0): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(pckName))
    _args.add(Variant.fromAny(alignment))
    val _ret = __method_bind.pckStart.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PCKPacker".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PCKPacker" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for PCKPacker
     */
    private object __method_bind {
      val addFile: CPointer<godot_method_bind>
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
      val pckStart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PCKPacker".cstr.ptr,
            "pck_start".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pck_start" }
        }}
  }
}
