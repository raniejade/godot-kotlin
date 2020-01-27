// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolRealArray
import godot.core.PoolVector3Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
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

open class Curve3D internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addPoint(
    position: Vector3,
    `in`: Vector3,
    out: Vector3,
    atPosition: Int
  ) {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(`in`)
    _args.append(out)
    _args.append(atPosition)
    val _ret = __method_bind.add_point.call(this.toVariant(), _args.toVariant(), 4)
    TODO()
  }

  fun clearPoints() {
    val _ret = __method_bind.clear_points.call(this.toVariant())
    TODO()
  }

  fun getBakeInterval(): Float {
    val _ret = __method_bind.get_bake_interval.call(this.toVariant())
    TODO()
  }

  fun getBakedLength(): Float {
    val _ret = __method_bind.get_baked_length.call(this.toVariant())
    TODO()
  }

  fun getBakedPoints(): PoolVector3Array {
    val _ret = __method_bind.get_baked_points.call(this.toVariant())
    TODO()
  }

  fun getBakedTilts(): PoolRealArray {
    val _ret = __method_bind.get_baked_tilts.call(this.toVariant())
    TODO()
  }

  fun getBakedUpVectors(): PoolVector3Array {
    val _ret = __method_bind.get_baked_up_vectors.call(this.toVariant())
    TODO()
  }

  fun getClosestOffset(toPoint: Vector3): Float {
    val _args = VariantArray.new()
    _args.append(toPoint)
    val _ret = __method_bind.get_closest_offset.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getClosestPoint(toPoint: Vector3): Vector3 {
    val _args = VariantArray.new()
    _args.append(toPoint)
    val _ret = __method_bind.get_closest_point.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getPointCount(): Int {
    val _ret = __method_bind.get_point_count.call(this.toVariant())
    TODO()
  }

  fun getPointIn(idx: Int): Vector3 {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_point_in.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getPointOut(idx: Int): Vector3 {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_point_out.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getPointPosition(idx: Int): Vector3 {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_point_position.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getPointTilt(idx: Int): Float {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_point_tilt.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun interpolate(idx: Int, t: Float): Vector3 {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(t)
    val _ret = __method_bind.interpolate.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun interpolateBaked(offset: Float, cubic: Boolean): Vector3 {
    val _args = VariantArray.new()
    _args.append(offset)
    _args.append(cubic)
    val _ret = __method_bind.interpolate_baked.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun interpolateBakedUpVector(offset: Float, applyTilt: Boolean): Vector3 {
    val _args = VariantArray.new()
    _args.append(offset)
    _args.append(applyTilt)
    val _ret = __method_bind.interpolate_baked_up_vector.call(this.toVariant(), _args.toVariant(),
        2)
    TODO()
  }

  fun interpolatef(fofs: Float): Vector3 {
    val _args = VariantArray.new()
    _args.append(fofs)
    val _ret = __method_bind.interpolatef.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isUpVectorEnabled(): Boolean {
    val _ret = __method_bind.is_up_vector_enabled.call(this.toVariant())
    TODO()
  }

  fun removePoint(idx: Int) {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.remove_point.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBakeInterval(distance: Float) {
    val _args = VariantArray.new()
    _args.append(distance)
    val _ret = __method_bind.set_bake_interval.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPointIn(idx: Int, position: Vector3) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(position)
    val _ret = __method_bind.set_point_in.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setPointOut(idx: Int, position: Vector3) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(position)
    val _ret = __method_bind.set_point_out.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setPointPosition(idx: Int, position: Vector3) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(position)
    val _ret = __method_bind.set_point_position.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setPointTilt(idx: Int, tilt: Float) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(tilt)
    val _ret = __method_bind.set_point_tilt.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setUpVectorEnabled(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_up_vector_enabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun tessellate(maxStages: Int, toleranceDegrees: Float): PoolVector3Array {
    val _args = VariantArray.new()
    _args.append(maxStages)
    _args.append(toleranceDegrees)
    val _ret = __method_bind.tessellate.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  companion object {
    fun new(): Curve3D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Curve3D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Curve3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Curve3D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Curve3D = Curve3D(ptr)
    /**
     * Container for method_bind pointers for Curve3D
     */
    private object __method_bind {
      val add_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "add_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_point" }
            }
          }

      val clear_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "clear_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_points" }
            }
          }

      val get_bake_interval: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "get_bake_interval".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bake_interval" }
            }
          }

      val get_baked_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "get_baked_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_baked_length" }
            }
          }

      val get_baked_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "get_baked_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_baked_points" }
            }
          }

      val get_baked_tilts: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "get_baked_tilts".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_baked_tilts" }
            }
          }

      val get_baked_up_vectors: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "get_baked_up_vectors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_baked_up_vectors" }
            }
          }

      val get_closest_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "get_closest_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_offset" }
            }
          }

      val get_closest_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "get_closest_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
            }
          }

      val get_point_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "get_point_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_count" }
            }
          }

      val get_point_in: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "get_point_in".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_in" }
            }
          }

      val get_point_out: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "get_point_out".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_out" }
            }
          }

      val get_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "get_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_position" }
            }
          }

      val get_point_tilt: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "get_point_tilt".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_tilt" }
            }
          }

      val interpolate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "interpolate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate" }
            }
          }

      val interpolate_baked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "interpolate_baked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate_baked" }
            }
          }

      val interpolate_baked_up_vector: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "interpolate_baked_up_vector".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate_baked_up_vector" }
            }
          }

      val interpolatef: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "interpolatef".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolatef" }
            }
          }

      val is_up_vector_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "is_up_vector_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_up_vector_enabled" }
            }
          }

      val remove_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "remove_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_point" }
            }
          }

      val set_bake_interval: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "set_bake_interval".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bake_interval" }
            }
          }

      val set_point_in: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "set_point_in".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_in" }
            }
          }

      val set_point_out: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "set_point_out".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_out" }
            }
          }

      val set_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "set_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_position" }
            }
          }

      val set_point_tilt: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "set_point_tilt".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_tilt" }
            }
          }

      val set_up_vector_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "set_up_vector_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_up_vector_enabled" }
            }
          }

      val tessellate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve3D".cstr.ptr,
              "tessellate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tessellate" }
            }
          }
    }
  }
}
