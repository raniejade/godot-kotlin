// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class PCKPacker(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addFile(pckPath: String, sourcePath: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(pckPath)
      _args.add(sourcePath)
      __method_bind.addFile.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun flush(verbose: Boolean = false): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.flush.call(self._handle, listOf(verbose), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun pckStart(pckName: String, alignment: Int = 0): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(pckName)
      _args.add(alignment)
      __method_bind.pckStart.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PCKPacker".cstr.ptr,
            "add_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_file" }
        }
      val flush: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PCKPacker".cstr.ptr,
            "flush".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method flush" }
        }
      val pckStart: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PCKPacker".cstr.ptr,
            "pck_start".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pck_start" }
        }}
  }
}
