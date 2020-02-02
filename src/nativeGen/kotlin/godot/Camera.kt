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
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Camera(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var cullMask: Int
    get() {
       return getCullMask() 
    }
    set(value) {
      setCullMask(value)
    }

  var current: Boolean
    get() {
       return isCurrent() 
    }
    set(value) {
      setCurrent(value)
    }

  var dopplerTracking: DopplerTracking
    get() {
       return getDopplerTracking() 
    }
    set(value) {
      setDopplerTracking(value.value)
    }

  var environment: Environment
    get() {
       return getEnvironment() 
    }
    set(value) {
      setEnvironment(value)
    }

  var far: Float
    get() {
       return getZfar() 
    }
    set(value) {
      setZfar(value)
    }

  var fov: Float
    get() {
       return getFov() 
    }
    set(value) {
      setFov(value)
    }

  var frustumOffset: Vector2
    get() {
       return getFrustumOffset() 
    }
    set(value) {
      setFrustumOffset(value)
    }

  var hOffset: Float
    get() {
       return getHOffset() 
    }
    set(value) {
      setHOffset(value)
    }

  var keepAspect: KeepAspect
    get() {
       return getKeepAspectMode() 
    }
    set(value) {
      setKeepAspectMode(value.value)
    }

  var near: Float
    get() {
       return getZnear() 
    }
    set(value) {
      setZnear(value)
    }

  var projection: Projection
    get() {
       return getProjection() 
    }
    set(value) {
      setProjection(value.value)
    }

  var size: Float
    get() {
       return getSize() 
    }
    set(value) {
      setSize(value)
    }

  var vOffset: Float
    get() {
       return getVOffset() 
    }
    set(value) {
      setVOffset(value)
    }

  /**
   * Specialized setter for frustumOffset
   */
  fun frustumOffset(cb: Vector2.() -> Unit) {
    val _p = frustumOffset
    cb(_p)
    frustumOffset = _p
  }

  fun clearCurrent(enableNext: Boolean = true) {
    val _arg = Variant.new(enableNext)
    __method_bind.clearCurrent.call(this._handle, listOf(_arg))
  }

  fun getCameraRid(): RID {
    val _ret = __method_bind.getCameraRid.call(this._handle)
    return _ret.asRID()
  }

  fun getCameraTransform(): Transform {
    val _ret = __method_bind.getCameraTransform.call(this._handle)
    return _ret.asTransform()
  }

  fun getCullMask(): Int {
    val _ret = __method_bind.getCullMask.call(this._handle)
    return _ret.asInt()
  }

  fun getCullMaskBit(layer: Int): Boolean {
    val _arg = Variant.new(layer)
    val _ret = __method_bind.getCullMaskBit.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getDopplerTracking(): DopplerTracking {
    val _ret = __method_bind.getDopplerTracking.call(this._handle)
    return Camera.DopplerTracking.from(_ret.asInt())
  }

  fun getEnvironment(): Environment {
    val _ret = __method_bind.getEnvironment.call(this._handle)
    return _ret.asObject(::Environment)!!
  }

  fun getFov(): Float {
    val _ret = __method_bind.getFov.call(this._handle)
    return _ret.asFloat()
  }

  fun getFrustum(): VariantArray {
    val _ret = __method_bind.getFrustum.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getFrustumOffset(): Vector2 {
    val _ret = __method_bind.getFrustumOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getHOffset(): Float {
    val _ret = __method_bind.getHOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun getKeepAspectMode(): KeepAspect {
    val _ret = __method_bind.getKeepAspectMode.call(this._handle)
    return Camera.KeepAspect.from(_ret.asInt())
  }

  fun getProjection(): Projection {
    val _ret = __method_bind.getProjection.call(this._handle)
    return Camera.Projection.from(_ret.asInt())
  }

  fun getSize(): Float {
    val _ret = __method_bind.getSize.call(this._handle)
    return _ret.asFloat()
  }

  fun getVOffset(): Float {
    val _ret = __method_bind.getVOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun getZfar(): Float {
    val _ret = __method_bind.getZfar.call(this._handle)
    return _ret.asFloat()
  }

  fun getZnear(): Float {
    val _ret = __method_bind.getZnear.call(this._handle)
    return _ret.asFloat()
  }

  fun isCurrent(): Boolean {
    val _ret = __method_bind.isCurrent.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPositionBehind(worldPoint: Vector3): Boolean {
    val _arg = Variant.new(worldPoint)
    val _ret = __method_bind.isPositionBehind.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun makeCurrent() {
    __method_bind.makeCurrent.call(this._handle)
  }

  fun projectLocalRayNormal(screenPoint: Vector2): Vector3 {
    val _arg = Variant.new(screenPoint)
    val _ret = __method_bind.projectLocalRayNormal.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun projectPosition(screenPoint: Vector2, zDepth: Float): Vector3 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(screenPoint))
    _args.add(Variant.fromAny(zDepth))
    val _ret = __method_bind.projectPosition.call(this._handle, _args)
    return _ret.asVector3()
  }

  fun projectRayNormal(screenPoint: Vector2): Vector3 {
    val _arg = Variant.new(screenPoint)
    val _ret = __method_bind.projectRayNormal.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun projectRayOrigin(screenPoint: Vector2): Vector3 {
    val _arg = Variant.new(screenPoint)
    val _ret = __method_bind.projectRayOrigin.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun setCullMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setCullMask.call(this._handle, listOf(_arg))
  }

  fun setCullMaskBit(layer: Int, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(layer))
    _args.add(Variant.fromAny(enable))
    __method_bind.setCullMaskBit.call(this._handle, _args)
  }

  fun setCurrent(arg0: Boolean) {
    val _arg = Variant.new(arg0)
    __method_bind.setCurrent.call(this._handle, listOf(_arg))
  }

  fun setDopplerTracking(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setDopplerTracking.call(this._handle, listOf(_arg))
  }

  fun setEnvironment(env: Environment) {
    val _arg = Variant.new(env)
    __method_bind.setEnvironment.call(this._handle, listOf(_arg))
  }

  fun setFov(arg0: Float) {
    val _arg = Variant.new(arg0)
    __method_bind.setFov.call(this._handle, listOf(_arg))
  }

  fun setFrustum(
    size: Float,
    offset: Vector2,
    zNear: Float,
    zFar: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(size))
    _args.add(Variant.fromAny(offset))
    _args.add(Variant.fromAny(zNear))
    _args.add(Variant.fromAny(zFar))
    __method_bind.setFrustum.call(this._handle, _args)
  }

  fun setFrustumOffset(arg0: Vector2) {
    val _arg = Variant.new(arg0)
    __method_bind.setFrustumOffset.call(this._handle, listOf(_arg))
  }

  fun setHOffset(ofs: Float) {
    val _arg = Variant.new(ofs)
    __method_bind.setHOffset.call(this._handle, listOf(_arg))
  }

  fun setKeepAspectMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setKeepAspectMode.call(this._handle, listOf(_arg))
  }

  fun setOrthogonal(
    size: Float,
    zNear: Float,
    zFar: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(size))
    _args.add(Variant.fromAny(zNear))
    _args.add(Variant.fromAny(zFar))
    __method_bind.setOrthogonal.call(this._handle, _args)
  }

  fun setPerspective(
    fov: Float,
    zNear: Float,
    zFar: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(fov))
    _args.add(Variant.fromAny(zNear))
    _args.add(Variant.fromAny(zFar))
    __method_bind.setPerspective.call(this._handle, _args)
  }

  fun setProjection(arg0: Int) {
    val _arg = Variant.new(arg0)
    __method_bind.setProjection.call(this._handle, listOf(_arg))
  }

  fun setSize(arg0: Float) {
    val _arg = Variant.new(arg0)
    __method_bind.setSize.call(this._handle, listOf(_arg))
  }

  fun setVOffset(ofs: Float) {
    val _arg = Variant.new(ofs)
    __method_bind.setVOffset.call(this._handle, listOf(_arg))
  }

  fun setZfar(arg0: Float) {
    val _arg = Variant.new(arg0)
    __method_bind.setZfar.call(this._handle, listOf(_arg))
  }

  fun setZnear(arg0: Float) {
    val _arg = Variant.new(arg0)
    __method_bind.setZnear.call(this._handle, listOf(_arg))
  }

  fun unprojectPosition(worldPoint: Vector3): Vector2 {
    val _arg = Variant.new(worldPoint)
    val _ret = __method_bind.unprojectPosition.call(this._handle, listOf(_arg))
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
    PERSPECTIVE(0),

    ORTHOGONAL(1),

    FRUSTUM(2);

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
      val clearCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "clear_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_current" }
        }
      val getCameraRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_camera_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_rid" }
        }
      val getCameraTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_camera_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_transform" }
        }
      val getCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cull_mask" }
        }
      val getCullMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_cull_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cull_mask_bit" }
        }
      val getDopplerTracking: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_doppler_tracking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_doppler_tracking" }
        }
      val getEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_environment" }
        }
      val getFov: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_fov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fov" }
        }
      val getFrustum: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_frustum".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frustum" }
        }
      val getFrustumOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_frustum_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frustum_offset" }
        }
      val getHOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_offset" }
        }
      val getKeepAspectMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_keep_aspect_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_keep_aspect_mode" }
        }
      val getProjection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_projection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_projection" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getVOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_offset" }
        }
      val getZfar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_zfar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_zfar" }
        }
      val getZnear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_znear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_znear" }
        }
      val isCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "is_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_current" }
        }
      val isPositionBehind: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "is_position_behind".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_position_behind" }
        }
      val makeCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "make_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_current" }
        }
      val projectLocalRayNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "project_local_ray_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method project_local_ray_normal" }
        }
      val projectPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "project_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method project_position" }
        }
      val projectRayNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "project_ray_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method project_ray_normal" }
        }
      val projectRayOrigin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "project_ray_origin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method project_ray_origin" }
        }
      val setCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cull_mask" }
        }
      val setCullMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_cull_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cull_mask_bit" }
        }
      val setCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current" }
        }
      val setDopplerTracking: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_doppler_tracking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_doppler_tracking" }
        }
      val setEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_environment" }
        }
      val setFov: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_fov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fov" }
        }
      val setFrustum: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_frustum".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frustum" }
        }
      val setFrustumOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_frustum_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frustum_offset" }
        }
      val setHOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_offset" }
        }
      val setKeepAspectMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_keep_aspect_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_keep_aspect_mode" }
        }
      val setOrthogonal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_orthogonal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_orthogonal" }
        }
      val setPerspective: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_perspective".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_perspective" }
        }
      val setProjection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_projection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_projection" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }
      val setVOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_offset" }
        }
      val setZfar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_zfar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_zfar" }
        }
      val setZnear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_znear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_znear" }
        }
      val unprojectPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "unproject_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unproject_position" }
        }}
  }
}
