// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NavigationPolygon(
  _handle: COpaquePointer
) : Resource(_handle) {
  var vertices: PoolVector2Array
    get() {
       return getVertices() 
    }
    set(value) {
      setVertices(value)
    }

  /**
   * Specialized setter for vertices
   */
  fun vertices(cb: PoolVector2Array.() -> Unit) {
    val _p = vertices
    cb(_p)
    vertices = _p
  }

  fun addOutline(outline: PoolVector2Array) {
    val _arg = Variant.new(outline)
    __method_bind.addOutline.call(this._handle, _arg, 1)
  }

  fun addOutlineAtIndex(outline: PoolVector2Array, index: Int) {
    val _args = VariantArray.new()
    _args.append(outline)
    _args.append(index)
    __method_bind.addOutlineAtIndex.call(this._handle, _args.toVariant(), 2)
  }

  fun addPolygon(polygon: PoolIntArray) {
    val _arg = Variant.new(polygon)
    __method_bind.addPolygon.call(this._handle, _arg, 1)
  }

  fun clearOutlines() {
    __method_bind.clearOutlines.call(this._handle)
  }

  fun clearPolygons() {
    __method_bind.clearPolygons.call(this._handle)
  }

  fun getOutline(idx: Int): PoolVector2Array {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getOutline.call(this._handle, _arg, 1)
    return _ret.asPoolVector2Array()
  }

  fun getOutlineCount(): Int {
    val _ret = __method_bind.getOutlineCount.call(this._handle)
    return _ret.asInt()
  }

  fun getPolygon(idx: Int): PoolIntArray {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getPolygon.call(this._handle, _arg, 1)
    return _ret.asPoolIntArray()
  }

  fun getPolygonCount(): Int {
    val _ret = __method_bind.getPolygonCount.call(this._handle)
    return _ret.asInt()
  }

  fun getVertices(): PoolVector2Array {
    val _ret = __method_bind.getVertices.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun makePolygonsFromOutlines() {
    __method_bind.makePolygonsFromOutlines.call(this._handle)
  }

  fun removeOutline(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.removeOutline.call(this._handle, _arg, 1)
  }

  fun setOutline(idx: Int, outline: PoolVector2Array) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(outline)
    __method_bind.setOutline.call(this._handle, _args.toVariant(), 2)
  }

  fun setVertices(vertices: PoolVector2Array) {
    val _arg = Variant.new(vertices)
    __method_bind.setVertices.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): NavigationPolygon = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationPolygon".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NavigationPolygon" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NavigationPolygon(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): NavigationPolygon = NavigationPolygon(ptr)
    /**
     * Container for method_bind pointers for NavigationPolygon
     */
    private object __method_bind {
      val addOutline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "add_outline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_outline" }
        }
      val addOutlineAtIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "add_outline_at_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_outline_at_index" }
        }
      val addPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "add_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_polygon" }
        }
      val clearOutlines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "clear_outlines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_outlines" }
        }
      val clearPolygons: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "clear_polygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_polygons" }
        }
      val getOutline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "get_outline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_outline" }
        }
      val getOutlineCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "get_outline_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_outline_count" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "get_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon" }
        }
      val getPolygonCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "get_polygon_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon_count" }
        }
      val getVertices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "get_vertices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertices" }
        }
      val makePolygonsFromOutlines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "make_polygons_from_outlines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_polygons_from_outlines" }
        }
      val removeOutline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "remove_outline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_outline" }
        }
      val setOutline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "set_outline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_outline" }
        }
      val setVertices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "set_vertices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertices" }
        }}
  }
}
