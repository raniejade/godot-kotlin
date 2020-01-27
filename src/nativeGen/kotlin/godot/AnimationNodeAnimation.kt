// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeAnimation(
  _handle: COpaquePointer
) : AnimationRootNode(_handle) {
  fun getAnimation(): String {
    val _ret = __method_bind.get_animation.call(this._handle)
    return _ret.asString()
  }

  fun setAnimation(name: String) {
    val _arg = Variant.new(name)
    __method_bind.set_animation.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AnimationNodeAnimation = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeAnimation".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeAnimation" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeAnimation(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeAnimation = AnimationNodeAnimation(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeAnimation
     */
    private object __method_bind {
      val get_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeAnimation".cstr.ptr,
            "get_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation" }
        }
      val set_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeAnimation".cstr.ptr,
            "set_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_animation" }
        }}
  }
}
