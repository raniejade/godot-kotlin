// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.Plane
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Boolean
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

open class ImmediateGeometry(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : GeometryInstance(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addSphere(
    lats: Int,
    lons: Int,
    radius: Float,
    addUv: Boolean = true
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(lats)
      _args.add(lons)
      _args.add(radius)
      _args.add(addUv)
      __method_bind.addSphere.call(self._handle, _args, null)
    }
  }

  fun addVertex(position: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addVertex.call(self._handle, listOf(position), null)
    }
  }

  fun begin(primitive: Int, texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(primitive)
      _args.add(texture)
      __method_bind.begin.call(self._handle, _args, null)
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun end() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.end.call(self._handle, emptyList(), null)
    }
  }

  fun setColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setColor.call(self._handle, listOf(color), null)
    }
  }

  fun setNormal(normal: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNormal.call(self._handle, listOf(normal), null)
    }
  }

  fun setTangent(tangent: Plane) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTangent.call(self._handle, listOf(tangent), null)
    }
  }

  fun setUv(uv: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUv.call(self._handle, listOf(uv), null)
    }
  }

  fun setUv2(uv: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUv2.call(self._handle, listOf(uv), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ImmediateGeometry".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ImmediateGeometry" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ImmediateGeometry
     */
    private object __method_bind {
      val addSphere: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "add_sphere".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_sphere" }
            }
          }

      val addVertex: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "add_vertex".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_vertex" }
            }
          }

      val begin: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method begin" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val end: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method end" }
            }
          }

      val setColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }

      val setNormal: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "set_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normal" }
            }
          }

      val setTangent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "set_tangent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tangent" }
            }
          }

      val setUv: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "set_uv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_uv" }
            }
          }

      val setUv2: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
              "set_uv2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_uv2" }
            }
          }
    }
  }
}
