// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Transform2D
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

open class Physics2DShapeQueryParameters(
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

  var collisionLayer: Int
    get() {
       return getCollisionLayer() 
    }
    set(value) {
      setCollisionLayer(value)
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

  var motion: Vector2
    get() {
       return getMotion() 
    }
    set(value) {
      setMotion(value)
    }

  var shapeRid: RID
    get() {
       return getShapeRid() 
    }
    set(value) {
      setShapeRid(value)
    }

  var transform: Transform2D
    get() {
       return getTransform() 
    }
    set(value) {
      setTransform(value)
    }

  fun getCollisionLayer(): Int {
    val _ret = __method_bind.getCollisionLayer.call(this._handle)
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

  fun getMotion(): Vector2 {
    val _ret = __method_bind.getMotion.call(this._handle)
    return _ret.asVector2()
  }

  fun getShapeRid(): RID {
    val _ret = __method_bind.getShapeRid.call(this._handle)
    return _ret.asRID()
  }

  fun getTransform(): Transform2D {
    val _ret = __method_bind.getTransform.call(this._handle)
    return _ret.asTransform2D()
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

  fun setCollisionLayer(collisionLayer: Int) {
    val _arg = Variant.new(collisionLayer)
    __method_bind.setCollisionLayer.call(this._handle, _arg, 1)
  }

  fun setExclude(exclude: VariantArray) {
    val _arg = Variant.new(exclude)
    __method_bind.setExclude.call(this._handle, _arg, 1)
  }

  fun setMargin(margin: Float) {
    val _arg = Variant.new(margin)
    __method_bind.setMargin.call(this._handle, _arg, 1)
  }

  fun setMotion(motion: Vector2) {
    val _arg = Variant.new(motion)
    __method_bind.setMotion.call(this._handle, _arg, 1)
  }

  fun setShape(shape: Resource) {
    val _arg = Variant.new(shape)
    __method_bind.setShape.call(this._handle, _arg, 1)
  }

  fun setShapeRid(shape: RID) {
    val _arg = Variant.new(shape)
    __method_bind.setShapeRid.call(this._handle, _arg, 1)
  }

  fun setTransform(transform: Transform2D) {
    val _arg = Variant.new(transform)
    __method_bind.setTransform.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): Physics2DShapeQueryParameters = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("Physics2DShapeQueryParameters".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Physics2DShapeQueryParameters" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Physics2DShapeQueryParameters(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Physics2DShapeQueryParameters =
        Physics2DShapeQueryParameters(ptr)
    /**
     * Container for method_bind pointers for Physics2DShapeQueryParameters
     */
    private object __method_bind {
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "getCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionLayer" }
        }
      val getExclude: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "getExclude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExclude" }
        }
      val getMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "getMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMargin" }
        }
      val getMotion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "getMotion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMotion" }
        }
      val getShapeRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "getShapeRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShapeRid" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "getTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTransform" }
        }
      val isCollideWithAreasEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "isCollideWithAreasEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCollideWithAreasEnabled" }
        }
      val isCollideWithBodiesEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "isCollideWithBodiesEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCollideWithBodiesEnabled" }
        }
      val setCollideWithAreas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "setCollideWithAreas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollideWithAreas" }
        }
      val setCollideWithBodies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "setCollideWithBodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollideWithBodies" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "setCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionLayer" }
        }
      val setExclude: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "setExclude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExclude" }
        }
      val setMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "setMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMargin" }
        }
      val setMotion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "setMotion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMotion" }
        }
      val setShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "setShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShape" }
        }
      val setShapeRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "setShapeRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShapeRid" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DShapeQueryParameters".cstr.ptr,
            "setTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTransform" }
        }}
  }
}
