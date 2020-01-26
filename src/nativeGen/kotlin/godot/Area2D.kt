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
  companion object {
    val SpaceOverrideCombine: Int = 1

    val SpaceOverrideCombineReplace: Int = 2

    val SpaceOverrideDisabled: Int = 0

    val SpaceOverrideReplace: Int = 3

    val SpaceOverrideReplaceCombine: Int = 4

    fun new(): Area2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Area2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Area2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Area2D(
        fn()
      )
    }}
}
