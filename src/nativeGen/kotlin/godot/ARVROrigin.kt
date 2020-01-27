// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ARVROrigin internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getWorldScale(): Float {
    val _ret = __method_bind.get_world_scale.call(this.toVariant())
    return _ret.asFloat()
  }

  fun setWorldScale(worldScale: Float) {
    val _arg = Variant.new(worldScale)
    __method_bind.set_world_scale.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): ARVROrigin = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ARVROrigin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ARVROrigin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ARVROrigin(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ARVROrigin = ARVROrigin(ptr)
    /**
     * Container for method_bind pointers for ARVROrigin
     */
    private object __method_bind {
      val get_world_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVROrigin".cstr.ptr,
            "get_world_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_world_scale" }
        }
      val set_world_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVROrigin".cstr.ptr,
            "set_world_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_world_scale" }
        }}
  }
}
