// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
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

open class Spatial(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  var gizmo: SpatialGizmo
    get() {
       return getGizmo() 
    }
    set(value) {
      setGizmo(value)
    }

  var globalTransform: Transform
    get() {
       return getGlobalTransform() 
    }
    set(value) {
      setGlobalTransform(value)
    }

  var rotation: Vector3
    get() {
       return getRotation() 
    }
    set(value) {
      setRotation(value)
    }

  var rotationDegrees: Vector3
    get() {
       return getRotationDegrees() 
    }
    set(value) {
      setRotationDegrees(value)
    }

  var scale: Vector3
    get() {
       return getScale() 
    }
    set(value) {
      setScale(value)
    }

  var transform: Transform
    get() {
       return getTransform() 
    }
    set(value) {
      setTransform(value)
    }

  var translation: Vector3
    get() {
       return getTranslation() 
    }
    set(value) {
      setTranslation(value)
    }

  var visible: Boolean
    get() {
       return isVisible() 
    }
    set(value) {
      setVisible(value)
    }

  /**
   * Spatial::visibility_changed signal
   */
  val signalVisibilityChanged: Signal0 = Signal0("visibility_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for globalTransform
   */
  fun globalTransform(cb: Transform.() -> Unit) {
    val _p = globalTransform
    cb(_p)
    globalTransform = _p
  }

  /**
   * Specialized setter for rotation
   */
  fun rotation(cb: Vector3.() -> Unit) {
    val _p = rotation
    cb(_p)
    rotation = _p
  }

  /**
   * Specialized setter for rotationDegrees
   */
  fun rotationDegrees(cb: Vector3.() -> Unit) {
    val _p = rotationDegrees
    cb(_p)
    rotationDegrees = _p
  }

  /**
   * Specialized setter for scale
   */
  fun scale(cb: Vector3.() -> Unit) {
    val _p = scale
    cb(_p)
    scale = _p
  }

  /**
   * Specialized setter for transform
   */
  fun transform(cb: Transform.() -> Unit) {
    val _p = transform
    cb(_p)
    transform = _p
  }

  /**
   * Specialized setter for translation
   */
  fun translation(cb: Vector3.() -> Unit) {
    val _p = translation
    cb(_p)
    translation = _p
  }

  fun forceUpdateTransform() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.forceUpdateTransform.call(self._handle, emptyList(), null)
    }
  }

  fun getGizmo(): SpatialGizmo {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: SpatialGizmo
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getGizmo.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<SpatialGizmo>(_tmp.value!!)
      _ret
    }
  }

  fun getGlobalTransform(): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getGlobalTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getParentSpatial(): Spatial {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Spatial
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getParentSpatial.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Spatial>(_tmp.value!!)
      _ret
    }
  }

  fun getRotation(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getRotation.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRotationDegrees(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getRotationDegrees.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getScale(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getScale.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTransform(): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTranslation(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getTranslation.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getWorld(): World {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: World
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getWorld.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<World>(_tmp.value!!)
      _ret
    }
  }

  fun globalRotate(axis: Vector3, angle: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(axis)
      _args.add(angle)
      __method_bind.globalRotate.call(self._handle, _args, null)
    }
  }

  fun globalScale(scale: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.globalScale.call(self._handle, listOf(scale), null)
    }
  }

  fun globalTranslate(offset: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.globalTranslate.call(self._handle, listOf(offset), null)
    }
  }

  fun hide() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.hide.call(self._handle, emptyList(), null)
    }
  }

  fun isLocalTransformNotificationEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isLocalTransformNotificationEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isScaleDisabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isScaleDisabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSetAsToplevel(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSetAsToplevel.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isTransformNotificationEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isTransformNotificationEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isVisible(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isVisible.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isVisibleInTree(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isVisibleInTree.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun lookAt(target: Vector3, up: Vector3) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(target)
      _args.add(up)
      __method_bind.lookAt.call(self._handle, _args, null)
    }
  }

  fun lookAtFromPosition(
    position: Vector3,
    target: Vector3,
    up: Vector3
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(position)
      _args.add(target)
      _args.add(up)
      __method_bind.lookAtFromPosition.call(self._handle, _args, null)
    }
  }

  fun orthonormalize() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.orthonormalize.call(self._handle, emptyList(), null)
    }
  }

  fun rotate(axis: Vector3, angle: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(axis)
      _args.add(angle)
      __method_bind.rotate.call(self._handle, _args, null)
    }
  }

  fun rotateObjectLocal(axis: Vector3, angle: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(axis)
      _args.add(angle)
      __method_bind.rotateObjectLocal.call(self._handle, _args, null)
    }
  }

  fun rotateX(angle: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.rotateX.call(self._handle, listOf(angle), null)
    }
  }

  fun rotateY(angle: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.rotateY.call(self._handle, listOf(angle), null)
    }
  }

  fun rotateZ(angle: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.rotateZ.call(self._handle, listOf(angle), null)
    }
  }

  fun scaleObjectLocal(scale: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.scaleObjectLocal.call(self._handle, listOf(scale), null)
    }
  }

  fun setAsToplevel(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAsToplevel.call(self._handle, listOf(enable), null)
    }
  }

  fun setDisableScale(disable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDisableScale.call(self._handle, listOf(disable), null)
    }
  }

  fun setGizmo(gizmo: SpatialGizmo) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGizmo.call(self._handle, listOf(gizmo), null)
    }
  }

  fun setGlobalTransform(global: Transform) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlobalTransform.call(self._handle, listOf(global), null)
    }
  }

  fun setIdentity() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setIdentity.call(self._handle, emptyList(), null)
    }
  }

  fun setIgnoreTransformNotification(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setIgnoreTransformNotification.call(self._handle, listOf(enabled), null)
    }
  }

  fun setNotifyLocalTransform(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNotifyLocalTransform.call(self._handle, listOf(enable), null)
    }
  }

  fun setNotifyTransform(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNotifyTransform.call(self._handle, listOf(enable), null)
    }
  }

  fun setRotation(euler: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRotation.call(self._handle, listOf(euler), null)
    }
  }

  fun setRotationDegrees(eulerDegrees: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRotationDegrees.call(self._handle, listOf(eulerDegrees), null)
    }
  }

  fun setScale(scale: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScale.call(self._handle, listOf(scale), null)
    }
  }

  fun setTransform(local: Transform) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTransform.call(self._handle, listOf(local), null)
    }
  }

  fun setTranslation(translation: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTranslation.call(self._handle, listOf(translation), null)
    }
  }

  fun setVisible(visible: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVisible.call(self._handle, listOf(visible), null)
    }
  }

  fun show() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.show.call(self._handle, emptyList(), null)
    }
  }

  fun toGlobal(localPoint: Vector3): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.toGlobal.call(self._handle, listOf(localPoint), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun toLocal(globalPoint: Vector3): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.toLocal.call(self._handle, listOf(globalPoint), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun translate(offset: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.translate.call(self._handle, listOf(offset), null)
    }
  }

  fun translateObjectLocal(offset: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.translateObjectLocal.call(self._handle, listOf(offset), null)
    }
  }

  fun updateGizmo() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.updateGizmo.call(self._handle, emptyList(), null)
    }
  }

  companion object {
    val NOTIFICATION_ENTER_WORLD: Int = 41

    val NOTIFICATION_EXIT_WORLD: Int = 42

    val NOTIFICATION_TRANSFORM_CHANGED: Int = 2000

    val NOTIFICATION_VISIBILITY_CHANGED: Int = 43

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Spatial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Spatial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Spatial
     */
    private object __method_bind {
      val forceUpdateTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "force_update_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method force_update_transform" }
        }
      val getGizmo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_gizmo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gizmo" }
        }
      val getGlobalTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_global_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_transform" }
        }
      val getParentSpatial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_parent_spatial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent_spatial" }
        }
      val getRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation" }
        }
      val getRotationDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
        }
      val getScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scale" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform" }
        }
      val getTranslation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_translation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_translation" }
        }
      val getWorld: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_world".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_world" }
        }
      val globalRotate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "global_rotate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_rotate" }
        }
      val globalScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "global_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_scale" }
        }
      val globalTranslate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "global_translate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_translate" }
        }
      val hide: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "hide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hide" }
        }
      val isLocalTransformNotificationEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_local_transform_notification_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_local_transform_notification_enabled" }
        }
      val isScaleDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_scale_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_scale_disabled" }
        }
      val isSetAsToplevel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_set_as_toplevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_set_as_toplevel" }
        }
      val isTransformNotificationEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_transform_notification_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_transform_notification_enabled"
            }
        }
      val isVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_visible" }
        }
      val isVisibleInTree: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_visible_in_tree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_visible_in_tree" }
        }
      val lookAt: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "look_at".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method look_at" }
        }
      val lookAtFromPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "look_at_from_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method look_at_from_position" }
        }
      val orthonormalize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "orthonormalize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method orthonormalize" }
        }
      val rotate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate" }
        }
      val rotateObjectLocal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotate_object_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate_object_local" }
        }
      val rotateX: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotate_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate_x" }
        }
      val rotateY: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotate_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate_y" }
        }
      val rotateZ: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotate_z".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate_z" }
        }
      val scaleObjectLocal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "scale_object_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scale_object_local" }
        }
      val setAsToplevel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_as_toplevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_toplevel" }
        }
      val setDisableScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_disable_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_scale" }
        }
      val setGizmo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_gizmo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gizmo" }
        }
      val setGlobalTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_global_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_transform" }
        }
      val setIdentity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_identity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_identity" }
        }
      val setIgnoreTransformNotification: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_ignore_transform_notification".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ignore_transform_notification"
            }
        }
      val setNotifyLocalTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_notify_local_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_notify_local_transform" }
        }
      val setNotifyTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_notify_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_notify_transform" }
        }
      val setRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation" }
        }
      val setRotationDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
        }
      val setScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scale" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform" }
        }
      val setTranslation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_translation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_translation" }
        }
      val setVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_visible" }
        }
      val show: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "show".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method show" }
        }
      val toGlobal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "to_global".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method to_global" }
        }
      val toLocal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "to_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method to_local" }
        }
      val translate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "translate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method translate" }
        }
      val translateObjectLocal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "translate_object_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method translate_object_local" }
        }
      val updateGizmo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "update_gizmo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_gizmo" }
        }}
  }
}
