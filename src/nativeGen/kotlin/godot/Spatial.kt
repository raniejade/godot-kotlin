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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Spatial internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun forceUpdateTransform() {
    __method_bind.force_update_transform.call(this._handle)
  }

  fun getGizmo(): SpatialGizmo {
    val _ret = __method_bind.get_gizmo.call(this._handle)
    return _ret.asObject(::SpatialGizmo)!!
  }

  fun getGlobalTransform(): Transform {
    val _ret = __method_bind.get_global_transform.call(this._handle)
    return _ret.asTransform()
  }

  fun getParentSpatial(): Spatial {
    val _ret = __method_bind.get_parent_spatial.call(this._handle)
    return _ret.asObject(::Spatial)!!
  }

  fun getRotation(): Vector3 {
    val _ret = __method_bind.get_rotation.call(this._handle)
    return _ret.asVector3()
  }

  fun getRotationDegrees(): Vector3 {
    val _ret = __method_bind.get_rotation_degrees.call(this._handle)
    return _ret.asVector3()
  }

  fun getScale(): Vector3 {
    val _ret = __method_bind.get_scale.call(this._handle)
    return _ret.asVector3()
  }

  fun getTransform(): Transform {
    val _ret = __method_bind.get_transform.call(this._handle)
    return _ret.asTransform()
  }

  fun getTranslation(): Vector3 {
    val _ret = __method_bind.get_translation.call(this._handle)
    return _ret.asVector3()
  }

  fun getWorld(): World {
    val _ret = __method_bind.get_world.call(this._handle)
    return _ret.asObject(::World)!!
  }

  fun globalRotate(axis: Vector3, angle: Float) {
    val _args = VariantArray.new()
    _args.append(axis)
    _args.append(angle)
    __method_bind.global_rotate.call(this._handle, _args.toVariant(), 2)
  }

  fun globalScale(scale: Vector3) {
    val _arg = Variant.new(scale)
    __method_bind.global_scale.call(this._handle, _arg, 1)
  }

  fun globalTranslate(offset: Vector3) {
    val _arg = Variant.new(offset)
    __method_bind.global_translate.call(this._handle, _arg, 1)
  }

  fun hide() {
    __method_bind.hide.call(this._handle)
  }

  fun isLocalTransformNotificationEnabled(): Boolean {
    val _ret = __method_bind.is_local_transform_notification_enabled.call(this._handle)
    return _ret.asBool()
  }

  fun isScaleDisabled(): Boolean {
    val _ret = __method_bind.is_scale_disabled.call(this._handle)
    return _ret.asBool()
  }

  fun isSetAsToplevel(): Boolean {
    val _ret = __method_bind.is_set_as_toplevel.call(this._handle)
    return _ret.asBool()
  }

  fun isTransformNotificationEnabled(): Boolean {
    val _ret = __method_bind.is_transform_notification_enabled.call(this._handle)
    return _ret.asBool()
  }

  fun isVisible(): Boolean {
    val _ret = __method_bind.is_visible.call(this._handle)
    return _ret.asBool()
  }

  fun isVisibleInTree(): Boolean {
    val _ret = __method_bind.is_visible_in_tree.call(this._handle)
    return _ret.asBool()
  }

  fun lookAt(target: Vector3, up: Vector3) {
    val _args = VariantArray.new()
    _args.append(target)
    _args.append(up)
    __method_bind.look_at.call(this._handle, _args.toVariant(), 2)
  }

  fun lookAtFromPosition(
    position: Vector3,
    target: Vector3,
    up: Vector3
  ) {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(target)
    _args.append(up)
    __method_bind.look_at_from_position.call(this._handle, _args.toVariant(), 3)
  }

  fun orthonormalize() {
    __method_bind.orthonormalize.call(this._handle)
  }

  fun rotate(axis: Vector3, angle: Float) {
    val _args = VariantArray.new()
    _args.append(axis)
    _args.append(angle)
    __method_bind.rotate.call(this._handle, _args.toVariant(), 2)
  }

  fun rotateObjectLocal(axis: Vector3, angle: Float) {
    val _args = VariantArray.new()
    _args.append(axis)
    _args.append(angle)
    __method_bind.rotate_object_local.call(this._handle, _args.toVariant(), 2)
  }

  fun rotateX(angle: Float) {
    val _arg = Variant.new(angle)
    __method_bind.rotate_x.call(this._handle, _arg, 1)
  }

  fun rotateY(angle: Float) {
    val _arg = Variant.new(angle)
    __method_bind.rotate_y.call(this._handle, _arg, 1)
  }

  fun rotateZ(angle: Float) {
    val _arg = Variant.new(angle)
    __method_bind.rotate_z.call(this._handle, _arg, 1)
  }

  fun scaleObjectLocal(scale: Vector3) {
    val _arg = Variant.new(scale)
    __method_bind.scale_object_local.call(this._handle, _arg, 1)
  }

  fun setAsToplevel(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_as_toplevel.call(this._handle, _arg, 1)
  }

  fun setDisableScale(disable: Boolean) {
    val _arg = Variant.new(disable)
    __method_bind.set_disable_scale.call(this._handle, _arg, 1)
  }

  fun setGizmo(gizmo: SpatialGizmo) {
    val _arg = Variant.new(gizmo)
    __method_bind.set_gizmo.call(this._handle, _arg, 1)
  }

  fun setGlobalTransform(global: Transform) {
    val _arg = Variant.new(global)
    __method_bind.set_global_transform.call(this._handle, _arg, 1)
  }

  fun setIdentity() {
    __method_bind.set_identity.call(this._handle)
  }

  fun setIgnoreTransformNotification(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_ignore_transform_notification.call(this._handle, _arg, 1)
  }

  fun setNotifyLocalTransform(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_notify_local_transform.call(this._handle, _arg, 1)
  }

  fun setNotifyTransform(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_notify_transform.call(this._handle, _arg, 1)
  }

  fun setRotation(euler: Vector3) {
    val _arg = Variant.new(euler)
    __method_bind.set_rotation.call(this._handle, _arg, 1)
  }

  fun setRotationDegrees(eulerDegrees: Vector3) {
    val _arg = Variant.new(eulerDegrees)
    __method_bind.set_rotation_degrees.call(this._handle, _arg, 1)
  }

  fun setScale(scale: Vector3) {
    val _arg = Variant.new(scale)
    __method_bind.set_scale.call(this._handle, _arg, 1)
  }

  fun setTransform(local: Transform) {
    val _arg = Variant.new(local)
    __method_bind.set_transform.call(this._handle, _arg, 1)
  }

  fun setTranslation(translation: Vector3) {
    val _arg = Variant.new(translation)
    __method_bind.set_translation.call(this._handle, _arg, 1)
  }

  fun setVisible(visible: Boolean) {
    val _arg = Variant.new(visible)
    __method_bind.set_visible.call(this._handle, _arg, 1)
  }

  fun show() {
    __method_bind.show.call(this._handle)
  }

  fun toGlobal(localPoint: Vector3): Vector3 {
    val _arg = Variant.new(localPoint)
    val _ret = __method_bind.to_global.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun toLocal(globalPoint: Vector3): Vector3 {
    val _arg = Variant.new(globalPoint)
    val _ret = __method_bind.to_local.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun translate(offset: Vector3) {
    val _arg = Variant.new(offset)
    __method_bind.translate.call(this._handle, _arg, 1)
  }

  fun translateObjectLocal(offset: Vector3) {
    val _arg = Variant.new(offset)
    __method_bind.translate_object_local.call(this._handle, _arg, 1)
  }

  fun updateGizmo() {
    __method_bind.update_gizmo.call(this._handle)
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
      val force_update_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "force_update_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method force_update_transform" }
        }
      val get_gizmo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_gizmo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gizmo" }
        }
      val get_global_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_global_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_transform" }
        }
      val get_parent_spatial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_parent_spatial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent_spatial" }
        }
      val get_rotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation" }
        }
      val get_rotation_degrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
        }
      val get_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scale" }
        }
      val get_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform" }
        }
      val get_translation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_translation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_translation" }
        }
      val get_world: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "get_world".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_world" }
        }
      val global_rotate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "global_rotate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_rotate" }
        }
      val global_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "global_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_scale" }
        }
      val global_translate: CPointer<godot_method_bind>
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
      val is_local_transform_notification_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_local_transform_notification_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_local_transform_notification_enabled" }
        }
      val is_scale_disabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_scale_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_scale_disabled" }
        }
      val is_set_as_toplevel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_set_as_toplevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_set_as_toplevel" }
        }
      val is_transform_notification_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_transform_notification_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_transform_notification_enabled"
            }
        }
      val is_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_visible" }
        }
      val is_visible_in_tree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "is_visible_in_tree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_visible_in_tree" }
        }
      val look_at: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "look_at".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method look_at" }
        }
      val look_at_from_position: CPointer<godot_method_bind>
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
      val rotate_object_local: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotate_object_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate_object_local" }
        }
      val rotate_x: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotate_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate_x" }
        }
      val rotate_y: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotate_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate_y" }
        }
      val rotate_z: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotate_z".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotate_z" }
        }
      val scale_object_local: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "scale_object_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scale_object_local" }
        }
      val set_as_toplevel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_as_toplevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_toplevel" }
        }
      val set_disable_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_disable_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_scale" }
        }
      val set_gizmo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_gizmo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gizmo" }
        }
      val set_global_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_global_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_transform" }
        }
      val set_identity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_identity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_identity" }
        }
      val set_ignore_transform_notification: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_ignore_transform_notification".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ignore_transform_notification"
            }
        }
      val set_notify_local_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_notify_local_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_notify_local_transform" }
        }
      val set_notify_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_notify_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_notify_transform" }
        }
      val set_rotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation" }
        }
      val set_rotation_degrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
        }
      val set_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scale" }
        }
      val set_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform" }
        }
      val set_translation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "set_translation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_translation" }
        }
      val set_visible: CPointer<godot_method_bind>
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
      val to_global: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "to_global".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method to_global" }
        }
      val to_local: CPointer<godot_method_bind>
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
      val translate_object_local: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "translate_object_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method translate_object_local" }
        }
      val update_gizmo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "update_gizmo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_gizmo" }
        }}
  }
}
