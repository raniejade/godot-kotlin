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

  var dopplerTracking: Int
    get() {
       return Camera.DopplerTracking.from(getDopplerTracking()) 
    }
    set(value) {
      setDopplerTracking(Camera.DopplerTracking.from(value))
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

  var keepAspect: Int
    get() {
       return Camera.KeepAspect.from(getKeepAspectMode()) 
    }
    set(value) {
      setKeepAspectMode(Camera.KeepAspect.from(value))
    }

  var near: Float
    get() {
       return getZnear() 
    }
    set(value) {
      setZnear(value)
    }

  var projection: Int
    get() {
       return Camera.Projection.from(getProjection()) 
    }
    set(value) {
      setProjection(Camera.Projection.from(value))
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

  fun clearCurrent(enableNext: Boolean) {
    val _arg = Variant.new(enableNext)
    __method_bind.clearCurrent.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.getCullMaskBit.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.isPositionBehind.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun makeCurrent() {
    __method_bind.makeCurrent.call(this._handle)
  }

  fun projectLocalRayNormal(screenPoint: Vector2): Vector3 {
    val _arg = Variant.new(screenPoint)
    val _ret = __method_bind.projectLocalRayNormal.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun projectPosition(screenPoint: Vector2, zDepth: Float): Vector3 {
    val _args = VariantArray.new()
    _args.append(screenPoint)
    _args.append(zDepth)
    val _ret = __method_bind.projectPosition.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector3()
  }

  fun projectRayNormal(screenPoint: Vector2): Vector3 {
    val _arg = Variant.new(screenPoint)
    val _ret = __method_bind.projectRayNormal.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun projectRayOrigin(screenPoint: Vector2): Vector3 {
    val _arg = Variant.new(screenPoint)
    val _ret = __method_bind.projectRayOrigin.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun setCullMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setCullMask.call(this._handle, _arg, 1)
  }

  fun setCullMaskBit(layer: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(layer)
    _args.append(enable)
    __method_bind.setCullMaskBit.call(this._handle, _args.toVariant(), 2)
  }

  fun setCurrent(arg0: Boolean) {
    val _arg = Variant.new(arg0)
    __method_bind.setCurrent.call(this._handle, _arg, 1)
  }

  fun setDopplerTracking(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setDopplerTracking.call(this._handle, _arg, 1)
  }

  fun setEnvironment(env: Environment) {
    val _arg = Variant.new(env)
    __method_bind.setEnvironment.call(this._handle, _arg, 1)
  }

  fun setFov(arg0: Float) {
    val _arg = Variant.new(arg0)
    __method_bind.setFov.call(this._handle, _arg, 1)
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
    __method_bind.setFrustum.call(this._handle, _args.toVariant(), 4)
  }

  fun setFrustumOffset(arg0: Vector2) {
    val _arg = Variant.new(arg0)
    __method_bind.setFrustumOffset.call(this._handle, _arg, 1)
  }

  fun setHOffset(ofs: Float) {
    val _arg = Variant.new(ofs)
    __method_bind.setHOffset.call(this._handle, _arg, 1)
  }

  fun setKeepAspectMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setKeepAspectMode.call(this._handle, _arg, 1)
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
    __method_bind.setOrthogonal.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.setPerspective.call(this._handle, _args.toVariant(), 3)
  }

  fun setProjection(arg0: Int) {
    val _arg = Variant.new(arg0)
    __method_bind.setProjection.call(this._handle, _arg, 1)
  }

  fun setSize(arg0: Float) {
    val _arg = Variant.new(arg0)
    __method_bind.setSize.call(this._handle, _arg, 1)
  }

  fun setVOffset(ofs: Float) {
    val _arg = Variant.new(ofs)
    __method_bind.setVOffset.call(this._handle, _arg, 1)
  }

  fun setZfar(arg0: Float) {
    val _arg = Variant.new(arg0)
    __method_bind.setZfar.call(this._handle, _arg, 1)
  }

  fun setZnear(arg0: Float) {
    val _arg = Variant.new(arg0)
    __method_bind.setZnear.call(this._handle, _arg, 1)
  }

  fun unprojectPosition(worldPoint: Vector3): Vector2 {
    val _arg = Variant.new(worldPoint)
    val _ret = __method_bind.unprojectPosition.call(this._handle, _arg, 1)
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
      val clearCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "clearCurrent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearCurrent" }
        }
      val getCameraRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getCameraRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCameraRid" }
        }
      val getCameraTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getCameraTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCameraTransform" }
        }
      val getCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCullMask" }
        }
      val getCullMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getCullMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCullMaskBit" }
        }
      val getDopplerTracking: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getDopplerTracking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDopplerTracking" }
        }
      val getEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getEnvironment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEnvironment" }
        }
      val getFov: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getFov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFov" }
        }
      val getFrustum: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getFrustum".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFrustum" }
        }
      val getFrustumOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getFrustumOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFrustumOffset" }
        }
      val getHOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getHOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHOffset" }
        }
      val getKeepAspectMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getKeepAspectMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getKeepAspectMode" }
        }
      val getProjection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getProjection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProjection" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSize" }
        }
      val getVOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getVOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVOffset" }
        }
      val getZfar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getZfar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getZfar" }
        }
      val getZnear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "getZnear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getZnear" }
        }
      val isCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "isCurrent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCurrent" }
        }
      val isPositionBehind: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "isPositionBehind".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPositionBehind" }
        }
      val makeCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "makeCurrent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method makeCurrent" }
        }
      val projectLocalRayNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "projectLocalRayNormal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method projectLocalRayNormal" }
        }
      val projectPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "projectPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method projectPosition" }
        }
      val projectRayNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "projectRayNormal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method projectRayNormal" }
        }
      val projectRayOrigin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "projectRayOrigin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method projectRayOrigin" }
        }
      val setCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCullMask" }
        }
      val setCullMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setCullMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCullMaskBit" }
        }
      val setCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setCurrent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCurrent" }
        }
      val setDopplerTracking: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setDopplerTracking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDopplerTracking" }
        }
      val setEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setEnvironment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEnvironment" }
        }
      val setFov: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setFov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFov" }
        }
      val setFrustum: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setFrustum".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFrustum" }
        }
      val setFrustumOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setFrustumOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFrustumOffset" }
        }
      val setHOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setHOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHOffset" }
        }
      val setKeepAspectMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setKeepAspectMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setKeepAspectMode" }
        }
      val setOrthogonal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setOrthogonal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOrthogonal" }
        }
      val setPerspective: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setPerspective".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPerspective" }
        }
      val setProjection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setProjection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProjection" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSize" }
        }
      val setVOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setVOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVOffset" }
        }
      val setZfar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setZfar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setZfar" }
        }
      val setZnear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "setZnear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setZnear" }
        }
      val unprojectPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera".cstr.ptr,
            "unprojectPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unprojectPosition" }
        }}
  }
}
