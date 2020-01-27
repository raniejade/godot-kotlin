// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Transform
import godot.core.Variant
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
  fun clearCurrent(enableNext: Boolean) {
    val _arg = Variant.new(enableNext)
    __method_bind.clear_current.call(this.toVariant(), _arg, 1)
  }

  fun getCameraRid(): RID {
    val _ret = __method_bind.get_camera_rid.call(this.toVariant())
    return _ret.asRID()
  }

  fun getCameraTransform(): Transform {
    val _ret = __method_bind.get_camera_transform.call(this.toVariant())
    return _ret.asTransform()
  }

  fun getCullMask(): Int {
    val _ret = __method_bind.get_cull_mask.call(this.toVariant())
    return _ret.asInt()
  }

  fun getCullMaskBit(layer: Int): Boolean {
    val _arg = Variant.new(layer)
    val _ret = __method_bind.get_cull_mask_bit.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun getDopplerTracking(): DopplerTracking {
    val _ret = __method_bind.get_doppler_tracking.call(this.toVariant())
    return Camera.DopplerTracking.from(_ret.asInt())
  }

  fun getEnvironment(): Environment {
    val _ret = __method_bind.get_environment.call(this.toVariant())
    return _ret.asObject(::Environment)!!
  }

  fun getFov(): Float {
    val _ret = __method_bind.get_fov.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFrustum(): VariantArray {
    val _ret = __method_bind.get_frustum.call(this.toVariant())
    return _ret.asArray()
  }

  fun getFrustumOffset(): Vector2 {
    val _ret = __method_bind.get_frustum_offset.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getHOffset(): Float {
    val _ret = __method_bind.get_h_offset.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getKeepAspectMode(): KeepAspect {
    val _ret = __method_bind.get_keep_aspect_mode.call(this.toVariant())
    return Camera.KeepAspect.from(_ret.asInt())
  }

  fun getProjection(): Projection {
    val _ret = __method_bind.get_projection.call(this.toVariant())
    return Camera.Projection.from(_ret.asInt())
  }

  fun getSize(): Float {
    val _ret = __method_bind.get_size.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getVOffset(): Float {
    val _ret = __method_bind.get_v_offset.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getZfar(): Float {
    val _ret = __method_bind.get_zfar.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getZnear(): Float {
    val _ret = __method_bind.get_znear.call(this.toVariant())
    return _ret.asFloat()
  }

  fun isCurrent(): Boolean {
    val _ret = __method_bind.is_current.call(this.toVariant())
    return _ret.asBool()
  }

  fun isPositionBehind(worldPoint: Vector3): Boolean {
    val _arg = Variant.new(worldPoint)
    val _ret = __method_bind.is_position_behind.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun makeCurrent() {
    __method_bind.make_current.call(this.toVariant())
  }

  fun projectLocalRayNormal(screenPoint: Vector2): Vector3 {
    val _arg = Variant.new(screenPoint)
    val _ret = __method_bind.project_local_ray_normal.call(this.toVariant(), _arg, 1)
    return _ret.asVector3()
  }

  fun projectPosition(screenPoint: Vector2, zDepth: Float): Vector3 {
    val _args = VariantArray.new()
    _args.append(screenPoint)
    _args.append(zDepth)
    val _ret = __method_bind.project_position.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asVector3()
  }

  fun projectRayNormal(screenPoint: Vector2): Vector3 {
    val _arg = Variant.new(screenPoint)
    val _ret = __method_bind.project_ray_normal.call(this.toVariant(), _arg, 1)
    return _ret.asVector3()
  }

  fun projectRayOrigin(screenPoint: Vector2): Vector3 {
    val _arg = Variant.new(screenPoint)
    val _ret = __method_bind.project_ray_origin.call(this.toVariant(), _arg, 1)
    return _ret.asVector3()
  }

  fun setCullMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.set_cull_mask.call(this.toVariant(), _arg, 1)
  }

  fun setCullMaskBit(layer: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(layer)
    _args.append(enable)
    __method_bind.set_cull_mask_bit.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setCurrent(arg0: Boolean) {
    val _arg = Variant.new(arg0)
    __method_bind.set_current.call(this.toVariant(), _arg, 1)
  }

  fun setDopplerTracking(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_doppler_tracking.call(this.toVariant(), _arg, 1)
  }

  fun setEnvironment(env: Environment) {
    val _arg = Variant.new(env)
    __method_bind.set_environment.call(this.toVariant(), _arg, 1)
  }

  fun setFov(arg0: Float) {
    val _arg = Variant.new(arg0)
    __method_bind.set_fov.call(this.toVariant(), _arg, 1)
  }

  fun setFrustum(
    size: Float,
    offset: Vector2,
    zNear: Float,
    zFar: Float
  ) {
    val _args = VariantArray.new()
    _args.append(size)
    _args.append(offset)
    _args.append(zNear)
    _args.append(zFar)
    __method_bind.set_frustum.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun setFrustumOffset(arg0: Vector2) {
    val _arg = Variant.new(arg0)
    __method_bind.set_frustum_offset.call(this.toVariant(), _arg, 1)
  }

  fun setHOffset(ofs: Float) {
    val _arg = Variant.new(ofs)
    __method_bind.set_h_offset.call(this.toVariant(), _arg, 1)
  }

  fun setKeepAspectMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_keep_aspect_mode.call(this.toVariant(), _arg, 1)
  }

  fun setOrthogonal(
    size: Float,
    zNear: Float,
    zFar: Float
  ) {
    val _args = VariantArray.new()
    _args.append(size)
    _args.append(zNear)
    _args.append(zFar)
    __method_bind.set_orthogonal.call(this.toVariant(), _args.toVariant(), 3)
  }

  fun setPerspective(
    fov: Float,
    zNear: Float,
    zFar: Float
  ) {
    val _args = VariantArray.new()
    _args.append(fov)
    _args.append(zNear)
    _args.append(zFar)
    __method_bind.set_perspective.call(this.toVariant(), _args.toVariant(), 3)
  }

  fun setProjection(arg0: Int) {
    val _arg = Variant.new(arg0)
    __method_bind.set_projection.call(this.toVariant(), _arg, 1)
  }

  fun setSize(arg0: Float) {
    val _arg = Variant.new(arg0)
    __method_bind.set_size.call(this.toVariant(), _arg, 1)
  }

  fun setVOffset(ofs: Float) {
    val _arg = Variant.new(ofs)
    __method_bind.set_v_offset.call(this.toVariant(), _arg, 1)
  }

  fun setZfar(arg0: Float) {
    val _arg = Variant.new(arg0)
    __method_bind.set_zfar.call(this.toVariant(), _arg, 1)
  }

  fun setZnear(arg0: Float) {
    val _arg = Variant.new(arg0)
    __method_bind.set_znear.call(this.toVariant(), _arg, 1)
  }

  fun unprojectPosition(worldPoint: Vector3): Vector2 {
    val _arg = Variant.new(worldPoint)
    val _ret = __method_bind.unproject_position.call(this.toVariant(), _arg, 1)
    return _ret.asVector2()
  }

  enum class KeepAspect(
    val value: Int
  ) {
    KEEP_WIDTH(0),

    KEEP_HEIGHT(1);

    companion object {
      fun from(value: Int): KeepAspect {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Projection(
    val value: Int
  ) {
    PROJECTION_PERSPECTIVE(0),

    PROJECTION_ORTHOGONAL(1),

    PROJECTION_FRUSTUM(2);

    companion object {
      fun from(value: Int): Projection {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DopplerTracking(
    val value: Int
  ) {
    DOPPLER_TRACKING_DISABLED(0),

    DOPPLER_TRACKING_IDLE_STEP(1),

    DOPPLER_TRACKING_PHYSICS_STEP(2);

    companion object {
      fun from(value: Int): DopplerTracking {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
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
      requireNotNull(fnPtr) { "No instance found for Camera" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Camera(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Camera = Camera(ptr)
    /**
     * Container for method_bind pointers for Camera
     */
    private object __method_bind {
      val clear_current: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "clear_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_current" }
        }
      val get_camera_rid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_camera_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_rid" }
        }
      val get_camera_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_camera_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_transform" }
        }
      val get_cull_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cull_mask" }
        }
      val get_cull_mask_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_cull_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cull_mask_bit" }
        }
      val get_doppler_tracking: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_doppler_tracking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_doppler_tracking" }
        }
      val get_environment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_environment" }
        }
      val get_fov: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_fov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fov" }
        }
      val get_frustum: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_frustum".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frustum" }
        }
      val get_frustum_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_frustum_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frustum_offset" }
        }
      val get_h_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_offset" }
        }
      val get_keep_aspect_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_keep_aspect_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_keep_aspect_mode" }
        }
      val get_projection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_projection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_projection" }
        }
      val get_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val get_v_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_offset" }
        }
      val get_zfar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_zfar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_zfar" }
        }
      val get_znear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_znear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_znear" }
        }
      val is_current: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "is_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_current" }
        }
      val is_position_behind: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "is_position_behind".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_position_behind" }
        }
      val make_current: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "make_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_current" }
        }
      val project_local_ray_normal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "project_local_ray_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method project_local_ray_normal" }
        }
      val project_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "project_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method project_position" }
        }
      val project_ray_normal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "project_ray_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method project_ray_normal" }
        }
      val project_ray_origin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "project_ray_origin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method project_ray_origin" }
        }
      val set_cull_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cull_mask" }
        }
      val set_cull_mask_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_cull_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cull_mask_bit" }
        }
      val set_current: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current" }
        }
      val set_doppler_tracking: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_doppler_tracking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_doppler_tracking" }
        }
      val set_environment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_environment" }
        }
      val set_fov: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_fov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fov" }
        }
      val set_frustum: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_frustum".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frustum" }
        }
      val set_frustum_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_frustum_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frustum_offset" }
        }
      val set_h_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_offset" }
        }
      val set_keep_aspect_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_keep_aspect_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_keep_aspect_mode" }
        }
      val set_orthogonal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_orthogonal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_orthogonal" }
        }
      val set_perspective: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_perspective".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_perspective" }
        }
      val set_projection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_projection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_projection" }
        }
      val set_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }
      val set_v_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_offset" }
        }
      val set_zfar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_zfar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_zfar" }
        }
      val set_znear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_znear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_znear" }
        }
      val unproject_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "unproject_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unproject_position" }
        }}
  }
}
