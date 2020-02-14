// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class AStar2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addPoint(
    id: Int,
    position: Vector2,
    weightScale: Float = 1.0f
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(position)
      _args.add(weightScale)
      __method_bind.addPoint.call(self._handle, _args, null)
    }
  }

  fun arePointsConnected(id: Int, toId: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(toId)
      __method_bind.arePointsConnected.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun connectPoints(
    id: Int,
    toId: Int,
    bidirectional: Boolean = true
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(toId)
      _args.add(bidirectional)
      __method_bind.connectPoints.call(self._handle, _args, null)
    }
  }

  fun disconnectPoints(id: Int, toId: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(toId)
      __method_bind.disconnectPoints.call(self._handle, _args, null)
    }
  }

  fun getAvailablePointId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAvailablePointId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getClosestPoint(toPosition: Vector2, includeDisabled: Boolean = false): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(toPosition)
      _args.add(includeDisabled)
      __method_bind.getClosestPoint.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun getClosestPositionInSegment(toPosition: Vector2): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getClosestPositionInSegment.call(self._handle, listOf(toPosition), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getIdPath(fromId: Int, toId: Int): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(fromId)
      _args.add(toId)
      __method_bind.getIdPath.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPointCapacity(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPointCapacity.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPointConnections(id: Int): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getPointConnections.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPointCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPointCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPointPath(fromId: Int, toId: Int): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(fromId)
      _args.add(toId)
      __method_bind.getPointPath.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPointPosition(id: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getPointPosition.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPointWeightScale(id: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPointWeightScale.call(self._handle, listOf(id), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPoints(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getPoints.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun hasPoint(id: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasPoint.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun isPointDisabled(id: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPointDisabled.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun removePoint(id: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removePoint.call(self._handle, listOf(id), null)
    }
  }

  fun reserveSpace(numNodes: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.reserveSpace.call(self._handle, listOf(numNodes), null)
    }
  }

  fun setPointDisabled(id: Int, disabled: Boolean = true) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(disabled)
      __method_bind.setPointDisabled.call(self._handle, _args, null)
    }
  }

  fun setPointPosition(id: Int, position: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(position)
      __method_bind.setPointPosition.call(self._handle, _args, null)
    }
  }

  fun setPointWeightScale(id: Int, weightScale: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(weightScale)
      __method_bind.setPointWeightScale.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AStar2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AStar2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AStar2D
     */
    private object __method_bind {
      val addPoint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "add_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_point" }
        }
      val arePointsConnected: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "are_points_connected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method are_points_connected" }
        }
      val clear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val connectPoints: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "connect_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_points" }
        }
      val disconnectPoints: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "disconnect_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_points" }
        }
      val getAvailablePointId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "get_available_point_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_available_point_id" }
        }
      val getClosestPoint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "get_closest_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
        }
      val getClosestPositionInSegment: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "get_closest_position_in_segment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_position_in_segment" }
        }
      val getIdPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "get_id_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_id_path" }
        }
      val getPointCapacity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "get_point_capacity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_capacity" }
        }
      val getPointConnections: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "get_point_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_connections" }
        }
      val getPointCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "get_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_count" }
        }
      val getPointPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "get_point_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_path" }
        }
      val getPointPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "get_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_position" }
        }
      val getPointWeightScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "get_point_weight_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_weight_scale" }
        }
      val getPoints: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "get_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_points" }
        }
      val hasPoint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "has_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_point" }
        }
      val isPointDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "is_point_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_point_disabled" }
        }
      val removePoint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "remove_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_point" }
        }
      val reserveSpace: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "reserve_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reserve_space" }
        }
      val setPointDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "set_point_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_disabled" }
        }
      val setPointPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "set_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_position" }
        }
      val setPointWeightScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar2D".cstr.ptr,
            "set_point_weight_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_weight_scale" }
        }}
  }
}
