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

open class AStar(
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
    __method_bind.addPoint.call(this._handle, _args.toVariant(), 3)
  }

  fun arePointsConnected(id: Int, toId: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(toId)
    val _ret = __method_bind.arePointsConnected.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
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
    __method_bind.connectPoints.call(this._handle, _args.toVariant(), 3)
  }

  fun disconnectPoints(id: Int, toId: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(toId)
    __method_bind.disconnectPoints.call(this._handle, _args.toVariant(), 2)
  }

  fun getAvailablePointId(): Int {
    val _ret = __method_bind.getAvailablePointId.call(this._handle)
    return _ret.asInt()
  }

  fun getClosestPoint(toPosition: Vector3): Int {
    val _arg = Variant.new(toPosition)
    val _ret = __method_bind.getClosestPoint.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getClosestPositionInSegment(toPosition: Vector3): Vector3 {
    val _arg = Variant.new(toPosition)
    val _ret = __method_bind.getClosestPositionInSegment.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun getIdPath(fromId: Int, toId: Int): PoolIntArray {
    val _args = VariantArray.new()
    _args.append(fromId)
    _args.append(toId)
    val _ret = __method_bind.getIdPath.call(this._handle, _args.toVariant(), 2)
    return _ret.asPoolIntArray()
  }

  fun getPointConnections(id: Int): PoolIntArray {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getPointConnections.call(this._handle, _arg, 1)
    return _ret.asPoolIntArray()
  }

  fun getPointPath(fromId: Int, toId: Int): PoolVector3Array {
    val _args = VariantArray.new()
    _args.append(fromId)
    _args.append(toId)
    val _ret = __method_bind.getPointPath.call(this._handle, _args.toVariant(), 2)
    return _ret.asPoolVector3Array()
  }

  fun getPointPosition(id: Int): Vector3 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getPointPosition.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun getPointWeightScale(id: Int): Float {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getPointWeightScale.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getPoints(): VariantArray {
    val _ret = __method_bind.getPoints.call(this._handle)
    return _ret.asVariantArray()
  }

  fun hasPoint(id: Int): Boolean {
    val _arg = Variant.new(id)
    val _ret = __method_bind.hasPoint.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isPointDisabled(id: Int): Boolean {
    val _arg = Variant.new(id)
    val _ret = __method_bind.isPointDisabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun removePoint(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.removePoint.call(this._handle, _arg, 1)
  }

  fun setPointDisabled(id: Int, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(disabled)
    __method_bind.setPointDisabled.call(this._handle, _args.toVariant(), 2)
  }

  fun setPointPosition(id: Int, position: Vector3) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(position)
    __method_bind.setPointPosition.call(this._handle, _args.toVariant(), 2)
  }

  fun setPointWeightScale(id: Int, weightScale: Float) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(weightScale)
    __method_bind.setPointWeightScale.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    fun new(): AStar = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AStar".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AStar" }
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
      val addPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "addPoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addPoint" }
        }
      val arePointsConnected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "arePointsConnected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method arePointsConnected" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val connectPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "connectPoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connectPoints" }
        }
      val disconnectPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "disconnectPoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnectPoints" }
        }
      val getAvailablePointId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "getAvailablePointId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAvailablePointId" }
        }
      val getClosestPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "getClosestPoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClosestPoint" }
        }
      val getClosestPositionInSegment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "getClosestPositionInSegment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClosestPositionInSegment" }
        }
      val getIdPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "getIdPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIdPath" }
        }
      val getPointConnections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "getPointConnections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointConnections" }
        }
      val getPointPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "getPointPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointPath" }
        }
      val getPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "getPointPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointPosition" }
        }
      val getPointWeightScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "getPointWeightScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointWeightScale" }
        }
      val getPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "getPoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPoints" }
        }
      val hasPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "hasPoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasPoint" }
        }
      val isPointDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "isPointDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPointDisabled" }
        }
      val removePoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "removePoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removePoint" }
        }
      val setPointDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "setPointDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointDisabled" }
        }
      val setPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "setPointPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointPosition" }
        }
      val setPointWeightScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AStar".cstr.ptr,
            "setPointWeightScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointWeightScale" }
        }}
  }
}
