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
  enum class ClearMode(
    val value: Int
  ) {
    CLEAR_MODE_ALWAYS(0),

    CLEAR_MODE_NEVER(1),

    CLEAR_MODE_ONLY_NEXT_FRAME(2);
  }

  enum class RenderInfo(
    val value: Int
  ) {
    RENDER_INFO_OBJECTS_IN_FRAME(0),

    RENDER_INFO_VERTICES_IN_FRAME(1),

    RENDER_INFO_MATERIAL_CHANGES_IN_FRAME(2),

    RENDER_INFO_SHADER_CHANGES_IN_FRAME(3),

    RENDER_INFO_SURFACE_CHANGES_IN_FRAME(4),

    RENDER_INFO_DRAW_CALLS_IN_FRAME(5),

    RENDER_INFO_MAX(6);
  }

  enum class Usage(
    val value: Int
  ) {
    USAGE_2D(0),

    USAGE_2D_NO_SAMPLING(1),

    USAGE_3D(2),

    USAGE_3D_NO_EFFECTS(3);
  }

  enum class DebugDraw(
    val value: Int
  ) {
    DEBUG_DRAW_DISABLED(0),

    DEBUG_DRAW_UNSHADED(1),

    DEBUG_DRAW_OVERDRAW(2),

    DEBUG_DRAW_WIREFRAME(3);
  }

  enum class ShadowAtlasQuadrantSubdiv(
    val value: Int
  ) {
    SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED(0),

    SHADOW_ATLAS_QUADRANT_SUBDIV_1(1),

    SHADOW_ATLAS_QUADRANT_SUBDIV_4(2),

    SHADOW_ATLAS_QUADRANT_SUBDIV_16(3),

    SHADOW_ATLAS_QUADRANT_SUBDIV_64(4),

    SHADOW_ATLAS_QUADRANT_SUBDIV_256(5),

    SHADOW_ATLAS_QUADRANT_SUBDIV_1024(6),

    SHADOW_ATLAS_QUADRANT_SUBDIV_MAX(7);
  }

  enum class UpdateMode(
    val value: Int
  ) {
    UPDATE_DISABLED(0),

    UPDATE_ONCE(1),

    UPDATE_WHEN_VISIBLE(2),

    UPDATE_ALWAYS(3);
  }

  enum class MSAA(
    val value: Int
  ) {
    MSAA_DISABLED(0),

    MSAA_2X(1),

    MSAA_4X(2),

    MSAA_8X(3),

    MSAA_16X(4);
  }

  companion object {
    val CLEAR_MODE_ALWAYS: Int = 0

    val CLEAR_MODE_NEVER: Int = 1

    val CLEAR_MODE_ONLY_NEXT_FRAME: Int = 2

    val DEBUG_DRAW_DISABLED: Int = 0

    val DEBUG_DRAW_OVERDRAW: Int = 2

    val DEBUG_DRAW_UNSHADED: Int = 1

    val DEBUG_DRAW_WIREFRAME: Int = 3

    val MSAA_16X: Int = 4

    val MSAA_2X: Int = 1

    val MSAA_4X: Int = 2

    val MSAA_8X: Int = 3

    val MSAA_DISABLED: Int = 0

    val RENDER_INFO_DRAW_CALLS_IN_FRAME: Int = 5

    val RENDER_INFO_MATERIAL_CHANGES_IN_FRAME: Int = 2

    val RENDER_INFO_MAX: Int = 6

    val RENDER_INFO_OBJECTS_IN_FRAME: Int = 0

    val RENDER_INFO_SHADER_CHANGES_IN_FRAME: Int = 3

    val RENDER_INFO_SURFACE_CHANGES_IN_FRAME: Int = 4

    val RENDER_INFO_VERTICES_IN_FRAME: Int = 1

    val SHADOW_ATLAS_QUADRANT_SUBDIV_1: Int = 1

    val SHADOW_ATLAS_QUADRANT_SUBDIV_1024: Int = 6

    val SHADOW_ATLAS_QUADRANT_SUBDIV_16: Int = 3

    val SHADOW_ATLAS_QUADRANT_SUBDIV_256: Int = 5

    val SHADOW_ATLAS_QUADRANT_SUBDIV_4: Int = 2

    val SHADOW_ATLAS_QUADRANT_SUBDIV_64: Int = 4

    val SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED: Int = 0

    val SHADOW_ATLAS_QUADRANT_SUBDIV_MAX: Int = 7

    val UPDATE_ALWAYS: Int = 3

    val UPDATE_DISABLED: Int = 0

    val UPDATE_ONCE: Int = 1

    val UPDATE_WHEN_VISIBLE: Int = 2

    val USAGE_2D: Int = 0

    val USAGE_2D_NO_SAMPLING: Int = 1

    val USAGE_3D: Int = 2

    val USAGE_3D_NO_EFFECTS: Int = 3

    fun new(): Viewport = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Viewport".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Viewport" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Viewport(
        fn()
      )
    }}
}
