// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Transform
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
    TODO()
  }

  fun getMagnetPosition(): Vector3 {
    TODO()
  }

  fun getMaxIterations(): Int {
    TODO()
  }

  fun getMinDistance(): Float {
    TODO()
  }

  fun getParentSkeleton(): Skeleton {
    TODO()
  }

  fun getRootBone(): String {
    TODO()
  }

  fun getTargetNode(): NodePath {
    TODO()
  }

  fun getTargetTransform(): Transform {
    TODO()
  }

  fun getTipBone(): String {
    TODO()
  }

  fun isOverrideTipBasis(): Boolean {
    TODO()
  }

  fun isRunning(): Boolean {
    TODO()
  }

  fun isUsingMagnet(): Boolean {
    TODO()
  }

  fun setInterpolation(interpolation: Float) {
    TODO()
  }

  fun setMagnetPosition(local_position: Vector3) {
    TODO()
  }

  fun setMaxIterations(iterations: Int) {
    TODO()
  }

  fun setMinDistance(min_distance: Float) {
    TODO()
  }

  fun setOverrideTipBasis(override: Boolean) {
    TODO()
  }

  fun setRootBone(root_bone: String) {
    TODO()
  }

  fun setTargetNode(node: NodePath) {
    TODO()
  }

  fun setTargetTransform(target: Transform) {
    TODO()
  }

  fun setTipBone(tip_bone: String) {
    TODO()
  }

  fun setUseMagnet(use: Boolean) {
    TODO()
  }

  fun start(one_time: Boolean) {
    TODO()
  }

  fun stop() {
    TODO()
  }

  companion object {
    fun new(): SkeletonIK = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SkeletonIK".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton SkeletonIK" }
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
      val get_interpolation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_interpolation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_interpolation" }
            }
          }

      val get_magnet_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_magnet_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_magnet_position" }
            }
          }

      val get_max_iterations: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_max_iterations".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_iterations" }
            }
          }

      val get_min_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_min_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_min_distance" }
            }
          }

      val get_parent_skeleton: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_parent_skeleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parent_skeleton" }
            }
          }

      val get_root_bone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_root_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_root_bone" }
            }
          }

      val get_target_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_target_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_target_node" }
            }
          }

      val get_target_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_target_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_target_transform" }
            }
          }

      val get_tip_bone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "get_tip_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tip_bone" }
            }
          }

      val is_override_tip_basis: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "is_override_tip_basis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_override_tip_basis" }
            }
          }

      val is_running: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "is_running".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_running" }
            }
          }

      val is_using_magnet: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "is_using_magnet".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_magnet" }
            }
          }

      val set_interpolation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_interpolation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_interpolation" }
            }
          }

      val set_magnet_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_magnet_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_magnet_position" }
            }
          }

      val set_max_iterations: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_max_iterations".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_iterations" }
            }
          }

      val set_min_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_min_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_min_distance" }
            }
          }

      val set_override_tip_basis: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_override_tip_basis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_override_tip_basis" }
            }
          }

      val set_root_bone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_root_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_root_bone" }
            }
          }

      val set_target_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_target_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_target_node" }
            }
          }

      val set_target_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_target_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_target_transform" }
            }
          }

      val set_tip_bone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_tip_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tip_bone" }
            }
          }

      val set_use_magnet: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "set_use_magnet".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_magnet" }
            }
          }

      val start: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "start".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method start" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkeletonIK".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
