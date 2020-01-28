// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
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
  var outlines: VariantArray
    get() {
       return _getOutlines() 
    }
    set(value) {
      _setOutlines(value)
    }

  var polygons: VariantArray
    get() {
       return _getPolygons() 
    }
    set(value) {
      _setPolygons(value)
    }

  var vertices: PoolVector2Array
    get() {
       return getVertices() 
    }
    set(value) {
      setVertices(value)
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
            "addOutline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addOutline" }
        }
      val addOutlineAtIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "addOutlineAtIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addOutlineAtIndex" }
        }
      val addPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "addPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addPolygon" }
        }
      val clearOutlines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "clearOutlines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearOutlines" }
        }
      val clearPolygons: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "clearPolygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearPolygons" }
        }
      val getOutline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "getOutline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOutline" }
        }
      val getOutlineCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "getOutlineCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOutlineCount" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "getPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPolygon" }
        }
      val getPolygonCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "getPolygonCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPolygonCount" }
        }
      val getVertices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "getVertices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertices" }
        }
      val makePolygonsFromOutlines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "makePolygonsFromOutlines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method makePolygonsFromOutlines" }
        }
      val removeOutline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "removeOutline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeOutline" }
        }
      val setOutline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "setOutline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOutline" }
        }
      val setVertices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "setVertices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVertices" }
        }}
  }
}
