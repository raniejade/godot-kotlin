// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeBlendTree internal constructor(
  _handle: COpaquePointer
) : AnimationRootNode(_handle) {
  companion object {
    val CONNECTION_ERROR_CONNECTION_EXISTS: Int = 5

    val CONNECTION_ERROR_NO_INPUT: Int = 1

    val CONNECTION_ERROR_NO_INPUT_INDEX: Int = 2

    val CONNECTION_ERROR_NO_OUTPUT: Int = 3

    val CONNECTION_ERROR_SAME_NODE: Int = 4

    val CONNECTION_OK: Int = 0

    fun new(): AnimationNodeBlendTree = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeBlendTree".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AnimationNodeBlendTree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeBlendTree(
        fn()
      )
    }}
}
