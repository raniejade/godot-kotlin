// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class OccluderPolygon2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var closed: Boolean
    get() {
       return isClosed() 
    }
    set(value) {
      setClosed(value)
    }

  var cullMode: CullMode
    get() {
       return getCullMode() 
    }
    set(value) {
      setCullMode(value.value)
    }

  var polygon: PoolVector2Array
    get() {
       return getPolygon() 
    }
    set(value) {
      setPolygon(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for polygon
   */
  fun polygon(cb: PoolVector2Array.() -> Unit) {
    val _p = polygon
    cb(_p)
    polygon = _p
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
    __method_bind.setClosed.call(this._handle, listOf(_arg))
  }

  fun setCullMode(cullMode: Int) {
    val _arg = Variant.new(cullMode)
    __method_bind.setCullMode.call(this._handle, listOf(_arg))
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val _arg = Variant.new(polygon)
    __method_bind.setPolygon.call(this._handle, listOf(_arg))
  }

  enum class CullMode(
    val value: Int
  ) {
    DISABLED(0),

    CLOCKWISE(1),

    COUNTER_CLOCKWISE(2);

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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("OccluderPolygon2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for OccluderPolygon2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for OccluderPolygon2D
     */
    private object __method_bind {
      val getCullMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "get_cull_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cull_mode" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "get_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon" }
        }
      val isClosed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "is_closed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_closed" }
        }
      val setClosed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "set_closed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_closed" }
        }
      val setCullMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "set_cull_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cull_mode" }
        }
      val setPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "set_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_polygon" }
        }}
  }
}
