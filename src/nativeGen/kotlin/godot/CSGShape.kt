// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class CSGShape(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  var calculateTangents: Boolean
    get() {
       return isCalculatingTangents() 
    }
    set(value) {
      setCalculateTangents(value)
    }

  var collisionLayer: Int
    get() {
       return getCollisionLayer() 
    }
    set(value) {
      setCollisionLayer(value)
    }

  var collisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var operation: Int
    get() {
       return CSGShape.Operation.from(getOperation()) 
    }
    set(value) {
      setOperation(CSGShape.Operation.from(value))
    }

  var snap: Float
    get() {
       return getSnap() 
    }
    set(value) {
      setSnap(value)
    }

  var useCollision: Boolean
    get() {
       return isUsingCollision() 
    }
    set(value) {
      setUseCollision(value)
    }

  fun getCollisionLayer(): Int {
    val _ret = __method_bind.getCollisionLayer.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionLayerBit.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionMaskBit.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getMeshes(): VariantArray {
    val _ret = __method_bind.getMeshes.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getOperation(): Operation {
    val _ret = __method_bind.getOperation.call(this._handle)
    return CSGShape.Operation.from(_ret.asInt())
  }

  fun getSnap(): Float {
    val _ret = __method_bind.getSnap.call(this._handle)
    return _ret.asFloat()
  }

  fun isCalculatingTangents(): Boolean {
    val _ret = __method_bind.isCalculatingTangents.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRootShape(): Boolean {
    val _ret = __method_bind.isRootShape.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsingCollision(): Boolean {
    val _ret = __method_bind.isUsingCollision.call(this._handle)
    return _ret.asBoolean()
  }

  fun setCalculateTangents(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setCalculateTangents.call(this._handle, _arg, 1)
  }

  fun setCollisionLayer(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.setCollisionLayer.call(this._handle, _arg, 1)
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.setCollisionLayerBit.call(this._handle, _args.toVariant(), 2)
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setCollisionMask.call(this._handle, _arg, 1)
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.setCollisionMaskBit.call(this._handle, _args.toVariant(), 2)
  }

  fun setOperation(operation: Int) {
    val _arg = Variant.new(operation)
    __method_bind.setOperation.call(this._handle, _arg, 1)
  }

  fun setSnap(snap: Float) {
    val _arg = Variant.new(snap)
    __method_bind.setSnap.call(this._handle, _arg, 1)
  }

  fun setUseCollision(operation: Boolean) {
    val _arg = Variant.new(operation)
    __method_bind.setUseCollision.call(this._handle, _arg, 1)
  }

  enum class Operation(
    val value: Int
  ) {
    OPERATION_UNION(0),

    OPERATION_INTERSECTION(1),

    OPERATION_SUBTRACTION(2);

    companion object {
      fun from(value: Int): Operation {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val OPERATION_INTERSECTION: Int = 1

    val OPERATION_SUBTRACTION: Int = 2

    val OPERATION_UNION: Int = 0

    /**
     * Container for method_bind pointers for CSGShape
     */
    private object __method_bind {
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "getCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionLayer" }
        }
      val getCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "getCollisionLayerBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionLayerBit" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "getCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "getCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMaskBit" }
        }
      val getMeshes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "getMeshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMeshes" }
        }
      val getOperation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "getOperation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOperation" }
        }
      val getSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "getSnap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSnap" }
        }
      val isCalculatingTangents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "isCalculatingTangents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCalculatingTangents" }
        }
      val isRootShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "isRootShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRootShape" }
        }
      val isUsingCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "isUsingCollision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUsingCollision" }
        }
      val setCalculateTangents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "setCalculateTangents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCalculateTangents" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "setCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionLayer" }
        }
      val setCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "setCollisionLayerBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionLayerBit" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "setCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "setCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMaskBit" }
        }
      val setOperation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "setOperation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOperation" }
        }
      val setSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "setSnap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSnap" }
        }
      val setUseCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "setUseCollision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseCollision" }
        }}
  }
}
