// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Performance(
  _handle: COpaquePointer
) : Object(_handle) {
  fun getMonitor(monitor: Int): Float {
    val _arg = Variant.new(monitor)
    val _ret = __method_bind.getMonitor.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  enum class Monitor(
    val value: Int
  ) {
    TIME_FPS(0),

    TIME_PROCESS(1),

    TIME_PHYSICS_PROCESS(2),

    MEMORY_STATIC(3),

    MEMORY_DYNAMIC(4),

    MEMORY_STATIC_MAX(5),

    MEMORY_DYNAMIC_MAX(6),

    MEMORY_MESSAGE_BUFFER_MAX(7),

    OBJECT_COUNT(8),

    OBJECT_RESOURCE_COUNT(9),

    OBJECT_NODE_COUNT(10),

    OBJECT_ORPHAN_NODE_COUNT(11),

    RENDER_OBJECTS_IN_FRAME(12),

    RENDER_VERTICES_IN_FRAME(13),

    RENDER_MATERIAL_CHANGES_IN_FRAME(14),

    RENDER_SHADER_CHANGES_IN_FRAME(15),

    RENDER_SURFACE_CHANGES_IN_FRAME(16),

    RENDER_DRAW_CALLS_IN_FRAME(17),

    RENDER_VIDEO_MEM_USED(18),

    RENDER_TEXTURE_MEM_USED(19),

    RENDER_VERTEX_MEM_USED(20),

    RENDER_USAGE_VIDEO_MEM_TOTAL(21),

    PHYSICS_2D_ACTIVE_OBJECTS(22),

    PHYSICS_2D_COLLISION_PAIRS(23),

    PHYSICS_2D_ISLAND_COUNT(24),

    PHYSICS_3D_ACTIVE_OBJECTS(25),

    PHYSICS_3D_COLLISION_PAIRS(26),

    PHYSICS_3D_ISLAND_COUNT(27),

    AUDIO_OUTPUT_LATENCY(28),

    MONITOR_MAX(29);

    companion object {
      fun from(value: Int): Monitor {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val Instance: Performance
      get() = memScoped {
        val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("Performance".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton Performance" }
        Performance(
          handle
        )
      }
    val AUDIO_OUTPUT_LATENCY: Int = 28

    val MEMORY_DYNAMIC: Int = 4

    val MEMORY_DYNAMIC_MAX: Int = 6

    val MEMORY_MESSAGE_BUFFER_MAX: Int = 7

    val MEMORY_STATIC: Int = 3

    val MEMORY_STATIC_MAX: Int = 5

    val MONITOR_MAX: Int = 29

    val OBJECT_COUNT: Int = 8

    val OBJECT_NODE_COUNT: Int = 10

    val OBJECT_ORPHAN_NODE_COUNT: Int = 11

    val OBJECT_RESOURCE_COUNT: Int = 9

    val PHYSICS_2D_ACTIVE_OBJECTS: Int = 22

    val PHYSICS_2D_COLLISION_PAIRS: Int = 23

    val PHYSICS_2D_ISLAND_COUNT: Int = 24

    val PHYSICS_3D_ACTIVE_OBJECTS: Int = 25

    val PHYSICS_3D_COLLISION_PAIRS: Int = 26

    val PHYSICS_3D_ISLAND_COUNT: Int = 27

    val RENDER_DRAW_CALLS_IN_FRAME: Int = 17

    val RENDER_MATERIAL_CHANGES_IN_FRAME: Int = 14

    val RENDER_OBJECTS_IN_FRAME: Int = 12

    val RENDER_SHADER_CHANGES_IN_FRAME: Int = 15

    val RENDER_SURFACE_CHANGES_IN_FRAME: Int = 16

    val RENDER_TEXTURE_MEM_USED: Int = 19

    val RENDER_USAGE_VIDEO_MEM_TOTAL: Int = 21

    val RENDER_VERTEX_MEM_USED: Int = 20

    val RENDER_VERTICES_IN_FRAME: Int = 13

    val RENDER_VIDEO_MEM_USED: Int = 18

    val TIME_FPS: Int = 0

    val TIME_PHYSICS_PROCESS: Int = 2

    val TIME_PROCESS: Int = 1

    /**
     * Container for method_bind pointers for Performance
     */
    private object __method_bind {
      val getMonitor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Performance".cstr.ptr,
            "get_monitor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_monitor" }
        }}
  }
}
