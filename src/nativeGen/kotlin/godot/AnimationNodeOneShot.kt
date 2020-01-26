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

open class AnimationNodeOneShot internal constructor(
  _handle: COpaquePointer
) : AnimationNode(_handle) {
  enum class MixMode(
    val value: Int
  ) {
    MIX_MODE_BLEND(0),

    MIX_MODE_ADD(1);
  }

  companion object {
    val MIX_MODE_ADD: Int = 1

    val MIX_MODE_BLEND: Int = 0

    fun new(): AnimationNodeOneShot = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeOneShot".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AnimationNodeOneShot" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeOneShot(
        fn()
      )
    }}
}
