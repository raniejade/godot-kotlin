// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class Node2D(
  _handle: COpaquePointer
) : CanvasItem(_handle) {
  var globalPosition: Vector2
    get() {
       return getGlobalPosition() 
    }
    set(value) {
      setGlobalPosition(value)
    }

  var globalRotation: Float
    get() {
       return getGlobalRotation() 
    }
    set(value) {
      setGlobalRotation(value)
    }

  var globalRotationDegrees: Float
    get() {
       return getGlobalRotationDegrees() 
    }
    set(value) {
      setGlobalRotationDegrees(value)
    }

  var globalScale: Vector2
    get() {
       return getGlobalScale() 
    }
    set(value) {
      setGlobalScale(value)
    }

  var globalTransform: Transform2D
    get() {
       return getGlobalTransform() 
    }
    set(value) {
      setGlobalTransform(value)
    }

  var position: Vector2
    get() {
       return getPosition() 
    }
    set(value) {
      setPosition(value)
    }

  var rotation: Float
    get() {
       return getRotation() 
    }
    set(value) {
      setRotation(value)
    }

  var rotationDegrees: Float
    get() {
       return getRotationDegrees() 
    }
    set(value) {
      setRotationDegrees(value)
    }

  var scale: Vector2
    get() {
       return getScale() 
    }
    set(value) {
      setScale(value)
    }

  var transform: Transform2D
    get() {
       return getTransform() 
    }
    set(value) {
      setTransform(value)
    }

  var zAsRelative: Boolean
    get() {
       return isZRelative() 
    }
    set(value) {
      setZAsRelative(value)
    }

  var zIndex: Int
    get() {
       return getZIndex() 
    }
    set(value) {
      setZIndex(value)
    }

  fun applyScale(ratio: Vector2) {
    val _arg = Variant.new(ratio)
    __method_bind.applyScale.call(this._handle, _arg, 1)
  }

  fun getAngleTo(point: Vector2): Float {
    val _arg = Variant.new(point)
    val _ret = __method_bind.getAngleTo.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getGlobalPosition(): Vector2 {
    val _ret = __method_bind.getGlobalPosition.call(this._handle)
    return _ret.asVector2()
  }

  fun getGlobalRotation(): Float {
    val _ret = __method_bind.getGlobalRotation.call(this._handle)
    return _ret.asFloat()
  }

  fun getGlobalRotationDegrees(): Float {
    val _ret = __method_bind.getGlobalRotationDegrees.call(this._handle)
    return _ret.asFloat()
  }

  fun getGlobalScale(): Vector2 {
    val _ret = __method_bind.getGlobalScale.call(this._handle)
    return _ret.asVector2()
  }

  fun getPosition(): Vector2 {
    val _ret = __method_bind.getPosition.call(this._handle)
    return _ret.asVector2()
  }

  fun getRelativeTransformToParent(parent: Node): Transform2D {
    val _arg = Variant.new(parent)
    val _ret = __method_bind.getRelativeTransformToParent.call(this._handle, _arg, 1)
    return _ret.asTransform2D()
  }

  fun getRotation(): Float {
    val _ret = __method_bind.getRotation.call(this._handle)
    return _ret.asFloat()
  }

  fun getRotationDegrees(): Float {
    val _ret = __method_bind.getRotationDegrees.call(this._handle)
    return _ret.asFloat()
  }

  fun getScale(): Vector2 {
    val _ret = __method_bind.getScale.call(this._handle)
    return _ret.asVector2()
  }

  fun getZIndex(): Int {
    val _ret = __method_bind.getZIndex.call(this._handle)
    return _ret.asInt()
  }

  fun globalTranslate(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.globalTranslate.call(this._handle, _arg, 1)
  }

  fun isZRelative(): Boolean {
    val _ret = __method_bind.isZRelative.call(this._handle)
    return _ret.asBoolean()
  }

  fun lookAt(point: Vector2) {
    val _arg = Variant.new(point)
    __method_bind.lookAt.call(this._handle, _arg, 1)
  }

  fun moveLocalX(delta: Float, scaled: Boolean) {
    val _args = VariantArray.new()
    _args.append(delta)
    _args.append(scaled)
    __method_bind.moveLocalX.call(this._handle, _args.toVariant(), 2)
  }

  fun moveLocalY(delta: Float, scaled: Boolean) {
    val _args = VariantArray.new()
    _args.append(delta)
    _args.append(scaled)
    __method_bind.moveLocalY.call(this._handle, _args.toVariant(), 2)
  }

  fun rotate(radians: Float) {
    val _arg = Variant.new(radians)
    __method_bind.rotate.call(this._handle, _arg, 1)
  }

  fun setGlobalPosition(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.setGlobalPosition.call(this._handle, _arg, 1)
  }

  fun setGlobalRotation(radians: Float) {
    val _arg = Variant.new(radians)
    __method_bind.setGlobalRotation.call(this._handle, _arg, 1)
  }

  fun setGlobalRotationDegrees(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setGlobalRotationDegrees.call(this._handle, _arg, 1)
  }

  fun setGlobalScale(scale: Vector2) {
    val _arg = Variant.new(scale)
    __method_bind.setGlobalScale.call(this._handle, _arg, 1)
  }

  fun setGlobalTransform(xform: Transform2D) {
    val _arg = Variant.new(xform)
    __method_bind.setGlobalTransform.call(this._handle, _arg, 1)
  }

  fun setPosition(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.setPosition.call(this._handle, _arg, 1)
  }

  fun setRotation(radians: Float) {
    val _arg = Variant.new(radians)
    __method_bind.setRotation.call(this._handle, _arg, 1)
  }

  fun setRotationDegrees(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setRotationDegrees.call(this._handle, _arg, 1)
  }

  fun setScale(scale: Vector2) {
    val _arg = Variant.new(scale)
    __method_bind.setScale.call(this._handle, _arg, 1)
  }

  fun setTransform(xform: Transform2D) {
    val _arg = Variant.new(xform)
    __method_bind.setTransform.call(this._handle, _arg, 1)
  }

  fun setZAsRelative(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setZAsRelative.call(this._handle, _arg, 1)
  }

  fun setZIndex(zIndex: Int) {
    val _arg = Variant.new(zIndex)
    __method_bind.setZIndex.call(this._handle, _arg, 1)
  }

  fun toGlobal(localPoint: Vector2): Vector2 {
    val _arg = Variant.new(localPoint)
    val _ret = __method_bind.toGlobal.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun toLocal(globalPoint: Vector2): Vector2 {
    val _arg = Variant.new(globalPoint)
    val _ret = __method_bind.toLocal.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun translate(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.translate.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): Node2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Node2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Node2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Node2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Node2D = Node2D(ptr)
    /**
     * Container for method_bind pointers for Node2D
     */
    private object __method_bind {
      val applyScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "applyScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method applyScale" }
        }
      val getAngleTo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "getAngleTo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAngleTo" }
        }
      val getGlobalPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "getGlobalPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlobalPosition" }
        }
      val getGlobalRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "getGlobalRotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlobalRotation" }
        }
      val getGlobalRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "getGlobalRotationDegrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlobalRotationDegrees" }
        }
      val getGlobalScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "getGlobalScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlobalScale" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "getPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPosition" }
        }
      val getRelativeTransformToParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "getRelativeTransformToParent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRelativeTransformToParent" }
        }
      val getRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "getRotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRotation" }
        }
      val getRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "getRotationDegrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRotationDegrees" }
        }
      val getScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "getScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScale" }
        }
      val getZIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "getZIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getZIndex" }
        }
      val globalTranslate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "globalTranslate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method globalTranslate" }
        }
      val isZRelative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "isZRelative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isZRelative" }
        }
      val lookAt: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "lookAt".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lookAt" }
        }
      val moveLocalX: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "moveLocalX".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveLocalX" }
        }
      val moveLocalY: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "moveLocalY".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveLocalY" }
        }
      val rotate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "rotate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate" }
        }
      val setGlobalPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "setGlobalPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlobalPosition" }
        }
      val setGlobalRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "setGlobalRotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlobalRotation" }
        }
      val setGlobalRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "setGlobalRotationDegrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlobalRotationDegrees" }
        }
      val setGlobalScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "setGlobalScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlobalScale" }
        }
      val setGlobalTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "setGlobalTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlobalTransform" }
        }
      val setPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "setPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPosition" }
        }
      val setRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "setRotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRotation" }
        }
      val setRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "setRotationDegrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRotationDegrees" }
        }
      val setScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "setScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setScale" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "setTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTransform" }
        }
      val setZAsRelative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "setZAsRelative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setZAsRelative" }
        }
      val setZIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "setZIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setZIndex" }
        }
      val toGlobal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "toGlobal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method toGlobal" }
        }
      val toLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "toLocal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method toLocal" }
        }
      val translate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "translate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method translate" }
        }}
  }
}
