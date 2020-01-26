// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeOutput internal constructor(
  _handle: COpaquePointer
) : AnimationNode(_handle) {
  companion object {
    fun new(): AnimationNodeOutput = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeOutput".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationNodeOutput" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeOutput(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeOutput = AnimationNodeOutput(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeOutput
     */
    private object __method_bind
  }
}
