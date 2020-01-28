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

open class Curve2D(
  _handle: COpaquePointer
) : Resource(_handle) {
  var bakeInterval: Float
    get() {
       return getBakeInterval() 
    }
    set(value) {
      setBakeInterval(value)
    }

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
    __method_bind.addPoint.call(this._handle, _args.toVariant(), 4)
  }

  fun clearPoints() {
    __method_bind.clearPoints.call(this._handle)
  }

  fun getBakeInterval(): Float {
    val _ret = __method_bind.getBakeInterval.call(this._handle)
    return _ret.asFloat()
  }

  fun getBakedLength(): Float {
    val _ret = __method_bind.getBakedLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getBakedPoints(): PoolVector2Array {
    val _ret = __method_bind.getBakedPoints.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun getClosestOffset(toPoint: Vector2): Float {
    val _arg = Variant.new(toPoint)
    val _ret = __method_bind.getClosestOffset.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getClosestPoint(toPoint: Vector2): Vector2 {
    val _arg = Variant.new(toPoint)
    val _ret = __method_bind.getClosestPoint.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getPointCount(): Int {
    val _ret = __method_bind.getPointCount.call(this._handle)
    return _ret.asInt()
  }

  fun getPointIn(idx: Int): Vector2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getPointIn.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getPointOut(idx: Int): Vector2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getPointOut.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getPointPosition(idx: Int): Vector2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getPointPosition.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun interpolate(idx: Int, t: Float): Vector2 {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(t)
    val _ret = __method_bind.interpolate.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun interpolateBaked(offset: Float, cubic: Boolean): Vector2 {
    val _args = VariantArray.new()
    _args.append(offset)
    _args.append(cubic)
    val _ret = __method_bind.interpolateBaked.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun interpolatef(fofs: Float): Vector2 {
    val _arg = Variant.new(fofs)
    val _ret = __method_bind.interpolatef.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun removePoint(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.removePoint.call(this._handle, _arg, 1)
  }

  fun setBakeInterval(distance: Float) {
    val _arg = Variant.new(distance)
    __method_bind.setBakeInterval.call(this._handle, _arg, 1)
  }

  fun setPointIn(idx: Int, position: Vector2) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(position)
    __method_bind.setPointIn.call(this._handle, _args.toVariant(), 2)
  }

  fun setPointOut(idx: Int, position: Vector2) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(position)
    __method_bind.setPointOut.call(this._handle, _args.toVariant(), 2)
  }

  fun setPointPosition(idx: Int, position: Vector2) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(position)
    __method_bind.setPointPosition.call(this._handle, _args.toVariant(), 2)
  }

  fun tessellate(maxStages: Int, toleranceDegrees: Float): PoolVector2Array {
    val _args = VariantArray.new()
    _args.append(maxStages)
    _args.append(toleranceDegrees)
    val _ret = __method_bind.tessellate.call(this._handle, _args.toVariant(), 2)
    return _ret.asPoolVector2Array()
  }

  companion object {
    fun new(): Curve2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Curve2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Curve2D" }
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
      val addPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "add_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_point" }
        }
      val clearPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "clear_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_points" }
        }
      val getBakeInterval: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "get_bake_interval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_interval" }
        }
      val getBakedLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "get_baked_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_baked_length" }
        }
      val getBakedPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "get_baked_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_baked_points" }
        }
      val getClosestOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "get_closest_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_offset" }
        }
      val getClosestPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "get_closest_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
        }
      val getPointCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "get_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_count" }
        }
      val getPointIn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "get_point_in".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_in" }
        }
      val getPointOut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "get_point_out".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_out" }
        }
      val getPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "get_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_position" }
        }
      val interpolate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "interpolate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate" }
        }
      val interpolateBaked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "interpolate_baked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate_baked" }
        }
      val interpolatef: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "interpolatef".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolatef" }
        }
      val removePoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "remove_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_point" }
        }
      val setBakeInterval: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "set_bake_interval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bake_interval" }
        }
      val setPointIn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "set_point_in".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_in" }
        }
      val setPointOut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "set_point_out".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_out" }
        }
      val setPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "set_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_position" }
        }
      val tessellate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "tessellate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tessellate" }
        }}
  }
}
