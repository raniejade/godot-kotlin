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

open class AnimationNodeBlendSpace2D internal constructor(
  _handle: COpaquePointer
) : AnimationRootNode(_handle) {
  enum class BlendMode(
    val value: Int
  ) {
    BLEND_MODE_INTERPOLATED(0),

    BLEND_MODE_DISCRETE(1),

    BLEND_MODE_DISCRETE_CARRY(2);
  }

  companion object {
    val BLEND_MODE_DISCRETE: Int = 1

    val BLEND_MODE_DISCRETE_CARRY: Int = 2

    val BLEND_MODE_INTERPOLATED: Int = 0

    fun new(): AnimationNodeBlendSpace2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeBlendSpace2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AnimationNodeBlendSpace2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeBlendSpace2D(
        fn()
      )
    }}
}
