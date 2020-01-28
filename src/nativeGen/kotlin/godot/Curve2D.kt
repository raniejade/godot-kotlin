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
  var data: Int
    get() {
       return _getData() 
    }
    set(value) {
      _setData(value)
    }

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
            "addPoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addPoint" }
        }
      val clearPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "clearPoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearPoints" }
        }
      val getBakeInterval: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "getBakeInterval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBakeInterval" }
        }
      val getBakedLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "getBakedLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBakedLength" }
        }
      val getBakedPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "getBakedPoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBakedPoints" }
        }
      val getClosestOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "getClosestOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClosestOffset" }
        }
      val getClosestPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "getClosestPoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClosestPoint" }
        }
      val getPointCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "getPointCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointCount" }
        }
      val getPointIn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "getPointIn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointIn" }
        }
      val getPointOut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "getPointOut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointOut" }
        }
      val getPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "getPointPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointPosition" }
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
            "interpolateBaked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolateBaked" }
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
            "removePoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removePoint" }
        }
      val setBakeInterval: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "setBakeInterval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBakeInterval" }
        }
      val setPointIn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "setPointIn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointIn" }
        }
      val setPointOut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "setPointOut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointOut" }
        }
      val setPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "setPointPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointPosition" }
        }
      val tessellate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve2D".cstr.ptr,
            "tessellate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tessellate" }
        }}
  }
}
