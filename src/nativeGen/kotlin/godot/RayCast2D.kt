// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RayCast2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var castTo: Vector2
    get() {
       return getCastTo() 
    }
    set(value) {
      setCastTo(value)
    }

  var collideWithAreas: Boolean
    get() {
       return isCollideWithAreasEnabled() 
    }
    set(value) {
      setCollideWithAreas(value)
    }

  var collideWithBodies: Boolean
    get() {
       return isCollideWithBodiesEnabled() 
    }
    set(value) {
      setCollideWithBodies(value)
    }

  var collisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var enabled: Boolean
    get() {
       return isEnabled() 
    }
    set(value) {
      setEnabled(value)
    }

  var excludeParent: Boolean
    get() {
       return getExcludeParentBody() 
    }
    set(value) {
      setExcludeParentBody(value)
    }

  fun addException(node: Object) {
    val _arg = Variant.new(node)
    __method_bind.addException.call(this._handle, _arg, 1)
  }

  fun addExceptionRid(rid: RID) {
    val _arg = Variant.new(rid)
    __method_bind.addExceptionRid.call(this._handle, _arg, 1)
  }

  fun clearExceptions() {
    __method_bind.clearExceptions.call(this._handle)
  }

  fun forceRaycastUpdate() {
    __method_bind.forceRaycastUpdate.call(this._handle)
  }

  fun getCastTo(): Vector2 {
    val _ret = __method_bind.getCastTo.call(this._handle)
    return _ret.asVector2()
  }

  fun getCollider(): Object {
    val _ret = __method_bind.getCollider.call(this._handle)
    return _ret.asObject(::Object)!!
  }

  fun getColliderShape(): Int {
    val _ret = __method_bind.getColliderShape.call(this._handle)
    return _ret.asInt()
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

  fun getCollisionNormal(): Vector2 {
    val _ret = __method_bind.getCollisionNormal.call(this._handle)
    return _ret.asVector2()
  }

  fun getCollisionPoint(): Vector2 {
    val _ret = __method_bind.getCollisionPoint.call(this._handle)
    return _ret.asVector2()
  }

  fun getExcludeParentBody(): Boolean {
    val _ret = __method_bind.getExcludeParentBody.call(this._handle)
    return _ret.asBoolean()
  }

  fun isCollideWithAreasEnabled(): Boolean {
    val _ret = __method_bind.isCollideWithAreasEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isCollideWithBodiesEnabled(): Boolean {
    val _ret = __method_bind.isCollideWithBodiesEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isColliding(): Boolean {
    val _ret = __method_bind.isColliding.call(this._handle)
    return _ret.asBoolean()
  }

  fun isEnabled(): Boolean {
    val _ret = __method_bind.isEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun removeException(node: Object) {
    val _arg = Variant.new(node)
    __method_bind.removeException.call(this._handle, _arg, 1)
  }

  fun removeExceptionRid(rid: RID) {
    val _arg = Variant.new(rid)
    __method_bind.removeExceptionRid.call(this._handle, _arg, 1)
  }

  fun setCastTo(localPoint: Vector2) {
    val _arg = Variant.new(localPoint)
    __method_bind.setCastTo.call(this._handle, _arg, 1)
  }

  fun setCollideWithAreas(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCollideWithAreas.call(this._handle, _arg, 1)
  }

  fun setCollideWithBodies(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCollideWithBodies.call(this._handle, _arg, 1)
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

  fun setEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setEnabled.call(this._handle, _arg, 1)
  }

  fun setExcludeParentBody(mask: Boolean) {
    val _arg = Variant.new(mask)
    __method_bind.setExcludeParentBody.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): RayCast2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RayCast2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RayCast2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RayCast2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RayCast2D = RayCast2D(ptr)
    /**
     * Container for method_bind pointers for RayCast2D
     */
    private object __method_bind {
      val addException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "addException".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addException" }
        }
      val addExceptionRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "addExceptionRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addExceptionRid" }
        }
      val clearExceptions: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "clearExceptions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearExceptions" }
        }
      val forceRaycastUpdate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "forceRaycastUpdate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method forceRaycastUpdate" }
        }
      val getCastTo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "getCastTo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCastTo" }
        }
      val getCollider: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "getCollider".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollider" }
        }
      val getColliderShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "getColliderShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColliderShape" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "getCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "getCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMaskBit" }
        }
      val getCollisionNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "getCollisionNormal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionNormal" }
        }
      val getCollisionPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "getCollisionPoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionPoint" }
        }
      val getExcludeParentBody: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "getExcludeParentBody".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExcludeParentBody" }
        }
      val isCollideWithAreasEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "isCollideWithAreasEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCollideWithAreasEnabled" }
        }
      val isCollideWithBodiesEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "isCollideWithBodiesEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCollideWithBodiesEnabled" }
        }
      val isColliding: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "isColliding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isColliding" }
        }
      val isEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "isEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEnabled" }
        }
      val removeException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "removeException".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeException" }
        }
      val removeExceptionRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "removeExceptionRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeExceptionRid" }
        }
      val setCastTo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "setCastTo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCastTo" }
        }
      val setCollideWithAreas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "setCollideWithAreas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollideWithAreas" }
        }
      val setCollideWithBodies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "setCollideWithBodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollideWithBodies" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "setCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "setCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMaskBit" }
        }
      val setEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "setEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEnabled" }
        }
      val setExcludeParentBody: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
            "setExcludeParentBody".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExcludeParentBody" }
        }}
  }
}
