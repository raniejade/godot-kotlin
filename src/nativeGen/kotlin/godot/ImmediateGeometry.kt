// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
    addUv: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(lats)
    _args.append(lons)
    _args.append(radius)
    _args.append(addUv)
    __method_bind.add_sphere.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun addVertex(position: Vector3) {
    val _arg = Variant.new(position)
    __method_bind.add_vertex.call(this.toVariant(), _arg, 1)
  }

  fun begin(primitive: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(primitive)
    _args.append(texture)
    __method_bind.begin.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun clear() {
    __method_bind.clear.call(this.toVariant())
  }

  fun end() {
    __method_bind.end.call(this.toVariant())
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.set_color.call(this.toVariant(), _arg, 1)
  }

  fun setNormal(normal: Vector3) {
    val _arg = Variant.new(normal)
    __method_bind.set_normal.call(this.toVariant(), _arg, 1)
  }

  fun setTangent(tangent: Plane) {
    val _arg = Variant.new(tangent)
    __method_bind.set_tangent.call(this.toVariant(), _arg, 1)
  }

  fun setUv(uv: Vector2) {
    val _arg = Variant.new(uv)
    __method_bind.set_uv.call(this.toVariant(), _arg, 1)
  }

  fun setUv2(uv: Vector2) {
    val _arg = Variant.new(uv)
    __method_bind.set_uv2.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): ImmediateGeometry = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ImmediateGeometry".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ImmediateGeometry" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ImmediateGeometry(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ImmediateGeometry = ImmediateGeometry(ptr)
    /**
     * Container for method_bind pointers for ImmediateGeometry
     */
    private object __method_bind {
      val add_sphere: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "add_sphere".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_sphere" }
        }
      val add_vertex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "add_vertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_vertex" }
        }
      val begin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method begin" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val end: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method end" }
        }
      val set_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val set_normal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "set_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normal" }
        }
      val set_tangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "set_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tangent" }
        }
      val set_uv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "set_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uv" }
        }
      val set_uv2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "set_uv2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uv2" }
        }}
  }
}
