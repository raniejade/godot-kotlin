// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Skeleton(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun addBone(name: String) {
    val _arg = Variant(name)
    __method_bind.addBone.call(this._handle, listOf(_arg))
  }

  fun bindChildNodeToBone(boneIdx: Int, node: Node) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(boneIdx))
    _args.add(Variant.fromAny(node))
    __method_bind.bindChildNodeToBone.call(this._handle, _args)
  }

  fun clearBones() {
    __method_bind.clearBones.call(this._handle)
  }

  fun findBone(name: String): Int {
    val _arg = Variant(name)
    val _ret = __method_bind.findBone.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getBoneCount(): Int {
    val _ret = __method_bind.getBoneCount.call(this._handle)
    return _ret.asInt()
  }

  fun getBoneCustomPose(boneIdx: Int): Transform {
    val _arg = Variant(boneIdx)
    val _ret = __method_bind.getBoneCustomPose.call(this._handle, listOf(_arg))
    return _ret.asTransform()
  }

  fun getBoneGlobalPose(boneIdx: Int): Transform {
    val _arg = Variant(boneIdx)
    val _ret = __method_bind.getBoneGlobalPose.call(this._handle, listOf(_arg))
    return _ret.asTransform()
  }

  fun getBoneName(boneIdx: Int): String {
    val _arg = Variant(boneIdx)
    val _ret = __method_bind.getBoneName.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getBoneParent(boneIdx: Int): Int {
    val _arg = Variant(boneIdx)
    val _ret = __method_bind.getBoneParent.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getBonePose(boneIdx: Int): Transform {
    val _arg = Variant(boneIdx)
    val _ret = __method_bind.getBonePose.call(this._handle, listOf(_arg))
    return _ret.asTransform()
  }

  fun getBoneRest(boneIdx: Int): Transform {
    val _arg = Variant(boneIdx)
    val _ret = __method_bind.getBoneRest.call(this._handle, listOf(_arg))
    return _ret.asTransform()
  }

  fun getBoundChildNodesToBone(boneIdx: Int): VariantArray {
    val _arg = Variant(boneIdx)
    val _ret = __method_bind.getBoundChildNodesToBone.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun isBoneRestDisabled(boneIdx: Int): Boolean {
    val _arg = Variant(boneIdx)
    val _ret = __method_bind.isBoneRestDisabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun localizeRests() {
    __method_bind.localizeRests.call(this._handle)
  }

  fun physicalBonesAddCollisionException(exception: RID) {
    val _arg = Variant(exception)
    __method_bind.physicalBonesAddCollisionException.call(this._handle, listOf(_arg))
  }

  fun physicalBonesRemoveCollisionException(exception: RID) {
    val _arg = Variant(exception)
    __method_bind.physicalBonesRemoveCollisionException.call(this._handle, listOf(_arg))
  }

  fun physicalBonesStartSimulation(bones: VariantArray) {
    val _arg = Variant(bones)
    __method_bind.physicalBonesStartSimulation.call(this._handle, listOf(_arg))
  }

  fun physicalBonesStopSimulation() {
    __method_bind.physicalBonesStopSimulation.call(this._handle)
  }

  fun registerSkin(skin: Skin): SkinReference {
    val _arg = Variant(skin)
    val _ret = __method_bind.registerSkin.call(this._handle, listOf(_arg))
    return _ret.toAny() as SkinReference
  }

  fun setBoneCustomPose(boneIdx: Int, customPose: Transform) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(boneIdx))
    _args.add(Variant.fromAny(customPose))
    __method_bind.setBoneCustomPose.call(this._handle, _args)
  }

  fun setBoneDisableRest(boneIdx: Int, disable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(boneIdx))
    _args.add(Variant.fromAny(disable))
    __method_bind.setBoneDisableRest.call(this._handle, _args)
  }

  fun setBoneGlobalPoseOverride(
    boneIdx: Int,
    pose: Transform,
    amount: Float,
    persistent: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(boneIdx))
    _args.add(Variant.fromAny(pose))
    _args.add(Variant.fromAny(amount))
    _args.add(Variant.fromAny(persistent))
    __method_bind.setBoneGlobalPoseOverride.call(this._handle, _args)
  }

  fun setBoneParent(boneIdx: Int, parentIdx: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(boneIdx))
    _args.add(Variant.fromAny(parentIdx))
    __method_bind.setBoneParent.call(this._handle, _args)
  }

  fun setBonePose(boneIdx: Int, pose: Transform) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(boneIdx))
    _args.add(Variant.fromAny(pose))
    __method_bind.setBonePose.call(this._handle, _args)
  }

  fun setBoneRest(boneIdx: Int, rest: Transform) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(boneIdx))
    _args.add(Variant.fromAny(rest))
    __method_bind.setBoneRest.call(this._handle, _args)
  }

  fun unbindChildNodeFromBone(boneIdx: Int, node: Node) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(boneIdx))
    _args.add(Variant.fromAny(node))
    __method_bind.unbindChildNodeFromBone.call(this._handle, _args)
  }

  fun unparentBoneAndRest(boneIdx: Int) {
    val _arg = Variant(boneIdx)
    __method_bind.unparentBoneAndRest.call(this._handle, listOf(_arg))
  }

  companion object {
    val NOTIFICATION_UPDATE_SKELETON: Int = 50

    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Skeleton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Skeleton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Skeleton
     */
    private object __method_bind {
      val addBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "add_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_bone" }
        }
      val bindChildNodeToBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "bind_child_node_to_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bind_child_node_to_bone" }
        }
      val clearBones: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "clear_bones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_bones" }
        }
      val findBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "find_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_bone" }
        }
      val getBoneCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_count" }
        }
      val getBoneCustomPose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_custom_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_custom_pose" }
        }
      val getBoneGlobalPose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_global_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_global_pose" }
        }
      val getBoneName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_name" }
        }
      val getBoneParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_parent" }
        }
      val getBonePose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_pose" }
        }
      val getBoneRest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bone_rest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_rest" }
        }
      val getBoundChildNodesToBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "get_bound_child_nodes_to_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bound_child_nodes_to_bone" }
        }
      val isBoneRestDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "is_bone_rest_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_bone_rest_disabled" }
        }
      val localizeRests: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "localize_rests".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method localize_rests" }
        }
      val physicalBonesAddCollisionException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "physical_bones_add_collision_exception".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method physical_bones_add_collision_exception" }
        }
      val physicalBonesRemoveCollisionException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "physical_bones_remove_collision_exception".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method physical_bones_remove_collision_exception" }
        }
      val physicalBonesStartSimulation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "physical_bones_start_simulation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method physical_bones_start_simulation" }
        }
      val physicalBonesStopSimulation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "physical_bones_stop_simulation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method physical_bones_stop_simulation" }
        }
      val registerSkin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "register_skin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method register_skin" }
        }
      val setBoneCustomPose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "set_bone_custom_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_custom_pose" }
        }
      val setBoneDisableRest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "set_bone_disable_rest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_disable_rest" }
        }
      val setBoneGlobalPoseOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "set_bone_global_pose_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_global_pose_override" }
        }
      val setBoneParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "set_bone_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_parent" }
        }
      val setBonePose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "set_bone_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_pose" }
        }
      val setBoneRest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "set_bone_rest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_rest" }
        }
      val unbindChildNodeFromBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "unbind_child_node_from_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unbind_child_node_from_bone" }
        }
      val unparentBoneAndRest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "unparent_bone_and_rest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unparent_bone_and_rest" }
        }}
  }
}
