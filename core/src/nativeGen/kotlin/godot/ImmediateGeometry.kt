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
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ImmediateGeometry(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  fun addSphere(
    lats: Int,
    lons: Int,
    radius: Float,
    addUv: Boolean = true
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(lats))
    _args.add(Variant.fromAny(lons))
    _args.add(Variant.fromAny(radius))
    _args.add(Variant.fromAny(addUv))
    __method_bind.addSphere.call(this._handle, _args)
  }

  fun addVertex(position: Vector3) {
    val _arg = Variant.new(position)
    __method_bind.addVertex.call(this._handle, listOf(_arg))
  }

  fun begin(primitive: Int, texture: Texture) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(primitive))
    _args.add(Variant.fromAny(texture))
    __method_bind.begin.call(this._handle, _args)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun end() {
    __method_bind.end.call(this._handle)
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setColor.call(this._handle, listOf(_arg))
  }

  fun setNormal(normal: Vector3) {
    val _arg = Variant.new(normal)
    __method_bind.setNormal.call(this._handle, listOf(_arg))
  }

  fun setTangent(tangent: Plane) {
    val _arg = Variant.new(tangent)
    __method_bind.setTangent.call(this._handle, listOf(_arg))
  }

  fun setUv(uv: Vector2) {
    val _arg = Variant.new(uv)
    __method_bind.setUv.call(this._handle, listOf(_arg))
  }

  fun setUv2(uv: Vector2) {
    val _arg = Variant.new(uv)
    __method_bind.setUv2.call(this._handle, listOf(_arg))
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
      val addSphere: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "add_sphere".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_sphere" }
        }
      val addVertex: CPointer<godot_method_bind>
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
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "set_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normal" }
        }
      val setTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "set_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tangent" }
        }
      val setUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "set_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uv" }
        }
      val setUv2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ImmediateGeometry".cstr.ptr,
            "set_uv2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uv2" }
        }}
  }
}
