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
    val ImportAnimation: Int = 2

    val ImportAnimationDetectLoop: Int = 4

    val ImportAnimationForceAllTracksInAllClips: Int = 16

    val ImportAnimationKeepValueTracks: Int = 32

    val ImportAnimationOptimize: Int = 8

    val ImportFailOnMissingDependencies: Int = 512

    val ImportGenerateTangentArrays: Int = 256

    val ImportMaterialsInInstances: Int = 1024

    val ImportScene: Int = 1

    val ImportUseCompression: Int = 2048

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
