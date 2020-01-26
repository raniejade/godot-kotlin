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

open class MultiMesh internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    val Color8bit: Int = 1

    val ColorFloat: Int = 2

    val ColorNone: Int = 0

    val CustomData8bit: Int = 1

    val CustomDataFloat: Int = 2

    val CustomDataNone: Int = 0

    val Transform2d: Int = 0

    val Transform3d: Int = 1

    fun new(): MultiMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MultiMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for MultiMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MultiMesh(
        fn()
      )
    }}
}
