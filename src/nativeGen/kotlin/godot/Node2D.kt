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
