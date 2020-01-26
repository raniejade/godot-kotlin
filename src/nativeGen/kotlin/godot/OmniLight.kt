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

open class OmniLight internal constructor(
  _handle: COpaquePointer
) : Light(_handle) {
  enum class ShadowMode(
    val value: Int
  ) {
    SHADOW_DUAL_PARABOLOID(0),

    SHADOW_CUBE(1);
  }

  enum class ShadowDetail(
    val value: Int
  ) {
    SHADOW_DETAIL_VERTICAL(0),

    SHADOW_DETAIL_HORIZONTAL(1);
  }

  companion object {
    val SHADOW_CUBE: Int = 1

    val SHADOW_DETAIL_HORIZONTAL: Int = 1

    val SHADOW_DETAIL_VERTICAL: Int = 0

    val SHADOW_DUAL_PARABOLOID: Int = 0

    fun new(): OmniLight = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("OmniLight".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for OmniLight" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      OmniLight(
        fn()
      )
    }}
}
