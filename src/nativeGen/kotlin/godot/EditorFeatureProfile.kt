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

open class EditorFeatureProfile internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    val Feature3d: Int = 0

    val FeatureAssetLib: Int = 2

    val FeatureFilesystemDock: Int = 6

    val FeatureImportDock: Int = 4

    val FeatureMax: Int = 7

    val FeatureNodeDock: Int = 5

    val FeatureSceneTree: Int = 3

    val FeatureScript: Int = 1

    fun new(): EditorFeatureProfile = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorFeatureProfile".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for EditorFeatureProfile" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      EditorFeatureProfile(
        fn()
      )
    }}
}
