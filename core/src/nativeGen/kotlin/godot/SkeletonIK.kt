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
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SkeletonIK(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
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

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for magnet
   */
  fun magnet(cb: Vector3.() -> Unit) {
    val _p = magnet
    cb(_p)
    magnet = _p
  }

  /**
   * Specialized setter for target
   */
  fun target(cb: Transform.() -> Unit) {
    val _p = target
    cb(_p)
    target = _p
  }

  /**
   * Specialized setter for targetNode
   */
  fun targetNode(cb: NodePath.() -> Unit) {
    val _p = targetNode
    cb(_p)
    targetNode = _p
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
    val _arg = Variant(interpolation)
    __method_bind.setInterpolation.call(this._handle, listOf(_arg))
  }

  fun setMagnetPosition(localPosition: Vector3) {
    val _arg = Variant(localPosition)
    __method_bind.setMagnetPosition.call(this._handle, listOf(_arg))
  }

  fun setMaxIterations(iterations: Int) {
    val _arg = Variant(iterations)
    __method_bind.setMaxIterations.call(this._handle, listOf(_arg))
  }

  fun setMinDistance(minDistance: Float) {
    val _arg = Variant(minDistance)
    __method_bind.setMinDistance.call(this._handle, listOf(_arg))
  }

  fun setOverrideTipBasis(override: Boolean) {
    val _arg = Variant(override)
    __method_bind.setOverrideTipBasis.call(this._handle, listOf(_arg))
  }

  fun setRootBone(rootBone: String) {
    val _arg = Variant(rootBone)
    __method_bind.setRootBone.call(this._handle, listOf(_arg))
  }

  fun setTargetNode(node: NodePath) {
    val _arg = Variant(node)
    __method_bind.setTargetNode.call(this._handle, listOf(_arg))
  }

  fun setTargetTransform(target: Transform) {
    val _arg = Variant(target)
    __method_bind.setTargetTransform.call(this._handle, listOf(_arg))
  }

  fun setTipBone(tipBone: String) {
    val _arg = Variant(tipBone)
    __method_bind.setTipBone.call(this._handle, listOf(_arg))
  }

  fun setUseMagnet(use: Boolean) {
    val _arg = Variant(use)
    __method_bind.setUseMagnet.call(this._handle, listOf(_arg))
  }

  fun start(oneTime: Boolean = false) {
    val _arg = Variant(oneTime)
    __method_bind.start.call(this._handle, listOf(_arg))
  }

  fun stop() {
    __method_bind.stop.call(this._handle)
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SkeletonIK".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SkeletonIK" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
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
