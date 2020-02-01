// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Spatial(
  _handle: COpaquePointer
) : Node(_handle) {
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
    __method_bind.forceUpdateTransform.call(this._handle)
  }

  fun getGizmo(): SpatialGizmo {
    val _ret = __method_bind.getGizmo.call(this._handle)
    return _ret.asObject(::SpatialGizmo)!!
  }

  fun getGlobalTransform(): Transform {
    val _ret = __method_bind.getGlobalTransform.call(this._handle)
    return _ret.asTransform()
  }

  fun getParentSpatial(): Spatial {
    val _ret = __method_bind.getParentSpatial.call(this._handle)
    return _ret.asObject(::Spatial)!!
  }

  fun getRotation(): Vector3 {
    val _ret = __method_bind.getRotation.call(this._handle)
    return _ret.asVector3()
  }

  fun getRotationDegrees(): Vector3 {
    val _ret = __method_bind.getRotationDegrees.call(this._handle)
    return _ret.asVector3()
  }

  fun getScale(): Vector3 {
    val _ret = __method_bind.getScale.call(this._handle)
    return _ret.asVector3()
  }

  fun getTransform(): Transform {
    val _ret = __method_bind.getTransform.call(this._handle)
    return _ret.asTransform()
  }

  fun getTranslation(): Vector3 {
    val _ret = __method_bind.getTranslation.call(this._handle)
    return _ret.asVector3()
  }

  fun getWorld(): World {
    val _ret = __method_bind.getWorld.call(this._handle)
    return _ret.asObject(::World)!!
  }

  fun globalRotate(axis: Vector3, angle: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(axis))
    _args.add(Variant.fromAny(angle))
    __method_bind.globalRotate.call(this._handle, _args)
  }

  fun globalScale(scale: Vector3) {
    val _arg = Variant.new(scale)
    __method_bind.globalScale.call(this._handle, listOf(_arg))
  }

  fun globalTranslate(offset: Vector3) {
    val _arg = Variant.new(offset)
    __method_bind.globalTranslate.call(this._handle, listOf(_arg))
  }

  fun hide() {
    __method_bind.hide.call(this._handle)
  }

  fun isLocalTransformNotificationEnabled(): Boolean {
    val _ret = __method_bind.isLocalTransformNotificationEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isScaleDisabled(): Boolean {
    val _ret = __method_bind.isScaleDisabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSetAsToplevel(): Boolean {
    val _ret = __method_bind.isSetAsToplevel.call(this._handle)
    return _ret.asBoolean()
  }

  fun isTransformNotificationEnabled(): Boolean {
    val _ret = __method_bind.isTransformNotificationEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isVisible(): Boolean {
    val _ret = __method_bind.isVisible.call(this._handle)
    return _ret.asBoolean()
  }

  fun isVisibleInTree(): Boolean {
    val _ret = __method_bind.isVisibleInTree.call(this._handle)
    return _ret.asBoolean()
  }

  fun lookAt(target: Vector3, up: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(target))
    _args.add(Variant.fromAny(up))
    __method_bind.lookAt.call(this._handle, _args)
  }

  fun lookAtFromPosition(
    position: Vector3,
    target: Vector3,
    up: Vector3
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(target))
    _args.add(Variant.fromAny(up))
    __method_bind.lookAtFromPosition.call(this._handle, _args)
  }

  fun orthonormalize() {
    __method_bind.orthonormalize.call(this._handle)
  }

  fun rotate(axis: Vector3, angle: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(axis))
    _args.add(Variant.fromAny(angle))
    __method_bind.rotate.call(this._handle, _args)
  }

  fun rotateObjectLocal(axis: Vector3, angle: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(axis))
    _args.add(Variant.fromAny(angle))
    __method_bind.rotateObjectLocal.call(this._handle, _args)
  }

  fun rotateX(angle: Float) {
    val _arg = Variant.new(angle)
    __method_bind.rotateX.call(this._handle, listOf(_arg))
  }

  fun rotateY(angle: Float) {
    val _arg = Variant.new(angle)
    __method_bind.rotateY.call(this._handle, listOf(_arg))
  }

  fun rotateZ(angle: Float) {
    val _arg = Variant.new(angle)
    __method_bind.rotateZ.call(this._handle, listOf(_arg))
  }

  fun scaleObjectLocal(scale: Vector3) {
    val _arg = Variant.new(scale)
    __method_bind.scaleObjectLocal.call(this._handle, listOf(_arg))
  }

  fun setAsToplevel(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAsToplevel.call(this._handle, listOf(_arg))
  }

  fun setDisableScale(disable: Boolean) {
    val _arg = Variant.new(disable)
    __method_bind.setDisableScale.call(this._handle, listOf(_arg))
  }

  fun setGizmo(gizmo: SpatialGizmo) {
    val _arg = Variant.new(gizmo)
    __method_bind.setGizmo.call(this._handle, listOf(_arg))
  }

  fun setGlobalTransform(global: Transform) {
    val _arg = Variant.new(global)
    __method_bind.setGlobalTransform.call(this._handle, listOf(_arg))
  }

  fun setIdentity() {
    __method_bind.setIdentity.call(this._handle)
  }

  fun setIgnoreTransformNotification(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setIgnoreTransformNotification.call(this._handle, listOf(_arg))
  }

  fun setNotifyLocalTransform(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setNotifyLocalTransform.call(this._handle, listOf(_arg))
  }

  fun setNotifyTransform(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setNotifyTransform.call(this._handle, listOf(_arg))
  }

  fun setRotation(euler: Vector3) {
    val _arg = Variant.new(euler)
    __method_bind.setRotation.call(this._handle, listOf(_arg))
  }

  fun setRotationDegrees(eulerDegrees: Vector3) {
    val _arg = Variant.new(eulerDegrees)
    __method_bind.setRotationDegrees.call(this._handle, listOf(_arg))
  }

  fun setScale(scale: Vector3) {
    val _arg = Variant.new(scale)
    __method_bind.setScale.call(this._handle, listOf(_arg))
  }

  fun setTransform(local: Transform) {
    val _arg = Variant.new(local)
    __method_bind.setTransform.call(this._handle, listOf(_arg))
  }

  fun setTranslation(translation: Vector3) {
    val _arg = Variant.new(translation)
    __method_bind.setTranslation.call(this._handle, listOf(_arg))
  }

  fun setVisible(visible: Boolean) {
    val _arg = Variant.new(visible)
    __method_bind.setVisible.call(this._handle, listOf(_arg))
  }

  fun show() {
    __method_bind.show.call(this._handle)
  }

  fun toGlobal(localPoint: Vector3): Vector3 {
    val _arg = Variant.new(localPoint)
    val _ret = __method_bind.toGlobal.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun toLocal(globalPoint: Vector3): Vector3 {
    val _arg = Variant.new(globalPoint)
    val _ret = __method_bind.toLocal.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun translate(offset: Vector3) {
    val _arg = Variant.new(offset)
    __method_bind.translate.call(this._handle, listOf(_arg))
  }

  fun translateObjectLocal(offset: Vector3) {
    val _arg = Variant.new(offset)
    __method_bind.translateObjectLocal.call(this._handle, listOf(_arg))
  }

  fun updateGizmo() {
    __method_bind.updateGizmo.call(this._handle)
  }

  companion object {
    val NOTIFICATION_ENTER_WORLD: Int = 41

    val NOTIFICATION_EXIT_WORLD: Int = 42

    val NOTIFICATION_TRANSFORM_CHANGED: Int = 2000

    val NOTIFICATION_VISIBILITY_CHANGED: Int = 43

    fun new(): Spatial = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Spatial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Spatial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Spatial(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Spatial = Spatial(ptr)
    /**
     * Container for method_bind pointers for Spatial
     */
    private object __method_bind {
      val forceUpdateTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "force_update_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method force_update_transform" }
        }
      val getGizmo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_gizmo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gizmo" }
        }
      val getGlobalTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_global_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_transform" }
        }
      val getParentSpatial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_parent_spatial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent_spatial" }
        }
      val getRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation" }
        }
      val getRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
        }
      val getScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scale" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform" }
        }
      val getTranslation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_translation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_translation" }
        }
      val getWorld: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_world".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_world" }
        }
      val globalRotate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "global_rotate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_rotate" }
        }
      val globalScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "global_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_scale" }
        }
      val globalTranslate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "global_translate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_translate" }
        }
      val hide: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "hide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hide" }
        }
      val isLocalTransformNotificationEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_local_transform_notification_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_local_transform_notification_enabled" }
        }
      val isScaleDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_scale_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_scale_disabled" }
        }
      val isSetAsToplevel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_set_as_toplevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_set_as_toplevel" }
        }
      val isTransformNotificationEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_transform_notification_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_transform_notification_enabled"
            }
        }
      val isVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_visible" }
        }
      val isVisibleInTree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_visible_in_tree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_visible_in_tree" }
        }
      val lookAt: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "look_at".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method look_at" }
        }
      val lookAtFromPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "look_at_from_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method look_at_from_position" }
        }
      val orthonormalize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "orthonormalize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method orthonormalize" }
        }
      val rotate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate" }
        }
      val rotateObjectLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotate_object_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate_object_local" }
        }
      val rotateX: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotate_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate_x" }
        }
      val rotateY: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotate_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate_y" }
        }
      val rotateZ: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotate_z".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate_z" }
        }
      val scaleObjectLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "scale_object_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scale_object_local" }
        }
      val setAsToplevel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_as_toplevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_toplevel" }
        }
      val setDisableScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_disable_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_scale" }
        }
      val setGizmo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_gizmo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gizmo" }
        }
      val setGlobalTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_global_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_transform" }
        }
      val setIdentity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_identity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_identity" }
        }
      val setIgnoreTransformNotification: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_ignore_transform_notification".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ignore_transform_notification"
            }
        }
      val setNotifyLocalTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_notify_local_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_notify_local_transform" }
        }
      val setNotifyTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_notify_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_notify_transform" }
        }
      val setRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation" }
        }
      val setRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
        }
      val setScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scale" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform" }
        }
      val setTranslation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_translation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_translation" }
        }
      val setVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_visible" }
        }
      val show: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "show".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method show" }
        }
      val toGlobal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "to_global".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method to_global" }
        }
      val toLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "to_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method to_local" }
        }
      val translate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "translate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method translate" }
        }
      val translateObjectLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "translate_object_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method translate_object_local" }
        }
      val updateGizmo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "update_gizmo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_gizmo" }
        }}
  }
}
