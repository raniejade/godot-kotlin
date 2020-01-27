// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolIntArray
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

open class AStar internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addPoint(
    id: Int,
    position: Vector3,
    weightScale: Float
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(position)
    _args.append(weightScale)
    val _ret = __method_bind.add_point.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun arePointsConnected(id: Int, toId: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(toId)
    val _ret = __method_bind.are_points_connected.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun clear() {
    val _ret = __method_bind.clear.call(this.toVariant())
    TODO()
  }

  fun connectPoints(
    id: Int,
    toId: Int,
    bidirectional: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(toId)
    _args.append(bidirectional)
    val _ret = __method_bind.connect_points.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun disconnectPoints(id: Int, toId: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(toId)
    val _ret = __method_bind.disconnect_points.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun getAvailablePointId(): Int {
    val _ret = __method_bind.get_available_point_id.call(this.toVariant())
    TODO()
  }

  fun getClosestPoint(toPosition: Vector3): Int {
    val _args = VariantArray.new()
    _args.append(toPosition)
    val _ret = __method_bind.get_closest_point.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getClosestPositionInSegment(toPosition: Vector3): Vector3 {
    val _args = VariantArray.new()
    _args.append(toPosition)
    val _ret = __method_bind.get_closest_position_in_segment.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun getIdPath(fromId: Int, toId: Int): PoolIntArray {
    val _args = VariantArray.new()
    _args.append(fromId)
    _args.append(toId)
    val _ret = __method_bind.get_id_path.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun getPointConnections(id: Int): PoolIntArray {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.get_point_connections.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getPointPath(fromId: Int, toId: Int): PoolVector3Array {
    val _args = VariantArray.new()
    _args.append(fromId)
    _args.append(toId)
    val _ret = __method_bind.get_point_path.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun getPointPosition(id: Int): Vector3 {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.get_point_position.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getPointWeightScale(id: Int): Float {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.get_point_weight_scale.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getPoints(): VariantArray {
    val _ret = __method_bind.get_points.call(this.toVariant())
    TODO()
  }

  fun hasPoint(id: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.has_point.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isPointDisabled(id: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.is_point_disabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun removePoint(id: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.remove_point.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPointDisabled(id: Int, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(disabled)
    val _ret = __method_bind.set_point_disabled.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setPointPosition(id: Int, position: Vector3) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(position)
    val _ret = __method_bind.set_point_position.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setPointWeightScale(id: Int, weightScale: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(weightScale)
    val _ret = __method_bind.set_point_weight_scale.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  companion object {
    fun new(): AStar = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AStar".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AStar" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AStar(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AStar = AStar(ptr)
    /**
     * Container for method_bind pointers for AStar
     */
    private object __method_bind {
      val add_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "add_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_point" }
            }
          }

      val are_points_connected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "are_points_connected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method are_points_connected" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val connect_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "connect_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_points" }
            }
          }

      val disconnect_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "disconnect_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_points" }
            }
          }

      val get_available_point_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "get_available_point_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_available_point_id" }
            }
          }

      val get_closest_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "get_closest_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
            }
          }

      val get_closest_position_in_segment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "get_closest_position_in_segment".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_closest_position_in_segment" }
            }
          }

      val get_id_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "get_id_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_id_path" }
            }
          }

      val get_point_connections: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "get_point_connections".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_connections" }
            }
          }

      val get_point_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "get_point_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_path" }
            }
          }

      val get_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "get_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_position" }
            }
          }

      val get_point_weight_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "get_point_weight_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_weight_scale" }
            }
          }

      val get_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "get_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_points" }
            }
          }

      val has_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "has_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_point" }
            }
          }

      val is_point_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "is_point_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_point_disabled" }
            }
          }

      val remove_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "remove_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_point" }
            }
          }

      val set_point_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "set_point_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_disabled" }
            }
          }

      val set_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "set_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_position" }
            }
          }

      val set_point_weight_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
              "set_point_weight_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_weight_scale" }
            }
          }
    }
  }
}
