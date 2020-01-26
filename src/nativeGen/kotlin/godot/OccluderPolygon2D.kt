// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector2Array
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class OccluderPolygon2D internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getCullMode(): OccluderPolygon2D.CullMode {
    TODO()
  }

  fun getPolygon(): PoolVector2Array {
    TODO()
  }

  fun isClosed(): Boolean {
    TODO()
  }

  fun setClosed() {
    TODO()
  }

  fun setCullMode() {
    TODO()
  }

  fun setPolygon() {
    TODO()
  }

  enum class CullMode(
    val value: Int
  ) {
    CULL_DISABLED(0),

    CULL_CLOCKWISE(1),

    CULL_COUNTER_CLOCKWISE(2);
  }

  companion object {
    val CULL_CLOCKWISE: Int = 1

    val CULL_COUNTER_CLOCKWISE: Int = 2

    val CULL_DISABLED: Int = 0

    fun new(): OccluderPolygon2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("OccluderPolygon2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton OccluderPolygon2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      OccluderPolygon2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for OccluderPolygon2D
     */
    private object __method_bind {
      val get_cull_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
              "get_cull_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cull_mode" }
            }
          }

      val get_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
              "get_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_polygon" }
            }
          }

      val is_closed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
              "is_closed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_closed" }
            }
          }

      val set_closed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
              "set_closed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_closed" }
            }
          }

      val set_cull_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
              "set_cull_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cull_mode" }
            }
          }

      val set_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
              "set_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_polygon" }
            }
          }
    }
  }
}
