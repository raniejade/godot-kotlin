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
  enum class Feature(
    val value: Int
  ) {
    FEATURE_3D(0),

    FEATURE_SCRIPT(1),

    FEATURE_ASSET_LIB(2),

    FEATURE_SCENE_TREE(3),

    FEATURE_IMPORT_DOCK(4),

    FEATURE_NODE_DOCK(5),

    FEATURE_FILESYSTEM_DOCK(6),

    FEATURE_MAX(7);
  }

  companion object {
    val FEATURE_3D: Int = 0

    val FEATURE_ASSET_LIB: Int = 2

    val FEATURE_FILESYSTEM_DOCK: Int = 6

    val FEATURE_IMPORT_DOCK: Int = 4

    val FEATURE_MAX: Int = 7

    val FEATURE_NODE_DOCK: Int = 5

    val FEATURE_SCENE_TREE: Int = 3

    val FEATURE_SCRIPT: Int = 1

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
