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

open class AnimationTrackEditPlugin internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): AnimationTrackEditPlugin = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationTrackEditPlugin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationTrackEditPlugin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationTrackEditPlugin(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationTrackEditPlugin = AnimationTrackEditPlugin(ptr)
    /**
     * Container for method_bind pointers for AnimationTrackEditPlugin
     */
    private object __method_bind
  }
}
