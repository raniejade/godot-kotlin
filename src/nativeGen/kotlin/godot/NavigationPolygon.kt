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

open class NavigationPolygon internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addOutline(outline: PoolVector2Array) {
    val _args = VariantArray.new()
    _args.append(outline)
    val _ret = __method_bind.add_outline.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun addOutlineAtIndex(outline: PoolVector2Array, index: Int) {
    val _args = VariantArray.new()
    _args.append(outline)
    _args.append(index)
    val _ret = __method_bind.add_outline_at_index.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun addPolygon(polygon: PoolIntArray) {
    val _args = VariantArray.new()
    _args.append(polygon)
    val _ret = __method_bind.add_polygon.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun clearOutlines() {
    val _ret = __method_bind.clear_outlines.call(this.toVariant())
    TODO()
  }

  fun clearPolygons() {
    val _ret = __method_bind.clear_polygons.call(this.toVariant())
    TODO()
  }

  fun getOutline(idx: Int): PoolVector2Array {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_outline.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getOutlineCount(): Int {
    val _ret = __method_bind.get_outline_count.call(this.toVariant())
    TODO()
  }

  fun getPolygon(idx: Int): PoolIntArray {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_polygon.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getPolygonCount(): Int {
    val _ret = __method_bind.get_polygon_count.call(this.toVariant())
    TODO()
  }

  fun getVertices(): PoolVector2Array {
    val _ret = __method_bind.get_vertices.call(this.toVariant())
    TODO()
  }

  fun makePolygonsFromOutlines() {
    val _ret = __method_bind.make_polygons_from_outlines.call(this.toVariant())
    TODO()
  }

  fun removeOutline(idx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.remove_outline.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setOutline(idx: Int, outline: PoolVector2Array) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(outline)
    val _ret = __method_bind.set_outline.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setVertices(vertices: PoolVector2Array) {
    val _args = VariantArray.new()
    _args.append(vertices)
    val _ret = __method_bind.set_vertices.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): NavigationPolygon = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationPolygon".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton NavigationPolygon" }
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
      val add_outline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "add_outline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_outline" }
            }
          }

      val add_outline_at_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "add_outline_at_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_outline_at_index" }
            }
          }

      val add_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "add_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_polygon" }
            }
          }

      val clear_outlines: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "clear_outlines".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_outlines" }
            }
          }

      val clear_polygons: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "clear_polygons".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_polygons" }
            }
          }

      val get_outline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "get_outline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_outline" }
            }
          }

      val get_outline_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "get_outline_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_outline_count" }
            }
          }

      val get_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "get_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_polygon" }
            }
          }

      val get_polygon_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "get_polygon_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_polygon_count" }
            }
          }

      val get_vertices: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "get_vertices".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertices" }
            }
          }

      val make_polygons_from_outlines: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "make_polygons_from_outlines".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_polygons_from_outlines" }
            }
          }

      val remove_outline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "remove_outline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_outline" }
            }
          }

      val set_outline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "set_outline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_outline" }
            }
          }

      val set_vertices: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygon".cstr.ptr,
              "set_vertices".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertices" }
            }
          }
    }
  }
}
