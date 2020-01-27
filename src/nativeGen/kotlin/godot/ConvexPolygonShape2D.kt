// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ConvexPolygonShape2D internal constructor(
  _handle: COpaquePointer
) : Shape2D(_handle) {
  fun getPoints(): PoolVector2Array {
    val _ret = __method_bind.get_points.call(this.toVariant())
    return _ret.asPoolVector2Array()
  }

  fun setPointCloud(pointCloud: PoolVector2Array) {
    val _arg = Variant.new(pointCloud)
    __method_bind.set_point_cloud.call(this.toVariant(), _arg, 1)
  }

  fun setPoints(points: PoolVector2Array) {
    val _arg = Variant.new(points)
    __method_bind.set_points.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): ConvexPolygonShape2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConvexPolygonShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ConvexPolygonShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ConvexPolygonShape2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ConvexPolygonShape2D = ConvexPolygonShape2D(ptr)
    /**
     * Container for method_bind pointers for ConvexPolygonShape2D
     */
    private object __method_bind {
      val get_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConvexPolygonShape2D".cstr.ptr,
              "get_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_points" }
            }
          }

      val set_point_cloud: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConvexPolygonShape2D".cstr.ptr,
              "set_point_cloud".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_cloud" }
            }
          }

      val set_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConvexPolygonShape2D".cstr.ptr,
              "set_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_points" }
            }
          }
    }
  }
}
