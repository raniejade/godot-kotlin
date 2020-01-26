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

open class AnimationRootNode internal constructor(
  _handle: COpaquePointer
) : AnimationNode(_handle) {
  companion object {
    fun new(): AnimationRootNode = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationRootNode".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationRootNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationRootNode(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AnimationRootNode
     */
    private object __method_bind
  }
}
