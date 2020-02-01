// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Skin(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addBind(bone: Int, pose: Transform) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bone))
    _args.add(Variant.fromAny(pose))
    __method_bind.addBind.call(this._handle, _args)
  }

  fun clearBinds() {
    __method_bind.clearBinds.call(this._handle)
  }

  fun getBindBone(bindIndex: Int): Int {
    val _arg = Variant.new(bindIndex)
    val _ret = __method_bind.getBindBone.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getBindCount(): Int {
    val _ret = __method_bind.getBindCount.call(this._handle)
    return _ret.asInt()
  }

  fun getBindPose(bindIndex: Int): Transform {
    val _arg = Variant.new(bindIndex)
    val _ret = __method_bind.getBindPose.call(this._handle, listOf(_arg))
    return _ret.asTransform()
  }

  fun setBindBone(bindIndex: Int, bone: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bindIndex))
    _args.add(Variant.fromAny(bone))
    __method_bind.setBindBone.call(this._handle, _args)
  }

  fun setBindCount(bindCount: Int) {
    val _arg = Variant.new(bindCount)
    __method_bind.setBindCount.call(this._handle, listOf(_arg))
  }

  fun setBindPose(bindIndex: Int, pose: Transform) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bindIndex))
    _args.add(Variant.fromAny(pose))
    __method_bind.setBindPose.call(this._handle, _args)
  }

  companion object {
    fun new(): Skin = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Skin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Skin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Skin(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Skin = Skin(ptr)
    /**
     * Container for method_bind pointers for Skin
     */
    private object __method_bind {
      val addBind: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "add_bind".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_bind" }
        }
      val clearBinds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "clear_binds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_binds" }
        }
      val getBindBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "get_bind_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bind_bone" }
        }
      val getBindCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "get_bind_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bind_count" }
        }
      val getBindPose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "get_bind_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bind_pose" }
        }
      val setBindBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "set_bind_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bind_bone" }
        }
      val setBindCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "set_bind_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bind_count" }
        }
      val setBindPose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "set_bind_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bind_pose" }
        }}
  }
}
