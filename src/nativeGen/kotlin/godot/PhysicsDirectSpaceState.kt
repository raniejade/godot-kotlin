// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PhysicsDirectSpaceState internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun castMotion(shape: PhysicsShapeQueryParameters, motion: Vector3): VariantArray {
    val _args = VariantArray.new()
    _args.append(shape)
    _args.append(motion)
    val _ret = __method_bind.cast_motion.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asArray()
  }

  fun collideShape(shape: PhysicsShapeQueryParameters, maxResults: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(shape)
    _args.append(maxResults)
    val _ret = __method_bind.collide_shape.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asArray()
  }

  fun getRestInfo(shape: PhysicsShapeQueryParameters): Dictionary {
    val _args = VariantArray.new()
    _args.append(shape)
    val _ret = __method_bind.get_rest_info.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asDictionary()
  }

  fun intersectRay(
    from: Vector3,
    to: Vector3,
    exclude: VariantArray,
    collisionMask: Int,
    collideWithBodies: Boolean,
    collideWithAreas: Boolean
  ): Dictionary {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    _args.append(exclude)
    _args.append(collisionMask)
    _args.append(collideWithBodies)
    _args.append(collideWithAreas)
    val _ret = __method_bind.intersect_ray.call(this.toVariant(), _args.toVariant(), 6)
    return _ret.asDictionary()
  }

  fun intersectShape(shape: PhysicsShapeQueryParameters, maxResults: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(shape)
    _args.append(maxResults)
    val _ret = __method_bind.intersect_shape.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asArray()
  }

  companion object {
    /**
     * Container for method_bind pointers for PhysicsDirectSpaceState
     */
    private object __method_bind {
      val cast_motion: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
              "cast_motion".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cast_motion" }
            }
          }

      val collide_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
              "collide_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method collide_shape" }
            }
          }

      val get_rest_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
              "get_rest_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rest_info" }
            }
          }

      val intersect_ray: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
              "intersect_ray".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_ray" }
            }
          }

      val intersect_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
              "intersect_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_shape" }
            }
          }
    }
  }
}
