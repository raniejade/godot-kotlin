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
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PhysicsDirectSpaceState(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun castMotion(shape: PhysicsShapeQueryParameters, motion: Vector3): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(shape))
    _args.add(Variant.fromAny(motion))
    val _ret = __method_bind.castMotion.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun collideShape(shape: PhysicsShapeQueryParameters, maxResults: Int = 32): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(shape))
    _args.add(Variant.fromAny(maxResults))
    val _ret = __method_bind.collideShape.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun getRestInfo(shape: PhysicsShapeQueryParameters): Dictionary {
    val _arg = Variant(shape)
    val _ret = __method_bind.getRestInfo.call(this._handle, listOf(_arg))
    return _ret.asDictionary()
  }

  fun intersectRay(
    from: Vector3,
    to: Vector3,
    exclude: VariantArray,
    collisionMask: Int = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): Dictionary {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    _args.add(Variant.fromAny(exclude))
    _args.add(Variant.fromAny(collisionMask))
    _args.add(Variant.fromAny(collideWithBodies))
    _args.add(Variant.fromAny(collideWithAreas))
    val _ret = __method_bind.intersectRay.call(this._handle, _args)
    return _ret.asDictionary()
  }

  fun intersectShape(shape: PhysicsShapeQueryParameters, maxResults: Int = 32): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(shape))
    _args.add(Variant.fromAny(maxResults))
    val _ret = __method_bind.intersectShape.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  companion object {
    /**
     * Container for method_bind pointers for PhysicsDirectSpaceState
     */
    private object __method_bind {
      val castMotion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
            "cast_motion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cast_motion" }
        }
      val collideShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
            "collide_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method collide_shape" }
        }
      val getRestInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
            "get_rest_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rest_info" }
        }
      val intersectRay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
            "intersect_ray".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method intersect_ray" }
        }
      val intersectShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectSpaceState".cstr.ptr,
            "intersect_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method intersect_shape" }
        }}
  }
}
