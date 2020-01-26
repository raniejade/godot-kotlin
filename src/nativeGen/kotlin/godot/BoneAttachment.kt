// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BoneAttachment internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  companion object {
    fun new(): BoneAttachment = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("BoneAttachment".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton BoneAttachment" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      BoneAttachment(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for BoneAttachment
     */
    private object __method_bind {
      val get_bone_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoneAttachment".cstr.ptr,
              "get_bone_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_name" }
            }
          }

      val set_bone_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoneAttachment".cstr.ptr,
              "set_bone_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_name" }
            }
          }
    }
  }
}
