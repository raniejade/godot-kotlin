// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Transform
import godot.core.VariantArray
import godot.core.Vector2
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

open class Camera internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun clearCurrent() {
    TODO()
  }

  fun getCameraRid(): RID {
    TODO()
  }

  fun getCameraTransform(): Transform {
    TODO()
  }

  fun getCullMask(): Int {
    TODO()
  }

  fun getCullMaskBit(): Boolean {
    TODO()
  }

  fun getDopplerTracking(): Camera.DopplerTracking {
    TODO()
  }

  fun getEnvironment(): Environment {
    TODO()
  }

  fun getFov(): Float {
    TODO()
  }

  fun getFrustum(): VariantArray {
    TODO()
  }

  fun getFrustumOffset(): Vector2 {
    TODO()
  }

  fun getHOffset(): Float {
    TODO()
  }

  fun getKeepAspectMode(): Camera.KeepAspect {
    TODO()
  }

  fun getProjection(): Camera.Projection {
    TODO()
  }

  fun getSize(): Float {
    TODO()
  }

  fun getVOffset(): Float {
    TODO()
  }

  fun getZfar(): Float {
    TODO()
  }

  fun getZnear(): Float {
    TODO()
  }

  fun isCurrent(): Boolean {
    TODO()
  }

  fun isPositionBehind(): Boolean {
    TODO()
  }

  fun makeCurrent() {
    TODO()
  }

  fun projectLocalRayNormal(): Vector3 {
    TODO()
  }

  fun projectPosition(): Vector3 {
    TODO()
  }

  fun projectRayNormal(): Vector3 {
    TODO()
  }

  fun projectRayOrigin(): Vector3 {
    TODO()
  }

  fun setCullMask() {
    TODO()
  }

  fun setCullMaskBit() {
    TODO()
  }

  fun setCurrent() {
    TODO()
  }

  fun setDopplerTracking() {
    TODO()
  }

  fun setEnvironment() {
    TODO()
  }

  fun setFov() {
    TODO()
  }

  fun setFrustum() {
    TODO()
  }

  fun setFrustumOffset() {
    TODO()
  }

  fun setHOffset() {
    TODO()
  }

  fun setKeepAspectMode() {
    TODO()
  }

  fun setOrthogonal() {
    TODO()
  }

  fun setPerspective() {
    TODO()
  }

  fun setProjection() {
    TODO()
  }

  fun setSize() {
    TODO()
  }

  fun setVOffset() {
    TODO()
  }

  fun setZfar() {
    TODO()
  }

  fun setZnear() {
    TODO()
  }

  fun unprojectPosition(): Vector2 {
    TODO()
  }

  enum class KeepAspect(
    val value: Int
  ) {
    KEEP_WIDTH(0),

    KEEP_HEIGHT(1);
  }

  enum class Projection(
    val value: Int
  ) {
    PROJECTION_PERSPECTIVE(0),

    PROJECTION_ORTHOGONAL(1),

    PROJECTION_FRUSTUM(2);
  }

  enum class DopplerTracking(
    val value: Int
  ) {
    DOPPLER_TRACKING_DISABLED(0),

    DOPPLER_TRACKING_IDLE_STEP(1),

    DOPPLER_TRACKING_PHYSICS_STEP(2);
  }

  companion object {
    val DOPPLER_TRACKING_DISABLED: Int = 0

    val DOPPLER_TRACKING_IDLE_STEP: Int = 1

    val DOPPLER_TRACKING_PHYSICS_STEP: Int = 2

    val KEEP_HEIGHT: Int = 1

    val KEEP_WIDTH: Int = 0

    val PROJECTION_FRUSTUM: Int = 2

    val PROJECTION_ORTHOGONAL: Int = 1

    val PROJECTION_PERSPECTIVE: Int = 0

    fun new(): Camera = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Camera".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Camera" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Camera(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Camera
     */
    private object __method_bind {
      val clear_current: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "clear_current".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_current" }
            }
          }

      val get_camera_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_camera_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_camera_rid" }
            }
          }

      val get_camera_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_camera_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_camera_transform" }
            }
          }

      val get_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cull_mask" }
            }
          }

      val get_cull_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_cull_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cull_mask_bit" }
            }
          }

      val get_doppler_tracking: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_doppler_tracking".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_doppler_tracking" }
            }
          }

      val get_environment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_environment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_environment" }
            }
          }

      val get_fov: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_fov".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fov" }
            }
          }

      val get_frustum: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_frustum".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frustum" }
            }
          }

      val get_frustum_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_frustum_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frustum_offset" }
            }
          }

      val get_h_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_h_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_h_offset" }
            }
          }

      val get_keep_aspect_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_keep_aspect_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_keep_aspect_mode" }
            }
          }

      val get_projection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_projection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_projection" }
            }
          }

      val get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val get_v_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_v_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_offset" }
            }
          }

      val get_zfar: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_zfar".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_zfar" }
            }
          }

      val get_znear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "get_znear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_znear" }
            }
          }

      val is_current: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "is_current".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_current" }
            }
          }

      val is_position_behind: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "is_position_behind".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_position_behind" }
            }
          }

      val make_current: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "make_current".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_current" }
            }
          }

      val project_local_ray_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "project_local_ray_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method project_local_ray_normal" }
            }
          }

      val project_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "project_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method project_position" }
            }
          }

      val project_ray_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "project_ray_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method project_ray_normal" }
            }
          }

      val project_ray_origin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "project_ray_origin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method project_ray_origin" }
            }
          }

      val set_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cull_mask" }
            }
          }

      val set_cull_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_cull_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cull_mask_bit" }
            }
          }

      val set_current: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_current".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current" }
            }
          }

      val set_doppler_tracking: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_doppler_tracking".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_doppler_tracking" }
            }
          }

      val set_environment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_environment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_environment" }
            }
          }

      val set_fov: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_fov".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fov" }
            }
          }

      val set_frustum: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_frustum".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frustum" }
            }
          }

      val set_frustum_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_frustum_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frustum_offset" }
            }
          }

      val set_h_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_h_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_h_offset" }
            }
          }

      val set_keep_aspect_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_keep_aspect_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_keep_aspect_mode" }
            }
          }

      val set_orthogonal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_orthogonal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_orthogonal" }
            }
          }

      val set_perspective: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_perspective".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_perspective" }
            }
          }

      val set_projection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_projection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_projection" }
            }
          }

      val set_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size" }
            }
          }

      val set_v_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_v_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_v_offset" }
            }
          }

      val set_zfar: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_zfar".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_zfar" }
            }
          }

      val set_znear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "set_znear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_znear" }
            }
          }

      val unproject_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
              "unproject_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unproject_position" }
            }
          }
    }
  }
}
