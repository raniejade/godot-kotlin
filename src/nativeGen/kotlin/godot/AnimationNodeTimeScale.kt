// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeTimeScale internal constructor(
  _handle: COpaquePointer
) : AnimationNode(_handle) {
  companion object {
    fun new(): AnimationNodeTimeScale = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeTimeScale".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeTimeScale" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeTimeScale(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeTimeScale = AnimationNodeTimeScale(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeTimeScale
     */
    private object __method_bind
  }
}
