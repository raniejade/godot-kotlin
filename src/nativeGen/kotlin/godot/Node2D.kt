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
  fun applyScale(ratio: Vector2) {
    val _arg = Variant.new(ratio)
    __method_bind.apply_scale.call(this._handle, _arg, 1)
  }

  fun getAngleTo(point: Vector2): Float {
    val _arg = Variant.new(point)
    val _ret = __method_bind.get_angle_to.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getGlobalPosition(): Vector2 {
    val _ret = __method_bind.get_global_position.call(this._handle)
    return _ret.asVector2()
  }

  fun getGlobalRotation(): Float {
    val _ret = __method_bind.get_global_rotation.call(this._handle)
    return _ret.asFloat()
  }

  fun getGlobalRotationDegrees(): Float {
    val _ret = __method_bind.get_global_rotation_degrees.call(this._handle)
    return _ret.asFloat()
  }

  fun getGlobalScale(): Vector2 {
    val _ret = __method_bind.get_global_scale.call(this._handle)
    return _ret.asVector2()
  }

  fun getPosition(): Vector2 {
    val _ret = __method_bind.get_position.call(this._handle)
    return _ret.asVector2()
  }

  fun getRelativeTransformToParent(parent: Node): Transform2D {
    val _arg = Variant.new(parent)
    val _ret = __method_bind.get_relative_transform_to_parent.call(this._handle, _arg, 1)
    return _ret.asTransform2D()
  }

  fun getRotation(): Float {
    val _ret = __method_bind.get_rotation.call(this._handle)
    return _ret.asFloat()
  }

  fun getRotationDegrees(): Float {
    val _ret = __method_bind.get_rotation_degrees.call(this._handle)
    return _ret.asFloat()
  }

  fun getScale(): Vector2 {
    val _ret = __method_bind.get_scale.call(this._handle)
    return _ret.asVector2()
  }

  fun getZIndex(): Int {
    val _ret = __method_bind.get_z_index.call(this._handle)
    return _ret.asInt()
  }

  fun globalTranslate(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.global_translate.call(this._handle, _arg, 1)
  }

  fun isZRelative(): Boolean {
    val _ret = __method_bind.is_z_relative.call(this._handle)
    return _ret.asBool()
  }

  fun lookAt(point: Vector2) {
    val _arg = Variant.new(point)
    __method_bind.look_at.call(this._handle, _arg, 1)
  }

  fun moveLocalX(delta: Float, scaled: Boolean) {
    val _args = VariantArray.new()
    _args.append(delta)
    _args.append(scaled)
    __method_bind.move_local_x.call(this._handle, _args.toVariant(), 2)
  }

  fun moveLocalY(delta: Float, scaled: Boolean) {
    val _args = VariantArray.new()
    _args.append(delta)
    _args.append(scaled)
    __method_bind.move_local_y.call(this._handle, _args.toVariant(), 2)
  }

  fun rotate(radians: Float) {
    val _arg = Variant.new(radians)
    __method_bind.rotate.call(this._handle, _arg, 1)
  }

  fun setGlobalPosition(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.set_global_position.call(this._handle, _arg, 1)
  }

  fun setGlobalRotation(radians: Float) {
    val _arg = Variant.new(radians)
    __method_bind.set_global_rotation.call(this._handle, _arg, 1)
  }

  fun setGlobalRotationDegrees(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.set_global_rotation_degrees.call(this._handle, _arg, 1)
  }

  fun setGlobalScale(scale: Vector2) {
    val _arg = Variant.new(scale)
    __method_bind.set_global_scale.call(this._handle, _arg, 1)
  }

  fun setGlobalTransform(xform: Transform2D) {
    val _arg = Variant.new(xform)
    __method_bind.set_global_transform.call(this._handle, _arg, 1)
  }

  fun setPosition(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.set_position.call(this._handle, _arg, 1)
  }

  fun setRotation(radians: Float) {
    val _arg = Variant.new(radians)
    __method_bind.set_rotation.call(this._handle, _arg, 1)
  }

  fun setRotationDegrees(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.set_rotation_degrees.call(this._handle, _arg, 1)
  }

  fun setScale(scale: Vector2) {
    val _arg = Variant.new(scale)
    __method_bind.set_scale.call(this._handle, _arg, 1)
  }

  fun setTransform(xform: Transform2D) {
    val _arg = Variant.new(xform)
    __method_bind.set_transform.call(this._handle, _arg, 1)
  }

  fun setZAsRelative(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_z_as_relative.call(this._handle, _arg, 1)
  }

  fun setZIndex(zIndex: Int) {
    val _arg = Variant.new(zIndex)
    __method_bind.set_z_index.call(this._handle, _arg, 1)
  }

  fun toGlobal(localPoint: Vector2): Vector2 {
    val _arg = Variant.new(localPoint)
    val _ret = __method_bind.to_global.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun toLocal(globalPoint: Vector2): Vector2 {
    val _arg = Variant.new(globalPoint)
    val _ret = __method_bind.to_local.call(this._handle, _arg, 1)
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
      val apply_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "apply_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_scale" }
        }
      val get_angle_to: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_angle_to".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_angle_to" }
        }
      val get_global_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_global_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_position" }
        }
      val get_global_rotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_global_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_rotation" }
        }
      val get_global_rotation_degrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_global_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_rotation_degrees" }
        }
      val get_global_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_global_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_scale" }
        }
      val get_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val get_relative_transform_to_parent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_relative_transform_to_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_relative_transform_to_parent" }
        }
      val get_rotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation" }
        }
      val get_rotation_degrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
        }
      val get_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scale" }
        }
      val get_z_index: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_z_index" }
        }
      val global_translate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "global_translate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_translate" }
        }
      val is_z_relative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "is_z_relative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_z_relative" }
        }
      val look_at: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "look_at".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method look_at" }
        }
      val move_local_x: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "move_local_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_local_x" }
        }
      val move_local_y: CPointer<godot_method_bind>
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
      val set_global_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_global_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_position" }
        }
      val set_global_rotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_global_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_rotation" }
        }
      val set_global_rotation_degrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_global_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_rotation_degrees" }
        }
      val set_global_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_global_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_scale" }
        }
      val set_global_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_global_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_transform" }
        }
      val set_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_position" }
        }
      val set_rotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation" }
        }
      val set_rotation_degrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
        }
      val set_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scale" }
        }
      val set_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform" }
        }
      val set_z_as_relative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_z_as_relative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_z_as_relative" }
        }
      val set_z_index: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_z_index" }
        }
      val to_global: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "to_global".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method to_global" }
        }
      val to_local: CPointer<godot_method_bind>
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
