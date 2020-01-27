// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Skeleton internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun addBone(name: String) {
    val _arg = Variant.new(name)
    __method_bind.add_bone.call(this._handle, _arg, 1)
  }

  fun bindChildNodeToBone(boneIdx: Int, node: Node) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(node)
    __method_bind.bind_child_node_to_bone.call(this._handle, _args.toVariant(), 2)
  }

  fun clearBones() {
    __method_bind.clear_bones.call(this._handle)
  }

  fun findBone(name: String): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.find_bone.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getBoneCount(): Int {
    val _ret = __method_bind.get_bone_count.call(this._handle)
    return _ret.asInt()
  }

  fun getBoneCustomPose(boneIdx: Int): Transform {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.get_bone_custom_pose.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun getBoneGlobalPose(boneIdx: Int): Transform {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.get_bone_global_pose.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun getBoneName(boneIdx: Int): String {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.get_bone_name.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getBoneParent(boneIdx: Int): Int {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.get_bone_parent.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getBonePose(boneIdx: Int): Transform {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.get_bone_pose.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun getBoneRest(boneIdx: Int): Transform {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.get_bone_rest.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun getBoneTransform(boneIdx: Int): Transform {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.get_bone_transform.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun getBoundChildNodesToBone(boneIdx: Int): VariantArray {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.get_bound_child_nodes_to_bone.call(this._handle, _arg, 1)
    return _ret.asArray()
  }

  fun isBoneRestDisabled(boneIdx: Int): Boolean {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.is_bone_rest_disabled.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun isUsingBonesInWorldTransform(): Boolean {
    val _ret = __method_bind.is_using_bones_in_world_transform.call(this._handle)
    return _ret.asBool()
  }

  fun localizeRests() {
    __method_bind.localize_rests.call(this._handle)
  }

  fun physicalBonesAddCollisionException(exception: RID) {
    val _arg = Variant.new(exception)
    __method_bind.physical_bones_add_collision_exception.call(this._handle, _arg, 1)
  }

  fun physicalBonesRemoveCollisionException(exception: RID) {
    val _arg = Variant.new(exception)
    __method_bind.physical_bones_remove_collision_exception.call(this._handle, _arg, 1)
  }

  fun physicalBonesStartSimulation(bones: VariantArray) {
    val _arg = Variant.new(bones)
    __method_bind.physical_bones_start_simulation.call(this._handle, _arg, 1)
  }

  fun physicalBonesStopSimulation() {
    __method_bind.physical_bones_stop_simulation.call(this._handle)
  }

  fun setBoneCustomPose(boneIdx: Int, customPose: Transform) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(customPose)
    __method_bind.set_bone_custom_pose.call(this._handle, _args.toVariant(), 2)
  }

  fun setBoneDisableRest(boneIdx: Int, disable: Boolean) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(disable)
    __method_bind.set_bone_disable_rest.call(this._handle, _args.toVariant(), 2)
  }

  fun setBoneGlobalPose(boneIdx: Int, pose: Transform) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(pose)
    __method_bind.set_bone_global_pose.call(this._handle, _args.toVariant(), 2)
  }

  fun setBoneIgnoreAnimation(bone: Int, ignore: Boolean) {
    val _args = VariantArray.new()
    _args.append(bone)
    _args.append(ignore)
    __method_bind.set_bone_ignore_animation.call(this._handle, _args.toVariant(), 2)
  }

  fun setBoneParent(boneIdx: Int, parentIdx: Int) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(parentIdx)
    __method_bind.set_bone_parent.call(this._handle, _args.toVariant(), 2)
  }

  fun setBonePose(boneIdx: Int, pose: Transform) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(pose)
    __method_bind.set_bone_pose.call(this._handle, _args.toVariant(), 2)
  }

  fun setBoneRest(boneIdx: Int, rest: Transform) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(rest)
    __method_bind.set_bone_rest.call(this._handle, _args.toVariant(), 2)
  }

  fun setUseBonesInWorldTransform(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_use_bones_in_world_transform.call(this._handle, _arg, 1)
  }

  fun unbindChildNodeFromBone(boneIdx: Int, node: Node) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(node)
    __method_bind.unbind_child_node_from_bone.call(this._handle, _args.toVariant(), 2)
  }

  fun unparentBoneAndRest(boneIdx: Int) {
    val _arg = Variant.new(boneIdx)
    __method_bind.unparent_bone_and_rest.call(this._handle, _arg, 1)
  }

  companion object {
    val NOTIFICATION_UPDATE_SKELETON: Int = 50

    fun new(): Skeleton = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Skeleton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Skeleton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Skeleton(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Skeleton = Skeleton(ptr)
    /**
     * Container for method_bind pointers for Skeleton
     */
    private object __method_bind {
      val add_bone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "add_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_bone" }
        }
      val bind_child_node_to_bone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "bind_child_node_to_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bind_child_node_to_bone" }
        }
      val clear_bones: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "clear_bones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_bones" }
        }
      val find_bone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "find_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_bone" }
        }
      val get_bone_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_count" }
        }
      val get_bone_custom_pose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_custom_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_custom_pose" }
        }
      val get_bone_global_pose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_global_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_global_pose" }
        }
      val get_bone_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_name" }
        }
      val get_bone_parent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_parent" }
        }
      val get_bone_pose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_pose" }
        }
      val get_bone_rest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_rest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_rest" }
        }
      val get_bone_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_transform" }
        }
      val get_bound_child_nodes_to_bone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bound_child_nodes_to_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bound_child_nodes_to_bone" }
        }
      val is_bone_rest_disabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "is_bone_rest_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_bone_rest_disabled" }
        }
      val is_using_bones_in_world_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "is_using_bones_in_world_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_bones_in_world_transform"
            }
        }
      val localize_rests: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "localize_rests".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method localize_rests" }
        }
      val physical_bones_add_collision_exception: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "physical_bones_add_collision_exception".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method physical_bones_add_collision_exception" }
        }
      val physical_bones_remove_collision_exception: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "physical_bones_remove_collision_exception".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method physical_bones_remove_collision_exception" }
        }
      val physical_bones_start_simulation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "physical_bones_start_simulation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method physical_bones_start_simulation" }
        }
      val physical_bones_stop_simulation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "physical_bones_stop_simulation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method physical_bones_stop_simulation" }
        }
      val set_bone_custom_pose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "set_bone_custom_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_custom_pose" }
        }
      val set_bone_disable_rest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "set_bone_disable_rest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_disable_rest" }
        }
      val set_bone_global_pose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "set_bone_global_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_global_pose" }
        }
      val set_bone_ignore_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "set_bone_ignore_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_ignore_animation" }
        }
      val set_bone_parent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "set_bone_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_parent" }
        }
      val set_bone_pose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "set_bone_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_pose" }
        }
      val set_bone_rest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "set_bone_rest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_rest" }
        }
      val set_use_bones_in_world_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "set_use_bones_in_world_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_bones_in_world_transform" }
        }
      val unbind_child_node_from_bone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "unbind_child_node_from_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unbind_child_node_from_bone" }
        }
      val unparent_bone_and_rest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "unparent_bone_and_rest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unparent_bone_and_rest" }
        }}
  }
}
