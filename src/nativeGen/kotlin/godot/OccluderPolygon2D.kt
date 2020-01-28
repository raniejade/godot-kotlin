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
  var closed: Boolean
    get() {
       return isClosed() 
    }
    set(value) {
      setClosed(value)
    }

  var cullMode: Int
    get() {
       return OccluderPolygon2D.CullMode.from(getCullMode()) 
    }
    set(value) {
      setCullMode(OccluderPolygon2D.CullMode.from(value))
    }

  var polygon: PoolVector2Array
    get() {
       return getPolygon() 
    }
    set(value) {
      setPolygon(value)
    }

  fun getCullMode(): CullMode {
    val _ret = __method_bind.getCullMode.call(this._handle)
    return OccluderPolygon2D.CullMode.from(_ret.asInt())
  }

  fun getPolygon(): PoolVector2Array {
    val _ret = __method_bind.getPolygon.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun isClosed(): Boolean {
    val _ret = __method_bind.isClosed.call(this._handle)
    return _ret.asBoolean()
  }

  fun setClosed(closed: Boolean) {
    val _arg = Variant.new(closed)
    __method_bind.setClosed.call(this._handle, _arg, 1)
  }

  fun setCullMode(cullMode: Int) {
    val _arg = Variant.new(cullMode)
    __method_bind.setCullMode.call(this._handle, _arg, 1)
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val _arg = Variant.new(polygon)
    __method_bind.setPolygon.call(this._handle, _arg, 1)
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
      val getCullMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "getCullMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCullMode" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "getPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPolygon" }
        }
      val isClosed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "isClosed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isClosed" }
        }
      val setClosed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "setClosed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setClosed" }
        }
      val setCullMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "setCullMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCullMode" }
        }
      val setPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "setPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPolygon" }
        }}
  }
}
