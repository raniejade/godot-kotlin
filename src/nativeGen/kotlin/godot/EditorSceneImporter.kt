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

open class EditorSceneImporter internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    val IMPORT_ANIMATION: Int = 2

    val IMPORT_ANIMATION_DETECT_LOOP: Int = 4

    val IMPORT_ANIMATION_FORCE_ALL_TRACKS_IN_ALL_CLIPS: Int = 16

    val IMPORT_ANIMATION_KEEP_VALUE_TRACKS: Int = 32

    val IMPORT_ANIMATION_OPTIMIZE: Int = 8

    val IMPORT_FAIL_ON_MISSING_DEPENDENCIES: Int = 512

    val IMPORT_GENERATE_TANGENT_ARRAYS: Int = 256

    val IMPORT_MATERIALS_IN_INSTANCES: Int = 1024

    val IMPORT_SCENE: Int = 1

    val IMPORT_USE_COMPRESSION: Int = 2048

    fun new(): EditorSceneImporter = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorSceneImporter".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for EditorSceneImporter" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorSceneImporter(
        fn()
      )
    }}
}
