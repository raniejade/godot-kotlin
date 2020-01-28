// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
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

open class SpringArm(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var collisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var margin: Float
    get() {
       return getMargin() 
    }
    set(value) {
      setMargin(value)
    }

  var shape: Shape
    get() {
       return getShape() 
    }
    set(value) {
      setShape(value)
    }

  var springLength: Float
    get() {
       return getLength() 
    }
    set(value) {
      setLength(value)
    }

  fun addExcludedObject(rID: RID) {
    val _arg = Variant.new(rID)
    __method_bind.addExcludedObject.call(this._handle, _arg, 1)
  }

  fun clearExcludedObjects() {
    __method_bind.clearExcludedObjects.call(this._handle)
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getHitLength(): Float {
    val _ret = __method_bind.getHitLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getLength(): Float {
    val _ret = __method_bind.getLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getMargin(): Float {
    val _ret = __method_bind.getMargin.call(this._handle)
    return _ret.asFloat()
  }

  fun getShape(): Shape {
    val _ret = __method_bind.getShape.call(this._handle)
    return _ret.asObject(::Shape)!!
  }

  fun removeExcludedObject(rID: RID): Boolean {
    val _arg = Variant.new(rID)
    val _ret = __method_bind.removeExcludedObject.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setCollisionMask.call(this._handle, _arg, 1)
  }

  fun setLength(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.setLength.call(this._handle, _arg, 1)
  }

  fun setMargin(margin: Float) {
    val _arg = Variant.new(margin)
    __method_bind.setMargin.call(this._handle, _arg, 1)
  }

  fun setShape(shape: Shape) {
    val _arg = Variant.new(shape)
    __method_bind.setShape.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): SpringArm = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpringArm".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SpringArm" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SpringArm(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SpringArm = SpringArm(ptr)
    /**
     * Container for method_bind pointers for SpringArm
     */
    private object __method_bind {
      val addExcludedObject: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "addExcludedObject".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addExcludedObject" }
        }
      val clearExcludedObjects: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "clearExcludedObjects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearExcludedObjects" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "getCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMask" }
        }
      val getHitLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "getHitLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHitLength" }
        }
      val getLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "getLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLength" }
        }
      val getMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "getMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMargin" }
        }
      val getShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "getShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShape" }
        }
      val removeExcludedObject: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "removeExcludedObject".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeExcludedObject" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "setCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMask" }
        }
      val setLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "setLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLength" }
        }
      val setMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "setMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMargin" }
        }
      val setShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "setShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShape" }
        }}
  }
}
