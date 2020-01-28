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
    val _args = VariantArray.new()
    _args.append(axis)
    _args.append(angle)
    __method_bind.globalRotate.call(this._handle, _args.toVariant(), 2)
  }

  fun globalScale(scale: Vector3) {
    val _arg = Variant.new(scale)
    __method_bind.globalScale.call(this._handle, _arg, 1)
  }

  fun globalTranslate(offset: Vector3) {
    val _arg = Variant.new(offset)
    __method_bind.globalTranslate.call(this._handle, _arg, 1)
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
    val _args = VariantArray.new()
    _args.append(target)
    _args.append(up)
    __method_bind.lookAt.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.lookAtFromPosition.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.rotateObjectLocal.call(this._handle, _args.toVariant(), 2)
  }

  fun rotateX(angle: Float) {
    val _arg = Variant.new(angle)
    __method_bind.rotateX.call(this._handle, _arg, 1)
  }

  fun rotateY(angle: Float) {
    val _arg = Variant.new(angle)
    __method_bind.rotateY.call(this._handle, _arg, 1)
  }

  fun rotateZ(angle: Float) {
    val _arg = Variant.new(angle)
    __method_bind.rotateZ.call(this._handle, _arg, 1)
  }

  fun scaleObjectLocal(scale: Vector3) {
    val _arg = Variant.new(scale)
    __method_bind.scaleObjectLocal.call(this._handle, _arg, 1)
  }

  fun setAsToplevel(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAsToplevel.call(this._handle, _arg, 1)
  }

  fun setDisableScale(disable: Boolean) {
    val _arg = Variant.new(disable)
    __method_bind.setDisableScale.call(this._handle, _arg, 1)
  }

  fun setGizmo(gizmo: SpatialGizmo) {
    val _arg = Variant.new(gizmo)
    __method_bind.setGizmo.call(this._handle, _arg, 1)
  }

  fun setGlobalTransform(global: Transform) {
    val _arg = Variant.new(global)
    __method_bind.setGlobalTransform.call(this._handle, _arg, 1)
  }

  fun setIdentity() {
    __method_bind.setIdentity.call(this._handle)
  }

  fun setIgnoreTransformNotification(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setIgnoreTransformNotification.call(this._handle, _arg, 1)
  }

  fun setNotifyLocalTransform(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setNotifyLocalTransform.call(this._handle, _arg, 1)
  }

  fun setNotifyTransform(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setNotifyTransform.call(this._handle, _arg, 1)
  }

  fun setRotation(euler: Vector3) {
    val _arg = Variant.new(euler)
    __method_bind.setRotation.call(this._handle, _arg, 1)
  }

  fun setRotationDegrees(eulerDegrees: Vector3) {
    val _arg = Variant.new(eulerDegrees)
    __method_bind.setRotationDegrees.call(this._handle, _arg, 1)
  }

  fun setScale(scale: Vector3) {
    val _arg = Variant.new(scale)
    __method_bind.setScale.call(this._handle, _arg, 1)
  }

  fun setTransform(local: Transform) {
    val _arg = Variant.new(local)
    __method_bind.setTransform.call(this._handle, _arg, 1)
  }

  fun setTranslation(translation: Vector3) {
    val _arg = Variant.new(translation)
    __method_bind.setTranslation.call(this._handle, _arg, 1)
  }

  fun setVisible(visible: Boolean) {
    val _arg = Variant.new(visible)
    __method_bind.setVisible.call(this._handle, _arg, 1)
  }

  fun show() {
    __method_bind.show.call(this._handle)
  }

  fun toGlobal(localPoint: Vector3): Vector3 {
    val _arg = Variant.new(localPoint)
    val _ret = __method_bind.toGlobal.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun toLocal(globalPoint: Vector3): Vector3 {
    val _arg = Variant.new(globalPoint)
    val _ret = __method_bind.toLocal.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun translate(offset: Vector3) {
    val _arg = Variant.new(offset)
    __method_bind.translate.call(this._handle, _arg, 1)
  }

  fun translateObjectLocal(offset: Vector3) {
    val _arg = Variant.new(offset)
    __method_bind.translateObjectLocal.call(this._handle, _arg, 1)
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
            "forceUpdateTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method forceUpdateTransform" }
        }
      val getGizmo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "getGizmo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGizmo" }
        }
      val getGlobalTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "getGlobalTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlobalTransform" }
        }
      val getParentSpatial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "getParentSpatial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParentSpatial" }
        }
      val getRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "getRotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRotation" }
        }
      val getRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "getRotationDegrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRotationDegrees" }
        }
      val getScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "getScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScale" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "getTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTransform" }
        }
      val getTranslation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "getTranslation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTranslation" }
        }
      val getWorld: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "getWorld".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWorld" }
        }
      val globalRotate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "globalRotate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method globalRotate" }
        }
      val globalScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "globalScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method globalScale" }
        }
      val globalTranslate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "globalTranslate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method globalTranslate" }
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
            "isLocalTransformNotificationEnabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method isLocalTransformNotificationEnabled" }
        }
      val isScaleDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "isScaleDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isScaleDisabled" }
        }
      val isSetAsToplevel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "isSetAsToplevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSetAsToplevel" }
        }
      val isTransformNotificationEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "isTransformNotificationEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isTransformNotificationEnabled" }
        }
      val isVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "isVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isVisible" }
        }
      val isVisibleInTree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "isVisibleInTree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isVisibleInTree" }
        }
      val lookAt: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "lookAt".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lookAt" }
        }
      val lookAtFromPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "lookAtFromPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lookAtFromPosition" }
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
            "rotateObjectLocal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotateObjectLocal" }
        }
      val rotateX: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotateX".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotateX" }
        }
      val rotateY: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotateY".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotateY" }
        }
      val rotateZ: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "rotateZ".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rotateZ" }
        }
      val scaleObjectLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "scaleObjectLocal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scaleObjectLocal" }
        }
      val setAsToplevel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "setAsToplevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAsToplevel" }
        }
      val setDisableScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "setDisableScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDisableScale" }
        }
      val setGizmo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "setGizmo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGizmo" }
        }
      val setGlobalTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "setGlobalTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlobalTransform" }
        }
      val setIdentity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "setIdentity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIdentity" }
        }
      val setIgnoreTransformNotification: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "setIgnoreTransformNotification".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIgnoreTransformNotification" }
        }
      val setNotifyLocalTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "setNotifyLocalTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNotifyLocalTransform" }
        }
      val setNotifyTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "setNotifyTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNotifyTransform" }
        }
      val setRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "setRotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRotation" }
        }
      val setRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "setRotationDegrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRotationDegrees" }
        }
      val setScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "setScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setScale" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "setTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTransform" }
        }
      val setTranslation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "setTranslation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTranslation" }
        }
      val setVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "setVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVisible" }
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
            "toGlobal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method toGlobal" }
        }
      val toLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "toLocal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method toLocal" }
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
            "translateObjectLocal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method translateObjectLocal" }
        }
      val updateGizmo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Spatial".cstr.ptr,
            "updateGizmo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method updateGizmo" }
        }}
  }
}
