// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Transform2D
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

open class CollisionObject2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var inputPickable: Boolean
    get() {
       return isPickable() 
    }
    set(value) {
      setPickable(value)
    }

  fun createShapeOwner(owner: Object): Int {
    val _arg = Variant.new(owner)
    val _ret = __method_bind.createShapeOwner.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getRid(): RID {
    val _ret = __method_bind.getRid.call(this._handle)
    return _ret.asRID()
  }

  fun getShapeOwnerOneWayCollisionMargin(ownerId: Int): Float {
    val _arg = Variant.new(ownerId)
    val _ret = __method_bind.getShapeOwnerOneWayCollisionMargin.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getShapeOwners(): VariantArray {
    val _ret = __method_bind.getShapeOwners.call(this._handle)
    return _ret.asVariantArray()
  }

  fun isPickable(): Boolean {
    val _ret = __method_bind.isPickable.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShapeOwnerDisabled(ownerId: Int): Boolean {
    val _arg = Variant.new(ownerId)
    val _ret = __method_bind.isShapeOwnerDisabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isShapeOwnerOneWayCollisionEnabled(ownerId: Int): Boolean {
    val _arg = Variant.new(ownerId)
    val _ret = __method_bind.isShapeOwnerOneWayCollisionEnabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun removeShapeOwner(ownerId: Int) {
    val _arg = Variant.new(ownerId)
    __method_bind.removeShapeOwner.call(this._handle, _arg, 1)
  }

  fun setPickable(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setPickable.call(this._handle, _arg, 1)
  }

  fun shapeFindOwner(shapeIndex: Int): Int {
    val _arg = Variant.new(shapeIndex)
    val _ret = __method_bind.shapeFindOwner.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun shapeOwnerAddShape(ownerId: Int, shape: Shape2D) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(shape)
    __method_bind.shapeOwnerAddShape.call(this._handle, _args.toVariant(), 2)
  }

  fun shapeOwnerClearShapes(ownerId: Int) {
    val _arg = Variant.new(ownerId)
    __method_bind.shapeOwnerClearShapes.call(this._handle, _arg, 1)
  }

  fun shapeOwnerGetOwner(ownerId: Int): Object {
    val _arg = Variant.new(ownerId)
    val _ret = __method_bind.shapeOwnerGetOwner.call(this._handle, _arg, 1)
    return _ret.asObject(::Object)!!
  }

  fun shapeOwnerGetShape(ownerId: Int, shapeId: Int): Shape2D {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(shapeId)
    val _ret = __method_bind.shapeOwnerGetShape.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Shape2D)!!
  }

  fun shapeOwnerGetShapeCount(ownerId: Int): Int {
    val _arg = Variant.new(ownerId)
    val _ret = __method_bind.shapeOwnerGetShapeCount.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun shapeOwnerGetShapeIndex(ownerId: Int, shapeId: Int): Int {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(shapeId)
    val _ret = __method_bind.shapeOwnerGetShapeIndex.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun shapeOwnerGetTransform(ownerId: Int): Transform2D {
    val _arg = Variant.new(ownerId)
    val _ret = __method_bind.shapeOwnerGetTransform.call(this._handle, _arg, 1)
    return _ret.asTransform2D()
  }

  fun shapeOwnerRemoveShape(ownerId: Int, shapeId: Int) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(shapeId)
    __method_bind.shapeOwnerRemoveShape.call(this._handle, _args.toVariant(), 2)
  }

  fun shapeOwnerSetDisabled(ownerId: Int, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(disabled)
    __method_bind.shapeOwnerSetDisabled.call(this._handle, _args.toVariant(), 2)
  }

  fun shapeOwnerSetOneWayCollision(ownerId: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(enable)
    __method_bind.shapeOwnerSetOneWayCollision.call(this._handle, _args.toVariant(), 2)
  }

  fun shapeOwnerSetOneWayCollisionMargin(ownerId: Int, margin: Float) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(margin)
    __method_bind.shapeOwnerSetOneWayCollisionMargin.call(this._handle, _args.toVariant(), 2)
  }

  fun shapeOwnerSetTransform(ownerId: Int, transform: Transform2D) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(transform)
    __method_bind.shapeOwnerSetTransform.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    /**
     * Container for method_bind pointers for CollisionObject2D
     */
    private object __method_bind {
      val createShapeOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "createShapeOwner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createShapeOwner" }
        }
      val getRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "getRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRid" }
        }
      val getShapeOwnerOneWayCollisionMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "getShapeOwnerOneWayCollisionMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShapeOwnerOneWayCollisionMargin"
            }
        }
      val getShapeOwners: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "getShapeOwners".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShapeOwners" }
        }
      val isPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "isPickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPickable" }
        }
      val isShapeOwnerDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "isShapeOwnerDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isShapeOwnerDisabled" }
        }
      val isShapeOwnerOneWayCollisionEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "isShapeOwnerOneWayCollisionEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isShapeOwnerOneWayCollisionEnabled"
            }
        }
      val removeShapeOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "removeShapeOwner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeShapeOwner" }
        }
      val setPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "setPickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPickable" }
        }
      val shapeFindOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shapeFindOwner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeFindOwner" }
        }
      val shapeOwnerAddShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shapeOwnerAddShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerAddShape" }
        }
      val shapeOwnerClearShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shapeOwnerClearShapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerClearShapes" }
        }
      val shapeOwnerGetOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shapeOwnerGetOwner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerGetOwner" }
        }
      val shapeOwnerGetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shapeOwnerGetShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerGetShape" }
        }
      val shapeOwnerGetShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shapeOwnerGetShapeCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerGetShapeCount" }
        }
      val shapeOwnerGetShapeIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shapeOwnerGetShapeIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerGetShapeIndex" }
        }
      val shapeOwnerGetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shapeOwnerGetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerGetTransform" }
        }
      val shapeOwnerRemoveShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shapeOwnerRemoveShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerRemoveShape" }
        }
      val shapeOwnerSetDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shapeOwnerSetDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerSetDisabled" }
        }
      val shapeOwnerSetOneWayCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shapeOwnerSetOneWayCollision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerSetOneWayCollision" }
        }
      val shapeOwnerSetOneWayCollisionMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shapeOwnerSetOneWayCollisionMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerSetOneWayCollisionMargin"
            }
        }
      val shapeOwnerSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject2D".cstr.ptr,
            "shapeOwnerSetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerSetTransform" }
        }}
  }
}
