// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCullMode.call(self._handle, emptyList(), _retPtr)
      OccluderPolygon2D.CullMode.from(_ret.value)
    }
  }

  fun getPolygon(): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      __method_bind.getPolygon.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isClosed(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isClosed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setClosed(closed: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setClosed.call(self._handle, listOf(closed), null)
    }
  }

  fun setCullMode(cullMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCullMode.call(self._handle, listOf(cullMode), null)
    }
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPolygon.call(self._handle, listOf(polygon), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "get_cull_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cull_mode" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "get_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon" }
        }
      val isClosed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "is_closed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_closed" }
        }
      val setClosed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "set_closed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_closed" }
        }
      val setCullMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "set_cull_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cull_mode" }
        }
      val setPolygon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OccluderPolygon2D".cstr.ptr,
            "set_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_polygon" }
        }}
  }
}
