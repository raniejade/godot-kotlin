// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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

open class PackedDataContainerRef(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _is_dictionary(): Boolean {
    TODO()
  }

  open fun _iter_get(arg0: Variant): Variant {
    TODO()
  }

  open fun _iter_init(arg0: VariantArray): Variant {
    TODO()
  }

  open fun _iter_next(arg0: VariantArray): Variant {
    TODO()
  }

  fun size(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.size.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for PackedDataContainerRef
     */
    private object __method_bind {
      val size: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedDataContainerRef".cstr.ptr,
              "size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method size" }
            }
          }
    }
  }
}
