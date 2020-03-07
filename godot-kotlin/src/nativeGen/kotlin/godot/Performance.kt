// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class PerformanceInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun getMonitor(monitor: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMonitor.call(self._handle, listOf(monitor), _retPtr)
      _ret.value.toFloat()
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for Performance
     */
    private object __method_bind {
      val getMonitor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Performance".cstr.ptr,
              "get_monitor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_monitor" }
            }
          }
    }
  }
}

object Performance : PerformanceInternal(null) {
  init {
    Allocator.allocationScope {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("Performance".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton Performance" }
      _handle = handle
    }
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

    MAX(29);

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
}
