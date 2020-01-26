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

open class ArrayMesh internal constructor(
  _handle: COpaquePointer
) : Mesh(_handle) {
  companion object {
    val ArrayBones: Int = 6

    val ArrayColor: Int = 3

    val ArrayFormatBones: Int = 64

    val ArrayFormatColor: Int = 8

    val ArrayFormatIndex: Int = 256

    val ArrayFormatNormal: Int = 2

    val ArrayFormatTangent: Int = 4

    val ArrayFormatTexUv: Int = 16

    val ArrayFormatTexUv2: Int = 32

    val ArrayFormatVertex: Int = 1

    val ArrayFormatWeights: Int = 128

    val ArrayIndex: Int = 8

    val ArrayMax: Int = 9

    val ArrayNormal: Int = 1

    val ArrayTangent: Int = 2

    val ArrayTexUv: Int = 4

    val ArrayTexUv2: Int = 5

    val ArrayVertex: Int = 0

    val ArrayWeights: Int = 7

    val ArrayWeightsSize: Int = 4

    val NoIndexArray: Int = -1

    fun new(): ArrayMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ArrayMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ArrayMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      ArrayMesh(
        fn()
      )
    }}
}
