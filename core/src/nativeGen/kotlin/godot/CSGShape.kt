// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.reflect.KCallable
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

  var operation: Operation
    get() {
       return getOperation() 
    }
    set(value) {
      setOperation(value.value)
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
    val _ret = __method_bind.getCollisionLayerBit.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionMaskBit.call(this._handle, listOf(_arg))
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
    __method_bind.setCalculateTangents.call(this._handle, listOf(_arg))
  }

  fun setCollisionLayer(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.setCollisionLayer.call(this._handle, listOf(_arg))
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bit))
    _args.add(Variant.fromAny(value))
    __method_bind.setCollisionLayerBit.call(this._handle, _args)
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setCollisionMask.call(this._handle, listOf(_arg))
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bit))
    _args.add(Variant.fromAny(value))
    __method_bind.setCollisionMaskBit.call(this._handle, _args)
  }

  fun setOperation(operation: Int) {
    val _arg = Variant.new(operation)
    __method_bind.setOperation.call(this._handle, listOf(_arg))
  }

  fun setSnap(snap: Float) {
    val _arg = Variant.new(snap)
    __method_bind.setSnap.call(this._handle, listOf(_arg))
  }

  fun setUseCollision(operation: Boolean) {
    val _arg = Variant.new(operation)
    __method_bind.setUseCollision.call(this._handle, listOf(_arg))
  }

  enum class Operation(
    val value: Int
  ) {
    UNION(0),

    INTERSECTION(1),

    SUBTRACTION(2);

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
    /**
     * Container for method_bind pointers for CSGShape
     */
    private object __method_bind {
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
        }
      val getCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "get_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val getMeshes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "get_meshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_meshes" }
        }
      val getOperation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "get_operation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_operation" }
        }
      val getSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "get_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_snap" }
        }
      val isCalculatingTangents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "is_calculating_tangents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_calculating_tangents" }
        }
      val isRootShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "is_root_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_root_shape" }
        }
      val isUsingCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "is_using_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_collision" }
        }
      val setCalculateTangents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "set_calculate_tangents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_calculate_tangents" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
        }
      val setCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "set_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val setOperation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "set_operation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_operation" }
        }
      val setSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "set_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_snap" }
        }
      val setUseCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
            "set_use_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_collision" }
        }}
  }
}
