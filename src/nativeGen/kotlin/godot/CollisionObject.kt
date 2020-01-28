// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CollisionObject(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var inputCaptureOnDrag: Boolean
    get() {
       return getCaptureInputOnDrag() 
    }
    set(value) {
      setCaptureInputOnDrag(value)
    }

  var inputRayPickable: Boolean
    get() {
       return isRayPickable() 
    }
    set(value) {
      setRayPickable(value)
    }

  fun createShapeOwner(owner: Object): Int {
    val _arg = Variant.new(owner)
    val _ret = __method_bind.createShapeOwner.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getCaptureInputOnDrag(): Boolean {
    val _ret = __method_bind.getCaptureInputOnDrag.call(this._handle)
    return _ret.asBoolean()
  }

  fun getRid(): RID {
    val _ret = __method_bind.getRid.call(this._handle)
    return _ret.asRID()
  }

  fun getShapeOwners(): VariantArray {
    val _ret = __method_bind.getShapeOwners.call(this._handle)
    return _ret.asVariantArray()
  }

  fun isRayPickable(): Boolean {
    val _ret = __method_bind.isRayPickable.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShapeOwnerDisabled(ownerId: Int): Boolean {
    val _arg = Variant.new(ownerId)
    val _ret = __method_bind.isShapeOwnerDisabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun removeShapeOwner(ownerId: Int) {
    val _arg = Variant.new(ownerId)
    __method_bind.removeShapeOwner.call(this._handle, _arg, 1)
  }

  fun setCaptureInputOnDrag(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCaptureInputOnDrag.call(this._handle, _arg, 1)
  }

  fun setRayPickable(rayPickable: Boolean) {
    val _arg = Variant.new(rayPickable)
    __method_bind.setRayPickable.call(this._handle, _arg, 1)
  }

  fun shapeFindOwner(shapeIndex: Int): Int {
    val _arg = Variant.new(shapeIndex)
    val _ret = __method_bind.shapeFindOwner.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun shapeOwnerAddShape(ownerId: Int, shape: Shape) {
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

  fun shapeOwnerGetShape(ownerId: Int, shapeId: Int): Shape {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(shapeId)
    val _ret = __method_bind.shapeOwnerGetShape.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Shape)!!
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

  fun shapeOwnerGetTransform(ownerId: Int): Transform {
    val _arg = Variant.new(ownerId)
    val _ret = __method_bind.shapeOwnerGetTransform.call(this._handle, _arg, 1)
    return _ret.asTransform()
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

  fun shapeOwnerSetTransform(ownerId: Int, transform: Transform) {
    val _args = VariantArray.new()
    _args.append(ownerId)
    _args.append(transform)
    __method_bind.shapeOwnerSetTransform.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    /**
     * Container for method_bind pointers for CollisionObject
     */
    private object __method_bind {
      val createShapeOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "createShapeOwner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createShapeOwner" }
        }
      val getCaptureInputOnDrag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "getCaptureInputOnDrag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCaptureInputOnDrag" }
        }
      val getRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "getRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRid" }
        }
      val getShapeOwners: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "getShapeOwners".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShapeOwners" }
        }
      val isRayPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "isRayPickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRayPickable" }
        }
      val isShapeOwnerDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "isShapeOwnerDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isShapeOwnerDisabled" }
        }
      val removeShapeOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "removeShapeOwner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeShapeOwner" }
        }
      val setCaptureInputOnDrag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "setCaptureInputOnDrag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCaptureInputOnDrag" }
        }
      val setRayPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "setRayPickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRayPickable" }
        }
      val shapeFindOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shapeFindOwner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeFindOwner" }
        }
      val shapeOwnerAddShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shapeOwnerAddShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerAddShape" }
        }
      val shapeOwnerClearShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shapeOwnerClearShapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerClearShapes" }
        }
      val shapeOwnerGetOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shapeOwnerGetOwner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerGetOwner" }
        }
      val shapeOwnerGetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shapeOwnerGetShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerGetShape" }
        }
      val shapeOwnerGetShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shapeOwnerGetShapeCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerGetShapeCount" }
        }
      val shapeOwnerGetShapeIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shapeOwnerGetShapeIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerGetShapeIndex" }
        }
      val shapeOwnerGetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shapeOwnerGetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerGetTransform" }
        }
      val shapeOwnerRemoveShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shapeOwnerRemoveShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerRemoveShape" }
        }
      val shapeOwnerSetDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shapeOwnerSetDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerSetDisabled" }
        }
      val shapeOwnerSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionObject".cstr.ptr,
            "shapeOwnerSetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeOwnerSetTransform" }
        }}
  }
}
