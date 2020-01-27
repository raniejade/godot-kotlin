// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CollisionPolygon internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getDepth(): Float {
    val _ret = __method_bind.get_depth.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getPolygon(): PoolVector2Array {
    val _ret = __method_bind.get_polygon.call(this.toVariant())
    return _ret.asPoolVector2Array()
  }

  fun isDisabled(): Boolean {
    val _ret = __method_bind.is_disabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun setDepth(depth: Float) {
    val _args = VariantArray.new()
    _args.append(depth)
    __method_bind.set_depth.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDisabled(disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(disabled)
    __method_bind.set_disabled.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val _args = VariantArray.new()
    _args.append(polygon)
    __method_bind.set_polygon.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): CollisionPolygon = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CollisionPolygon".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CollisionPolygon" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CollisionPolygon(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CollisionPolygon = CollisionPolygon(ptr)
    /**
     * Container for method_bind pointers for CollisionPolygon
     */
    private object __method_bind {
      val get_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon".cstr.ptr,
              "get_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_depth" }
            }
          }

      val get_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon".cstr.ptr,
              "get_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_polygon" }
            }
          }

      val is_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon".cstr.ptr,
              "is_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_disabled" }
            }
          }

      val set_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon".cstr.ptr,
              "set_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_depth" }
            }
          }

      val set_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon".cstr.ptr,
              "set_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disabled" }
            }
          }

      val set_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon".cstr.ptr,
              "set_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_polygon" }
            }
          }
    }
  }
}
