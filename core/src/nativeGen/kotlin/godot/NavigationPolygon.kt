// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
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

open class NavigationPolygon(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var vertices: PoolVector2Array
    get() {
       return getVertices() 
    }
    set(value) {
      setVertices(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for vertices
   */
  fun vertices(cb: PoolVector2Array.() -> Unit) {
    val _p = vertices
    cb(_p)
    vertices = _p
  }

  open fun _get_outlines(): VariantArray {
    TODO()
  }

  open fun _get_polygons(): VariantArray {
    TODO()
  }

  open fun _set_outlines(outlines: VariantArray) {
    TODO()
  }

  open fun _set_polygons(polygons: VariantArray) {
    TODO()
  }

  fun addOutline(outline: PoolVector2Array) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addOutline.call(self._handle, listOf(outline), null)
    }
  }

  fun addOutlineAtIndex(outline: PoolVector2Array, index: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(outline)
      _args.add(index)
      __method_bind.addOutlineAtIndex.call(self._handle, _args, null)
    }
  }

  fun addPolygon(polygon: PoolIntArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addPolygon.call(self._handle, listOf(polygon), null)
    }
  }

  fun clearOutlines() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearOutlines.call(self._handle, emptyList(), null)
    }
  }

  fun clearPolygons() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearPolygons.call(self._handle, emptyList(), null)
    }
  }

  fun getOutline(idx: Int): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      __method_bind.getOutline.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getOutlineCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOutlineCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPolygon(idx: Int): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getPolygon.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPolygonCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPolygonCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getVertices(): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      __method_bind.getVertices.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun makePolygonsFromOutlines() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.makePolygonsFromOutlines.call(self._handle, emptyList(), null)
    }
  }

  fun removeOutline(idx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeOutline.call(self._handle, listOf(idx), null)
    }
  }

  fun setOutline(idx: Int, outline: PoolVector2Array) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(outline)
      __method_bind.setOutline.call(self._handle, _args, null)
    }
  }

  fun setVertices(vertices: PoolVector2Array) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVertices.call(self._handle, listOf(vertices), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationPolygon".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NavigationPolygon" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for NavigationPolygon
     */
    private object __method_bind {
      val addOutline: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "add_outline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_outline" }
        }
      val addOutlineAtIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "add_outline_at_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_outline_at_index" }
        }
      val addPolygon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "add_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_polygon" }
        }
      val clearOutlines: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "clear_outlines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_outlines" }
        }
      val clearPolygons: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "clear_polygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_polygons" }
        }
      val getOutline: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "get_outline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_outline" }
        }
      val getOutlineCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "get_outline_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_outline_count" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "get_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon" }
        }
      val getPolygonCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "get_polygon_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon_count" }
        }
      val getVertices: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "get_vertices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertices" }
        }
      val makePolygonsFromOutlines: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "make_polygons_from_outlines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_polygons_from_outlines" }
        }
      val removeOutline: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "remove_outline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_outline" }
        }
      val setOutline: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "set_outline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_outline" }
        }
      val setVertices: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
            "set_vertices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertices" }
        }}
  }
}
