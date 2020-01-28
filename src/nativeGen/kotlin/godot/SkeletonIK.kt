// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SkeletonIK(
  _handle: COpaquePointer
) : Node(_handle) {
  var interpolation: Float
    get() {
       return getInterpolation() 
    }
    set(value) {
      setInterpolation(value)
    }

  var magnet: Vector3
    get() {
       return getMagnetPosition() 
    }
    set(value) {
      setMagnetPosition(value)
    }

  var maxIterations: Int
    get() {
       return getMaxIterations() 
    }
    set(value) {
      setMaxIterations(value)
    }

  var minDistance: Float
    get() {
       return getMinDistance() 
    }
    set(value) {
      setMinDistance(value)
    }

  var overrideTipBasis: Boolean
    get() {
       return isOverrideTipBasis() 
    }
    set(value) {
      setOverrideTipBasis(value)
    }

  var rootBone: String
    get() {
       return getRootBone() 
    }
    set(value) {
      setRootBone(value)
    }

  var target: Transform
    get() {
       return getTargetTransform() 
    }
    set(value) {
      setTargetTransform(value)
    }

  var targetNode: NodePath
    get() {
       return getTargetNode() 
    }
    set(value) {
      setTargetNode(value)
    }

  var tipBone: String
    get() {
       return getTipBone() 
    }
    set(value) {
      setTipBone(value)
    }

  var useMagnet: Boolean
    get() {
       return isUsingMagnet() 
    }
    set(value) {
      setUseMagnet(value)
    }

  fun getInterpolation(): Float {
    val _ret = __method_bind.getInterpolation.call(this._handle)
    return _ret.asFloat()
  }

  fun getMagnetPosition(): Vector3 {
    val _ret = __method_bind.getMagnetPosition.call(this._handle)
    return _ret.asVector3()
  }

  fun getMaxIterations(): Int {
    val _ret = __method_bind.getMaxIterations.call(this._handle)
    return _ret.asInt()
  }

  fun getMinDistance(): Float {
    val _ret = __method_bind.getMinDistance.call(this._handle)
    return _ret.asFloat()
  }

  fun getParentSkeleton(): Skeleton {
    val _ret = __method_bind.getParentSkeleton.call(this._handle)
    return _ret.asObject(::Skeleton)!!
  }

  fun getRootBone(): String {
    val _ret = __method_bind.getRootBone.call(this._handle)
    return _ret.asString()
  }

  fun getTargetNode(): NodePath {
    val _ret = __method_bind.getTargetNode.call(this._handle)
    return _ret.asNodePath()
  }

  fun getTargetTransform(): Transform {
    val _ret = __method_bind.getTargetTransform.call(this._handle)
    return _ret.asTransform()
  }

  fun getTipBone(): String {
    val _ret = __method_bind.getTipBone.call(this._handle)
    return _ret.asString()
  }

  fun isOverrideTipBasis(): Boolean {
    val _ret = __method_bind.isOverrideTipBasis.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRunning(): Boolean {
    val _ret = __method_bind.isRunning.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsingMagnet(): Boolean {
    val _ret = __method_bind.isUsingMagnet.call(this._handle)
    return _ret.asBoolean()
  }

  fun setInterpolation(interpolation: Float) {
    val _arg = Variant.new(interpolation)
    __method_bind.setInterpolation.call(this._handle, _arg, 1)
  }

  fun setMagnetPosition(localPosition: Vector3) {
    val _arg = Variant.new(localPosition)
    __method_bind.setMagnetPosition.call(this._handle, _arg, 1)
  }

  fun setMaxIterations(iterations: Int) {
    val _arg = Variant.new(iterations)
    __method_bind.setMaxIterations.call(this._handle, _arg, 1)
  }

  fun setMinDistance(minDistance: Float) {
    val _arg = Variant.new(minDistance)
    __method_bind.setMinDistance.call(this._handle, _arg, 1)
  }

  fun setOverrideTipBasis(override: Boolean) {
    val _arg = Variant.new(override)
    __method_bind.setOverrideTipBasis.call(this._handle, _arg, 1)
  }

  fun setRootBone(rootBone: String) {
    val _arg = Variant.new(rootBone)
    __method_bind.setRootBone.call(this._handle, _arg, 1)
  }

  fun setTargetNode(node: NodePath) {
    val _arg = Variant.new(node)
    __method_bind.setTargetNode.call(this._handle, _arg, 1)
  }

  fun setTargetTransform(target: Transform) {
    val _arg = Variant.new(target)
    __method_bind.setTargetTransform.call(this._handle, _arg, 1)
  }

  fun setTipBone(tipBone: String) {
    val _arg = Variant.new(tipBone)
    __method_bind.setTipBone.call(this._handle, _arg, 1)
  }

  fun setUseMagnet(use: Boolean) {
    val _arg = Variant.new(use)
    __method_bind.setUseMagnet.call(this._handle, _arg, 1)
  }

  fun start(oneTime: Boolean) {
    val _arg = Variant.new(oneTime)
    __method_bind.start.call(this._handle, _arg, 1)
  }

  fun stop() {
    __method_bind.stop.call(this._handle)
  }

  companion object {
    fun new(): SkeletonIK = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SkeletonIK".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SkeletonIK" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SkeletonIK(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SkeletonIK = SkeletonIK(ptr)
    /**
     * Container for method_bind pointers for SkeletonIK
     */
    private object __method_bind {
      val getInterpolation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_interpolation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_interpolation" }
        }
      val getMagnetPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_magnet_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_magnet_position" }
        }
      val getMaxIterations: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_max_iterations".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_iterations" }
        }
      val getMinDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_min_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_min_distance" }
        }
      val getParentSkeleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_parent_skeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent_skeleton" }
        }
      val getRootBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_root_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_root_bone" }
        }
      val getTargetNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_target_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_target_node" }
        }
      val getTargetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_target_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_target_transform" }
        }
      val getTipBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_tip_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tip_bone" }
        }
      val isOverrideTipBasis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "is_override_tip_basis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_override_tip_basis" }
        }
      val isRunning: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "is_running".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_running" }
        }
      val isUsingMagnet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "is_using_magnet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_magnet" }
        }
      val setInterpolation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_interpolation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_interpolation" }
        }
      val setMagnetPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_magnet_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_magnet_position" }
        }
      val setMaxIterations: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_max_iterations".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_iterations" }
        }
      val setMinDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_min_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_min_distance" }
        }
      val setOverrideTipBasis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_override_tip_basis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_override_tip_basis" }
        }
      val setRootBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_root_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_root_bone" }
        }
      val setTargetNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_target_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_target_node" }
        }
      val setTargetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_target_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_target_transform" }
        }
      val setTipBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_tip_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tip_bone" }
        }
      val setUseMagnet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_use_magnet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_magnet" }
        }
      val start: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "start".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method start" }
        }
      val stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }}
  }
}
