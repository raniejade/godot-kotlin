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
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
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

open class Skeleton(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addBone(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addBone.call(self._handle, listOf(name), null)
    }
  }

  fun bindChildNodeToBone(boneIdx: Int, node: Node) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(boneIdx)
      _args.add(node)
      __method_bind.bindChildNodeToBone.call(self._handle, _args, null)
    }
  }

  fun clearBones() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearBones.call(self._handle, emptyList(), null)
    }
  }

  fun findBone(name: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.findBone.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun getBoneCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBoneCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getBoneCustomPose(boneIdx: Int): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getBoneCustomPose.call(self._handle, listOf(boneIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBoneGlobalPose(boneIdx: Int): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getBoneGlobalPose.call(self._handle, listOf(boneIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBoneName(boneIdx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getBoneName.call(self._handle, listOf(boneIdx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getBoneParent(boneIdx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBoneParent.call(self._handle, listOf(boneIdx), _retPtr)
      _ret.value
    }
  }

  fun getBonePose(boneIdx: Int): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getBonePose.call(self._handle, listOf(boneIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBoneRest(boneIdx: Int): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getBoneRest.call(self._handle, listOf(boneIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBoundChildNodesToBone(boneIdx: Int): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getBoundChildNodesToBone.call(self._handle, listOf(boneIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isBoneRestDisabled(boneIdx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isBoneRestDisabled.call(self._handle, listOf(boneIdx), _retPtr)
      _ret.value
    }
  }

  fun localizeRests() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.localizeRests.call(self._handle, emptyList(), null)
    }
  }

  fun physicalBonesAddCollisionException(exception: RID) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.physicalBonesAddCollisionException.call(self._handle, listOf(exception), null)
    }
  }

  fun physicalBonesRemoveCollisionException(exception: RID) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.physicalBonesRemoveCollisionException.call(self._handle, listOf(exception),
          null)
    }
  }

  fun physicalBonesStartSimulation(bones: VariantArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.physicalBonesStartSimulation.call(self._handle, listOf(bones), null)
    }
  }

  fun physicalBonesStopSimulation() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.physicalBonesStopSimulation.call(self._handle, emptyList(), null)
    }
  }

  fun registerSkin(skin: Skin): SkinReference {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: SkinReference
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.registerSkin.call(self._handle, listOf(skin), _retPtr)
      _ret = objectToType<SkinReference>(_tmp.value!!)
      _ret
    }
  }

  fun setBoneCustomPose(boneIdx: Int, customPose: Transform) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(boneIdx)
      _args.add(customPose)
      __method_bind.setBoneCustomPose.call(self._handle, _args, null)
    }
  }

  fun setBoneDisableRest(boneIdx: Int, disable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(boneIdx)
      _args.add(disable)
      __method_bind.setBoneDisableRest.call(self._handle, _args, null)
    }
  }

  fun setBoneGlobalPoseOverride(
    boneIdx: Int,
    pose: Transform,
    amount: Float,
    persistent: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(boneIdx)
      _args.add(pose)
      _args.add(amount)
      _args.add(persistent)
      __method_bind.setBoneGlobalPoseOverride.call(self._handle, _args, null)
    }
  }

  fun setBoneParent(boneIdx: Int, parentIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(boneIdx)
      _args.add(parentIdx)
      __method_bind.setBoneParent.call(self._handle, _args, null)
    }
  }

  fun setBonePose(boneIdx: Int, pose: Transform) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(boneIdx)
      _args.add(pose)
      __method_bind.setBonePose.call(self._handle, _args, null)
    }
  }

  fun setBoneRest(boneIdx: Int, rest: Transform) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(boneIdx)
      _args.add(rest)
      __method_bind.setBoneRest.call(self._handle, _args, null)
    }
  }

  fun unbindChildNodeFromBone(boneIdx: Int, node: Node) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(boneIdx)
      _args.add(node)
      __method_bind.unbindChildNodeFromBone.call(self._handle, _args, null)
    }
  }

  fun unparentBoneAndRest(boneIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.unparentBoneAndRest.call(self._handle, listOf(boneIdx), null)
    }
  }

  companion object {
    val NOTIFICATION_UPDATE_SKELETON: Int = 50

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Skeleton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Skeleton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Skeleton
     */
    private object __method_bind {
      val addBone: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "add_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_bone" }
            }
          }

      val bindChildNodeToBone: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "bind_child_node_to_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method bind_child_node_to_bone" }
            }
          }

      val clearBones: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "clear_bones".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_bones" }
            }
          }

      val findBone: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "find_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_bone" }
            }
          }

      val getBoneCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_count" }
            }
          }

      val getBoneCustomPose: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_custom_pose".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_custom_pose" }
            }
          }

      val getBoneGlobalPose: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_global_pose".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_global_pose" }
            }
          }

      val getBoneName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_name" }
            }
          }

      val getBoneParent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_parent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_parent" }
            }
          }

      val getBonePose: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_pose".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_pose" }
            }
          }

      val getBoneRest: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bone_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_rest" }
            }
          }

      val getBoundChildNodesToBone: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "get_bound_child_nodes_to_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bound_child_nodes_to_bone"
              }
            }
          }

      val isBoneRestDisabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "is_bone_rest_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_bone_rest_disabled" }
            }
          }

      val localizeRests: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "localize_rests".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method localize_rests" }
            }
          }

      val physicalBonesAddCollisionException: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "physical_bones_add_collision_exception".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method physical_bones_add_collision_exception" }
            }
          }

      val physicalBonesRemoveCollisionException: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "physical_bones_remove_collision_exception".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method physical_bones_remove_collision_exception" }
            }
          }

      val physicalBonesStartSimulation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "physical_bones_start_simulation".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method physical_bones_start_simulation" }
            }
          }

      val physicalBonesStopSimulation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "physical_bones_stop_simulation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method physical_bones_stop_simulation"
              }
            }
          }

      val registerSkin: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "register_skin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method register_skin" }
            }
          }

      val setBoneCustomPose: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "set_bone_custom_pose".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_custom_pose" }
            }
          }

      val setBoneDisableRest: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "set_bone_disable_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_disable_rest" }
            }
          }

      val setBoneGlobalPoseOverride: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "set_bone_global_pose_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_global_pose_override"
              }
            }
          }

      val setBoneParent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "set_bone_parent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_parent" }
            }
          }

      val setBonePose: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "set_bone_pose".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_pose" }
            }
          }

      val setBoneRest: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "set_bone_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_rest" }
            }
          }

      val unbindChildNodeFromBone: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "unbind_child_node_from_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unbind_child_node_from_bone" }
            }
          }

      val unparentBoneAndRest: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
              "unparent_bone_and_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unparent_bone_and_rest" }
            }
          }
    }
  }
}
