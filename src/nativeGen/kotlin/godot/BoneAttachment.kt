// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BoneAttachment(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var boneName: String
    get() {
       return getBoneName() 
    }
    set(value) {
      setBoneName(value)
    }

  fun getBoneName(): String {
    val _ret = __method_bind.getBoneName.call(this._handle)
    return _ret.asString()
  }

  fun setBoneName(boneName: String) {
    val _arg = Variant.new(boneName)
    __method_bind.setBoneName.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): BoneAttachment = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("BoneAttachment".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BoneAttachment" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      BoneAttachment(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): BoneAttachment = BoneAttachment(ptr)
    /**
     * Container for method_bind pointers for BoneAttachment
     */
    private object __method_bind {
      val getBoneName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoneAttachment".cstr.ptr,
            "get_bone_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_name" }
        }
      val setBoneName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoneAttachment".cstr.ptr,
            "set_bone_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_name" }
        }}
  }
}
