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

open class EncodedObjectAsID internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getObjectId(): Int {
    val _ret = __method_bind.get_object_id.call(this.toVariant())
    TODO()
  }

  fun setObjectId(id: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.set_object_id.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): EncodedObjectAsID = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EncodedObjectAsID".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EncodedObjectAsID" }
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
      val get_object_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EncodedObjectAsID".cstr.ptr,
              "get_object_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_object_id" }
            }
          }

      val set_object_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EncodedObjectAsID".cstr.ptr,
              "set_object_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_object_id" }
            }
          }
    }
  }
}
