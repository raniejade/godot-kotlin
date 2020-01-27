// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Physics2DDirectSpaceState internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun castMotion(shape: Physics2DShapeQueryParameters): VariantArray {
    val _args = VariantArray.new()
    _args.append(shape)
    val _ret = __method_bind.cast_motion.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asArray()
  }

  fun collideShape(shape: Physics2DShapeQueryParameters, maxResults: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(shape)
    _args.append(maxResults)
    val _ret = __method_bind.collide_shape.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asArray()
  }

  fun getRestInfo(shape: Physics2DShapeQueryParameters): Dictionary {
    val _args = VariantArray.new()
    _args.append(shape)
    val _ret = __method_bind.get_rest_info.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asDictionary()
  }

  fun intersectPoint(
    point: Vector2,
    maxResults: Int,
    exclude: VariantArray,
    collisionLayer: Int,
    collideWithBodies: Boolean,
    collideWithAreas: Boolean
  ): VariantArray {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(maxResults)
    _args.append(exclude)
    _args.append(collisionLayer)
    _args.append(collideWithBodies)
    _args.append(collideWithAreas)
    val _ret = __method_bind.intersect_point.call(this.toVariant(), _args.toVariant(), 6)
    return _ret.asArray()
  }

  fun intersectPointOnCanvas(
    point: Vector2,
    canvasInstanceId: Int,
    maxResults: Int,
    exclude: VariantArray,
    collisionLayer: Int,
    collideWithBodies: Boolean,
    collideWithAreas: Boolean
  ): VariantArray {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(canvasInstanceId)
    _args.append(maxResults)
    _args.append(exclude)
    _args.append(collisionLayer)
    _args.append(collideWithBodies)
    _args.append(collideWithAreas)
    val _ret = __method_bind.intersect_point_on_canvas.call(this.toVariant(), _args.toVariant(), 7)
    return _ret.asArray()
  }

  fun intersectRay(
    from: Vector2,
    to: Vector2,
    exclude: VariantArray,
    collisionLayer: Int,
    collideWithBodies: Boolean,
    collideWithAreas: Boolean
  ): Dictionary {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    _args.append(exclude)
    _args.append(collisionLayer)
    _args.append(collideWithBodies)
    _args.append(collideWithAreas)
    val _ret = __method_bind.intersect_ray.call(this.toVariant(), _args.toVariant(), 6)
    return _ret.asDictionary()
  }

  fun intersectShape(shape: Physics2DShapeQueryParameters, maxResults: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(shape)
    _args.append(maxResults)
    val _ret = __method_bind.intersect_shape.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asArray()
  }

  companion object {
    /**
     * Container for method_bind pointers for Physics2DDirectSpaceState
     */
    private object __method_bind {
      val cast_motion: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "cast_motion".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cast_motion" }
            }
          }

      val collide_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "collide_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method collide_shape" }
            }
          }

      val get_rest_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "get_rest_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rest_info" }
            }
          }

      val intersect_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "intersect_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_point" }
            }
          }

      val intersect_point_on_canvas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "intersect_point_on_canvas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_point_on_canvas" }
            }
          }

      val intersect_ray: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "intersect_ray".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_ray" }
            }
          }

      val intersect_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "intersect_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_shape" }
            }
          }
    }
  }
}
