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

open class Area2D internal constructor(
  _handle: COpaquePointer
) : CollisionObject2D(_handle) {
  enum class SpaceOverride(
    val value: Int
  ) {
    SPACE_OVERRIDE_DISABLED(0),

    SPACE_OVERRIDE_COMBINE(1),

    SPACE_OVERRIDE_COMBINE_REPLACE(2),

    SPACE_OVERRIDE_REPLACE(3),

    SPACE_OVERRIDE_REPLACE_COMBINE(4);
  }

  companion object {
    val SPACE_OVERRIDE_COMBINE: Int = 1

    val SPACE_OVERRIDE_COMBINE_REPLACE: Int = 2

    val SPACE_OVERRIDE_DISABLED: Int = 0

    val SPACE_OVERRIDE_REPLACE: Int = 3

    val SPACE_OVERRIDE_REPLACE_COMBINE: Int = 4

    fun new(): Area2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Area2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Area2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Area2D(
        fn()
      )
    }}
}
