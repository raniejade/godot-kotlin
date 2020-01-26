// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorSceneImporter internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun importAnimationFromOtherImporter(
    path: String,
    flags: Int,
    bake_fps: Int
  ): Animation {
    TODO()
  }

  fun importSceneFromOtherImporter(
    path: String,
    flags: Int,
    bake_fps: Int
  ): Node {
    TODO()
  }

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
      requireNotNull(fnPtr) { "No instance found for singleton EditorSceneImporter" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorSceneImporter(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorSceneImporter
     */
    private object __method_bind {
      val import_animation_from_other_importer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSceneImporter".cstr.ptr,
              "import_animation_from_other_importer".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method import_animation_from_other_importer" }
            }
          }

      val import_scene_from_other_importer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSceneImporter".cstr.ptr,
              "import_scene_from_other_importer".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method import_scene_from_other_importer" }
            }
          }
    }
  }
}
