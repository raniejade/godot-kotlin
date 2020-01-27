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

open class AnimationNodeTimeSeek internal constructor(
  _handle: COpaquePointer
) : AnimationNode(_handle) {
  companion object {
    fun new(): AnimationNodeTimeSeek = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeTimeSeek".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationNodeTimeSeek" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeTimeSeek(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeTimeSeek = AnimationNodeTimeSeek(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeTimeSeek
     */
    private object __method_bind
  }
}
