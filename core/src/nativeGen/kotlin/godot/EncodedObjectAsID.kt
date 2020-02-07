// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
    _handle = __new()
  }

  fun getObjectId(): Int {
    val _ret = __method_bind.getObjectId.call(this._handle)
    return _ret.asInt()
  }

  fun setObjectId(id: Int) {
    val _arg = Variant(id)
    __method_bind.setObjectId.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
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
      val getObjectId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EncodedObjectAsID".cstr.ptr,
            "get_object_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_object_id" }
        }
      val setObjectId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EncodedObjectAsID".cstr.ptr,
            "set_object_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_object_id" }
        }}
  }
}
