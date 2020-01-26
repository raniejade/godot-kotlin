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

open class Viewport internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  companion object {
    val ClearModeAlways: Int = 0

    val ClearModeNever: Int = 1

    val ClearModeOnlyNextFrame: Int = 2

    val DebugDrawDisabled: Int = 0

    val DebugDrawOverdraw: Int = 2

    val DebugDrawUnshaded: Int = 1

    val DebugDrawWireframe: Int = 3

    val Msaa16x: Int = 4

    val Msaa2x: Int = 1

    val Msaa4x: Int = 2

    val Msaa8x: Int = 3

    val MsaaDisabled: Int = 0

    val RenderInfoDrawCallsInFrame: Int = 5

    val RenderInfoMaterialChangesInFrame: Int = 2

    val RenderInfoMax: Int = 6

    val RenderInfoObjectsInFrame: Int = 0

    val RenderInfoShaderChangesInFrame: Int = 3

    val RenderInfoSurfaceChangesInFrame: Int = 4

    val RenderInfoVerticesInFrame: Int = 1

    val ShadowAtlasQuadrantSubdiv1: Int = 1

    val ShadowAtlasQuadrantSubdiv1024: Int = 6

    val ShadowAtlasQuadrantSubdiv16: Int = 3

    val ShadowAtlasQuadrantSubdiv256: Int = 5

    val ShadowAtlasQuadrantSubdiv4: Int = 2

    val ShadowAtlasQuadrantSubdiv64: Int = 4

    val ShadowAtlasQuadrantSubdivDisabled: Int = 0

    val ShadowAtlasQuadrantSubdivMax: Int = 7

    val UpdateAlways: Int = 3

    val UpdateDisabled: Int = 0

    val UpdateOnce: Int = 1

    val UpdateWhenVisible: Int = 2

    val Usage2d: Int = 0

    val Usage2dNoSampling: Int = 1

    val Usage3d: Int = 2

    val Usage3dNoEffects: Int = 3

    fun new(): Viewport = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Viewport".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Viewport" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      Viewport(
        fn()
      )
    }}
}
