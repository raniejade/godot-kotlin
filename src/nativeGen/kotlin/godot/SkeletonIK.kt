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

open class SkeletonIK internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun getInterpolation(): Float {
    val _ret = __method_bind.get_interpolation.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getMagnetPosition(): Vector3 {
    val _ret = __method_bind.get_magnet_position.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getMaxIterations(): Int {
    val _ret = __method_bind.get_max_iterations.call(this.toVariant())
    return _ret.asInt()
  }

  fun getMinDistance(): Float {
    val _ret = __method_bind.get_min_distance.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getParentSkeleton(): Skeleton {
    val _ret = __method_bind.get_parent_skeleton.call(this.toVariant())
    return _ret.asObject(::Skeleton)!!
  }

  fun getRootBone(): String {
    val _ret = __method_bind.get_root_bone.call(this.toVariant())
    return _ret.asString()
  }

  fun getTargetNode(): NodePath {
    val _ret = __method_bind.get_target_node.call(this.toVariant())
    return _ret.asNodePath()
  }

  fun getTargetTransform(): Transform {
    val _ret = __method_bind.get_target_transform.call(this.toVariant())
    return _ret.asTransform()
  }

  fun getTipBone(): String {
    val _ret = __method_bind.get_tip_bone.call(this.toVariant())
    return _ret.asString()
  }

  fun isOverrideTipBasis(): Boolean {
    val _ret = __method_bind.is_override_tip_basis.call(this.toVariant())
    return _ret.asBool()
  }

  fun isRunning(): Boolean {
    val _ret = __method_bind.is_running.call(this.toVariant())
    return _ret.asBool()
  }

  fun isUsingMagnet(): Boolean {
    val _ret = __method_bind.is_using_magnet.call(this.toVariant())
    return _ret.asBool()
  }

  fun setInterpolation(interpolation: Float) {
    val _arg = Variant.new(interpolation)
    __method_bind.set_interpolation.call(this.toVariant(), _arg, 1)
  }

  fun setMagnetPosition(localPosition: Vector3) {
    val _arg = Variant.new(localPosition)
    __method_bind.set_magnet_position.call(this.toVariant(), _arg, 1)
  }

  fun setMaxIterations(iterations: Int) {
    val _arg = Variant.new(iterations)
    __method_bind.set_max_iterations.call(this.toVariant(), _arg, 1)
  }

  fun setMinDistance(minDistance: Float) {
    val _arg = Variant.new(minDistance)
    __method_bind.set_min_distance.call(this.toVariant(), _arg, 1)
  }

  fun setOverrideTipBasis(override: Boolean) {
    val _arg = Variant.new(override)
    __method_bind.set_override_tip_basis.call(this.toVariant(), _arg, 1)
  }

  fun setRootBone(rootBone: String) {
    val _arg = Variant.new(rootBone)
    __method_bind.set_root_bone.call(this.toVariant(), _arg, 1)
  }

  fun setTargetNode(node: NodePath) {
    val _arg = Variant.new(node)
    __method_bind.set_target_node.call(this.toVariant(), _arg, 1)
  }

  fun setTargetTransform(target: Transform) {
    val _arg = Variant.new(target)
    __method_bind.set_target_transform.call(this.toVariant(), _arg, 1)
  }

  fun setTipBone(tipBone: String) {
    val _arg = Variant.new(tipBone)
    __method_bind.set_tip_bone.call(this.toVariant(), _arg, 1)
  }

  fun setUseMagnet(use: Boolean) {
    val _arg = Variant.new(use)
    __method_bind.set_use_magnet.call(this.toVariant(), _arg, 1)
  }

  fun start(oneTime: Boolean) {
    val _arg = Variant.new(oneTime)
    __method_bind.start.call(this.toVariant(), _arg, 1)
  }

  fun stop() {
    __method_bind.stop.call(this.toVariant())
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
      val get_interpolation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_interpolation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_interpolation" }
        }
      val get_magnet_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_magnet_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_magnet_position" }
        }
      val get_max_iterations: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_max_iterations".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_iterations" }
        }
      val get_min_distance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_min_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_min_distance" }
        }
      val get_parent_skeleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_parent_skeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent_skeleton" }
        }
      val get_root_bone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_root_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_root_bone" }
        }
      val get_target_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_target_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_target_node" }
        }
      val get_target_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_target_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_target_transform" }
        }
      val get_tip_bone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "get_tip_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tip_bone" }
        }
      val is_override_tip_basis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "is_override_tip_basis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_override_tip_basis" }
        }
      val is_running: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "is_running".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_running" }
        }
      val is_using_magnet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "is_using_magnet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_magnet" }
        }
      val set_interpolation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_interpolation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_interpolation" }
        }
      val set_magnet_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_magnet_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_magnet_position" }
        }
      val set_max_iterations: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_max_iterations".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_iterations" }
        }
      val set_min_distance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_min_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_min_distance" }
        }
      val set_override_tip_basis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_override_tip_basis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_override_tip_basis" }
        }
      val set_root_bone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_root_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_root_bone" }
        }
      val set_target_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_target_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_target_node" }
        }
      val set_target_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_target_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_target_transform" }
        }
      val set_tip_bone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
            "set_tip_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tip_bone" }
        }
      val set_use_magnet: CPointer<godot_method_bind>
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
