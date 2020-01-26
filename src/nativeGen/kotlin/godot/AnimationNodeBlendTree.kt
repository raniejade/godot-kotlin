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
    val ConnectionErrorConnectionExists: Int = 5

    val ConnectionErrorNoInput: Int = 1

    val ConnectionErrorNoInputIndex: Int = 2

    val ConnectionErrorNoOutput: Int = 3

    val ConnectionErrorSameNode: Int = 4

    val ConnectionOk: Int = 0

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
