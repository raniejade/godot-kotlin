// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class AnimationNodeAnimation(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AnimationRootNode(null) {
  var animation: String
    get() {
       return getAnimation() 
    }
    set(value) {
      setAnimation(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getAnimation(): String {
    val _ret = __method_bind.getAnimation.call(this._handle)
    return _ret.asString()
  }

  fun setAnimation(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setAnimation.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeAnimation".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeAnimation" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AnimationNodeAnimation
     */
    private object __method_bind {
      val getAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeAnimation".cstr.ptr,
            "get_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation" }
        }
      val setAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeAnimation".cstr.ptr,
            "set_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_animation" }
        }}
  }
}
