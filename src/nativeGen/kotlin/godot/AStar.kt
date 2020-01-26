// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.PoolVector3Array
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
    weight_scale: Float
  ) {
    TODO()
  }

  fun arePointsConnected(id: Int, to_id: Int): Boolean {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun connectPoints(
    id: Int,
    to_id: Int,
    bidirectional: Boolean
  ) {
    TODO()
  }

  fun disconnectPoints(id: Int, to_id: Int) {
    TODO()
  }

  fun getAvailablePointId(): Int {
    TODO()
  }

  fun getClosestPoint(to_position: Vector3): Int {
    TODO()
  }

  fun getClosestPositionInSegment(to_position: Vector3): Vector3 {
    TODO()
  }

  fun getIdPath(from_id: Int, to_id: Int): PoolIntArray {
    TODO()
  }

  fun getPointConnections(id: Int): PoolIntArray {
    TODO()
  }

  fun getPointPath(from_id: Int, to_id: Int): PoolVector3Array {
    TODO()
  }

  fun getPointPosition(id: Int): Vector3 {
    TODO()
  }

  fun getPointWeightScale(id: Int): Float {
    TODO()
  }

  fun getPoints(): VariantArray {
    TODO()
  }

  fun hasPoint(id: Int): Boolean {
    TODO()
  }

  fun isPointDisabled(id: Int): Boolean {
    TODO()
  }

  fun removePoint(id: Int) {
    TODO()
  }

  fun setPointDisabled(id: Int, disabled: Boolean) {
    TODO()
  }

  fun setPointPosition(id: Int, position: Vector3) {
    TODO()
  }

  fun setPointWeightScale(id: Int, weight_scale: Float) {
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
