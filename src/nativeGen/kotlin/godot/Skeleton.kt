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

open class Skeleton(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var bonesInWorldTransform: Boolean
    get() {
       return isUsingBonesInWorldTransform() 
    }
    set(value) {
      setUseBonesInWorldTransform(value)
    }

  fun addBone(name: String) {
    val _arg = Variant.new(name)
    __method_bind.addBone.call(this._handle, _arg, 1)
  }

  fun bindChildNodeToBone(boneIdx: Int, node: Node) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(node)
    __method_bind.bindChildNodeToBone.call(this._handle, _args.toVariant(), 2)
  }

  fun clearBones() {
    __method_bind.clearBones.call(this._handle)
  }

  fun findBone(name: String): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.findBone.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getBoneCount(): Int {
    val _ret = __method_bind.getBoneCount.call(this._handle)
    return _ret.asInt()
  }

  fun getBoneCustomPose(boneIdx: Int): Transform {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.getBoneCustomPose.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun getBoneGlobalPose(boneIdx: Int): Transform {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.getBoneGlobalPose.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun getBoneName(boneIdx: Int): String {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.getBoneName.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getBoneParent(boneIdx: Int): Int {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.getBoneParent.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getBonePose(boneIdx: Int): Transform {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.getBonePose.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun getBoneRest(boneIdx: Int): Transform {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.getBoneRest.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun getBoneTransform(boneIdx: Int): Transform {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.getBoneTransform.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun getBoundChildNodesToBone(boneIdx: Int): VariantArray {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.getBoundChildNodesToBone.call(this._handle, _arg, 1)
    return _ret.asVariantArray()
  }

  fun isBoneRestDisabled(boneIdx: Int): Boolean {
    val _arg = Variant.new(boneIdx)
    val _ret = __method_bind.isBoneRestDisabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isUsingBonesInWorldTransform(): Boolean {
    val _ret = __method_bind.isUsingBonesInWorldTransform.call(this._handle)
    return _ret.asBoolean()
  }

  fun localizeRests() {
    __method_bind.localizeRests.call(this._handle)
  }

  fun physicalBonesAddCollisionException(exception: RID) {
    val _arg = Variant.new(exception)
    __method_bind.physicalBonesAddCollisionException.call(this._handle, _arg, 1)
  }

  fun physicalBonesRemoveCollisionException(exception: RID) {
    val _arg = Variant.new(exception)
    __method_bind.physicalBonesRemoveCollisionException.call(this._handle, _arg, 1)
  }

  fun physicalBonesStartSimulation(bones: VariantArray) {
    val _arg = Variant.new(bones)
    __method_bind.physicalBonesStartSimulation.call(this._handle, _arg, 1)
  }

  fun physicalBonesStopSimulation() {
    __method_bind.physicalBonesStopSimulation.call(this._handle)
  }

  fun setBoneCustomPose(boneIdx: Int, customPose: Transform) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(customPose)
    __method_bind.setBoneCustomPose.call(this._handle, _args.toVariant(), 2)
  }

  fun setBoneDisableRest(boneIdx: Int, disable: Boolean) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(disable)
    __method_bind.setBoneDisableRest.call(this._handle, _args.toVariant(), 2)
  }

  fun setBoneGlobalPose(boneIdx: Int, pose: Transform) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(pose)
    __method_bind.setBoneGlobalPose.call(this._handle, _args.toVariant(), 2)
  }

  fun setBoneIgnoreAnimation(bone: Int, ignore: Boolean) {
    val _args = VariantArray.new()
    _args.append(bone)
    _args.append(ignore)
    __method_bind.setBoneIgnoreAnimation.call(this._handle, _args.toVariant(), 2)
  }

  fun setBoneParent(boneIdx: Int, parentIdx: Int) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(parentIdx)
    __method_bind.setBoneParent.call(this._handle, _args.toVariant(), 2)
  }

  fun setBonePose(boneIdx: Int, pose: Transform) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(pose)
    __method_bind.setBonePose.call(this._handle, _args.toVariant(), 2)
  }

  fun setBoneRest(boneIdx: Int, rest: Transform) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(rest)
    __method_bind.setBoneRest.call(this._handle, _args.toVariant(), 2)
  }

  fun setUseBonesInWorldTransform(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseBonesInWorldTransform.call(this._handle, _arg, 1)
  }

  fun unbindChildNodeFromBone(boneIdx: Int, node: Node) {
    val _args = VariantArray.new()
    _args.append(boneIdx)
    _args.append(node)
    __method_bind.unbindChildNodeFromBone.call(this._handle, _args.toVariant(), 2)
  }

  fun unparentBoneAndRest(boneIdx: Int) {
    val _arg = Variant.new(boneIdx)
    __method_bind.unparentBoneAndRest.call(this._handle, _arg, 1)
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
      val addBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "addBone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addBone" }
        }
      val bindChildNodeToBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "bindChildNodeToBone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bindChildNodeToBone" }
        }
      val clearBones: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "clearBones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearBones" }
        }
      val findBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "findBone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method findBone" }
        }
      val getBoneCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "getBoneCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBoneCount" }
        }
      val getBoneCustomPose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "getBoneCustomPose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBoneCustomPose" }
        }
      val getBoneGlobalPose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "getBoneGlobalPose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBoneGlobalPose" }
        }
      val getBoneName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "getBoneName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBoneName" }
        }
      val getBoneParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "getBoneParent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBoneParent" }
        }
      val getBonePose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "getBonePose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBonePose" }
        }
      val getBoneRest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "getBoneRest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBoneRest" }
        }
      val getBoneTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "getBoneTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBoneTransform" }
        }
      val getBoundChildNodesToBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "getBoundChildNodesToBone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBoundChildNodesToBone" }
        }
      val isBoneRestDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "isBoneRestDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isBoneRestDisabled" }
        }
      val isUsingBonesInWorldTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "isUsingBonesInWorldTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUsingBonesInWorldTransform" }
        }
      val localizeRests: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "localizeRests".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method localizeRests" }
        }
      val physicalBonesAddCollisionException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "physicalBonesAddCollisionException".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method physicalBonesAddCollisionException"
            }
        }
      val physicalBonesRemoveCollisionException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "physicalBonesRemoveCollisionException".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method physicalBonesRemoveCollisionException" }
        }
      val physicalBonesStartSimulation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "physicalBonesStartSimulation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method physicalBonesStartSimulation" }
        }
      val physicalBonesStopSimulation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "physicalBonesStopSimulation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method physicalBonesStopSimulation" }
        }
      val setBoneCustomPose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "setBoneCustomPose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBoneCustomPose" }
        }
      val setBoneDisableRest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "setBoneDisableRest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBoneDisableRest" }
        }
      val setBoneGlobalPose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "setBoneGlobalPose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBoneGlobalPose" }
        }
      val setBoneIgnoreAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "setBoneIgnoreAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBoneIgnoreAnimation" }
        }
      val setBoneParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "setBoneParent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBoneParent" }
        }
      val setBonePose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "setBonePose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBonePose" }
        }
      val setBoneRest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "setBoneRest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBoneRest" }
        }
      val setUseBonesInWorldTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "setUseBonesInWorldTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseBonesInWorldTransform" }
        }
      val unbindChildNodeFromBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "unbindChildNodeFromBone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unbindChildNodeFromBone" }
        }
      val unparentBoneAndRest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton".cstr.ptr,
            "unparentBoneAndRest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unparentBoneAndRest" }
        }}
  }
}
