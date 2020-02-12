// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolFloatArray
import godot.core.Variant
import godot.core.VariantArray
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

open class HeightMapShape(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Shape(null) {
  var mapData: PoolFloatArray
    get() {
       return getMapData() 
    }
    set(value) {
      setMapData(value)
    }

  var mapDepth: Int
    get() {
       return getMapDepth() 
    }
    set(value) {
      setMapDepth(value)
    }

  var mapWidth: Int
    get() {
       return getMapWidth() 
    }
    set(value) {
      setMapWidth(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for mapData
   */
  fun mapData(cb: PoolFloatArray.() -> Unit) {
    val _p = mapData
    cb(_p)
    mapData = _p
  }

  fun getMapData(): PoolFloatArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolFloatArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getMapData.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMapDepth(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMapDepth.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMapWidth(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMapWidth.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setMapData(data: PoolFloatArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMapData.call(self._handle, listOf(data), null)
    }
  }

  fun setMapDepth(height: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMapDepth.call(self._handle, listOf(height), null)
    }
  }

  fun setMapWidth(width: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMapWidth.call(self._handle, listOf(width), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("HeightMapShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for HeightMapShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for HeightMapShape
     */
    private object __method_bind {
      val getMapData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
            "get_map_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_map_data" }
        }
      val getMapDepth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
            "get_map_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_map_depth" }
        }
      val getMapWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
            "get_map_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_map_width" }
        }
      val setMapData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
            "set_map_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_map_data" }
        }
      val setMapDepth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
            "set_map_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_map_depth" }
        }
      val setMapWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
            "set_map_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_map_width" }
        }}
  }
}
