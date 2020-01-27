// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class OccluderPolygon2D(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getCullMode(): CullMode {
    val _ret = __method_bind.get_cull_mode.call(this._handle)
    return OccluderPolygon2D.CullMode.from(_ret.asInt())
  }

  fun getPolygon(): PoolVector2Array {
    val _ret = __method_bind.get_polygon.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun isClosed(): Boolean {
    val _ret = __method_bind.is_closed.call(this._handle)
    return _ret.asBool()
  }

  fun setClosed(closed: Boolean) {
    val _arg = Variant.new(closed)
    __method_bind.set_closed.call(this._handle, _arg, 1)
  }

  fun setCullMode(cullMode: Int) {
    val _arg = Variant.new(cullMode)
    __method_bind.set_cull_mode.call(this._handle, _arg, 1)
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val _arg = Variant.new(polygon)
    __method_bind.set_polygon.call(this._handle, _arg, 1)
  }

  enum class CullMode(
    val value: Int
  ) {
    CULL_DISABLED(0),

    CULL_CLOCKWISE(1),

    CULL_COUNTER_CLOCKWISE(2);

    companion object {
      fun from(value: Int): CullMode {
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
    val CULL_CLOCKWISE: Int = 1

    val CULL_COUNTER_CLOCKWISE: Int = 2

    val CULL_DISABLED: Int = 0

    fun new(): OccluderPolygon2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("OccluderPolygon2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for OccluderPolygon2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      OccluderPolygon2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): OccluderPolygon2D = OccluderPolygon2D(ptr)
    /**
     * Container for method_bind pointers for OccluderPolygon2D
     */
    private object __method_bind {
      val get_cull_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "get_cull_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cull_mode" }
        }
      val get_polygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "get_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon" }
        }
      val is_closed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "is_closed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_closed" }
        }
      val set_closed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "set_closed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_closed" }
        }
      val set_cull_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "set_cull_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cull_mode" }
        }
      val set_polygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "set_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_polygon" }
        }}
  }
}
