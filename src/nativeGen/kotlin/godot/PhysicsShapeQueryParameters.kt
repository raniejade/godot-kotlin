// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Transform
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

open class PhysicsShapeQueryParameters(
  _handle: COpaquePointer
) : Reference(_handle) {
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

  var exclude: VariantArray
    get() {
       return getExclude() 
    }
    set(value) {
      setExclude(value)
    }

  var margin: Float
    get() {
       return getMargin() 
    }
    set(value) {
      setMargin(value)
    }

  var shapeRid: RID
    get() {
       return getShapeRid() 
    }
    set(value) {
      setShapeRid(value)
    }

  var transform: Transform
    get() {
       return getTransform() 
    }
    set(value) {
      setTransform(value)
    }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getExclude(): VariantArray {
    val _ret = __method_bind.getExclude.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getMargin(): Float {
    val _ret = __method_bind.getMargin.call(this._handle)
    return _ret.asFloat()
  }

  fun getShapeRid(): RID {
    val _ret = __method_bind.getShapeRid.call(this._handle)
    return _ret.asRID()
  }

  fun getTransform(): Transform {
    val _ret = __method_bind.getTransform.call(this._handle)
    return _ret.asTransform()
  }

  fun isCollideWithAreasEnabled(): Boolean {
    val _ret = __method_bind.isCollideWithAreasEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isCollideWithBodiesEnabled(): Boolean {
    val _ret = __method_bind.isCollideWithBodiesEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setCollideWithAreas(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCollideWithAreas.call(this._handle, _arg, 1)
  }

  fun setCollideWithBodies(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCollideWithBodies.call(this._handle, _arg, 1)
  }

  fun setCollisionMask(collisionMask: Int) {
    val _arg = Variant.new(collisionMask)
    __method_bind.setCollisionMask.call(this._handle, _arg, 1)
  }

  fun setExclude(exclude: VariantArray) {
    val _arg = Variant.new(exclude)
    __method_bind.setExclude.call(this._handle, _arg, 1)
  }

  fun setMargin(margin: Float) {
    val _arg = Variant.new(margin)
    __method_bind.setMargin.call(this._handle, _arg, 1)
  }

  fun setShape(shape: Resource) {
    val _arg = Variant.new(shape)
    __method_bind.setShape.call(this._handle, _arg, 1)
  }

  fun setShapeRid(shape: RID) {
    val _arg = Variant.new(shape)
    __method_bind.setShapeRid.call(this._handle, _arg, 1)
  }

  fun setTransform(transform: Transform) {
    val _arg = Variant.new(transform)
    __method_bind.setTransform.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): PhysicsShapeQueryParameters = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PhysicsShapeQueryParameters".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PhysicsShapeQueryParameters" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PhysicsShapeQueryParameters(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PhysicsShapeQueryParameters = PhysicsShapeQueryParameters(ptr)
    /**
     * Container for method_bind pointers for PhysicsShapeQueryParameters
     */
    private object __method_bind {
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "getCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMask" }
        }
      val getExclude: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "getExclude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExclude" }
        }
      val getMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "getMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMargin" }
        }
      val getShapeRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "getShapeRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShapeRid" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "getTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTransform" }
        }
      val isCollideWithAreasEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "isCollideWithAreasEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCollideWithAreasEnabled" }
        }
      val isCollideWithBodiesEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "isCollideWithBodiesEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCollideWithBodiesEnabled" }
        }
      val setCollideWithAreas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "setCollideWithAreas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollideWithAreas" }
        }
      val setCollideWithBodies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "setCollideWithBodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollideWithBodies" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "setCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMask" }
        }
      val setExclude: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "setExclude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExclude" }
        }
      val setMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "setMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMargin" }
        }
      val setShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "setShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShape" }
        }
      val setShapeRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "setShapeRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShapeRid" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "setTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTransform" }
        }}
  }
}
