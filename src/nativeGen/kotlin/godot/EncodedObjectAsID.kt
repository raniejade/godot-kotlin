// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EncodedObjectAsID(
  _handle: COpaquePointer
) : Reference(_handle) {
  var objectId: Int
    get() {
       return getObjectId() 
    }
    set(value) {
      setObjectId(value)
    }

  fun getObjectId(): Int {
    val _ret = __method_bind.getObjectId.call(this._handle)
    return _ret.asInt()
  }

  fun setObjectId(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.setObjectId.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): EncodedObjectAsID = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EncodedObjectAsID".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for EncodedObjectAsID" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EncodedObjectAsID(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EncodedObjectAsID = EncodedObjectAsID(ptr)
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
