// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Curve2D internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addPoint(
    position: Vector2,
    `in`: Vector2,
    out: Vector2,
    atPosition: Int
  ) {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(`in`)
    _args.append(out)
    _args.append(atPosition)
    __method_bind.add_point.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun clearPoints() {
    __method_bind.clear_points.call(this.toVariant())
  }

  fun getBakeInterval(): Float {
    val _ret = __method_bind.get_bake_interval.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getBakedLength(): Float {
    val _ret = __method_bind.get_baked_length.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getBakedPoints(): PoolVector2Array {
    val _ret = __method_bind.get_baked_points.call(this.toVariant())
    return _ret.asPoolVector2Array()
  }

  fun getClosestOffset(toPoint: Vector2): Float {
    val _args = VariantArray.new()
    _args.append(toPoint)
    val _ret = __method_bind.get_closest_offset.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asFloat()
  }

  fun getClosestPoint(toPoint: Vector2): Vector2 {
    val _args = VariantArray.new()
    _args.append(toPoint)
    val _ret = __method_bind.get_closest_point.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asVector2()
  }

  fun getPointCount(): Int {
    val _ret = __method_bind.get_point_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getPointIn(idx: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_point_in.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asVector2()
  }

  fun getPointOut(idx: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_point_out.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asVector2()
  }

  fun getPointPosition(idx: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_point_position.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asVector2()
  }

  fun interpolate(idx: Int, t: Float): Vector2 {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(t)
    val _ret = __method_bind.interpolate.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun interpolateBaked(offset: Float, cubic: Boolean): Vector2 {
    val _args = VariantArray.new()
    _args.append(offset)
    _args.append(cubic)
    val _ret = __method_bind.interpolate_baked.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun interpolatef(fofs: Float): Vector2 {
    val _args = VariantArray.new()
    _args.append(fofs)
    val _ret = __method_bind.interpolatef.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asVector2()
  }

  fun removePoint(idx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    __method_bind.remove_point.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setBakeInterval(distance: Float) {
    val _args = VariantArray.new()
    _args.append(distance)
    __method_bind.set_bake_interval.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setPointIn(idx: Int, position: Vector2) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(position)
    __method_bind.set_point_in.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setPointOut(idx: Int, position: Vector2) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(position)
    __method_bind.set_point_out.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setPointPosition(idx: Int, position: Vector2) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(position)
    __method_bind.set_point_position.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun tessellate(maxStages: Int, toleranceDegrees: Float): PoolVector2Array {
    val _args = VariantArray.new()
    _args.append(maxStages)
    _args.append(toleranceDegrees)
    val _ret = __method_bind.tessellate.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asPoolVector2Array()
  }

  companion object {
    fun new(): Curve2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Curve2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Curve2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Curve2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Curve2D = Curve2D(ptr)
    /**
     * Container for method_bind pointers for Curve2D
     */
    private object __method_bind {
      val add_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "add_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_point" }
            }
          }

      val clear_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "clear_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_points" }
            }
          }

      val get_bake_interval: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_bake_interval".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bake_interval" }
            }
          }

      val get_baked_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_baked_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_baked_length" }
            }
          }

      val get_baked_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_baked_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_baked_points" }
            }
          }

      val get_closest_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_closest_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_offset" }
            }
          }

      val get_closest_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_closest_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
            }
          }

      val get_point_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_point_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_count" }
            }
          }

      val get_point_in: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_point_in".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_in" }
            }
          }

      val get_point_out: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_point_out".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_out" }
            }
          }

      val get_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "get_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_position" }
            }
          }

      val interpolate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "interpolate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate" }
            }
          }

      val interpolate_baked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "interpolate_baked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate_baked" }
            }
          }

      val interpolatef: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "interpolatef".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolatef" }
            }
          }

      val remove_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "remove_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_point" }
            }
          }

      val set_bake_interval: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "set_bake_interval".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bake_interval" }
            }
          }

      val set_point_in: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "set_point_in".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_in" }
            }
          }

      val set_point_out: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "set_point_out".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_out" }
            }
          }

      val set_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "set_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_position" }
            }
          }

      val tessellate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
              "tessellate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tessellate" }
            }
          }
    }
  }
}
