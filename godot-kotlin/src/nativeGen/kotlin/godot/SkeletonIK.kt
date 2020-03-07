// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInterpolation.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMagnetPosition(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getMagnetPosition.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMaxIterations(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMaxIterations.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMinDistance(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMinDistance.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getParentSkeleton(): Skeleton {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Skeleton
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getParentSkeleton.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Skeleton>(_tmp.value!!)
      _ret
    }
  }

  fun getRootBone(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getRootBone.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getTargetNode(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getTargetNode.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTargetTransform(): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getTargetTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTipBone(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getTipBone.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun isOverrideTipBasis(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isOverrideTipBasis.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isRunning(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRunning.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isUsingMagnet(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUsingMagnet.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setInterpolation(interpolation: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInterpolation.call(self._handle, listOf(interpolation), null)
    }
  }

  fun setMagnetPosition(localPosition: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMagnetPosition.call(self._handle, listOf(localPosition), null)
    }
  }

  fun setMaxIterations(iterations: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaxIterations.call(self._handle, listOf(iterations), null)
    }
  }

  fun setMinDistance(minDistance: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMinDistance.call(self._handle, listOf(minDistance), null)
    }
  }

  fun setOverrideTipBasis(override: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOverrideTipBasis.call(self._handle, listOf(override), null)
    }
  }

  fun setRootBone(rootBone: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRootBone.call(self._handle, listOf(rootBone), null)
    }
  }

  fun setTargetNode(node: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTargetNode.call(self._handle, listOf(node), null)
    }
  }

  fun setTargetTransform(target: Transform) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTargetTransform.call(self._handle, listOf(target), null)
    }
  }

  fun setTipBone(tipBone: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTipBone.call(self._handle, listOf(tipBone), null)
    }
  }

  fun setUseMagnet(use: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseMagnet.call(self._handle, listOf(use), null)
    }
  }

  fun start(oneTime: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.start.call(self._handle, listOf(oneTime), null)
    }
  }

  fun stop() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.stop.call(self._handle, emptyList(), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SkeletonIK".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SkeletonIK" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SkeletonIK
     */
    private object __method_bind {
      val getInterpolation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_interpolation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_interpolation" }
            }
          }

      val getMagnetPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_magnet_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_magnet_position" }
            }
          }

      val getMaxIterations: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_max_iterations".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_iterations" }
            }
          }

      val getMinDistance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_min_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_min_distance" }
            }
          }

      val getParentSkeleton: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_parent_skeleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parent_skeleton" }
            }
          }

      val getRootBone: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_root_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_root_bone" }
            }
          }

      val getTargetNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_target_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_target_node" }
            }
          }

      val getTargetTransform: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_target_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_target_transform" }
            }
          }

      val getTipBone: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_tip_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tip_bone" }
            }
          }

      val isOverrideTipBasis: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "is_override_tip_basis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_override_tip_basis" }
            }
          }

      val isRunning: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "is_running".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_running" }
            }
          }

      val isUsingMagnet: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "is_using_magnet".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_magnet" }
            }
          }

      val setInterpolation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_interpolation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_interpolation" }
            }
          }

      val setMagnetPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_magnet_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_magnet_position" }
            }
          }

      val setMaxIterations: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_max_iterations".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_iterations" }
            }
          }

      val setMinDistance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_min_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_min_distance" }
            }
          }

      val setOverrideTipBasis: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_override_tip_basis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_override_tip_basis" }
            }
          }

      val setRootBone: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_root_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_root_bone" }
            }
          }

      val setTargetNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_target_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_target_node" }
            }
          }

      val setTargetTransform: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_target_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_target_transform" }
            }
          }

      val setTipBone: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_tip_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tip_bone" }
            }
          }

      val setUseMagnet: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_use_magnet".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_magnet" }
            }
          }

      val start: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "start".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method start" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
