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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Node2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : CanvasItem(null) {
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

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for globalPosition
   */
  fun globalPosition(cb: Vector2.() -> Unit) {
    val _p = globalPosition
    cb(_p)
    globalPosition = _p
  }

  /**
   * Specialized setter for globalScale
   */
  fun globalScale(cb: Vector2.() -> Unit) {
    val _p = globalScale
    cb(_p)
    globalScale = _p
  }

  /**
   * Specialized setter for globalTransform
   */
  fun globalTransform(cb: Transform2D.() -> Unit) {
    val _p = globalTransform
    cb(_p)
    globalTransform = _p
  }

  /**
   * Specialized setter for position
   */
  fun position(cb: Vector2.() -> Unit) {
    val _p = position
    cb(_p)
    position = _p
  }

  /**
   * Specialized setter for scale
   */
  fun scale(cb: Vector2.() -> Unit) {
    val _p = scale
    cb(_p)
    scale = _p
  }

  /**
   * Specialized setter for transform
   */
  fun transform(cb: Transform2D.() -> Unit) {
    val _p = transform
    cb(_p)
    transform = _p
  }

  fun applyScale(ratio: Vector2) {
    val _arg = Variant(ratio)
    __method_bind.applyScale.call(this._handle, listOf(_arg))
  }

  fun getAngleTo(point: Vector2): Float {
    val _arg = Variant(point)
    val _ret = __method_bind.getAngleTo.call(this._handle, listOf(_arg))
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
    val _arg = Variant(parent)
    val _ret = __method_bind.getRelativeTransformToParent.call(this._handle, listOf(_arg))
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
    val _arg = Variant(offset)
    __method_bind.globalTranslate.call(this._handle, listOf(_arg))
  }

  fun isZRelative(): Boolean {
    val _ret = __method_bind.isZRelative.call(this._handle)
    return _ret.asBoolean()
  }

  fun lookAt(point: Vector2) {
    val _arg = Variant(point)
    __method_bind.lookAt.call(this._handle, listOf(_arg))
  }

  fun moveLocalX(delta: Float, scaled: Boolean = false) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(delta))
    _args.add(Variant.fromAny(scaled))
    __method_bind.moveLocalX.call(this._handle, _args)
  }

  fun moveLocalY(delta: Float, scaled: Boolean = false) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(delta))
    _args.add(Variant.fromAny(scaled))
    __method_bind.moveLocalY.call(this._handle, _args)
  }

  fun rotate(radians: Float) {
    val _arg = Variant(radians)
    __method_bind.rotate.call(this._handle, listOf(_arg))
  }

  fun setGlobalPosition(position: Vector2) {
    val _arg = Variant(position)
    __method_bind.setGlobalPosition.call(this._handle, listOf(_arg))
  }

  fun setGlobalRotation(radians: Float) {
    val _arg = Variant(radians)
    __method_bind.setGlobalRotation.call(this._handle, listOf(_arg))
  }

  fun setGlobalRotationDegrees(degrees: Float) {
    val _arg = Variant(degrees)
    __method_bind.setGlobalRotationDegrees.call(this._handle, listOf(_arg))
  }

  fun setGlobalScale(scale: Vector2) {
    val _arg = Variant(scale)
    __method_bind.setGlobalScale.call(this._handle, listOf(_arg))
  }

  fun setGlobalTransform(xform: Transform2D) {
    val _arg = Variant(xform)
    __method_bind.setGlobalTransform.call(this._handle, listOf(_arg))
  }

  fun setPosition(position: Vector2) {
    val _arg = Variant(position)
    __method_bind.setPosition.call(this._handle, listOf(_arg))
  }

  fun setRotation(radians: Float) {
    val _arg = Variant(radians)
    __method_bind.setRotation.call(this._handle, listOf(_arg))
  }

  fun setRotationDegrees(degrees: Float) {
    val _arg = Variant(degrees)
    __method_bind.setRotationDegrees.call(this._handle, listOf(_arg))
  }

  fun setScale(scale: Vector2) {
    val _arg = Variant(scale)
    __method_bind.setScale.call(this._handle, listOf(_arg))
  }

  fun setTransform(xform: Transform2D) {
    val _arg = Variant(xform)
    __method_bind.setTransform.call(this._handle, listOf(_arg))
  }

  fun setZAsRelative(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setZAsRelative.call(this._handle, listOf(_arg))
  }

  fun setZIndex(zIndex: Int) {
    val _arg = Variant(zIndex)
    __method_bind.setZIndex.call(this._handle, listOf(_arg))
  }

  fun toGlobal(localPoint: Vector2): Vector2 {
    val _arg = Variant(localPoint)
    val _ret = __method_bind.toGlobal.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun toLocal(globalPoint: Vector2): Vector2 {
    val _arg = Variant(globalPoint)
    val _ret = __method_bind.toLocal.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun translate(offset: Vector2) {
    val _arg = Variant(offset)
    __method_bind.translate.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Node2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Node2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Node2D
     */
    private object __method_bind {
      val applyScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "apply_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_scale" }
        }
      val getAngleTo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_angle_to".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_angle_to" }
        }
      val getGlobalPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_global_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_position" }
        }
      val getGlobalRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_global_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_rotation" }
        }
      val getGlobalRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_global_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_rotation_degrees" }
        }
      val getGlobalScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_global_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_scale" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val getRelativeTransformToParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_relative_transform_to_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_relative_transform_to_parent" }
        }
      val getRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation" }
        }
      val getRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
        }
      val getScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scale" }
        }
      val getZIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_z_index" }
        }
      val globalTranslate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "global_translate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_translate" }
        }
      val isZRelative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "is_z_relative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_z_relative" }
        }
      val lookAt: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "look_at".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method look_at" }
        }
      val moveLocalX: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "move_local_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_local_x" }
        }
      val moveLocalY: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "move_local_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_local_y" }
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
            "set_global_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_position" }
        }
      val setGlobalRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_global_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_rotation" }
        }
      val setGlobalRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_global_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_rotation_degrees" }
        }
      val setGlobalScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_global_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_scale" }
        }
      val setGlobalTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_global_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_transform" }
        }
      val setPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_position" }
        }
      val setRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation" }
        }
      val setRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
        }
      val setScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scale" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform" }
        }
      val setZAsRelative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_z_as_relative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_z_as_relative" }
        }
      val setZIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_z_index" }
        }
      val toGlobal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "to_global".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method to_global" }
        }
      val toLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "to_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method to_local" }
        }
      val translate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "translate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method translate" }
        }}
  }
}
