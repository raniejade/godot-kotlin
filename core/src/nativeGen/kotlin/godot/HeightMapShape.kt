// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolFloatArray
import godot.core.Variant
import godot.core.VariantArray
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
    _handle = __new()
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
    val _ret = __method_bind.getMapData.call(this._handle)
    return _ret.asPoolFloatArray()
  }

  fun getMapDepth(): Int {
    val _ret = __method_bind.getMapDepth.call(this._handle)
    return _ret.asInt()
  }

  fun getMapWidth(): Int {
    val _ret = __method_bind.getMapWidth.call(this._handle)
    return _ret.asInt()
  }

  fun setMapData(data: PoolFloatArray) {
    val _arg = Variant(data)
    __method_bind.setMapData.call(this._handle, listOf(_arg))
  }

  fun setMapDepth(height: Int) {
    val _arg = Variant(height)
    __method_bind.setMapDepth.call(this._handle, listOf(_arg))
  }

  fun setMapWidth(width: Int) {
    val _arg = Variant(width)
    __method_bind.setMapWidth.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
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
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
            "get_map_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_map_data" }
        }
      val getMapDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
            "get_map_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_map_depth" }
        }
      val getMapWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
            "get_map_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_map_width" }
        }
      val setMapData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
            "set_map_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_map_data" }
        }
      val setMapDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
            "set_map_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_map_depth" }
        }
      val setMapWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HeightMapShape".cstr.ptr,
            "set_map_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_map_width" }
        }}
  }
}
