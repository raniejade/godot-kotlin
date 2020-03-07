// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class EncodedObjectAsID(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  var objectId: Int
    get() {
       return getObjectId() 
    }
    set(value) {
      setObjectId(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getObjectId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getObjectId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setObjectId(id: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setObjectId.call(self._handle, listOf(id), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EncodedObjectAsID".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for EncodedObjectAsID" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for EncodedObjectAsID
     */
    private object __method_bind {
      val getObjectId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EncodedObjectAsID".cstr.ptr,
              "get_object_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_object_id" }
            }
          }

      val setObjectId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EncodedObjectAsID".cstr.ptr,
              "set_object_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_object_id" }
            }
          }
    }
  }
}
