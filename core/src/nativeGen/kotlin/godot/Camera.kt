// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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

open class Camera(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearCurrent.call(self._handle, listOf(enableNext), null)
    }
  }

  fun getCameraRid(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getCameraRid.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCameraTransform(): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getCameraTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCullMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCullMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCullMaskBit(layer: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCullMaskBit.call(self._handle, listOf(layer), _retPtr)
      _ret.value
    }
  }

  fun getDopplerTracking(): DopplerTracking {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDopplerTracking.call(self._handle, emptyList(), _retPtr)
      Camera.DopplerTracking.from(_ret.value)
    }
  }

  fun getEnvironment(): Environment {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Environment
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getEnvironment.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Environment>(_tmp.value!!)
      _ret
    }
  }

  fun getFov(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFov.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFrustum(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getFrustum.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFrustumOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getFrustumOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getHOffset(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHOffset.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getKeepAspectMode(): KeepAspect {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getKeepAspectMode.call(self._handle, emptyList(), _retPtr)
      Camera.KeepAspect.from(_ret.value)
    }
  }

  fun getProjection(): Projection {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getProjection.call(self._handle, emptyList(), _retPtr)
      Camera.Projection.from(_ret.value)
    }
  }

  fun getSize(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSize.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getVOffset(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVOffset.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getZfar(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getZfar.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getZnear(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getZnear.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isCurrent(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCurrent.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPositionBehind(worldPoint: Vector3): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPositionBehind.call(self._handle, listOf(worldPoint), _retPtr)
      _ret.value
    }
  }

  fun makeCurrent() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.makeCurrent.call(self._handle, emptyList(), null)
    }
  }

  fun projectLocalRayNormal(screenPoint: Vector2): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.projectLocalRayNormal.call(self._handle, listOf(screenPoint), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun projectPosition(screenPoint: Vector2, zDepth: Float): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(screenPoint)
      _args.add(zDepth)
      __method_bind.projectPosition.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun projectRayNormal(screenPoint: Vector2): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.projectRayNormal.call(self._handle, listOf(screenPoint), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun projectRayOrigin(screenPoint: Vector2): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.projectRayOrigin.call(self._handle, listOf(screenPoint), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setCullMask(mask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCullMask.call(self._handle, listOf(mask), null)
    }
  }

  fun setCullMaskBit(layer: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(layer)
      _args.add(enable)
      __method_bind.setCullMaskBit.call(self._handle, _args, null)
    }
  }

  fun setCurrent(arg0: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCurrent.call(self._handle, listOf(arg0), null)
    }
  }

  fun setDopplerTracking(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDopplerTracking.call(self._handle, listOf(mode), null)
    }
  }

  fun setEnvironment(env: Environment) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnvironment.call(self._handle, listOf(env), null)
    }
  }

  fun setFov(arg0: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFov.call(self._handle, listOf(arg0), null)
    }
  }

  fun setFrustum(
    size: Float,
    offset: Vector2,
    zNear: Float,
    zFar: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(size)
      _args.add(offset)
      _args.add(zNear)
      _args.add(zFar)
      __method_bind.setFrustum.call(self._handle, _args, null)
    }
  }

  fun setFrustumOffset(arg0: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFrustumOffset.call(self._handle, listOf(arg0), null)
    }
  }

  fun setHOffset(ofs: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHOffset.call(self._handle, listOf(ofs), null)
    }
  }

  fun setKeepAspectMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setKeepAspectMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setOrthogonal(
    size: Float,
    zNear: Float,
    zFar: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(size)
      _args.add(zNear)
      _args.add(zFar)
      __method_bind.setOrthogonal.call(self._handle, _args, null)
    }
  }

  fun setPerspective(
    fov: Float,
    zNear: Float,
    zFar: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(fov)
      _args.add(zNear)
      _args.add(zFar)
      __method_bind.setPerspective.call(self._handle, _args, null)
    }
  }

  fun setProjection(arg0: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProjection.call(self._handle, listOf(arg0), null)
    }
  }

  fun setSize(arg0: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSize.call(self._handle, listOf(arg0), null)
    }
  }

  fun setVOffset(ofs: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVOffset.call(self._handle, listOf(ofs), null)
    }
  }

  fun setZfar(arg0: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setZfar.call(self._handle, listOf(arg0), null)
    }
  }

  fun setZnear(arg0: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setZnear.call(self._handle, listOf(arg0), null)
    }
  }

  fun unprojectPosition(worldPoint: Vector3): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.unprojectPosition.call(self._handle, listOf(worldPoint), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  enum class KeepAspect(
    val value: Int
  ) {
    WIDTH(0),

    HEIGHT(1);

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
    DISABLED(0),

    IDLE_STEP(1),

    PHYSICS_STEP(2);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Camera".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Camera" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Camera
     */
    private object __method_bind {
      val clearCurrent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "clear_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_current" }
        }
      val getCameraRid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_camera_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_rid" }
        }
      val getCameraTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_camera_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_transform" }
        }
      val getCullMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cull_mask" }
        }
      val getCullMaskBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_cull_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cull_mask_bit" }
        }
      val getDopplerTracking: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_doppler_tracking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_doppler_tracking" }
        }
      val getEnvironment: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_environment" }
        }
      val getFov: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_fov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fov" }
        }
      val getFrustum: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_frustum".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frustum" }
        }
      val getFrustumOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_frustum_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frustum_offset" }
        }
      val getHOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_offset" }
        }
      val getKeepAspectMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_keep_aspect_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_keep_aspect_mode" }
        }
      val getProjection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_projection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_projection" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getVOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_offset" }
        }
      val getZfar: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_zfar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_zfar" }
        }
      val getZnear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "get_znear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_znear" }
        }
      val isCurrent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "is_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_current" }
        }
      val isPositionBehind: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "is_position_behind".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_position_behind" }
        }
      val makeCurrent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "make_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_current" }
        }
      val projectLocalRayNormal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "project_local_ray_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method project_local_ray_normal" }
        }
      val projectPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "project_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method project_position" }
        }
      val projectRayNormal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "project_ray_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method project_ray_normal" }
        }
      val projectRayOrigin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "project_ray_origin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method project_ray_origin" }
        }
      val setCullMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cull_mask" }
        }
      val setCullMaskBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_cull_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cull_mask_bit" }
        }
      val setCurrent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current" }
        }
      val setDopplerTracking: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_doppler_tracking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_doppler_tracking" }
        }
      val setEnvironment: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_environment" }
        }
      val setFov: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_fov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fov" }
        }
      val setFrustum: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_frustum".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frustum" }
        }
      val setFrustumOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_frustum_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frustum_offset" }
        }
      val setHOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_offset" }
        }
      val setKeepAspectMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_keep_aspect_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_keep_aspect_mode" }
        }
      val setOrthogonal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_orthogonal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_orthogonal" }
        }
      val setPerspective: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_perspective".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_perspective" }
        }
      val setProjection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_projection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_projection" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }
      val setVOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_offset" }
        }
      val setZfar: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_zfar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_zfar" }
        }
      val setZnear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "set_znear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_znear" }
        }
      val unprojectPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "unproject_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unproject_position" }
        }}
  }
}
