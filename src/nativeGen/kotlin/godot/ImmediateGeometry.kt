// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Plane
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ImmediateGeometry internal constructor(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  fun addSphere(
    lats: Int,
    lons: Int,
    radius: Float,
    add_uv: Boolean
  ) {
    TODO()
  }

  fun addVertex(position: Vector3) {
    TODO()
  }

  fun begin(primitive: Int, texture: Texture) {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun end() {
    TODO()
  }

  fun setColor(color: Color) {
    TODO()
  }

  fun setNormal(normal: Vector3) {
    TODO()
  }

  fun setTangent(tangent: Plane) {
    TODO()
  }

  fun setUv(uv: Vector2) {
    TODO()
  }

  fun setUv2(uv: Vector2) {
    TODO()
  }

  companion object {
    fun new(): ImmediateGeometry = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ImmediateGeometry".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ImmediateGeometry" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ImmediateGeometry(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ImmediateGeometry
     */
    private object __method_bind {
      val add_sphere: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "add_sphere".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_sphere" }
            }
          }

      val add_vertex: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "add_vertex".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_vertex" }
            }
          }

      val begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method begin" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method end" }
            }
          }

      val set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }

      val set_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "set_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normal" }
            }
          }

      val set_tangent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "set_tangent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tangent" }
            }
          }

      val set_uv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "set_uv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_uv" }
            }
          }

      val set_uv2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "set_uv2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_uv2" }
            }
          }
    }
  }
}
