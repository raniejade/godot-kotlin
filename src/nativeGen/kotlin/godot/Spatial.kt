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
    val _ret = __method_bind.force_update_transform.call(this.toVariant())
    TODO()
  }

  fun getGizmo(): SpatialGizmo {
    val _ret = __method_bind.get_gizmo.call(this.toVariant())
    TODO()
  }

  fun getGlobalTransform(): Transform {
    val _ret = __method_bind.get_global_transform.call(this.toVariant())
    TODO()
  }

  fun getParentSpatial(): Spatial {
    val _ret = __method_bind.get_parent_spatial.call(this.toVariant())
    TODO()
  }

  fun getRotation(): Vector3 {
    val _ret = __method_bind.get_rotation.call(this.toVariant())
    TODO()
  }

  fun getRotationDegrees(): Vector3 {
    val _ret = __method_bind.get_rotation_degrees.call(this.toVariant())
    TODO()
  }

  fun getScale(): Vector3 {
    val _ret = __method_bind.get_scale.call(this.toVariant())
    TODO()
  }

  fun getTransform(): Transform {
    val _ret = __method_bind.get_transform.call(this.toVariant())
    TODO()
  }

  fun getTranslation(): Vector3 {
    val _ret = __method_bind.get_translation.call(this.toVariant())
    TODO()
  }

  fun getWorld(): World {
    val _ret = __method_bind.get_world.call(this.toVariant())
    TODO()
  }

  fun globalRotate(axis: Vector3, angle: Float) {
    val _args = VariantArray.new()
    _args.append(axis)
    _args.append(angle)
    val _ret = __method_bind.global_rotate.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun globalScale(scale: Vector3) {
    val _args = VariantArray.new()
    _args.append(scale)
    val _ret = __method_bind.global_scale.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun globalTranslate(offset: Vector3) {
    val _args = VariantArray.new()
    _args.append(offset)
    val _ret = __method_bind.global_translate.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun hide() {
    val _ret = __method_bind.hide.call(this.toVariant())
    TODO()
  }

  fun isLocalTransformNotificationEnabled(): Boolean {
    val _ret = __method_bind.is_local_transform_notification_enabled.call(this.toVariant())
    TODO()
  }

  fun isScaleDisabled(): Boolean {
    val _ret = __method_bind.is_scale_disabled.call(this.toVariant())
    TODO()
  }

  fun isSetAsToplevel(): Boolean {
    val _ret = __method_bind.is_set_as_toplevel.call(this.toVariant())
    TODO()
  }

  fun isTransformNotificationEnabled(): Boolean {
    val _ret = __method_bind.is_transform_notification_enabled.call(this.toVariant())
    TODO()
  }

  fun isVisible(): Boolean {
    val _ret = __method_bind.is_visible.call(this.toVariant())
    TODO()
  }

  fun isVisibleInTree(): Boolean {
    val _ret = __method_bind.is_visible_in_tree.call(this.toVariant())
    TODO()
  }

  fun lookAt(target: Vector3, up: Vector3) {
    val _args = VariantArray.new()
    _args.append(target)
    _args.append(up)
    val _ret = __method_bind.look_at.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
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
    val _ret = __method_bind.look_at_from_position.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun orthonormalize() {
    val _ret = __method_bind.orthonormalize.call(this.toVariant())
    TODO()
  }

  fun rotate(axis: Vector3, angle: Float) {
    val _args = VariantArray.new()
    _args.append(axis)
    _args.append(angle)
    val _ret = __method_bind.rotate.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun rotateObjectLocal(axis: Vector3, angle: Float) {
    val _args = VariantArray.new()
    _args.append(axis)
    _args.append(angle)
    val _ret = __method_bind.rotate_object_local.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun rotateX(angle: Float) {
    val _args = VariantArray.new()
    _args.append(angle)
    val _ret = __method_bind.rotate_x.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun rotateY(angle: Float) {
    val _args = VariantArray.new()
    _args.append(angle)
    val _ret = __method_bind.rotate_y.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun rotateZ(angle: Float) {
    val _args = VariantArray.new()
    _args.append(angle)
    val _ret = __method_bind.rotate_z.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun scaleObjectLocal(scale: Vector3) {
    val _args = VariantArray.new()
    _args.append(scale)
    val _ret = __method_bind.scale_object_local.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setAsToplevel(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_as_toplevel.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setDisableScale(disable: Boolean) {
    val _args = VariantArray.new()
    _args.append(disable)
    val _ret = __method_bind.set_disable_scale.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setGizmo(gizmo: SpatialGizmo) {
    val _args = VariantArray.new()
    _args.append(gizmo)
    val _ret = __method_bind.set_gizmo.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setGlobalTransform(global: Transform) {
    val _args = VariantArray.new()
    _args.append(global)
    val _ret = __method_bind.set_global_transform.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setIdentity() {
    val _ret = __method_bind.set_identity.call(this.toVariant())
    TODO()
  }

  fun setIgnoreTransformNotification(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_ignore_transform_notification.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun setNotifyLocalTransform(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_notify_local_transform.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setNotifyTransform(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_notify_transform.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRotation(euler: Vector3) {
    val _args = VariantArray.new()
    _args.append(euler)
    val _ret = __method_bind.set_rotation.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRotationDegrees(eulerDegrees: Vector3) {
    val _args = VariantArray.new()
    _args.append(eulerDegrees)
    val _ret = __method_bind.set_rotation_degrees.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setScale(scale: Vector3) {
    val _args = VariantArray.new()
    _args.append(scale)
    val _ret = __method_bind.set_scale.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTransform(local: Transform) {
    val _args = VariantArray.new()
    _args.append(local)
    val _ret = __method_bind.set_transform.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTranslation(translation: Vector3) {
    val _args = VariantArray.new()
    _args.append(translation)
    val _ret = __method_bind.set_translation.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setVisible(visible: Boolean) {
    val _args = VariantArray.new()
    _args.append(visible)
    val _ret = __method_bind.set_visible.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun show() {
    val _ret = __method_bind.show.call(this.toVariant())
    TODO()
  }

  fun toGlobal(localPoint: Vector3): Vector3 {
    val _args = VariantArray.new()
    _args.append(localPoint)
    val _ret = __method_bind.to_global.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun toLocal(globalPoint: Vector3): Vector3 {
    val _args = VariantArray.new()
    _args.append(globalPoint)
    val _ret = __method_bind.to_local.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun translate(offset: Vector3) {
    val _args = VariantArray.new()
    _args.append(offset)
    val _ret = __method_bind.translate.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun translateObjectLocal(offset: Vector3) {
    val _args = VariantArray.new()
    _args.append(offset)
    val _ret = __method_bind.translate_object_local.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun updateGizmo() {
    val _ret = __method_bind.update_gizmo.call(this.toVariant())
    TODO()
  }

  companion object {
    val NOTIFICATION_ENTER_WORLD: Int = 41

    val NOTIFICATION_EXIT_WORLD: Int = 42

    val NOTIFICATION_TRANSFORM_CHANGED: Int = 2000

    val NOTIFICATION_VISIBILITY_CHANGED: Int = 43

    fun new(): Spatial = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Spatial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Spatial" }
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
      val force_update_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "force_update_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method force_update_transform" }
            }
          }

      val get_gizmo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "get_gizmo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gizmo" }
            }
          }

      val get_global_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "get_global_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_transform" }
            }
          }

      val get_parent_spatial: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "get_parent_spatial".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parent_spatial" }
            }
          }

      val get_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "get_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rotation" }
            }
          }

      val get_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "get_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
            }
          }

      val get_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "get_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scale" }
            }
          }

      val get_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "get_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transform" }
            }
          }

      val get_translation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "get_translation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_translation" }
            }
          }

      val get_world: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "get_world".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_world" }
            }
          }

      val global_rotate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "global_rotate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method global_rotate" }
            }
          }

      val global_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "global_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method global_scale" }
            }
          }

      val global_translate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "global_translate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method global_translate" }
            }
          }

      val hide: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "hide".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method hide" }
            }
          }

      val is_local_transform_notification_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "is_local_transform_notification_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_local_transform_notification_enabled" }
            }
          }

      val is_scale_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "is_scale_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_scale_disabled" }
            }
          }

      val is_set_as_toplevel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "is_set_as_toplevel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_set_as_toplevel" }
            }
          }

      val is_transform_notification_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "is_transform_notification_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_transform_notification_enabled" }
            }
          }

      val is_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "is_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_visible" }
            }
          }

      val is_visible_in_tree: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "is_visible_in_tree".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_visible_in_tree" }
            }
          }

      val look_at: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "look_at".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method look_at" }
            }
          }

      val look_at_from_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "look_at_from_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method look_at_from_position" }
            }
          }

      val orthonormalize: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "orthonormalize".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method orthonormalize" }
            }
          }

      val rotate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "rotate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rotate" }
            }
          }

      val rotate_object_local: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "rotate_object_local".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rotate_object_local" }
            }
          }

      val rotate_x: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "rotate_x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rotate_x" }
            }
          }

      val rotate_y: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "rotate_y".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rotate_y" }
            }
          }

      val rotate_z: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "rotate_z".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rotate_z" }
            }
          }

      val scale_object_local: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "scale_object_local".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method scale_object_local" }
            }
          }

      val set_as_toplevel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "set_as_toplevel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_as_toplevel" }
            }
          }

      val set_disable_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "set_disable_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disable_scale" }
            }
          }

      val set_gizmo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "set_gizmo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gizmo" }
            }
          }

      val set_global_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "set_global_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_global_transform" }
            }
          }

      val set_identity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "set_identity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_identity" }
            }
          }

      val set_ignore_transform_notification: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "set_ignore_transform_notification".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_ignore_transform_notification" }
            }
          }

      val set_notify_local_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "set_notify_local_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_notify_local_transform" }
            }
          }

      val set_notify_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "set_notify_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_notify_transform" }
            }
          }

      val set_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "set_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rotation" }
            }
          }

      val set_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "set_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
            }
          }

      val set_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "set_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scale" }
            }
          }

      val set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_transform" }
            }
          }

      val set_translation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "set_translation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_translation" }
            }
          }

      val set_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "set_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_visible" }
            }
          }

      val show: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "show".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method show" }
            }
          }

      val to_global: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "to_global".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method to_global" }
            }
          }

      val to_local: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "to_local".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method to_local" }
            }
          }

      val translate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "translate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method translate" }
            }
          }

      val translate_object_local: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "translate_object_local".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method translate_object_local" }
            }
          }

      val update_gizmo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
              "update_gizmo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method update_gizmo" }
            }
          }
    }
  }
}
