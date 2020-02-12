// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      __method_bind.applyScale.call(self._handle, listOf(ratio), null)
    }
  }

  fun getAngleTo(point: Vector2): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAngleTo.call(self._handle, listOf(point), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGlobalPosition(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getGlobalPosition.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getGlobalRotation(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGlobalRotation.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGlobalRotationDegrees(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGlobalRotationDegrees.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGlobalScale(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getGlobalScale.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPosition(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getPosition.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRelativeTransformToParent(parent: Node): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.getRelativeTransformToParent.call(self._handle, listOf(parent), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRotation(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRotation.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRotationDegrees(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRotationDegrees.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getScale(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getScale.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getZIndex(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getZIndex.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun globalTranslate(offset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.globalTranslate.call(self._handle, listOf(offset), null)
    }
  }

  fun isZRelative(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isZRelative.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun lookAt(point: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.lookAt.call(self._handle, listOf(point), null)
    }
  }

  fun moveLocalX(delta: Float, scaled: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(delta)
      _args.add(scaled)
      __method_bind.moveLocalX.call(self._handle, _args, null)
    }
  }

  fun moveLocalY(delta: Float, scaled: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(delta)
      _args.add(scaled)
      __method_bind.moveLocalY.call(self._handle, _args, null)
    }
  }

  fun rotate(radians: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.rotate.call(self._handle, listOf(radians), null)
    }
  }

  fun setGlobalPosition(position: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlobalPosition.call(self._handle, listOf(position), null)
    }
  }

  fun setGlobalRotation(radians: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlobalRotation.call(self._handle, listOf(radians), null)
    }
  }

  fun setGlobalRotationDegrees(degrees: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlobalRotationDegrees.call(self._handle, listOf(degrees), null)
    }
  }

  fun setGlobalScale(scale: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlobalScale.call(self._handle, listOf(scale), null)
    }
  }

  fun setGlobalTransform(xform: Transform2D) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlobalTransform.call(self._handle, listOf(xform), null)
    }
  }

  fun setPosition(position: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPosition.call(self._handle, listOf(position), null)
    }
  }

  fun setRotation(radians: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRotation.call(self._handle, listOf(radians), null)
    }
  }

  fun setRotationDegrees(degrees: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRotationDegrees.call(self._handle, listOf(degrees), null)
    }
  }

  fun setScale(scale: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScale.call(self._handle, listOf(scale), null)
    }
  }

  fun setTransform(xform: Transform2D) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTransform.call(self._handle, listOf(xform), null)
    }
  }

  fun setZAsRelative(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setZAsRelative.call(self._handle, listOf(enable), null)
    }
  }

  fun setZIndex(zIndex: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setZIndex.call(self._handle, listOf(zIndex), null)
    }
  }

  fun toGlobal(localPoint: Vector2): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.toGlobal.call(self._handle, listOf(localPoint), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun toLocal(globalPoint: Vector2): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.toLocal.call(self._handle, listOf(globalPoint), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun translate(offset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.translate.call(self._handle, listOf(offset), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "apply_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_scale" }
        }
      val getAngleTo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_angle_to".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_angle_to" }
        }
      val getGlobalPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_global_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_position" }
        }
      val getGlobalRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_global_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_rotation" }
        }
      val getGlobalRotationDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_global_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_rotation_degrees" }
        }
      val getGlobalScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_global_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_scale" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val getRelativeTransformToParent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_relative_transform_to_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_relative_transform_to_parent" }
        }
      val getRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation" }
        }
      val getRotationDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
        }
      val getScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scale" }
        }
      val getZIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "get_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_z_index" }
        }
      val globalTranslate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "global_translate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_translate" }
        }
      val isZRelative: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "is_z_relative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_z_relative" }
        }
      val lookAt: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "look_at".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method look_at" }
        }
      val moveLocalX: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "move_local_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_local_x" }
        }
      val moveLocalY: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "move_local_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_local_y" }
        }
      val rotate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "rotate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate" }
        }
      val setGlobalPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_global_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_position" }
        }
      val setGlobalRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_global_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_rotation" }
        }
      val setGlobalRotationDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_global_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_rotation_degrees" }
        }
      val setGlobalScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_global_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_scale" }
        }
      val setGlobalTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_global_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_transform" }
        }
      val setPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_position" }
        }
      val setRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation" }
        }
      val setRotationDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
        }
      val setScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scale" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform" }
        }
      val setZAsRelative: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_z_as_relative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_z_as_relative" }
        }
      val setZIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "set_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_z_index" }
        }
      val toGlobal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "to_global".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method to_global" }
        }
      val toLocal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "to_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method to_local" }
        }
      val translate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node2D".cstr.ptr,
            "translate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method translate" }
        }}
  }
}
